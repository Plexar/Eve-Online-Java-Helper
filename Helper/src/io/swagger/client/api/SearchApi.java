

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

import io.swagger.client.model.GetCharactersCharacterIdSearchForbidden;
import io.swagger.client.model.GetCharactersCharacterIdSearchInternalServerError;
import io.swagger.client.model.GetSearchInternalServerError;
import io.swagger.client.model.GetSearchOk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdSearch */
    private com.squareup.okhttp.Call getCharactersCharacterIdSearchCall(List<String> categories, Integer characterId, String search, String datasource, String language, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'categories' is set
        if (categories == null) {
            throw new ApiException("Missing the required parameter 'categories' when calling getCharactersCharacterIdSearch(Async)");
        }
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdSearch(Async)");
        }
        
        // verify the required parameter 'search' is set
        if (search == null) {
            throw new ApiException("Missing the required parameter 'search' when calling getCharactersCharacterIdSearch(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/search/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (categories != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories", categories));
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
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
     * Search on a string
     * Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v1/characters/{character_id}/search/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param characterId An EVE character ID (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Search locale (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Long> getCharactersCharacterIdSearch(List<String> categories, Integer characterId, String search, String datasource, String language, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Long>> resp = getCharactersCharacterIdSearchWithHttpInfo(categories, characterId, search, datasource, language, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Search on a string
     * Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v1/characters/{character_id}/search/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param characterId An EVE character ID (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Search locale (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Long&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Long>> getCharactersCharacterIdSearchWithHttpInfo(List<String> categories, Integer characterId, String search, String datasource, String language, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdSearchCall(categories, characterId, search, datasource, language, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Long>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search on a string (asynchronously)
     * Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v1/characters/{character_id}/search/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param characterId An EVE character ID (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Search locale (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdSearchAsync(List<String> categories, Integer characterId, String search, String datasource, String language, String token, String userAgent, String xUserAgent, final ApiCallback<List<Long>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdSearchCall(categories, characterId, search, datasource, language, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Long>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getSearch */
    private com.squareup.okhttp.Call getSearchCall(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'categories' is set
        if (categories == null) {
            throw new ApiException("Missing the required parameter 'categories' when calling getSearch(Async)");
        }
        
        // verify the required parameter 'search' is set
        if (search == null) {
            throw new ApiException("Missing the required parameter 'search' when calling getSearch(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/search/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (categories != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "categories", categories));
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
        if (strict != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "strict", strict));
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
     * Search on a string
     * Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v1/search/&#x60;  Alternate route: &#x60;/latest/search/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Search locale (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetSearchOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSearchOk getSearch(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetSearchOk> resp = getSearchWithHttpInfo(categories, search, datasource, language, strict, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Search on a string
     * Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v1/search/&#x60;  Alternate route: &#x60;/latest/search/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Search locale (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetSearchOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSearchOk> getSearchWithHttpInfo(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getSearchCall(categories, search, datasource, language, strict, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetSearchOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search on a string (asynchronously)
     * Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v1/search/&#x60;  Alternate route: &#x60;/latest/search/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Search locale (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSearchAsync(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent, final ApiCallback<GetSearchOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSearchCall(categories, search, datasource, language, strict, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSearchOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
