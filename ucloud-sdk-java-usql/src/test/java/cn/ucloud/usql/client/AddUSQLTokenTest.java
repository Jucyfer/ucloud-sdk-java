package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.AddUSQLTokenParam;
import cn.ucloud.usql.model.AddUSQLTokenResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.AddUSQLToken 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class AddUSQLTokenTest {

    private USQLClient client;

    private AddUSQLTokenParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String dataSource = "cn-sh2";
        String accessKeyId = "cn-sh2";
        String accessKeySecret = "cn-sh2";
        param = new AddUSQLTokenParam(region, dataSource, accessKeyId, accessKeySecret);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void addUSQLToken() {
        try {
            AddUSQLTokenResult result = client.addUSQLToken(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void addUSQLTokenCallback() {
        client.addUSQLToken(param, new UcloudHandler
                <AddUSQLTokenResult>() {
            @Override
            public Object success(AddUSQLTokenResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(AddUSQLTokenResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object error(Exception e) {
                assertNull(e);
                return null;
            }
        }, false);
    }
}