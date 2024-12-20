package Javapackage;


public class callbyvalue {

	 int data=50;
	 void print(int data)
	 {
	    data=data+100;//changes in the local variable only
	 }
	 
	 public static void main(String[] args) {
		 callbyvalue cbv=new callbyvalue();
		 System.out.println("before change"+cbv.data);
		 cbv.print(500);
		 System.out.println("after change"+cbv.data);
	 }
		
	}