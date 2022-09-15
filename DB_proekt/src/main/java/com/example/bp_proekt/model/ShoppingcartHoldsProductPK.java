package com.example.bp_proekt.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ShoppingcartHoldsProductPK implements Serializable {
    private int cartId;
    private int idCode;

    @Column(name = "cart_id", insertable = false, updatable = false)
    @Id
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Column(name = "id_code", insertable = false, updatable = false)
    @Id
    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingcartHoldsProductPK that = (ShoppingcartHoldsProductPK) o;

        if (cartId != that.cartId) return false;
        return idCode == that.idCode;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + idCode;
        return result;
    }
}
