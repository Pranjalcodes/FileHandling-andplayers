import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filehandle2 {

	//private static final int EOF = 0;

	public static void main(String[] args) throws IOException {
		
		File md=new File("C:\\Users\\Pranjal Gupta\\Desktop\\AllfilesHere");
		md.mkdir();
		File file=new File(md.getPath(),"testfile.txt");
		//creates a file specified by comma within "", at the current path in the current directory specified in md 
		file.createNewFile();
		FileOutputStream fo=new FileOutputStream(file.getPath());
		//file.getPath()-->places the file path in the object of Output Stream 
		String datainto="Hye Every one";
		fo.write(datainto.getBytes());
		//Writes the data in the output form
		FileInputStream fi=new FileInputStream(file.getPath());
		int singleByte=fi.read();
		while(singleByte!=-1)
		{
			System.out.println((char)singleByte);
			singleByte=fi.read();
			}
		fi.close();
		fo.close();
	}

}
