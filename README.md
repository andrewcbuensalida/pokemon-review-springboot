# https://www.youtube.com/watch?v=7frnXmdJF98&list=PL82C6-O4XrHcg8sNwpoDDhcxUCbFy855E


## 
Have to create a pokemonapicourse database in pgadmin before running for the first time.

## 
In order for Explorer > Maven > Part 28 > lifecycles > test to work, command prompt in IDE has to have the correct jdk version. To check the version, 
`mvn --version`
And also check the local mvn with
`"c:\swe\code\spring6yt\Part28-Project using Spring Search Feature\mvnw.cmd" --version`
Sometimes you have to close all the vs code windows if you recently changed your environment variables JAVA_HOME path.
If you want to temporarily set the environment variable in that specific terminal, 
`set JAVA_HOME=C:\Program Files\Java\jdk-17`
To check the environment variable,
`echo %JAVA_HOME%`
or
`mvn --version`
The error when the jdk version in the app is 17 but the maven compiler version is 21 is:
`[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project api: Fatal error compiling: java.lang.NoSuchFieldError: Class com.sun.tools.javac.tree.JCTree$JCImport does not have member field 'com.sun.tools.javac.tree.JCTree qualid' -> [Help 1]`
The error when the jdk version in the app is 21 but the maven compiler version is 17 is something like:
`version 21 not compatible`
