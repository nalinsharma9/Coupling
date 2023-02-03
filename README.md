# Coupling
Loose coupling vs Tight coupling example

The idea behind loose coupling is to make use of runtime polymorphism. Since the access if defined by the reference variable, it is always a good practice to pass the interface as function parameters wherever possible. The detemination of concrete class can happen at runtime and the appropriate method based on the object type can be called.

In this example, I am passing the reference variable of interface OutputGenerator as the parameter in display method. Based on the logic, the display method can decide to instantiate the object of either of the two classes which have implemented the interface.This makes the codebase more maintainable as fewer code changes are required when we want to change the logic in future. 
