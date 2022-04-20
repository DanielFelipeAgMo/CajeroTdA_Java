
package clases;

/**
 *
 * @author Daniel
 */
public class ClaseHija_Retiro extends ClasePadre {
    
    @Override
    public void Transacciones(){
        System.out.println("###################################");
        System.out.println("     ¿CUÁNTO DESEAS RETIRAR?:      ");
        System.out.println("###################################");
        Retiro();
        if(retiro <= getSaldo()){
           transacciones = getSaldo();
           setSaldo(transacciones - retiro);
           System.out.println("###################################");
           System.out.println("     ACABAS DE RETIRAR: "+ retiro +" PESOS");
           System.out.println("///////////////////////////////////");
           System.out.println("///////////////////////////////////");
           System.out.println("   TU NUEVO SALDO ES: " + getSaldo() + " PESOS");
           System.out.println("###################################");
           
        }else{
            System.out.println("----------------$$$----------------");
            System.out.println("       FONDOS INSUFICIENTES        ");
            System.out.println("----------------$$$----------------");
        }        
    }
    
}
