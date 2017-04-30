

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

import io.swagger.client.model.DeleteCharactersCharacterIdMailLabelsLabelIdForbidden;
import io.swagger.client.model.DeleteCharactersCharacterIdMailLabelsLabelIdInternalServerError;
import io.swagger.client.model.DeleteCharactersCharacterIdMailLabelsLabelIdUnprocessableEntity;
import io.swagger.client.model.DeleteCharactersCharacterIdMailMailIdForbidden;
import io.swagger.client.model.DeleteCharactersCharacterIdMailMailIdInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdMail200Ok;
import io.swagger.client.model.GetCharactersCharacterIdMailForbidden;
import io.swagger.client.model.GetCharactersCharacterIdMailInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdMailLabels200Ok;
import io.swagger.client.model.GetCharactersCharacterIdMailLabelsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdMailLabelsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdMailLists200Ok;
import io.swagger.client.model.GetCharactersCharacterIdMailListsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdMailListsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdMailMailIdForbidden;
import io.swagger.client.model.GetCharactersCharacterIdMailMailIdInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdMailMailIdNotFound;
import io.swagger.client.model.GetCharactersCharacterIdMailMailIdOk;
import io.swagger.client.model.GetCharactersCharacterIdMailUnreadForbidden;
import io.swagger.client.model.GetCharactersCharacterIdMailUnreadInternalServerError;
import io.swagger.client.model.PostCharactersCharacterIdMailBadRequest;
import io.swagger.client.model.PostCharactersCharacterIdMailForbidden;
import io.swagger.client.model.PostCharactersCharacterIdMailInternalServerError;
import io.swagger.client.model.PostCharactersCharacterIdMailLabelsForbidden;
import io.swagger.client.model.PostCharactersCharacterIdMailLabelsInternalServerError;
import io.swagger.client.model.PostCharactersCharacterIdMailLabelsLabel;
import io.swagger.client.model.PostCharactersCharacterIdMailMail;
import io.swagger.client.model.PutCharactersCharacterIdMailMailIdBadRequest;
import io.swagger.client.model.PutCharactersCharacterIdMailMailIdContents;
import io.swagger.client.model.PutCharactersCharacterIdMailMailIdForbidden;
import io.swagger.client.model.PutCharactersCharacterIdMailMailIdInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailApi {
    private ApiClient apiClient;

    public MailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteCharactersCharacterIdMailLabelsLabelId */
    private com.squareup.okhttp.Call deleteCharactersCharacterIdMailLabelsLabelIdCall(Integer characterId, Integer labelId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdMailLabelsLabelId(Async)");
        }
        
        // verify the required parameter 'labelId' is set
        if (labelId == null) {
            throw new ApiException("Missing the required parameter 'labelId' when calling deleteCharactersCharacterIdMailLabelsLabelId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/labels/{label_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "label_id" + "\\}", apiClient.escapeString(labelId.toString()));

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
     * Delete a mail label
     * Delete a mail label  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/{label_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param labelId An EVE label id (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCharactersCharacterIdMailLabelsLabelId(Integer characterId, Integer labelId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        deleteCharactersCharacterIdMailLabelsLabelIdWithHttpInfo(characterId, labelId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Delete a mail label
     * Delete a mail label  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/{label_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param labelId An EVE label id (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCharactersCharacterIdMailLabelsLabelIdWithHttpInfo(Integer characterId, Integer labelId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = deleteCharactersCharacterIdMailLabelsLabelIdCall(characterId, labelId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a mail label (asynchronously)
     * Delete a mail label  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/{label_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param labelId An EVE label id (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCharactersCharacterIdMailLabelsLabelIdAsync(Integer characterId, Integer labelId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCharactersCharacterIdMailLabelsLabelIdCall(characterId, labelId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteCharactersCharacterIdMailMailId */
    private com.squareup.okhttp.Call deleteCharactersCharacterIdMailMailIdCall(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling deleteCharactersCharacterIdMailMailId(Async)");
        }
        
        // verify the required parameter 'mailId' is set
        if (mailId == null) {
            throw new ApiException("Missing the required parameter 'mailId' when calling deleteCharactersCharacterIdMailMailId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/{mail_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "mail_id" + "\\}", apiClient.escapeString(mailId.toString()));

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
     * Delete a mail
     * Delete a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCharactersCharacterIdMailMailId(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        deleteCharactersCharacterIdMailMailIdWithHttpInfo(characterId, mailId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Delete a mail
     * Delete a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCharactersCharacterIdMailMailIdWithHttpInfo(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = deleteCharactersCharacterIdMailMailIdCall(characterId, mailId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a mail (asynchronously)
     * Delete a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCharactersCharacterIdMailMailIdAsync(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCharactersCharacterIdMailMailIdCall(characterId, mailId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdMail */
    private com.squareup.okhttp.Call getCharactersCharacterIdMailCall(Integer characterId, String datasource, List<Long> labels, Integer lastMailId, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdMail(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (labels != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "labels", labels));
        if (lastMailId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_mail_id", lastMailId));
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
     * Return mail headers
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards.  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labels Fetch only mails that match one or more of the given labels (optional)
     * @param lastMailId List only mail with an ID lower than the given ID, if present (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdMail200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdMail200Ok> getCharactersCharacterIdMail(Integer characterId, String datasource, List<Long> labels, Integer lastMailId, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdMail200Ok>> resp = getCharactersCharacterIdMailWithHttpInfo(characterId, datasource, labels, lastMailId, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Return mail headers
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards.  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labels Fetch only mails that match one or more of the given labels (optional)
     * @param lastMailId List only mail with an ID lower than the given ID, if present (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdMail200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdMail200Ok>> getCharactersCharacterIdMailWithHttpInfo(Integer characterId, String datasource, List<Long> labels, Integer lastMailId, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdMailCall(characterId, datasource, labels, lastMailId, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMail200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return mail headers (asynchronously)
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards.  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param labels Fetch only mails that match one or more of the given labels (optional)
     * @param lastMailId List only mail with an ID lower than the given ID, if present (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdMailAsync(Integer characterId, String datasource, List<Long> labels, Integer lastMailId, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdMail200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdMailCall(characterId, datasource, labels, lastMailId, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMail200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdMailLabels */
    private com.squareup.okhttp.Call getCharactersCharacterIdMailLabelsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdMailLabels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/labels/".replaceAll("\\{format\\}","json")
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
     * Get mail labels
     * Return a list of the users mail labels  ---  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdMailLabels200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdMailLabels200Ok> getCharactersCharacterIdMailLabels(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdMailLabels200Ok>> resp = getCharactersCharacterIdMailLabelsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get mail labels
     * Return a list of the users mail labels  ---  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdMailLabels200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdMailLabels200Ok>> getCharactersCharacterIdMailLabelsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdMailLabelsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMailLabels200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get mail labels (asynchronously)
     * Return a list of the users mail labels  ---  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdMailLabelsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdMailLabels200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdMailLabelsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMailLabels200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdMailLists */
    private com.squareup.okhttp.Call getCharactersCharacterIdMailListsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdMailLists(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/lists/".replaceAll("\\{format\\}","json")
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
     * Return mailing list subscriptions
     * Return all mailing lists that the character is subscribed to   ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/lists/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdMailLists200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdMailLists200Ok> getCharactersCharacterIdMailLists(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdMailLists200Ok>> resp = getCharactersCharacterIdMailListsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Return mailing list subscriptions
     * Return all mailing lists that the character is subscribed to   ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/lists/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdMailLists200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdMailLists200Ok>> getCharactersCharacterIdMailListsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdMailListsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMailLists200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return mailing list subscriptions (asynchronously)
     * Return all mailing lists that the character is subscribed to   ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/lists/&#x60;   ---  This route is cached for up to 120 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdMailListsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdMailLists200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdMailListsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdMailLists200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdMailMailId */
    private com.squareup.okhttp.Call getCharactersCharacterIdMailMailIdCall(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdMailMailId(Async)");
        }
        
        // verify the required parameter 'mailId' is set
        if (mailId == null) {
            throw new ApiException("Missing the required parameter 'mailId' when calling getCharactersCharacterIdMailMailId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/{mail_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "mail_id" + "\\}", apiClient.escapeString(mailId.toString()));

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
     * Return a mail
     * Return the contents of an EVE mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdMailMailIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdMailMailIdOk getCharactersCharacterIdMailMailId(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdMailMailIdOk> resp = getCharactersCharacterIdMailMailIdWithHttpInfo(characterId, mailId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Return a mail
     * Return the contents of an EVE mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdMailMailIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdMailMailIdOk> getCharactersCharacterIdMailMailIdWithHttpInfo(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdMailMailIdCall(characterId, mailId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdMailMailIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a mail (asynchronously)
     * Return the contents of an EVE mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;   ---  This route is cached for up to 30 seconds
     * @param characterId An EVE character ID (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdMailMailIdAsync(Integer characterId, Integer mailId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdMailMailIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdMailMailIdCall(characterId, mailId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdMailMailIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdMailUnread */
    private com.squareup.okhttp.Call getCharactersCharacterIdMailUnreadCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdMailUnread(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/unread/".replaceAll("\\{format\\}","json")
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
     * Return the number of unread mails
     * Return the number of unread mails for the character   ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/unread/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Integer getCharactersCharacterIdMailUnread(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<Integer> resp = getCharactersCharacterIdMailUnreadWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Return the number of unread mails
     * Return the number of unread mails for the character   ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/unread/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Integer> getCharactersCharacterIdMailUnreadWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdMailUnreadCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return the number of unread mails (asynchronously)
     * Return the number of unread mails for the character   ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/unread/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdMailUnreadAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Integer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdMailUnreadCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postCharactersCharacterIdMail */
    private com.squareup.okhttp.Call postCharactersCharacterIdMailCall(Integer characterId, PostCharactersCharacterIdMailMail mail, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = mail;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling postCharactersCharacterIdMail(Async)");
        }
        
        // verify the required parameter 'mail' is set
        if (mail == null) {
            throw new ApiException("Missing the required parameter 'mail' when calling postCharactersCharacterIdMail(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/".replaceAll("\\{format\\}","json")
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
     * Send a new mail
     * Create and send a new mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60; 
     * @param characterId The sender&#39;s character ID (required)
     * @param mail The mail to send (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Integer postCharactersCharacterIdMail(Integer characterId, PostCharactersCharacterIdMailMail mail, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<Integer> resp = postCharactersCharacterIdMailWithHttpInfo(characterId, mail, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Send a new mail
     * Create and send a new mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60; 
     * @param characterId The sender&#39;s character ID (required)
     * @param mail The mail to send (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Integer> postCharactersCharacterIdMailWithHttpInfo(Integer characterId, PostCharactersCharacterIdMailMail mail, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postCharactersCharacterIdMailCall(characterId, mail, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a new mail (asynchronously)
     * Create and send a new mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60; 
     * @param characterId The sender&#39;s character ID (required)
     * @param mail The mail to send (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCharactersCharacterIdMailAsync(Integer characterId, PostCharactersCharacterIdMailMail mail, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Integer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCharactersCharacterIdMailCall(characterId, mail, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postCharactersCharacterIdMailLabels */
    private com.squareup.okhttp.Call postCharactersCharacterIdMailLabelsCall(Integer characterId, String datasource, PostCharactersCharacterIdMailLabelsLabel label, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = label;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling postCharactersCharacterIdMailLabels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/labels/".replaceAll("\\{format\\}","json")
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
     * Create a mail label
     * Create a mail label  ---  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param label Label to create (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Long postCharactersCharacterIdMailLabels(Integer characterId, String datasource, PostCharactersCharacterIdMailLabelsLabel label, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<Long> resp = postCharactersCharacterIdMailLabelsWithHttpInfo(characterId, datasource, label, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Create a mail label
     * Create a mail label  ---  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param label Label to create (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Long> postCharactersCharacterIdMailLabelsWithHttpInfo(Integer characterId, String datasource, PostCharactersCharacterIdMailLabelsLabel label, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postCharactersCharacterIdMailLabelsCall(characterId, datasource, label, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a mail label (asynchronously)
     * Create a mail label  ---  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param label Label to create (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCharactersCharacterIdMailLabelsAsync(Integer characterId, String datasource, PostCharactersCharacterIdMailLabelsLabel label, String token, String userAgent, String xUserAgent, final ApiCallback<Long> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCharactersCharacterIdMailLabelsCall(characterId, datasource, label, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for putCharactersCharacterIdMailMailId */
    private com.squareup.okhttp.Call putCharactersCharacterIdMailMailIdCall(Integer characterId, PutCharactersCharacterIdMailMailIdContents contents, Integer mailId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = contents;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling putCharactersCharacterIdMailMailId(Async)");
        }
        
        // verify the required parameter 'contents' is set
        if (contents == null) {
            throw new ApiException("Missing the required parameter 'contents' when calling putCharactersCharacterIdMailMailId(Async)");
        }
        
        // verify the required parameter 'mailId' is set
        if (mailId == null) {
            throw new ApiException("Missing the required parameter 'mailId' when calling putCharactersCharacterIdMailMailId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/mail/{mail_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "mail_id" + "\\}", apiClient.escapeString(mailId.toString()));

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
     * Update metadata about a mail
     * Update metadata about a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param contents Data used to update the mail (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putCharactersCharacterIdMailMailId(Integer characterId, PutCharactersCharacterIdMailMailIdContents contents, Integer mailId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        putCharactersCharacterIdMailMailIdWithHttpInfo(characterId, contents, mailId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Update metadata about a mail
     * Update metadata about a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param contents Data used to update the mail (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putCharactersCharacterIdMailMailIdWithHttpInfo(Integer characterId, PutCharactersCharacterIdMailMailIdContents contents, Integer mailId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putCharactersCharacterIdMailMailIdCall(characterId, contents, mailId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update metadata about a mail (asynchronously)
     * Update metadata about a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60; 
     * @param characterId An EVE character ID (required)
     * @param contents Data used to update the mail (required)
     * @param mailId An EVE mail ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCharactersCharacterIdMailMailIdAsync(Integer characterId, PutCharactersCharacterIdMailMailIdContents contents, Integer mailId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putCharactersCharacterIdMailMailIdCall(characterId, contents, mailId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
