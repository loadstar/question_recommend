#!/usr/bin/bash
#
# Author: andrew


JAR_NAME="recommend.jar"

ps -ef | grep $JAR_NAME | grep -v "grep" | awk '{print $2}' | xargs kill
