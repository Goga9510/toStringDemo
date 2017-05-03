package barber;

class Animal {

	private int id;
	private String name;
	
	public Animal(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Number= " + id + "; Name= " + name;		
	}

}

public class Issue569 {
	
	public static void main(String[] args) {
		Animal Animal1 = new Animal(1, "Cat");
		Animal Animal2 = new Animal(2, "Dog");
		
		System.out.println(Animal1);
		System.out.println(Animal2);
	}

}