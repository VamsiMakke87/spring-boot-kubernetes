package com.java.k8s.bookmarker_api.controller;


import com.java.k8s.bookmarker_api.dto.BookmarkerDTO;
import com.java.k8s.bookmarker_api.entity.Bookmarker;
import com.java.k8s.bookmarker_api.service.BookmarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookmarkerController {

    @Autowired
    private BookmarkerService bookmarkerService;

    @GetMapping("/getBookmarks")
    public BookmarkerDTO getBookmarks(@RequestParam(defaultValue = "1") int pageNo){
        pageNo= pageNo<=0?1:pageNo-1;


        return bookmarkerService.getBookmarks(pageNo);
    }

}
