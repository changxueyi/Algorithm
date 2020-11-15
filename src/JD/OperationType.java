package JD;

public enum OperationType {
    EFFECTIVE(2,"积分生效");

    private Integer code;
    private String msg;

    OperationType(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
