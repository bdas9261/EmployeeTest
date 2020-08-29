package InterviewQuestions;

public class iQc extends iQ1p{
	int a=20;
	   public void test1(){
	   System.out.println("test1 of child method");
	}
	   public static void test2(){
	   System.out.println("test2 of child method");
	}
public static void main(String[] args) {
	iQ1p p=new iQc();
	System.out.println(p.a);
	p.test1();
	p.test2();
}
}
