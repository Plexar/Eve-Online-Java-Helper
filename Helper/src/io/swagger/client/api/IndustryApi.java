

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.GetIndustryFacilities200Ok;
import io.swagger.client.model.GetIndustryFacilitiesInternalServerError;
import io.swagger.client.model.GetIndustrySystems200Ok;
import io.swagger.client.model.GetIndustrySystemsInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndustryApi {
    private ApiClient apiClient;

    public IndustryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IndustryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getIndustryFacilities */
    private com.squareup.okhttp.Call getIndustryFacilitiesCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/industry/facilities/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List industry facilities
     * Return a list of industry facilities  ---  Alternate route: &#x60;/v1/industry/facilities/&#x60;  Alternate route: &#x60;/latest/industry/facilities/&#x60;  Alternate route: &#x60;/dev/industry/facilities/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetIndustryFacilities200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetIndustryFacilities200Ok> getIndustryFacilities(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetIndustryFacilities200Ok>> resp = getIndustryFacilitiesWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List industry facilities
     * Return a list of industry facilities  ---  Alternate route: &#x60;/v1/industry/facilities/&#x60;  Alternate route: &#x60;/latest/industry/facilities/&#x60;  Alternate route: &#x60;/dev/industry/facilities/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetIndustryFacilities200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetIndustryFacilities200Ok>> getIndustryFacilitiesWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getIndustryFacilitiesCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetIndustryFacilities200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List industry facilities (asynchronously)
     * Return a list of industry facilities  ---  Alternate route: &#x60;/v1/industry/facilities/&#x60;  Alternate route: &#x60;/latest/industry/facilities/&#x60;  Alternate route: &#x60;/dev/industry/facilities/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIndustryFacilitiesAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetIndustryFacilities200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIndustryFacilitiesCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetIndustryFacilities200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getIndustrySystems */
    private com.squareup.okhttp.Call getIndustrySystemsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/industry/systems/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List solar system cost indices
     * Return cost indices for solar systems  ---  Alternate route: &#x60;/v1/industry/systems/&#x60;  Alternate route: &#x60;/latest/industry/systems/&#x60;  Alternate route: &#x60;/dev/industry/systems/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetIndustrySystems200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetIndustrySystems200Ok> getIndustrySystems(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetIndustrySystems200Ok>> resp = getIndustrySystemsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List solar system cost indices
     * Return cost indices for solar systems  ---  Alternate route: &#x60;/v1/industry/systems/&#x60;  Alternate route: &#x60;/latest/industry/systems/&#x60;  Alternate route: &#x60;/dev/industry/systems/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetIndustrySystems200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetIndustrySystems200Ok>> getIndustrySystemsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getIndustrySystemsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetIndustrySystems200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List solar system cost indices (asynchronously)
     * Return cost indices for solar systems  ---  Alternate route: &#x60;/v1/industry/systems/&#x60;  Alternate route: &#x60;/latest/industry/systems/&#x60;  Alternate route: &#x60;/dev/industry/systems/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIndustrySystemsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetIndustrySystems200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIndustrySystemsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetIndustrySystems200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
