class loop5{
	public static void main(String[] args){
		int a=1,b=34,c=2;
		if (a>b){
			if (a>c){
				System.out.printf(a+" is greatest number");
			}
			else{
				System.out.printf(c+" is greatest number");
			}
		}
		else{
			if (a>b){
				System.out.printf(a+" is greatest number");
			}
			else{
				System.out.printf(b+" is greatest number");
			}
		}
	}
}