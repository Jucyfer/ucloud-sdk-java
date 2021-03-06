package cn.ucloud.unet.client;

import cn.ucloud.unet.model.CreateFirewallParam;
import cn.ucloud.unet.model.CreateFirewallResult;
import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 14:06
 */
public class CreateFirewallTest {
    private UnetClient client;

    private CreateFirewallParam param;

    @Before
    public void initData() {
        client = UnetClients.getDefaultInstance(new UnetConfig(
                new Account(System.getenv("UCloudPrivateKey"),
                        System.getenv("UCloudPublicKey"))));

        List<CreateFirewallParam.Rule> rules = new ArrayList<>();
        rules.add(new CreateFirewallParam.Rule("TCP", "22", "120.132.8.183", "ACCEPT", "LOW","TEST_REMARK"));
        param = new CreateFirewallParam("cn-sh2", rules, "Firewall-test");
    }

    @Test
    public void createFirewall() {
        try {
            CreateFirewallResult allocateEIPResult = client.createFirewall(param);
            JSONComparator.jsonComparator(allocateEIPResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
