package Atv15POO;

import java.util.ArrayList;
import java.util.Date;

public class Juridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private Date fundacao;

    ArrayList<String> parceiro=new ArrayList<>(1);

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public Date getFundacao() {
        return fundacao;
    }
    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }
}
