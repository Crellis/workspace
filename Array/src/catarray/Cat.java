package catarray;

public class Cat {

	String name;

	public static void main(String[] args) {

		// make a Cat Object and access it
		Cat cat1 = new Cat();
		cat1.name = "Whiskers";
		cat1.meow();
		
		//make a Cat array
		Cat[] myCats = new Cat[7];
		//and put some Cats in the array
		myCats[0] = new Cat();
		myCats[1] = new Cat();
		myCats[2] = new Cat();
		myCats[3] = new Cat();
		myCats[4] = cat1;
		myCats[5] = new Cat();
		myCats[6] = new Cat();
		
		// access the Cats using the arra/ references
		myCats[0].name = "Roger";
		myCats[1].name = "Mr.Fluffy";
		myCats[2].name = "Suzie";
		myCats[3].name = "Ted";
		myCats[5].name = "Rooney";
		myCats[6].name = "Gizmo";
		
		//what is myCats[2] name?
		System.out.println("My 2nd Cat's name is " + myCats[1].name);
		
		//loop the array and all cats to meow
		int x = 0;
		while(x <myCats.length){
			myCats[x].meow();
			x = x + 1;
		}
	}
	public void meow(){
		System.out.println(name + " says Meow!");
	}
	
	public void eat() {
		System.out.println(name + " is eating!");
	}
	public void chaseMouse() {
		System.out.println(name + " is chasing a mouse!");
	}
}