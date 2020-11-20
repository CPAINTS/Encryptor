package EncryptionStuff;

public abstract class Encryptor {
	protected String message;
	//our class level string variable used to store the message to encrypt
	protected int cypherKey;
	//our class level int variable for the ceaser cypher key
	protected int[] encryptedMessage;
	
		public abstract void encrypt();
		
		public abstract void decrypt();
		
		public void setKeyandMessage(final int key, final String message) {
			if(key == 0 || message == null || message.isEmpty())
				throw new IllegalArgumentException("Bad parameters in setKeyandMessage");
			
			this.cypherKey = key;
			this.message = message;
			
		}
		
		public String numbersToLetters(int[] array) {
				if(array == null || array.length == 0)
					throw new IllegalArgumentException("Bad parameters in numbersToLetters");
				String message = "";
				
				for(int i = 0; i < array.length; i++) {
				
				switch(array[i]) {
				case 1: message += "a"; break;
				case 2: message += "b"; break;
				case 3: message += "c"; break;
				case 4: message += "d"; break;
				case 5: message += "e"; break;
				case 6: message += "f";break;
				case 7: message += "g"; break;
				case 8: message += "h"; break;
				case 9: message += "i"; break;
				case 10: message += "j"; break;
				case 11: message += "k"; break;
				case 12: message += "l"; break;
				case 13: message += "m"; break;
				case 14: message += "n"; break;
				case 15: message += "o"; break;
				case 16: message += "p";break;
				case 17: message += "q";break;
				case 18: message += "r"; break;
				case 19: message += "s"; break;
				case 20: message += "t"; break;
				case 21: message += "u"; break;
				case 22: message += "v"; break;
				case 23: message += "w"; break;
				case 24: message += "x"; break;
				case 25: message += "y"; break;
				case 26: message += "z"; break;
				
				/*Just doing this for now still thinking of the best way to implement 
				 * a two way hash map if possible to look up the values of %26 alphabet
				 */
				
				}//end switch 
				
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
				
				switch(c) {
				case 'a': array[i] = 1; break;
				case 'b': array[i] = 2; break;
				case 'c': array[i] = 3; break;
				case 'd': array[i] = 4; break;
				case 'e': array[i] = 5; break;
				case 'f': array[i] = 6; break;
				case 'g': array[i] = 7; break;
				case 'h': array[i] = 8; break;
				case 'i': array[i] = 9; break;
				case 'j': array[i] = 10; break;
				case 'k': array[i] = 11; break;
				case 'l': array[i] = 12; break;
				case 'm': array[i] = 13; break;
				case 'n': array[i] = 14; break;
				case 'o': array[i] = 15; break;
				case 'p': array[i] = 16; break;
				case 'q': array[i] = 17; break;
				case 'r': array[i] = 18; break;
				case 's': array[i] = 19; break;
				case 't': array[i] = 20; break;
				case 'u': array[i] = 21; break;
				case 'v': array[i] = 22; break;
				case 'w': array[i] = 23; break;
				case 'x': array[i] = 24; break;
				case 'y': array[i] = 25; break;
				case 'z': array[i] = 26; break;
				
				/*Just doing this for now still thinking of the best way to implement 
				 * a two way hash map if possible to look up the values of %26 alphabet
				 */
				
				}//end switch 
				i++;
			}
			return array;
			
		}
		
		
		public String toString() {
			return " Your message is: " + this.message + ", and your key is: " + this.cypherKey;
		}
			
		
}//end class
