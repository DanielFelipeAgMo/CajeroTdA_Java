
package clases;

/**
 *
 * @author Daniel
 */
public class ClaseHija_Consulta extends ClasePadre{
    
    @Override
    public void Transacciones(){
        System.out.println("###################################");
        System.out.println("TU SALDO ACTUAL ES: "+ getSaldo());
        System.out.println("###################################");        
    }
    
}
