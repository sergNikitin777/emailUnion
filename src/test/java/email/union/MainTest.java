package email.union;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest {

    @Test
    public void testAddUserEmails() {

        System.out.println("--    Start input    --");

        /*
        String testStr[] =  ("user1 -> xxx@ya.ru, foo@gmail.com, lol@mail.ru\n" +
                "user2 -> foo@gmail.com, ups@pisem.net\n" +
                "user3 -> xyz@pisem.net, vasya@pupkin.com\n" +
                "user4 -> ups@pisem.net, aaa@bbb.ru\n" +
                "user5 -> xyz@pisem.net").split("\n");
        */

        String testStr[] =  ("user1 -> e1@ya.ru, e2@ya.ru\n" +
                "user2 -> e3@ya.ru, e4@ya.ru\n" +
                "user3 -> e1@ya.ru, e3@ya.ru").split("\n");




        for (String s : testStr) {
            Main.addUserEmails(s);
            System.out.println(s);
        }

        System.out.println("332");
        //Assert.assertEquals(Main.emailMap.size(),7);
    }


    @Test
    public void testGetUsersEmails(){
        System.out.println("--union users emails--");
        Main.getUsersEmails();
        //Assert.assertEquals(Main.resultMap.size(),2);
    }

    @Test
    public void testPrintResults(){
        System.out.println("--    get result    --");
        Main.printResults();
    }

}