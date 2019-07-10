import java.util.*; 
public class ArrayDequeProg  //double ended queue
{ 
    public static void main(String[] args) 
    { 
         
        Deque<Integer> de_que = new ArrayDeque<Integer>(10); 
   
        de_que.add(10); //simply adds elements
        de_que.add(20); 
        de_que.add(30); 
        de_que.add(40); 
        de_que.add(50); 
        
        // addFirst() method to insert at start 
        de_que.addFirst(60); 
        de_que.addFirst(70); 
   
        // addLast() method to insert at end 
        de_que.addLast(80); 
        de_que.addLast(90); 
        for(Iterator itr = de_que.iterator(); itr.hasNext();) 
        { 
            System.out.println(itr.next()); 
        } 
}
}