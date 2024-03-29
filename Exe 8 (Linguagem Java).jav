public class Main
{
	public static void main(String[] args) {
	    
	Agencia agencia = new Agencia("Agência Central", 1234);
        Conta conta = new Conta(5678, 1000.0);
        Cliente cliente = new Cliente("Fulano", "123.456.789-00", agencia, conta);
        CartaoCredito cartao1 = new CartaoCredito(1111, 2000.0);
        CartaoCredito cartao2 = new CartaoCredito(2222, 3000.0);
        cliente.addCartaoCredito(cartao1);
        cliente.addCartaoCredito(cartao2);
        
        System.out.println(cliente.toString());
	}
}

--------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private Agencia agencia;
    private Conta conta;
    private List<CartaoCredito> cartoesCredito;

    public Cliente(String nome, String cpf, Agencia agencia, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.conta = conta;
        this.cartoesCredito = new ArrayList<>();
    }

    public void addCartaoCredito(CartaoCredito cartao) {
        cartoesCredito.add(cartao);
    }
    
    public String toString() {
    return "Cliente [nome=" + nome + ", cpf=" + cpf + ", agencia=" + agencia + ", conta=" + conta + ", cartoesCredito="
            + cartoesCredito + "]";
    }
}

----------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nome;
    private int numero;

    public Agencia(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
}

----------------------------------------------------------------------------------------

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}

----------------------------------------------------------------------------------------

public class CartaoCredito {
    private int numero;
    private double limite;

    public CartaoCredito(int numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }
}
