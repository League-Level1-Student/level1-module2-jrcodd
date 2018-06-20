package extra;

import java.util.Random;

public class Vault {
	
	
	int code;
	

	public Vault() {
		Random r = new Random();
		code = r.nextInt(1000000000);
		
	}

Boolean tryCode(int codeGuess){
	
	
	if(codeGuess == code) {
		return true;
	}
	else {return false;
}
}
}

