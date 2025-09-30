
package atividadeii;

public class Curso {
    private String nome;
    private int codigo;
    
    public Curso() {}

   public Curso (String nome, int codigo){
       this.nome = nome;
       this.codigo = codigo;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + "(Codigo: " + codigo + ")";
    }
    
}
