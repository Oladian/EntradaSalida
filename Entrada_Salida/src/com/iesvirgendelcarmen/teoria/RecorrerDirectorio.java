package com.iesvirgendelcarmen.teoria;

import java.io.File;

public class RecorrerDirectorio {

	public static void main(String[] args) {
		File dirRecursivo = new File("C:\\Users\\matinal\\eclipse-workspace\\Entrada_Salida");
		listRecursive(dirRecursivo);
		
		System.out.println(iterativeFactorial(5));
		System.out.println(recursiveFactorial(5));
	}
	public static void listRecursive(File dir) {
		if (dir.isDirectory()) {
			File[] items = dir.listFiles();
			for (File item : items) {
				System.out.println(item.getAbsoluteFile()+" - "+item.length());
				if (item.isDirectory()) listRecursive(item);			
			}
		}
	}
	
	public static long iterativeFactorial(int num) {
		int contador=1;		
		for (int i = num; i > 1; i--) {
			contador*=i;
		}
		return contador;
	}
	
	public static long recursiveFactorial(int num) {	
		if (num==0)
			return 1;
		else return num*recursiveFactorial(num-1);
	}
	
}
