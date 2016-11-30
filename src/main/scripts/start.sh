#!usr/bin/env bash
#
# Author: andrew

set -x

PRODUCTION_ROOT_DIR="$HOME/recommend"
LOG_DIR="$HOME/recommend/logs/"
JAR_NAME="recommend-1.0-SNAPSHOT.jar"

nohup java -Xms2048m -Xmx2048m -Xss256k -XX:+UseConcMarkSweepGC\
           -XX:CMSInitiatingOccupancyFraction=70\
           -XX:+UseCMSCompactAtFullCollection -XX:CMSFullGCsBeforeCompaction=2\
           -XX:PretenureSizeThreshold=1048576\
           -Dlog4j.home=$LOG_DIR -Duser.timezone=GMT+8\
           -cp $PRODUCTION_ROOT_DIR/lib/$JAR_NAME:$PRODUCTION_ROOT_DIR/conf com.yftech.galileo.recommend.RecomQuestionService >nohup.out 2>&1 &
