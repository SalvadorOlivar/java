package main;

public class Main {

	public static void main(String[] args) {
		
		Usuario codi = new Usuario();
		
		codi.username = "Salva";
		codi.setPassword("pass");
		
		System.out.println(codi.username);
		System.out.println(codi.getPassword());
		
		codi.saludar();

	}

}
