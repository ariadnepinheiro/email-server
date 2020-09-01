// Resolução da AD1 2020.2 - Prog. Orientada a Objetos - TSC/UFF
// @author ARIADNE GONÇALVES PINHEIRO
// Matrícula: 19113050151
// Pólo: Duque de Caxias
// @date 26/08/2020

package classes;

public class ServidorEmails {

    CaixaPostal[] caixaPostal = new CaixaPostal[4];
    String nome;
    Email email;
    int i = 0;

    public void adicionaCaixa(CaixaPostal user) {
    while (i < caixaPostal.length) {
        caixaPostal[i] = user;
        i++;
        break;
    }
    }

    public void enviaEmail(Email e1) {
    email = e1;

    for (int i = 0; i < caixaPostal.length; i++) {
        for (int j = 0; j < email.destinatarios.length; j++) {
            if (caixaPostal[i].nome == email.destinatarios[j]) {
                caixaPostal[i].email = email;
            }
        }
    }
    }

    public void encaminhaEmail(Email e1, String nome) {
    this.nome = nome;
    this.email = e1;
        
    for(int i=0; i < caixaPostal.length; i++) {
		if (caixaPostal[i].nome == this.nome) {
            caixaPostal[i].email = email;
        }
    }
    }
}