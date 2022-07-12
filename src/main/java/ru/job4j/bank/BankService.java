package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывающий банковское обслуживание,
 * хранит счета и методы для работы со счетами.
 * @author Sergei Formalukov
 * @version 1.0
 */
public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * Осуществляется проверка, что такого пользователя еще нет в системе.
     * @param user пользователь системы банка.
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод ищет пользователя по паспорту среди списка пользователей и
     * в случае если пользователь найден добавляет ему новый счет к списку его счетов.
     * @param passport Паспортные данные пользователя.
     * @param account Счет для добавления к списку счетов пользователя.
     */
    public void addAccount(String passport, Account account) {
        User requestedUser = findByPassport(passport);
        if (requestedUser != null) {
            if (!users.get(requestedUser).contains(account)) {
                users.get(requestedUser).add(account);
            }
        }
    }

    /**
     * Метод ищет клиента по паспорту среди списка пользователей.
     * @param passport Паспортные данные пользователя.
     * @return Возвращает объект типа User если пользователь найден, либо null если пользователь не найден.
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам счета.
     * @param passport Паспортные данные пользователя.
     * @param requisite Реквизиты счета.
     * @return Возвращает объект типа Account если счет найден, либо null если не найден счет или пользователь.
     */
    public Account findByRequisite(String passport, String requisite) {
        User requestedUser = findByPassport(passport);
        if (requestedUser != null) {
        return users.get(requestedUser)
                .stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
        }
        return null;
    }

    /**
     * Метод переводит деньги с одного счета на другой.
     * @param srcPassport Паспортные данные плательщика.
     * @param srcRequisite Реквизиты счета плательщика.
     * @param destPassport Паспортные данные получателя.
     * @param destRequisite Реквизиты счета получателя.
     * @param amount Сумма перевода.
     * @return Возвращает true если перевод успешно завершен, иначе false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
                src.setBalance(src.getBalance() - amount);
                dest.setBalance(dest.getBalance() + amount);
                rsl = true;
        }
        return rsl;
    }

}