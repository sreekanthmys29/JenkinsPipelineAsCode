def call(String goal){
  
  echo "Build Goal -------------${goal}"
  
   if(${goal} == "clean"){
      sh 'mvn clean'
   }
   else if(${goal} == "install"){
      sh 'mvn clean install'
   }
   else if(${goal} == "package"){
      sh 'mvn clean package'
   }
  else {
       echo "Unknown goal: ${goal}"
                 
   }
}
