import java.util.*;
public class QueueStack {
   static Stack stack1 = new Stack();
   static Stack stack2 = new Stack();
   public void enqueue(int element) {
      stack1.push(element);
      System.out.println(element + " inserted");
   }
   public void dequeue() {
      if(stack2.isEmpty()) {
         while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
         }
      }
      System.out.println(stack2.pop() + " removed");
   }
   public static void main(String args[]) {
      QueueStack test = new QueueStack();
      test.enqueue(10);
      test.enqueue(50);
      test.enqueue(100);
      test.dequeue();
   }
}