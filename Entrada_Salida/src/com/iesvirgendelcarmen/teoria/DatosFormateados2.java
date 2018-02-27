package com.iesvirgendelcarmen.teoria;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DatosFormateados2 {
	public static void main(String[] args) {
		final int SIZE = 5;
		
		System.out.println("Escribe cinco floats");
	//	float[] floatLeido = new float[SIZE];

		try(DataOutputStream dataOuputStream = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("ficheros\\binarios\\float.dat")));
				Scanner sc = new Scanner(System.in);) {
			
			for (int i = 0; i < SIZE; i++) {
				dataOuputStream.writeFloat(sc.nextFloat());	
			}
			dataOuputStream.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound ERROR");
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("IO ERROR");
		}
		
		try(BufferedInputStream in1 = new BufferedInputStream(
				new FileInputStream("ficheros\\binarios\\float.dat"));) {
			int byteLeido;
			int contador=0;
			System.out.println("¿Se imprimen?");
			
			while((byteLeido=in1.read())!=-1) {
				System.out.println(byteLeido);
				if(contador%4==0)
					System.out.println();
				contador++;	
			} 
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound ERROR");
		} catch (IOException e1) {
			System.out.println("IO ERROR");
		}

		
		try(DataInputStream in2 = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("ficheros\\binarios\\float.dat")));) {
			
/*			for (int i = 0; i < SIZE; i++) {
				System.out.println(in2.readFloat());
			}
*/
			while (in2.available()!=0) {
				System.out.println(in2.readFloat());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound ERROR");
		} catch (IOException e1) {
			System.out.println("IO ERROR");
		}
	}
}	
