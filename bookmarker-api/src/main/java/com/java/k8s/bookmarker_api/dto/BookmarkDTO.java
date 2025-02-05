package com.java.k8s.bookmarker_api.dto;


import jakarta.persistence.Column;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkDTO {

    private Long id;

    private String name;
    private String link;

    private OffsetDateTime createdAt;
}
