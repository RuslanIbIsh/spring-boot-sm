# spring-boot-sm

reminder how to start the spring project on server

how to create useable jar 


1 - <packging>jar</packging>
    
   - if you want to run the project
    install - jre and maven - check the -version
    
		from mvn 
		just write in folder of project
		"mvn spring-boot:run" - instruction in command line 
		
    
   - if you want to stop the proces
		 just ctrl+c  Y
		
	-  additionally Second way to run springBoot project
		write in folder of project
		"mvn package"
		=> builded jar in target folder
		
		- if you have problem - just commit the default test method
	
	   in project forlde write
		 java -jar target\ourjarfile
	
    
 2 - <packging>war</packging>  (jsp)

write in folder of project
		"mvn package"
		=> builded war in target folder 
    
    in project folder in target folder 
    java -jar genereted file.war
    
    
    ===== use " mvn clean " to clean and delete jar/war file 
