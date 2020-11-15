package 公共Utils.utils;

public enum RpcStatus {
    SUCCESS("00000", "成功"),
    FAIL("00001", "失败，未知错误"),
    PARM_CHECK_FAIL("00002", "参数校验失败"),
    INSERT_INDEX_REPEAT("00003", "唯一索引冲突"),
    REPEAT_REQUEST("00004", "重复请求"),
    NO_DATA("00005", "没有符合条件的数据"),
    FAIL_SIGN_ERROR("00006", "验证签名失败"),
    NO_SCORE_TO_BACK_OFF("00007", "未查到可回退的积分"),
    NO_PARTITION("00008", "biztype未配置分区ID"),
    FAIL_PARAM_NOTNULL("10001", "参数不能为空"),
    FAIL_PIN_NOTNULL("10002", "参数PIN不能为空"),
    FAIL_BIZTYPE_NOTNULL("10003", "参数biztype不能为空"),
    FAIL_UUID_NOTNULL("10004", "参数uuid不能为空"),
    FAIL_SCENE_UUID_NOTNULL("10005", "参数sceneUuid不能为空"),
    FAIL_CHANGE_UUID_NOTNULL("10006", "参数changeUuid不能为空"),
    FAIL_BIZUUID_NOTNULL("10007", "参数bizuuid不能为空"),
    FAIL_CHANGE_SCORE_NOTNULL("10008", "参数changeScore不能为空"),
    FAIL_ORIGIN_BIZUUID_NOTNULL("10009", "参数originBizuuid不能为空"),
    FAIL_SIGNATURE_NOTNULL("10010", "参数signature不能为空"),
    FAIL_LOCK_SCORE_NOTNULL("10011", "参数lockScore不能为空"),
    FAIL_UNLOCKTIME_NOTNULL("10012", "参数unlockTime不能为空"),
    FAIL_UNLOCKTOKEN_NOTNULL("10013", "参数unlockToken不能为空"),
    FAIL_UNLOCKTYPE_NOTNULL("10014", "参数unlockType不能为空"),
    FAIL_GRADECODE_NOTNULL("10015", "参数gradeCode不能为空"),
    FAIL_TARGET_SCORE_NOTNULL("10016", "参数targetScore不能为空"),
    FAIL_BACK_OFF_TYPE_NOTNULL("10017", "参数backOffType不能为空"),
    FAIL_SCENE_CODE_NOTNULL("100018", "参数sceneCode不能为空"),
    FAIL_SCORE_OVERDUE("20001", "积分已过期"),
    FAIL_NO_AVAILABLE_SCORE("20002", "无可用积分"),
    FAIL_NO_UNEFFECTIVE_SCORE("20003", "无待生效积分"),
    FAIL_NO_OVERDUE_SCORE("20004", "无过期积分"),
    FAIL_NO_LOCKED_SCORE("20005", "无锁定积分"),
    FAIL_NO_SCORE_ACCOUNT("30001", "未开通积分账户"),
    FAIL_SCORE_ACCOUNT_ABNORMAL("30002", "积分账户异常"),
    FAIL_SCORE_ACCOUNT_LOCKED("30003", "积分账户已锁定"),
    SCENE_NO_EXIT("41001", "场景code不存在"),
    SCENE_INVALID("41002", "场景不在有效期内"),
    SCENE_DISABLE("41003", "场景已停用"),
    SCENE_TYPE_FAIL("41004", "场景类型错误"),
    BIZTYPE_NO_EXIT("42001", "业务类型不存在"),
    BIZTYPE_INVALID("42002", "业务不在有效期内"),
    BIZTYPE_DISABLE("42003", "业务已停用"),
    BIZTYPE_SCORE_STOCK_LIMIT("42004", "增加积分已达上限"),
    BIZTYPE_SCORE_TIMES_LIMIT("42005", "增加积分次数已达上限"),
    UN_RECEIVE_SCORE("43001", "无待领取积分"),
    SCORE_DETAIL_LOCK_AND_UN_RECEIVE("44001", "积分流水锁定并且未领取");

    public String code;
    public String msg;

    private RpcStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}