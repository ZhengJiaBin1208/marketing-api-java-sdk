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


package com.tencent.ads.api;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.WechatLeadsGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatLeadsApi {

  private ApiClient apiClient;

  public WechatLeadsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WechatLeadsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for wechatLeadsGet
   *
   * @param dateRange (optional)
   * @param timeRange (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public com.squareup.okhttp.Call wechatLeadsGetCall(Map<String, Object> dateRange,
      Map<String, Object> timeRange, List<FilteringStruct> filtering, Long page, Long pageSize,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/wechat_leads/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dateRange != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("date_range", dateRange));
    }
    if (timeRange != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("time_range", timeRange));
    }
    if (filtering != null) {
      localVarCollectionQueryParams
          .addAll(apiClient.parameterToPairs("multi", "filtering", filtering));
    }
    if (page != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
    }
    if (pageSize != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    }
    if (fields != null) {
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
        "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
        @Override
        public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
            throws IOException {
          com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
          return originalResponse.newBuilder()
              .body(new ProgressResponseBody(originalResponse.body(), progressListener))
              .build();
        }
      });
    }

    String[] localVarAuthNames = new String[]{"accessToken", "nonce", "timestamp"};
    return apiClient
        .buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
            localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames,
            progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private com.squareup.okhttp.Call wechatLeadsGetValidateBeforeCall(Map<String, Object> dateRange,
      Map<String, Object> timeRange, List<FilteringStruct> filtering, Long page, Long pageSize,
      List<String> fields, final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    com.squareup.okhttp.Call call = wechatLeadsGetCall(dateRange, timeRange, filtering, page,
        pageSize, fields, progressListener, progressRequestListener);
    return call;

  }

  /**
   * 获取销售线索
   *
   * @param dateRange (optional)
   * @param timeRange (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return WechatLeadsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public WechatLeadsGetResponse wechatLeadsGet(Map<String, Object> dateRange,
      Map<String, Object> timeRange, List<FilteringStruct> filtering, Long page, Long pageSize,
      List<String> fields) throws ApiException {
    ApiResponse<WechatLeadsGetResponse> resp = wechatLeadsGetWithHttpInfo(dateRange, timeRange,
        filtering, page, pageSize, fields);
    return resp.getData();
  }

  /**
   * 获取销售线索
   *
   * @param dateRange (optional)
   * @param timeRange (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;WechatLeadsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ApiResponse<WechatLeadsGetResponse> wechatLeadsGetWithHttpInfo(
      Map<String, Object> dateRange, Map<String, Object> timeRange, List<FilteringStruct> filtering,
      Long page, Long pageSize, List<String> fields) throws ApiException {
    com.squareup.okhttp.Call call = wechatLeadsGetValidateBeforeCall(dateRange, timeRange,
        filtering, page, pageSize, fields, null, null);
    Type localVarReturnType = new TypeToken<WechatLeadsGetResponse>() {
    }.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取销售线索 (asynchronously)
   *
   * @param dateRange (optional)
   * @param timeRange (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public com.squareup.okhttp.Call wechatLeadsGetAsync(Map<String, Object> dateRange,
      Map<String, Object> timeRange, List<FilteringStruct> filtering, Long page, Long pageSize,
      List<String> fields, final ApiCallback<WechatLeadsGetResponse> callback) throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener = new ProgressResponseBody.ProgressListener() {
        @Override
        public void update(long bytesRead, long contentLength, boolean done) {
          callback.onDownloadProgress(bytesRead, contentLength, done);
        }
      };

      progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
        @Override
        public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
          callback.onUploadProgress(bytesWritten, contentLength, done);
        }
      };
    }

    com.squareup.okhttp.Call call = wechatLeadsGetValidateBeforeCall(dateRange, timeRange,
        filtering, page, pageSize, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<WechatLeadsGetResponse>() {
    }.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}