Design Patterns:




1. Structural Design Patterns: Combine different classes and objects to form a complex structure to solve particular requirement.
Composition, inheritance and all.
👉 Decorator Pattern:     
👉 Proxy Pattern:     
👉 Composite Pattern:     
👉 Adapter Pattern:     
👉 Bridge Pattern:      
👉 Facade Pattern:     
👉 Flyweight Pattern:      
Types:
	1. Decorator Pattern: Adds more functionality to existing object without changing its structure.
	Eg : Adding more layers like cheese, mushroom,vegies on base pizza.
	Class Explosing: When we are adding class by class for each topping.

	2. Proxy Pattern: Helps provide control access to original object.
	Eg: Client-->ApplicationProxy--->Application(if roles are matching for login)

	3. Composite Pattern: Helps in scenarios where we have Object inside Object like structure nested objects.
	Eg: FileSystem, Delivery Box(Tree Like strcture)  File (Leaf) and Directory(Composite)

	4.Adapter Pattern: Act as a bridge/intermediate between 2 incompatible objects.
	Client-->Adapter-->Adaptee. Eg: WeightMachine that is returning in pounds and we have used a adpater to get weight in kg as client wants in kg only.

	5. Bridge Pattern: Decouple an abstraction with its implementation, so two can vary independently. 
	Eg: Living things breatheProcess() method for different Dog,Fish and Tree  so decoupled both LivingThings and BreatheImplementor abstraction so both can scale independently.

	6.Facade Pattern: Helps to hide system comlexity from client. 
	Eg1: Exposes only necesaary details to client. Client-->EmployeeFacade--->EmployeeDao(having many functions for insert,delete)
	Eg2: Hide system complexity from client. Client-->ACFacade-->AcExternalUnit & AcInternalUnit(having many functionality to turn on AC)

	7.Flyweight Pattern: Helps to reduce memory usage by sharing data among multiple objects.
	Intrinsic data:  Shared among objects and remain same once assigned one value. Body and Type is Intrinsic data.
	Extrinsic Data: Values changed on client input values. X and Y axis.
	Keep only Intrinsic data in object. This is called Flyweight object.
	Extrinsic Data can be passed in from client.So pass these in parameters.
	Eg: In a game we have a make 5L RobiticDog and 5L humanoidSprite and consuming total 31 Gb for space and space is 21 Gb only. 
	Robot-->Humanoid (keep only intrinsic data)
		--> RobotidDog (keep only intrinsic data)
	Need to use cache for getting same type object and display it in x-y coordinate.

2.Creational Design Patterns:
Design patterns helps to create object/control creation of objects.

	1.Prototype Pattern: Used when we have to create/clone from existing object. WHen you have to create clones from existing objects and existing object creation is so expensive.
	Clone logic should be done in object not in client. Prototype --> Class 1 (clone()) -->Class 2(clone())
	 Eg: Car clone we have to create or student clone.

 	2. Singleton Pattern: When we have to create only 1 instance of the class and share it among other clients. Eg: DBConnection.
 	Ways to achieve this:   1.Eager(Create at when class will be loaded) 2.Lazy(whenever requirement is there or method called then create object) 3.Synchonized method 4.Double locking  (2 checks for null and syncronized block)
 	private constrcuotor, static instance and static getInstance() method.

 	3. FactoryPattern: When all object creation and its business logic we need to keep at one place.
 	Eg: Shape--> Rectangle, CIrcle, Square

 	4. AbstractFactoryPattern: Factory of factory design pattern.
 	Eg: Car---> EconomicCar-->EconomicCarFactory
 			---> LuxuryCar--->LuxuryCarFactory   
 			AbstractFactory--->getInstance()  
 			AbstractFactoryProducer--> (will return factory)

 	5.Builder Pattern: When we want to create object step by step.
 	Eg:Home --> HomeBuilder to implement the steps and Director to orchestrate the steps. (s1->s2->s3) and for some (s2->s3->s1). Steps present in builder



	

