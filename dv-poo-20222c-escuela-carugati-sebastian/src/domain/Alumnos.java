package domain;

public class Alumnos {
	private String alumno;
	private int edadalumno;
	
	
	
public Alumnos(String _alumno, int _edadalumno) {
	
	alumno = _alumno;
	edadalumno = _edadalumno;
	
}


//Getters y setters


public String getAlumno() {
	 return alumno;
}

public void setAlumno(String alumno) {
	 this.alumno = alumno;
}

public int getEdad() {
	 return edadalumno;
}

public void setEdad(int edadalumno) {
	 this.edadalumno = edadalumno;
}



public void mostrarAlumnos() {
	System.out.println(alumno + " " + edadalumno + " años");

}

}
