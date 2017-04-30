

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

import io.swagger.client.model.GetCorporationsCorporationIdAlliancehistory200Ok;
import io.swagger.client.model.GetCorporationsCorporationIdAlliancehistoryInternalServerError;
import io.swagger.client.model.GetCorporationsCorporationIdIconsInternalServerError;
import io.swagger.client.model.GetCorporationsCorporationIdIconsNotFound;
import io.swagger.client.model.GetCorporationsCorporationIdIconsOk;
import io.swagger.client.model.GetCorporationsCorporationIdInternalServerError;
import io.swagger.client.model.GetCorporationsCorporationIdMembers200Ok;
import io.swagger.client.model.GetCorporationsCorporationIdMembersForbidden;
import io.swagger.client.model.GetCorporationsCorporationIdMembersInternalServerError;
import io.swagger.client.model.GetCorporationsCorporationIdNotFound;
import io.swagger.client.model.GetCorporationsCorporationIdOk;
import io.swagger.client.model.GetCorporationsCorporationIdRoles200Ok;
import io.swagger.client.model.GetCorporationsCorporationIdRolesForbidden;
import io.swagger.client.model.GetCorporationsCorporationIdRolesInternalServerError;
import io.swagger.client.model.GetCorporationsCorporationIdStructures200Ok;
import io.swagger.client.model.GetCorporationsCorporationIdStructuresForbidden;
import io.swagger.client.model.GetCorporationsCorporationIdStructuresInternalServerError;
import io.swagger.client.model.GetCorporationsNames200Ok;
import io.swagger.client.model.GetCorporationsNamesInternalServerError;
import io.swagger.client.model.GetCorporationsNpccorpsInternalServerError;
import io.swagger.client.model.PutCorporationsCorporationIdStructuresStructureIdForbidden;
import io.swagger.client.model.PutCorporationsCorporationIdStructuresStructureIdInternalServerError;
import io.swagger.client.model.PutCorporationsCorporationIdStructuresStructureIdNewSchedule;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorporationApi {
    private ApiClient apiClient;

    public CorporationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CorporationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCorporationsCorporationId */
    private com.squareup.okhttp.Call getCorporationsCorporationIdCall(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getCorporationsCorporationId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/{corporation_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

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
     * Get corporation information
     * Public information about a corporation  ---  Alternate route: &#x60;/v2/corporations/{corporation_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An Eve corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCorporationsCorporationIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCorporationsCorporationIdOk getCorporationsCorporationId(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCorporationsCorporationIdOk> resp = getCorporationsCorporationIdWithHttpInfo(corporationId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get corporation information
     * Public information about a corporation  ---  Alternate route: &#x60;/v2/corporations/{corporation_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An Eve corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCorporationsCorporationIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCorporationsCorporationIdOk> getCorporationsCorporationIdWithHttpInfo(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdCall(corporationId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCorporationsCorporationIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get corporation information (asynchronously)
     * Public information about a corporation  ---  Alternate route: &#x60;/v2/corporations/{corporation_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An Eve corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdAsync(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetCorporationsCorporationIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsCorporationIdCall(corporationId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCorporationsCorporationIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCorporationsCorporationIdAlliancehistory */
    private com.squareup.okhttp.Call getCorporationsCorporationIdAlliancehistoryCall(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdAlliancehistory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/{corporation_id}/alliancehistory/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

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
     * Get alliance history
     * Get a list of all the alliances a corporation has been a member of  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/alliancehistory/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCorporationsCorporationIdAlliancehistory200Ok> getCorporationsCorporationIdAlliancehistory(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCorporationsCorporationIdAlliancehistory200Ok>> resp = getCorporationsCorporationIdAlliancehistoryWithHttpInfo(corporationId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get alliance history
     * Get a list of all the alliances a corporation has been a member of  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/alliancehistory/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCorporationsCorporationIdAlliancehistory200Ok>> getCorporationsCorporationIdAlliancehistoryWithHttpInfo(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdAlliancehistoryCall(corporationId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdAlliancehistory200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get alliance history (asynchronously)
     * Get a list of all the alliances a corporation has been a member of  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/alliancehistory/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdAlliancehistoryAsync(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetCorporationsCorporationIdAlliancehistory200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsCorporationIdAlliancehistoryCall(corporationId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdAlliancehistory200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCorporationsCorporationIdIcons */
    private com.squareup.okhttp.Call getCorporationsCorporationIdIconsCall(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdIcons(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/{corporation_id}/icons/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

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
     * Get corporation icon
     * Get the icon urls for a corporation  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/icons/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCorporationsCorporationIdIconsOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCorporationsCorporationIdIconsOk getCorporationsCorporationIdIcons(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCorporationsCorporationIdIconsOk> resp = getCorporationsCorporationIdIconsWithHttpInfo(corporationId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get corporation icon
     * Get the icon urls for a corporation  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/icons/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCorporationsCorporationIdIconsOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCorporationsCorporationIdIconsOk> getCorporationsCorporationIdIconsWithHttpInfo(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdIconsCall(corporationId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCorporationsCorporationIdIconsOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get corporation icon (asynchronously)
     * Get the icon urls for a corporation  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/icons/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdIconsAsync(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetCorporationsCorporationIdIconsOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsCorporationIdIconsCall(corporationId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCorporationsCorporationIdIconsOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCorporationsCorporationIdMembers */
    private com.squareup.okhttp.Call getCorporationsCorporationIdMembersCall(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdMembers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/{corporation_id}/members/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

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
     * Get corporation members
     * Read the current list of members if the calling character is a member.  ---  Alternate route: &#x60;/v2/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/members/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCorporationsCorporationIdMembers200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCorporationsCorporationIdMembers200Ok> getCorporationsCorporationIdMembers(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCorporationsCorporationIdMembers200Ok>> resp = getCorporationsCorporationIdMembersWithHttpInfo(corporationId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get corporation members
     * Read the current list of members if the calling character is a member.  ---  Alternate route: &#x60;/v2/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/members/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCorporationsCorporationIdMembers200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCorporationsCorporationIdMembers200Ok>> getCorporationsCorporationIdMembersWithHttpInfo(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdMembersCall(corporationId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdMembers200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get corporation members (asynchronously)
     * Read the current list of members if the calling character is a member.  ---  Alternate route: &#x60;/v2/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/members/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdMembersAsync(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCorporationsCorporationIdMembers200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsCorporationIdMembersCall(corporationId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdMembers200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCorporationsCorporationIdRoles */
    private com.squareup.okhttp.Call getCorporationsCorporationIdRolesCall(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdRoles(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/{corporation_id}/roles/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

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
     * Get corporation member roles
     * Return the roles of all members if the character has the personnel manager role or any grantable role.  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCorporationsCorporationIdRoles200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCorporationsCorporationIdRoles200Ok> getCorporationsCorporationIdRoles(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCorporationsCorporationIdRoles200Ok>> resp = getCorporationsCorporationIdRolesWithHttpInfo(corporationId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get corporation member roles
     * Return the roles of all members if the character has the personnel manager role or any grantable role.  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCorporationsCorporationIdRoles200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCorporationsCorporationIdRoles200Ok>> getCorporationsCorporationIdRolesWithHttpInfo(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdRolesCall(corporationId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdRoles200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get corporation member roles (asynchronously)
     * Return the roles of all members if the character has the personnel manager role or any grantable role.  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdRolesAsync(Integer corporationId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCorporationsCorporationIdRoles200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsCorporationIdRolesCall(corporationId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdRoles200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCorporationsCorporationIdStructures */
    private com.squareup.okhttp.Call getCorporationsCorporationIdStructuresCall(Integer corporationId, String datasource, String language, Integer page, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdStructures(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/{corporation_id}/structures/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
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
     * Get corporation structures
     * Get a list of corporation structures  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param page Which page to query, 250 structures per page (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCorporationsCorporationIdStructures200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCorporationsCorporationIdStructures200Ok> getCorporationsCorporationIdStructures(Integer corporationId, String datasource, String language, Integer page, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCorporationsCorporationIdStructures200Ok>> resp = getCorporationsCorporationIdStructuresWithHttpInfo(corporationId, datasource, language, page, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get corporation structures
     * Get a list of corporation structures  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param page Which page to query, 250 structures per page (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCorporationsCorporationIdStructures200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCorporationsCorporationIdStructures200Ok>> getCorporationsCorporationIdStructuresWithHttpInfo(Integer corporationId, String datasource, String language, Integer page, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdStructuresCall(corporationId, datasource, language, page, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdStructures200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get corporation structures (asynchronously)
     * Get a list of corporation structures  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId A corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param page Which page to query, 250 structures per page (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdStructuresAsync(Integer corporationId, String datasource, String language, Integer page, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCorporationsCorporationIdStructures200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsCorporationIdStructuresCall(corporationId, datasource, language, page, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdStructures200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCorporationsNames */
    private com.squareup.okhttp.Call getCorporationsNamesCall(List<Long> corporationIds, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationIds' is set
        if (corporationIds == null) {
            throw new ApiException("Missing the required parameter 'corporationIds' when calling getCorporationsNames(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/names/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (corporationIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "corporation_ids", corporationIds));
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
     * Get corporation names
     * Resolve a set of corporation IDs to corporation names  ---  Alternate route: &#x60;/v1/corporations/names/&#x60;  Alternate route: &#x60;/latest/corporations/names/&#x60;  Alternate route: &#x60;/dev/corporations/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationIds A comma separated list of corporation IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCorporationsNames200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCorporationsNames200Ok> getCorporationsNames(List<Long> corporationIds, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCorporationsNames200Ok>> resp = getCorporationsNamesWithHttpInfo(corporationIds, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get corporation names
     * Resolve a set of corporation IDs to corporation names  ---  Alternate route: &#x60;/v1/corporations/names/&#x60;  Alternate route: &#x60;/latest/corporations/names/&#x60;  Alternate route: &#x60;/dev/corporations/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationIds A comma separated list of corporation IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCorporationsNames200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCorporationsNames200Ok>> getCorporationsNamesWithHttpInfo(List<Long> corporationIds, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsNamesCall(corporationIds, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCorporationsNames200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get corporation names (asynchronously)
     * Resolve a set of corporation IDs to corporation names  ---  Alternate route: &#x60;/v1/corporations/names/&#x60;  Alternate route: &#x60;/latest/corporations/names/&#x60;  Alternate route: &#x60;/dev/corporations/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationIds A comma separated list of corporation IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsNamesAsync(List<Long> corporationIds, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetCorporationsNames200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsNamesCall(corporationIds, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCorporationsNames200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCorporationsNpccorps */
    private com.squareup.okhttp.Call getCorporationsNpccorpsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/corporations/npccorps/".replaceAll("\\{format\\}","json");

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
     * Get npc corporations
     * Get a list of npc corporations  ---  Alternate route: &#x60;/v1/corporations/npccorps/&#x60;  Alternate route: &#x60;/latest/corporations/npccorps/&#x60;  Alternate route: &#x60;/dev/corporations/npccorps/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getCorporationsNpccorps(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getCorporationsNpccorpsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get npc corporations
     * Get a list of npc corporations  ---  Alternate route: &#x60;/v1/corporations/npccorps/&#x60;  Alternate route: &#x60;/latest/corporations/npccorps/&#x60;  Alternate route: &#x60;/dev/corporations/npccorps/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getCorporationsNpccorpsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsNpccorpsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get npc corporations (asynchronously)
     * Get a list of npc corporations  ---  Alternate route: &#x60;/v1/corporations/npccorps/&#x60;  Alternate route: &#x60;/latest/corporations/npccorps/&#x60;  Alternate route: &#x60;/dev/corporations/npccorps/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsNpccorpsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCorporationsNpccorpsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for putCorporationsCorporationIdStructuresStructureId */
    private com.squareup.okhttp.Call putCorporationsCorporationIdStructuresStructureIdCall(Integer corporationId, List<PutCorporationsCorporationIdStructuresStructureIdNewSchedule> newSchedule, Long structureId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = newSchedule;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling putCorporationsCorporationIdStructuresStructureId(Async)");
        }
        
        // verify the required parameter 'newSchedule' is set
        if (newSchedule == null) {
            throw new ApiException("Missing the required parameter 'newSchedule' when calling putCorporationsCorporationIdStructuresStructureId(Async)");
        }
        
        // verify the required parameter 'structureId' is set
        if (structureId == null) {
            throw new ApiException("Missing the required parameter 'structureId' when calling putCorporationsCorporationIdStructuresStructureId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/corporations/{corporation_id}/structures/{structure_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()))
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update structure vulnerability schedule
     * Update the vulnerability window schedule of a corporation structure  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/{structure_id}/&#x60; 
     * @param corporationId A corporation ID (required)
     * @param newSchedule New vulnerability window schedule for the structure (required)
     * @param structureId A structure ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putCorporationsCorporationIdStructuresStructureId(Integer corporationId, List<PutCorporationsCorporationIdStructuresStructureIdNewSchedule> newSchedule, Long structureId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        putCorporationsCorporationIdStructuresStructureIdWithHttpInfo(corporationId, newSchedule, structureId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Update structure vulnerability schedule
     * Update the vulnerability window schedule of a corporation structure  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/{structure_id}/&#x60; 
     * @param corporationId A corporation ID (required)
     * @param newSchedule New vulnerability window schedule for the structure (required)
     * @param structureId A structure ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putCorporationsCorporationIdStructuresStructureIdWithHttpInfo(Integer corporationId, List<PutCorporationsCorporationIdStructuresStructureIdNewSchedule> newSchedule, Long structureId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putCorporationsCorporationIdStructuresStructureIdCall(corporationId, newSchedule, structureId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update structure vulnerability schedule (asynchronously)
     * Update the vulnerability window schedule of a corporation structure  ---  Alternate route: &#x60;/v1/corporations/{corporation_id}/structures/{structure_id}/&#x60;  Alternate route: &#x60;/latest/corporations/{corporation_id}/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/{structure_id}/&#x60; 
     * @param corporationId A corporation ID (required)
     * @param newSchedule New vulnerability window schedule for the structure (required)
     * @param structureId A structure ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCorporationsCorporationIdStructuresStructureIdAsync(Integer corporationId, List<PutCorporationsCorporationIdStructuresStructureIdNewSchedule> newSchedule, Long structureId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putCorporationsCorporationIdStructuresStructureIdCall(corporationId, newSchedule, structureId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
