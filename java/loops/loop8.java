class loop8{
	public static void main(String[] args){
		int i=153,b,d;
		int a=String.valueOf(i).length();
		
		double c=0,e=i;
		while(i>0){
			b=i%10;
			i=(int)i/10;
			c=c+Math.pow(b,a); 	
		}
		
		if (e==c){
			System.out.println("The give number is armstrong");
		}
		else{
			System.out.println("The give number is not a armstrong");
		}
				
	}
}