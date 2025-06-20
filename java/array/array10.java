class array10{
  public static void main(String []args){
    int []a={1,2,1,2,3,4,1,3};
    boolean []b=new boolean[a.length];
    int count=0;
    for (int i:a){
      
     if (b[i]){
        continue;
      }
     
      count=0;
     
      for(int j:a){
        if (i==j){
          b[j]=true;
          count++;
        }
        
      }
      if(count>1){
        System.out.println("The element "+i+" has repeated "+count);
      }
    }
  }
}