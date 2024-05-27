package estabelecimento;

import Multifuncional.Multifuncional;
import impressora.*;
import copiadora.*;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora = new Multifuncional();
        impressora.imprimir();
    }
}
