package EncryptionStuff;

public class CeaserEncryptionDevice {
	private String message;
	//our class level string variable used to store the message to encrypt
	private int cypherKey;
	//our class level int variable for the ceaser cypher key
	public CeaserEncryptionDevice() {
		this.message = null;
		this.cypherKey = 0;
		//setting our local variables to null and zero upon instantiating an object of the class
	}
	
	public void messageToEncrpyt(String s) {
		if(s.isEmpty() || s == null)
			throw new IllegalArgumentException("messageToEncryp paramter cannot be null or empty");
		this.message = s;
	}
	
	public void setKey(int k) {
		if(k == 0)
			throw new IllegalArgumentException("Key for ceaser set key cannot be zero or null");
		this.cypherKey = k;
	}
}//end class
