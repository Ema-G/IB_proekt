package com.example.bp_proekt.service.impl;

import com.example.bp_proekt.model.PogledKonKosnicka;
import com.example.bp_proekt.model.PogledKonMagazin;
import com.example.bp_proekt.model.PogledKonProdavnica;
import com.example.bp_proekt.service.PreviewService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Service
public class PreviewServiceImpl implements PreviewService {
    @PersistenceContext
    EntityManager entityManager;

    public List<PogledKonProdavnica> getAllShop(){
        Query query = entityManager.createNativeQuery("select * from \"DB_proekt\".\"Eshopp\".pogled_kon_prodavnica");

        List<PogledKonProdavnica> listProdavnica= new ArrayList<>();

        List<Object[]> listObject=query.getResultList();
        for (Object[] object : listObject) {
            PogledKonProdavnica item=new PogledKonProdavnica();
            item.setIdCode(Integer.valueOf(object[0].toString()));
            item.setImeNaProdukt(object[1].toString());
            item.setCenaNaProdukt(Double.valueOf(object[2].toString()));
            item.setPreostanataKolicina(Integer.valueOf(object[3].toString()));
            item.setSlikaNaProdukt(object[4].toString());
            listProdavnica.add(item);
        }

        return listProdavnica;
    }

    public List<PogledKonMagazin> getAllStory(){
        Query query = entityManager.createNativeQuery("select * from \"DB_proekt\".\"Eshopp\".pogled_kon_magazin");
        List<PogledKonMagazin> listMagazin=(List<PogledKonMagazin>) query.getResultList();
        return listMagazin;
    }

    public List<PogledKonKosnicka> getAllCart(){
        Query query = entityManager.createNativeQuery("select * from \"DB_proekt\".\"Eshopp\".pogled_kon_kosnicka k ");
        List<PogledKonKosnicka> listKosnicka=(List<PogledKonKosnicka>) query.getResultList();
        System.out.println("size" + listKosnicka.size());
        return listKosnicka;
    }
}
