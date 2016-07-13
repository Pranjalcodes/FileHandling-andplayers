import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VideoPlayerInitial {

	private static final int EOF = -1;
	private void playvideo() throws IOException	{
		FileInputStream fi=new FileInputStream("F:\\5taara.mp4");
		
		BufferedInputStream bi=new BufferedInputStream(fi);
		FileOutputStream fo=new FileOutputStream("F:\\fivetaara.mp4");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		long start=System.currentTimeMillis();
		int readbyte=bi.read();
		while(readbyte!=EOF)
		{
			bo.write(readbyte);
			readbyte=bi.read();
		}
		long end=System.currentTimeMillis();
		System.out.println("Execution time is:-"+(end-start));	
	}
	public static void main(String[] args) throws IOException{
		VideoPlayerInitial vpi=new VideoPlayerInitial();
		vpi.playvideo();
	}

}
