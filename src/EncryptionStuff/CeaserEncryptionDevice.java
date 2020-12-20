package EncryptionStuff;


public class CeaserEncryptionDevice extends Encryptor {
	
	public CeaserEncryptionDevice() {
		this.message = null;
		this.cypherKey = 0;
		//setting our local variables to null and zero upon instantiating an object of the class
	}
	

	
	public void decrypt() {
		encryptedMessage = new int[message.length()];
		encryptedMessage = encryptAlphabet(message);
		
		for(int i = 0; i < encryptedMessage.length; i++) {
			encryptedMessage[i] -= this.cypherKey;
			if(encryptedMessage[i] < 1)
				encryptedMessage[i] += 26;
		}
		
		this.message = numbersToLetters(encryptedMessage);
	}
	
	public void encrypt() {
	
		encryptedMessage = new int[message.length()];
		
		encryptedMessage = encryptAlphabet(message);
		
		for(int i = 0; i < encryptedMessage.length; i++) {
			encryptedMessage[i] += this.cypherKey;
			if(encryptedMessage[i] > 26)
				encryptedMessage[i] %= 26;
		}
		
		this.message = numbersToLetters(encryptedMessage);
	}
	
	
	public String toString() {
		return "Using the Ceaser Cypher, " + super.toString();
	}
}//end class
