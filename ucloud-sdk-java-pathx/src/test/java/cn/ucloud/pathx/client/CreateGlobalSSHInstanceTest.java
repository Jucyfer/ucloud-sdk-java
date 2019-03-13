package cn.ucloud.pathx.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.pathx.model.CreateGlobalSSHInstanceParam;
import cn.ucloud.pathx.model.CreateGlobalSSHInstanceResult;
import cn.ucloud.pathx.pojo.PATHXConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : PATHX.CreateGlobalSSHInstance 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class CreateGlobalSSHInstanceTest {

    private PATHXClient client;

    private CreateGlobalSSHInstanceParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultPATHXClient(new PATHXConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String projectId = "cn-sh2";
        String area = "cn-sh2";
        String targetIP = "cn-sh2";
        Integer port = 1;
        String areaCode = "cn-sh2";
        param = new CreateGlobalSSHInstanceParam(projectId, area, targetIP, port, areaCode);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createGlobalSSHInstance() {
        try {
            CreateGlobalSSHInstanceResult result = client.createGlobalSSHInstance(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}