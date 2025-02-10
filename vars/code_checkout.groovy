// vars/code_checkout.groovy
def call(String repoUrl, String branch) {
    checkout([$class: 'GitSCM', 
              branches: [[name: "*/${branch}"]], 
              userRemoteConfigs: [[url: repoUrl]]])
}
