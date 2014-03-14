package ejemplos.powermock.privados;

/**
 * Cliente b�sico que delega todas las operaciones en una instancia
 * de una clase delegado, invocando a sus m�todos est�ticos.
 * 
 * @author <A HREF="mailto:rmartico@ubu.es">Ra�l Marticorena</A>
 * @author <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.0
 * 
 */
public class Cliente {
	
	/** Valor a. */
	private int a;
	
	/** Valor b. */
	private int b;
	
	/** Delegado. */
	private Delegado delegado;
	
	/**
	 * Constructor.
	 * 
	 * @param a a
	 * @param b b 
	 * @param c discriminante para el constructor
	 */
	public Cliente(int a, int b, Delegado delegado){
		this.setA(a);
		this.setB(b);		
		this.delegado = delegado;
	}
	
	/**
	 * Establece el valor a.
	 * 
	 * @param a a
	 */
	public void setA(int a) {
		this.a = a;
	}
	
	/**
	 * Establece el valor b.
	 * 
	 * @param b b
	 */
	public void setB(int b) {
		this.b = b;
	}
	
	/**
	 * Suma los dos valores encapsulados.
	 * 
	 * @return suma de a y b
	 */
	public int sumar() {
		return delegado.sumar(a,b);
	}
	
	/**
	 * Resta los dos valores encapsulados.
	 * 
	 * @return resta de a menos b.
	 */
	public int restar() {
		return delegado.restar(a,b);
	}
	
	/**
	 * F�brica de delegados.
	 * 
	 * @return delegado
	 */
	public static Delegado fabrica() {
		return new Delegado();
	}

}
