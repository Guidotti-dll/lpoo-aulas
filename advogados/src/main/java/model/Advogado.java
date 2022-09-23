package model;

import java.util.List;

public class Advogado {
    private long oabAdvogado;
    private String nomeAdvogado;
    private String enderecoAdvogado;
    private String telefoneAdvogado;
    private String bairroAdvogado;
    private String cepAdvogado;
    private String emailAdvogado;

    private List<Processo> processos;

    public Advogado() {
    }

    public Advogado( String nomeAdvogado, String enderecoAdvogado, String telefoneAdvogado, String bairroAdvogado, String cepAdvogado, String emailAdvogado) {
        this.nomeAdvogado = nomeAdvogado;
        this.enderecoAdvogado = enderecoAdvogado;
        this.telefoneAdvogado = telefoneAdvogado;
        this.bairroAdvogado = bairroAdvogado;
        this.cepAdvogado = cepAdvogado;
        this.emailAdvogado = emailAdvogado;
    }
    public Advogado(long oabAdvogado, String nomeAdvogado, String enderecoAdvogado, String telefoneAdvogado, String bairroAdvogado, String cepAdvogado, String emailAdvogado, List<Processo> processos) {
        this.oabAdvogado = oabAdvogado;
        this.nomeAdvogado = nomeAdvogado;
        this.enderecoAdvogado = enderecoAdvogado;
        this.telefoneAdvogado = telefoneAdvogado;
        this.bairroAdvogado = bairroAdvogado;
        this.cepAdvogado = cepAdvogado;
        this.emailAdvogado = emailAdvogado;
        this.processos = processos;
    }

    public long getOabAdvogado() {
        return oabAdvogado;
    }

    public void setOabAdvogado(long oabAdvogado) {
        this.oabAdvogado = oabAdvogado;
    }

    public String getNomeAdvogado() {
        return nomeAdvogado;
    }

    public void setNomeAdvogado(String nomeAdvogado) {
        this.nomeAdvogado = nomeAdvogado;
    }

    public String getEnderecoAdvogado() {
        return enderecoAdvogado;
    }

    public void setEnderecoAdvogado(String enderecoAdvogado) {
        this.enderecoAdvogado = enderecoAdvogado;
    }

    public String getTelefoneAdvogado() {
        return telefoneAdvogado;
    }

    public void setTelefoneAdvogado(String telefoneAdvogado) {
        this.telefoneAdvogado = telefoneAdvogado;
    }

    public String getBairroAdvogado() {
        return bairroAdvogado;
    }

    public void setBairroAdvogado(String bairroAdvogado) {
        this.bairroAdvogado = bairroAdvogado;
    }

    public String getCepAdvogado() {
        return cepAdvogado;
    }

    public void setCepAdvogado(String cepAdvogado) {
        this.cepAdvogado = cepAdvogado;
    }

    public String getEmailAdvogado() {
        return emailAdvogado;
    }

    public void setEmailAdvogado(String emailAdvogado) {
        this.emailAdvogado = emailAdvogado;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    @Override
    public String toString() {
        return "Advogado {" +
                "oabAdvogado=" + oabAdvogado +
                ", nomeAdvogado='" + nomeAdvogado + '\'' +
                ", enderecoAdvogado='" + enderecoAdvogado + '\'' +
                ", telefoneAdvogado='" + telefoneAdvogado + '\'' +
                ", bairroAdvogado='" + bairroAdvogado + '\'' +
                ", cepAdvogado='" + cepAdvogado + '\'' +
                ", emailAdvogado='" + emailAdvogado + '\'' +
                '}';
    }
}
