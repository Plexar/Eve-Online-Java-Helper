

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

import io.swagger.client.model.GetCharactersCharacterIdAgentsResearch200Ok;
import io.swagger.client.model.GetCharactersCharacterIdAgentsResearchForbidden;
import io.swagger.client.model.GetCharactersCharacterIdAgentsResearchInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdChatChannels200Ok;
import io.swagger.client.model.GetCharactersCharacterIdChatChannelsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdChatChannelsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdCorporationhistory200Ok;
import io.swagger.client.model.GetCharactersCharacterIdCorporationhistoryInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdMedals200Ok;
import io.swagger.client.model.GetCharactersCharacterIdMedalsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdMedalsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdOk;
import io.swagger.client.model.GetCharactersCharacterIdPortraitInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdPortraitNotFound;
import io.swagger.client.model.GetCharactersCharacterIdPortraitOk;
import io.swagger.client.model.GetCharactersCharacterIdStandings200Ok;
import io.swagger.client.model.GetCharactersCharacterIdStandingsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdStandingsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdUnprocessableEntity;
import io.swagger.client.model.GetCharactersNames200Ok;
import io.swagger.client.model.GetCharactersNamesInternalServerError;
import io.swagger.client.model.PostCharactersAffiliation200Ok;
import io.swagger.client.model.PostCharactersAffiliationInternalServerError;
import io.swagger.client.model.PostCharactersAffiliationUnprocessableEntity;
import io.swagger.client.model.PostCharactersCharacterIdCspaCharacters;
import io.swagger.client.model.PostCharactersCharacterIdCspaCreated;
import io.swagger.client.model.PostCharactersCharacterIdCspaForbidden;
import io.swagger.client.model.PostCharactersCharacterIdCspaInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterApi {
    private ApiClient apiClient;

    public CharacterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CharacterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterId */
    private com.squareup.okhttp.Call getCharactersCharacterIdCall(Integer characterId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

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
     * Get character&#39;s public information
     * Public information about a character  ---  Alternate route: &#x60;/v3/characters/{character_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdOk getCharactersCharacterId(Integer characterId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdOk> resp = getCharactersCharacterIdWithHttpInfo(characterId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get character&#39;s public information
     * Public information about a character  ---  Alternate route: &#x60;/v3/characters/{character_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdOk> getCharactersCharacterIdWithHttpInfo(Integer characterId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdCall(characterId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get character&#39;s public information (asynchronously)
     * Public information about a character  ---  Alternate route: &#x60;/v3/characters/{character_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdAsync(Integer characterId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdCall(characterId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdAgentsResearch */
    private com.squareup.okhttp.Call getCharactersCharacterIdAgentsResearchCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdAgentsResearch(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/agents_research/".replaceAll("\\{format\\}","json")
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
     * Get agents research
     * Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints &#x3D; remainderPoints + pointsPerDay * days(currentTime - researchStartDate)  ---  Alternate route: &#x60;/v1/characters/{character_id}/agents_research/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/agents_research/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/agents_research/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdAgentsResearch200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdAgentsResearch200Ok> getCharactersCharacterIdAgentsResearch(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdAgentsResearch200Ok>> resp = getCharactersCharacterIdAgentsResearchWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get agents research
     * Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints &#x3D; remainderPoints + pointsPerDay * days(currentTime - researchStartDate)  ---  Alternate route: &#x60;/v1/characters/{character_id}/agents_research/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/agents_research/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/agents_research/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdAgentsResearch200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdAgentsResearch200Ok>> getCharactersCharacterIdAgentsResearchWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdAgentsResearchCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdAgentsResearch200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get agents research (asynchronously)
     * Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints &#x3D; remainderPoints + pointsPerDay * days(currentTime - researchStartDate)  ---  Alternate route: &#x60;/v1/characters/{character_id}/agents_research/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/agents_research/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/agents_research/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdAgentsResearchAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdAgentsResearch200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdAgentsResearchCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdAgentsResearch200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdChatChannels */
    private com.squareup.okhttp.Call getCharactersCharacterIdChatChannelsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdChatChannels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/chat_channels/".replaceAll("\\{format\\}","json")
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
     * Get chat channels
     * Return chat channels that a character is the owner or an operator of  ---  Alternate route: &#x60;/v1/characters/{character_id}/chat_channels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/chat_channels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/chat_channels/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdChatChannels200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdChatChannels200Ok> getCharactersCharacterIdChatChannels(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdChatChannels200Ok>> resp = getCharactersCharacterIdChatChannelsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get chat channels
     * Return chat channels that a character is the owner or an operator of  ---  Alternate route: &#x60;/v1/characters/{character_id}/chat_channels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/chat_channels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/chat_channels/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdChatChannels200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdChatChannels200Ok>> getCharactersCharacterIdChatChannelsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdChatChannelsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdChatChannels200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get chat channels (asynchronously)
     * Return chat channels that a character is the owner or an operator of  ---  Alternate route: &#x60;/v1/characters/{character_id}/chat_channels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/chat_channels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/chat_channels/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdChatChannelsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdChatChannels200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdChatChannelsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdChatChannels200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdCorporationhistory */
    private com.squareup.okhttp.Call getCharactersCharacterIdCorporationhistoryCall(Integer characterId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdCorporationhistory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/corporationhistory/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

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
     * Get corporation history
     * Get a list of all the corporations a character has been a member of  ---  Alternate route: &#x60;/v1/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/corporationhistory/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdCorporationhistory200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdCorporationhistory200Ok> getCharactersCharacterIdCorporationhistory(Integer characterId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdCorporationhistory200Ok>> resp = getCharactersCharacterIdCorporationhistoryWithHttpInfo(characterId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get corporation history
     * Get a list of all the corporations a character has been a member of  ---  Alternate route: &#x60;/v1/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/corporationhistory/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdCorporationhistory200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdCorporationhistory200Ok>> getCharactersCharacterIdCorporationhistoryWithHttpInfo(Integer characterId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdCorporationhistoryCall(characterId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdCorporationhistory200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get corporation history (asynchronously)
     * Get a list of all the corporations a character has been a member of  ---  Alternate route: &#x60;/v1/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/corporationhistory/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdCorporationhistoryAsync(Integer characterId, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdCorporationhistory200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdCorporationhistoryCall(characterId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdCorporationhistory200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdMedals */
    private com.squareup.okhttp.Call getCharactersCharacterIdMedalsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdMedals(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/medals/".replaceAll("\\{format\\}","json")
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
     * Get medals
     * Return a list of medals the character has  ---  Alternate route: &#x60;/v1/characters/{character_id}/medals/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/medals/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/medals/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdMedals200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdMedals200Ok> getCharactersCharacterIdMedals(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdMedals200Ok>> resp = getCharactersCharacterIdMedalsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get medals
     * Return a list of medals the character has  ---  Alternate route: &#x60;/v1/characters/{character_id}/medals/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/medals/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/medals/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdMedals200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdMedals200Ok>> getCharactersCharacterIdMedalsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdMedalsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMedals200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get medals (asynchronously)
     * Return a list of medals the character has  ---  Alternate route: &#x60;/v1/characters/{character_id}/medals/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/medals/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/medals/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdMedalsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdMedals200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdMedalsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMedals200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdPortrait */
    private com.squareup.okhttp.Call getCharactersCharacterIdPortraitCall(Integer characterId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdPortrait(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/portrait/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

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
     * Get character portraits
     * Get portrait urls for a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/portrait/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdPortraitOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdPortraitOk getCharactersCharacterIdPortrait(Integer characterId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdPortraitOk> resp = getCharactersCharacterIdPortraitWithHttpInfo(characterId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get character portraits
     * Get portrait urls for a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/portrait/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdPortraitOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdPortraitOk> getCharactersCharacterIdPortraitWithHttpInfo(Integer characterId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdPortraitCall(characterId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdPortraitOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get character portraits (asynchronously)
     * Get portrait urls for a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/portrait/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdPortraitAsync(Integer characterId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdPortraitOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdPortraitCall(characterId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdPortraitOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdStandings */
    private com.squareup.okhttp.Call getCharactersCharacterIdStandingsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdStandings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/standings/".replaceAll("\\{format\\}","json")
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
     * Get standings
     * Return character standings from agents, NPC corporations, and factions  ---  Alternate route: &#x60;/v1/characters/{character_id}/standings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/standings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/standings/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdStandings200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdStandings200Ok> getCharactersCharacterIdStandings(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdStandings200Ok>> resp = getCharactersCharacterIdStandingsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get standings
     * Return character standings from agents, NPC corporations, and factions  ---  Alternate route: &#x60;/v1/characters/{character_id}/standings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/standings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/standings/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdStandings200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdStandings200Ok>> getCharactersCharacterIdStandingsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdStandingsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdStandings200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get standings (asynchronously)
     * Return character standings from agents, NPC corporations, and factions  ---  Alternate route: &#x60;/v1/characters/{character_id}/standings/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/standings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/standings/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdStandingsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdStandings200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdStandingsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdStandings200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersNames */
    private com.squareup.okhttp.Call getCharactersNamesCall(List<Long> characterIds, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterIds' is set
        if (characterIds == null) {
            throw new ApiException("Missing the required parameter 'characterIds' when calling getCharactersNames(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/names/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (characterIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "character_ids", characterIds));
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
     * Get character names
     * Resolve a set of character IDs to character names  ---  Alternate route: &#x60;/v1/characters/names/&#x60;  Alternate route: &#x60;/latest/characters/names/&#x60;  Alternate route: &#x60;/dev/characters/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterIds A comma separated list of character IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersNames200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersNames200Ok> getCharactersNames(List<Long> characterIds, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersNames200Ok>> resp = getCharactersNamesWithHttpInfo(characterIds, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get character names
     * Resolve a set of character IDs to character names  ---  Alternate route: &#x60;/v1/characters/names/&#x60;  Alternate route: &#x60;/latest/characters/names/&#x60;  Alternate route: &#x60;/dev/characters/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterIds A comma separated list of character IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersNames200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersNames200Ok>> getCharactersNamesWithHttpInfo(List<Long> characterIds, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersNamesCall(characterIds, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersNames200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get character names (asynchronously)
     * Resolve a set of character IDs to character names  ---  Alternate route: &#x60;/v1/characters/names/&#x60;  Alternate route: &#x60;/latest/characters/names/&#x60;  Alternate route: &#x60;/dev/characters/names/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characterIds A comma separated list of character IDs (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersNamesAsync(List<Long> characterIds, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersNames200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersNamesCall(characterIds, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersNames200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postCharactersAffiliation */
    private com.squareup.okhttp.Call postCharactersAffiliationCall(List<Integer> characters, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = characters;
        
        // verify the required parameter 'characters' is set
        if (characters == null) {
            throw new ApiException("Missing the required parameter 'characters' when calling postCharactersAffiliation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/affiliation/".replaceAll("\\{format\\}","json");

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
     * Character affiliation
     * Bulk lookup of character IDs to corporation, alliance and faction  ---  Alternate route: &#x60;/v1/characters/affiliation/&#x60;  Alternate route: &#x60;/latest/characters/affiliation/&#x60;  Alternate route: &#x60;/dev/characters/affiliation/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characters The character IDs to fetch affiliations for (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;PostCharactersAffiliation200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PostCharactersAffiliation200Ok> postCharactersAffiliation(List<Integer> characters, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<PostCharactersAffiliation200Ok>> resp = postCharactersAffiliationWithHttpInfo(characters, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Character affiliation
     * Bulk lookup of character IDs to corporation, alliance and faction  ---  Alternate route: &#x60;/v1/characters/affiliation/&#x60;  Alternate route: &#x60;/latest/characters/affiliation/&#x60;  Alternate route: &#x60;/dev/characters/affiliation/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characters The character IDs to fetch affiliations for (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;PostCharactersAffiliation200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PostCharactersAffiliation200Ok>> postCharactersAffiliationWithHttpInfo(List<Integer> characters, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postCharactersAffiliationCall(characters, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<PostCharactersAffiliation200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Character affiliation (asynchronously)
     * Bulk lookup of character IDs to corporation, alliance and faction  ---  Alternate route: &#x60;/v1/characters/affiliation/&#x60;  Alternate route: &#x60;/latest/characters/affiliation/&#x60;  Alternate route: &#x60;/dev/characters/affiliation/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param characters The character IDs to fetch affiliations for (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCharactersAffiliationAsync(List<Integer> characters, String datasource, String userAgent, String xUserAgent, final ApiCallback<List<PostCharactersAffiliation200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCharactersAffiliationCall(characters, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PostCharactersAffiliation200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postCharactersCharacterIdCspa */
    private com.squareup.okhttp.Call postCharactersCharacterIdCspaCall(Integer characterId, PostCharactersCharacterIdCspaCharacters characters, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = characters;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling postCharactersCharacterIdCspa(Async)");
        }
        
        // verify the required parameter 'characters' is set
        if (characters == null) {
            throw new ApiException("Missing the required parameter 'characters' when calling postCharactersCharacterIdCspa(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/cspa/".replaceAll("\\{format\\}","json")
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
     * Calculate a CSPA charge cost
     * Takes a source character ID in the url and a set of target character ID&#39;s in the body, returns a CSPA charge cost  ---  Alternate route: &#x60;/v3/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/cspa/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param characters The target characters to calculate the charge for (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return PostCharactersCharacterIdCspaCreated
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostCharactersCharacterIdCspaCreated postCharactersCharacterIdCspa(Integer characterId, PostCharactersCharacterIdCspaCharacters characters, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<PostCharactersCharacterIdCspaCreated> resp = postCharactersCharacterIdCspaWithHttpInfo(characterId, characters, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Calculate a CSPA charge cost
     * Takes a source character ID in the url and a set of target character ID&#39;s in the body, returns a CSPA charge cost  ---  Alternate route: &#x60;/v3/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/cspa/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param characters The target characters to calculate the charge for (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;PostCharactersCharacterIdCspaCreated&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostCharactersCharacterIdCspaCreated> postCharactersCharacterIdCspaWithHttpInfo(Integer characterId, PostCharactersCharacterIdCspaCharacters characters, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postCharactersCharacterIdCspaCall(characterId, characters, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<PostCharactersCharacterIdCspaCreated>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calculate a CSPA charge cost (asynchronously)
     * Takes a source character ID in the url and a set of target character ID&#39;s in the body, returns a CSPA charge cost  ---  Alternate route: &#x60;/v3/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/cspa/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param characters The target characters to calculate the charge for (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCharactersCharacterIdCspaAsync(Integer characterId, PostCharactersCharacterIdCspaCharacters characters, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<PostCharactersCharacterIdCspaCreated> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCharactersCharacterIdCspaCall(characterId, characters, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostCharactersCharacterIdCspaCreated>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
