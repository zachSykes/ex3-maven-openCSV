# ex3-maven-openCSV
+ Hello maven
+ Hello openCSV to parse CSV into java instances

# Summary
Example maven Java project created via maven archetype quickstart, showing how to;
+ set JDK version something other than default (1.5) in pom.xml,
+ set junit 4.x as junit dependency version in pom.xml,
+ modify build in pom.xml to create executable jar upon running maven goal 'package',
+ create junit 3.x and 4.x tests/testCases/testSuites,
+ enhance default the testCase file name patterns in pom.xml,
+ how to run junit 3.x and 4.x together
+ how to run unit tests from maven (issue "mvn install test" at bash in this project's dir)

# Setup Dependencies
Make sure on your machine, you have;
+ git installed
+ a working unix shell (like git bash. If not there install git and use its git nash)
+ working JDK installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)
+ wokring maven (type "mvn -version" at bash command line and see some results about java version etc)

# How to use it (NOTE in below the directory structure and names are suggested)

# Make sure you created the directory structure you want to store example orojects in
As example, at bash command line issue;
mkdir -p /c/fdu/csci4380/projects

# cd to where you put your example projects
As example, at bash command line issue;
+ cd /c/fdu/csci4380/projects
+ git clone https://github.com/fdu-csci4380/ex3-maven-openCSV.git
+ or
+ git clone https://github.com/fdu-csci4380/ex3-maven-openCSV.get whateverDirectoryNameYouWantStuffToBeClonedInto