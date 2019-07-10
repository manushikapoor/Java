import java.util.*; 
  
class TreeSetProg { 
    public static void main(String[] args) 
    { 
        TreeSet<String> ts1 = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts1.add("B"); 
        ts1.add("A"); 
        ts1.add("C"); 
  
        // Duplicates will not get inserted and throw run time exception 
        ts1.add("C"); 
  
        // Elements get stored in default natural sorting order
        System.out.println(ts1); 
    } 
} 