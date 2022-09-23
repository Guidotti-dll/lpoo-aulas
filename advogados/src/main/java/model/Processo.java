package model;

import java.util.Date;
import java.util.List;

public class Processo {
    private long numeroProcesso;
    private Date aberturaProcesso;
    private Date conclusaoProcesso;
    private String descricaoProcesso;
    private Situacao situacao;

    private List<Advogado> advogados;
    private List<Pessoa> pessoas;

    public Processo() {
    }

    public Processo(long numeroProcesso, Date aberturaProcesso, Date conclusaoProcesso, String descricaoProcesso, Situacao situacao, List<Advogado> advogados, List<Pessoa> pessoas) {
        this.numeroProcesso = numeroProcesso;
        this.aberturaProcesso = aberturaProcesso;
        this.conclusaoProcesso = conclusaoProcesso;
        this.descricaoProcesso = descricaoProcesso;
        this.situacao = situacao;
        this.advogados = advogados;
        this.pessoas = pessoas;
    }

    public long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Date getAberturaProcesso() {
        return aberturaProcesso;
    }

    public void setAberturaProcesso(Date aberturaProcesso) {
        this.aberturaProcesso = aberturaProcesso;
    }

    public Date getConclusaoProcesso() {
        return conclusaoProcesso;
    }

    public void setConclusaoProcesso(Date conclusaoProcesso) {
        this.conclusaoProcesso = conclusaoProcesso;
    }

    public String getDescricaoProcesso() {
        return descricaoProcesso;
    }

    public void setDescricaoProcesso(String descricaoProcesso) {
        this.descricaoProcesso = descricaoProcesso;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public List<Advogado> getAdvogados() {
        return advogados;
    }

    public void setAdvogados(List<Advogado> advogados) {
        this.advogados = advogados;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "numeroProcesso=" + numeroProcesso +
                ", aberturaProcesso=" + aberturaProcesso +
                ", conclusaoProcesso=" + conclusaoProcesso +
                ", descricaoProcesso='" + descricaoProcesso + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}
