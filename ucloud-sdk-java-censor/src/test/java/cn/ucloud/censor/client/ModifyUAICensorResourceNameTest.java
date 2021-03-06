package cn.ucloud.censor.client;

import cn.ucloud.censor.model.ModifyUAICensorResourceNameParam;
import cn.ucloud.censor.model.ModifyUAICensorResourceNameResult;
import cn.ucloud.censor.pojo.CensorConfig;
import cn.ucloud.common.pojo.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-17 14:36
 **/
public class ModifyUAICensorResourceNameTest {

    private CensorClient client;

    private ModifyUAICensorResourceNameParam param;

    @Before
    public void setUp() throws Exception {
        client = new DefaultCensorClient(new CensorConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String projectId = System.getenv("ProjectId");
        String region = "cn-bj2";
        String zone = "cn-bj2-04";
        String resourceId = "uaicensor-42yuglvf";
        String resourceName = "demoName";
        param = new ModifyUAICensorResourceNameParam(region, zone, resourceId, resourceName);
        param.setProjectId(projectId);
    }

    @Test
    public void modifyUAICensorResourceName() {
        try {
            ModifyUAICensorResourceNameResult result =
                    client.modifyUAICensorResourceName(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}