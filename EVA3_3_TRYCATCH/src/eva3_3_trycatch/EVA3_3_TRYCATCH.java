/*

 */
package eva3_3_trycatch;


public class EVA3_3_TRYCATCH {


    public static void main(String[] args) {
     int x=5, y =0;
     
  try {
      //Sección de código que genera una excepción
      
     int resu = x/y;
        System.out.println("Resultado: "+resu);
  } catch (ArithmeticException e){
      //Se genera un objeto "e"
      
        System.out.println("Excepción: " +e.getMessage());   
      }
        System.out.println("Fin del programa.");
        
    }
    
    
}
