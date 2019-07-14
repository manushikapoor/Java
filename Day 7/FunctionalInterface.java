import java.util.*; 
import java.util.function.Predicate; 
import java.util.function.Consumer; 
import java.util.function.Supplier;
  
class FunctionalInterface 
{ 
    public static void main(String args[]) 
    { 
        List<String> names = Arrays.asList("my","name","is","manushi","kapoor"); 
        Predicate<String> p = (s)->s.startsWith("m");
        for (String st:names) 
        { 
            if (p.test(st))   //test is the method of predicate interface
                System.out.println(st); 
        }
        Consumer<Integer> c = a -> System.out.println(a);
        c.accept(10);  //accept is method of consumer interface
        
        Supplier<Double> s = () -> Math.random();
        System.out.println(s.get()); //get is method of supplier interface
    } 
}
