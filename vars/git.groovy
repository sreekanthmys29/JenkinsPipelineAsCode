def call(Map params) {
  echo "Git Checkout -------------"
  git branch: params.branch, credentialsId: params.credentialsId, url: params.url
}
