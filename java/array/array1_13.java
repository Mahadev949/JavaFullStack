class array1_13{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9};
		int b=10;
		for (int i:a){
			for (int j:a){
				if (i+j==b){
					System.out.println(i+" "+j);
				}
			}
		}
	}
}