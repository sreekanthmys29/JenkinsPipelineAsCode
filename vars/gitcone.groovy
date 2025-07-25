
def call(Map params = [:]) {
     git branch: params.branch, credentialsId: params.credentialsId, url: params.url
}

