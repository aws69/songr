package com.example.songr.controller;

import com.example.songr.Album;
import com.example.songr.repositres.AlbumJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    private AlbumJpa albumRepository;

    @GetMapping("/albums")
    public String listAlbums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "albums";
    }

    @GetMapping("/albums/{id}")
    public String viewAlbum(@PathVariable Long id, Model model) {
        Album album = albumRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid album ID: " + id));
        model.addAttribute("album", album);
        return "viewAlbum";
    }

    @GetMapping("/albums/add")
    public String addAlbumForm(Model model) {
        model.addAttribute("album", new Album());
        return "addAlbum";
    }

    @PostMapping("/albums/add")
    public String addAlbumSubmit(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "redirect:/albums";
    }

    @GetMapping("/albums/edit/{id}")
    public String editAlbumForm(@PathVariable Long id, Model model) {
        Album album = albumRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid album ID: " + id));
        model.addAttribute("album", album);
        return "editAlbum";
    }

    @PostMapping("/albums/edit/{id}")
    public String editAlbumSubmit(@PathVariable Long id, @ModelAttribute Album updatedAlbum) {
        Album album = albumRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid album ID: " + id));
        album.setTitle(updatedAlbum.getTitle());
        album.setArtist(updatedAlbum.getArtist());
        album.setSongCount(updatedAlbum.getSongCount());
        album.setLength(updatedAlbum.getLength());
        album.setImageUrl(updatedAlbum.getImageUrl());
        albumRepository.save(album);
        return "redirect:/albums";
    }

    @GetMapping("/albums/delete/{id}")
    public String deleteAlbum(@PathVariable Long id) {
        albumRepository.deleteById(id);
        return "redirect:/albums";
    }
}
