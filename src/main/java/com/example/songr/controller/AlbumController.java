package com.example.songr.controller;

import com.example.songr.Album;
import com.example.songr.repositres.AlbumJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    private AlbumJpa albumJpa;

    @GetMapping("/albums")
    public String getAllAlbums(Model model) {
        List<Album> albums = albumJpa.findAll();
        model.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/albums")
    public String addAlbum(Album album) {
        albumJpa.save(album);
        return "redirect:/albums";
    }


//    public void updateAlbum(Long id, Album updatedAlbum) {
//        albumJpa.updateAlbumById(id, updatedAlbum);
//    }

    public void deleteAlbum(Long id) {
        albumJpa.deleteAlbumById(id);
    }

    public void deleteAlbumsByArtist(String artistName) {
        albumJpa.deleteAlbumsByArtist(artistName);
    }


}
