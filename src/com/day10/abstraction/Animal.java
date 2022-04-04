package com.day10.abstraction;

public interface Animal {  // public abstract interface Animal
	
	// abstract method
	void eat();  //public abstract void eat():
	void travel(); //public abstract void travel():

}

interface Dog{
	
	void sound();
}
interface car extends Animal, Dog{
	
	
}