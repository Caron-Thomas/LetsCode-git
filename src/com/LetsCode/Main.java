package com.LetsCode;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String [][] tabuleiro = new String[3][3];
    boolean jogoEmAndamento = true;
    int numeroJogada = 0;

    String jogadorVencedor = "";


    tabuleiro = PreencherTabuleiro(tabuleiro);

        while(jogoEmAndamento) {

            InstruirOJogador();
            ImprimirTabuleiro(tabuleiro);
            tabuleiro = PreecherJogada(tabuleiro, numeroJogada);
            jogadorVencedor = DeclararVencedor(tabuleiro, jogadorVencedor);
            jogoEmAndamento = EncerrarJogo(jogadorVencedor, jogoEmAndamento, numeroJogada, tabuleiro);
            numeroJogada = ContadorJogadas(numeroJogada);
        }
    }


    public static String [][] PreencherTabuleiro(String[][] tabuleiro){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = "_";
            }
        }
        return tabuleiro;
    }

    public static void InstruirOJogador(){
        System.out.println("Digite a posiçao em que deseja jogar conforme o tabuleiro abaixo: ");
    }

    public static void ImprimirTabuleiro(String [][] tabuleiro){

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf(tabuleiro[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static String [][] PreecherJogada(String[][] tabuleiro, int numeroJogada){
        String posicao;
        Scanner sc = new Scanner(System.in);
        String jogada = sc.nextLine();
        int primeiroDigitoJogada = Character.getNumericValue(jogada.charAt(0));
        int segundoDigitoJogada = Character.getNumericValue(jogada.charAt(1));

        //novocomentario


        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                posicao = i+""+j;
                if (jogada.equals(posicao)){
                    if(tabuleiro[i][j].equals("_")) {
                        ContadorJogadas(numeroJogada);
                        if (numeroJogada % 2 != 0) {
                            tabuleiro[i][j] = "X";
                        } else {
                            tabuleiro[i][j] = "O";
                        }
                    }else{
                        System.out.println("Posiçao já ocupada, tente novamente.");
                    }
                }
            }
        }
        ValidarJogada(primeiroDigitoJogada, segundoDigitoJogada);

        return tabuleiro;
    }

    public static int ContadorJogadas(int numeroJogada){
        numeroJogada ++;

        return numeroJogada;
    }

    public static void ValidarJogada(int primeiroDigitoJogada, int segundoDigitoJogada){
        if(primeiroDigitoJogada > 2 || segundoDigitoJogada > 2){
            System.out.println("Posiçao inválida, jogue novamente");
        }
    }

    public static String DeclararVencedor(String[][] tabuleiro, String jogadorVencedor ){


        for (int i = 0; i < tabuleiro.length; i++) {
            if(tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][0].equals(tabuleiro[i][2])){
                jogadorVencedor = tabuleiro[i][0];

            }
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            if(tabuleiro[0][i].equals(tabuleiro[1][i]) && tabuleiro[0][i].equals(tabuleiro[2][i])){
                jogadorVencedor = tabuleiro[0][i];

            }
        }

        if(tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])){
            jogadorVencedor = tabuleiro[0][0];

        }

        if(tabuleiro[2][0].equals(tabuleiro[1][1]) && tabuleiro[2][0].equals(tabuleiro[0][2])){
            jogadorVencedor = tabuleiro[2][0];

        }
        return jogadorVencedor;

    }

    public static boolean EncerrarJogo(String jogadorVencedor, boolean jogoEmAndamento, int numeroJogada, String[][] tabuleiro){

        if(jogadorVencedor.equals("X") || jogadorVencedor.equals("O")){
            jogoEmAndamento = false;
            System.out.printf("FIM DE JOGO!");
            System.out.printf("O %s VENCEU!", jogadorVencedor);
            System.out.println();
        }
        if(numeroJogada == 9){
            System.out.println("FIM DE JOGO!");
            System.out.println("Deu velha!");
        }
        ImprimirTabuleiro(tabuleiro);
    return jogoEmAndamento;
    }
}
