package com.app.bms.repository;

import com.app.bms.models.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author t0k02w6 on 09/07/22
 * @project bookmyshow_lld
 */
@Repository
public interface GenreRepository extends JpaRepository<MovieGenre, Long> {
}
