

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

import io.swagger.client.model.GetCharactersCharacterIdOpportunities200Ok;
import io.swagger.client.model.GetCharactersCharacterIdOpportunitiesForbidden;
import io.swagger.client.model.GetCharactersCharacterIdOpportunitiesInternalServerError;
import io.swagger.client.model.GetOpportunitiesGroupsGroupIdInternalServerError;
import io.swagger.client.model.GetOpportunitiesGroupsGroupIdOk;
import io.swagger.client.model.GetOpportunitiesGroupsInternalServerError;
import io.swagger.client.model.GetOpportunitiesTasksInternalServerError;
import io.swagger.client.model.GetOpportunitiesTasksTaskIdInternalServerError;
import io.swagger.client.model.GetOpportunitiesTasksTaskIdOk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpportunitiesApi {
    private ApiClient apiClient;

    public OpportunitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OpportunitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdOpportunities */
    private com.squareup.okhttp.Call getCharactersCharacterIdOpportunitiesCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdOpportunities(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/opportunities/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

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
     * Get a character&#39;s completed tasks
     * Return a list of tasks finished by a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/opportunities/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdOpportunities200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdOpportunities200Ok> getCharactersCharacterIdOpportunities(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdOpportunities200Ok>> resp = getCharactersCharacterIdOpportunitiesWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get a character&#39;s completed tasks
     * Return a list of tasks finished by a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/opportunities/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdOpportunities200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdOpportunities200Ok>> getCharactersCharacterIdOpportunitiesWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdOpportunitiesCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdOpportunities200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a character&#39;s completed tasks (asynchronously)
     * Return a list of tasks finished by a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/opportunities/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdOpportunitiesAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdOpportunities200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdOpportunitiesCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdOpportunities200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOpportunitiesGroups */
    private com.squareup.okhttp.Call getOpportunitiesGroupsCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/opportunities/groups/".replaceAll("\\{format\\}","json");

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
     * Get opportunities groups
     * Return a list of opportunities groups  ---  Alternate route: &#x60;/v1/opportunities/groups/&#x60;  Alternate route: &#x60;/latest/opportunities/groups/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getOpportunitiesGroups(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getOpportunitiesGroupsWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get opportunities groups
     * Return a list of opportunities groups  ---  Alternate route: &#x60;/v1/opportunities/groups/&#x60;  Alternate route: &#x60;/latest/opportunities/groups/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getOpportunitiesGroupsWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesGroupsCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities groups (asynchronously)
     * Return a list of opportunities groups  ---  Alternate route: &#x60;/v1/opportunities/groups/&#x60;  Alternate route: &#x60;/latest/opportunities/groups/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesGroupsAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOpportunitiesGroupsCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOpportunitiesGroupsGroupId */
    private com.squareup.okhttp.Call getOpportunitiesGroupsGroupIdCall(Integer groupId, String datasource, String language, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getOpportunitiesGroupsGroupId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/opportunities/groups/{group_id}/".replaceAll("\\{format\\}","json")
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
     * Get opportunities group
     * Return information of an opportunities group  ---  Alternate route: &#x60;/v1/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/latest/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/{group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param groupId ID of an opportunities group (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetOpportunitiesGroupsGroupIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetOpportunitiesGroupsGroupIdOk getOpportunitiesGroupsGroupId(Integer groupId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetOpportunitiesGroupsGroupIdOk> resp = getOpportunitiesGroupsGroupIdWithHttpInfo(groupId, datasource, language, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get opportunities group
     * Return information of an opportunities group  ---  Alternate route: &#x60;/v1/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/latest/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/{group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param groupId ID of an opportunities group (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetOpportunitiesGroupsGroupIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetOpportunitiesGroupsGroupIdOk> getOpportunitiesGroupsGroupIdWithHttpInfo(Integer groupId, String datasource, String language, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesGroupsGroupIdCall(groupId, datasource, language, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetOpportunitiesGroupsGroupIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities group (asynchronously)
     * Return information of an opportunities group  ---  Alternate route: &#x60;/v1/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/latest/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/{group_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param groupId ID of an opportunities group (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesGroupsGroupIdAsync(Integer groupId, String datasource, String language, String userAgent, String xUserAgent, final ApiCallback<GetOpportunitiesGroupsGroupIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOpportunitiesGroupsGroupIdCall(groupId, datasource, language, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetOpportunitiesGroupsGroupIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOpportunitiesTasks */
    private com.squareup.okhttp.Call getOpportunitiesTasksCall(String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/opportunities/tasks/".replaceAll("\\{format\\}","json");

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
     * Get opportunities tasks
     * Return a list of opportunities tasks  ---  Alternate route: &#x60;/v1/opportunities/tasks/&#x60;  Alternate route: &#x60;/latest/opportunities/tasks/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getOpportunitiesTasks(String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getOpportunitiesTasksWithHttpInfo(datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get opportunities tasks
     * Return a list of opportunities tasks  ---  Alternate route: &#x60;/v1/opportunities/tasks/&#x60;  Alternate route: &#x60;/latest/opportunities/tasks/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getOpportunitiesTasksWithHttpInfo(String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesTasksCall(datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities tasks (asynchronously)
     * Return a list of opportunities tasks  ---  Alternate route: &#x60;/v1/opportunities/tasks/&#x60;  Alternate route: &#x60;/latest/opportunities/tasks/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesTasksAsync(String datasource, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOpportunitiesTasksCall(datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOpportunitiesTasksTaskId */
    private com.squareup.okhttp.Call getOpportunitiesTasksTaskIdCall(Integer taskId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling getOpportunitiesTasksTaskId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/opportunities/tasks/{task_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

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
     * Get opportunities task
     * Return information of an opportunities task  ---  Alternate route: &#x60;/v1/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/latest/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/{task_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param taskId ID of an opportunities task (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetOpportunitiesTasksTaskIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetOpportunitiesTasksTaskIdOk getOpportunitiesTasksTaskId(Integer taskId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetOpportunitiesTasksTaskIdOk> resp = getOpportunitiesTasksTaskIdWithHttpInfo(taskId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get opportunities task
     * Return information of an opportunities task  ---  Alternate route: &#x60;/v1/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/latest/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/{task_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param taskId ID of an opportunities task (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetOpportunitiesTasksTaskIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetOpportunitiesTasksTaskIdOk> getOpportunitiesTasksTaskIdWithHttpInfo(Integer taskId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesTasksTaskIdCall(taskId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetOpportunitiesTasksTaskIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities task (asynchronously)
     * Return information of an opportunities task  ---  Alternate route: &#x60;/v1/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/latest/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/{task_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param taskId ID of an opportunities task (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesTasksTaskIdAsync(Integer taskId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetOpportunitiesTasksTaskIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOpportunitiesTasksTaskIdCall(taskId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetOpportunitiesTasksTaskIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
