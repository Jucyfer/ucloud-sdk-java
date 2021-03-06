package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 获取防火墙信息  参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:14
 */
public class DescribeFirewallParam extends BaseRequestParam {
    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 防火墙ID，默认为返回所有防火墙
     */
    @UcloudParam("FWId")
    private String fwId;

    /**
     * optional 绑定防火墙组的资源类型，如uhost
     */
    @UcloudParam("ResourceType")
    private String resourceType;

    /**
     * optional 绑定防火墙组的资源ID
     */
    @UcloudParam("ResourceId")
    private String resourceId;

    /**
     * optional 返回数据长度，默认为20，最大10000000
     */
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * optional 列表起始位置偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    public DescribeFirewallParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeFirewall");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
