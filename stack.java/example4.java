import java.util.Stack;
public class example4 {
    public static void main(String[] args)
    {
      Stack animals=new Stack();
      animals.push("dog");
      animals.push("horse");
      animals.push("cat");
      animals.push("goat");
      animals.push("cow");
      System.out.println(" "+animals);
      animals.pop();
      System.out.println(" "+animals);
    }
    
}
