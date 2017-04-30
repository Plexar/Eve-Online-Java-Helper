

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

import io.swagger.client.model.DeleteCharactersCharacterIdFittingsFittingIdForbidden;
import io.swagger.client.model.DeleteCharactersCharacterIdFittingsFittingIdInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdFittings200Ok;
import io.swagger.client.model.GetCharactersCharacterIdFittingsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdFittingsInternalServerError;
import io.swagger.client.model.PostCharactersCharacterIdFittingsCreated;
import io.swagger.client.model.PostCharactersCharacterIdFittingsFitting;
import io.swagger.client.model.PostCharactersCharacterIdFittingsForbidden;
import io.swagger.client.model.PostCharactersCharacterIdFittingsInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FittingsApi {
    private ApiClient apiClient;

    public FittingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FittingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteCharactersCharacterIdFittingsFittingId */
    private com.squareup.okhttp.Call deleteCharactersCharacterIdFittingsFittingIdCall(Integer characterId, Integer fittingId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdFittingsFittingId(Async)");
        }
        
        // verify the required parameter 'fittingId' is set
        if (fittingId == null) {
            throw new ApiException("Missing the required parameter 'fittingId' when calling deleteCharactersCharacterIdFittingsFittingId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/fittings/{fitting_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "fitting_id" + "\\}", apiClient.escapeString(fittingId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete fitting
     * Delete a fitting from a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/{fitting_id}/&#x60; 
     * @param characterId ID for a character (required)
     * @param fittingId ID for a fitting of this character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCharactersCharacterIdFittingsFittingId(Integer characterId, Integer fittingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        deleteCharactersCharacterIdFittingsFittingIdWithHttpInfo(characterId, fittingId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Delete fitting
     * Delete a fitting from a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/{fitting_id}/&#x60; 
     * @param characterId ID for a character (required)
     * @param fittingId ID for a fitting of this character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCharactersCharacterIdFittingsFittingIdWithHttpInfo(Integer characterId, Integer fittingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = deleteCharactersCharacterIdFittingsFittingIdCall(characterId, fittingId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete fitting (asynchronously)
     * Delete a fitting from a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/{fitting_id}/&#x60; 
     * @param characterId ID for a character (required)
     * @param fittingId ID for a fitting of this character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCharactersCharacterIdFittingsFittingIdAsync(Integer characterId, Integer fittingId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCharactersCharacterIdFittingsFittingIdCall(characterId, fittingId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdFittings */
    private com.squareup.okhttp.Call getCharactersCharacterIdFittingsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdFittings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/fittings/".replaceAll("\\{format\\}","json")
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
     * Get fittings
     * Return fittings of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdFittings200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdFittings200Ok> getCharactersCharacterIdFittings(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdFittings200Ok>> resp = getCharactersCharacterIdFittingsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get fittings
     * Return fittings of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdFittings200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdFittings200Ok>> getCharactersCharacterIdFittingsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdFittingsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdFittings200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get fittings (asynchronously)
     * Return fittings of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdFittingsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdFittings200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdFittingsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdFittings200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postCharactersCharacterIdFittings */
    private com.squareup.okhttp.Call postCharactersCharacterIdFittingsCall(Integer characterId, String datasource, PostCharactersCharacterIdFittingsFitting fitting, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = fitting;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling postCharactersCharacterIdFittings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/fittings/".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create fitting
     * Save a new fitting for a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60; 
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param fitting Details about the new fitting (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return PostCharactersCharacterIdFittingsCreated
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostCharactersCharacterIdFittingsCreated postCharactersCharacterIdFittings(Integer characterId, String datasource, PostCharactersCharacterIdFittingsFitting fitting, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<PostCharactersCharacterIdFittingsCreated> resp = postCharactersCharacterIdFittingsWithHttpInfo(characterId, datasource, fitting, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Create fitting
     * Save a new fitting for a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60; 
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param fitting Details about the new fitting (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;PostCharactersCharacterIdFittingsCreated&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostCharactersCharacterIdFittingsCreated> postCharactersCharacterIdFittingsWithHttpInfo(Integer characterId, String datasource, PostCharactersCharacterIdFittingsFitting fitting, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postCharactersCharacterIdFittingsCall(characterId, datasource, fitting, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<PostCharactersCharacterIdFittingsCreated>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create fitting (asynchronously)
     * Save a new fitting for a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60; 
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param fitting Details about the new fitting (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCharactersCharacterIdFittingsAsync(Integer characterId, String datasource, PostCharactersCharacterIdFittingsFitting fitting, String token, String userAgent, String xUserAgent, final ApiCallback<PostCharactersCharacterIdFittingsCreated> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCharactersCharacterIdFittingsCall(characterId, datasource, fitting, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostCharactersCharacterIdFittingsCreated>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
