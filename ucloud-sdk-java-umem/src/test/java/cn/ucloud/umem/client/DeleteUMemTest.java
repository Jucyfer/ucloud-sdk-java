package cn.ucloud.umem.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.umem.model.DeleteUMemParam;
import cn.ucloud.umem.model.DeleteUMemResult;
import cn.ucloud.umem.pojo.UMEMConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : UMEM.DeleteUMem 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-15 10:00
 **/
public class DeleteUMemTest {

    private UMEMClient client;

    private DeleteUMemParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUMEMClient(new UMEMConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        String region = "cn-sh2";
        String resourceId = "umem-lqkn30ev";
        String resourceType = "distributed";
        param = new DeleteUMemParam(region, resourceId, resourceType);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void deleteUMem() {
        try {
            DeleteUMemResult result = client.deleteUMem(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

}