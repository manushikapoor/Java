import java.io.*; 
class ObjectOutputInputStreamProg 
{ 
    public static void main(String[] args) throws IOException 
    { 
        FileOutputStream f = new FileOutputStream("manushi.txt"); 
        ObjectOutputStream o = new ObjectOutputStream(f); 
        o.write(5); 
        o.close(); 
          
        FileInputStream fin = new FileInputStream("manushi.txt"); 
        ObjectInputStream oi = new ObjectInputStream(fin); 
        System.out.println(oi.read()); 
        oi.close(); 
    } 
} 