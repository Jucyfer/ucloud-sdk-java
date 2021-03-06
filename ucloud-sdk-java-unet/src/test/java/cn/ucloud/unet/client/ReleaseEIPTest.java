package cn.ucloud.unet.client;

import cn.ucloud.unet.model.ReleaseEIPParam;
import cn.ucloud.unet.model.ReleaseEIPResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 11:19
 **/
public class ReleaseEIPTest {


    private UnetClient client;

    private ReleaseEIPParam param;

    @Before
    public void initData() {
        client = UnetClients.getDefaultInstance(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new ReleaseEIPParam("cn-sh2", "eip-243oe1tx");
    }

    @Test
    public void releaseEIP() {
        try {
            ReleaseEIPResult releaseEIPResult = client.releaseEIP(param);
            JSONComparator.jsonComparator(releaseEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}