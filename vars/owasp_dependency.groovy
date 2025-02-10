// vars/owasp_dependency.groovy
def call() {
    dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
