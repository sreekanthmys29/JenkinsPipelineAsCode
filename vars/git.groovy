def call(String branchName,credentialsId,url){
  echo "Git Checkout -------------"
  
  git branch:"${branchName}", credentialsId:"${credentialsId}", url:"{url}"

}
