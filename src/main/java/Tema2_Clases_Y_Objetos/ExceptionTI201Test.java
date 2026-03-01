
package Tema2_Clases_Y_Objetos;

/**
 *
 * @author DILAN
 */
public class ExceptionTI201Test {
     static public void main(String... args){
         int a= 0;
         int b= 0;
         
         // excepcion por division por cero
         try {  
         int c = a / b;
         } catch (Exception e){
             System.out.println("Operacion no valida");
             
          }
      // objeto no asignado solucion 1
     ExceptionTI201 ex;
     ex = new  ExceptionTI201();
     ex.toString();
     
     // objeto no asignado 
     String str = null;
     try {
         System.out.println(str.toUpperCase());
         
         int arr [] = new int [2];
         arr[3]=2;
     }
         catch  (Exception e) {
             System.out.println("error no tiene asignado");
              System.out.println("e.toStrin()");
         }
     int ac= 2147483647;
     try {
     } catch (Exception s){
         ac++;
     
         System.out.println(ac);
    
       }
     
     {
     // llamar main
         main (args);
     }
     }
}

