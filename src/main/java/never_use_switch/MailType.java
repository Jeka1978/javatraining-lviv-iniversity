package never_use_switch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

@AllArgsConstructor
@Getter
public enum MailType {
    WELCOME(1, new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator()),
    HAPPY_BIRTHDAY(3, new HappyBirthdayMailGenerator());

    private final int mailCode;
    private final MailGenerator mailGenerator;


    public static MailType findByMailCode(int mailCode) {
        MailType[] mailTypes = values();
        for (MailType mailType : mailTypes) {
            if (mailType.mailCode == mailCode) {
                return mailType;
            }
        }
        throw new IllegalStateException(mailCode + " not supported yet");
    }


}
