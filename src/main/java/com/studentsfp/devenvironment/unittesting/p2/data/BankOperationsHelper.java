package com.studentsfp.devenvironment.unittesting.p2.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankOperationsHelper {
    /**
     * Creates a blank Account for the minitask setting initial amount of cash
     *
     * @param bankName the bank name!
     * @param amount initial balance
     * @param customers array of customer names
     * @return new Account
     */
    public static Account initAccount(String bankName, Double amount, String... customers) {
        Account account = new Account();
        Bank bank = new Bank();
        bank.setName(bankName);
        account.setBank(bank);
        account.setBalance(amount);
        List<Client> clientList = new ArrayList<>();
        for (String customerName : customers) {
            Client client = new Client();
            client.setName(customerName);
            clientList.add(client);
        }
        account.setClientList(clientList);
        List<Operation> operations = new ArrayList<>();
        Operation operation = new Operation();
        operation.setDate(new Date());
        operation.setConcept("Apertura de cuenta");
        operation.setAmount(amount);
        operations.add(operation);
        account.setOperations(operations);
        return account;
    }
}
