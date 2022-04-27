package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User requestedUser = findByPassport(passport);
        List<Account> usersAccounts = new ArrayList<>(users.get(requestedUser));
        if (!usersAccounts.contains(account)) {
               usersAccounts.add(account);
            }
        users.put(requestedUser, usersAccounts);
    }

    public User findByPassport(String passport) {
        User rsl = null;
        Set<User> keys = users.keySet();
        for (User user:keys) {
            if (user.getPassport().equals(passport)) {
            rsl = user;
            }

        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User requestedUser = findByPassport(passport);
        if (requestedUser != null) {
            List<Account> usersAccounts = new ArrayList<>(users.get(requestedUser));
            for (Account account :usersAccounts) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

}