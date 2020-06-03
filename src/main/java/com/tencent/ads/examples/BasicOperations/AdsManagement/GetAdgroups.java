package com.tencent.ads.examples.BasicOperations.AdsManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AdgroupsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取广告组(Adgroup)列表的简单示例
 **/
public class GetAdgroups {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }


  public AdgroupsGetResponseData getAdgroups() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<FilteringStruct> filtering = new ArrayList<>();
    Long page = null;
    Long pageSize = null;
    Boolean isDeleted = null;
    List<String> fields = Arrays.asList("adgroup_id", "campaign_id", "adgroup_name");
    FilteringStruct filter = new FilteringStruct().field("promoted_object_type").operator("EQUALS")
        .values(Arrays.asList("PROMOTED_OBJECT_TYPE_APP_IOS"));
    filtering.add(filter);
    AdgroupsGetResponseData response = tencentAds.adgroups()
        .adgroupsGet(accountId, filtering, page, pageSize, isDeleted, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdgroups getAdgroups = new GetAdgroups();
      getAdgroups.init();
      AdgroupsGetResponseData response = getAdgroups.getAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}