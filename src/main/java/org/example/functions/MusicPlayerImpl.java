package org.example.functions;

public class MusicPlayerImpl implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Agora esta tocando musica!");
    }

    @Override
    public void stop() {
        System.out.println("A musica parou de tocar");
    }

    @Override
    public void selectAMusic(String name) {
        System.out.println("Voce selecionou a musica "+name);
    }
}
