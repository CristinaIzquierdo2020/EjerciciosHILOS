
public class App {
	
	 private static ColaTareas contenedor;
	 private static final int CANTIDADCONSUMIDORES = 5;
	 private static final int CANTIDADPRODUCTORES = 5;


	public static void main(String[] args) {
		
		final int tamaņoPila = 3;

			  
		        contenedor = new ColaTareas(tamaņoPila);
		        Productor productor = new Productor(contenedor,1);
		        Consumidor consumidor = new Consumidor(contenedor,1);
		        
		        
		 
	}

}

