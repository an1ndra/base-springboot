package com.codeavenge.basespringboot.Service;

import com.codeavenge.basespringboot.Model.Books;
import com.codeavenge.basespringboot.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Books> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Books saveEmployee(Books books) {
        return bookRepository.save(books);
    }

    @Override
    public Books updateEmployee(Books books) {
        return bookRepository.save(books);
    }

    @Override
    public void deleteEmployee(Long id) {
        bookRepository.deleteById(id);
    }
}
