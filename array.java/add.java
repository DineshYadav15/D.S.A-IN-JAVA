class add
{
	public static void main(String[] args)
	{
		int arr[]={1,6,7,8,9,24,5,6};
		int add=34;
		System.out.println("delete a number");
		for(int i=0;i<arr.length;i++)
		{
			if(add==arr[i])
			{
				for(int j=i+1;j<arr.length+1;j++)
				{
				System.out.println(arr[i]+" "); 
				}
			}
		}
	}
}