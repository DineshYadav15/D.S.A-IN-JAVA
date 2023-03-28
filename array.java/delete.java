class delete
{
	public static void main(String[] args)
	{
		int arr[]={1,6,7,8,9,24,5,6};
		int delete=24;
		System.out.println("delete a number");
		for(int i=0;i<arr.length;i++)
		{
			if(delete==arr[i])
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
				}
			}
			 for(int i=0;i<arr.length-1;i++)
			 {
				System.out.println(arr[i]+" "); 
			 }
	}
}
						
				