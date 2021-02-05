package com.studentsfp.devenvironment.unittesting.concepts;

import com.studentsfp.devenvironment.unittesting.p0.abstracto.Article;
import com.studentsfp.devenvironment.unittesting.p0.abstracto.Computer;
import com.studentsfp.devenvironment.unittesting.p0.structures.PersonWrapper;
import com.studentsfp.devenvironment.unittesting.p3.data.Publication;
import org.apache.commons.lang3.StringUtils;
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

    @Test
    private void test() {
        String rtn = "";
        String conditionCaminarCliente = "si";
        //rtn = StringUtils.isEmpty(conditionCaminarCliente)?"No ha puesto nada":"Usted " + conditionCaminarCliente + " 🏃";
        if (StringUtils.isEmpty(conditionCaminarCliente)){
            rtn = "no hay nada";
        }else{
            rtn = "usted " + conditionCaminarCliente;
        }
        /*
        switch (conditionCaminarCliente){
            case "si":
                break;
            case "no":
                break;
            default:
                break;
        }*/
        try {
            if (StringUtils.isEmpty(conditionCaminarCliente)) {
                rtn = "No ha puesto nada";
            } else {
                if (StringUtils.equals(conditionCaminarCliente, "si")) {
                    rtn = "Usted " + conditionCaminarCliente + " 🏃";//idem
                } else if (StringUtils.equals(conditionCaminarCliente, "no")) {
                    rtn = "Usted " + conditionCaminarCliente + " 🏃";//idem
                }
            }
            System.out.println();
        } catch (Exception e) {

        }
    }
}
