/*A constructor is a special method used to initialize objects of a class. 
It is called automatically when an object is created.
Key Features:
-Constructor name must be the same as the class name.
-It does not have a return type, not even void.
-It is called automatically when the object is created using new.
Types of Constructors:
1.Default Constructor
No parameters.
Java provides it automatically if no constructor is written.
2.Parameterized Constructor
Takes arguments to set initial values.
3.Copy Constructor (Manually created)
Copies values from another object.
*Constructor Overloading:
You can create multiple constructors in a class with different parameters. */

class constructor1 {
	constructor1()// user defined
	{
		System.out.println("constructor");
	}

	constructor1(int n) {
		System.out.println("enter the number:" + n);
	}

	constructor1(String name) {
		System.out.println(name);
	}
}

public class Constructor {
	public static void main(String[] args) {
		constructor1 c1 = new constructor1();
		constructor1 c2 = new constructor1(58);
		constructor1 c3 = new constructor1("utkarsha");

	}

}
