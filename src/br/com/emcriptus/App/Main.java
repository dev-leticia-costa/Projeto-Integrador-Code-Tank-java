package br.com.emcriptus.App;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){

            Interface.telaInicial();
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    contaPoupanca();
                case 2:
                    contaCorrente();
                case 3:
                    contaEspecial();
                case 4:
                    contaEmpresa();
                case 5:
                    contaEstudantil();
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void contaPoupanca(){
        System.out.println("CONTA POUPANÇA");
    }

    public static void contaCorrente(){
        System.out.println("CONTA CORRENTE");
    }

    public static void contaEspecial(){
        System.out.println("CONTA ESPECIAL");
    }

    public static void contaEmpresa(){
        System.out.println("CONTA EMPRESA");
    }

    public static void contaEstudantil(){
        System.out.println("CONTA ESTUDANTIL");
    }


}