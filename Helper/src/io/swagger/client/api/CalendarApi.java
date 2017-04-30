

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

import io.swagger.client.model.GetCharactersCharacterIdCalendar200Ok;
import io.swagger.client.model.GetCharactersCharacterIdCalendarEventIdForbidden;
import io.swagger.client.model.GetCharactersCharacterIdCalendarEventIdInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdCalendarEventIdOk;
import io.swagger.client.model.GetCharactersCharacterIdCalendarForbidden;
import io.swagger.client.model.GetCharactersCharacterIdCalendarInternalServerError;
import io.swagger.client.model.PutCharactersCharacterIdCalendarEventIdForbidden;
import io.swagger.client.model.PutCharactersCharacterIdCalendarEventIdInternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalendarApi {
    private ApiClient apiClient;

    public CalendarApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CalendarApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdCalendar */
    private com.squareup.okhttp.Call getCharactersCharacterIdCalendarCall(Integer characterId, String datasource, Integer fromEvent, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdCalendar(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/calendar/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (fromEvent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_event", fromEvent));
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
     * List calendar event summaries
     * Get 50 event summaries from the calendar. If no event ID is given, the resource will return the next 50 chronological event summaries from now. If an event ID is specified, it will return the next 50 chronological event summaries from after that event.   ---  Alternate route: &#x60;/v1/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId The character to retrieve events from (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param fromEvent The event ID to retrieve events from (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdCalendar200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdCalendar200Ok> getCharactersCharacterIdCalendar(Integer characterId, String datasource, Integer fromEvent, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdCalendar200Ok>> resp = getCharactersCharacterIdCalendarWithHttpInfo(characterId, datasource, fromEvent, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List calendar event summaries
     * Get 50 event summaries from the calendar. If no event ID is given, the resource will return the next 50 chronological event summaries from now. If an event ID is specified, it will return the next 50 chronological event summaries from after that event.   ---  Alternate route: &#x60;/v1/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId The character to retrieve events from (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param fromEvent The event ID to retrieve events from (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdCalendar200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdCalendar200Ok>> getCharactersCharacterIdCalendarWithHttpInfo(Integer characterId, String datasource, Integer fromEvent, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdCalendarCall(characterId, datasource, fromEvent, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdCalendar200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List calendar event summaries (asynchronously)
     * Get 50 event summaries from the calendar. If no event ID is given, the resource will return the next 50 chronological event summaries from now. If an event ID is specified, it will return the next 50 chronological event summaries from after that event.   ---  Alternate route: &#x60;/v1/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId The character to retrieve events from (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param fromEvent The event ID to retrieve events from (optional)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdCalendarAsync(Integer characterId, String datasource, Integer fromEvent, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdCalendar200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdCalendarCall(characterId, datasource, fromEvent, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdCalendar200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdCalendarEventId */
    private com.squareup.okhttp.Call getCharactersCharacterIdCalendarEventIdCall(Integer characterId, Integer eventId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdCalendarEventId(Async)");
        }
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling getCharactersCharacterIdCalendarEventId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/calendar/{event_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

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
     * Get an event
     * Get all the information for a specific event  ---  Alternate route: &#x60;/v2/characters/{character_id}/calendar/{event_id}/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId The character id requesting the event (required)
     * @param eventId The id of the event requested (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdCalendarEventIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventId(Integer characterId, Integer eventId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdCalendarEventIdOk> resp = getCharactersCharacterIdCalendarEventIdWithHttpInfo(characterId, eventId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get an event
     * Get all the information for a specific event  ---  Alternate route: &#x60;/v2/characters/{character_id}/calendar/{event_id}/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId The character id requesting the event (required)
     * @param eventId The id of the event requested (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdCalendarEventIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdCalendarEventIdOk> getCharactersCharacterIdCalendarEventIdWithHttpInfo(Integer characterId, Integer eventId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdCalendarEventIdCall(characterId, eventId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdCalendarEventIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an event (asynchronously)
     * Get all the information for a specific event  ---  Alternate route: &#x60;/v2/characters/{character_id}/calendar/{event_id}/&#x60;   ---  This route is cached for up to 5 seconds
     * @param characterId The character id requesting the event (required)
     * @param eventId The id of the event requested (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdCalendarEventIdAsync(Integer characterId, Integer eventId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdCalendarEventIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdCalendarEventIdCall(characterId, eventId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdCalendarEventIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for putCharactersCharacterIdCalendarEventId */
    private com.squareup.okhttp.Call putCharactersCharacterIdCalendarEventIdCall(Integer characterId, Integer eventId, String response, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling putCharactersCharacterIdCalendarEventId(Async)");
        }
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling putCharactersCharacterIdCalendarEventId(Async)");
        }
        
        // verify the required parameter 'response' is set
        if (response == null) {
            throw new ApiException("Missing the required parameter 'response' when calling putCharactersCharacterIdCalendarEventId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/calendar/{event_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "event_id" + "\\}", apiClient.escapeString(eventId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (response != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "response", response));
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
     * Respond to an event
     * Set your response status to an event  ---  Alternate route: &#x60;/v2/characters/{character_id}/calendar/{event_id}/&#x60; 
     * @param characterId The character ID requesting the event (required)
     * @param eventId The ID of the event requested (required)
     * @param response The response value to set, overriding current value. (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putCharactersCharacterIdCalendarEventId(Integer characterId, Integer eventId, String response, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        putCharactersCharacterIdCalendarEventIdWithHttpInfo(characterId, eventId, response, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Respond to an event
     * Set your response status to an event  ---  Alternate route: &#x60;/v2/characters/{character_id}/calendar/{event_id}/&#x60; 
     * @param characterId The character ID requesting the event (required)
     * @param eventId The ID of the event requested (required)
     * @param response The response value to set, overriding current value. (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putCharactersCharacterIdCalendarEventIdWithHttpInfo(Integer characterId, Integer eventId, String response, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putCharactersCharacterIdCalendarEventIdCall(characterId, eventId, response, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Respond to an event (asynchronously)
     * Set your response status to an event  ---  Alternate route: &#x60;/v2/characters/{character_id}/calendar/{event_id}/&#x60; 
     * @param characterId The character ID requesting the event (required)
     * @param eventId The ID of the event requested (required)
     * @param response The response value to set, overriding current value. (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putCharactersCharacterIdCalendarEventIdAsync(Integer characterId, Integer eventId, String response, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putCharactersCharacterIdCalendarEventIdCall(characterId, eventId, response, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
