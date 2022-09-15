package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "eshop", schema = "Eshopp", catalog = "DB_proekt")
public class Eshop {
    private int idKey;
    private String name;
    private Collection<Account> accountsByIdKey;
    private Collection<Article> articlesByIdKey;
    private Collection<Product> productsByIdKey;

    @Id
    @Column(name = "id_key")
    public int getIdKey() {
        return idKey;
    }

    public void setIdKey(int idKey) {
        this.idKey = idKey;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Eshop eshop = (Eshop) o;

        if (idKey != eshop.idKey) return false;
        return Objects.equals(name, eshop.name);
    }

    @Override
    public int hashCode() {
        int result = idKey;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "eshopByIdKey")
    public Collection<Account> getAccountsByIdKey() {
        return accountsByIdKey;
    }

    public void setAccountsByIdKey(Collection<Account> accountsByIdKey) {
        this.accountsByIdKey = accountsByIdKey;
    }

    @OneToMany(mappedBy = "eshopByIdKey")
    public Collection<Article> getArticlesByIdKey() {
        return articlesByIdKey;
    }

    public void setArticlesByIdKey(Collection<Article> articlesByIdKey) {
        this.articlesByIdKey = articlesByIdKey;
    }

    @OneToMany(mappedBy = "eshopByIdKey")
    public Collection<Product> getProductsByIdKey() {
        return productsByIdKey;
    }

    public void setProductsByIdKey(Collection<Product> productsByIdKey) {
        this.productsByIdKey = productsByIdKey;
    }
}
