package model;

import java.util.List;

public class Pessoa {
    private String nomePessoa;
    private String enderecoPessoa;
    private String bairroPessoa;
    private String cidadePessoa;
    private String cepPessoa;
    private String ufPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    private List<Processo> processos;

    public Pessoa() {
    }

    public Pessoa(String nomePessoa, String enderecoPessoa, String bairroPessoa, String cidadePessoa, String cepPessoa, String ufPessoa, String telefonePessoa, String emailPessoa) {
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.bairroPessoa = bairroPessoa;
        this.cidadePessoa = cidadePessoa;
        this.cepPessoa = cepPessoa;
        this.ufPessoa = ufPessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
    }



    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getBairroPessoa() {
        return bairroPessoa;
    }

    public void setBairroPessoa(String bairroPessoa) {
        this.bairroPessoa = bairroPessoa;
    }

    public String getCidadePessoa() {
        return cidadePessoa;
    }

    public void setCidadePessoa(String cidadePessoa) {
        this.cidadePessoa = cidadePessoa;
    }

    public String getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(String cepPessoa) {
        this.cepPessoa = cepPessoa;
    }

    public String getUfPessoa() {
        return ufPessoa;
    }

    public void setUfPessoa(String ufPessoa) {
        this.ufPessoa = ufPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", enderecoPessoa='" + enderecoPessoa + '\'' +
                ", bairroPessoa='" + bairroPessoa + '\'' +
                ", cidadePessoa='" + cidadePessoa + '\'' +
                ", cepPessoa='" + cepPessoa + '\'' +
                ", ufPessoa='" + ufPessoa + '\'' +
                ", telefonePessoa='" + telefonePessoa + '\'' +
                ", emailPessoa='" + emailPessoa + '\'' +
                '}';
    }
}
