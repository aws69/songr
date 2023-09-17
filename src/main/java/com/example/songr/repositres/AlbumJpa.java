package com.example.songr.repositres;

import com.example.songr.Album;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AlbumJpa extends JpaRepository<Album, Long> {
    List<Album> findAll();
    Album findById(long id);
}
