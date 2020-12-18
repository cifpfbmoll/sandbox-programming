package com.studentsfp.devenvironment.unittesting.p2.data;

import java.util.Date;

/**
 * com.studentsfp.devenvironment.unittesting.p2.data
 * Class Operation
 * 18/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Operation {
    private Date date;
    private String concept;
    private Double amount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
