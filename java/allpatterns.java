class allpatterns{
	public static void main(String[] args){
		short i,j,k=1,l=1;
		String a="hello";

		//1
		/**for (i=0;i<6;i++){
		for(j=0;j<6;j++){
			System.out.printf("*");
			}
			System.out.printf("\n");
		}**/
		
		//2
		/**for (i=1;i<6;i++){
		for(j=1;j<6;j++){
			System.out.print(i);
			}
			System.out.print("\n");
		}**/
		
		//3
		/**for (i=1;i<6;i++){
		for(j=1;j<6;j++){
			System.out.print(j);
			}
			System.out.print("\n");
		}**/
		
		//4
		/**for (i=1;i<6;i++){
		for(j=1;j<6;j++){
			System.out.print(k++ +"	");
			}
			System.out.print("\n");
		}**/
		
		//5
		/**for (i=1;i<6;i++){
		for(j=1;j<6;j++){
			System.out.print(k++ +"	");
			if (k==10){
			k=1;
			}
			}
			System.out.print("\n");
		}**/
		
		//6
		/**for (i=1;i<6;i++){
		for(j=1;j<6;j++){
			System.out.print(k +"	");
			k+=2;
			}
			System.out.print("\n");
		}**/
		
		//7
		/**for (i=1;i<6;i++){
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
		}**/
		
		//8
		/**k=7;
		for (i=1;i<k;i++){
		for(j=1;j<(k-i);j++){
			System.out.print(" ");
		}
		for(j=1;j<i;j++){
			System.out.print(" *");
		}
		System.out.println();
	
	}**/
	
	//9
	
	
	/**k=7
	for (i=1;i<k;i++){
		for(j=1;j<(k-i);j++){
			System.out.print(" ");
		}
		for(j=1;j<i;j++){
			System.out.print(" "+j*2);
		}
		System.out.println();
	
	}**/
	
	//10
	/**
	for (i=1;i<a.length()+1;i++){
	for (j=0;j<i;j++){
		System.out.print(a.charAt(j));
		}
	System.out.println();
		}**/

	

		
		
		
		
		
		
		
	}
}