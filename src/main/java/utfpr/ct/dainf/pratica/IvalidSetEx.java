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
public class IvalidSetEx extends RuntimeException{
    
    private final int i;

    public int getI() {
        return this.i;
    }
    
    public IvalidSetEx(int i){
        super("set("+i+"): índice inválido");
        this.i=i;
    }
    
}
