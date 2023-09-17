package com.example.songr.repositres;

import com.example.songr.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlbumJpa extends JpaRepository<Album, Long> {
//    void updateAlbumById(Long id, Album updatedAlbum);

    void deleteAlbumById(Long id);

    @Modifying
    @Query("DELETE FROM Album a WHERE a.artist = :artistName")
    void deleteAlbumsByArtist(@Param("artistName") String artistName);
}
