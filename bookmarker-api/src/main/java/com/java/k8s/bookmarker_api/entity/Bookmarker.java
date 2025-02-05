package com.java.k8s.bookmarker_api.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Bookmarker {

    @Id
    @SequenceGenerator(sequenceName = "bm_id_seq", name = "bm_id_seq", allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq")
    private Long id;

    private String name;
    private String link;


    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private OffsetDateTime createdAt;


}
