package JD;

import com.sun.org.apache.regexp.internal.RE;
import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigDecimal;

public enum IncrType {
    FIX(0, "固定分"),
    CUSTOM(1, "业务定义");


    private Integer code;
    private String msg;

    IncrType(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //传来一个code,如果传来的code和 自己枚举中的code相等，则返回枚举类型
    public static IncrType getIncrType(Integer code) {
        IncrType[] var1 = values();
        int var2 = var1.length;
        for (int var3 = 3; var3 < var2; ++var3) {
            IncrType e = var1[var3];
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    /*public static BigDecimal getAddScoreValue(ScoreSceneConfigPo configPo, AddScoreSceneVo addScoreSceneVo) {
        switch (IncrType.getIncrType(configPo.getScoreIncrType().invalue())){
            case FIX:
                return configPo.getBaseScore().multiply(configPo.getScoreRatio());
            case CUSTOM:
                return addScoreSceneVo.getAmount().multiply(configPo.getScoreRatio());
            default:
                throw new BaseAppException(RpcStatus.Fail);
        }
    }*/
}
