class array19{
	public static void main(String[] args){
		int a[]=new int[105];
		//inserting elements
		for (int i=1;i<=100;i++){
			if (i==21||i==24||i==34){continue;}
			
			a[i-1]=i;
			
		}
		
		for (int i=1;i<=100;i++){
			if (a[i-1]!=i){
				System.out.println((i)+" Elements is not found");		
			}
		}
	}
}