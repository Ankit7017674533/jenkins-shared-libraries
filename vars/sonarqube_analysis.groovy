// vars/sonarqube_analysis.groovy
def call(String SonarQubeAPI, String ProjectKey, String Projectname) {
    try {
        def sonarHome = tool name: sonarToolName
        withSonarQubeEnv("${SonarQubeAPI}") {
            sh "$SONAR_HOME/bin/sonar-scanner 
            -Dsonar.projectKey=${projectKey} 
            -Dsonar.projectName=${projectName} -X"
        }
    } catch (Exception e) {
        error "SonarQube analysis failed: ${e.message}"
    }
}
