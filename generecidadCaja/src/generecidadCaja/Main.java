package generecidadCaja;

public class Main {

	public static void main(String[] args) {
		// Tipo de dato primitivo    clase de tipo de dato
			// int                   --> Integer
			// double                --> Double
			// char                  --> Character
			// boolean               --> Boolean
			//String                 --> String
		
		Caja<Integer> c1 = new Caja<Integer>();
		c1.guardar(41000);
		System.out.println(c1.obtener());
		
		Caja<String> c2 =new Caja<String>();
		c2.guardar("En el 41avo milenio solo existe la guerra");
		System.out.println(c2.obtener());
		
		Caja<Boolean> c3=new Caja<Boolean>();
		c3.guardar(true);
		System.out.println(c3.obtener());
		
		System.out.println(c2.obtener()+" "+c1.obtener()+" "+c3.obtener());
		
		//a) dado dos cajas de numeros enteros 
		//verificar si ambos soniguales
		Caja<Integer>c4 =new Caja<Integer>();
		c4.guardar(30000);
		System.out.println(c4.obtener());
		//sol1
		
		if (c1.obtener().equals(c4.obtener())) {
			System.out.println("igual");
			
		} else {
			System.out.println("distintos");

		}
		
		System.out.println(c1.compIgual(c4));;
		
		//dado dos cajaas de caracters mostrar la caja co
		// que tiene elmayor caracter
		Caja<Character> c5 = new Caja<Character>();
		c5.guardar('W');
		System.out.println(c5.obtener());
		
		Caja<Character> c6 = new Caja<Character>();
		c6.guardar('U');
		System.out.println(c6.obtener());
		
		//c5.mayorCaracter(c6.obtener());
		
	
		if (c5.obtener()>c6.obtener()) {
			System.out.println(c5.obtener()+" es el mayor");
			
		} else {
			System.out.println(c6.obtener()+" es el mayor");

		}

	}

}
