@ECHO OFF
SET DIR=%~dp0
SET APP_NAME=SafeDistanceApp
SET CLASSPATH=%DIR%gradle\wrapper\gradle-wrapper.jar
java -cp %CLASSPATH% org.gradle.wrapper.GradleWrapperMain %*
