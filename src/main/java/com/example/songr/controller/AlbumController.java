package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAlbums(Model model) {

        Album album1 = new Album("HYBRID THEORY", "Linkin Park", 12, 2175, "https://upload.wikimedia.org/wikipedia/en/2/2a/Linkin_Park_Hybrid_Theory_Album_Cover.jpg");
        Album album2 = new Album("PERCEPTION", "NF", 16, 3682, "https://upload.wikimedia.org/wikipedia/en/b/bf/Nf_perception_album_cover.jpg" );
        Album album3 = new Album("Beauty Behind the Madness", "The Weekend", 14, 3903, "https://upload.wikimedia.org/wikipedia/en/b/bd/The_Weeknd_-_Beauty_Behind_the_Madness.png");


        model.addAttribute("albums", new Album[]{album1, album2, album3});


        return "albums";
    }
}
