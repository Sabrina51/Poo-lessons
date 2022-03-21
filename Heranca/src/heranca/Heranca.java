package heranca;

public class Heranca {

    public static void main(String[] args) {
        Regular alunoRegular = new Regular(10.0, 6.0, "Maria", "12345-09", "202028370-1");
        Assistente alunoAssistente = new Assistente(9, "Izabel", "01219-03", "202095863-2");

        alunoRegular.print();
        alunoAssistente.print();
    }
}
