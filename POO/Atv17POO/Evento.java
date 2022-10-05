package Atv17POO;

import java.sql.Time;
import java.util.Date;

public class Evento {
    private String nome;
    private String descricao;
    private Time horaInicio;
    private Time horaFim;
    private Date dataInicio;
    private Date dataFim;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Time getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Time getHoraFim() {
        return horaFim;
    }
    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataFim() {
        return dataFim;
    }
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    public void compartilharEvento(){
        System.out.println("Clsse: Evento");
        System.out.println("Método: compartilharEvento");
    }
}
