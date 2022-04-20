/*

 */
package clases;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public abstract class ClasePadre {
    
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;
        do{
        
            do{
                System.out.println("   EL BANCO DEL TdeA  ");
                System.out.println("  LE DA LA BIENVENIDA ");
                System.out.println("----------ATM----------");
                System.out.println("Selecciona una opción");
                System.out.println("------------------------");
                System.out.println("    1. Consultar saldo  ");
                System.out.println("    2. Retiro           ");
                System.out.println("    3. Depósito         ");
                System.out.println("    4. Salir            ");
                System.out.println("------------------------");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4){
                    bandera = 1;    
                }else{
                    System.out.println("////////////////////////");
                    System.out.println("!!Opción no disponible¡¡");
                    System.out.println("Ingresa una opción valida");
                    System.out.println("/////////////////////////");
                }
            }while(bandera == 0);
            
            if(seleccion == 1){
                ClasePadre comunica = new ClaseHija_Consulta();
                comunica.Transacciones();
            }else if(seleccion == 2){
                ClasePadre comunica = new ClaseHija_Retiro();
                comunica.Transacciones();
            }else if(seleccion == 3){
                ClasePadre comunica = new ClaseHija_Deposito();
                comunica.Transacciones();
            }else if(seleccion == 4){
                System.out.println("*******************************");
                System.out.println("****!GRACIAS POR ELEGIRNOS¡****");
                System.out.println("*******!!VUELVE PRONTO¡¡*******");
                System.out.println("*******************************");
                bandera = 2;
            }
    
        }while(bandera != 2);
    }
    
    //Solicitar cantidad del retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    //Solicitar depósito
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //Metodo abstracto
    public abstract void Transacciones();
    
    //Métodos setters y getters
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
        
    }
    
   
    

}