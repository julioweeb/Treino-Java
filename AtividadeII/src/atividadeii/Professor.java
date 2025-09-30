
package atividadeii;

public class Professor extends Pessoas {
    private String especialidade;
    
    public Professor() {}

    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Professor -> " + super.toString() + ", Especialidade: " + especialidade;
    }
  
}
