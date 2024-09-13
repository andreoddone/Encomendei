public class SistemaNotificacao {
    public static void notificarMorador(Morador morador, Encomenda encomenda) {
        System.out.println("Notificação: Encomenda " + encomenda.getCodigoRastreio() + 
                           " chegou para " + morador.getNome() + " no apartamento " + 
                           morador.getApartamento());
    }
}
