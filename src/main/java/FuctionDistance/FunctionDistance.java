/*
*2026 ITESS-TICS
*PERIODO: ENERO/JUNIO
*ASIGNATURA: PROGRAMACION ORIENTADA A OBJETOS
*DOCENTE: FRANCISCO JAVIER MONTESILLO PUENTE
*DESCRIPCION: 1.1 Medicion aproximada de figuras amorfas
              distancia de la curva de la funcion
Paso 1: entender 
        Calcular la longitud de la curva de una funcion f(x)
        la funcion es FIJA, dado un rango [a,b]
Paso 2: diseno CLASE/ ALGORITMO/GUI

--------------------------
|   FuctionDistance
--------------------------
|-xstar: double
*INTENTO DE PROGRAMADOR: DRLO
FECHA: 11-FEB-2026

*/
      
/*FuctionDistance*/
      

public class FunctionDistance {
    //atributos
    private double xStart;
    private double xEnd;
    private int nPoints;
    
    //metodos
    public FunctionDistance (double xStart, double xEnd, int nPoints){
        this.xStart = xStart;
        this.xEnd = xEnd;
        this.nPoints = nPoints;
    }
    public double compute (){
       //calcular delta
      double deltaX = (xEnd-xStart )/ nPoints;
       //calcular n puntos de la funcion
       double x[]= new double [nPoints];
       double y[]= new double [nPoints];
       for(int i=0;i < nPoints; i++) {
        x[i] = i * deltaX;
        y[i] = Match.sin(x[i]);
       


          
       }
       double l [] = new double [nPoints -1];

       for (int i = 0; i < nPoints - 1; i++) {
       l[i] = Match.sqrt ( (x[i+1]-x[i]) * (x[i+1]-x[i])+(y[i+1]-y[i]) * (y[i+1]-y[i]));



       }

       //sumar N -1 longitudes
       double totalLength = 0;
       for (int i = 0; i < nPoints -1; i++)
        totalLength += l[i];
    //regresar la suma
    return totalLength;
    
    




    } 
    public static void main(String args []) {
       // datos   Intervalo [a, b], n
       double a = 0;
       double b = Math.PI;
       int N = 5;
       
       // crear un objeto que calcule distancia
       FunctionDistance fd = new FunctionDistance(a, b, n); 
       double totalLength = fd.compute();
       System.out.println ("totalLenght"+ totalLength);
    }    

}  
