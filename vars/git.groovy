def call(String branchName,String credentialsId, string url){
  echo "Git Checkout -------------"
  
  git branch:"${branchName}", credentialsId:"${credentialsId}", url:"{url}"

}
