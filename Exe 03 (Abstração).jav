//Main.java

import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
		Cliente henrique = new Cliente();
		
		henrique.setNome("Henrique Grecco");
		henrique.setCpf("8391830-1239");
		henrique.setEnderecos(new ArrayList<Endereco>());
		
		Endereco end1 = new Endereco();
		end1.setCep("103288-349");
		
		Endereco end2 = new Endereco();
		end2.setCep("204374-030");
		
		henrique.getEnderecos().add(end1);
		henrique.getEnderecos().add(end2);
		
		System.out.println("Meu nome é " + henrique.getNome() + "!");
		System.out.println("Meu endereços são:");
		
		for (Endereco endereco : henrique.getEnderecos()){
		    System.out.println(endereco.getCep());
		}
		
		//for (int i = 0; i < henrique.getEnderecos().size(); i++){
		    //System.out.println(henrique.getEnderecos().get(i).getCep());
		//}
	}
}

//Endereco.java

class Endereco{
    
    private String logradouro;
    private String cep;
    private String numero;
    
    public String getLogradouro(){
        return logradouro;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
}

//Cliente.java

import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private String cpf;
    private ArrayList<Endereco> enderecos;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public ArrayList<Endereco> getEnderecos(){
        return enderecos;
    }
    
    public void setEnderecos(ArrayList<Endereco> enderecos){
        this.enderecos = enderecos;
    }
}
