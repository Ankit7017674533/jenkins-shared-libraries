// vars/owasp_dependency.groovy
def call() {
    sh '''
    dependency-check.sh --project "myproject" --scan .
    '''
    sh "dependency-check.sh --project myproject --scan ."
    
}
