package lab1;

import lab1.utils.AllConst;
import lab1.utils.UIConst;
import never_use_switch.Client;
import never_use_switch.MailInfo;
import never_use_switch.MailSender;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MailSender mailSender = new MailSender();
        DataFactory dataFactory = new DataFactory();


        while (true) {
            doWork(mailSender, dataFactory);
            Thread.sleep(1000);
        }


    }

    private static void doWork(MailSender mailSender, DataFactory dataFactory) {
        Client client = new Client(dataFactory.getName(), dataFactory.getNumberBetween(10, 20));

        MailInfo mailInfo = new MailInfo(client,dataFactory.getNumberBetween(1,3));
        mailSender.sendMail(mailInfo);
    }
}
