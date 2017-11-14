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
public class PoligonalFechada<T extends Ponto2D> extends Poligonal{
    
    @Override
    public double getComprimento(){
        if(getN()>0){
            return super.getComprimento() + get(0).dist(get(getN()-1));
        }
        else{
            return 0;
        }
    }
    
}
