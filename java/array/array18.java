class array12{
	public static void main(String []args){
		int a[]={1,2,3,1,3,5,6,7};
		int b[]=new int[a.length];
		int c=0,d=0;
		for (int i=0;i<a.length;i++){
			c=0;
			for (int j=0;j<a.length;j++){
				if (a[i]==b[j]){
					c=1;
				}
			}
			if(c==1){
				continue;
			}
			b[d]=a[i];
			d++;
		}
		for(int i:b){
			System.out.print(i+" ");
		}

	}
}