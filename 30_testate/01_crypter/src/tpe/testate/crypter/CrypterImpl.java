package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {

		input=input.toLowerCase();
		char[] signs = input.toCharArray();


		//Schleife durchsucht jedes einzelne Zeichen und kodiert sie entsprechend
		for(int i=0; i<signs.length; i++) {

			if(signs[i]=='e') {
				signs[i]='3';
			}
			else {
				if(signs[i]=='3') {
				signs[i]='e';
				}
				else {
					if(signs[i]=='l') {
						signs[i]='1';
					}
					else {
						if(signs[i]=='1') {
							signs[i]='l';
						}
						else {
							if(signs[i]=='o') {
								signs[i]='0';
							}
							else {
								if(signs[i]=='0') {
									signs[i]='o';
								}
								else {
									if(signs[i]=='a') {
										signs[i]='4';
									}
									else {
										if(signs[i]=='4') {
											signs[i]='a';
										}
										else {
											if(signs[i]=='t') {
												signs[i]='7';
											}
											else {
												if(signs[i]=='7') {
													signs[i]='t';
												}
											}

										}
									}
								}
							}
						}
					}
				}
			}
			}



		return new String(signs);
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {

		char[] signs=input.toCharArray();
			//testet alle Zeichen des Strings
			for(int i=0; i<signs.length; i++) {
				//wenn ein Großbuchstabe oder ein Sonderzeichen enthalten ist ->Exception
				if(!(signs[i]<='z' && signs[i]>='a' || signs[i]<='9' && signs[i]>='0' )) {
				throw new IllegalArgumentException();
				}
			}


		//wenn der String korrekt ist, encrypt() anwenden
		return encrypt(input);



	}


}
