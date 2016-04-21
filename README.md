# wildfly-swarm-jaxrs-static-demo

A WildFly Swarm Demo provide a JAX-RS API and serving static contents.

## Usage

###  Run the app

``` sh
$ ./mvnw clean wildfly-swarm:run
```

### Access API

``` sh
$ curl localhost:8080/api
{"value":"Hello"}
```

### Access static contents

``` sh
$ curl localhost:8080
 <!DOCTYPE html>
 <html lang="en">
 <head>
   <meta charset="UTF-8">
   <title>Hello</title>
 </head>
 <body>
 Static content
 </body>
 </html>
```