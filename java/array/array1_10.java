class array1_10{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7};
		int b[]={7,6,5,4,3,2,1};
		int c=0;
		for (int i=0;i<a.length;i++){
			if (a[i]==b[b.length-i-1]){
				continue;
			}
			else{
				c=1;
				break;
			}
		}
		
		if (c==1){
			System.out.println("The given array is not a palindrome");
		}
		else{
			System.out.println("The given array is palindrome");
		}
	}
}