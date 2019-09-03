package interfaceTest;

public class Child extends ParentClass1 implements parent1,parent2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Child show ..");
		
	}
	
	public static void main(String[] args) {
		Child c =new Child();
		c.show();
	}

}
