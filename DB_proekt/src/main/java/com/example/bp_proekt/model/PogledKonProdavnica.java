package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Objects;

public class PogledKonProdavnica {
    private Integer idCode;
    private String imeNaProdukt;
    private Double cenaNaProdukt;
    private Integer preostanataKolicina;
    private String slikaNaProdukt;

    @Basic
    @Column(name = "id_code")
    public Integer getIdCode() {
        return idCode;
    }

    public void setIdCode(Integer idCode) {
        this.idCode = idCode;
    }

    @Basic
    @Column(name = "ime_na_produkt")
    public String getImeNaProdukt() {
        return imeNaProdukt;
    }

    public void setImeNaProdukt(String imeNaProdukt) {
        this.imeNaProdukt = imeNaProdukt;
    }

    @Basic
    @Column(name = "cena_na_produkt")
    public Double getCenaNaProdukt() {
        return cenaNaProdukt;
    }

    public void setCenaNaProdukt(Double cenaNaProdukt) {
        this.cenaNaProdukt = cenaNaProdukt;
    }

    @Basic
    @Column(name = "preostanata_kolicina")
    public Integer getPreostanataKolicina() {
        return preostanataKolicina;
    }

    public void setPreostanataKolicina(Integer preostanataKolicina) {
        this.preostanataKolicina = preostanataKolicina;
    }

    @Basic
    @Column(name = "slika_na_produkt")
    public String getSlikaNaProdukt() {
        return slikaNaProdukt;
    }

    public void setSlikaNaProdukt(String slikaNaProdukt) {
        this.slikaNaProdukt = slikaNaProdukt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PogledKonProdavnica that = (PogledKonProdavnica) o;

        if (!Objects.equals(idCode, that.idCode)) return false;
        if (!Objects.equals(imeNaProdukt, that.imeNaProdukt)) return false;
        if (!Objects.equals(cenaNaProdukt, that.cenaNaProdukt))
            return false;
        if (!Objects.equals(preostanataKolicina, that.preostanataKolicina))
            return false;
        return slikaNaProdukt != null ? slikaNaProdukt.equals(that.slikaNaProdukt) : that.slikaNaProdukt == null;
    }

    @Override
    public int hashCode() {
        int result = idCode != null ? idCode.hashCode() : 0;
        result = 31 * result + (imeNaProdukt != null ? imeNaProdukt.hashCode() : 0);
        result = 31 * result + (cenaNaProdukt != null ? cenaNaProdukt.hashCode() : 0);
        result = 31 * result + (preostanataKolicina != null ? preostanataKolicina.hashCode() : 0);
        result = 31 * result + (slikaNaProdukt != null ? slikaNaProdukt.hashCode() : 0);
        return result;
    }
}
