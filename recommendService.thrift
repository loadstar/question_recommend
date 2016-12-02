namespace java com.yftech.galileo.recommend

typedef i32 int  //typedefs to get convenient names for your types

enum QueryType {
	HOMEWORK=1,  //assignment
	EXERCISE=2,  //self-determination exercise
}

struct question {
	1:int subject_id=-1,
	2:int type=-1, // question type
	3:double degree=-1, // difficulty degree
	4:int topic_id=-1
}

struct recomRequest {
	1:required QueryType type,
  2:required int student_id,
  3:required int subject_id,
  4:required int book_id,
  5:optional int grade_id,
  6:optional int term,
  7:optional int chapter_id
}

struct recomResponse {
  1:required int questionNum,
  2:optional list<question> questions
}

service StrategyRpcService {
  recomResponse recomQuestion(1:recomRequest recom_request);
}