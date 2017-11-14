
import utfpr.ct.dainf.pratica.PoligonalFechada;
import utfpr.ct.dainf.pratica.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica {
    public static void main(String[] args) {
        PoligonalFechada<PontoXZ> poligono =  new PoligonalFechada<>();
        poligono.set(0, new PontoXZ(-3,2));
        poligono.set(1, new PontoXZ(-3,6));
        poligono.set(2, new PontoXZ(0,2));
        System.out.println("Comprimento da poligonal = "+poligono.getComprimento());
    }
}