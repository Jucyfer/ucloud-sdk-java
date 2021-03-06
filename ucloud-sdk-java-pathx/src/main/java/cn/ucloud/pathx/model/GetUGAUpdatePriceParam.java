package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @Description : 获取UGA更新价格 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class GetUGAUpdatePriceParam extends BaseRequestParam {
    /**
     *
     */
    @UcloudParam("UPathNum")
    @NotNull(message = "uPathNum can not be null")
    private Integer uPathNum;
    /**
     *
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;



    public GetUGAUpdatePriceParam(String projectId
            , Integer uPathNum,String resourceId
    ) {
        super("GetUGAUpdatePrice");
        this.projectId = projectId;
        this.uPathNum = uPathNum;
        this.resourceId = resourceId;
    }

    public Integer getuPathNum() {
        return this.uPathNum;
    }

    public void setuPathNum(Integer uPathNum) {
        this.uPathNum = uPathNum;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


}