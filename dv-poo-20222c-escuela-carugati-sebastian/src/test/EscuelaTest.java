package test;
import domain.Alumnos;
import domain.Materias;
import domain.Asignacion;

public class EscuelaTest {

	public static void main(String[] args) {
		Materias m1 = new Materias("Geografia", 1);
		Materias m2 = new Materias ("Matematicas",2);
		Materias m3 = new Materias ("Lengua", 1);
		Materias m4 = new Materias("Fisica", 2);
		Materias m5 = new Materias ("Geometria",1);
		Materias m6 = new Materias ("Historia", 2);
		Alumnos a1 = new Alumnos("Juan", 17);
		Alumnos a2 = new Alumnos("Pedro", 15);
		Alumnos a3 = new Alumnos("Sebastian", 16);
		Asignacion n1 = new Asignacion (5,10,5);
		Asignacion n2 = new Asignacion (8,7,5);
		Asignacion n3 = new Asignacion (10,4,7);
		Asignacion n4 = new Asignacion (7,8,9);
		Asignacion n5 = new Asignacion (5,1,10);
		Asignacion n6 = new Asignacion (2,8,7);
		
		a1.mostrarAlumnos();
		m1.mostrarMaterias();
		n1.mostrarNotas();
		m4.mostrarMaterias();
		n4.mostrarNotas();
		System.out.println("----------------------------");
		a2.mostrarAlumnos();
		m2.mostrarMaterias();
		n2.mostrarNotas();
		m5.mostrarMaterias();
		n5.mostrarNotas();
		System.out.println("----------------------------");
		a3.mostrarAlumnos();
		m3.mostrarMaterias();
		n3.mostrarNotas();
		m6.mostrarMaterias();
		n6.mostrarNotas();
		

	}

}
