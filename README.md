## Running the service

NOTE: 
- set JAVA_HOME to java 11
- set MAVEN_HOME

1. Build maven project <br/>
`mvn install`
2. Build the image <br/>
`docker build ./ -t myapp`
3. Run a container <br/>
`docker run -p 8080:8080 myapp`

4. Send post to `http://localhost:8080/articles` request with body <br/>
`{
     "title": "Any Title",
     "content": "Any content"
 }`