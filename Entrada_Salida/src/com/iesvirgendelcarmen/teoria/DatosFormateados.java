package com.iesvirgendelcarmen.teoria;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatosFormateados {
	public static void main(String[] args) {
		List<Long> listaNumeros= new ArrayList<>();
		try (DataInputStream dataInputStream = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("ficheros\\numeros.txt")));
				DataOutputStream dataOutputStream = new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("ficheros\\numerosTxtOutput.txt")));){
				
			String numeroInt = dataInputStream.readLine();
			
		//	System.out.println(numeroInt);
			int contador=0;
			while ((numeroInt=dataInputStream.readLine())!=null) {
				listaNumeros.add(Long.parseLong(numeroInt));
				dataOutputStream.writeUTF(numeroInt);
				//System.out.println(listaNumeros.get(contador));
				//contador++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
