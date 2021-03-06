package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

public class GetDynamicAdTemplates {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public Long dynamicAdTemplateWidth = 1280L;

  public Long dynamicAdTemplateHeight = 720L;

  public String dynamicAdTemplateType = "DYNAMIC_AD_IMAGE_TEMPLATE";

  public String dynamicAdTemplateOwnershipType = "PRIVATE_TEMPLATE";

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "dynamic_ad_template_id",
          "dynamic_ad_template_name",
          "dynamic_ad_template_type",
          "product_item_display_quantity",
          "dynamic_ad_template_width",
          "dynamic_ad_template_height",
          "image_url",
          "video_url");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public DynamicAdTemplatesGetResponseData getDynamicAdTemplates() throws Exception {
    DynamicAdTemplatesGetResponseData response =
        tencentAds
            .dynamicAdTemplates()
            .dynamicAdTemplatesGet(
                accountId,
                productCatalogId,
                dynamicAdTemplateWidth,
                dynamicAdTemplateHeight,
                dynamicAdTemplateType,
                dynamicAdTemplateOwnershipType,
                filtering,
                page,
                pageSize,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetDynamicAdTemplates getDynamicAdTemplates = new GetDynamicAdTemplates();
      getDynamicAdTemplates.init();
      DynamicAdTemplatesGetResponseData response = getDynamicAdTemplates.getDynamicAdTemplates();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
