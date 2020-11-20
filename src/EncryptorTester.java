import EncryptionStuff.*;
import java.util.Scanner;
public class EncryptorTester {

	public static void main(String[] args) {
		/*We are going to start building this encryptor by
		 * using a simple ceaser shift cypher having an input
		 * and an output and a variable to store the key
		 * You will not only be able to encrypt your messages 
		 * but also decrypt your messages given a specific key
		 */
		Scanner kb = new Scanner(System.in);
		Encryptor encryptor = null;
		encryptor = chooseMenu(encryptor, kb);
		System.out.println("Please enter your encryption key followed by the message you'd like to encrypt");
		encryptor.setKeyandMessage(Integer.parseInt(kb.nextLine()), kb.nextLine());
		encryptor.encrypt();
		System.out.println("Displaying the encrypted message\n" + encryptor.toString());
		
	}//end main
	
	public static Encryptor chooseMenu(Encryptor e, final Scanner kb) {
		System.out.println("Choose a menu option:\n0 = Ceaser Cypher\n1 = null\n2 = null");
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

