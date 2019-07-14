import java.io.*;
class FileReaderProg {
public static void main(String args[]) throws Exception {
FileReader f = new FileReader("manushi.java");
BufferedReader br = new BufferedReader(f);
String s;
while((s = br.readLine()) != null) {
System.out.println(s);
}
f.close();
}
}