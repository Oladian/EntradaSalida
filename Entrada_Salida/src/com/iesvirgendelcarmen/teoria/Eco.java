package com.iesvirgendelcarmen.teoria;

import java.io.IOException;

public class Eco {
	public static void main(String[] args) throws IOException{
		byte [] b = new byte[5];
		String cadena;
		int l= 0;
		
		for (int i = 0; i < 3; i++) {
			l=System.in.read(b);
			if (l<0) break;
			cadena = new String(b);
			System.out.println(cadena);
		}
	}
}
