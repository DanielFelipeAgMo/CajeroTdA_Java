
package clases;

/**
 *
 * @author Daniel
 */
public class ClaseHija_Deposito extends ClasePadre {
        
    @Override
    public void Transacciones(){
        System.out.println("///////////////////////////////////");
        System.out.print("     ¿CUÁNTO DESEAS DEPOSITAR?:    ");
        System.out.println("///////////////////////////////////");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------$$$----------------");
        System.out.println("TU NUEVO SALDO ES : " + getSaldo()+" PESOS");
        System.out.println("---------------$$$----------------");
             
    }
    
}
