package escritoriocobranca;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Pessoa {
    
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
        
    }
    
    public String getNome() {
        return this.nome;
    }
    
}
