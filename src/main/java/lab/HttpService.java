package lab;

public class HttpService {
    public void handleHttpCode(int code) {
        HttpStatus httpCode = HttpStatus.findByHttpCode(code);

        switch (httpCode) {
            case INFO:
                //40 lines of handling code here
                break;
            case SUCCESS:
                // 59 lines of code
        }
    }
}
