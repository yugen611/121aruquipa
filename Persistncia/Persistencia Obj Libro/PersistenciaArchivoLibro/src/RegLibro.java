
import java.util.Scanner;

//LIC MARCELO ARUQUIPA
//se implementa la interfaz serializable
public class RegLibro implements java.io.Serializable{
	private String cod;
	private String titulo;
	private double precio;
	//private String autor;
	
	public void leer(){
		Scanner lee =  new Scanner(System.in);
		System.out.println("cod - titulo - precio");
		this.cod = lee.next();
		this.titulo = lee.next();
		this.precio = lee.nextDouble();
	}
	public void mostrar(){
		System.out.println("\ncod: "  + this.cod);
		System.out.println("titulo: "  + this.titulo);
		System.out.println("precio: "  + this.precio);
	}
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
