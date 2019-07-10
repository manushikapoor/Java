import java.util.*; 
  
class Generics 
{ 
    public static void main(String[] args) 
    { 
        // Creating a an ArrayList with String specified 
        ArrayList <String> al = new ArrayList<String> (); //class ArrayList using generics
  
        al.add("manushi"); 
        al.add("kapoor"); 

        String s1 =al.get(0); 
        String s2 =al.get(1); 
        System.out.println(s1+" "+s2);
    } 
} 