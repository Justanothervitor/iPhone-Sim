package org.example.functions;

public class WebNavigatorImpl implements WebNavigator{

    @Override
    public void showPage(String url) {
        System.out.println("Acessando a pagina com o endereco indicado");
    }

    @Override
    public void addANewGuide() {
        System.out.println("Voce adicionou uma nova guia.");
    }

    @Override
    public void closeGuide() {
        System.out.println("Voce fechou uma guia.");
    }
}
