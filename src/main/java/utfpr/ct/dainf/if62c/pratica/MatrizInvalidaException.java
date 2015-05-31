/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Julio
 */
public class MatrizInvalidaException extends Exception{
        private final int a;
        private final int b;

    public MatrizInvalidaException(int a, int b) {
        super(String.format(
            "Matriz de %d Linhas e %d Colunas não pode ser criada",a,b));
        this.a = a;
        this.b = b;
    }

    public int getNumLinhas() {
        return a;
    }

    public int getNumColunas() {
        return b;
    }    
}

    

