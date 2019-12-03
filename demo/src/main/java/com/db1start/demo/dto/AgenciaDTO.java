package com.db1start.demo.dto;

public class AgenciaDTO {

    private Long numeroAgencia;
    private Long digitoBanco;
    private String Cidade;

    public Long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Long getDigitoBanco() {
        return digitoBanco;
    }

    public void setDigitoBanco(Long digitoBanco) {
        this.digitoBanco = digitoBanco;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }


}
