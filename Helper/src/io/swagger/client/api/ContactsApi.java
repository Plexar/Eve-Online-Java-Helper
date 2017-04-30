

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

import io.swagger.client.model.DeleteCharactersCharacterIdContactsForbidden;
import io.swagger.client.model.DeleteCharactersCharacterIdContactsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdContacts200Ok;
import io.swagger.client.model.GetCharactersCharacterIdContactsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdContactsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdContactsLabels200Ok;
import io.swagger.client.model.GetCharactersCharacterIdContactsLabelsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdContactsLabelsInternalServerError;
import io.swagger.client.model.PostCharactersCharacterIdContactsForbidden;
import io.swagger.client.model.PostCharactersCharacterIdContactsInternalServerError;
import io.swagger.client.model.PutCharactersCharacterIdContactsForbidden;
import io.swagger.client.model.PutCharactersCharacterIdContactsInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsApi {
    private ApiClient apiClient;

    public ContactsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContactsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteCharactersCharacterIdContacts */
    private com.squareup.okhttp.Call deleteCharactersCharacterIdContactsCall(Integer characterId, List<Integer> contactIds, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = contactIds;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdContacts(Async)");
        }
        
        // verify the required parameter 'contactIds' is set
        if (contactIds == null) {
            throw new ApiException("Missing the required parameter 'contactIds' when calling deleteCharactersCharacterIdContacts(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/contacts/".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete contacts
     * Bulk delete contacts  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to edit (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCharactersCharacterIdContacts(Integer characterId, List<Integer> contactIds, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        deleteCharactersCharacterIdContactsWithHttpInfo(characterId, contactIds, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Delete contacts
     * Bulk delete contacts  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to edit (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCharactersCharacterIdContactsWithHttpInfo(Integer characterId, List<Integer> contactIds, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = deleteCharactersCharacterIdContactsCall(characterId, contactIds, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete contacts (asynchronously)
     * Bulk delete contacts  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to edit (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCharactersCharacterIdContactsAsync(Integer characterId, List<Integer> contactIds, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCharactersCharacterIdContactsCall(characterId, contactIds, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdContacts */
    private com.squareup.okhttp.Call getCharactersCharacterIdContactsCall(Integer characterId, String datasource, Integer page, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdContacts(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/contacts/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
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
     * Get contacts
     * Return contacts of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page page integer (optional, default to 1)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdContacts200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdContacts200Ok> getCharactersCharacterIdContacts(Integer characterId, String datasource, Integer page, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdContacts200Ok>> resp = getCharactersCharacterIdContactsWithHttpInfo(characterId, datasource, page, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get contacts
     * Return contacts of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page page integer (optional, default to 1)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdContacts200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdContacts200Ok>> getCharactersCharacterIdContactsWithHttpInfo(Integer characterId, String datasource, Integer page, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdContactsCall(characterId, datasource, page, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContacts200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contacts (asynchronously)
     * Return contacts of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param page page integer (optional, default to 1)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContactsAsync(Integer characterId, String datasource, Integer page, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdContacts200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdContactsCall(characterId, datasource, page, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContacts200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdContactsLabels */
    private com.squareup.okhttp.Call getCharactersCharacterIdContactsLabelsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdContactsLabels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/contacts/labels/".replaceAll("\\{format\\}","json")
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
     * Get contact labels
     * Return custom labels for contacts the character defined  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdContactsLabels200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdContactsLabels200Ok> getCharactersCharacterIdContactsLabels(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdContactsLabels200Ok>> resp = getCharactersCharacterIdContactsLabelsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get contact labels
     * Return custom labels for contacts the character defined  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdContactsLabels200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdContactsLabels200Ok>> getCharactersCharacterIdContactsLabelsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdContactsLabelsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContactsLabels200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contact labels (asynchronously)
     * Return custom labels for contacts the character defined  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;   ---  This route is cached for up to 300 seconds
     * @param characterId ID for a character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdContactsLabelsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdContactsLabels200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdContactsLabelsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdContactsLabels200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postCharactersCharacterIdContacts */
    private com.squareup.okhttp.Call postCharactersCharacterIdContactsCall(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = contactIds;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling postCharactersCharacterIdContacts(Async)");
        }
        
        // verify the required parameter 'contactIds' is set
        if (contactIds == null) {
            throw new ApiException("Missing the required parameter 'contactIds' when calling postCharactersCharacterIdContacts(Async)");
        }
        
        // verify the required parameter 'standing' is set
        if (standing == null) {
            throw new ApiException("Missing the required parameter 'standing' when calling postCharactersCharacterIdContacts(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/contacts/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (labelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "label_id", labelId));
        if (standing != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "standing", standing));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_agent", userAgent));
        if (watched != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "watched", watched));

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
     * Add contacts
     * Bulk add contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to add (required)
     * @param standing Standing for the new contact (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labelId Add a custom label to the new contact (optional, default to 0)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param watched Whether the new contact should be watched, note this is only effective on characters (optional, default to false)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> postCharactersCharacterIdContacts(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = postCharactersCharacterIdContactsWithHttpInfo(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);
        return resp.getData();
    }

    /**
     * Add contacts
     * Bulk add contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to add (required)
     * @param standing Standing for the new contact (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labelId Add a custom label to the new contact (optional, default to 0)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param watched Whether the new contact should be watched, note this is only effective on characters (optional, default to false)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> postCharactersCharacterIdContactsWithHttpInfo(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postCharactersCharacterIdContactsCall(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add contacts (asynchronously)
     * Bulk add contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to add (required)
     * @param standing Standing for the new contact (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labelId Add a custom label to the new contact (optional, default to 0)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param watched Whether the new contact should be watched, note this is only effective on characters (optional, default to false)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCharactersCharacterIdContactsAsync(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCharactersCharacterIdContactsCall(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for putCharactersCharacterIdContacts */
    private com.squareup.okhttp.Call putCharactersCharacterIdContactsCall(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = contactIds;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling putCharactersCharacterIdContacts(Async)");
        }
        
        // verify the required parameter 'contactIds' is set
        if (contactIds == null) {
            throw new ApiException("Missing the required parameter 'contactIds' when calling putCharactersCharacterIdContacts(Async)");
        }
        
        // verify the required parameter 'standing' is set
        if (standing == null) {
            throw new ApiException("Missing the required parameter 'standing' when calling putCharactersCharacterIdContacts(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/contacts/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (labelId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "label_id", labelId));
        if (standing != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "standing", standing));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_agent", userAgent));
        if (watched != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "watched", watched));

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
     * Edit contacts
     * Bulk edit contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to edit (required)
     * @param standing Standing for the contact (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labelId Add a custom label to the contact, use 0 for clearing label (optional, default to 0)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param watched Whether the contact should be watched, note this is only effective on characters (optional, default to false)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putCharactersCharacterIdContacts(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent) throws ApiException {
        putCharactersCharacterIdContactsWithHttpInfo(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);
    }

    /**
     * Edit contacts
     * Bulk edit contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to edit (required)
     * @param standing Standing for the contact (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labelId Add a custom label to the contact, use 0 for clearing label (optional, default to 0)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param watched Whether the contact should be watched, note this is only effective on characters (optional, default to false)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putCharactersCharacterIdContactsWithHttpInfo(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putCharactersCharacterIdContactsCall(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Edit contacts (asynchronously)
     * Bulk edit contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 
     * @param characterId ID for a character (required)
     * @param contactIds A list of contacts to edit (required)
     * @param standing Standing for the contact (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labelId Add a custom label to the contact, use 0 for clearing label (optional, default to 0)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param watched Whether the contact should be watched, note this is only effective on characters (optional, default to false)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCharactersCharacterIdContactsAsync(Integer characterId, List<Integer> contactIds, Float standing, String datasource, Long labelId, String token, String userAgent, Boolean watched, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putCharactersCharacterIdContactsCall(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
