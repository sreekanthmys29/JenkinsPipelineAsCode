def call(String branchName, String credentialsId, String url) {
  echo "Git Checkout -------------"
  
  git branch: "${branchName}", credentialsId: "${credentialsId}", url: "${url}"
}
