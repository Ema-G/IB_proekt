package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "E-shop", catalog = "postgres")
public class Product {
    private int idCode;
    private String name;
    private double price;
    private int quantity;
    private String picture;
    private Integer idKey;
    private Collection<Article> articlesByIdCode;
    private Eshop eshopByIdKey;
    private Collection<ShoppingcartHoldsProduct> shoppingcartHoldsProductsByIdCode;

    @Id
    @Column(name = "id_code")
    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    @Basic
//    @Column(name = "picture")
//    public String getPicture() {
//        return picture;
//    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "id_key", insertable = false, updatable = false)
    public Integer getIdKey() {
        return idKey;
    }

    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (idCode != product.idCode) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (quantity != product.quantity) return false;
        if (!Objects.equals(name, product.name)) return false;
        if (!Objects.equals(picture, product.picture)) return false;
        return idKey != null ? idKey.equals(product.idKey) : product.idKey == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idCode;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (idKey != null ? idKey.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "productByIdCode")
    public Collection<Article> getArticlesByIdCode() {
        return articlesByIdCode;
    }

    public void setArticlesByIdCode(Collection<Article> articlesByIdCode) {
        this.articlesByIdCode = articlesByIdCode;
    }

    @ManyToOne
    @JoinColumn(name = "id_key", referencedColumnName = "id_key")
    public Eshop getEshopByIdKey() {
        return eshopByIdKey;
    }

    public void setEshopByIdKey(Eshop eshopByIdKey) {
        this.eshopByIdKey = eshopByIdKey;
    }

    @OneToMany(mappedBy = "productByIdCode")
    public Collection<ShoppingcartHoldsProduct> getShoppingcartHoldsProductsByIdCode() {
        return shoppingcartHoldsProductsByIdCode;
    }

    public void setShoppingcartHoldsProductsByIdCode(Collection<ShoppingcartHoldsProduct> shoppingcartHoldsProductsByIdCode) {
        this.shoppingcartHoldsProductsByIdCode = shoppingcartHoldsProductsByIdCode;
    }
}
