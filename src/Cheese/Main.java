/*
*	grupo  : 1GDAM
*	alumno : Kazhokin Roman
*	n.exp. : 7255
*	fecha  : 09/06/2022
 */

 /*
  * Version Final
  */
package Cheese;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         
         Producto manzana = new Producto("1","fresco",1,0.3);
         Producto pelota = new Producto("2","deporte",1,0.4);
         
         manzana.imprime_etiqueta();
         pelota.imprime_etiqueta();

     }
}
