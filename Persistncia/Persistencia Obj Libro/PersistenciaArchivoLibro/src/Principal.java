import java.io.IOException;
//LIC MARCELO ARUQUIPA
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Scanner lee = new Scanner(System.in);
		ArchLibro a = new ArchLibro("libro2025.dat");
		String cod;
		int op;
		do {
			System.out.println("\n\n ****** Menu de archivo Libro ******");
			System.out.println("1. Crear"
					+ "\n2. Adicionar"
					+ "\n3. Eliminar"
					+ "\n4. Modificar"
					+ "\n5. Listar"
					+ "\n6. Listar Libros con precio mayor a x"
					+ "\n7. Salir");
			op = lee.nextInt();
			switch(op) {
				case 1: a.crear();
						break;
				case 2: a.adicionar();
						break;
				case 3: System.out.println("Intr. codigo de libro");
						cod = lee.next();
						a.eliminar(cod);
						break;
				case 4: System.out.println("Intr. codigo de libro");
						cod = lee.next();
						a.modificar(cod);
						break;
				case 5: a.listar();
						break;
				case 6: a.listarLibrosPrecioMayor(100);
						break;
				case 7: System.out.println("Fin Programa!!!");
						break;
				default:System.out.println("no existe la opcion");
			}
		}while(op != 7);
		
		
//		//a.crear();
//		//a.Adicionar();
//		a.Listar();
//		
//		//listar libro con precio mayor o igual a 100
//		a.listarLibrosPrecioMayor(100);
//		
//		//buscar codigo de libro con titulo x
		
//		String x = "Poo php";
//		System.out.println("\nBuscar codigo por titulo: " + x);
//		String codLibro = a.buscarCodPorTitulo(x);
//		if(!codLibro.equals(""))
//			System.out.println("codigo: " + codLibro);
//		else
//			System.out.println("no existe el libro!!!!");
		
	}

}
