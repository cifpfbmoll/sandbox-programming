package com.studentsfp.devenvironment.unittesting.p2.data;

/**
 * com.studentsfp.devenvironment.unittesting.p2.data
 * Class Client
 * 18/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Client {
    private Long id;
    private String name;
    private String nif;
    private String address;
    private String email;
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
