
package atividadeii;

import java.util.List;
import java.util.ArrayList;

public class Aluno extends Pessoas {
    private String RA;
    private String codigoAluno;
    private Endereco endereco;
    private List<Curso> cursos;

    public Aluno() {
        this.cursos = new ArrayList<>();
    }

    public Aluno(String nome, int idade, String RA, Endereco endereco) {
        super(nome, idade);
        this.RA = RA;
        this.endereco = endereco;
        this.cursos = new ArrayList<>();
        this.codigoAluno = gerarCodigoAluno(nome, RA);
    }

    private String gerarCodigoAluno(String nome, String RA) {
        if (nome == null || nome.trim().isEmpty())
            return "_" + RA;
        String[] partes = nome.trim().split("\\s+");
        
        StringBuilder iniciais = new StringBuilder();
            for(String p : partes){
            if(!p.isEmpty()){
                iniciais.append(Character.toUpperCase(p.charAt(0)));
            }
        } 
        return iniciais.toString() + "_" + RA;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
        this.codigoAluno = gerarCodigoAluno(getNome(), RA);
    }

    public String getCodigoAluno() {
        return codigoAluno;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void addCurso (Curso curso) {
        if (curso != null)
            this.cursos.add(curso);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno -> ").append(super.toString())
        .append(", RA: ").append(RA)
        .append(", codigoAluno: ").append(codigoAluno)
        .append("\n Endereco: ").append(endereco)
        .append("\n Cursos: ");
        if(cursos.isEmpty())
            sb.append("Nenhum");
        else {
            for(Curso c : cursos) {
            sb.append("\n  - ").append(c);
            }
        }  
        return sb.toString();
    }
}
