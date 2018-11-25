package email.union;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    //private static Map<String, List<String>> usersMap = new HashMap<>();
    private static Map<String, List<String>> resultMap = new HashMap<>();
    private static Map<String, String> emailMap = new HashMap<>();

    public static void main(String[] args) {

    }

    public static void addUserEmails(String userStr) {
        System.out.println("input str :" + userStr);

        final String key = userStr.substring(0, userStr.indexOf("->")).trim();
        final String listStr = userStr.substring(userStr.lastIndexOf("->") + 2).trim();
        final List<String> listEmail = Arrays.asList(listStr.trim().split("\\s*,\\s*"));

        //System.out.println("key :" + key);
        //System.out.println("listStr :" + listStr);
        //System.out.println("listEmail :" + listEmail.p);

         String foundUser=null;

        for (String email : listEmail) {
            if (emailMap.get(email) != null) {
                foundUser = emailMap.get(email);
            }
        }

        if (foundUser!=null){
            for (String email : listEmail) {
                emailMap.put(email,foundUser);
            }
        }else {
            for (String email : listEmail) {
                emailMap.put(email,key);
            }
        }

        System.out.println("--");
    }

    public static void getUsersEmails(){
        for(Map.Entry<String,String> entry : emailMap.entrySet()){
            if (resultMap.get(entry.getValue())==null){
                List<String> emails = new ArrayList<String>();
                emails.add(entry.getKey());
                resultMap.put(entry.getValue(),emails);
            }else{
                List<String> emails = resultMap.get(entry.getValue());
                emails.add(entry.getKey());
                resultMap.put(entry.getValue(),emails);
            }
        }
    }

    public static void printResults(){
        for( Map.Entry<String,List<String>> listEntry : resultMap.entrySet()){
            System.out.println(listEntry.getKey() + "->" + listEntry.getValue().stream()
                    .collect(Collectors.joining(",")));
        }
    }
}
