package com.iesvirgendelcarmen.pruebasProyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LeerCSV {
	 public static final String SEPARATOR=";";
	   public static final String QUOTE="-";

	   public static void main(String[] args) {

	      BufferedReader br = null;
	      
	      try {
	         
	         br =new BufferedReader(new FileReader("ficheros/Libros.csv"));
	         String line = br.readLine();
	         while (null!=line) {
	            String [] fields = line.split(SEPARATOR);
	          //  System.out.println(Arrays.toString(fields));
	            
	            System.out.println(Arrays.toString(fields));
	            
	            line = br.readLine();
	         }
	         
	      } catch (Exception e) {
	         System.out.println("Exception");
	      } finally {
	         if (null!=br) {
	            try {
					br.close();
				} catch (IOException e) {
					System.out.println("IO Exception");
				}
	         }
	      }
	   }
	}

	
