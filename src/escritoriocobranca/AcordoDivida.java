/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritoriocobranca;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
class AcordoDivida {
    
    private Divida divida;
    private FormaDePagamento formaDePagamento;
    private Double valorTotal;
    
    public AcordoDivida(Divida divida, FormaDePagamento formaDePagamento) {
        this.divida = divida;
        this.setFormaDePagamento(formaDePagamento);
        
    }
    
    public Divida getDivida() {
        return divida;
    }
    
    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }
    
    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
        setValorTotal();
        
    }
    
    private void setValorTotal() {
        this.valorTotal = this.divida.getValorDivida() * (1 + this.formaDePagamento.getTaxaCobranca());
        
        /*
        if (this.formaDePagamento.equals(formaDePagamento.CREDITO)) {
            this.valorTotal = this.divida.getValorDivida() * (1 + 0.15);
        } else if (this.formaDePagamento.equals(formaDePagamento.BOLETO)) {
            this.valorTotal = this.divida.getValorDivida() * (1 + 0.10);
        } else if (this.formaDePagamento.equals(formaDePagamento.DEBITO)) {
            this.valorTotal = this.divida.getValorDivida() * (1 + 1.05);
        } else {
            this.valorTotal = this.divida.getValorDivida() * (1 + 0.5);
        }*/
    }
    
    public Double getValorTotal() {
        return valorTotal;
    }
    
}
