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
        lojaDoBairro.setCnpj("Loja do Bairro");
        lojaDoBairro.setCnpj("90.595.977/0001-91");
        PessoaFisica joao = new PessoaFisica();
        joao.setNome("João");
        joao.setCpf("982.258.330-31");
        joao.setDataNascimento("15/11/1999");
        

        //Divida divida = Divida(nomeEMpresaQueEstaCobrando, nomeDevedor, valorDivida);
    }

}
