## PostgresIntegration
A Springboot application which aims to:
 1. Retreive data (Get API) 
 2. Add data (Post API)

from [PostgreSQL](https://www.postgresql.org/) *(alias postgres)* 
above stated operations are defined in `StudentRepository` class file and this application has exposed endpoint for both GET and POST methods in `/students` mapping and the PORT No. is specified in `application.properties` file. 
Since the Application lacks UI for performing the above stated operations we need to use some API platform for building and using APIs (Example [PostMan](https://www.postman.com/) or[Swagger](https://swagger.io/) ) 