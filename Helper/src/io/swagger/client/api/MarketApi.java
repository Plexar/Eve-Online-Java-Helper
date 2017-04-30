

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

import io.swagger.client.model.GetMarketsGroupsInternalServerError;
import io.swagger.client.model.GetMarketsGroupsMarketGroupIdInternalServerError;
import io.swagger.client.model.GetMarketsGroupsMarketGroupIdNotFound;
import io.swagger.client.model.GetMarketsGroupsMarketGroupIdOk;
import io.swagger.client.model.GetMarketsPrices200Ok;
import io.swagger.client.model.GetMarketsPricesInternalServerError;
import io.swagger.client.model.GetMarketsRegionIdHistory200Ok;
import io.swagger.client.model.GetMarketsRegionIdHistoryInternalServerError;
import io.swagger.client.model.GetMarketsRegionIdHistoryUnprocessableEntity;
import io.swagger.client.model.GetMarketsRegionIdOrders200Ok;
import io.swagger.client.model.GetMarketsRegionIdOrdersInternalServerError;
import io.swagger.client.model.GetMarketsRegionIdOrdersUnprocessableEntity;
import io.swagger.client.model.GetMarketsStructuresStructureId200Ok;
import io.swagger.client.model.GetMarketsStructuresStructureIdForbidden;
import io.swagger.client.model.GetMarketsStructuresStructureIdInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketApi {
    private ApiClient apiClient;

    public MarketApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MarketApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getMarketsGroups */
    private com.squareup.okhttp.Call getMarketsGroupsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/markets/groups/".replaceAll("\\{format\\}","json");

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
     * Get item groups
     * Get a list of item groups  ---  Alternate route: &#x60;/v1/markets/groups/&#x60;  Alternate route: &#x60;/latest/markets/groups/&#x60;  Alternate route: &#x60;/dev/markets/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getMarketsGroups(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getMarketsGroupsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get item groups
     * Get a list of item groups  ---  Alternate route: &#x60;/v1/markets/groups/&#x60;  Alternate route: &#x60;/latest/markets/groups/&#x60;  Alternate route: &#x60;/dev/markets/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getMarketsGroupsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getMarketsGroupsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get item groups (asynchronously)
     * Get a list of item groups  ---  Alternate route: &#x60;/v1/markets/groups/&#x60;  Alternate route: &#x60;/latest/markets/groups/&#x60;  Alternate route: &#x60;/dev/markets/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMarketsGroupsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMarketsGroupsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMarketsGroupsMarketGroupId */
    private com.squareup.okhttp.Call getMarketsGroupsMarketGroupIdCall(Integer marketGroupId, String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'marketGroupId' is set
        if (marketGroupId == null) {
            throw new ApiException("Missing the required parameter 'marketGroupId' when calling getMarketsGroupsMarketGroupId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/markets/groups/{market_group_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "market_group_id" + "\\}", apiClient.escapeString(marketGroupId.toString()));

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
     * Get item group information
     * Get information on an item group  ---  Alternate route: &#x60;/v1/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/latest/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/dev/markets/groups/{market_group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param marketGroupId An Eve item group ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetMarketsGroupsMarketGroupIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetMarketsGroupsMarketGroupIdOk getMarketsGroupsMarketGroupId(Integer marketGroupId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetMarketsGroupsMarketGroupIdOk> resp = getMarketsGroupsMarketGroupIdWithHttpInfo(marketGroupId, datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get item group information
     * Get information on an item group  ---  Alternate route: &#x60;/v1/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/latest/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/dev/markets/groups/{market_group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param marketGroupId An Eve item group ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetMarketsGroupsMarketGroupIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetMarketsGroupsMarketGroupIdOk> getMarketsGroupsMarketGroupIdWithHttpInfo(Integer marketGroupId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getMarketsGroupsMarketGroupIdCall(marketGroupId, datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetMarketsGroupsMarketGroupIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get item group information (asynchronously)
     * Get information on an item group  ---  Alternate route: &#x60;/v1/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/latest/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/dev/markets/groups/{market_group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param marketGroupId An Eve item group ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMarketsGroupsMarketGroupIdAsync(Integer marketGroupId, String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<GetMarketsGroupsMarketGroupIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMarketsGroupsMarketGroupIdCall(marketGroupId, datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetMarketsGroupsMarketGroupIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMarketsPrices */
    private com.squareup.okhttp.Call getMarketsPricesCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/markets/prices/".replaceAll("\\{format\\}","json");

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
     * List market prices
     * Return a list of prices  ---  Alternate route: &#x60;/v1/markets/prices/&#x60;  Alternate route: &#x60;/latest/markets/prices/&#x60;  Alternate route: &#x60;/dev/markets/prices/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetMarketsPrices200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetMarketsPrices200Ok> getMarketsPrices(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetMarketsPrices200Ok>> resp = getMarketsPricesWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List market prices
     * Return a list of prices  ---  Alternate route: &#x60;/v1/markets/prices/&#x60;  Alternate route: &#x60;/latest/markets/prices/&#x60;  Alternate route: &#x60;/dev/markets/prices/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetMarketsPrices200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetMarketsPrices200Ok>> getMarketsPricesWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getMarketsPricesCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetMarketsPrices200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List market prices (asynchronously)
     * Return a list of prices  ---  Alternate route: &#x60;/v1/markets/prices/&#x60;  Alternate route: &#x60;/latest/markets/prices/&#x60;  Alternate route: &#x60;/dev/markets/prices/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMarketsPricesAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetMarketsPrices200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMarketsPricesCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetMarketsPrices200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMarketsRegionIdHistory */
    private com.squareup.okhttp.Call getMarketsRegionIdHistoryCall(Integer regionId, Integer typeId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException("Missing the required parameter 'regionId' when calling getMarketsRegionIdHistory(Async)");
        }
        
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException("Missing the required parameter 'typeId' when calling getMarketsRegionIdHistory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/markets/{region_id}/history/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "region_id" + "\\}", apiClient.escapeString(regionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (typeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type_id", typeId));
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
     * List historical market statistics in a region
     * Return a list of historical market statistics for the specified type in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/latest/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param regionId Return statistics in this region (required)
     * @param typeId Return statistics for this type (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetMarketsRegionIdHistory200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetMarketsRegionIdHistory200Ok> getMarketsRegionIdHistory(Integer regionId, Integer typeId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetMarketsRegionIdHistory200Ok>> resp = getMarketsRegionIdHistoryWithHttpInfo(regionId, typeId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List historical market statistics in a region
     * Return a list of historical market statistics for the specified type in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/latest/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param regionId Return statistics in this region (required)
     * @param typeId Return statistics for this type (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetMarketsRegionIdHistory200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetMarketsRegionIdHistory200Ok>> getMarketsRegionIdHistoryWithHttpInfo(Integer regionId, Integer typeId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getMarketsRegionIdHistoryCall(regionId, typeId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetMarketsRegionIdHistory200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List historical market statistics in a region (asynchronously)
     * Return a list of historical market statistics for the specified type in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/latest/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param regionId Return statistics in this region (required)
     * @param typeId Return statistics for this type (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMarketsRegionIdHistoryAsync(Integer regionId, Integer typeId, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetMarketsRegionIdHistory200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMarketsRegionIdHistoryCall(regionId, typeId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetMarketsRegionIdHistory200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMarketsRegionIdOrders */
    private com.squareup.okhttp.Call getMarketsRegionIdOrdersCall(String orderType, Integer regionId, String datasource, Integer page, Integer typeId, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'orderType' is set
        if (orderType == null) {
            throw new ApiException("Missing the required parameter 'orderType' when calling getMarketsRegionIdOrders(Async)");
        }
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException("Missing the required parameter 'regionId' when calling getMarketsRegionIdOrders(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/markets/{region_id}/orders/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "region_id" + "\\}", apiClient.escapeString(regionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (orderType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_type", orderType));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (typeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type_id", typeId));
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
     * List orders in a region
     * Return a list of orders in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/latest/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/orders/&#x60;   ---  This route is cached for up to 300 seconds
     * @param orderType Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders.  (required)
     * @param regionId Return orders in this region (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query, only used for querying without type_id. Starting at 1  (optional, default to 1)
     * @param typeId Return orders only for this type (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetMarketsRegionIdOrders200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetMarketsRegionIdOrders200Ok> getMarketsRegionIdOrders(String orderType, Integer regionId, String datasource, Integer page, Integer typeId, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetMarketsRegionIdOrders200Ok>> resp = getMarketsRegionIdOrdersWithHttpInfo(orderType, regionId, datasource, page, typeId, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List orders in a region
     * Return a list of orders in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/latest/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/orders/&#x60;   ---  This route is cached for up to 300 seconds
     * @param orderType Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders.  (required)
     * @param regionId Return orders in this region (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query, only used for querying without type_id. Starting at 1  (optional, default to 1)
     * @param typeId Return orders only for this type (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetMarketsRegionIdOrders200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetMarketsRegionIdOrders200Ok>> getMarketsRegionIdOrdersWithHttpInfo(String orderType, Integer regionId, String datasource, Integer page, Integer typeId, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getMarketsRegionIdOrdersCall(orderType, regionId, datasource, page, typeId, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetMarketsRegionIdOrders200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List orders in a region (asynchronously)
     * Return a list of orders in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/latest/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/orders/&#x60;   ---  This route is cached for up to 300 seconds
     * @param orderType Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders.  (required)
     * @param regionId Return orders in this region (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query, only used for querying without type_id. Starting at 1  (optional, default to 1)
     * @param typeId Return orders only for this type (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMarketsRegionIdOrdersAsync(String orderType, Integer regionId, String datasource, Integer page, Integer typeId, String userAgent, String xUserAgent, final ApiCallback<List<GetMarketsRegionIdOrders200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMarketsRegionIdOrdersCall(orderType, regionId, datasource, page, typeId, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetMarketsRegionIdOrders200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMarketsStructuresStructureId */
    private com.squareup.okhttp.Call getMarketsStructuresStructureIdCall(Long structureId, String datasource, Integer page, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'structureId' is set
        if (structureId == null) {
            throw new ApiException("Missing the required parameter 'structureId' when calling getMarketsStructuresStructureId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/markets/structures/{structure_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "structure_id" + "\\}", apiClient.escapeString(structureId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List orders in a structure
     * Return all orders in a structure  ---  Alternate route: &#x60;/v1/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/markets/structures/{structure_id}/&#x60;   ---  This route is cached for up to 300 seconds
     * @param structureId Return orders in this structure (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query, starting at 1 (optional, default to 1)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetMarketsStructuresStructureId200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetMarketsStructuresStructureId200Ok> getMarketsStructuresStructureId(Long structureId, String datasource, Integer page, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetMarketsStructuresStructureId200Ok>> resp = getMarketsStructuresStructureIdWithHttpInfo(structureId, datasource, page, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List orders in a structure
     * Return all orders in a structure  ---  Alternate route: &#x60;/v1/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/markets/structures/{structure_id}/&#x60;   ---  This route is cached for up to 300 seconds
     * @param structureId Return orders in this structure (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query, starting at 1 (optional, default to 1)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetMarketsStructuresStructureId200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetMarketsStructuresStructureId200Ok>> getMarketsStructuresStructureIdWithHttpInfo(Long structureId, String datasource, Integer page, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getMarketsStructuresStructureIdCall(structureId, datasource, page, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetMarketsStructuresStructureId200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List orders in a structure (asynchronously)
     * Return all orders in a structure  ---  Alternate route: &#x60;/v1/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/markets/structures/{structure_id}/&#x60;   ---  This route is cached for up to 300 seconds
     * @param structureId Return orders in this structure (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query, starting at 1 (optional, default to 1)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMarketsStructuresStructureIdAsync(Long structureId, String datasource, Integer page, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetMarketsStructuresStructureId200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMarketsStructuresStructureIdCall(structureId, datasource, page, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetMarketsStructuresStructureId200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
