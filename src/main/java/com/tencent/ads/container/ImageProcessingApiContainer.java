/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.api.ImageProcessingApi;
import com.tencent.ads.model.ImageProcessingAddRequest;
import com.tencent.ads.model.ImageProcessingAddResponse;
import com.tencent.ads.model.ImageProcessingAddResponseData;


public class ImageProcessingApiContainer extends ApiContainer {

  @Inject
  ImageProcessingApi api;


  /**
   * 进行图片处理
   *
   * @param data (required)
   * @return ImageProcessingAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ImageProcessingAddResponseData imageProcessingAdd(ImageProcessingAddRequest data)
      throws ApiException {
    ImageProcessingAddResponse resp = api.imageProcessingAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}