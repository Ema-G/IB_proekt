package com.example.bp_proekt.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "article", schema = "E-shop", catalog = "postgres")
public class Article {
    private int articleId;
    private String name;
    private String text;
    private Integer idKey;
    private int idCode;
    private Eshop eshopByIdKey;
    private Product productByIdCode;

    @Id
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
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
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "id_key", insertable = false, updatable = false)
    public Integer getIdKey() {
        return idKey;
    }

    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }

    @Basic
    @Column(name = "id_code", insertable = false, updatable = false)
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

        Article article = (Article) o;

        if (articleId != article.articleId) return false;
        if (idCode != article.idCode) return false;
        if (!Objects.equals(name, article.name)) return false;
        if (!Objects.equals(text, article.text)) return false;
        return idKey != null ? idKey.equals(article.idKey) : article.idKey == null;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (idKey != null ? idKey.hashCode() : 0);
        result = 31 * result + idCode;
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

    @ManyToOne
    @JoinColumn(name = "id_code", referencedColumnName = "id_code", nullable = false)
    public Product getProductByIdCode() {
        return productByIdCode;
    }

    public void setProductByIdCode(Product productByIdCode) {
        this.productByIdCode = productByIdCode;
    }
}
