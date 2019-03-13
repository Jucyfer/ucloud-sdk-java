package cn.ucloud.usql.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.usql.model.CreateCatalogDatabaseParam;
import cn.ucloud.usql.model.CreateCatalogDatabaseResult;
import cn.ucloud.usql.pojo.USQLConfig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;


/**
 * @Description : USQL.CreateCatalogDatabase 测试
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class CreateCatalogDatabaseTest {

    private USQLClient client;

    private CreateCatalogDatabaseParam param;


    @Before
    public void setUp() throws Exception {
        client = new DefaultUSQLClient(new USQLConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        String region = "cn-sh2";
        String databaseName = "cn-sh2";
        param = new CreateCatalogDatabaseParam(region, databaseName);
        param.setProjectId("org-izug1m");
    }


    @Test
    public void createCatalogDatabase() {
        try {
            CreateCatalogDatabaseResult result = client.createCatalogDatabase(param);
            JSONComparator.jsonComparator(result);
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    public void createCatalogDatabaseCallback() {
        client.createCatalogDatabase(param, new UcloudHandler
                <CreateCatalogDatabaseResult>() {
            @Override
            public Object success(CreateCatalogDatabaseResult result) {
                JSONComparator.jsonComparator(result);
                return null;
            }

            @Override
            public Object failed(CreateCatalogDatabaseResult result) {
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