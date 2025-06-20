class pattern7{
	public static void main(String[] args){
	short i,j,k=1;
	for (i=1;i<6;i++){
		k=1;
	for(j=1;j<6;j++){
			System.out.print(k +"	");
			if (k==1){
				k=0;
				continue;
			}
			k++;
			}
			System.out.print("\n");
		}
	}
}