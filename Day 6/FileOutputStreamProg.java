    import java.io.FileOutputStream;  
    public class FileOutputStreamProg {  
        public static void main(String args[]){    
               try{    
                 FileOutputStream fout=new FileOutputStream("manushi.txt");    
                 String s="my name is manushi";    
                 byte b[]=s.getBytes();//converting string into byte array    
                 fout.write(b);    
                 fout.close();        
                }catch(Exception e){System.out.println(e);}    
          }    
    }