

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

import io.swagger.client.model.GetCharactersCharacterIdSkillqueue200Ok;
import io.swagger.client.model.GetCharactersCharacterIdSkillqueueForbidden;
import io.swagger.client.model.GetCharactersCharacterIdSkillqueueInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdSkills200Ok;
import io.swagger.client.model.GetCharactersCharacterIdSkillsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdSkillsInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkillsApi {
    private ApiClient apiClient;

    public SkillsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SkillsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdSkillqueue */
    private com.squareup.okhttp.Call getCharactersCharacterIdSkillqueueCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdSkillqueue(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/skillqueue/".replaceAll("\\{format\\}","json")
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
     * Get character&#39;s skill queue
     * List the configured skill queue for the given character  ---  Alternate route: &#x60;/v2/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/skillqueue/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId Character id of the target character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdSkillqueue200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdSkillqueue200Ok> getCharactersCharacterIdSkillqueue(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdSkillqueue200Ok>> resp = getCharactersCharacterIdSkillqueueWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get character&#39;s skill queue
     * List the configured skill queue for the given character  ---  Alternate route: &#x60;/v2/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/skillqueue/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId Character id of the target character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdSkillqueue200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdSkillqueue200Ok>> getCharactersCharacterIdSkillqueueWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdSkillqueueCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdSkillqueue200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get character&#39;s skill queue (asynchronously)
     * List the configured skill queue for the given character  ---  Alternate route: &#x60;/v2/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/skillqueue/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId Character id of the target character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdSkillqueueAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdSkillqueue200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdSkillqueueCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdSkillqueue200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdSkills */
    private com.squareup.okhttp.Call getCharactersCharacterIdSkillsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdSkills(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/skills/".replaceAll("\\{format\\}","json")
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
     * Get character skills
     * List all trained skills for the given character  ---  Alternate route: &#x60;/v2/characters/{character_id}/skills/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdSkills200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdSkills200Ok> getCharactersCharacterIdSkills(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdSkills200Ok>> resp = getCharactersCharacterIdSkillsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get character skills
     * List all trained skills for the given character  ---  Alternate route: &#x60;/v2/characters/{character_id}/skills/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdSkills200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdSkills200Ok>> getCharactersCharacterIdSkillsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdSkillsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdSkills200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get character skills (asynchronously)
     * List all trained skills for the given character  ---  Alternate route: &#x60;/v2/characters/{character_id}/skills/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdSkillsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdSkills200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdSkillsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdSkills200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
