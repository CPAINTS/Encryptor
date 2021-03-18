package EncryptionStuff;
import java.util.*;


public abstract class Encryptor {
	protected String message;
	//our class level string variable used to store the message to encrypt
	protected int cypherKey;
	//our class level int variable for the ceaser cypher key
	protected int[] encryptedMessage;
	
	//class level int 2D for vector/matrix encrpytions
	protected int[][] VMencrypted;
	
	protected Scanner kb = new Scanner(System.in);
	
	private final HashMap<Integer,Character> lookupMapChar = new HashMap<Integer,Character>() {
		
		{	int i = 1;
			for (char ch = 'a'; ch <= 'z'; ch++) {
				put(i,ch);
				i++;
			}
		}
		
	};
	
	private final HashMap<Character,Integer> lookupMapNum = new HashMap<Character,Integer>() {
		
		{	int i = 1;
			for (char ch = 'a'; ch <= 'z'; ch++) {
				put(ch,i);
				i++;
			}
		}
		
	};
		public abstract void encrypt();
		
		public abstract void decrypt();
		
		public void setKeyandMessage() {
			if(kb == null)
				throw new IllegalArgumentException("Cannot use a null scanner to set the key and message");
			System.out.println("Please set your cypher key");
			this.cypherKey = Integer.parseInt(kb.nextLine());
			System.out.println("Please set your message");
			this.message = kb.nextLine();
		}
		
		
		
		public String numbersToLetters(int[] array) {
				if(array == null || array.length == 0)
					throw new IllegalArgumentException("Bad parameters in numbersToLetters");
				String message = "";
			
				for(int i = 0; i < array.length; i++) {
					message += lookupMapChar.get(array[i]);
				
				}//end for
				return message;
			}
		
		public int[] encryptAlphabet(String message) {
			if(message.isEmpty() || message == null)
				throw new IllegalArgumentException("Cannot convert null or empty message to numbers");
		
			int[] array = new int[message.length()];
			int i = 0;
			
			while(i != message.length()) {
				char c = message.charAt(i);
				array[i] = lookupMapNum.get(c);
				i++;
				
			}
			return array;
			
		}
		
		
		public String toString() {
			return " Your message is: " + this.message + ", and your key is: " + this.cypherKey;
		}
		
			
		
}//end class
