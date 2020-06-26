package alexis;

public class Programacion_Csharp extends Escuela{
	static String Nombre_de_materia;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNombre_de_escuela("Cetec Universidad");
		setNombre_de_materia("Programacion en C Sharp");
		System.out.println(getNombre_de_escuela());
		System.out.println("Clase: "+getNombre_de_materia());
		asistencia(true);
	}
	
	
	public static void asistencia(boolean verificar)
	{
		if (verificar == true)
		{
			System.out.println("Usted tiene asistencia");
		}
		else
		{
			System.out.println("Con Falta");
		}
	}
	
	

	public static String getNombre_de_escuela() {
		return Nombre_de_escuela;
	}


	public static void setNombre_de_escuela(String nombre_de_escuela) {
		Nombre_de_escuela = nombre_de_escuela;
	}
	
	
	public static String getNombre_de_materia() {
		return Nombre_de_materia;
	}


	public static void setNombre_de_materia(String nombre_de_materia) {
		Nombre_de_materia = nombre_de_materia;
	}

}