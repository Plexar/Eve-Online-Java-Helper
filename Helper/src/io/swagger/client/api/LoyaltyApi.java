

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

import io.swagger.client.model.GetCharactersCharacterIdLoyaltyPoints200Ok;
import io.swagger.client.model.GetCharactersCharacterIdLoyaltyPointsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdLoyaltyPointsInternalServerError;
import io.swagger.client.model.GetLoyaltyStoresCorporationIdOffers200Ok;
import io.swagger.client.model.GetLoyaltyStoresCorporationIdOffersInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyApi {
    private ApiClient apiClient;

    public LoyaltyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdLoyaltyPoints */
    private com.squareup.okhttp.Call getCharactersCharacterIdLoyaltyPointsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdLoyaltyPoints(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/loyalty/points/".replaceAll("\\{format\\}","json")
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
     * Get loyalty points
     * Return a list of loyalty points for all corporations the character has worked for  ---  Alternate route: &#x60;/v1/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/loyalty/points/&#x60; 
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdLoyaltyPoints200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdLoyaltyPoints200Ok> getCharactersCharacterIdLoyaltyPoints(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdLoyaltyPoints200Ok>> resp = getCharactersCharacterIdLoyaltyPointsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get loyalty points
     * Return a list of loyalty points for all corporations the character has worked for  ---  Alternate route: &#x60;/v1/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/loyalty/points/&#x60; 
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdLoyaltyPoints200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdLoyaltyPoints200Ok>> getCharactersCharacterIdLoyaltyPointsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdLoyaltyPointsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdLoyaltyPoints200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get loyalty points (asynchronously)
     * Return a list of loyalty points for all corporations the character has worked for  ---  Alternate route: &#x60;/v1/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/loyalty/points/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/loyalty/points/&#x60; 
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdLoyaltyPointsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdLoyaltyPoints200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdLoyaltyPointsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdLoyaltyPoints200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getLoyaltyStoresCorporationIdOffers */
    private com.squareup.okhttp.Call getLoyaltyStoresCorporationIdOffersCall(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getLoyaltyStoresCorporationIdOffers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/loyalty/stores/{corporation_id}/offers/".replaceAll("\\{format\\}","json")
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
     * List loyalty store offers
     * Return a list of offers from a specific corporation&#39;s loyalty store  ---  Alternate route: &#x60;/v1/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/latest/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/dev/loyalty/stores/{corporation_id}/offers/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId ID of a corporation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetLoyaltyStoresCorporationIdOffers200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetLoyaltyStoresCorporationIdOffers200Ok> getLoyaltyStoresCorporationIdOffers(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetLoyaltyStoresCorporationIdOffers200Ok>> resp = getLoyaltyStoresCorporationIdOffersWithHttpInfo(corporationId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List loyalty store offers
     * Return a list of offers from a specific corporation&#39;s loyalty store  ---  Alternate route: &#x60;/v1/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/latest/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/dev/loyalty/stores/{corporation_id}/offers/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId ID of a corporation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetLoyaltyStoresCorporationIdOffers200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetLoyaltyStoresCorporationIdOffers200Ok>> getLoyaltyStoresCorporationIdOffersWithHttpInfo(Integer corporationId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getLoyaltyStoresCorporationIdOffersCall(corporationId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetLoyaltyStoresCorporationIdOffers200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List loyalty store offers (asynchronously)
     * Return a list of offers from a specific corporation&#39;s loyalty store  ---  Alternate route: &#x60;/v1/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/latest/loyalty/stores/{corporation_id}/offers/&#x60;  Alternate route: &#x60;/dev/loyalty/stores/{corporation_id}/offers/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param corporationId ID of a corporation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLoyaltyStoresCorporationIdOffersAsync(Integer corporationId, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetLoyaltyStoresCorporationIdOffers200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLoyaltyStoresCorporationIdOffersCall(corporationId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetLoyaltyStoresCorporationIdOffers200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
