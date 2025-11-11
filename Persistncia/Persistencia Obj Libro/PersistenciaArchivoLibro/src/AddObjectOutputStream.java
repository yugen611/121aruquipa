import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//LIC MARCELO ARUQUIPA
public class AddObjectOutputStream extends ObjectOutputStream{
	
	public AddObjectOutputStream(OutputStream out) throws IOException{
			super(out);
	}
	protected void writeStreamHeader() throws IOException{
		this.reset();
	}
}
