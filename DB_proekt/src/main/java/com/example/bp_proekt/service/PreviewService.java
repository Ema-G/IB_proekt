package com.example.bp_proekt.service;

import com.example.bp_proekt.model.PogledKonKosnicka;
import com.example.bp_proekt.model.PogledKonMagazin;
import com.example.bp_proekt.model.PogledKonProdavnica;

import java.util.List;

public interface PreviewService {
    List<PogledKonProdavnica> getAllShop();

    List<PogledKonMagazin> getAllStory();

    List<PogledKonKosnicka> getAllCart();
}
