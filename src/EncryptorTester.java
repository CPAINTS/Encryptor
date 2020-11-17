import EncryptionStuff.*;

public class EncryptorTester {

	public static void main(String[] args) {
		/*We are going to start building this encryptor by
		 * using a simple ceaser shift cypher having an input
		 * and an output and a variable to store the key
		 * You will not only be able to encrypt your messages 
		 * but also decrypt your messages given a specific key
		 */
		CeaserEncryptionDevice encryptor = new CeaserEncryptionDevice();
		System.out.println("Please set your message to encrypt and an encrpytion key");
		encryptor.messageToEncrpyt("Testing our ceaser encryption device");
		
	}//end main

}//end class
