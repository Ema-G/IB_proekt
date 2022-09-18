package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "E-shop", catalog = "postgres")
public class Account {
    private int idAccount;
    private String username;
    private String name;
    private String surname;
    private String address;
    private String email;
    private String password;
    private Integer idKey;
    private Eshop eshopByIdKey;
    private Collection<ShoppingCart> shoppingCartsByIdAccount;

    public Account(String username, String name, String surname, String address, String email, String password) {
        this.username=username;
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.email=email;
        this.password=password;
    }

    public Account() {

    }

    @Id
    @Column(name = "id_account")
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "id_key",insertable = false, updatable = false)
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

        Account account = (Account) o;

        if (idAccount != account.idAccount) return false;
        if (!Objects.equals(username, account.username)) return false;
        if (!Objects.equals(name, account.name)) return false;
        if (!Objects.equals(surname, account.surname)) return false;
        if (!Objects.equals(address, account.address)) return false;
        if (!Objects.equals(email, account.email)) return false;
        if (!Objects.equals(password, account.password)) return false;
        return idKey != null ? idKey.equals(account.idKey) : account.idKey == null;
    }

    @Override
    public int hashCode() {
        int result = idAccount;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (idKey != null ? idKey.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_key", referencedColumnName = "id_key")
    public Eshop getEshopByIdKey() {
        return eshopByIdKey;
    }

    public void setEshopByIdKey(Eshop eshopByIdKey) {
        this.eshopByIdKey = eshopByIdKey;
    }

    @OneToMany(mappedBy = "accountByIdAccount")
    public Collection<ShoppingCart> getShoppingCartsByIdAccount() {
        return shoppingCartsByIdAccount;
    }

    public void setShoppingCartsByIdAccount(Collection<ShoppingCart> shoppingCartsByIdAccount) {
        this.shoppingCartsByIdAccount = shoppingCartsByIdAccount;
    }
}
