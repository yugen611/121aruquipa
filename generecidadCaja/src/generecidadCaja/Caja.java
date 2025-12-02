package generecidadCaja;

public class Caja<R> {

	private R contenido;
	
	
	public void guardar (R valor)
	{
		this.contenido=valor;
	}
	public R obtener ()
	{
		return this.contenido;
	}
	
	public boolean compIgual(Caja<Integer> c4)
	{
		if (this.contenido.equals(c4.obtener())) {
			return true;
			
		}
		return false;
	}
	public void mayorCaracter(Caja<Character> c6) {
		if (contenido > c6.obtener()) {
			System.out.println(this.contenido+" tiene mayor caracter");
			
		} else {
			System.out.println(c6.obtener()+" tiene mayor caracter");

		}
		
	}
	

}
