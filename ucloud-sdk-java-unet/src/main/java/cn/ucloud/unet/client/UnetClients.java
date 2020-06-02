package cn.ucloud.unet.client;

import cn.ucloud.common.pojo.Account;
import cn.ucloud.unet.pojo.UnetConfig;

/**
 * UnetClient的工厂类
 * @author jucyfer
 */
public abstract class UnetClients {
    /**
     * 根据公私钥创建默认实现
     * @param privateKey 私钥
     * @param publicKey 公钥
     * @return
     */
    public static UnetClient getDefaultInstance(String privateKey,String publicKey){
        return new DefaultUnetClient(new UnetConfig(new Account(privateKey,publicKey)));
    }

    /**
     * 根据指定Account创建默认实现
     * @param account {@link cn.ucloud.common.pojo.Account}对象
     * @return
     */
    public static UnetClient getDefaultInstance(Account account){
        return new DefaultUnetClient(new UnetConfig(account));
    }

    /**
     * 根据指定UnetConfig创建默认实现
     * @param unetConfig {@link cn.ucloud.unet.pojo.UnetConfig}对象
     * @return
     */
    public static UnetClient getDefaultInstance(UnetConfig unetConfig){
        return new DefaultUnetClient(unetConfig);
    }
}
