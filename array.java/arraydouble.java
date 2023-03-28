import java.util.Scanner;
public class arraydouble {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the element double");
        arr=s.nextInt();
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(2*arr[i]);
        }
    }
    
}
