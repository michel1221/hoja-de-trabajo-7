//Luis Eduardo Ruano Argueta 14187
//Programacion Orientada a Objetos
//Laboratorio Polimorfismo
//26/10/14
import java.util.Scanner;
import java.io.*;
public class Driver{
	public static void main(String [] args){
		BinaryTree2 arbolDiccionario = new BinaryTree2();
		String linea="";
		String [] palabra= new String [2];
		String [] oracion;
		BufferedReader bf = null;
		try{
		bf= new BufferedReader(new FileReader("diccionario.txt"));
		String lector="";
		while((lector= bf.readLine()) != null){
			linea = lector;
			palabra = linea.split(",");
			arbolDiccionario.addNode(palabra[0],palabra[1]);
			
		}
	}
	catch(Exception e ){
			System.err.println("no metiste un archivo correcto");
		}
		
		arbolDiccionario.inOrder(arbolDiccionario.raiz);
		try{
		bf= new BufferedReader(new FileReader("texto.txt"));
		String lector="";
		while((lector= bf.readLine()) != null){
			linea = lector;
			
			
		}
	}
	catch(Exception e ){
			System.err.println("no metiste un archivo correcto");
		}
		
		int num = linea.length();
		oracion= new String [num];
		oracion = linea.split(" ");
		for (int i = 0; i< 11; i++){
			String res = arbolDiccionario.traducirPalabra(oracion[i]);
			if (res == null) res = oracion[i];
			System.out.print(res + " ");
		}
	}	
}