import java.io.File;
// Here we Rename the file picking it from the specified path and place the file at the same location with the renamed name
public class handlefile {

	public static void main(String[] args) {
File file=new File("C:\\Users\\Pranjal Gupta\\Desktop\\bank.docx");
if(file.exists())
{
	System.out.println("Yes the file Exists");
	file.renameTo(new File("C:\\Users\\Pranjal Gupta\\Desktop\\sbibankgzb.docx"));
	
}
else
{
	System.out.println("File do not exists ");
}

	}

}
