public class minmax {
    public static void main(String args[])
    {
        int arr[]={4,5,8,10,15,1};
        int min =arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++)//ye likh bhi sakte ya nhi bhi apki marji
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("enter the min number"+min);
        System.out.println("enter the max number"+max);
    }
    
}
