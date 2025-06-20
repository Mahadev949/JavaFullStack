class loop11{
	public static void main(String[] args){
		int a=101,b=0;
		if (a%2==0){
			b=1;
		}
		switch (b){
			case 1:
			System.out.println("EVEN");
			break;
			case 0:
			System.out.println("ODD");
			break;
			default:
			System.out.println("Something went wrong");
		}
	}
}