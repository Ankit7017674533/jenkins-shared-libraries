// vars/code_checkout.groovy
def call(String repoUrl, String branch) {
    try {
        checkout([$class: 'GitSCM', 
                  branches: [[name: "*/${branch}"]], 
                  userRemoteConfigs: [[url: repoUrl]]])
    } catch (Exception e) {
        error "Git checkout failed: ${e.message}"
    }
}
