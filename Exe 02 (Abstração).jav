Main.java

public class Main
{
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.setSaldo(100);
		
		minhaConta.sacar(10);
		minhaConta.sacar(50);
		minhaConta.depositar(10);
		
		System.out.println(minhaConta.getSaldo());
	}
}

Conta.java

public class Conta {
    private float saldo;
    
    public void depositar(float valor){
        saldo += valor;
    }
    
    public void sacar(float valor){
        saldo -= valor;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float valor){
        saldo = valor;
    }
}
