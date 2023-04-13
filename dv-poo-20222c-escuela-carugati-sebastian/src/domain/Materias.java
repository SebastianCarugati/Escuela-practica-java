package domain;

public class Materias {
	//Atributos
	public String materia1;
	public int cuatrimestremateria1;



	//Constructor
 public Materias(String _materia1, int _cuatrimestre1) {
	this.materia1 = _materia1;
	this.cuatrimestremateria1 = _cuatrimestre1;

	
	 
 }
 
  //Getters y setters
 
 public String getMateria1() {
	 return materia1;
 }
 
 public void setMateria1(String materia1) {
	 this.materia1 = materia1;
 }
 
 
 public int getCuatrimestre1() {
	 return cuatrimestremateria1;
 }
 
 public void setCuatrimestre1(int cuatrimestremateria1) {
	 this.cuatrimestremateria1 = cuatrimestremateria1;
 }
 
 
 
 //public String getMateria2() {
//	 return materia2;
// }
 
// public void setMateria2(String materia2) {
//	 this.materia2 = materia2;
// }
 
 
 //public int getCuatrimestre2() {
//	 return cuatrimestremateria2;
// }

 //public void setCuatrimestre2(int cuatrimestremateria2) {
//	 this.cuatrimestremateria2 = cuatrimestremateria2;
 //}
 

 public void mostrarMaterias() {
	 System.out.println(materia1 + ", perteneciente al cuatrimestre " + cuatrimestremateria1);

 }
}
