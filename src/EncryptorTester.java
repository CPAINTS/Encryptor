import EncryptionStuff.*;
import java.util.Scanner;
public class EncryptorTester {
	public static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*We are going to start building this encryptor by
		 * using a simple ceaser shift cypher having an input
		 * and an output and a variable to store the key
		 * You will not only be able to encrypt your messages 
		 * but also decrypt your messages given a specific key
		 */
		Encryptor encryptor = null;
		encryptor = chooseEncryptor(encryptor);
		chooseMenu(encryptor);
		System.exit(0);
	}//end main
	
	public static void chooseMenu(Encryptor e) {
		if(e == null)
			throw new IllegalArgumentException("Encrpytion device cannot be null to choose a menu option!");
		int option = 0;
		while(option != 5) {
		System.out.println("What would you like to do?\n1 = Encrpyt Message\n2 = Decrypt Message\n5 = exit");
		option = Integer.parseInt(kb.nextLine());
		switch(option) {
		case 1: e.encrypt(); break;
		case 2: e.decrypt(); break;
		}
		
	  }
	}
	
	public static Encryptor chooseEncryptor(Encryptor e) {
		System.out.println("Choose a menu option:\n0 = Ceaser Cypher\n1 = null\n2 = null\ne = exit");
		int menuOption = Integer.parseInt(kb.nextLine());
		
		switch(menuOption) {
		case 0: e = new CeaserEncryptionDevice(); break;
		//case 1: for other types of encryption
		//case 2: for other types of encryption
		//case 3: for other types of encryption 
		}
		
		return e;
	}

}//end class

