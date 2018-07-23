# talu-winencheese-microsevice
A microservice study using Java, Spring and Eureka to catalog Lucas and Tatiane list of wine and cheeses consumed, without no real life application, except study.

## Technologies
Just listing the remarkable ones and other that really *caught our eyes*.
### Netflix 
 ![Netflix OSS image logo][netflix-logo]
 * Eureka 
 * Kuul
### Spring 
 ![Sprign cloud, a leaf inside a cloud][spring-logo]
 * Cloud
 * Boot
 * Data Rest
 * MVC

### Others
 * Project Lombok - Never write Getters and Setter again.
 * `empty space for more stuff to test` 

## Sub projects

  * `talu-client` Consumer, will list the wines and cheeses
  * `talu-common` Stores our shared logic and models. It's all about reuse
  * `talu-database-rest-api` Access the database and provide a rest api for consumption, of data, not my wine or cheese.
  * `talu-service-registry` *Bla bla bla*  Service registry for resilient mid-tier load balancing and failover *Bla bla bla*. Main reason of our Stdy.

## Configuration

This is not one of that git repository with *one-click-button-configuration* that magically configure everything for you.
Each sub project has it own `README.MD` that describe which configuration to use, **read it carefully** 

`pom.xml`on the main project is only configured to make our life easier when working with a smart IDE, like *IntelliJ*. 
Should work fine with *Eclipse* as well
  
### Build

The build requires java8 because it was installed already on our machines. 

`maven` is the main build tool.
 
~~gradle~~ will be added eventually.  

[netflix-logo]: https://avatars3.githubusercontent.com/u/913567?s=200&v=4 "Netflix OSS"
[spring-logo]: https://avatars3.githubusercontent.com/u/7815877?s=200&v=4 