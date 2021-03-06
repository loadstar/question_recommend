/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yftech.galileo.recommend;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-12-2")
public class recomRequest implements org.apache.thrift.TBase<recomRequest, recomRequest._Fields>, java.io.Serializable, Cloneable, Comparable<recomRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("recomRequest");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STUDENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("student_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SUBJECT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("subject_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BOOK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("book_id", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField GRADE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("grade_id", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TERM_FIELD_DESC = new org.apache.thrift.protocol.TField("term", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField CHAPTER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chapter_id", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new recomRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new recomRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see QueryType
   */
  public QueryType type; // required
  public int student_id; // required
  public int subject_id; // required
  public int book_id; // required
  public int grade_id; // optional
  public int term; // optional
  public int chapter_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see QueryType
     */
    TYPE((short)1, "type"),
    STUDENT_ID((short)2, "student_id"),
    SUBJECT_ID((short)3, "subject_id"),
    BOOK_ID((short)4, "book_id"),
    GRADE_ID((short)5, "grade_id"),
    TERM((short)6, "term"),
    CHAPTER_ID((short)7, "chapter_id");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // STUDENT_ID
          return STUDENT_ID;
        case 3: // SUBJECT_ID
          return SUBJECT_ID;
        case 4: // BOOK_ID
          return BOOK_ID;
        case 5: // GRADE_ID
          return GRADE_ID;
        case 6: // TERM
          return TERM;
        case 7: // CHAPTER_ID
          return CHAPTER_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STUDENT_ID_ISSET_ID = 0;
  private static final int __SUBJECT_ID_ISSET_ID = 1;
  private static final int __BOOK_ID_ISSET_ID = 2;
  private static final int __GRADE_ID_ISSET_ID = 3;
  private static final int __TERM_ISSET_ID = 4;
  private static final int __CHAPTER_ID_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.GRADE_ID,_Fields.TERM,_Fields.CHAPTER_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, QueryType.class)));
    tmpMap.put(_Fields.STUDENT_ID, new org.apache.thrift.meta_data.FieldMetaData("student_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.SUBJECT_ID, new org.apache.thrift.meta_data.FieldMetaData("subject_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.BOOK_ID, new org.apache.thrift.meta_data.FieldMetaData("book_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.GRADE_ID, new org.apache.thrift.meta_data.FieldMetaData("grade_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.TERM, new org.apache.thrift.meta_data.FieldMetaData("term", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.CHAPTER_ID, new org.apache.thrift.meta_data.FieldMetaData("chapter_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(recomRequest.class, metaDataMap);
  }

  public recomRequest() {
  }

  public recomRequest(
    QueryType type,
    int student_id,
    int subject_id,
    int book_id)
  {
    this();
    this.type = type;
    this.student_id = student_id;
    setStudent_idIsSet(true);
    this.subject_id = subject_id;
    setSubject_idIsSet(true);
    this.book_id = book_id;
    setBook_idIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public recomRequest(recomRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.student_id = other.student_id;
    this.subject_id = other.subject_id;
    this.book_id = other.book_id;
    this.grade_id = other.grade_id;
    this.term = other.term;
    this.chapter_id = other.chapter_id;
  }

  public recomRequest deepCopy() {
    return new recomRequest(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setStudent_idIsSet(false);
    this.student_id = 0;
    setSubject_idIsSet(false);
    this.subject_id = 0;
    setBook_idIsSet(false);
    this.book_id = 0;
    setGrade_idIsSet(false);
    this.grade_id = 0;
    setTermIsSet(false);
    this.term = 0;
    setChapter_idIsSet(false);
    this.chapter_id = 0;
  }

  /**
   * 
   * @see QueryType
   */
  public QueryType getType() {
    return this.type;
  }

  /**
   * 
   * @see QueryType
   */
  public recomRequest setType(QueryType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getStudent_id() {
    return this.student_id;
  }

  public recomRequest setStudent_id(int student_id) {
    this.student_id = student_id;
    setStudent_idIsSet(true);
    return this;
  }

  public void unsetStudent_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STUDENT_ID_ISSET_ID);
  }

  /** Returns true if field student_id is set (has been assigned a value) and false otherwise */
  public boolean isSetStudent_id() {
    return EncodingUtils.testBit(__isset_bitfield, __STUDENT_ID_ISSET_ID);
  }

  public void setStudent_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STUDENT_ID_ISSET_ID, value);
  }

  public int getSubject_id() {
    return this.subject_id;
  }

  public recomRequest setSubject_id(int subject_id) {
    this.subject_id = subject_id;
    setSubject_idIsSet(true);
    return this;
  }

  public void unsetSubject_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUBJECT_ID_ISSET_ID);
  }

  /** Returns true if field subject_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSubject_id() {
    return EncodingUtils.testBit(__isset_bitfield, __SUBJECT_ID_ISSET_ID);
  }

  public void setSubject_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUBJECT_ID_ISSET_ID, value);
  }

  public int getBook_id() {
    return this.book_id;
  }

  public recomRequest setBook_id(int book_id) {
    this.book_id = book_id;
    setBook_idIsSet(true);
    return this;
  }

  public void unsetBook_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BOOK_ID_ISSET_ID);
  }

  /** Returns true if field book_id is set (has been assigned a value) and false otherwise */
  public boolean isSetBook_id() {
    return EncodingUtils.testBit(__isset_bitfield, __BOOK_ID_ISSET_ID);
  }

  public void setBook_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BOOK_ID_ISSET_ID, value);
  }

  public int getGrade_id() {
    return this.grade_id;
  }

  public recomRequest setGrade_id(int grade_id) {
    this.grade_id = grade_id;
    setGrade_idIsSet(true);
    return this;
  }

  public void unsetGrade_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GRADE_ID_ISSET_ID);
  }

  /** Returns true if field grade_id is set (has been assigned a value) and false otherwise */
  public boolean isSetGrade_id() {
    return EncodingUtils.testBit(__isset_bitfield, __GRADE_ID_ISSET_ID);
  }

  public void setGrade_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GRADE_ID_ISSET_ID, value);
  }

  public int getTerm() {
    return this.term;
  }

  public recomRequest setTerm(int term) {
    this.term = term;
    setTermIsSet(true);
    return this;
  }

  public void unsetTerm() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TERM_ISSET_ID);
  }

  /** Returns true if field term is set (has been assigned a value) and false otherwise */
  public boolean isSetTerm() {
    return EncodingUtils.testBit(__isset_bitfield, __TERM_ISSET_ID);
  }

  public void setTermIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TERM_ISSET_ID, value);
  }

  public int getChapter_id() {
    return this.chapter_id;
  }

  public recomRequest setChapter_id(int chapter_id) {
    this.chapter_id = chapter_id;
    setChapter_idIsSet(true);
    return this;
  }

  public void unsetChapter_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHAPTER_ID_ISSET_ID);
  }

  /** Returns true if field chapter_id is set (has been assigned a value) and false otherwise */
  public boolean isSetChapter_id() {
    return EncodingUtils.testBit(__isset_bitfield, __CHAPTER_ID_ISSET_ID);
  }

  public void setChapter_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHAPTER_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((QueryType)value);
      }
      break;

    case STUDENT_ID:
      if (value == null) {
        unsetStudent_id();
      } else {
        setStudent_id((Integer)value);
      }
      break;

    case SUBJECT_ID:
      if (value == null) {
        unsetSubject_id();
      } else {
        setSubject_id((Integer)value);
      }
      break;

    case BOOK_ID:
      if (value == null) {
        unsetBook_id();
      } else {
        setBook_id((Integer)value);
      }
      break;

    case GRADE_ID:
      if (value == null) {
        unsetGrade_id();
      } else {
        setGrade_id((Integer)value);
      }
      break;

    case TERM:
      if (value == null) {
        unsetTerm();
      } else {
        setTerm((Integer)value);
      }
      break;

    case CHAPTER_ID:
      if (value == null) {
        unsetChapter_id();
      } else {
        setChapter_id((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case STUDENT_ID:
      return Integer.valueOf(getStudent_id());

    case SUBJECT_ID:
      return Integer.valueOf(getSubject_id());

    case BOOK_ID:
      return Integer.valueOf(getBook_id());

    case GRADE_ID:
      return Integer.valueOf(getGrade_id());

    case TERM:
      return Integer.valueOf(getTerm());

    case CHAPTER_ID:
      return Integer.valueOf(getChapter_id());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case STUDENT_ID:
      return isSetStudent_id();
    case SUBJECT_ID:
      return isSetSubject_id();
    case BOOK_ID:
      return isSetBook_id();
    case GRADE_ID:
      return isSetGrade_id();
    case TERM:
      return isSetTerm();
    case CHAPTER_ID:
      return isSetChapter_id();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof recomRequest)
      return this.equals((recomRequest)that);
    return false;
  }

  public boolean equals(recomRequest that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_student_id = true;
    boolean that_present_student_id = true;
    if (this_present_student_id || that_present_student_id) {
      if (!(this_present_student_id && that_present_student_id))
        return false;
      if (this.student_id != that.student_id)
        return false;
    }

    boolean this_present_subject_id = true;
    boolean that_present_subject_id = true;
    if (this_present_subject_id || that_present_subject_id) {
      if (!(this_present_subject_id && that_present_subject_id))
        return false;
      if (this.subject_id != that.subject_id)
        return false;
    }

    boolean this_present_book_id = true;
    boolean that_present_book_id = true;
    if (this_present_book_id || that_present_book_id) {
      if (!(this_present_book_id && that_present_book_id))
        return false;
      if (this.book_id != that.book_id)
        return false;
    }

    boolean this_present_grade_id = true && this.isSetGrade_id();
    boolean that_present_grade_id = true && that.isSetGrade_id();
    if (this_present_grade_id || that_present_grade_id) {
      if (!(this_present_grade_id && that_present_grade_id))
        return false;
      if (this.grade_id != that.grade_id)
        return false;
    }

    boolean this_present_term = true && this.isSetTerm();
    boolean that_present_term = true && that.isSetTerm();
    if (this_present_term || that_present_term) {
      if (!(this_present_term && that_present_term))
        return false;
      if (this.term != that.term)
        return false;
    }

    boolean this_present_chapter_id = true && this.isSetChapter_id();
    boolean that_present_chapter_id = true && that.isSetChapter_id();
    if (this_present_chapter_id || that_present_chapter_id) {
      if (!(this_present_chapter_id && that_present_chapter_id))
        return false;
      if (this.chapter_id != that.chapter_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_student_id = true;
    list.add(present_student_id);
    if (present_student_id)
      list.add(student_id);

    boolean present_subject_id = true;
    list.add(present_subject_id);
    if (present_subject_id)
      list.add(subject_id);

    boolean present_book_id = true;
    list.add(present_book_id);
    if (present_book_id)
      list.add(book_id);

    boolean present_grade_id = true && (isSetGrade_id());
    list.add(present_grade_id);
    if (present_grade_id)
      list.add(grade_id);

    boolean present_term = true && (isSetTerm());
    list.add(present_term);
    if (present_term)
      list.add(term);

    boolean present_chapter_id = true && (isSetChapter_id());
    list.add(present_chapter_id);
    if (present_chapter_id)
      list.add(chapter_id);

    return list.hashCode();
  }

  @Override
  public int compareTo(recomRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStudent_id()).compareTo(other.isSetStudent_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStudent_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.student_id, other.student_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubject_id()).compareTo(other.isSetSubject_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubject_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subject_id, other.subject_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBook_id()).compareTo(other.isSetBook_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBook_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.book_id, other.book_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrade_id()).compareTo(other.isSetGrade_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrade_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grade_id, other.grade_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTerm()).compareTo(other.isSetTerm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTerm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.term, other.term);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChapter_id()).compareTo(other.isSetChapter_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChapter_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chapter_id, other.chapter_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("recomRequest(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("student_id:");
    sb.append(this.student_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("subject_id:");
    sb.append(this.subject_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("book_id:");
    sb.append(this.book_id);
    first = false;
    if (isSetGrade_id()) {
      if (!first) sb.append(", ");
      sb.append("grade_id:");
      sb.append(this.grade_id);
      first = false;
    }
    if (isSetTerm()) {
      if (!first) sb.append(", ");
      sb.append("term:");
      sb.append(this.term);
      first = false;
    }
    if (isSetChapter_id()) {
      if (!first) sb.append(", ");
      sb.append("chapter_id:");
      sb.append(this.chapter_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'student_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'subject_id' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'book_id' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class recomRequestStandardSchemeFactory implements SchemeFactory {
    public recomRequestStandardScheme getScheme() {
      return new recomRequestStandardScheme();
    }
  }

  private static class recomRequestStandardScheme extends StandardScheme<recomRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, recomRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.yftech.galileo.recommend.QueryType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STUDENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.student_id = iprot.readI32();
              struct.setStudent_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUBJECT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.subject_id = iprot.readI32();
              struct.setSubject_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BOOK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.book_id = iprot.readI32();
              struct.setBook_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GRADE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.grade_id = iprot.readI32();
              struct.setGrade_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TERM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.term = iprot.readI32();
              struct.setTermIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CHAPTER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.chapter_id = iprot.readI32();
              struct.setChapter_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetStudent_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'student_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSubject_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'subject_id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetBook_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, recomRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STUDENT_ID_FIELD_DESC);
      oprot.writeI32(struct.student_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUBJECT_ID_FIELD_DESC);
      oprot.writeI32(struct.subject_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BOOK_ID_FIELD_DESC);
      oprot.writeI32(struct.book_id);
      oprot.writeFieldEnd();
      if (struct.isSetGrade_id()) {
        oprot.writeFieldBegin(GRADE_ID_FIELD_DESC);
        oprot.writeI32(struct.grade_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTerm()) {
        oprot.writeFieldBegin(TERM_FIELD_DESC);
        oprot.writeI32(struct.term);
        oprot.writeFieldEnd();
      }
      if (struct.isSetChapter_id()) {
        oprot.writeFieldBegin(CHAPTER_ID_FIELD_DESC);
        oprot.writeI32(struct.chapter_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class recomRequestTupleSchemeFactory implements SchemeFactory {
    public recomRequestTupleScheme getScheme() {
      return new recomRequestTupleScheme();
    }
  }

  private static class recomRequestTupleScheme extends TupleScheme<recomRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, recomRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      oprot.writeI32(struct.student_id);
      oprot.writeI32(struct.subject_id);
      oprot.writeI32(struct.book_id);
      BitSet optionals = new BitSet();
      if (struct.isSetGrade_id()) {
        optionals.set(0);
      }
      if (struct.isSetTerm()) {
        optionals.set(1);
      }
      if (struct.isSetChapter_id()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetGrade_id()) {
        oprot.writeI32(struct.grade_id);
      }
      if (struct.isSetTerm()) {
        oprot.writeI32(struct.term);
      }
      if (struct.isSetChapter_id()) {
        oprot.writeI32(struct.chapter_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, recomRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = com.yftech.galileo.recommend.QueryType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.student_id = iprot.readI32();
      struct.setStudent_idIsSet(true);
      struct.subject_id = iprot.readI32();
      struct.setSubject_idIsSet(true);
      struct.book_id = iprot.readI32();
      struct.setBook_idIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.grade_id = iprot.readI32();
        struct.setGrade_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.term = iprot.readI32();
        struct.setTermIsSet(true);
      }
      if (incoming.get(2)) {
        struct.chapter_id = iprot.readI32();
        struct.setChapter_idIsSet(true);
      }
    }
  }

}

