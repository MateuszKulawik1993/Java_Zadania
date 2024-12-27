package Streamy.user;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
    }


    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .map(UsersManager::getUserName)
                .forEach(username->System.out.println(username));

    }
    public static String getUserName(User user){
        return user.getUsername();
    }
    public static List<String>filterChemistsGroupNames() {
       return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
               .collect(Collectors.toList());


    }

    public static List<User>filterUsersOlderThen40(int age){
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()>age)
                .collect(Collectors.toList());
    }
    public static List<String>filerInActiveUsers(){
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost()==0)
                .map(user -> user.getUsername())
                .collect(Collectors.toList());
    }

}

