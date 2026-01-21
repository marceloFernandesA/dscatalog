package com.marceloscorporation.demo.resources;


import com.marceloscorporation.demo.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<Category>findAll(){
        Category cat = new Category(1L, "Books");
        return ResponseEntity.ok().body(cat);
    }
}
