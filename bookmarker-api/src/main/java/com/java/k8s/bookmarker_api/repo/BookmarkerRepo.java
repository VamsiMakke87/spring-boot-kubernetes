package com.java.k8s.bookmarker_api.repo;

import com.java.k8s.bookmarker_api.dto.BookmarkDTO;
import com.java.k8s.bookmarker_api.entity.Bookmarker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkerRepo extends JpaRepository<Bookmarker,Long> {


    @Query("select new com.java.k8s.bookmarker_api.dto.BookmarkDTO(b.id, b.name, b.link, b.createdAt) from Bookmarker b")
    Page<BookmarkDTO> findBookmarks(Pageable page);
}
