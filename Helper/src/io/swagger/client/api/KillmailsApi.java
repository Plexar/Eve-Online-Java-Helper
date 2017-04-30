

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

import io.swagger.client.model.GetCharactersCharacterIdKillmailsRecent200Ok;
import io.swagger.client.model.GetCharactersCharacterIdKillmailsRecentForbidden;
import io.swagger.client.model.GetCharactersCharacterIdKillmailsRecentInternalServerError;
import io.swagger.client.model.GetKillmailsKillmailIdKillmailHashInternalServerError;
import io.swagger.client.model.GetKillmailsKillmailIdKillmailHashOk;
import io.swagger.client.model.GetKillmailsKillmailIdKillmailHashUnprocessableEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KillmailsApi {
    private ApiClient apiClient;

    public KillmailsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KillmailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdKillmailsRecent */
    private com.squareup.okhttp.Call getCharactersCharacterIdKillmailsRecentCall(Integer characterId, String datasource, Integer maxCount, Integer maxKillId, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdKillmailsRecent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/killmails/recent/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (maxCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_count", maxCount));
        if (maxKillId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "max_kill_id", maxKillId));
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
     * List kills and losses
     * Return a list of character&#39;s recent kills and losses  ---  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param maxCount How many killmails to return at maximum (optional, default to 50)
     * @param maxKillId Only return killmails with ID smaller than this.  (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdKillmailsRecent200Ok> getCharactersCharacterIdKillmailsRecent(Integer characterId, String datasource, Integer maxCount, Integer maxKillId, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdKillmailsRecent200Ok>> resp = getCharactersCharacterIdKillmailsRecentWithHttpInfo(characterId, datasource, maxCount, maxKillId, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List kills and losses
     * Return a list of character&#39;s recent kills and losses  ---  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param maxCount How many killmails to return at maximum (optional, default to 50)
     * @param maxKillId Only return killmails with ID smaller than this.  (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdKillmailsRecent200Ok>> getCharactersCharacterIdKillmailsRecentWithHttpInfo(Integer characterId, String datasource, Integer maxCount, Integer maxKillId, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdKillmailsRecentCall(characterId, datasource, maxCount, maxKillId, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdKillmailsRecent200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List kills and losses (asynchronously)
     * Return a list of character&#39;s recent kills and losses  ---  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param maxCount How many killmails to return at maximum (optional, default to 50)
     * @param maxKillId Only return killmails with ID smaller than this.  (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdKillmailsRecentAsync(Integer characterId, String datasource, Integer maxCount, Integer maxKillId, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdKillmailsRecent200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdKillmailsRecentCall(characterId, datasource, maxCount, maxKillId, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdKillmailsRecent200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getKillmailsKillmailIdKillmailHash */
    private com.squareup.okhttp.Call getKillmailsKillmailIdKillmailHashCall(String killmailHash, Integer killmailId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'killmailHash' is set
        if (killmailHash == null) {
            throw new ApiException("Missing the required parameter 'killmailHash' when calling getKillmailsKillmailIdKillmailHash(Async)");
        }
        
        // verify the required parameter 'killmailId' is set
        if (killmailId == null) {
            throw new ApiException("Missing the required parameter 'killmailId' when calling getKillmailsKillmailIdKillmailHash(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/killmails/{killmail_id}/{killmail_hash}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "killmail_hash" + "\\}", apiClient.escapeString(killmailHash.toString()))
        .replaceAll("\\{" + "killmail_id" + "\\}", apiClient.escapeString(killmailId.toString()));

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
     * Get a single killmail
     * Return a single killmail from its ID and hash  ---  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/latest/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param killmailHash The killmail hash for verification (required)
     * @param killmailId The killmail ID to be queried (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetKillmailsKillmailIdKillmailHashOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetKillmailsKillmailIdKillmailHashOk getKillmailsKillmailIdKillmailHash(String killmailHash, Integer killmailId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetKillmailsKillmailIdKillmailHashOk> resp = getKillmailsKillmailIdKillmailHashWithHttpInfo(killmailHash, killmailId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get a single killmail
     * Return a single killmail from its ID and hash  ---  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/latest/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param killmailHash The killmail hash for verification (required)
     * @param killmailId The killmail ID to be queried (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetKillmailsKillmailIdKillmailHashOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetKillmailsKillmailIdKillmailHashOk> getKillmailsKillmailIdKillmailHashWithHttpInfo(String killmailHash, Integer killmailId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getKillmailsKillmailIdKillmailHashCall(killmailHash, killmailId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetKillmailsKillmailIdKillmailHashOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single killmail (asynchronously)
     * Return a single killmail from its ID and hash  ---  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/latest/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param killmailHash The killmail hash for verification (required)
     * @param killmailId The killmail ID to be queried (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getKillmailsKillmailIdKillmailHashAsync(String killmailHash, Integer killmailId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetKillmailsKillmailIdKillmailHashOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getKillmailsKillmailIdKillmailHashCall(killmailHash, killmailId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetKillmailsKillmailIdKillmailHashOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
