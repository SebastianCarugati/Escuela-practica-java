package domain;

public class Asignacion {
	private int nota1;
	private int nota2;
	private int notatp;
	private int promedio;
	private int suma;
	
	
public Asignacion(int _nota1, int _nota2, int _notatp) {
	nota1 = _nota1;
	nota2 = _nota2;
	notatp = _notatp;
	suma = nota1 + nota2 + notatp;
	promedio = suma/3;
}

//Enum

enum Estado {
	APROBADO,
	REPROBADO
}


//Getters y setters


public int getNota1() {
	 return nota1;
}

public void setNota1(int nota1) {
	 this.nota1 = nota1;
}


public int getNota2() {
	 return nota2;
}

public void setNota2(int nota2) {
	 this.nota2 = nota2;
}


public int getNotaTp() {
	 return notatp;
}

public void setNotaTp(int notatp) {
	 this.notatp = notatp;
}





public void mostrarNotas() {
	System.out.println("Las notas son: Primer parcial: " + nota1 + ", Segundo parcial: " + nota2 + ", Trabajo practico: " + notatp);
	System.out.println("El promedio de las notas es " + promedio);
	if (promedio >= 6) {
	   System.out.println(Estado.APROBADO);
	} else {
		System.out.println(Estado.REPROBADO);
	}
}

}
