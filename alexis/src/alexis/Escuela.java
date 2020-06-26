package alexis;


public class Escuela {
	static String Nombre_de_escuela;

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_escuela("Cetec Universidad");
		System.out.println(getNombre_de_escuela());
		abrir(true);
	}
	
	
	public static void abrir(boolean estado)
	{
		if (estado == true)
		{
			System.out.println("La escuela se encuentra abierta");
		}
		else
		{
			System.out.println("La escuela se encuentra cerrada");
		}
	}
	
	

	public static String getNombre_de_escuela() {
		return Nombre_de_escuela;
	}


	public static void setNombre_de_escuela(String nombre_de_escuela) {
		Nombre_de_escuela = nombre_de_escuela;
	}
	
}
