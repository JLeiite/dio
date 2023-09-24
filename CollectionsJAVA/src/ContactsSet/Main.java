package ContactsSet;

public class Main {
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Daphne Definy Dolphing", 1105);
        agendaContato.adicionarContato("Kim Seokjin", 1192);
        agendaContato.adicionarContato("Kim Namjoon", 1994);
        agendaContato.adicionarContato("Min Yoongi", 1193);
        agendaContato.adicionarContato("Jung Hoseok", 1193);
        agendaContato.adicionarContato("Park Jimin", 1195);
        agendaContato.adicionarContato("Kim Taehyung", 1295);
        agendaContato.adicionarContato("Jung Jungkook", 1997);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Kim"));
        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Min Yoongi", 1993));

        agendaContato.exibirContato();
    }
}
