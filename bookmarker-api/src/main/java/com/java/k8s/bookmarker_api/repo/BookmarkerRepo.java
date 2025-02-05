package com.java.k8s.bookmarker_api.repo;

import com.java.k8s.bookmarker_api.entity.Bookmarker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkerRepo extends JpaRepository<Bookmarker,Long> {
}
