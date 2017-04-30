

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

import io.swagger.client.model.GetInsurancePrices200Ok;
import io.swagger.client.model.GetInsurancePricesInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsuranceApi {
    private ApiClient apiClient;

    public InsuranceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InsuranceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getInsurancePrices */
    private com.squareup.okhttp.Call getInsurancePricesCall(String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/insurance/prices/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
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
     * List insurance levels
     * Return available insurance levels for all ship types  ---  Alternate route: &#x60;/v1/insurance/prices/&#x60;  Alternate route: &#x60;/latest/insurance/prices/&#x60;  Alternate route: &#x60;/dev/insurance/prices/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetInsurancePrices200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetInsurancePrices200Ok> getInsurancePrices(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetInsurancePrices200Ok>> resp = getInsurancePricesWithHttpInfo(datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List insurance levels
     * Return available insurance levels for all ship types  ---  Alternate route: &#x60;/v1/insurance/prices/&#x60;  Alternate route: &#x60;/latest/insurance/prices/&#x60;  Alternate route: &#x60;/dev/insurance/prices/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetInsurancePrices200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetInsurancePrices200Ok>> getInsurancePricesWithHttpInfo(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getInsurancePricesCall(datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetInsurancePrices200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List insurance levels (asynchronously)
     * Return available insurance levels for all ship types  ---  Alternate route: &#x60;/v1/insurance/prices/&#x60;  Alternate route: &#x60;/latest/insurance/prices/&#x60;  Alternate route: &#x60;/dev/insurance/prices/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInsurancePricesAsync(String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<List<GetInsurancePrices200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInsurancePricesCall(datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetInsurancePrices200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
