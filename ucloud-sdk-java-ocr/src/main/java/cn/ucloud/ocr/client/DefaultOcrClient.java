package cn.ucloud.ocr.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.common.pojo.UcloudConfig;
import cn.ucloud.ocr.model.CreateUAIOcrResourceParam;
import cn.ucloud.ocr.model.CreateUAIOcrResourceResult;
import cn.ucloud.ocr.model.DeleteUAIOcrResourceParam;
import cn.ucloud.ocr.model.DeleteUAIOcrResourceResult;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeParam;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeResult;
import cn.ucloud.ocr.model.GetUAIOcrResourceListParam;
import cn.ucloud.ocr.model.GetUAIOcrResourceListResult;
import cn.ucloud.ocr.model.GetUAIOcrResourceRecordInfoParam;
import cn.ucloud.ocr.model.GetUAIOcrResourceRecordInfoResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceNameParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceNameResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceOssInfoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceOssInfoResult;

/**
 * @Description : 默认ocr 客户端
 * @Author : codezhang
 * @Date : 2019-04-19 15:25
 **/
public class DefaultOcrClient extends DefaultUcloudClient implements OcrClient {

    public DefaultOcrClient(UcloudConfig config) {
        super(config);
    }

    @Override
    public DeleteUAIOcrResourceResult
    deleteUAIOcrResource(DeleteUAIOcrResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteUAIOcrResourceResult.class);
        return (DeleteUAIOcrResourceResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteUAIOcrResource(DeleteUAIOcrResourceParam param,
                                     UcloudHandler<DeleteUAIOcrResourceResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteUAIOcrResourceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAIOcrResourceRecordInfoResult
    getUAIOcrResourceRecordInfo(GetUAIOcrResourceRecordInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAIOcrResourceRecordInfoResult.class);
        return (GetUAIOcrResourceRecordInfoResult) http.doPost(param, config, null);
    }

    @Override
    public void getUAIOcrResourceRecordInfo(GetUAIOcrResourceRecordInfoParam param,
                                            UcloudHandler<GetUAIOcrResourceRecordInfoResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAIOcrResourceRecordInfoResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAIOcrResourceOssInfoResult
    modifyUAIOcrResourceOssInfo(ModifyUAIOcrResourceOssInfoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAIOcrResourceOssInfoResult.class);
        return (ModifyUAIOcrResourceOssInfoResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyUAIOcrResourceOssInfo(ModifyUAIOcrResourceOssInfoParam param,
                                            UcloudHandler<ModifyUAIOcrResourceOssInfoResult> handler,
                                            Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAIOcrResourceOssInfoResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAIOcrResourceNameResult
    modifyUAIOcrResourceName(ModifyUAIOcrResourceNameParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAIOcrResourceNameResult.class);
        return (ModifyUAIOcrResourceNameResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyUAIOcrResourceName(ModifyUAIOcrResourceMemoParam param,
                                         UcloudHandler<ModifyUAIOcrResourceNameResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAIOcrResourceNameResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ModifyUAIOcrResourceMemoResult
    modifyUAIOcrResourceMemo(ModifyUAIOcrResourceMemoParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAIOcrResourceMemoResult.class);
        return (ModifyUAIOcrResourceMemoResult) http.doPost(param, config, null);
    }

    @Override
    public void modifyUAIOcrResourceMemo(ModifyUAIOcrResourceMemoParam param,
                                         UcloudHandler<ModifyUAIOcrResourceMemoResult> handler,
                                         Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyUAIOcrResourceMemoResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAIOcrResourceListResult
    getUAIOcrResourceList(GetUAIOcrResourceListParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAIOcrResourceListResult.class);
        return (GetUAIOcrResourceListResult) http.doPost(param, config, null);
    }

    @Override
    public void getUAIOcrResourceList(GetUAIOcrResourceListParam param,
                                      UcloudHandler<GetUAIOcrResourceListResult> handler,
                                      Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAIOcrResourceListResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateUAIOcrResourceResult createUAIOcrResource(CreateUAIOcrResourceParam param)
            throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateUAIOcrResourceResult.class);
        return (CreateUAIOcrResourceResult) http.doPost(param, config, null);
    }

    @Override
    public void createUAIOcrResource(CreateUAIOcrResourceParam param,
                                     UcloudHandler<CreateUAIOcrResourceResult> handler,
                                     Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateUAIOcrResourceResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public GetUAIOcrAvailResourceTypeResult
    getUAIOcrAvailResourceType(GetUAIOcrAvailResourceTypeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(GetUAIOcrAvailResourceTypeResult.class);
        return (GetUAIOcrAvailResourceTypeResult) http.doPost(param, config, null);
    }

    @Override
    public void getUAIOcrAvailResourceType(GetUAIOcrAvailResourceTypeParam param,
                                           UcloudHandler<GetUAIOcrAvailResourceTypeResult> handler,
                                           Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(GetUAIOcrAvailResourceTypeResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
