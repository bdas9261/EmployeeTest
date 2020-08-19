package Test;

public class TestInheritance2  extends TestInheritance1{
	public void t() {
		System.out.println("child cocreet method");
	}
	public static void main(String[] args) {
		TestInheritance1 t=new TestInheritance1();
		t.p();
		t.m();
		System.out.println(t.a);
		TestInheritance1 t1=new TestInheritance2();
		t1.m();
		t1.p();
		System.out.println(t1.a);
		TestInheritance2 t2=new TestInheritance2();
		t2.m();
		t2.p();
		System.out.println(t2.a);
		t2.t();
	}	

}
