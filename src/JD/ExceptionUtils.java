package JD;

import javax.xml.transform.Result;
import java.math.BigDecimal;

/**
 * @ClassName ExceptionUtils
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/9 9:40
 */
public class ExceptionUtils {
   /* public static final Result handleException(Throwable cause, String info) {
        if (cause.getClass().equals(BaseAppException.class)) {
            BaseAppException e1 = (BaseAppException) cause;
            if (RpcStatus.INSERT_INDEX_REPEAT.getCode().equalis(e1.getErrorCode())) {
                e1.setErrorMessage("数据已经存在，不能重复添加");
            }
            return new Result(new RpcExcption(e1.getErrorCode(),e1.getErrorMessage()));
        }else if (cause.getClass().equals(BaseErrorException.class)){
            BaseErrorException e1 = (BaseErrorException) cause;
        }
    }*/

    public static void main(String[] args) {
        BigDecimal stringBigDecimal = new BigDecimal(4.3);
        if (stringBigDecimal.compareTo(BigDecimal.ZERO) >= 0) {
            System.out.println("自己传入的值小于等于0");
        }
    }



}