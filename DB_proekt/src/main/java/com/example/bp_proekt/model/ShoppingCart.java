package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Table(name = "shopping_cart", schema = "E-shop", catalog = "postgres")
public class ShoppingCart {
    private int cartId;
    private Integer idAccount;
    private Account accountByIdAccount;
    private Collection<ShoppingcartHoldsProduct> shoppingcartHoldsProductsByCartId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "id_account", insertable = false, updatable = false)
    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCart that = (ShoppingCart) o;

        if (cartId != that.cartId) return false;
        return idAccount != null ? idAccount.equals(that.idAccount) : that.idAccount == null;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + (idAccount != null ? idAccount.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_account", referencedColumnName = "id_account")
    public Account getAccountByIdAccount() {
        return accountByIdAccount;
    }

    public void setAccountByIdAccount(Account accountByIdAccount) {
        this.accountByIdAccount = accountByIdAccount;
    }

    @OneToMany(mappedBy = "shoppingCartByCartId")
    public Collection<ShoppingcartHoldsProduct> getShoppingcartHoldsProductsByCartId() {
        return shoppingcartHoldsProductsByCartId;
    }

    public void setShoppingcartHoldsProductsByCartId(Collection<ShoppingcartHoldsProduct> shoppingcartHoldsProductsByCartId) {
        this.shoppingcartHoldsProductsByCartId = shoppingcartHoldsProductsByCartId;
    }
}
