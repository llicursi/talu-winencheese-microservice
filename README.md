# talu-winencheese-microsevice
A microservice study using Java, Spring and Eureka to catalog Lucas and Tatiane list of wine and cheeses consumed, without no real life application, except study.

### Sub projects

  * `talu-client` Consumer, will list the wines and cheeses
  * `talu-common` Stores our shared logic and models. It's all about reuse
  * `talu-database-rest-api` Access the database and provide a rest api for consumption, of data, not my wine or cheese.
  * `talu-service-registry` *Bla bla bla*  Service registry for resilient mid-tier load balancing and failover *Bla bla bla*. Main reason of our Stdy.
  
### Build

The build requires java8 because it was installed already on our machines.
