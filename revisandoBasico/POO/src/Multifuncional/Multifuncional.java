package Multifuncional;

import copiadora.Copiadora;
import digializadora.Digitalizadora;
import impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO MULTIFUNCIONAL");
    }

    @Override
    public void copiar() {
        System.out.println("COPIANDO MULTIFUNCIONAL");
    }
    
}
