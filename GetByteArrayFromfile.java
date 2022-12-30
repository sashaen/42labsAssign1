import java.io.*;

public class GetByteArrayFromfile {
  public static void main(String[] args) throws Exception
{
File file = new File("C:\\Users\\Tanvy\\Desktop\\Intern-1\\inputfile.txt");

byte[] b = new byte[(int) file.length()];
try {
FileInputStream fileInputStream = new FileInputStream(file);
fileInputStream.read(b); // reading all data from input file
for (int i = 0; i < b.length; i++) {
System.out.println(
 "b[" + i + "] = " +((int)b[i] < 11  ? "  " : "") +
  b[i] + " , " +" character=(" + (char)b[i] + ")");
  }
} catch (FileNotFoundException e) {
System.out.println("File Not Found.");
e.printStackTrace();
}
}
}