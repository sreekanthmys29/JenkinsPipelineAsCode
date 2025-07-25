def call(Map params = [:]) {
     echo " Invoke Git"
    checkoutFromGit(params)
}

def checkoutFromGit(Map params) {
    echo " Invoke Git"
    git branch: params.branch, credentialsId: params.credentialsId, url: params.url
}
