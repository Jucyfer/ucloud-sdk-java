package cn.ucloud.unet.client;

import cn.ucloud.unet.model.DescribeFirewallResourceParam;
import cn.ucloud.unet.model.DescribeFirewallResourceResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 18:00
 */
public class DescribeFirewallResourceTest {
    private UnetClient client;

    private DescribeFirewallResourceParam param;

    @Before
    public void initData() {
        client = UnetClients.getDefaultInstance(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));

        param = new DescribeFirewallResourceParam("cn-sh2", "firewall-xujipdz3");
    }

    @Test
    public void describeFirewallResource() {
        try {
            DescribeFirewallResourceResult allocateEIPResult = client.describeFirewallResource(param);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
