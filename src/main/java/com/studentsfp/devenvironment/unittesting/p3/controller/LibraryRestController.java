package com.studentsfp.devenvironment.unittesting.p3.controller;

import com.studentsfp.devenvironment.unittesting.p3.service.LibraryService;
import com.studentsfp.devenvironment.unittesting.p3.data.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/api/v1")
public class LibraryRestController {

    LibraryService libraryService;

    public LibraryRestController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/getBooks")
    public List<Publication> getPublications() {
        return libraryService.getPublications();
    }

    @GetMapping("/addBooks")
    public List<Publication> addPublication(@RequestParam(value = "isbn", defaultValue = "ISBN") String isbn,
                                            @RequestParam(value = "title", defaultValue = "El quijote") String title,
                                            @RequestParam(value = "year", defaultValue = "1999") Integer year) {
        libraryService.addPublication(new Publication(isbn, title, year));
        return libraryService.getPublications();
    }

    @PostMapping("/addPublication")
    public List<Publication> addFullPublication(@RequestBody Publication publication) {
        if (publication != null) {
            libraryService.addPublication(publication);
        }
        return libraryService.getPublications();
    }
}
