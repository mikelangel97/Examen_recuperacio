import java.sql.Date;

import paquete1.classeRefactoritzada;
import paquete1.Clase2;
import paquete1.Clase3;
import paquete1.Clase4;
import paquete2.Class1;
import paquete2.Class2;
import paquete2.Class3;
import paquete2.Class4;

public class Examen {

	private static final double pi = 3.14159265358979323846;
	static int numeroAlumno=0;
	
	public static void main(String[] args) {

		DebugClass clase=new DebugClass(numeroAlumno);
		System.out.println (clase.getIDMensaje (clase.getCodigo ()));
		classeRefactoritzada c1=new classeRefactoritzada();
		Clase2 c2=new Clase2();
		Clase3 c3=new Clase3();
		Clase4 c4=new Clase4();
		Class1 cs1=new Class1();
		Class2 cs2=new Class2();
		Class3 cs3=new Class3();
		Class4 cs4=new Class4();
		c1.getVariable14();
		cs1.getNombreVariable();
		cs2.getVariable12();
		cs3.variableCambiada();
		cs4.getVariable12();

        double calculo=7*pi*100;

		int contador=0;
		for (int i = 0; i < 200; i++) {
			contador=contador+i+5;

			if(contador==200) {
			    System.out.println("Examen : Apartado 3.1. "+new Date(i));
			}
			
			if(contador==500) {
				/* Examen : Apartado 3.2 */
			    System.out.println(clase.getIDMensaje(clase.getCodigo()));
			}
		}
	}

	public static int getNumeroAlumno() {
		return numeroAlumno;
	}

	public static void setNumeroAlumno(int numeroAlumno) {
		Examen.numeroAlumno = numeroAlumno;
	}
}
