class building{
	public static void main(String[] args){
		int a[][]=new int[6][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[5];
		a[3]=new int[4];
		a[4]=new int[8];
		a[5]=new int[2];
		
		for (int i=0;i<a.length;i++){
			System.out.println("Floor number "+(i+1));
			for(int j=0;j<a[i].length;j++){
				System.out.println("  Room no "+(j+1));
			}
		}
		
	}
}