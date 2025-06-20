class array16{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9};
		int s=a[1],l=a[1];
		for(int i:a){
			if (i<s){
				s=i;
			}
			if (i>l){
				l=i;
			}
		}
		
		System.out.println("The difference between largset number and smallest number is "+(l-s));
	}
}