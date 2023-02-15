package practica2evaluacionjavadoc;


/**
 * Clase para manejar las entradas de un blog
 * @since 15/02/2023
 * @author Vicky
 * @version 2.4
 */

//Clase EntradaBlogVNRG.
public class EntradaBlogVNRG {
	
	
	/**
         * separador es el carácter que separa ENTRADA DE del nombre del autor
         */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	//Constructor de la clase
        /**
         * 
         * @param id Recibe el id
         * @param autor Recibe el nombre del autor
         * @param texto Recibe el texto de la entrada
         * @throws IllegalArgumentException  Si el id es negativo, lanza una excepcion
         */
	public EntradaBlogVNRG(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	
        /**
         * 
         * @return Devuelve el número de la entrada
         */
	public int getId(){
		return this.id;
	}
	
	
        /**
         * 
         * @return devuelve el texto completo de la entrada
         */
	public String getTexto(){
		return this.texto;
	}
	
	
        /**
         * 
         * @return devuelve el nombre del autor de la entrada en mayúsculas
         */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
        /**
         * 
         * @return Devuelve el nombre autor
         */
	public String devuelveAutor(){
		return this.autor;
	}
	
	
        /**
         * 
         * @param args argumentos del main, aunque puede no tenerlos
         */
	public static void main(String[] args) {
                //creación objeto EntradaBlogVNRG con su constructor.
		EntradaBlogVNRG e1=new EntradaBlogVNRG (1,"Victoria","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}