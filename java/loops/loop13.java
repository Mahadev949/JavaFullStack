class loop13{
	public static void main(String[] args){
		int a=10,b=20,c=30;
		if (a>b){
			if (a>c){
				System.out.printf(a+" is greatest number");
			}
			else{
				System.out.printf(c+" is greatest number");
			}
		}
		else{
			if (b>c){
				System.out.printf(b+" is greatest number");
			}
			else{
				System.out.printf(c+" is greatest number");
			}
		}
	}
}