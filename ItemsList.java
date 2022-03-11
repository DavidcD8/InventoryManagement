 
import java.util.*;
 
 
import java.util.Scanner;

public class ItemsList {
	boolean loop = false;
	String details;
	int storageinput;
	String searchinput;
	int storageSearch;
 

	Storage storage1 = new Storage();
	Storage storage2 = new Storage();

	public ItemsList(boolean Loop) {
		this.loop = Loop;

	}

	public boolean getItems() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter details of the item: ");
		details = sc.nextLine();

		System.out.print("Choose the Storage number: ");
		storageinput = sc.nextInt();

		switch (storageinput) {
		case 1:
			storage1.setStorage1(details);
			break;

		case 2:
			storage2.setStorage2(details);
			break;

		}

		return loop;

	}

	char exit = 'y';
	boolean exitloop = false;
	
	public boolean searchItem() {

				
			
			try {
			Scanner sc = new Scanner(System.in);
				
				System.out.println("Search item");
				searchinput = sc.nextLine();
			} catch (Exception e) {
				System.out.println("Wrong type, check the details and enter them again");
				 
			}
			
			try {
				Scanner sc = new Scanner(System.in);
			System.out.println("Choose Storage to Search");
			storageSearch = sc.nextInt();
			

		} catch (Exception e) {
			System.out.println("Wrong type, check the details and enter them again");
		}
		try {
			switch (storageSearch) {
			case 1:
				for (int s = 0; s < storage1.getStorage1().length(); s++) {
					if (storage1.getStorage1().startsWith(searchinput))
						;
					{
						System.out.println(searchinput + " found in Storage1");
					}
				}
				
			case 2:
				for (int s = 0; s < storage2.getStorage2().length(); s++) {
					if (storage2.getStorage2().startsWith(searchinput))
						;
					{
						System.out.println(searchinput + " found in Storage2");
					}
				}
				

			default:
				System.out.println("Item not found ");
			}

		} catch (Exception e) {
			System.out.println("Item not found ");

		}
		System.out.println("Seach again: Y/N?");
		Scanner sc = new Scanner(System.in);
		exit = sc.next().charAt(0);
		if (exit == 'n') {
			loop = true;
			System.out.println("Thank You for using this program");
		}
		return loop;
	}
	
	
}		
