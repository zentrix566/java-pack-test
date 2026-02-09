package com.fengqiao.repository;

import com.fengqiao.entity.Poem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PoemRepository extends JpaRepository<Poem, Long>  {
    @Query(value = "SELECT * FROM poems ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Poem findRandomOne();
}
