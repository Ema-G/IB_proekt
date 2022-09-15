package com.example.bp_proekt.web;

import com.example.bp_proekt.model.PogledKonKosnicka;
import com.example.bp_proekt.model.PogledKonMagazin;
import com.example.bp_proekt.model.PogledKonProdavnica;
import com.example.bp_proekt.service.PreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/pogled")
public class PreviewController {
    final
    PreviewService previewService;

    public PreviewController(PreviewService previewService) {
        this.previewService = previewService;
    }

    @GetMapping("/prodavnica")
    public List<PogledKonProdavnica> getProdavnica()  {
        List<PogledKonProdavnica> list= previewService.getAllShop();
        return list;
    }

    @GetMapping("/magazin")
    public List<PogledKonMagazin> getMagazin() throws IOException {
        return previewService.getAllStory();
    }

    @GetMapping("/kosnicka")
    public List<PogledKonKosnicka> getKosnicka() throws IOException {
        return previewService.getAllCart();
    }
}
