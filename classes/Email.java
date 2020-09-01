// Resolução da AD1 2020.2 - Prog. Orientada a Objetos - TSC/UFF
// @author ARIADNE GONÇALVES PINHEIRO
// Matrícula: 19113050151
// Pólo: Duque de Caxias
// @date 26/08/2020

package classes;

public class Email {

    String remetente;
    String[] destinatarios;
    String assunto;
    String mensagem;

    public Email(String remetente, String[] destinatarios, String assunto, String mensagem) {
    this.remetente = remetente;
    this.destinatarios = destinatarios;
    this.assunto = assunto;
    this.mensagem = mensagem;
    }
}