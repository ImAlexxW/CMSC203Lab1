
public class ClassDemo 
{
	
	public static void main (String[] args) 
	{	
		Person a = new Person();
		a.name = "Alex";
		a.age = 20;

		
		Person b = new Person();
		b.name = "Nora";
		b.age = 19;
		
		a.sayName();
		b.sayName();
		a.haveBirthday();
		a.sayName();
		
	}
	
	
}
