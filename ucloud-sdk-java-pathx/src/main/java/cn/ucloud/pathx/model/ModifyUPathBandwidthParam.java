package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 修改加速线路带宽 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class ModifyUPathBandwidthParam extends BaseRequestParam {
    /**
     * 加速线路Id
     */
    @UcloudParam("UPathId")
    @NotEmpty(message = "uPathId can not be empty")
    private String uPathId;
    /**
     * 带宽
     */
    @UcloudParam("Bandwidth")
    @NotNull(message = "bandwidth can not be null")
    private Integer bandwidth;


    public ModifyUPathBandwidthParam(String projectId
            , String uPathId
            , Integer bandwidth
    ) {
        super("ModifyUPathBandwidth");
        this.projectId = projectId;
        this.uPathId = uPathId;
        this.bandwidth = bandwidth;
    }


    public String getuPathId() {
        return this.uPathId;
    }

    public void setuPathId(String uPathId) {
        this.uPathId = uPathId;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }
}