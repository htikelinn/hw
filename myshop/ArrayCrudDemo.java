import java.util.Scanner;

class ArrayCrudDemo { 
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// CRUD - Create, Reterive(Read), Update, Delete

		String ask = "";
		do {
			// welcome menu
			System.out.println("\nArray Crud Demo");
			System.out.println("*****************");
			System.out.println("1. Create");
			System.out.println("2. Read(Reterive)");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit the program.");

			// choice menu vs check menu
			System.out.print("Choice menu (1, 4) : ");
			int menu = scan.nextInt();

			if(menu < 1 || menu > 4) {
				System.out.println("Invalid menu!! Choose from 1 to 4.");
				continue;
			}

			// switch()
			switch(menu) {
			case 1 : 
				create();
				break;

			case 2 : 
				read(); 
				break;

			case 3 : 
				update(); 
				break;

			case 4 : 
				delete(); 
				break;

			case 5 : 
				System.out.println("Exit the program"); 
				break;

			default : 
				System.out.println("Invalid Menu Number!!!");
			}

			// Try again(Y/n)?
			System.out.print("Do another - (y/n)? :");
			ask = scan.next();

		} while(ask.equalsIgnoreCase("Y"));
	}

	// methods for crud
	//System.out.println("CRUD Methods");

	static void create(){
		System.out.println("Create array");
	}

	static void read(){
		System.out.println("Reterive array");
	}

	static void update(){
		System.out.println("Update array");
	}

	static void delete(){
		System.out.println("Delete array");
	}
}
