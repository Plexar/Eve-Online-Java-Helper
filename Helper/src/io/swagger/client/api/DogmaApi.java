

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

import io.swagger.client.model.GetDogmaAttributesAttributeIdInternalServerError;
import io.swagger.client.model.GetDogmaAttributesAttributeIdNotFound;
import io.swagger.client.model.GetDogmaAttributesAttributeIdOk;
import io.swagger.client.model.GetDogmaAttributesInternalServerError;
import io.swagger.client.model.GetDogmaEffectsEffectIdInternalServerError;
import io.swagger.client.model.GetDogmaEffectsEffectIdNotFound;
import io.swagger.client.model.GetDogmaEffectsEffectIdOk;
import io.swagger.client.model.GetDogmaEffectsInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DogmaApi {
    private ApiClient apiClient;

    public DogmaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DogmaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getDogmaAttributes */
    private com.squareup.okhttp.Call getDogmaAttributesCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/dogma/attributes/".replaceAll("\\{format\\}","json");

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
     * Get attributes
     * Get a list of dogma attribute ids  ---  Alternate route: &#x60;/v1/dogma/attributes/&#x60;  Alternate route: &#x60;/latest/dogma/attributes/&#x60;  Alternate route: &#x60;/dev/dogma/attributes/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getDogmaAttributes(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getDogmaAttributesWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get attributes
     * Get a list of dogma attribute ids  ---  Alternate route: &#x60;/v1/dogma/attributes/&#x60;  Alternate route: &#x60;/latest/dogma/attributes/&#x60;  Alternate route: &#x60;/dev/dogma/attributes/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getDogmaAttributesWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getDogmaAttributesCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get attributes (asynchronously)
     * Get a list of dogma attribute ids  ---  Alternate route: &#x60;/v1/dogma/attributes/&#x60;  Alternate route: &#x60;/latest/dogma/attributes/&#x60;  Alternate route: &#x60;/dev/dogma/attributes/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDogmaAttributesAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaAttributesCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDogmaAttributesAttributeId */
    private com.squareup.okhttp.Call getDogmaAttributesAttributeIdCall(Integer attributeId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'attributeId' is set
        if (attributeId == null) {
            throw new ApiException("Missing the required parameter 'attributeId' when calling getDogmaAttributesAttributeId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/dogma/attributes/{attribute_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "attribute_id" + "\\}", apiClient.escapeString(attributeId.toString()));

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
     * Get attribute information
     * Get information on a dogma attribute  ---  Alternate route: &#x60;/v1/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/latest/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/dev/dogma/attributes/{attribute_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param attributeId A dogma attribute ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetDogmaAttributesAttributeIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDogmaAttributesAttributeIdOk getDogmaAttributesAttributeId(Integer attributeId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetDogmaAttributesAttributeIdOk> resp = getDogmaAttributesAttributeIdWithHttpInfo(attributeId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get attribute information
     * Get information on a dogma attribute  ---  Alternate route: &#x60;/v1/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/latest/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/dev/dogma/attributes/{attribute_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param attributeId A dogma attribute ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetDogmaAttributesAttributeIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetDogmaAttributesAttributeIdOk> getDogmaAttributesAttributeIdWithHttpInfo(Integer attributeId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getDogmaAttributesAttributeIdCall(attributeId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetDogmaAttributesAttributeIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get attribute information (asynchronously)
     * Get information on a dogma attribute  ---  Alternate route: &#x60;/v1/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/latest/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/dev/dogma/attributes/{attribute_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param attributeId A dogma attribute ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDogmaAttributesAttributeIdAsync(Integer attributeId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetDogmaAttributesAttributeIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaAttributesAttributeIdCall(attributeId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetDogmaAttributesAttributeIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDogmaEffects */
    private com.squareup.okhttp.Call getDogmaEffectsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/dogma/effects/".replaceAll("\\{format\\}","json");

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
     * Get effects
     * Get a list of dogma effect ids  ---  Alternate route: &#x60;/v1/dogma/effects/&#x60;  Alternate route: &#x60;/latest/dogma/effects/&#x60;  Alternate route: &#x60;/dev/dogma/effects/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getDogmaEffects(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getDogmaEffectsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get effects
     * Get a list of dogma effect ids  ---  Alternate route: &#x60;/v1/dogma/effects/&#x60;  Alternate route: &#x60;/latest/dogma/effects/&#x60;  Alternate route: &#x60;/dev/dogma/effects/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getDogmaEffectsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getDogmaEffectsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get effects (asynchronously)
     * Get a list of dogma effect ids  ---  Alternate route: &#x60;/v1/dogma/effects/&#x60;  Alternate route: &#x60;/latest/dogma/effects/&#x60;  Alternate route: &#x60;/dev/dogma/effects/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDogmaEffectsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaEffectsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDogmaEffectsEffectId */
    private com.squareup.okhttp.Call getDogmaEffectsEffectIdCall(Integer effectId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'effectId' is set
        if (effectId == null) {
            throw new ApiException("Missing the required parameter 'effectId' when calling getDogmaEffectsEffectId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/dogma/effects/{effect_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "effect_id" + "\\}", apiClient.escapeString(effectId.toString()));

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
     * Get effect information
     * Get information on a dogma effect  ---  Alternate route: &#x60;/v1/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/latest/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/dev/dogma/effects/{effect_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param effectId A dogma effect ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetDogmaEffectsEffectIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDogmaEffectsEffectIdOk getDogmaEffectsEffectId(Integer effectId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetDogmaEffectsEffectIdOk> resp = getDogmaEffectsEffectIdWithHttpInfo(effectId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get effect information
     * Get information on a dogma effect  ---  Alternate route: &#x60;/v1/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/latest/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/dev/dogma/effects/{effect_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param effectId A dogma effect ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetDogmaEffectsEffectIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetDogmaEffectsEffectIdOk> getDogmaEffectsEffectIdWithHttpInfo(Integer effectId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getDogmaEffectsEffectIdCall(effectId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetDogmaEffectsEffectIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get effect information (asynchronously)
     * Get information on a dogma effect  ---  Alternate route: &#x60;/v1/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/latest/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/dev/dogma/effects/{effect_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param effectId A dogma effect ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDogmaEffectsEffectIdAsync(Integer effectId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetDogmaEffectsEffectIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDogmaEffectsEffectIdCall(effectId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetDogmaEffectsEffectIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
