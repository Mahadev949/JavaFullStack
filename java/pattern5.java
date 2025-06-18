class pattern5{
	public static void main(String[] args){
	short i,j,k=1;
	for (i=1;i<6;i++){
		for(j=1;j<6;j++){
			System.out.print(k++ +"	");
			if (k==10){
			k=1;
			}
			}
			System.out.print("\n");
		}
	}
}