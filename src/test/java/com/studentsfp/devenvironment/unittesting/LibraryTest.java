package com.studentsfp.devenvironment.unittesting;

import com.studentsfp.devenvironment.unittesting.p3.service.LibraryService;
import com.studentsfp.devenvironment.unittesting.p3.data.Publication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class LibraryTest {
    Logger logger = LoggerFactory.getLogger(LibraryTest.class);
    @Test
    void addPublicationTest() {
        LibraryService libraryService = new LibraryService();
        Publication publication = new Publication(null, "Ese caballo que viene de Bonanza", 1999);
        Assert.isTrue(!libraryService.addPublication(publication),"isbn nulo no puede añadirse");
        logger.info("test molon acabado!");
    }
}
