package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Objects;

public class PogledKonMagazin {
    private Integer idCode;
    private String imeNaStatija;
    private String tekstNaStatija;

    @Basic
    @Column(name = "id_code")
    public Integer getIdCode() {
        return idCode;
    }

    public void setIdCode(Integer idCode) {
        this.idCode = idCode;
    }

    @Basic
    @Column(name = "ime_na_statija")
    public String getImeNaStatija() {
        return imeNaStatija;
    }

    public void setImeNaStatija(String imeNaStatija) {
        this.imeNaStatija = imeNaStatija;
    }

    @Basic
    @Column(name = "tekst_na_statija")
    public String getTekstNaStatija() {
        return tekstNaStatija;
    }

    public void setTekstNaStatija(String tekstNaStatija) {
        this.tekstNaStatija = tekstNaStatija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PogledKonMagazin that = (PogledKonMagazin) o;

        if (!Objects.equals(idCode, that.idCode)) return false;
        if (!Objects.equals(imeNaStatija, that.imeNaStatija)) return false;
        return tekstNaStatija != null ? tekstNaStatija.equals(that.tekstNaStatija) : that.tekstNaStatija == null;
    }

    @Override
    public int hashCode() {
        int result = idCode != null ? idCode.hashCode() : 0;
        result = 31 * result + (imeNaStatija != null ? imeNaStatija.hashCode() : 0);
        result = 31 * result + (tekstNaStatija != null ? tekstNaStatija.hashCode() : 0);
        return result;
    }
}
