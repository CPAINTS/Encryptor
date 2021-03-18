package EncryptionStuff;

public class VectorEncryption extends Encryptor {
	
	protected int blockSize;
	@Override
	public void encrypt() {
		super.setKeyandMessage();
		encryptedMessage = new int[message.length()];
		encryptedMessage = encryptAlphabet(message);
		System.out.println("Choose the vector block size");
		blockSize = Integer.parseInt(kb.nextLine());
		
		
		
	}

	@Override
	public void decrypt() {
		
		
	}

}
