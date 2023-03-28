import java.util.Stack;
public class example2 {
    public static void main(String[] args)
    {
      Stack numbers=new Stack();
      numbers.push(190);
      numbers.push(100);
      numbers.push(180);
      numbers.push(150);
      numbers.push(1560);
      
      System.out.println(" "+numbers);
      numbers.pop();
      System.out.println(" "+numbers);
    }
    
}
