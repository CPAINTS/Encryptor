package EncryptionStuff;


public class CeaserEncryptionDevice extends Encryptor {
	
	public void decrypt() {
		super.setKeyandMessage();
		encryptedMessage = new int[message.length()];
		encryptedMessage = encryptAlphabet(message);
		
		for(int i = 0; i < encryptedMessage.length; i++) {
			encryptedMessage[i] -= this.cypherKey;
			if(encryptedMessage[i] < 1)
				encryptedMessage[i] += 26;
		}
		
		this.message = numbersToLetters(encryptedMessage);
		System.out.println(toString());
	}
	
	public void encrypt() {
		super.setKeyandMessage();
		encryptedMessage = new int[message.length()];
		
		encryptedMessage = encryptAlphabet(message);
		
		for(int i = 0; i < encryptedMessage.length; i++) {
			encryptedMessage[i] += this.cypherKey;
			if(encryptedMessage[i] > 26)
				encryptedMessage[i] %= 26;
		}
		
		this.message = numbersToLetters(encryptedMessage);
		System.out.println(toString());
	}
	
	
	public String toString() {
		return "Using the Ceaser Cypher, " + super.toString();
	}
}//end class
