// Resolução da AD1 2020.2 - Prog. Orientada a Objetos - TSC/UFF
// @author ARIADNE GONÇALVES PINHEIRO
// Matrícula: 19113050151
// Pólo: Duque de Caxias
// @date 26/08/2020

package classes;

public class CaixaPostal {

    String nome;
    Email email;

    public CaixaPostal(String nome) {
    this.nome = nome;
    }

    public String montaDestinatarios() {
    String temp = "Para: [";
    for (final String dest : email.destinatarios) {
        temp += dest + ", ";
    }
    return temp = temp.replaceAll(", $", "]");
    }

// Main
    public String toString() {
    if (email != null) {
        StringBuilder builder =  new StringBuilder();
        builder.append(">>> Caixa Postal de "+nome+" <<<" + "\n");
        builder.append("De: " + email.remetente + "\n");
        builder.append(montaDestinatarios() + "\n");
        builder.append(email.assunto + "\n");
        builder.append(email.mensagem + "\n");
        return builder.toString();
        
    } 
    else {
        return (">>> Caixa Postal de "+nome+" <<<" + "\n");
    }
    }   
}