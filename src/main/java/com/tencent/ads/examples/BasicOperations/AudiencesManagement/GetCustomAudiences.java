package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomAudiencesGetResponseData;
import java.util.Arrays;


/*****
 * 本文件提供了一个获取客户人群(Custom audience)列表的简单示例
 */
public class GetCustomAudiences {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE_ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
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

  public CustomAudiencesGetResponseData getCustomAudiences() throws Exception {
    CustomAudiencesGetResponseData response = tencentAds.customAudiences()
        .customAudiencesGet(ACCOUNT_ID, AUDIENCE_ID,
            null, null, null, Arrays
                .asList("audience_id", "account_id", "name", "external_audience_id", "description",
                    "type", "status", "error_code", "user_count", "created_time",
                    "last_modified_time",
                    "audience_spec"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetCustomAudiences getCustomAudiences = new GetCustomAudiences();
      getCustomAudiences.init();
      CustomAudiencesGetResponseData response = getCustomAudiences.getCustomAudiences();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}