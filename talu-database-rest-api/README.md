# talu-database-rest-api
Access the database and provide a rest api for consumption, of data, not my wine or cheese.

## Configuration
No docker implemented yet, so aways override the default port : `--server.port=[any-valid-number]`
 
Default configuration assumes that you will use ``lu`` profile, change it by adding the following VM configuration :
```
-Dspring.profiles.active=ta
```

Per default, H2 is configured to run embedded, but this is not a good pratice, change it to server mode.

### Available Profiles
It's highly recommended that you use a custom profile or manually change `application.yml`. Or use one of the following
profiles :
* `ta` uses *localhost* and default *port* : 8088
* `lu` uses *custom ip* of ta machines and default port : 9090
* `noeureka` uses *localhost* and default port : 8070 . Disables eureka auto registration.

### Database
H2 as server. Wow.. that is not normal usage, but for testing multiple instance
it's better to share the same database. Few steps

1. Locate the H2 jar. Usually can be found on `~/.m2` path
2. Run it on server mode :
```
java -cp  ~/.m2/repository/com/h2database/h2/1.4.197/h2-1.4.197.jar org.h2.tools.Server
```
#### Load some dummy data
To load some data to test the rest api access the route `http://localhost:[port]/data/populate/`
and it will add an incredible amount of data to your database, 
**2 records** `¯\_(ツ)_/¯` 

## About
A few details about the developers of this project.

  * `llicursi` Like to use *macarena* as password for dummy stuff

 

