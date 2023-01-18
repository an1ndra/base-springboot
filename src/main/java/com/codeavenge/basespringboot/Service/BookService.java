package com.codeavenge.basespringboot.Service;

import com.codeavenge.basespringboot.Model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService{
    List<Books> getBooks();
    Books saveEmployee(Books books);
    Books updateEmployee(Books books);
    void deleteEmployee(Long id);
}
