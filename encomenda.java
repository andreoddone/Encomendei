import java.time.LocalDate;

public class Encomenda {
    private String codigoRastreio;
    private Morador destinatario;
    private LocalDate dataChegada;

    public Encomenda(String codigoRastreio, Morador destinatario) {
        this.codigoRastreio = codigoRastreio;
        this.destinatario = destinatario;
        this.dataChegada = LocalDate.now(); // Data da encomenda como o dia atual
    }

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public Morador getDestinatario() {
        return destinatario;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    @Override
    public String toString() {
        return "Encomenda: " + codigoRastreio + " | Destinatário: " + destinatario.getNome() + 
               " | Apartamento: " + destinatario.getApartamento() + 
               " | Data de Chegada: " + dataChegada;
    }
}
