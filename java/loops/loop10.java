class loop10{
	public static void main(String[] args){
		String a="madam",b="";
		for(int i=a.length()-1;i>=0;i--){
			b+=a.charAt(i);
		}
		if (a.equals(b)){
			System.out.print("Palindrome");
		}
		else{
			System.out.print("not Palindrome");
		}
	}
}