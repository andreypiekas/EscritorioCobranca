package escritoriocobranca;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public abstract class Pessoa {
    
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
        
    }
    
    public String getNome() {
        return this.nome;
    }
    
    
    public abstract String getDocumento();
    public abstract String getDataFormatada();
}
