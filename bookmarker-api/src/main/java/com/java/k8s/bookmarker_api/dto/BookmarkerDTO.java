package com.java.k8s.bookmarker_api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.java.k8s.bookmarker_api.entity.Bookmarker;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.List;

@Component
@Data
@NoArgsConstructor
public class BookmarkerDTO {

    private List<Bookmarker> data;

    private Long totalData;

    private int currPage;

    private  int totalPages;

    @JsonProperty("isLast")
    private boolean isLast;
    @JsonProperty("isFirst")
    private boolean isFirst;

    private  boolean hasNext;

    private  boolean hasPrevious;

    public  BookmarkerDTO(Page<Bookmarker> page){

        setData(page.getContent());
        setTotalData(page.getTotalElements());
        setCurrPage(page.getNumber()+1);
        setTotalPages(page.getTotalPages());
        setLast(page.isLast());
        setFirst(page.isFirst());
        setHasNext(page.hasNext());
        setHasPrevious((page.hasPrevious()));
    }

}
