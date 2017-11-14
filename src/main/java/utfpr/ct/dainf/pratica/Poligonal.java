package utfpr.ct.dainf.pratica;

import java.util.ArrayList;
import java.util.List;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * @param <T> Tipo do ponto
 */
public class Poligonal<T extends Ponto2D> {
    private final List<T> vertices = new ArrayList<>();
    
    public int getN(){
        int numVertice;
        
        numVertice = this.vertices.size();
        
        return numVertice;
    }
    
    
    public T get(int i){
        if(i<0 || i>this.vertices.size()){
            throw new InvalidGetEx(i);
        }
        return this.vertices.get(i);
    }
    
    public void set(int i, T p){
        if(i == vertices.size()){
            vertices.add(p);
        }
        else if(i>=0 && i<vertices.size()){
            vertices.set(i, p);
        }
        else throw new IvalidSetEx(i);
    }

}
