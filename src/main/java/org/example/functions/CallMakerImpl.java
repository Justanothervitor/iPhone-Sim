package org.example.functions;

public class CallMakerImpl implements CallMaker{

    @Override
    public void makeACall(String number) {
        System.out.println("Fazendo uma ligacao para o numero "+number);
    }

    @Override
    public void attend() {
        System.out.println("Voce atendeu a uma ligacao!");
    }

    @Override
    public void initializeVoicemail() {
        System.out.println("Iniciando o correio de voz");
    }
}
