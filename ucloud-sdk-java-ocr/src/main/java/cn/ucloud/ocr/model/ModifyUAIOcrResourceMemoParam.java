package cn.ucloud.ocr.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 修改UAI-OCR资源备注
 * @Author : codezhang
 * @Date : 2019-04-19 16:00
 **/
public class ModifyUAIOcrResourceMemoParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表]
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表]
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * 待修改的资源ID
     */
    @NotEmpty(message = "resourceId can not be empty")
    @UcloudParam("ResourceId")
    private String resourceId;

    /**
     * 修改后的资源备注名称
     */
    @NotEmpty(message = "resourceMemo can not be empty")
    @UcloudParam("ResourceMemo")
    private String resourceMemo;

    public ModifyUAIOcrResourceMemoParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "resourceId can not be empty") String resourceId,
                                         @NotEmpty(message = "resourceMemo can not be empty") String resourceMemo) {
        super("ModifyUAIOcrResourceMemo");
        this.region = region;
        this.resourceId = resourceId;
        this.resourceMemo = resourceMemo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceMemo() {
        return resourceMemo;
    }

    public void setResourceMemo(String resourceMemo) {
        this.resourceMemo = resourceMemo;
    }
}
