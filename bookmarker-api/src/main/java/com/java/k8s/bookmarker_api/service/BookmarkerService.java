package com.java.k8s.bookmarker_api.service;


import com.java.k8s.bookmarker_api.dto.BookmarkerDTO;
import com.java.k8s.bookmarker_api.entity.Bookmarker;
import com.java.k8s.bookmarker_api.repo.BookmarkerRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BookmarkerService {

    @Autowired
    private BookmarkerRepo bookmarkerRepo;

    @Transactional
    public BookmarkerDTO getBookmarks(int pageNo){
        Pageable page= PageRequest.of(pageNo, 2, Sort.Direction.DESC, "createdAt");

        return new BookmarkerDTO(bookmarkerRepo.findAll(page));
    }
}
