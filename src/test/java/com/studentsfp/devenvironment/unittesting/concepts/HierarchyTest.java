package com.studentsfp.devenvironment.unittesting.concepts;

import com.studentsfp.devenvironment.unittesting.p0.abstracto.Article;
import com.studentsfp.devenvironment.unittesting.p0.abstracto.Computer;
import com.studentsfp.devenvironment.unittesting.p0.structures.PersonWrapper;
import com.studentsfp.devenvironment.unittesting.p3.data.Publication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HierarchyTest {
    @Test
    private void testInheritance() {
        Article article = new Computer();
        Computer computer = new Computer();
        computer.getItems();
        PersonWrapper.testPersons();
        Publication publication = new Publication();
    }
}
