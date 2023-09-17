package com.example.songr.repositres;

import com.example.songr.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongJpa extends JpaRepository<Song, Long> {

}
