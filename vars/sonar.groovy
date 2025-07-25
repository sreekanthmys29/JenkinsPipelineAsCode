def call(Map params = [:]){
  
 
 
 echo "Executing Sonar Qube analysis"

  sh """
    mvn clean verify sonar:sonar \
      -Dsonar.projectKey=${params.projectKey} \
      -Dsonar.host.url=${params.url} \
      -Dsonar.login=${params.login}
  """

}
