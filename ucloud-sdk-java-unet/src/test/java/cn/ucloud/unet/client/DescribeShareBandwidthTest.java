package cn.ucloud.unet.client;

import cn.ucloud.unet.model.DescribeShareBandwidthParam;
import cn.ucloud.unet.model.DescribeShareBandwidthResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-27 17:16
 **/
public class DescribeShareBandwidthTest {

    private UnetClient client;

    private DescribeShareBandwidthParam param;

    @Before
    public void initData() {
        client = UnetClients.getDefaultInstance(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));
        param = new DescribeShareBandwidthParam("cn-sh2");
    }

    @Test
    public void describeShareBandwidth() {
        try {
            DescribeShareBandwidthResult describeShareBandwidthResult = client.describeShareBandwidth(param);
            JSONComparator.jsonComparator(describeShareBandwidthResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}