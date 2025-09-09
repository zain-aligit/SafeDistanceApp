#!/usr/bin/env sh

##############################################################################
# Gradle start up script for UN*X
##############################################################################
DEFAULT_JVM_OPTS=""
APP_NAME="SafeDistanceApp"
DIR="$(cd "$(dirname "$0")"; pwd -P)"
CLASSPATH=$DIR/gradle/wrapper/gradle-wrapper.jar

exec java $DEFAULT_JVM_OPTS -cp $CLASSPATH org.gradle.wrapper.GradleWrapperMain "$@"
