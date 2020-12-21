/**
 * 
 */
package proyecto.endes.main;

/**
* @author: Isabel Jardón
* Fecha: 21 dic. 2020
* version: 
*
**/
public class Main {

	/**
	 * Fecha Mod: 21 dic. 2020
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO: 

	}
	
	/**
	 * Metodo SumaNumeros
	 * 
	 * Suma dos números
	 * Fecha Mod: 4 dic. 2020
	 * @param x int int
	 * @param y valor int
	 * @return la suma de x+y valor int
	 */
	public static int sumaNumeros(int x, int y) {
		return (x+y);
	}
	//Inicio de Métodos
	
	/**
	 * TODO Implementation Andres Alonso Ampudia 
	 * 
	 */
	public static int productNumeros(int x, int y) {
		
		return -1;
	}	

	/**
	 * TODO Implementation Fabian Alonso
	 * 
	 */
	public static int calculaAreaTriangulo(int base, int altura) {
		
		return -1;
	}
	

	/**
	 * TODO Implementation Diego Beneitez
	 * 
	 */
	public static boolean esParImpar(int numero) {
		//TODO: 
		return false;
	}
	
	/**
	 * Metodo esPrimo
	 * 
	 * Comprueba si un número es primo
	 * Fecha Mod: 21 dic. 2020
	 * @param n int num
	 * @return primo boolean
	 */
	public static boolean esPrimo(int n) {
		
		int num = 0;
		boolean primo = true;
		
		for(int i = 0; i < (num/2); i++) {
			if (num % i == 0) {
				primo = true;
			} else {
				primo = false;
			}
		}
		return primo;
		
	}
	/**
	 * TODO Implementation Lucas Camas
	 * 
	 */
	public static boolean esPerfecto(int n) {
		//TODO:
		return false;
	}
	
	/**
	 * TODO Implementation Alejandro Covián LLana
	 * 
	 */
	public static boolean  esBisiesto(int year) {
		//TODO:
		return false;
	}
	/**
	 * TODO Implementation Andrés Delgado
	 * 
	 */
	public static boolean esCapicua(int numero) {
		//TODO:
		return false;
	}
	/**
	 * Metodo numCifras
	 * 
	 * Metodo que calcula el numero de cifras de un numero
	 * 
	 * @param numero
	 * @return int 
	 */
	
	public static int numCifras(int numero) {
		int cifras=0;
		while (numero >0) {
			numero=numero/10;
			cifras++;
		}
		return cifras;
	}
	/**
	 * TODO Implementation  Freddy Ariel
	 */
	
	public static int numLetras(String cadena) {
		//TODO:
		return -1;
	}
	/**
	 * TODO Implementation Teresa Fernández
	 * 
	 */
	public static char letraDni(String cadena) {
		//TODO:
		return '-';
	}
	/**
	 * TODO Implementation Lucía Fernández 
	 */
	public static String cambiaLetras(String cadena) {
		//TODO:
		return "";
	}
	
	/**
	 * TODO Implementation Alejandro Fidalgo 
	 */
	public static String cambiaNumeros(String cadena) {
		//TODO:
		return "";
	}
	
	//Fin de Métodos

}
