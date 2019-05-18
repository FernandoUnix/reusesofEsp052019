package com.decorator.decorator;

public class App 
{
    public static void main( String[] args )
    {
        IPrato prato = new PratoA();
        IPrato pratoB = new PratoB();
        
        prato = new Ovo(prato);
        prato = new Ovo(prato);
        prato = new Cebola(prato);
        
        System.out.println("prato a : "+prato.getPreco());
        System.out.println("prato b : "+pratoB.getPreco());
    }
}
