package conjuntogenerico;

import java.util.Iterator;

public class Conjunto <R>{
	
	private int ne;
	private Object[] v= new Object[50];
	
	public Conjunto()
	{
		this.ne=0;
		
	}
	public void adi(R dato)
	{
		this.v[ne]=dato;
		ne++;
	}
	public void mostrar()
	{
		for (int i = 0; i < ne; i++) {
			System.out.println(v[i]+"\t");
			
		}
	}
	
	public boolean elimina (R dato)
	{
		for (int i = 0; i < ne; i++) {
			if (v[i].equals(dato)) {
				v[i]= v[ne-1]; //rempalzando eldato xon elultimo vector
				ne--;
				return true;
				
			}
			
		}
		return false;
	}
	public int Contar(R dato)
	{
		int ct=0;
		for (int i = 0; i < this.ne; i++) {
			if (v[i].equals(dato)) {
				ct++;	
			}
		}
		return ct;
	}
	public boolean buscar(R dato)
	{
		for (int i = 0; i < ne; i++) {
			return  true;
		}
		return false;
	}
		
	

}
