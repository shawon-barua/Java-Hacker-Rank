package charColleague;

public class charColleague {

	String name="shawon";
	char grade='A';
	int age = 26;
	float height=5.5f;
	double weight=59.4;
	
	public void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
	}
	
	public void upgrade()
	{
		age=27;
		name="Bopu";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charColleague Shawon=new charColleague();
		Shawon.print();
		charColleague Bopu=Shawon;
		Shawon.upgrade();
		Bopu.print();
		
	}

}
