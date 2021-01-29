package com.studentsfp.devenvironment.unittesting.p3.data;

public class Publication {
    private String isbn;
    private String title;
    private Integer year;


    public Publication(){

    }
    public Publication(String isbn, String title, Integer year){
        setISBN(isbn);
        setTitle(title);
        setYear(year);
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
