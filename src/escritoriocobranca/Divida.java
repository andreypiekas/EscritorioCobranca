/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritoriocobranca;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Divida {

    private Pessoa devedora;
    private Pessoa cobradora;
    private Double valorDivida;

    public Divida(Pessoa devedora, Pessoa cobradora, double valorDivida) {
        this.devedora = devedora;
        this.cobradora = cobradora;
        this.valorDivida = valorDivida;
    }

    public Pessoa getDevedora() {
        return devedora;
    }

    public Pessoa getCobradora() {
        return cobradora;
    }

    public Double getValorDivida() {
        return valorDivida;
    }

}
