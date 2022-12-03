package ar.com.codoacodo.idiomas;

public class Dog implements IHablar{
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " say guau guau");
	}

	
}
