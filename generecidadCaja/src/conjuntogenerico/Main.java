package conjuntogenerico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto<Integer> ca= new Conjunto<Integer>();
		ca.adi(3);
		ca.adi(5);
		ca.adi(5);
		ca.adi(11);
		ca.adi(13);
		ca.mostrar();
		
		Conjunto<String> cb =new Conjunto<String>();
		System.out.println("cuantas String quieres adicionar?");
		Scanner leer=new Scanner (System.in);
		int e= leer.nextInt();
		for (int i = 0; i < e; i++) {
			Scanner leo=new Scanner (System.in);
			String r= leo.nextLine();
			cb.adi(r);
		}
		cb.mostrar();
		
		System.out.println("------elimina datos delconjunto a----------");
		System.out.println(ca.elimina(3));
		
		ca.mostrar();
		
		System.out.println("------elimina datos delconjunto b----------");
		System.out.println(cb.elimina("inf-789"));
		
		cb.mostrar();
		
		System.out.println("------contar----------");
		//ca.Contar(5);
		System.out.println("el nrodeveces que esta el 5 en caja a  es " +ca.Contar(5));
		
		System.out.println("------buscar----------");
		System.out.println("¿se encontro 13 en la caja a?" +ca.buscar(13));
		
		System.out.println();
		System.out.println("SANDOVAL CALDERON KEVIN OSCAR");
		
		

	}

}
