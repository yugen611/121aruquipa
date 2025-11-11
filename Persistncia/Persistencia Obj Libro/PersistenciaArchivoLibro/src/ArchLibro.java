
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
//LIC MARCELO ARUQUIPA

public class ArchLibro {
	private String nomArch;   //guarda el nombre fisico del archivo
	private RegLibro rLib;    //por la relacion de composicion
	
	public ArchLibro(String nom){
		this.nomArch = nom;
	}
	public void crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream arLib = new ObjectOutputStream(new FileOutputStream(nomArch));
		arLib.close();
	}
	public void adicionar() throws ClassNotFoundException, IOException{
		String op;
		Scanner lee = new Scanner(System.in);
		ObjectOutputStream arLib = null;
		try {
			if(new File(nomArch).exists()){
				arLib = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else{					
				arLib = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			
			do{
				rLib = new RegLibro();
				rLib.leer();
				arLib.writeObject(rLib);
				System.out.println("Desea cont s/n");
				op = lee.next();
			}while(op.equals("s"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin adicion");
		}finally{
			arLib.close();
		}
	}
	
	public boolean eliminar(String cod) throws ClassNotFoundException,IOException{
		boolean sw = false;
		ObjectInputStream arLib = null;
		ObjectOutputStream arAux = null;
		
		try {
			arLib = new ObjectInputStream(new FileInputStream(nomArch));
			arAux = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
			while(true){
				rLib = new RegLibro();
				rLib = (RegLibro)arLib.readObject();
				if(rLib.getCod().equals(cod))
					sw = true;
				else
					arAux.writeObject(rLib);
			}
		} catch (Exception e) {
			System.out.print("\n FIN ELIMINA");
		}finally{
			arLib.close();
			arAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}
	public boolean modificar(String cod)throws ClassNotFoundException,IOException{
		Scanner lee =new Scanner(System.in);
		String resp;
		boolean sw=false;
		ObjectInputStream arLib = null;
		ObjectOutputStream arAux = null;
		try{
			arLib = new ObjectInputStream(new FileInputStream(nomArch));
			arAux = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
			while(true){
				rLib =new RegLibro();
				rLib =(RegLibro)arLib.readObject();
				if(rLib.getCod().equals(cod)){
					rLib.mostrar();
					System.out.print("Desea modificar s/n");
					 resp=lee.next();
					if(resp.equals("s")){
						System.out.print("introdusca titulo y precio");
						 String titulo = lee.next();
						 double precio = lee.nextDouble();
						 rLib.setTitulo(titulo);
						 rLib.setPrecio(precio);
						 sw=true;
					}
				}
				arAux.writeObject(arLib);
			}
		}
		catch (Exception e) {
			System.out.print("\n FIN Modifica");
		}finally{
			arLib.close();
			arAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}
	
	public void listar()throws ClassNotFoundException, IOException{
		ObjectInputStream arLib = null;
		try {
			arLib = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rLib = new RegLibro();
				rLib = (RegLibro)arLib.readObject();
				rLib.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println("Fin listado!!!!");
		}finally{
			arLib.close();
		}
	}
	
	public void listarLibrosPrecioMayor(double preciox)throws ClassNotFoundException, IOException{
		System.out.println("\nLista de libros mayores iguales a: " + preciox);
		ObjectInputStream arLib = null;
		try {
			arLib = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rLib = new RegLibro();
				rLib = (RegLibro)arLib.readObject();
				if(rLib.getPrecio() >= preciox)
					rLib.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println("Fin listado!!!!");
		}finally{
			arLib.close();
		}
	}
	
	public String buscarCodPorTitulo(String titulox) throws IOException, ClassNotFoundException {
		ObjectInputStream arLib = null;
		String codLib="";
		try {
			arLib = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rLib = new RegLibro();
				rLib = (RegLibro)arLib.readObject();
				if(rLib.getTitulo().equals(titulox))
					codLib = rLib.getCod();
				//rLib.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			//System.out.println("Fin buscar!!!!");
		}finally{
			arLib.close();
		}
		return codLib;
	}
}
