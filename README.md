# Lexington Burger Week

Every year, in the city of Lexington Kentucky, we have an annual event called Lexington Burger Week. Several local restaurants prepare special burgers for this event.

In this application, I decided to use the Builder Design Pattern to build the burgers. In addition to the builder pattern, I'm also using the factory, the singleton, and the facade design patterns.

## Implementation Description

**Builder Pattern**

In this application, we have many burger styles. Each burger has different condiments such as buns, meat, cheese ...etc. The builder design pattern as the name implies, builds the burger step by step and return the burger object.

The way we build burgers in this application is by using the BurgerBuilder class. Each burger has a concrete builder class that extends the BurgerBuilder class. We use the PrepareBurger class (called the director) to instantiate the BurgerBuilder class and build the burger steps.

This design pattern provides flexibility. If we decide to add a new burger, all we have to do is create another concrete burger builder class and extends the BurgerBuilder class. This design patter also provides understandability. Other developers could easily look at our code and understand the steps we take to build a burger.

**Facade Pattern**

I decided to use the facade pattern to hide all the complexity of building a burger. The clients always interact with the facade to build the burger and get the order summary. When the user selects a burger, I instantiate the BurgerFacade class and pass the selected burger name to the createBurger() method. This method is responsible for interacting with the BurgerImp class to return the appropriate burger class based on the user selection. Lastly, the client call the orderSummary() method on the BurgerFacade class to return all the burger's condiments and the cost.

**Factory Pattern**

I used the factory design pattern to abstract the creation of the concrete burger classes and instantiate the appropriate burger class at runtime. The create() method on the BurgerImp class receives the selected burger name and returns the burger class based on the user selection. This makes our application flexible and scalable. If we decide to add another burger, all we have to do is create the concrete burger class, extend the BurgerBuilder class, and add the concrete class to the create() factory method.

**Singleton Pattern**

I implemented the Singleton design pattern in the BurgerImp class. In this class, I made the constructor private, created a private static instance variable that instantiates the class itself, then added a public getInstance method that returns the class instance. This ensures that we always have one instance of the BurgerImp class.

## How to run the application


#### Compile your application

```bash
mvn clean compile
```

### How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main"
```

#### Run all the unit test classes

```bash
mvn clean compile test
```
