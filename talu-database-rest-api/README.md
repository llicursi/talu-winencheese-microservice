# talu-database-rest-api
Access the database and provide a rest api for consumption, of data, not my wine or cheese.

## Configuration
No docker implemented yet, so aways override the default port : `--server.port=[any-valid-number]`
 
Default configuration assumes that you will use ``lu`` profile, change it by adding the following VM configuration :
```
-Dspring.profiles.active=ta
```
### Available Profiles
It's highly recommended that you use a custom profile or manually change `application.yml`. Or use one of the following
profiles :
* `ta` uses *localhost* and default *port* : 8088
* `lu` uses *custom ip* of ta machines and default port : 9090
  
### Developers

  * `llicursi` Like to use *macarena* as password for dummy stuff

 

