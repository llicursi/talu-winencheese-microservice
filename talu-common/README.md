# talu-common
Stores our shared logic and models. It's all about reuse

## Plugins 

* `Lombok` Let's stop using getters and setter. Use annotations from [Lombok](https://projectlombok.org/).
But to better implement it, a plugin for IDE may be needed.
* `Spring Data` For fast serialization and database persistence. 


## What is inside?
### Models

Structures shared between the producer and consumer. Serialized via Spring Framework

  * `wine` Stuff we drink that causes memory loss about the details 
  * `cheese` Stuff we eat

Both components generates happiness and long discussions about time traveling.

#### Wine 
Who doesn't love this god like drink? To evaluate wine, some criteria may be needed, not to became an Oenologist, but to have a complex model.
Maybe in a far distant future we will became cheap Oenologists.

**Wine Criteria** :
1. Taste
2. Touch
3. Smell
4. Will you buy it again?

 

## Other stuff

Expected something here.

## Build

Used as shared dependency for other sub modules
```
mvn install
```