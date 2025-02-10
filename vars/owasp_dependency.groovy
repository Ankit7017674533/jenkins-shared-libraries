// vars/owasp_dependency.groovy
def call() {
    dependencycheck additionalArgumenets: '--scan ./', odcInstallation: 'OWASP'
    dependencycheckPublisher pattern: '**/dependency-check-report.xml'
    
}
