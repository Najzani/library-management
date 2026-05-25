package com.example.librarymanagement;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("books")


public class BookController {
    @Autowired
    private BookRepository bookRepository;
   @GetMapping
    public List<Book> getAllBooks() {
       return bookRepository.findAll();
   }
   @PostMapping
    public Book addBook(@RequestBody Book book){
       return bookRepository.save(book);
   }
   @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
       bookRepository.deleteById(id);

   }
   @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,@RequestBody Book book){
       book.setId(id);
       return bookRepository.save(book);
   }



}
