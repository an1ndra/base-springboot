package com.codeavenge.basespringboot.Repository;

import com.codeavenge.basespringboot.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
}
