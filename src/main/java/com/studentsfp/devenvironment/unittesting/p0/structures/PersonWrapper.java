package com.studentsfp.devenvironment.unittesting.p0.structures;

import com.studentsfp.devenvironment.unittesting.p1.data.Person;
import org.springframework.util.CollectionUtils;

import java.util.*;

public class PersonWrapper {
    public List<String> personList = new LinkedList<>();
    public List<Person> personList2 = new ArrayList<>();

    public Map<Integer,Person> personMap = new HashMap();

    private void sandbox(){
        //personList.add(new Person());
        personList.add("lunes");
        personList.add("martes");
        //personList.addAll({"1","2"});
        personMap.put(123,new Person());

    }
}
