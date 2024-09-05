public class Main {
    public static void main(String[] args) {
        SistemaEncomendas sistemaEncomendas = new SistemaEncomendas();
        Menu menu = new Menu(sistemaEncomendas);
        menu.exibirMenu();
    }
}
