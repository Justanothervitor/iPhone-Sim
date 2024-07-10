package org.example;

import org.example.functions.CallMakerImpl;
import org.example.functions.MusicPlayerImpl;
import org.example.functions.WebNavigatorImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("Bem vindo ao simulador de iPhone:");
            System.out.println("Escolha uma opcao:");
            System.out.println("[1] - Usar o aplicativo de musica");
            System.out.println("[2] - Usar o aplicativo de chamadas");
            System.out.println("[3] - Usar o aplicativo de navegador de internet");
            System.out.println("[4] - Desligar a tela do telefone/Parar o programa");
            System.out.print("Sua opcao:");
            opcao = sc.nextInt();
            switch(opcao)
            {
                case 1:
                    execCase1(sc,new MusicPlayerImpl());
                    break;

                case 2:
                    execCase2(sc,new CallMakerImpl());
                    break;

                case 3:
                    execCase3(sc,new WebNavigatorImpl());
                    break;

                case 4:
                    System.out.println("Desligando a tela do iPhone");
                    break;
            }
        }while(opcao !=4);

        sc.close();
    }

     static void execCase1(Scanner sc,MusicPlayerImpl func)
    {
        int opcao = 0;
        do{
            System.out.println("Bem vindo ao aplicativo de musica!");
            System.out.println("Escolha uma opcao:");
            System.out.println("[1] - Escolher uma musica");
            System.out.println("[2] - Tocar uma musica");
            System.out.println("[3] - Pausar a musica");
            System.out.println("[4] - Sair do aplicativo");
            System.out.print("Sua opcao:");
            opcao = sc.nextInt();
            switch(opcao)
            {
                case 1:
                    System.out.println("Digite o nome da musica");
                    sc.nextLine();
                    func.selectAMusic(sc.nextLine());
                    break;

                case 2:
                    func.play();
                    break;

                case 3:
                    func.stop();
                    break;

                case 4:
                    System.out.println("Saindo do aplicativo de musica");
                    break;

            }
        }while(opcao != 4);
    }
    static void execCase2(Scanner sc,CallMakerImpl func)
    {
        int opcao = 0;
        do{
            System.out.println("Bem vindo ao aplicativo de chamadas!");
            System.out.println("Escolha uma opcao:");
            System.out.println("[1] - Fazer uma ligacao");
            System.out.println("[2] - Atender uma ligacao");
            System.out.println("[3] - Inicializar o correio de voz");
            System.out.println("[4] - Sair do aplicativo");
            System.out.print("Sua opcao:");
            opcao = sc.nextInt();
            switch(opcao)
            {
                case 1:
                    System.out.println("Digite o numero para fazer a ligacao");
                    sc.nextLine();
                    func.makeACall(sc.nextLine());
                    break;

                case 2:
                    func.attend();
                    break;

                case 3:
                    func.initializeVoicemail();
                    break;

                case 4:
                    System.out.println("Saindo do aplicativo de Chamadas");
                    break;

            }
        }while(opcao != 4);
    }
    static void execCase3(Scanner sc,WebNavigatorImpl func)
    {
        int opcao = 0;
        do{
            System.out.println("Bem vindo ao aplicativo de navegador Web!");
            System.out.println("Escolha uma opcao:");
            System.out.println("[1] - Acessar um site");
            System.out.println("[2] - Abrir uma nova guia");
            System.out.println("[3] - Fechar uma guia");
            System.out.println("[4] - Sair do aplicativo");
            System.out.print("Sua opcao:");
            opcao = sc.nextInt();
            switch(opcao)
            {
                case 1:
                    System.out.println("Digite o url do site");
                    sc.nextLine();
                    func.showPage(sc.nextLine());
                    break;

                case 2:
                    func.addANewGuide();
                    break;

                case 3:
                    func.closeGuide();
                    break;

                case 4:
                    System.out.println("Saindo do aplicativo de navegador Web");
                    break;

            }
        }while(opcao != 4);
    }
}