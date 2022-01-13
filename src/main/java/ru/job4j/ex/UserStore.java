package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("This user was not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        String userName = user.getUsername();
        if (!user.isValid() || userName.length() < 3) {
            throw new UserInvalidException("This user does not have access");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException u) {
            System.out.println("This user does not have access");
        } catch (UserNotFoundException e) {
            System.out.println("This user was not found");

        }
    }
}