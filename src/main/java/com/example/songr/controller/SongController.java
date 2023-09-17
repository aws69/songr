package com.example.songr;

import com.example.songr.repositres.SongJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    private SongJpa  songRepository;

    @GetMapping("/songs")
    public String listSongs(Model model) {
        List<Song> songs = songRepository.findAll();
        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/songs/{id}")
    public String viewSong(@PathVariable Long id, Model model) {
        Song song = songRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid song ID: " + id));
        model.addAttribute("song", song);
        return "viewSong";
    }

    @GetMapping("/songs/edit/{id}")
    public String editSongForm(@PathVariable Long id, Model model) {
        Song song = songRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid song ID: " + id));
        model.addAttribute("song", song);
        return "editSong";
    }

    @PostMapping("/songs/edit/{id}")
    public String editSongSubmit(@PathVariable Long id, @ModelAttribute Song updatedSong) {
        Song song = songRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid song ID: " + id));
        song.setTitle(updatedSong.getTitle());
        song.setLength(updatedSong.getLength());
        song.setTrackNumber(updatedSong.getTrackNumber());
        songRepository.save(song);
        return "redirect:/songs";
    }

    @GetMapping("/songs/delete/{id}")
    public String deleteSong(@PathVariable Long id) {
        songRepository.deleteById(id);
        return "redirect:/songs";
    }
}
