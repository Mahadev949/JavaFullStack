import java.util.Scanner;
class calc{
	int a,b;
	public void add(){System.out.println(a+b);}
	public int sub(){return a-b;}
	public  void mul(int c,int d){System.out.println(c*d);}
	public float div(int c,int d){return c/d;}
	public static void main(String[] args){
		calc c=new calc();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:- ");
		c.a=s.nextInt();
		System.out.println("Enter Second number:- ");
		c.b=s.nextInt();
		c.add();
		System.out.println(c.sub());
		c.mul(c.a,c.b);
		System.out.println(c.div(c.a,c.b));
	}
}