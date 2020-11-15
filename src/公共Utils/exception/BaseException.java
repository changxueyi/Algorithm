package 公共Utils.exception;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import 公共Utils.utils.RpcStatus;

import javax.lang.model.element.NestingKind;

/**
 * @ClassName BaseException
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/9 20:40
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    /**
     * 错误码
     */
    public String errorCode;
    /**
     * 错误描述
     */
    public String errorMessage;
    /**
     * 异常触发原因
     */
    public Throwable cause;


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public BaseException() {

    }

    public BaseException(String errorMessage) {
        this.cause = new Throwable(errorMessage);
        this.errorMessage = errorMessage;
        this.errorCode = RpcStatus.FAIL.code;
    }

    public BaseException(RpcStatus rpcStatus) {
        this.errorCode = rpcStatus.code;
        this.errorMessage = rpcStatus.msg;
        this.cause = new Throwable(rpcStatus.msg + ".[errCode:" + rpcStatus.code + "]");
    }

    public BaseException(RpcStatus rpcStatus, Throwable cause) {
        this.errorCode = rpcStatus.getCode();
        this.errorMessage = rpcStatus.msg;
        this.cause = cause;
    }

    public BaseException(String errorMessage, BaseException e) {
        String causeErrMsg = "";
        if (null != e) {
            if (null != e.getCause()) {
                causeErrMsg = "caused by: " + e.getCause().getMessage();
            }
            this.errorMessage = e.getErrorCode();
            this.errorMessage = errorMessage + causeErrMsg;
            this.cause = e.getCause();
        } else {
            this.errorMessage = errorMessage;
            this.errorCode = RpcStatus.FAIL.code;
            this.cause = new Throwable(errorMessage + "[errcode:" + RpcStatus.FAIL.code + "]");
        }
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String errorCode, String errorMessage) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        String msg = super.getMessage();
        String causeMsg = null;
        if (this.cause != null) {
            causeMsg = this.cause.getMessage();
        }
        if (msg!=null){
            if (causeMsg!=null){
                return msg + "caused BY:"+causeMsg;
            }
            return msg;
        }
        return causeMsg;
    }
}