/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author woich
 */
public class InvalidGetEx extends RuntimeException{
    
    private final int i;

    public int getI() {
        return this.i;
    }
    
    public InvalidGetEx(int i){
        super("get("+i+"): índice inválido");
        this.i=i;
    }
    
}
