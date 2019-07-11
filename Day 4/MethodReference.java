    interface Area{  
        void area();  
    }  
    public class MethodReference {  
        public static void area(){  
            System.out.println("area of square is side * side");  
        }  
        public static void main(String[] args) {  
            // Referring static method  
            Area a = MethodReference::area;  
            // Calling interface method  
            a.area();  
        }  
    }  
