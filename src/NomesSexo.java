import java.util.ArrayList;
import java.util.List;

public class NomesSexo {

    public static void main(String[] args) {
        addNomesNaLista();
    }

    private static void addNomesNaLista() {
        List<Cadastro> lista = new ArrayList<Cadastro>();

        Cadastro a = new Cadastro( "Everton Silva", "Masculino");
        Cadastro b = new Cadastro( "Luis Souza", "Masculino");
        Cadastro c = new Cadastro( "Maria Silva", "Feminino");
        Cadastro d = new Cadastro( "Kett Silva", "Feminino");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);

        separarPorSexo(lista);

    }

    private static void separarPorSexo(List<Cadastro> lista) {
        List<Cadastro> masculino = new ArrayList<>();
        List<Cadastro> feminino = new ArrayList<>();

        for (Cadastro c : lista) {
            if (c.getSexo().equalsIgnoreCase("Masculino")) {
                masculino.add(c);
            } else if (c.getSexo().equalsIgnoreCase("Feminino")) {
                feminino.add(c);
            }
        }

        System.out.println("Grupo Masculino:");
        for (Cadastro c : masculino) {
            System.out.println(c.getNome());
        }

        System.out.println("\nGrupo Feminino:");
        for (Cadastro c : feminino) {
            System.out.println(c.getNome());
        }
    }

}
