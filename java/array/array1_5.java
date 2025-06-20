class array1_5{
  public static void main(String []args){
    int []a={7,8,9,0,1,3};
	int []b={1,2,3,4,5,6};
	for (int i:a){
		for(int j:b){
			if (i==j){
				System.out.println(i);
			}
		}
	}		
  }
}