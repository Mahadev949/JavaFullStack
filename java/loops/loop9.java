class loop9{
	public static void main(String[] args){
		int a=7,count=0;
		for (int i=2;i<a;i++){
			if (a%i==0){
				count=1;
				System.out.println("Not armstrong");
				break;
			}
		}
		if (count==0){
			System.out.println("armstrong");
		}
	}
}