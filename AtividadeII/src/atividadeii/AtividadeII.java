
package atividadeii;

public class AtividadeII {

    public static void main(String[] args) {
        
        
        Curso curso1 = new Curso("Engenharia de Software", 404);
        
        Professor prof = new Professor("Ingrid Batista", 25, "Tecnicas de Programacao"); 
        
        Endereco end1 = new Endereco("Rua das Lindezas", 108, "SP");
        Endereco end2 = new Endereco("Av. Agua Espraiada", 007, "SP");

        Aluno aluno1 = new Aluno("Julio Lima", 21, "5076412", end1);
        aluno1.addCurso(curso1);
        
        Aluno aluno2 = new Aluno("Maria Clara", 19, "5251482", end2);
        aluno2.addCurso(curso1);

        System.out.println(prof);
        System.out.println();
        System.out.println(curso1);
        System.out.println();
        System.out.println(aluno1);
        System.out.println();
        System.out.println(aluno2);
    }
    
}
