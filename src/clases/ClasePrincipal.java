
package clases; 
/**
 *
 * @author Daniel
 */
public class ClasePrincipal {
    
    
    public static void main(String[]args){
                    
        ClasePadre comunica = new ClaseHija_Consulta();
        comunica.setSaldo(100000);
        comunica.Operaciones();
    }
    
}
