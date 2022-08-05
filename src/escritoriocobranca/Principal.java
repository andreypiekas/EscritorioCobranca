package escritoriocobranca;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */

/*  --escopo
    Pessoa que vai ser cobrada
    Pessoa que esta cobrando
    Valor de uma divida
    Acordo a ser feito com as partes
    Forma de pagamento
    Valor a ser cobrado = valor original + taxa

 */
public class Principal {

    public static void main(String[] args) {

        PessoaJuridica lojaDoBairro = new PessoaJuridica();
        lojaDoBairro.setNome("Loja do Bairro");
        lojaDoBairro.setCnpj("90.595.977/0001-91");
        PessoaFisica joao = new PessoaFisica();
        joao.setNome("João");
        joao.setCpf("982.258.330-31");
        joao.setDataNascimento("15/11/1999");

        Divida divida = new Divida(lojaDoBairro, joao, 1000.00);
        System.out.println("Nome: " + divida.getDevedora().getDocumento());

        AcordoDivida acordoDivida = new AcordoDivida(divida, FormaDePagamento.BOLETO);
        System.out.println("---- Dados Devedor: ");
        System.out.println("Nome: " + acordoDivida.getDivida().getDevedora().getNome());
        System.out.println("Data Nascimento: " + acordoDivida.getDivida().getDevedora().getDataFormatada());
        System.out.println("Documento: " + acordoDivida.getDivida().getDevedora().getDocumento());
        System.out.println("---- Dados Cobrador: ");
        System.out.println("Nome: " + acordoDivida.getDivida().getCobradora().getNome());
        System.out.println("Documento: " + acordoDivida.getDivida().getCobradora().getDocumento());

        System.out.println("Valor da divida: " + acordoDivida.getDivida().getValorDivida());
        System.out.println("Forma de pagamento: " + acordoDivida.getFormaDePagamento().name());
        System.out.println("Valor Total: " + acordoDivida.getValorTotal());
    }

}
