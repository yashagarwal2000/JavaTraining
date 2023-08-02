package com.oops.abs;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();
		animal.makeSound();
		
		Dog dog = (Dog)animal;
		dog.play();
		
		
		
//		animal =new Cat;
		Cat cat =(Cat)animal;
		cat.makeSound();
	}
}
