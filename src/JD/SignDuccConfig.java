package JD;

import com.sun.deploy.util.StringUtils;

import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName SignDuccConfig
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/9/8 21:37
 */
public class SignDuccConfig {
    /*public void initSignInfo(Properties properties) {
        String sourceIdWhiteList = properties.getProperty("sourceIdWhiteList");
        String signtureMapJson = properties.getProperty("signatureMap");
        Map<String, Signature> signatureMap = GsonUtils.fromJson(signtureMapJson, new TypeToken<Map<String, Signature>>() {
        });
        if (StringUtils.isNotBlank(sourceIdWhiteList)) {
            SignHelper.setSourceIdWHiteList(SourceIdWhiteList);
        }
        if (!CollectionUtils.isEmpty(signatureMap)){
            SignHelper.setSignatureMap(signatureMap);
        }
    }

    //积分等级
    public void  initScoreGradeEnum(Properties propreties){
        if (null==propreties){
            return;
        }
        String str = propreties.getProperty("ScoreGradeEnum");
        List<ScoreEnumVo> scoreEnumVoList = new Gson().fromJson(str,new TypeToken<ArrayList<ScoreEnumVo>>(){}.getType())
        ScoreGradeEnum.setScoreGradeEnumList(scoreEnumVoList);


    }
*/
}