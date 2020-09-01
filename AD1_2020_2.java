// Resolução da AD1 2020.2 - Prog. Orientada a Objetos - TSC/UFF
// @author ARIADNE GONÇALVES PINHEIRO
// Matrícula: 19113050151
// Pólo: Duque de Caxias
// @date 26/08/2020

import classes.ServidorEmails;
import classes.CaixaPostal;
import classes.Email;

public class AD1_2020_2 {
    public static void main(final String[] args) {
        final ServidorEmails servidor = new ServidorEmails();
        final CaixaPostal fulano = new CaixaPostal("Fulano");
        final CaixaPostal sicrano = new CaixaPostal("Sicrano");
        final CaixaPostal beltrano = new CaixaPostal("Beltrano");
        final CaixaPostal outrano = new CaixaPostal("Outrano");
        servidor.adicionaCaixa(fulano);
        servidor.adicionaCaixa(sicrano);
        servidor.adicionaCaixa(beltrano);
        servidor.adicionaCaixa(outrano);
        final Email e1 = new Email("Fulano",
                                new String[]{"Sicrano", "Beltrano"},
                                "Super importante!",
                                "Retorne-me o quanto antes!");
        servidor.enviaEmail(e1);
        servidor.encaminhaEmail(e1, "Outrano");
        System.out.println(fulano);
        System.out.println(sicrano);
        System.out.println(beltrano);
        System.out.println(outrano);
    }
}