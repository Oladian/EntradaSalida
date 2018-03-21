package com.iesvirgendelcarmen.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CrearEjercicioUno {
	public static void main(String[] args) {
				
		try(PrintWriter output = new PrintWriter("ficheros\\ejercicios\\ejercicio1.txt");) {
			for (int j = 0; j < 100; j++) {
				output.print((int)(Math.random()*100));
				if(j!=99)
					output.print('-');
			}
			System.out.println("Creado fichero ejercicio1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Sumar los numeros con SCANNER
		
		File f = new File("ficheros\\ejercicios\\ejercicio1.txt");
		try (Scanner sc = new Scanner(f).useDelimiter("-");) {
			int sum=0;
			while(sc.hasNext()) {
				int numero = sc.nextInt();
				System.out.println(numero);
				sum+=numero;
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
		}
}


/*try(PrintStream output = new PrintStream(
new BufferedOutputStream(
		new FileOutputStream("ficheros\\ejercicios\\ejercicio1.txt")));) {
for (int j = 0; j < 100; j++) {
output.print((int)Math.random()*100);
output.println();
}
System.out.println("Creado fichero ejercicio1.txt");
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}*/
