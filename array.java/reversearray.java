class reversearray {
    public static void main(String[] args)
    {
        int arr[]={1,2,5,4,5,6,7,8,9};
        System.out.print("enter the reverse number");
        for (int i = arr.length-1; i >= 0; i--)   
        {
            System.out.print(" "+arr[i]);
        }
    }
}
