
import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.*;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) {
      
         try{
             
        Matriz orig0 = new Matriz(0,3);
        Matriz orig = new Matriz(3,2);
         
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        
        System.out.println("Matriz original: " + orig);
    
        
        Matriz A = new Matriz(3, 1);
        double a[][] = A.getMatriz();
        a[0][0] = 0.0;
      
        a[1][0] = 1.0;
  
        a[2][0] = 2.0;
     
   
        System.out.println("Matriz A: " + A);

        Matriz B = new Matriz(2, 4);
        double[][] b = B.getMatriz();
        b[0][0] = 0.0;
        b[0][1] = 0.1;
        b[0][2] = 0.2;
        b[0][3] = 0.3;
        b[1][0] = 1.0;
        b[1][1] = 1.1;
        b[1][2] = 1.2;
        b[1][3] = 1.3;       
        System.out.println("Matriz B: " + B);
        
        Matriz C;
        C = B.soma(A);
        System.out.println("Matriz original + B: " + C);
        
        C = A.prod(B);
        System.out.println("A x B: " + C);
    } catch(MatrizInvalidaException | ProdMatrizesIncompativeisException | SomaMatrizesIncompativeisException e){
        System.out.println(e);
    } 
    }
}
