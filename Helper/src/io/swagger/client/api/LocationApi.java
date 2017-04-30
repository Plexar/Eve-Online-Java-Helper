

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

import io.swagger.client.model.GetCharactersCharacterIdLocationForbidden;
import io.swagger.client.model.GetCharactersCharacterIdLocationInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdLocationOk;
import io.swagger.client.model.GetCharactersCharacterIdShipForbidden;
import io.swagger.client.model.GetCharactersCharacterIdShipInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdShipOk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationApi {
    private ApiClient apiClient;

    public LocationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdLocation */
    private com.squareup.okhttp.Call getCharactersCharacterIdLocationCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/location/".replaceAll("\\{format\\}","json")
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
     * Get character location
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.  ---  Alternate route: &#x60;/v1/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/location/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdLocationOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdLocationOk getCharactersCharacterIdLocation(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdLocationOk> resp = getCharactersCharacterIdLocationWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get character location
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.  ---  Alternate route: &#x60;/v1/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/location/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdLocationOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdLocationOk> getCharactersCharacterIdLocationWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdLocationCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdLocationOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get character location (asynchronously)
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.  ---  Alternate route: &#x60;/v1/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/location/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdLocationAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdLocationOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdLocationCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdLocationOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdShip */
    private com.squareup.okhttp.Call getCharactersCharacterIdShipCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdShip(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/ship/".replaceAll("\\{format\\}","json")
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
     * Get current ship
     * Get the current ship type, name and id  ---  Alternate route: &#x60;/v1/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/ship/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdShipOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdShipOk getCharactersCharacterIdShip(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdShipOk> resp = getCharactersCharacterIdShipWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get current ship
     * Get the current ship type, name and id  ---  Alternate route: &#x60;/v1/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/ship/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdShipOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdShipOk> getCharactersCharacterIdShipWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdShipCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdShipOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get current ship (asynchronously)
     * Get the current ship type, name and id  ---  Alternate route: &#x60;/v1/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/ship/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdShipAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdShipOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdShipCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdShipOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
