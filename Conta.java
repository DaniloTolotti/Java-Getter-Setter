package getters_setters;
/**
 *
 * @author danilo.alonso_uscson
 */
public class Conta {
     private String Nome;
     private int senha;
     private long numDocumento;
     private double saldo;
     
     public Conta( String Nome, int senha, long numDocumento, double saldo){
            this.Nome = Nome;
            this.numDocumento = numDocumento;
            this.saldo = saldo;
            this.senha = senha;
     }
     public double getsaldo(){
        return saldo;
    }
     public void setsaldo(double saldo){
         this.saldo = saldo;
     }
}

    