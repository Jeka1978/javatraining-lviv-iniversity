package lab;

public enum HttpStatus {
    SUCCESS, INFO, SERVER_ERROR;

    public static HttpStatus findByHttpCode(int code) {
        return SUCCESS;
    }
}
