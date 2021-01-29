package com.studentsfp.devenvironment.unittesting.p3.service;

import com.studentsfp.devenvironment.unittesting.p3.data.Publication;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private static final List<Publication> publications = new ArrayList<>();

    public List<Publication> getPublications() {
        return publications;
    }

    public boolean addPublication(Publication publication) {
        if( publication==null || StringUtils.isEmpty(publication.getISBN())){
            return false;
        }
        publications.add(publication);
        return true;
    }

}
