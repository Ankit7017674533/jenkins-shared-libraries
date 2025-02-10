// vars/sonarqube_analysis.groovy
def call(String SonarQubeAPI, String ProjectKey, String ProjectName) {
    try {
        def sonarHome = tool name: SonarQubeAPI // Correct tool assignment
        withSonarQubeEnv("${SonarQubeAPI}") {
            sh """ 
                ${sonarHome}/bin/sonar-scanner \\
                -Dsonar.projectKey=${ProjectKey} \\
                -Dsonar.projectName=${ProjectName} \\
                -Dsonar.sources=. \\
                -X
            """
        }
    } catch (Exception e) {
        error "SonarQube analysis failed: ${e.message}"
    }
}
