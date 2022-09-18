package com.example.bp_proekt.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shoppingcart_holds_product", schema = "E-shop", catalog = "postgres")
@IdClass(ShoppingcartHoldsProductPK.class)
public class ShoppingcartHoldsProduct {
    private Integer quantity;
    private String status;
    private int cartId;
    private int idCode;
    private Timestamp date;
    private ShoppingCart shoppingCartByCartId;
    private Product productByIdCode;

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

//    @Basic
//    @Column(name = "status")
//    public String getStatus() {
//        return status;
//    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    @Column(name = "cart_id", insertable = false, updatable = false)
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Id
    @Column(name = "id_code", insertable = false, updatable = false)
    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

//    @Basic
//    @Column(name = "date")
//    public Timestamp getDate() {
//        return date;
//    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingcartHoldsProduct that = (ShoppingcartHoldsProduct) o;

        if (cartId != that.cartId) return false;
        if (idCode != that.idCode) return false;
        if (!Objects.equals(quantity, that.quantity)) return false;
        if (!Objects.equals(status, that.status)) return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    public int hashCode() {
        int result = quantity != null ? quantity.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + cartId;
        result = 31 * result + idCode;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id", nullable = false)
    public ShoppingCart getShoppingCartByCartId() {
        return shoppingCartByCartId;
    }

    public void setShoppingCartByCartId(ShoppingCart shoppingCartByCartId) {
        this.shoppingCartByCartId = shoppingCartByCartId;
    }

    @ManyToOne
    @JoinColumn(name = "id_code", referencedColumnName = "id_code", nullable = false)
    public Product getProductByIdCode() {
        return productByIdCode;
    }

    public void setProductByIdCode(Product productByIdCode) {
        this.productByIdCode = productByIdCode;
    }
}
