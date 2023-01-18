package com.codeavenge.basespringboot.Controller;

import com.codeavenge.basespringboot.Model.Books;
import com.codeavenge.basespringboot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Books> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/books")
    public Books addBooks(@RequestBody Books books) {
        System.out.println("Books name added");
        return bookService.saveEmployee(books);
    }

    @PutMapping("/books/{id}")
    public Books addBooksById(@PathVariable Long id, @RequestBody Books books) {
        System.out.println("Updating books name by ID");
        books.setId(id);
        return bookService.updateEmployee(books);
    }

    @DeleteMapping("/books")
    public void deleteMapping(@RequestParam Long id) {
        System.out.println("Deleting books of id " + id);
        bookService.deleteEmployee(id);
    }
}
