# spring-boot-cassandra-crud

### Things todo list

== What do I need to run it? ==

To run this project you need a Cassandra data base. You can run it with the
next docker image:
``
$ docker run --name cassandra bitnami/cassandra:latest
``

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-cassandra-crud.git`
2. Navigate to the folder: `cd spring-boot-cassandra-crud`
3. Run your Cassandra Instance
4. Run the application: `mvn clean spring-boot:run`
5. Open your favorite browser: http://localhost:8080/swagger-ui

### Image Screenshot

Swagger UI

![Swagger UI](img/Swagger-UI.png "Swagger UI")

CQLSH (Cassandra Query Language Shell)

![CQLSH (Cassandra Query Language Shell)](img/cqlsh.png "CQLSH (Cassandra Query Language Shell)")
