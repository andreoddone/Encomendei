import java.util.ArrayList;
import java.util.List;

public class SistemaEncomendas {
    private List<Encomenda> encomendas;

    public SistemaEncomendas() {
        this.encomendas = new ArrayList<>();
    }

    // Registrar uma nova encomenda
    public void registrarEncomenda(Encomenda encomenda) {
        encomendas.add(encomenda);
        System.out.println("Encomenda registrada com sucesso: " + encomenda.getCodigoRastreio());
    }

    // Consultar todas as encomendas
    public void listarEncomendas() {
        if (encomendas.isEmpty()) {
            System.out.println("Nenhuma encomenda registrada.");
        } else {
            System.out.println("Encomendas Registradas:");
            for (Encomenda e : encomendas) {
                System.out.println(e);
            }
        }
    }

    // Buscar uma encomenda pelo código de rastreio
    public Encomenda buscarEncomenda(String codigoRastreio) {
        for (Encomenda encomenda : encomendas) {
            if (encomenda.getCodigoRastreio().equals(codigoRastreio)) {
                return encomenda;
            }
        }
        return null;
    }

    // Remover uma encomenda após retirada
    public void removerEncomenda(String codigoRastreio) {
        Encomenda encomenda = buscarEncomenda(codigoRastreio);
        if (encomenda != null) {
            encomendas.remove(encomenda);
            System.out.println("Encomenda removida: " + codigoRastreio);
        } else {
            System.out.println("Encomenda não encontrada: " + codigoRastreio);
        }
    }
