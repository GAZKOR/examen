/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el n√∫mero de productos contenidos en la lista
     */
    private static int n = 0;
    
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no est√° vac√≠a)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vac√≠a, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return true; else return false;
    }

    /**
     * Lista los productos con determinado nombre y si no tiene un nombre, le pone un "noNamed"
     * @param nombre lista productos con ese nombre
     */
    public ListaProductos(String nombre) {  
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    /**
     * 
     * @return devuelve el numero de productos totales
     */
    public int totalProductos(){
            return this.getNumProductos();
    }
       
    /**
     * mÈtodo para registrar un determinado producto, si la lista ya contiene el codigo, devuelve null
     * @param  prod que necesitemos
     * @return  devuelve el nulo o el producto
     * si no, le pone a la lista el codigo y su producto
     * 
     */
    public Producto registraProducto(Producto prod) {
        
        if (listaP.containsKey(prod.getcode()) || (prod.getcode()==null)) {
           return null;
        }
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }

    /**
     * mÈtodo que nos sirve para descartar un determinado producto
     * @param codigo que utilizaremos para identificar al producto
     * @return devuelve el producto que lo buscar· con el codigo
     * si el producto no es nulo, lo descarta
     */
    public Producto descartaProducto(String codigo) { 
        
        Producto prod = encuentraProducto(codigo);
        if (prod != null)  {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return null;
    }

    /**
     * Encuentra un producto utilizando su codigo
     * si la lista no contiene ese codigo, devuelve el producto 
     * @param codigo que sirve para encontrar su producto relacionado
     * @return  devuelve el codigo
     * si no, la lista nos muestra el codigo relacionado
     */
    public Producto encuentraProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else if(listaP.get(codigo)== null){
            return null;
        }
		return prod;
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}
