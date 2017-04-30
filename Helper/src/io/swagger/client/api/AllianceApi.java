

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

import io.swagger.client.model.GetAlliancesAllianceIdCorporationsInternalServerError;
import io.swagger.client.model.GetAlliancesAllianceIdIconsInternalServerError;
import io.swagger.client.model.GetAlliancesAllianceIdIconsNotFound;
import io.swagger.client.model.GetAlliancesAllianceIdIconsOk;
import io.swagger.client.model.GetAlliancesAllianceIdInternalServerError;
import io.swagger.client.model.GetAlliancesAllianceIdOk;
import io.swagger.client.model.GetAlliancesInternalServerError;
import io.swagger.client.model.GetAlliancesNames200Ok;
import io.swagger.client.model.GetAlliancesNamesInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllianceApi {
    private ApiClient apiClient;

    public AllianceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AllianceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getAlliances */
    private com.squareup.okhttp.Call getAlliancesCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/alliances/".replaceAll("\\{format\\}","json");

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
     * List all alliances
     * List all active player alliances  ---  Alternate route: &#x60;/v1/alliances/&#x60;  Alternate route: &#x60;/latest/alliances/&#x60;  Alternate route: &#x60;/dev/alliances/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getAlliances(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getAlliancesWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List all alliances
     * List all active player alliances  ---  Alternate route: &#x60;/v1/alliances/&#x60;  Alternate route: &#x60;/latest/alliances/&#x60;  Alternate route: &#x60;/dev/alliances/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getAlliancesWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getAlliancesCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all alliances (asynchronously)
     * List all active player alliances  ---  Alternate route: &#x60;/v1/alliances/&#x60;  Alternate route: &#x60;/latest/alliances/&#x60;  Alternate route: &#x60;/dev/alliances/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlliancesAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlliancesCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAlliancesAllianceId */
    private com.squareup.okhttp.Call getAlliancesAllianceIdCall(Integer allianceId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException("Missing the required parameter 'allianceId' when calling getAlliancesAllianceId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/alliances/{alliance_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "alliance_id" + "\\}", apiClient.escapeString(allianceId.toString()));

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
     * Get alliance information
     * Public information about an alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/&#x60; 
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetAlliancesAllianceIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAlliancesAllianceIdOk getAlliancesAllianceId(Integer allianceId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetAlliancesAllianceIdOk> resp = getAlliancesAllianceIdWithHttpInfo(allianceId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get alliance information
     * Public information about an alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/&#x60; 
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetAlliancesAllianceIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAlliancesAllianceIdOk> getAlliancesAllianceIdWithHttpInfo(Integer allianceId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getAlliancesAllianceIdCall(allianceId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetAlliancesAllianceIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get alliance information (asynchronously)
     * Public information about an alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/&#x60; 
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlliancesAllianceIdAsync(Integer allianceId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetAlliancesAllianceIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlliancesAllianceIdCall(allianceId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAlliancesAllianceIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAlliancesAllianceIdCorporations */
    private com.squareup.okhttp.Call getAlliancesAllianceIdCorporationsCall(Integer allianceId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException("Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdCorporations(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/alliances/{alliance_id}/corporations/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "alliance_id" + "\\}", apiClient.escapeString(allianceId.toString()));

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
     * List alliance&#39;s corporations
     * List all current member corporations of an alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/latest/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/dev/alliances/{alliance_id}/corporations/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getAlliancesAllianceIdCorporations(Integer allianceId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getAlliancesAllianceIdCorporationsWithHttpInfo(allianceId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List alliance&#39;s corporations
     * List all current member corporations of an alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/latest/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/dev/alliances/{alliance_id}/corporations/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getAlliancesAllianceIdCorporationsWithHttpInfo(Integer allianceId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getAlliancesAllianceIdCorporationsCall(allianceId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List alliance&#39;s corporations (asynchronously)
     * List all current member corporations of an alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/latest/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/dev/alliances/{alliance_id}/corporations/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlliancesAllianceIdCorporationsAsync(Integer allianceId, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlliancesAllianceIdCorporationsCall(allianceId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAlliancesAllianceIdIcons */
    private com.squareup.okhttp.Call getAlliancesAllianceIdIconsCall(Integer allianceId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException("Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdIcons(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/alliances/{alliance_id}/icons/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "alliance_id" + "\\}", apiClient.escapeString(allianceId.toString()));

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
     * Get alliance icon
     * Get the icon urls for a alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/latest/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/dev/alliances/{alliance_id}/icons/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetAlliancesAllianceIdIconsOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAlliancesAllianceIdIconsOk getAlliancesAllianceIdIcons(Integer allianceId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetAlliancesAllianceIdIconsOk> resp = getAlliancesAllianceIdIconsWithHttpInfo(allianceId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get alliance icon
     * Get the icon urls for a alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/latest/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/dev/alliances/{alliance_id}/icons/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetAlliancesAllianceIdIconsOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAlliancesAllianceIdIconsOk> getAlliancesAllianceIdIconsWithHttpInfo(Integer allianceId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getAlliancesAllianceIdIconsCall(allianceId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetAlliancesAllianceIdIconsOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get alliance icon (asynchronously)
     * Get the icon urls for a alliance  ---  Alternate route: &#x60;/v1/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/latest/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/dev/alliances/{alliance_id}/icons/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceId An EVE alliance ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlliancesAllianceIdIconsAsync(Integer allianceId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetAlliancesAllianceIdIconsOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlliancesAllianceIdIconsCall(allianceId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAlliancesAllianceIdIconsOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAlliancesNames */
    private com.squareup.okhttp.Call getAlliancesNamesCall(List<Long> allianceIds, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'allianceIds' is set
        if (allianceIds == null) {
            throw new ApiException("Missing the required parameter 'allianceIds' when calling getAlliancesNames(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/alliances/names/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (allianceIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "alliance_ids", allianceIds));
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
     * Get alliance names
     * Resolve a set of alliance IDs to alliance names  ---  Alternate route: &#x60;/v1/alliances/names/&#x60;  Alternate route: &#x60;/latest/alliances/names/&#x60;  Alternate route: &#x60;/dev/alliances/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceIds A comma separated list of alliance IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetAlliancesNames200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetAlliancesNames200Ok> getAlliancesNames(List<Long> allianceIds, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetAlliancesNames200Ok>> resp = getAlliancesNamesWithHttpInfo(allianceIds, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get alliance names
     * Resolve a set of alliance IDs to alliance names  ---  Alternate route: &#x60;/v1/alliances/names/&#x60;  Alternate route: &#x60;/latest/alliances/names/&#x60;  Alternate route: &#x60;/dev/alliances/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceIds A comma separated list of alliance IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetAlliancesNames200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetAlliancesNames200Ok>> getAlliancesNamesWithHttpInfo(List<Long> allianceIds, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getAlliancesNamesCall(allianceIds, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetAlliancesNames200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get alliance names (asynchronously)
     * Resolve a set of alliance IDs to alliance names  ---  Alternate route: &#x60;/v1/alliances/names/&#x60;  Alternate route: &#x60;/latest/alliances/names/&#x60;  Alternate route: &#x60;/dev/alliances/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param allianceIds A comma separated list of alliance IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlliancesNamesAsync(List<Long> allianceIds, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetAlliancesNames200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlliancesNamesCall(allianceIds, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetAlliancesNames200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
