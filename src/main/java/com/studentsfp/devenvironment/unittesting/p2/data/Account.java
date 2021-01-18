package com.studentsfp.devenvironment.unittesting.p2.data;

import java.util.List;

/**
 * com.studentsfp.devenvironment.unittesting.p2.data
 * Class Account
 * 18/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Account {
    private Bank bank;
    private Double balance;
    private List<Client> clientList;
    private List<Operation> operations;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
