import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class readmusic{
	
	private void playmusic() throws IOException{
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Pranjal Gupta\\Downloads\\Music\\jeet.mp3");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Pranjal Gupta\\Downloads\\Music\\jeet_ne_ke_liye.mp3");
		

		int singleByte=fi.read();
		while(singleByte!=-1)
		{
			fo.write(singleByte);
			singleByte=fi.read();
		}
	}
	public static void main(String args[]) throws IOException
	{
	readmusic rms=new readmusic();
	rms.playmusic();
	}
	
	
	//System.out.println("File is not found"+e);
}


