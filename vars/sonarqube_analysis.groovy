// vars/sonarqube_analysis.groovy
def call(String sonarToolName, String projectKey, String projectName) {
    def sonarHome = tool name: sonarToolName
    withSonarQubeEnv(sonarToolName) {
        sh """
        ${sonarHome}/bin/sonar-scanner \
        -Dsonar.projectKey=${projectKey} \
        -Dsonar.projectName=${projectName} \
        -Dsonar.sources=.
        """
    }
}
