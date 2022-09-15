package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Objects;

public class PogledKonKosnicka {
    private Integer cartId;
    private Integer idAccount;
    private String imeNaProdukt;
    private Integer izbranaKolicina;
    private Double cenaNaEden;
    private Double vkupnaCena;
    private String status;

    @Basic
    @Column(name = "cart_id")
    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "id_account")
    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
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
    @Column(name = "izbrana_kolicina")
    public Integer getIzbranaKolicina() {
        return izbranaKolicina;
    }

    public void setIzbranaKolicina(Integer izbranaKolicina) {
        this.izbranaKolicina = izbranaKolicina;
    }

    @Basic
    @Column(name = "cena_na_eden")
    public Double getCenaNaEden() {
        return cenaNaEden;
    }

    public void setCenaNaEden(Double cenaNaEden) {
        this.cenaNaEden = cenaNaEden;
    }

    @Basic
    @Column(name = "vkupna_cena")
    public Double getVkupnaCena() {
        return vkupnaCena;
    }

    public void setVkupnaCena(Double vkupnaCena) {
        this.vkupnaCena = vkupnaCena;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PogledKonKosnicka that = (PogledKonKosnicka) o;

        if (!Objects.equals(cartId, that.cartId)) return false;
        if (!Objects.equals(idAccount, that.idAccount)) return false;
        if (!Objects.equals(imeNaProdukt, that.imeNaProdukt)) return false;
        if (!Objects.equals(izbranaKolicina, that.izbranaKolicina))
            return false;
        if (!Objects.equals(cenaNaEden, that.cenaNaEden)) return false;
        if (!Objects.equals(vkupnaCena, that.vkupnaCena)) return false;
        return status != null ? status.equals(that.status) : that.status == null;
    }

    @Override
    public int hashCode() {
        int result = cartId != null ? cartId.hashCode() : 0;
        result = 31 * result + (idAccount != null ? idAccount.hashCode() : 0);
        result = 31 * result + (imeNaProdukt != null ? imeNaProdukt.hashCode() : 0);
        result = 31 * result + (izbranaKolicina != null ? izbranaKolicina.hashCode() : 0);
        result = 31 * result + (cenaNaEden != null ? cenaNaEden.hashCode() : 0);
        result = 31 * result + (vkupnaCena != null ? vkupnaCena.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
