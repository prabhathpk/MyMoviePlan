# Start with a base image containing Java runtime
FROM openjdk:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD MOVIE-TICKET/target/MOVIE-TICKET.jar MOVIE-TICKET.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","MOVIE-TICKET.jar"]