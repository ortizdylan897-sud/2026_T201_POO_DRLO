/*
*2026 ITESS-TICS
*PERIODO:ENERO-JUNIO
*ASIGNATURA: PROGRAMACION ORTIENTADA A OBJETOS
*DOCENTE: FRANCISCO JAVIER MONTESILLO PUENTE
*DESCRIPCION: TEMA 1.2
*ENTORNO DE DESARROLLO: 
*/
package Student;

public class Student   {
  private String controlNumber;
   private String name;
   private String career;
    private String gender;

    public Student(String controlNumber, String name, String career, String gender) {
        this.controlNumber = controlNumber;
        this.name = name;
        this.career = career;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "student{" + "controlNumber=" + controlNumber + ", name=" + name + ", career=" + career + ", gender=" + gender + '}';
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setGender(String gender) {
        this.gender = gender;
    
    }
 
}