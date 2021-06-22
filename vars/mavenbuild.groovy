def call(String mavenParams) {

  bat "mvn -Dmaven.test.failure.ignore=true ${mavenParams} -f MavenTrainingProject/pom.xml"
}
