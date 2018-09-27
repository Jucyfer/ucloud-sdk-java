package cn.ucloud.client;

import cn.ucloud.model.AllocateShareBandwidthParam;
import cn.ucloud.model.AllocateShareBandwidthResult;
import cn.ucloud.pojo.Account;
import cn.ucloud.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 16:47
 **/
public class AllocateShareBandwidthTest {

    private UnetClient client;

    private AllocateShareBandwidthParam param;

    @Before
    public void initData() {
        client = new DefaultUnetClient(new UnetConfig(
                new Account(System.getenv("UcloudPrivateKey"),
                        System.getenv("UcloudPublicKey"))));
        param = new AllocateShareBandwidthParam("cn-bj2","sdk-java-shareBandwidth","Dynamic",24);
        param.setProjectId("org-4nfe1i");
    }

    @Test
    public void allocateShareBandwidth() {
        try {
            AllocateShareBandwidthResult allocateShareBandwidthResult = client.allocateShareBandwidth(param);
            System.out.println(allocateShareBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}