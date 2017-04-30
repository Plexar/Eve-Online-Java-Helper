

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

import io.swagger.client.model.GetUniverseBloodlines200Ok;
import io.swagger.client.model.GetUniverseBloodlinesInternalServerError;
import io.swagger.client.model.GetUniverseCategoriesCategoryIdInternalServerError;
import io.swagger.client.model.GetUniverseCategoriesCategoryIdNotFound;
import io.swagger.client.model.GetUniverseCategoriesCategoryIdOk;
import io.swagger.client.model.GetUniverseCategoriesInternalServerError;
import io.swagger.client.model.GetUniverseConstellationsConstellationIdInternalServerError;
import io.swagger.client.model.GetUniverseConstellationsConstellationIdNotFound;
import io.swagger.client.model.GetUniverseConstellationsConstellationIdOk;
import io.swagger.client.model.GetUniverseConstellationsInternalServerError;
import io.swagger.client.model.GetUniverseFactions200Ok;
import io.swagger.client.model.GetUniverseFactionsInternalServerError;
import io.swagger.client.model.GetUniverseGraphicsGraphicIdInternalServerError;
import io.swagger.client.model.GetUniverseGraphicsGraphicIdNotFound;
import io.swagger.client.model.GetUniverseGraphicsGraphicIdOk;
import io.swagger.client.model.GetUniverseGraphicsInternalServerError;
import io.swagger.client.model.GetUniverseGroupsGroupIdInternalServerError;
import io.swagger.client.model.GetUniverseGroupsGroupIdNotFound;
import io.swagger.client.model.GetUniverseGroupsGroupIdOk;
import io.swagger.client.model.GetUniverseGroupsInternalServerError;
import io.swagger.client.model.GetUniverseMoonsMoonIdInternalServerError;
import io.swagger.client.model.GetUniverseMoonsMoonIdNotFound;
import io.swagger.client.model.GetUniverseMoonsMoonIdOk;
import io.swagger.client.model.GetUniversePlanetsPlanetIdInternalServerError;
import io.swagger.client.model.GetUniversePlanetsPlanetIdNotFound;
import io.swagger.client.model.GetUniversePlanetsPlanetIdOk;
import io.swagger.client.model.GetUniverseRaces200Ok;
import io.swagger.client.model.GetUniverseRacesInternalServerError;
import io.swagger.client.model.GetUniverseRegionsInternalServerError;
import io.swagger.client.model.GetUniverseRegionsRegionIdInternalServerError;
import io.swagger.client.model.GetUniverseRegionsRegionIdNotFound;
import io.swagger.client.model.GetUniverseRegionsRegionIdOk;
import io.swagger.client.model.GetUniverseStargatesStargateIdInternalServerError;
import io.swagger.client.model.GetUniverseStargatesStargateIdNotFound;
import io.swagger.client.model.GetUniverseStargatesStargateIdOk;
import io.swagger.client.model.GetUniverseStationsStationIdInternalServerError;
import io.swagger.client.model.GetUniverseStationsStationIdOk;
import io.swagger.client.model.GetUniverseStructuresInternalServerError;
import io.swagger.client.model.GetUniverseStructuresStructureIdForbidden;
import io.swagger.client.model.GetUniverseStructuresStructureIdInternalServerError;
import io.swagger.client.model.GetUniverseStructuresStructureIdNotFound;
import io.swagger.client.model.GetUniverseStructuresStructureIdOk;
import io.swagger.client.model.GetUniverseSystemJumps200Ok;
import io.swagger.client.model.GetUniverseSystemJumpsInternalServerError;
import io.swagger.client.model.GetUniverseSystemKills200Ok;
import io.swagger.client.model.GetUniverseSystemKillsInternalServerError;
import io.swagger.client.model.GetUniverseSystemsInternalServerError;
import io.swagger.client.model.GetUniverseSystemsSystemIdInternalServerError;
import io.swagger.client.model.GetUniverseSystemsSystemIdNotFound;
import io.swagger.client.model.GetUniverseSystemsSystemIdOk;
import io.swagger.client.model.GetUniverseTypesInternalServerError;
import io.swagger.client.model.GetUniverseTypesTypeIdInternalServerError;
import io.swagger.client.model.GetUniverseTypesTypeIdNotFound;
import io.swagger.client.model.GetUniverseTypesTypeIdOk;
import io.swagger.client.model.PostUniverseNames200Ok;
import io.swagger.client.model.PostUniverseNamesIds;
import io.swagger.client.model.PostUniverseNamesInternalServerError;
import io.swagger.client.model.PostUniverseNamesNotFound;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniverseApi {
    private ApiClient apiClient;

    public UniverseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UniverseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getUniverseBloodlines */
    private com.squareup.okhttp.Call getUniverseBloodlinesCall(String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/bloodlines/".replaceAll("\\{format\\}","json");

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
     * Get bloodlines
     * Get a list of bloodlines  ---  Alternate route: &#x60;/v1/universe/bloodlines/&#x60;  Alternate route: &#x60;/latest/universe/bloodlines/&#x60;  Alternate route: &#x60;/dev/universe/bloodlines/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetUniverseBloodlines200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetUniverseBloodlines200Ok> getUniverseBloodlines(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetUniverseBloodlines200Ok>> resp = getUniverseBloodlinesWithHttpInfo(datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get bloodlines
     * Get a list of bloodlines  ---  Alternate route: &#x60;/v1/universe/bloodlines/&#x60;  Alternate route: &#x60;/latest/universe/bloodlines/&#x60;  Alternate route: &#x60;/dev/universe/bloodlines/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetUniverseBloodlines200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetUniverseBloodlines200Ok>> getUniverseBloodlinesWithHttpInfo(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseBloodlinesCall(datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetUniverseBloodlines200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get bloodlines (asynchronously)
     * Get a list of bloodlines  ---  Alternate route: &#x60;/v1/universe/bloodlines/&#x60;  Alternate route: &#x60;/latest/universe/bloodlines/&#x60;  Alternate route: &#x60;/dev/universe/bloodlines/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseBloodlinesAsync(String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<List<GetUniverseBloodlines200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseBloodlinesCall(datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetUniverseBloodlines200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseCategories */
    private com.squareup.okhttp.Call getUniverseCategoriesCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/categories/".replaceAll("\\{format\\}","json");

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
     * Get item categories
     * Get a list of item categories  ---  Alternate route: &#x60;/v1/universe/categories/&#x60;  Alternate route: &#x60;/latest/universe/categories/&#x60;  Alternate route: &#x60;/dev/universe/categories/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getUniverseCategories(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getUniverseCategoriesWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get item categories
     * Get a list of item categories  ---  Alternate route: &#x60;/v1/universe/categories/&#x60;  Alternate route: &#x60;/latest/universe/categories/&#x60;  Alternate route: &#x60;/dev/universe/categories/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getUniverseCategoriesWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseCategoriesCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get item categories (asynchronously)
     * Get a list of item categories  ---  Alternate route: &#x60;/v1/universe/categories/&#x60;  Alternate route: &#x60;/latest/universe/categories/&#x60;  Alternate route: &#x60;/dev/universe/categories/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseCategoriesAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseCategoriesCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseCategoriesCategoryId */
    private com.squareup.okhttp.Call getUniverseCategoriesCategoryIdCall(Integer categoryId, String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException("Missing the required parameter 'categoryId' when calling getUniverseCategoriesCategoryId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/categories/{category_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "category_id" + "\\}", apiClient.escapeString(categoryId.toString()));

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
     * Get item category information
     * Get information of an item category  ---  Alternate route: &#x60;/v1/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/latest/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/dev/universe/categories/{category_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categoryId An Eve item category ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseCategoriesCategoryIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseCategoriesCategoryIdOk getUniverseCategoriesCategoryId(Integer categoryId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseCategoriesCategoryIdOk> resp = getUniverseCategoriesCategoryIdWithHttpInfo(categoryId, datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get item category information
     * Get information of an item category  ---  Alternate route: &#x60;/v1/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/latest/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/dev/universe/categories/{category_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categoryId An Eve item category ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseCategoriesCategoryIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseCategoriesCategoryIdOk> getUniverseCategoriesCategoryIdWithHttpInfo(Integer categoryId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseCategoriesCategoryIdCall(categoryId, datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseCategoriesCategoryIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get item category information (asynchronously)
     * Get information of an item category  ---  Alternate route: &#x60;/v1/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/latest/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/dev/universe/categories/{category_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categoryId An Eve item category ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseCategoriesCategoryIdAsync(Integer categoryId, String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<GetUniverseCategoriesCategoryIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseCategoriesCategoryIdCall(categoryId, datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseCategoriesCategoryIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseConstellations */
    private com.squareup.okhttp.Call getUniverseConstellationsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/constellations/".replaceAll("\\{format\\}","json");

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
     * Get constellations
     * Get a list of constellations  ---  Alternate route: &#x60;/v1/universe/constellations/&#x60;  Alternate route: &#x60;/latest/universe/constellations/&#x60;  Alternate route: &#x60;/dev/universe/constellations/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getUniverseConstellations(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getUniverseConstellationsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get constellations
     * Get a list of constellations  ---  Alternate route: &#x60;/v1/universe/constellations/&#x60;  Alternate route: &#x60;/latest/universe/constellations/&#x60;  Alternate route: &#x60;/dev/universe/constellations/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getUniverseConstellationsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseConstellationsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get constellations (asynchronously)
     * Get a list of constellations  ---  Alternate route: &#x60;/v1/universe/constellations/&#x60;  Alternate route: &#x60;/latest/universe/constellations/&#x60;  Alternate route: &#x60;/dev/universe/constellations/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseConstellationsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseConstellationsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseConstellationsConstellationId */
    private com.squareup.okhttp.Call getUniverseConstellationsConstellationIdCall(Integer constellationId, String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'constellationId' is set
        if (constellationId == null) {
            throw new ApiException("Missing the required parameter 'constellationId' when calling getUniverseConstellationsConstellationId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/constellations/{constellation_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "constellation_id" + "\\}", apiClient.escapeString(constellationId.toString()));

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
     * Get constellation information
     * Get information on a constellation  ---  Alternate route: &#x60;/v1/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/latest/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/dev/universe/constellations/{constellation_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param constellationId constellation_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseConstellationsConstellationIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseConstellationsConstellationIdOk getUniverseConstellationsConstellationId(Integer constellationId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseConstellationsConstellationIdOk> resp = getUniverseConstellationsConstellationIdWithHttpInfo(constellationId, datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get constellation information
     * Get information on a constellation  ---  Alternate route: &#x60;/v1/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/latest/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/dev/universe/constellations/{constellation_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param constellationId constellation_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseConstellationsConstellationIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseConstellationsConstellationIdOk> getUniverseConstellationsConstellationIdWithHttpInfo(Integer constellationId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseConstellationsConstellationIdCall(constellationId, datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseConstellationsConstellationIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get constellation information (asynchronously)
     * Get information on a constellation  ---  Alternate route: &#x60;/v1/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/latest/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/dev/universe/constellations/{constellation_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param constellationId constellation_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseConstellationsConstellationIdAsync(Integer constellationId, String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<GetUniverseConstellationsConstellationIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseConstellationsConstellationIdCall(constellationId, datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseConstellationsConstellationIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseFactions */
    private com.squareup.okhttp.Call getUniverseFactionsCall(String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/factions/".replaceAll("\\{format\\}","json");

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
     * Get factions
     * Get a list of factions  ---  Alternate route: &#x60;/v1/universe/factions/&#x60;  Alternate route: &#x60;/latest/universe/factions/&#x60;  Alternate route: &#x60;/dev/universe/factions/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetUniverseFactions200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetUniverseFactions200Ok> getUniverseFactions(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetUniverseFactions200Ok>> resp = getUniverseFactionsWithHttpInfo(datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get factions
     * Get a list of factions  ---  Alternate route: &#x60;/v1/universe/factions/&#x60;  Alternate route: &#x60;/latest/universe/factions/&#x60;  Alternate route: &#x60;/dev/universe/factions/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetUniverseFactions200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetUniverseFactions200Ok>> getUniverseFactionsWithHttpInfo(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseFactionsCall(datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetUniverseFactions200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get factions (asynchronously)
     * Get a list of factions  ---  Alternate route: &#x60;/v1/universe/factions/&#x60;  Alternate route: &#x60;/latest/universe/factions/&#x60;  Alternate route: &#x60;/dev/universe/factions/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseFactionsAsync(String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<List<GetUniverseFactions200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseFactionsCall(datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetUniverseFactions200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseGraphics */
    private com.squareup.okhttp.Call getUniverseGraphicsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/graphics/".replaceAll("\\{format\\}","json");

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
     * Get graphics
     * Get a list of graphics  ---  Alternate route: &#x60;/v1/universe/graphics/&#x60;  Alternate route: &#x60;/latest/universe/graphics/&#x60;  Alternate route: &#x60;/dev/universe/graphics/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getUniverseGraphics(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getUniverseGraphicsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get graphics
     * Get a list of graphics  ---  Alternate route: &#x60;/v1/universe/graphics/&#x60;  Alternate route: &#x60;/latest/universe/graphics/&#x60;  Alternate route: &#x60;/dev/universe/graphics/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getUniverseGraphicsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseGraphicsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get graphics (asynchronously)
     * Get a list of graphics  ---  Alternate route: &#x60;/v1/universe/graphics/&#x60;  Alternate route: &#x60;/latest/universe/graphics/&#x60;  Alternate route: &#x60;/dev/universe/graphics/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseGraphicsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseGraphicsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseGraphicsGraphicId */
    private com.squareup.okhttp.Call getUniverseGraphicsGraphicIdCall(Integer graphicId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'graphicId' is set
        if (graphicId == null) {
            throw new ApiException("Missing the required parameter 'graphicId' when calling getUniverseGraphicsGraphicId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/graphics/{graphic_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "graphic_id" + "\\}", apiClient.escapeString(graphicId.toString()));

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
     * Get graphic information
     * Get information on a graphic  ---  Alternate route: &#x60;/v1/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/latest/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/dev/universe/graphics/{graphic_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param graphicId graphic_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseGraphicsGraphicIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseGraphicsGraphicIdOk getUniverseGraphicsGraphicId(Integer graphicId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseGraphicsGraphicIdOk> resp = getUniverseGraphicsGraphicIdWithHttpInfo(graphicId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get graphic information
     * Get information on a graphic  ---  Alternate route: &#x60;/v1/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/latest/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/dev/universe/graphics/{graphic_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param graphicId graphic_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseGraphicsGraphicIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseGraphicsGraphicIdOk> getUniverseGraphicsGraphicIdWithHttpInfo(Integer graphicId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseGraphicsGraphicIdCall(graphicId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseGraphicsGraphicIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get graphic information (asynchronously)
     * Get information on a graphic  ---  Alternate route: &#x60;/v1/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/latest/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/dev/universe/graphics/{graphic_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param graphicId graphic_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseGraphicsGraphicIdAsync(Integer graphicId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniverseGraphicsGraphicIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseGraphicsGraphicIdCall(graphicId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseGraphicsGraphicIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseGroups */
    private com.squareup.okhttp.Call getUniverseGroupsCall(String datasource, Integer page, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/groups/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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
     * Get a list of item groups  ---  Alternate route: &#x60;/v1/universe/groups/&#x60;  Alternate route: &#x60;/latest/universe/groups/&#x60;  Alternate route: &#x60;/dev/universe/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getUniverseGroups(String datasource, Integer page, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getUniverseGroupsWithHttpInfo(datasource, page, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get item groups
     * Get a list of item groups  ---  Alternate route: &#x60;/v1/universe/groups/&#x60;  Alternate route: &#x60;/latest/universe/groups/&#x60;  Alternate route: &#x60;/dev/universe/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getUniverseGroupsWithHttpInfo(String datasource, Integer page, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseGroupsCall(datasource, page, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get item groups (asynchronously)
     * Get a list of item groups  ---  Alternate route: &#x60;/v1/universe/groups/&#x60;  Alternate route: &#x60;/latest/universe/groups/&#x60;  Alternate route: &#x60;/dev/universe/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseGroupsAsync(String datasource, Integer page, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseGroupsCall(datasource, page, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseGroupsGroupId */
    private com.squareup.okhttp.Call getUniverseGroupsGroupIdCall(Integer groupId, String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getUniverseGroupsGroupId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/groups/{group_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "group_id" + "\\}", apiClient.escapeString(groupId.toString()));

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
     * Get information on an item group  ---  Alternate route: &#x60;/v1/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/latest/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/universe/groups/{group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param groupId An Eve item group ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseGroupsGroupIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseGroupsGroupIdOk getUniverseGroupsGroupId(Integer groupId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseGroupsGroupIdOk> resp = getUniverseGroupsGroupIdWithHttpInfo(groupId, datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get item group information
     * Get information on an item group  ---  Alternate route: &#x60;/v1/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/latest/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/universe/groups/{group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param groupId An Eve item group ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseGroupsGroupIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseGroupsGroupIdOk> getUniverseGroupsGroupIdWithHttpInfo(Integer groupId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseGroupsGroupIdCall(groupId, datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseGroupsGroupIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get item group information (asynchronously)
     * Get information on an item group  ---  Alternate route: &#x60;/v1/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/latest/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/universe/groups/{group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param groupId An Eve item group ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseGroupsGroupIdAsync(Integer groupId, String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<GetUniverseGroupsGroupIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseGroupsGroupIdCall(groupId, datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseGroupsGroupIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseMoonsMoonId */
    private com.squareup.okhttp.Call getUniverseMoonsMoonIdCall(Integer moonId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'moonId' is set
        if (moonId == null) {
            throw new ApiException("Missing the required parameter 'moonId' when calling getUniverseMoonsMoonId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/moons/{moon_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "moon_id" + "\\}", apiClient.escapeString(moonId.toString()));

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
     * Get moon information
     * Get information on a moon  ---  Alternate route: &#x60;/v1/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/latest/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/dev/universe/moons/{moon_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param moonId moon_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseMoonsMoonIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseMoonsMoonIdOk getUniverseMoonsMoonId(Integer moonId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseMoonsMoonIdOk> resp = getUniverseMoonsMoonIdWithHttpInfo(moonId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get moon information
     * Get information on a moon  ---  Alternate route: &#x60;/v1/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/latest/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/dev/universe/moons/{moon_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param moonId moon_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseMoonsMoonIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseMoonsMoonIdOk> getUniverseMoonsMoonIdWithHttpInfo(Integer moonId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseMoonsMoonIdCall(moonId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseMoonsMoonIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get moon information (asynchronously)
     * Get information on a moon  ---  Alternate route: &#x60;/v1/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/latest/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/dev/universe/moons/{moon_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param moonId moon_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseMoonsMoonIdAsync(Integer moonId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniverseMoonsMoonIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseMoonsMoonIdCall(moonId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseMoonsMoonIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniversePlanetsPlanetId */
    private com.squareup.okhttp.Call getUniversePlanetsPlanetIdCall(Integer planetId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'planetId' is set
        if (planetId == null) {
            throw new ApiException("Missing the required parameter 'planetId' when calling getUniversePlanetsPlanetId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/planets/{planet_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "planet_id" + "\\}", apiClient.escapeString(planetId.toString()));

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
     * Get planet information
     * Get information on a planet  ---  Alternate route: &#x60;/v1/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/latest/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/dev/universe/planets/{planet_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param planetId planet_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniversePlanetsPlanetIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniversePlanetsPlanetIdOk getUniversePlanetsPlanetId(Integer planetId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniversePlanetsPlanetIdOk> resp = getUniversePlanetsPlanetIdWithHttpInfo(planetId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get planet information
     * Get information on a planet  ---  Alternate route: &#x60;/v1/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/latest/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/dev/universe/planets/{planet_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param planetId planet_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniversePlanetsPlanetIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniversePlanetsPlanetIdOk> getUniversePlanetsPlanetIdWithHttpInfo(Integer planetId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniversePlanetsPlanetIdCall(planetId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniversePlanetsPlanetIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get planet information (asynchronously)
     * Get information on a planet  ---  Alternate route: &#x60;/v1/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/latest/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/dev/universe/planets/{planet_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param planetId planet_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniversePlanetsPlanetIdAsync(Integer planetId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniversePlanetsPlanetIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniversePlanetsPlanetIdCall(planetId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniversePlanetsPlanetIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseRaces */
    private com.squareup.okhttp.Call getUniverseRacesCall(String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/races/".replaceAll("\\{format\\}","json");

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
     * Get character races
     * Get a list of character races  ---  Alternate route: &#x60;/v1/universe/races/&#x60;  Alternate route: &#x60;/latest/universe/races/&#x60;  Alternate route: &#x60;/dev/universe/races/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetUniverseRaces200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetUniverseRaces200Ok> getUniverseRaces(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetUniverseRaces200Ok>> resp = getUniverseRacesWithHttpInfo(datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get character races
     * Get a list of character races  ---  Alternate route: &#x60;/v1/universe/races/&#x60;  Alternate route: &#x60;/latest/universe/races/&#x60;  Alternate route: &#x60;/dev/universe/races/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetUniverseRaces200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetUniverseRaces200Ok>> getUniverseRacesWithHttpInfo(String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseRacesCall(datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetUniverseRaces200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get character races (asynchronously)
     * Get a list of character races  ---  Alternate route: &#x60;/v1/universe/races/&#x60;  Alternate route: &#x60;/latest/universe/races/&#x60;  Alternate route: &#x60;/dev/universe/races/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseRacesAsync(String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<List<GetUniverseRaces200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseRacesCall(datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetUniverseRaces200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseRegions */
    private com.squareup.okhttp.Call getUniverseRegionsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/regions/".replaceAll("\\{format\\}","json");

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
     * Get regions
     * Get a list of regions  ---  Alternate route: &#x60;/v1/universe/regions/&#x60;  Alternate route: &#x60;/latest/universe/regions/&#x60;  Alternate route: &#x60;/dev/universe/regions/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getUniverseRegions(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getUniverseRegionsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get regions
     * Get a list of regions  ---  Alternate route: &#x60;/v1/universe/regions/&#x60;  Alternate route: &#x60;/latest/universe/regions/&#x60;  Alternate route: &#x60;/dev/universe/regions/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getUniverseRegionsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseRegionsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get regions (asynchronously)
     * Get a list of regions  ---  Alternate route: &#x60;/v1/universe/regions/&#x60;  Alternate route: &#x60;/latest/universe/regions/&#x60;  Alternate route: &#x60;/dev/universe/regions/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseRegionsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseRegionsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseRegionsRegionId */
    private com.squareup.okhttp.Call getUniverseRegionsRegionIdCall(Integer regionId, String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException("Missing the required parameter 'regionId' when calling getUniverseRegionsRegionId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/regions/{region_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "region_id" + "\\}", apiClient.escapeString(regionId.toString()));

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
     * Get region information
     * Get information on a region  ---  Alternate route: &#x60;/v1/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/latest/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/dev/universe/regions/{region_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param regionId region_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseRegionsRegionIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseRegionsRegionIdOk getUniverseRegionsRegionId(Integer regionId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseRegionsRegionIdOk> resp = getUniverseRegionsRegionIdWithHttpInfo(regionId, datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get region information
     * Get information on a region  ---  Alternate route: &#x60;/v1/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/latest/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/dev/universe/regions/{region_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param regionId region_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseRegionsRegionIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseRegionsRegionIdOk> getUniverseRegionsRegionIdWithHttpInfo(Integer regionId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseRegionsRegionIdCall(regionId, datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseRegionsRegionIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get region information (asynchronously)
     * Get information on a region  ---  Alternate route: &#x60;/v1/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/latest/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/dev/universe/regions/{region_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param regionId region_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseRegionsRegionIdAsync(Integer regionId, String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<GetUniverseRegionsRegionIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseRegionsRegionIdCall(regionId, datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseRegionsRegionIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseStargatesStargateId */
    private com.squareup.okhttp.Call getUniverseStargatesStargateIdCall(Integer stargateId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'stargateId' is set
        if (stargateId == null) {
            throw new ApiException("Missing the required parameter 'stargateId' when calling getUniverseStargatesStargateId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/stargates/{stargate_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "stargate_id" + "\\}", apiClient.escapeString(stargateId.toString()));

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
     * Get stargate information
     * Get information on a stargate  ---  Alternate route: &#x60;/v1/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/latest/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/dev/universe/stargates/{stargate_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param stargateId stargate_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseStargatesStargateIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseStargatesStargateIdOk getUniverseStargatesStargateId(Integer stargateId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseStargatesStargateIdOk> resp = getUniverseStargatesStargateIdWithHttpInfo(stargateId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get stargate information
     * Get information on a stargate  ---  Alternate route: &#x60;/v1/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/latest/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/dev/universe/stargates/{stargate_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param stargateId stargate_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseStargatesStargateIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseStargatesStargateIdOk> getUniverseStargatesStargateIdWithHttpInfo(Integer stargateId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseStargatesStargateIdCall(stargateId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseStargatesStargateIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get stargate information (asynchronously)
     * Get information on a stargate  ---  Alternate route: &#x60;/v1/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/latest/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/dev/universe/stargates/{stargate_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param stargateId stargate_id integer (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseStargatesStargateIdAsync(Integer stargateId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniverseStargatesStargateIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseStargatesStargateIdCall(stargateId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseStargatesStargateIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseStationsStationId */
    private com.squareup.okhttp.Call getUniverseStationsStationIdCall(Integer stationId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new ApiException("Missing the required parameter 'stationId' when calling getUniverseStationsStationId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/stations/{station_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "station_id" + "\\}", apiClient.escapeString(stationId.toString()));

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
     * Get station information
     * Public information on stations  ---  Alternate route: &#x60;/v1/universe/stations/{station_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param stationId An Eve station ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseStationsStationIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseStationsStationIdOk getUniverseStationsStationId(Integer stationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseStationsStationIdOk> resp = getUniverseStationsStationIdWithHttpInfo(stationId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get station information
     * Public information on stations  ---  Alternate route: &#x60;/v1/universe/stations/{station_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param stationId An Eve station ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseStationsStationIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseStationsStationIdOk> getUniverseStationsStationIdWithHttpInfo(Integer stationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseStationsStationIdCall(stationId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseStationsStationIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get station information (asynchronously)
     * Public information on stations  ---  Alternate route: &#x60;/v1/universe/stations/{station_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param stationId An Eve station ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseStationsStationIdAsync(Integer stationId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniverseStationsStationIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseStationsStationIdCall(stationId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseStationsStationIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseStructures */
    private com.squareup.okhttp.Call getUniverseStructuresCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/structures/".replaceAll("\\{format\\}","json");

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
     * List all public structures
     * List all public structures  ---  Alternate route: &#x60;/v1/universe/structures/&#x60;  Alternate route: &#x60;/latest/universe/structures/&#x60;  Alternate route: &#x60;/dev/universe/structures/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Long> getUniverseStructures(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Long>> resp = getUniverseStructuresWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List all public structures
     * List all public structures  ---  Alternate route: &#x60;/v1/universe/structures/&#x60;  Alternate route: &#x60;/latest/universe/structures/&#x60;  Alternate route: &#x60;/dev/universe/structures/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Long&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Long>> getUniverseStructuresWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseStructuresCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Long>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all public structures (asynchronously)
     * List all public structures  ---  Alternate route: &#x60;/v1/universe/structures/&#x60;  Alternate route: &#x60;/latest/universe/structures/&#x60;  Alternate route: &#x60;/dev/universe/structures/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseStructuresAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Long>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseStructuresCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Long>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseStructuresStructureId */
    private com.squareup.okhttp.Call getUniverseStructuresStructureIdCall(Long structureId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'structureId' is set
        if (structureId == null) {
            throw new ApiException("Missing the required parameter 'structureId' when calling getUniverseStructuresStructureId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/structures/{structure_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "structure_id" + "\\}", apiClient.escapeString(structureId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
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
     * Get structure information
     * Returns information on requested structure, if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  ---  Alternate route: &#x60;/v1/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/universe/structures/{structure_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param structureId An Eve structure ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseStructuresStructureIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseStructuresStructureIdOk getUniverseStructuresStructureId(Long structureId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseStructuresStructureIdOk> resp = getUniverseStructuresStructureIdWithHttpInfo(structureId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get structure information
     * Returns information on requested structure, if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  ---  Alternate route: &#x60;/v1/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/universe/structures/{structure_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param structureId An Eve structure ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseStructuresStructureIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseStructuresStructureIdOk> getUniverseStructuresStructureIdWithHttpInfo(Long structureId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseStructuresStructureIdCall(structureId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseStructuresStructureIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get structure information (asynchronously)
     * Returns information on requested structure, if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  ---  Alternate route: &#x60;/v1/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/universe/structures/{structure_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param structureId An Eve structure ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseStructuresStructureIdAsync(Long structureId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<GetUniverseStructuresStructureIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseStructuresStructureIdCall(structureId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseStructuresStructureIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseSystemJumps */
    private com.squareup.okhttp.Call getUniverseSystemJumpsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/system_jumps/".replaceAll("\\{format\\}","json");

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
     * Get system jumps
     * Get the number of jumps in solar systems within the last hour, excluding wormhole space. Only systems with jumps will be listed  ---  Alternate route: &#x60;/v1/universe/system_jumps/&#x60;  Alternate route: &#x60;/latest/universe/system_jumps/&#x60;  Alternate route: &#x60;/dev/universe/system_jumps/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetUniverseSystemJumps200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetUniverseSystemJumps200Ok> getUniverseSystemJumps(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetUniverseSystemJumps200Ok>> resp = getUniverseSystemJumpsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get system jumps
     * Get the number of jumps in solar systems within the last hour, excluding wormhole space. Only systems with jumps will be listed  ---  Alternate route: &#x60;/v1/universe/system_jumps/&#x60;  Alternate route: &#x60;/latest/universe/system_jumps/&#x60;  Alternate route: &#x60;/dev/universe/system_jumps/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetUniverseSystemJumps200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetUniverseSystemJumps200Ok>> getUniverseSystemJumpsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseSystemJumpsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetUniverseSystemJumps200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get system jumps (asynchronously)
     * Get the number of jumps in solar systems within the last hour, excluding wormhole space. Only systems with jumps will be listed  ---  Alternate route: &#x60;/v1/universe/system_jumps/&#x60;  Alternate route: &#x60;/latest/universe/system_jumps/&#x60;  Alternate route: &#x60;/dev/universe/system_jumps/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseSystemJumpsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetUniverseSystemJumps200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseSystemJumpsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetUniverseSystemJumps200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseSystemKills */
    private com.squareup.okhttp.Call getUniverseSystemKillsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/system_kills/".replaceAll("\\{format\\}","json");

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
     * Get system kills
     * Get the number of ship, pod and NPC kills per solar system within the last hour, excluding wormhole space. Only systems with kills will be listed  ---  Alternate route: &#x60;/v1/universe/system_kills/&#x60;  Alternate route: &#x60;/latest/universe/system_kills/&#x60;  Alternate route: &#x60;/dev/universe/system_kills/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetUniverseSystemKills200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetUniverseSystemKills200Ok> getUniverseSystemKills(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetUniverseSystemKills200Ok>> resp = getUniverseSystemKillsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get system kills
     * Get the number of ship, pod and NPC kills per solar system within the last hour, excluding wormhole space. Only systems with kills will be listed  ---  Alternate route: &#x60;/v1/universe/system_kills/&#x60;  Alternate route: &#x60;/latest/universe/system_kills/&#x60;  Alternate route: &#x60;/dev/universe/system_kills/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetUniverseSystemKills200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetUniverseSystemKills200Ok>> getUniverseSystemKillsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseSystemKillsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetUniverseSystemKills200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get system kills (asynchronously)
     * Get the number of ship, pod and NPC kills per solar system within the last hour, excluding wormhole space. Only systems with kills will be listed  ---  Alternate route: &#x60;/v1/universe/system_kills/&#x60;  Alternate route: &#x60;/latest/universe/system_kills/&#x60;  Alternate route: &#x60;/dev/universe/system_kills/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseSystemKillsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetUniverseSystemKills200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseSystemKillsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetUniverseSystemKills200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseSystems */
    private com.squareup.okhttp.Call getUniverseSystemsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/systems/".replaceAll("\\{format\\}","json");

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
     * Get solar systems
     * Get a list of solar systems  ---  Alternate route: &#x60;/v1/universe/systems/&#x60;  Alternate route: &#x60;/latest/universe/systems/&#x60;  Alternate route: &#x60;/dev/universe/systems/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getUniverseSystems(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getUniverseSystemsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get solar systems
     * Get a list of solar systems  ---  Alternate route: &#x60;/v1/universe/systems/&#x60;  Alternate route: &#x60;/latest/universe/systems/&#x60;  Alternate route: &#x60;/dev/universe/systems/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getUniverseSystemsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseSystemsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get solar systems (asynchronously)
     * Get a list of solar systems  ---  Alternate route: &#x60;/v1/universe/systems/&#x60;  Alternate route: &#x60;/latest/universe/systems/&#x60;  Alternate route: &#x60;/dev/universe/systems/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseSystemsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseSystemsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseSystemsSystemId */
    private com.squareup.okhttp.Call getUniverseSystemsSystemIdCall(Integer systemId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling getUniverseSystemsSystemId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/systems/{system_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "system_id" + "\\}", apiClient.escapeString(systemId.toString()));

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
     * Get solar system information
     * Information on solar systems  ---  Alternate route: &#x60;/v1/universe/systems/{system_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param systemId An Eve solar system ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseSystemsSystemIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseSystemsSystemIdOk getUniverseSystemsSystemId(Integer systemId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseSystemsSystemIdOk> resp = getUniverseSystemsSystemIdWithHttpInfo(systemId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get solar system information
     * Information on solar systems  ---  Alternate route: &#x60;/v1/universe/systems/{system_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param systemId An Eve solar system ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseSystemsSystemIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseSystemsSystemIdOk> getUniverseSystemsSystemIdWithHttpInfo(Integer systemId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseSystemsSystemIdCall(systemId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseSystemsSystemIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get solar system information (asynchronously)
     * Information on solar systems  ---  Alternate route: &#x60;/v1/universe/systems/{system_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param systemId An Eve solar system ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseSystemsSystemIdAsync(Integer systemId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniverseSystemsSystemIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseSystemsSystemIdCall(systemId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseSystemsSystemIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseTypes */
    private com.squareup.okhttp.Call getUniverseTypesCall(String datasource, Integer page, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/universe/types/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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
     * Get types
     * Get a list of type ids  ---  Alternate route: &#x60;/v1/universe/types/&#x60;  Alternate route: &#x60;/latest/universe/types/&#x60;  Alternate route: &#x60;/dev/universe/types/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getUniverseTypes(String datasource, Integer page, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getUniverseTypesWithHttpInfo(datasource, page, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get types
     * Get a list of type ids  ---  Alternate route: &#x60;/v1/universe/types/&#x60;  Alternate route: &#x60;/latest/universe/types/&#x60;  Alternate route: &#x60;/dev/universe/types/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getUniverseTypesWithHttpInfo(String datasource, Integer page, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseTypesCall(datasource, page, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get types (asynchronously)
     * Get a list of type ids  ---  Alternate route: &#x60;/v1/universe/types/&#x60;  Alternate route: &#x60;/latest/universe/types/&#x60;  Alternate route: &#x60;/dev/universe/types/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page Which page to query (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseTypesAsync(String datasource, Integer page, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseTypesCall(datasource, page, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseTypesTypeId */
    private com.squareup.okhttp.Call getUniverseTypesTypeIdCall(Integer typeId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException("Missing the required parameter 'typeId' when calling getUniverseTypesTypeId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/types/{type_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "type_id" + "\\}", apiClient.escapeString(typeId.toString()));

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
     * Get type information
     * Get information on a type  ---  Alternate route: &#x60;/v1/universe/types/{type_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param typeId An Eve item type ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseTypesTypeIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseTypesTypeIdOk getUniverseTypesTypeId(Integer typeId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseTypesTypeIdOk> resp = getUniverseTypesTypeIdWithHttpInfo(typeId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get type information
     * Get information on a type  ---  Alternate route: &#x60;/v1/universe/types/{type_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param typeId An Eve item type ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseTypesTypeIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseTypesTypeIdOk> getUniverseTypesTypeIdWithHttpInfo(Integer typeId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseTypesTypeIdCall(typeId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseTypesTypeIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get type information (asynchronously)
     * Get information on a type  ---  Alternate route: &#x60;/v1/universe/types/{type_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param typeId An Eve item type ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseTypesTypeIdAsync(Integer typeId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniverseTypesTypeIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseTypesTypeIdCall(typeId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseTypesTypeIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postUniverseNames */
    private com.squareup.okhttp.Call postUniverseNamesCall(PostUniverseNamesIds ids, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = ids;
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling postUniverseNames(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/names/".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get names and categories for a set of ID&#39;s
     * Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types.  ---  Alternate route: &#x60;/v1/universe/names/&#x60; 
     * @param ids The ids to resolve (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;PostUniverseNames200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PostUniverseNames200Ok> postUniverseNames(PostUniverseNamesIds ids, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<PostUniverseNames200Ok>> resp = postUniverseNamesWithHttpInfo(ids, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get names and categories for a set of ID&#39;s
     * Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types.  ---  Alternate route: &#x60;/v1/universe/names/&#x60; 
     * @param ids The ids to resolve (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;PostUniverseNames200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PostUniverseNames200Ok>> postUniverseNamesWithHttpInfo(PostUniverseNamesIds ids, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postUniverseNamesCall(ids, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<PostUniverseNames200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get names and categories for a set of ID&#39;s (asynchronously)
     * Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types.  ---  Alternate route: &#x60;/v1/universe/names/&#x60; 
     * @param ids The ids to resolve (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUniverseNamesAsync(PostUniverseNamesIds ids, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<PostUniverseNames200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUniverseNamesCall(ids, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PostUniverseNames200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
