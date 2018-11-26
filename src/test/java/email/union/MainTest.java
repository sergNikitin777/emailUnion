package email.union;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.peer.SystemTrayPeer;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testAddUserEmails() {

        String testStr[] =  ("user1 -> xxx@ya.ru, foo@gmail.com, lol@mail.ru\n" +
                "user2 -> foo@gmail.com, ups@pisem.net\n" +
                "user3 -> xyz@pisem.net, vasya@pupkin.com\n" +
                "user4 -> ups@pisem.net, aaa@bbb.ru\n" +
                "user5 -> xyz@pisem.net").split("\n");

        for (String s : testStr)
            Main.addUserEmails(s);

        Assert.assertEquals(Main.emailMap.size(),7);
    }

    @Test
    public void testGetUsersEmails(){
        Main.getUsersEmails();

        Assert.assertEquals(Main.resultMap.size(),2);
    }

    @Test
    public void testPrintResults(){
        Main.printResults();
    }

}