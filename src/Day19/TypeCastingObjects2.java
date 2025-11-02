package Day19;

class Animal{}

class dog extends Animal{}
class cat extends Animal{}


public class TypeCastingObjects2 {

   // Rule 1: conversion is valid between related classes only. i.e., classes which have inheritance relationship.
    public static void main(String[] args) {
        Animal a1= new dog();  //upcasting: child class object is being referred by parent class reference variable. this is done automatically by java compiler.
        Animal a2= new cat();  //upcasting

        dog d1= (dog)a1;   //downcasting: parent class object is being referred by child class reference variable. this is done manually by programmer.
        cat c1= (cat)a2;   //downcasting

        //dog d2= (dog)a2;  //throws ClassCastException at runtime as a2 is referring to cat object, which is not related to dog class.

        // Rule 2: conversion is not valid between unrelated classes.

        //cat c2= (cat)d1;  //throws compile time error as dog and cat classes are unrelated classes.

    //Rule 2: assignment is not possible between unrelated classes.
    //dog d3= new cat();  //throws compile time error as dog and cat classes are unrelated classes.
    
    //Rule 3:The underlying object must be of the type being cast to or child type of it.
    Animal a3= new dog();  //upcasting
    cat c3= (cat)a3;   //throws ClassCastException at runtime as a3 is referring to dog object, which is not related to cat class.
 //  A   B    C   D
 //C must be either same or child of A.
 //D must be either same or child of B 

    }

}
