package paquete3;

public class Persona {

	String email="";
	int telefono=0;
	String direccion="";
	PersonaData PersonaContacto = new PersonaData(0, "", 0f);

	public Persona(int edad, String email, String nombre, int telefono, String direccion, float altura) {
		super();
		this.PersonaContacto.edad = edad;
		this.email = email;
		this.PersonaContacto.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.PersonaContacto.altura = altura;
	}

	public int getEdad() {
		return PersonaContacto.edad;
	}

	public void setEdad(int edad) {
		this.PersonaContacto.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return PersonaContacto.nombre;
	}

	public void setNombre(String nombre) {
		this.PersonaContacto.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getAltura() {
		return PersonaContacto.altura;
	}

	public void setAltura(float altura) {
		this.PersonaContacto.altura = altura;
	}
}
