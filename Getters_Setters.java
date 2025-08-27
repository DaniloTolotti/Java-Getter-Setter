package getters_setters;

/**
 *
 * @author danilo.alonso_uscson
 */
public class Getters_Setters {

    
    public static void main(String[] args) {
        Conta conta1 = new Conta("Danilo", 1234, 123456789, 2000);
        Conta conta2 = new Conta("Fábio", 4321, 987654321, 3000);
        
        conta1.setsaldo(4000);
        System.out.println("O saldo da 1 conta é: " +conta1.getsaldo());
    }
    
}
