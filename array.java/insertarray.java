public class insertarray {
    public static void main(String args[])
    {
        int arr[]={45,3,4,5,6,89,2};
        int pos=5;
        int element=28;
        for(int i=arr.length-1;i>pos-1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
}
