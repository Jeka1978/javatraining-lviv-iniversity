package never_use_switch;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.fluttercode.datafactory.impl.DataFactory;

@Slf4j
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender2 mailSender = new MailSender2();
        DataFactory dataFactory = new DataFactory();

        while (true) {
            MailInfo mailInfo = null;
            mailInfo = new MailInfo(dataFactory.getNumberBetween(1, 4));
            mailInfo.setClient(new Client(dataFactory.getName(), dataFactory.getNumberBetween(10, 100)));
            try {
                mailSender.sendMail(mailInfo);
            } catch (Exception e) {

                log.error(e.getMessage());
                log.info("this is not so importannt message");
                log.debug("totally not important only for the developers");
            }
            Thread.sleep(1000);
        }
    }
}
