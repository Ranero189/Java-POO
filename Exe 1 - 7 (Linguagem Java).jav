//Exercício 1

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int idadeJoao = 10;
		int idadeMaria = 25;
		int idadeMarco = 20;
		double media = (idadeMaria + idadeJoao + idadeMarco)/2;
		
		System.out.println("A media das idades é: " + media);
	}
}

//Exercício 2

O código não compila, pois 3.14 não é um inteiro.

//Exercício 3

public class Main
{
	public static void main(String[] args) {
		
		double pi = 3.14;
		int piParteInteira = (int) pi;
		
		System.out.println("piParteInteira = " + piParteInteira);
	}
}

console -- 

3

//Exercício 4

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        
        System.out.print("Digite o valor de c: ");
        int c = scanner.nextInt();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        double a1 = (-b + Math.sqrt(delta)) / (2 * a);
        double a2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("Delta: " + delta);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        
        scanner.close();
    }
}

//Exercício 5

"Saque realizado com sucesso"

90.0

//Exercício 6

import java.util.Scanner;

public class SituacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();
        
        if (saldo < 0) {
            System.out.println("Você está no vermelho");
        } else if (saldo < 1000000) {
            System.out.println("Você está no azul");
        } else {
            System.out.println("Você está bem demais!");
        }
        
        scanner.close();
    }
}

//Exercício 7

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o expoente: ");
        double expoente = sc.nextDouble();
        double resultado = Math.pow(base, expoente);
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}



