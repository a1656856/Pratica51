import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;

import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) {
      
        try {
        
            Matriz mat1 = new Matriz(3, 3);
        Matriz mat2 = new Matriz(3, 3);
        Matriz mat3 = new Matriz(1, 3);
        Matriz mat5 = new Matriz(0, 3);

     
        double[][] m1 = mat1.getMatriz();
        double[][] m2 = mat2.getMatriz();
        double[][] mS = mat3.getMatriz();
        
        m1[0][0] = 1.0;
        m1[0][1] = 1.0;
        m1[0][2] = 1.0;
        m1[1][0] = 1.0;
        m1[1][1] = 1.0;
        m1[1][2] = 1.0;
        m1[2][0] = 1.0;
        m1[2][1] = 1.0;
        m1[2][2] = 1.0;
        
        m2[0][0] = 2.0;
        m2[0][1] = 2.0;
        m2[0][2] = 2.0;
        m2[1][0] = 2.0;
        m2[1][1] = 2.0;
        m2[1][2] = 2.0;
        m2[2][0] = 2.0;
        m2[2][1] = 2.0;
        m2[2][2] = 2.0;
        
        mS[0][0] = 2.0;
        mS[0][1] = 2.0;
        mS[0][2] = 2.0;
        
    

        Matriz soma = mat1.soma(mat2);
        Matriz errada = mat1.soma(mat3);

        Matriz produto = mat1.prod(mat2);
        Matriz errado = mat3.prod(mat1);

        
        } catch (MatrizInvalidaException | ProdMatrizesIncompativeisException | SomaMatrizesIncompativeisException e) 
        {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
