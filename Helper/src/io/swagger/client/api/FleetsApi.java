

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

import io.swagger.client.model.DeleteFleetsFleetIdMembersMemberIdForbidden;
import io.swagger.client.model.DeleteFleetsFleetIdMembersMemberIdInternalServerError;
import io.swagger.client.model.DeleteFleetsFleetIdMembersMemberIdNotFound;
import io.swagger.client.model.DeleteFleetsFleetIdSquadsSquadIdForbidden;
import io.swagger.client.model.DeleteFleetsFleetIdSquadsSquadIdInternalServerError;
import io.swagger.client.model.DeleteFleetsFleetIdSquadsSquadIdNotFound;
import io.swagger.client.model.DeleteFleetsFleetIdWingsWingIdForbidden;
import io.swagger.client.model.DeleteFleetsFleetIdWingsWingIdInternalServerError;
import io.swagger.client.model.DeleteFleetsFleetIdWingsWingIdNotFound;
import io.swagger.client.model.GetFleetsFleetIdForbidden;
import io.swagger.client.model.GetFleetsFleetIdInternalServerError;
import io.swagger.client.model.GetFleetsFleetIdMembers200Ok;
import io.swagger.client.model.GetFleetsFleetIdMembersForbidden;
import io.swagger.client.model.GetFleetsFleetIdMembersInternalServerError;
import io.swagger.client.model.GetFleetsFleetIdMembersNotFound;
import io.swagger.client.model.GetFleetsFleetIdNotFound;
import io.swagger.client.model.GetFleetsFleetIdOk;
import io.swagger.client.model.GetFleetsFleetIdWings200Ok;
import io.swagger.client.model.GetFleetsFleetIdWingsForbidden;
import io.swagger.client.model.GetFleetsFleetIdWingsInternalServerError;
import io.swagger.client.model.GetFleetsFleetIdWingsNotFound;
import io.swagger.client.model.PostFleetsFleetIdMembersForbidden;
import io.swagger.client.model.PostFleetsFleetIdMembersInternalServerError;
import io.swagger.client.model.PostFleetsFleetIdMembersInvitation;
import io.swagger.client.model.PostFleetsFleetIdMembersNotFound;
import io.swagger.client.model.PostFleetsFleetIdMembersUnprocessableEntity;
import io.swagger.client.model.PostFleetsFleetIdWingsCreated;
import io.swagger.client.model.PostFleetsFleetIdWingsForbidden;
import io.swagger.client.model.PostFleetsFleetIdWingsInternalServerError;
import io.swagger.client.model.PostFleetsFleetIdWingsNotFound;
import io.swagger.client.model.PostFleetsFleetIdWingsWingIdSquadsCreated;
import io.swagger.client.model.PostFleetsFleetIdWingsWingIdSquadsForbidden;
import io.swagger.client.model.PostFleetsFleetIdWingsWingIdSquadsInternalServerError;
import io.swagger.client.model.PostFleetsFleetIdWingsWingIdSquadsNotFound;
import io.swagger.client.model.PutFleetsFleetIdBadRequest;
import io.swagger.client.model.PutFleetsFleetIdForbidden;
import io.swagger.client.model.PutFleetsFleetIdInternalServerError;
import io.swagger.client.model.PutFleetsFleetIdMembersMemberIdForbidden;
import io.swagger.client.model.PutFleetsFleetIdMembersMemberIdInternalServerError;
import io.swagger.client.model.PutFleetsFleetIdMembersMemberIdMovement;
import io.swagger.client.model.PutFleetsFleetIdMembersMemberIdNotFound;
import io.swagger.client.model.PutFleetsFleetIdMembersMemberIdUnprocessableEntity;
import io.swagger.client.model.PutFleetsFleetIdNewSettings;
import io.swagger.client.model.PutFleetsFleetIdNotFound;
import io.swagger.client.model.PutFleetsFleetIdSquadsSquadIdForbidden;
import io.swagger.client.model.PutFleetsFleetIdSquadsSquadIdInternalServerError;
import io.swagger.client.model.PutFleetsFleetIdSquadsSquadIdNaming;
import io.swagger.client.model.PutFleetsFleetIdSquadsSquadIdNotFound;
import io.swagger.client.model.PutFleetsFleetIdWingsWingIdForbidden;
import io.swagger.client.model.PutFleetsFleetIdWingsWingIdInternalServerError;
import io.swagger.client.model.PutFleetsFleetIdWingsWingIdNaming;
import io.swagger.client.model.PutFleetsFleetIdWingsWingIdNotFound;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FleetsApi {
    private ApiClient apiClient;

    public FleetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FleetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteFleetsFleetIdMembersMemberId */
    private com.squareup.okhttp.Call deleteFleetsFleetIdMembersMemberIdCall(Long fleetId, Integer memberId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling deleteFleetsFleetIdMembersMemberId(Async)");
        }
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling deleteFleetsFleetIdMembersMemberId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/members/{member_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()))
        .replaceAll("\\{" + "member_id" + "\\}", apiClient.escapeString(memberId.toString()));

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
     * Kick fleet member
     * Kick a fleet member  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param memberId The character ID of a member in this fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFleetsFleetIdMembersMemberId(Long fleetId, Integer memberId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        deleteFleetsFleetIdMembersMemberIdWithHttpInfo(fleetId, memberId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Kick fleet member
     * Kick a fleet member  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param memberId The character ID of a member in this fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFleetsFleetIdMembersMemberIdWithHttpInfo(Long fleetId, Integer memberId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = deleteFleetsFleetIdMembersMemberIdCall(fleetId, memberId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Kick fleet member (asynchronously)
     * Kick a fleet member  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param memberId The character ID of a member in this fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFleetsFleetIdMembersMemberIdAsync(Long fleetId, Integer memberId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFleetsFleetIdMembersMemberIdCall(fleetId, memberId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteFleetsFleetIdSquadsSquadId */
    private com.squareup.okhttp.Call deleteFleetsFleetIdSquadsSquadIdCall(Long fleetId, Long squadId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling deleteFleetsFleetIdSquadsSquadId(Async)");
        }
        
        // verify the required parameter 'squadId' is set
        if (squadId == null) {
            throw new ApiException("Missing the required parameter 'squadId' when calling deleteFleetsFleetIdSquadsSquadId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/squads/{squad_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()))
        .replaceAll("\\{" + "squad_id" + "\\}", apiClient.escapeString(squadId.toString()));

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
     * Delete fleet squad
     * Delete a fleet squad, only empty squads can be deleted  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param squadId The squad to delete (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFleetsFleetIdSquadsSquadId(Long fleetId, Long squadId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        deleteFleetsFleetIdSquadsSquadIdWithHttpInfo(fleetId, squadId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Delete fleet squad
     * Delete a fleet squad, only empty squads can be deleted  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param squadId The squad to delete (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFleetsFleetIdSquadsSquadIdWithHttpInfo(Long fleetId, Long squadId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = deleteFleetsFleetIdSquadsSquadIdCall(fleetId, squadId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete fleet squad (asynchronously)
     * Delete a fleet squad, only empty squads can be deleted  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param squadId The squad to delete (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFleetsFleetIdSquadsSquadIdAsync(Long fleetId, Long squadId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFleetsFleetIdSquadsSquadIdCall(fleetId, squadId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteFleetsFleetIdWingsWingId */
    private com.squareup.okhttp.Call deleteFleetsFleetIdWingsWingIdCall(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling deleteFleetsFleetIdWingsWingId(Async)");
        }
        
        // verify the required parameter 'wingId' is set
        if (wingId == null) {
            throw new ApiException("Missing the required parameter 'wingId' when calling deleteFleetsFleetIdWingsWingId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/wings/{wing_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()))
        .replaceAll("\\{" + "wing_id" + "\\}", apiClient.escapeString(wingId.toString()));

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
     * Delete fleet wing
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param wingId The wing to delete (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFleetsFleetIdWingsWingId(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        deleteFleetsFleetIdWingsWingIdWithHttpInfo(fleetId, wingId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Delete fleet wing
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param wingId The wing to delete (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFleetsFleetIdWingsWingIdWithHttpInfo(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = deleteFleetsFleetIdWingsWingIdCall(fleetId, wingId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete fleet wing (asynchronously)
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param wingId The wing to delete (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFleetsFleetIdWingsWingIdAsync(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFleetsFleetIdWingsWingIdCall(fleetId, wingId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getFleetsFleetId */
    private com.squareup.okhttp.Call getFleetsFleetIdCall(Long fleetId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling getFleetsFleetId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()));

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
     * Get fleet information
     * Return details about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetFleetsFleetIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetFleetsFleetIdOk getFleetsFleetId(Long fleetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetFleetsFleetIdOk> resp = getFleetsFleetIdWithHttpInfo(fleetId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get fleet information
     * Return details about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetFleetsFleetIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetFleetsFleetIdOk> getFleetsFleetIdWithHttpInfo(Long fleetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getFleetsFleetIdCall(fleetId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetFleetsFleetIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get fleet information (asynchronously)
     * Return details about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetsFleetIdAsync(Long fleetId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<GetFleetsFleetIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetsFleetIdCall(fleetId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFleetsFleetIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getFleetsFleetIdMembers */
    private com.squareup.okhttp.Call getFleetsFleetIdMembersCall(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling getFleetsFleetIdMembers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/members/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
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
     * Get fleet members
     * Return information about fleet members  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetFleetsFleetIdMembers200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetFleetsFleetIdMembers200Ok> getFleetsFleetIdMembers(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetFleetsFleetIdMembers200Ok>> resp = getFleetsFleetIdMembersWithHttpInfo(fleetId, datasource, language, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get fleet members
     * Return information about fleet members  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetFleetsFleetIdMembers200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetFleetsFleetIdMembers200Ok>> getFleetsFleetIdMembersWithHttpInfo(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getFleetsFleetIdMembersCall(fleetId, datasource, language, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetFleetsFleetIdMembers200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get fleet members (asynchronously)
     * Return information about fleet members  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetsFleetIdMembersAsync(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetFleetsFleetIdMembers200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetsFleetIdMembersCall(fleetId, datasource, language, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetFleetsFleetIdMembers200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getFleetsFleetIdWings */
    private com.squareup.okhttp.Call getFleetsFleetIdWingsCall(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling getFleetsFleetIdWings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/wings/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
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
     * Get fleet wings
     * Return information about wings in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetFleetsFleetIdWings200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetFleetsFleetIdWings200Ok> getFleetsFleetIdWings(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetFleetsFleetIdWings200Ok>> resp = getFleetsFleetIdWingsWithHttpInfo(fleetId, datasource, language, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get fleet wings
     * Return information about wings in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetFleetsFleetIdWings200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetFleetsFleetIdWings200Ok>> getFleetsFleetIdWingsWithHttpInfo(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getFleetsFleetIdWingsCall(fleetId, datasource, language, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetFleetsFleetIdWings200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get fleet wings (asynchronously)
     * Return information about wings in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;   ---  This route is cached for up to 5 seconds
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFleetsFleetIdWingsAsync(Long fleetId, String datasource, String language, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetFleetsFleetIdWings200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFleetsFleetIdWingsCall(fleetId, datasource, language, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetFleetsFleetIdWings200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postFleetsFleetIdMembers */
    private com.squareup.okhttp.Call postFleetsFleetIdMembersCall(Long fleetId, PostFleetsFleetIdMembersInvitation invitation, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = invitation;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling postFleetsFleetIdMembers(Async)");
        }
        
        // verify the required parameter 'invitation' is set
        if (invitation == null) {
            throw new ApiException("Missing the required parameter 'invitation' when calling postFleetsFleetIdMembers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/members/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()));

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
     * Create fleet invitation
     * Invite a character into the fleet, if a character has a CSPA charge set, it is not possible to invite them to the fleet using ESI  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param invitation Details of the invitation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postFleetsFleetIdMembers(Long fleetId, PostFleetsFleetIdMembersInvitation invitation, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        postFleetsFleetIdMembersWithHttpInfo(fleetId, invitation, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Create fleet invitation
     * Invite a character into the fleet, if a character has a CSPA charge set, it is not possible to invite them to the fleet using ESI  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param invitation Details of the invitation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postFleetsFleetIdMembersWithHttpInfo(Long fleetId, PostFleetsFleetIdMembersInvitation invitation, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postFleetsFleetIdMembersCall(fleetId, invitation, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create fleet invitation (asynchronously)
     * Invite a character into the fleet, if a character has a CSPA charge set, it is not possible to invite them to the fleet using ESI  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param invitation Details of the invitation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postFleetsFleetIdMembersAsync(Long fleetId, PostFleetsFleetIdMembersInvitation invitation, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postFleetsFleetIdMembersCall(fleetId, invitation, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for postFleetsFleetIdWings */
    private com.squareup.okhttp.Call postFleetsFleetIdWingsCall(Long fleetId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling postFleetsFleetIdWings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/wings/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()));

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
     * Create fleet wing
     * Create a new wing in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return PostFleetsFleetIdWingsCreated
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostFleetsFleetIdWingsCreated postFleetsFleetIdWings(Long fleetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<PostFleetsFleetIdWingsCreated> resp = postFleetsFleetIdWingsWithHttpInfo(fleetId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Create fleet wing
     * Create a new wing in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;PostFleetsFleetIdWingsCreated&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostFleetsFleetIdWingsCreated> postFleetsFleetIdWingsWithHttpInfo(Long fleetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postFleetsFleetIdWingsCall(fleetId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<PostFleetsFleetIdWingsCreated>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create fleet wing (asynchronously)
     * Create a new wing in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postFleetsFleetIdWingsAsync(Long fleetId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<PostFleetsFleetIdWingsCreated> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postFleetsFleetIdWingsCall(fleetId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostFleetsFleetIdWingsCreated>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for postFleetsFleetIdWingsWingIdSquads */
    private com.squareup.okhttp.Call postFleetsFleetIdWingsWingIdSquadsCall(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling postFleetsFleetIdWingsWingIdSquads(Async)");
        }
        
        // verify the required parameter 'wingId' is set
        if (wingId == null) {
            throw new ApiException("Missing the required parameter 'wingId' when calling postFleetsFleetIdWingsWingIdSquads(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/wings/{wing_id}/squads/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()))
        .replaceAll("\\{" + "wing_id" + "\\}", apiClient.escapeString(wingId.toString()));

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
     * Create fleet squad
     * Create a new squad in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param wingId The wing_id to create squad in (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return PostFleetsFleetIdWingsWingIdSquadsCreated
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostFleetsFleetIdWingsWingIdSquadsCreated postFleetsFleetIdWingsWingIdSquads(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<PostFleetsFleetIdWingsWingIdSquadsCreated> resp = postFleetsFleetIdWingsWingIdSquadsWithHttpInfo(fleetId, wingId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Create fleet squad
     * Create a new squad in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param wingId The wing_id to create squad in (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;PostFleetsFleetIdWingsWingIdSquadsCreated&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostFleetsFleetIdWingsWingIdSquadsCreated> postFleetsFleetIdWingsWingIdSquadsWithHttpInfo(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postFleetsFleetIdWingsWingIdSquadsCall(fleetId, wingId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<PostFleetsFleetIdWingsWingIdSquadsCreated>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create fleet squad (asynchronously)
     * Create a new squad in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param wingId The wing_id to create squad in (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postFleetsFleetIdWingsWingIdSquadsAsync(Long fleetId, Long wingId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<PostFleetsFleetIdWingsWingIdSquadsCreated> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postFleetsFleetIdWingsWingIdSquadsCall(fleetId, wingId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostFleetsFleetIdWingsWingIdSquadsCreated>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for putFleetsFleetId */
    private com.squareup.okhttp.Call putFleetsFleetIdCall(Long fleetId, PutFleetsFleetIdNewSettings newSettings, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = newSettings;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling putFleetsFleetId(Async)");
        }
        
        // verify the required parameter 'newSettings' is set
        if (newSettings == null) {
            throw new ApiException("Missing the required parameter 'newSettings' when calling putFleetsFleetId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()));

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
     * Update fleet
     * Update settings about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param newSettings What to update for this fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putFleetsFleetId(Long fleetId, PutFleetsFleetIdNewSettings newSettings, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        putFleetsFleetIdWithHttpInfo(fleetId, newSettings, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Update fleet
     * Update settings about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param newSettings What to update for this fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putFleetsFleetIdWithHttpInfo(Long fleetId, PutFleetsFleetIdNewSettings newSettings, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putFleetsFleetIdCall(fleetId, newSettings, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update fleet (asynchronously)
     * Update settings about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param newSettings What to update for this fleet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFleetsFleetIdAsync(Long fleetId, PutFleetsFleetIdNewSettings newSettings, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putFleetsFleetIdCall(fleetId, newSettings, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for putFleetsFleetIdMembersMemberId */
    private com.squareup.okhttp.Call putFleetsFleetIdMembersMemberIdCall(Long fleetId, Integer memberId, PutFleetsFleetIdMembersMemberIdMovement movement, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = movement;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling putFleetsFleetIdMembersMemberId(Async)");
        }
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException("Missing the required parameter 'memberId' when calling putFleetsFleetIdMembersMemberId(Async)");
        }
        
        // verify the required parameter 'movement' is set
        if (movement == null) {
            throw new ApiException("Missing the required parameter 'movement' when calling putFleetsFleetIdMembersMemberId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/members/{member_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()))
        .replaceAll("\\{" + "member_id" + "\\}", apiClient.escapeString(memberId.toString()));

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
     * Move fleet member
     * Move a fleet member around  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param memberId The character ID of a member in this fleet (required)
     * @param movement Details of the invitation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putFleetsFleetIdMembersMemberId(Long fleetId, Integer memberId, PutFleetsFleetIdMembersMemberIdMovement movement, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        putFleetsFleetIdMembersMemberIdWithHttpInfo(fleetId, memberId, movement, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Move fleet member
     * Move a fleet member around  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param memberId The character ID of a member in this fleet (required)
     * @param movement Details of the invitation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putFleetsFleetIdMembersMemberIdWithHttpInfo(Long fleetId, Integer memberId, PutFleetsFleetIdMembersMemberIdMovement movement, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putFleetsFleetIdMembersMemberIdCall(fleetId, memberId, movement, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move fleet member (asynchronously)
     * Move a fleet member around  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param memberId The character ID of a member in this fleet (required)
     * @param movement Details of the invitation (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFleetsFleetIdMembersMemberIdAsync(Long fleetId, Integer memberId, PutFleetsFleetIdMembersMemberIdMovement movement, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putFleetsFleetIdMembersMemberIdCall(fleetId, memberId, movement, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for putFleetsFleetIdSquadsSquadId */
    private com.squareup.okhttp.Call putFleetsFleetIdSquadsSquadIdCall(Long fleetId, PutFleetsFleetIdSquadsSquadIdNaming naming, Long squadId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = naming;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling putFleetsFleetIdSquadsSquadId(Async)");
        }
        
        // verify the required parameter 'naming' is set
        if (naming == null) {
            throw new ApiException("Missing the required parameter 'naming' when calling putFleetsFleetIdSquadsSquadId(Async)");
        }
        
        // verify the required parameter 'squadId' is set
        if (squadId == null) {
            throw new ApiException("Missing the required parameter 'squadId' when calling putFleetsFleetIdSquadsSquadId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/squads/{squad_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()))
        .replaceAll("\\{" + "squad_id" + "\\}", apiClient.escapeString(squadId.toString()));

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
     * Rename fleet squad
     * Rename a fleet squad  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param naming New name of the squad (required)
     * @param squadId The squad to rename (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putFleetsFleetIdSquadsSquadId(Long fleetId, PutFleetsFleetIdSquadsSquadIdNaming naming, Long squadId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        putFleetsFleetIdSquadsSquadIdWithHttpInfo(fleetId, naming, squadId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Rename fleet squad
     * Rename a fleet squad  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param naming New name of the squad (required)
     * @param squadId The squad to rename (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putFleetsFleetIdSquadsSquadIdWithHttpInfo(Long fleetId, PutFleetsFleetIdSquadsSquadIdNaming naming, Long squadId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putFleetsFleetIdSquadsSquadIdCall(fleetId, naming, squadId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Rename fleet squad (asynchronously)
     * Rename a fleet squad  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param naming New name of the squad (required)
     * @param squadId The squad to rename (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFleetsFleetIdSquadsSquadIdAsync(Long fleetId, PutFleetsFleetIdSquadsSquadIdNaming naming, Long squadId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putFleetsFleetIdSquadsSquadIdCall(fleetId, naming, squadId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for putFleetsFleetIdWingsWingId */
    private com.squareup.okhttp.Call putFleetsFleetIdWingsWingIdCall(Long fleetId, PutFleetsFleetIdWingsWingIdNaming naming, Long wingId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = naming;
        
        // verify the required parameter 'fleetId' is set
        if (fleetId == null) {
            throw new ApiException("Missing the required parameter 'fleetId' when calling putFleetsFleetIdWingsWingId(Async)");
        }
        
        // verify the required parameter 'naming' is set
        if (naming == null) {
            throw new ApiException("Missing the required parameter 'naming' when calling putFleetsFleetIdWingsWingId(Async)");
        }
        
        // verify the required parameter 'wingId' is set
        if (wingId == null) {
            throw new ApiException("Missing the required parameter 'wingId' when calling putFleetsFleetIdWingsWingId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/fleets/{fleet_id}/wings/{wing_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "fleet_id" + "\\}", apiClient.escapeString(fleetId.toString()))
        .replaceAll("\\{" + "wing_id" + "\\}", apiClient.escapeString(wingId.toString()));

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
     * Rename fleet wing
     * Rename a fleet wing  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param naming New name of the wing (required)
     * @param wingId The wing to rename (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void putFleetsFleetIdWingsWingId(Long fleetId, PutFleetsFleetIdWingsWingIdNaming naming, Long wingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        putFleetsFleetIdWingsWingIdWithHttpInfo(fleetId, naming, wingId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Rename fleet wing
     * Rename a fleet wing  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param naming New name of the wing (required)
     * @param wingId The wing to rename (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> putFleetsFleetIdWingsWingIdWithHttpInfo(Long fleetId, PutFleetsFleetIdWingsWingIdNaming naming, Long wingId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = putFleetsFleetIdWingsWingIdCall(fleetId, naming, wingId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Rename fleet wing (asynchronously)
     * Rename a fleet wing  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/latest/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60; 
     * @param fleetId ID for a fleet (required)
     * @param naming New name of the wing (required)
     * @param wingId The wing to rename (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putFleetsFleetIdWingsWingIdAsync(Long fleetId, PutFleetsFleetIdWingsWingIdNaming naming, Long wingId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putFleetsFleetIdWingsWingIdCall(fleetId, naming, wingId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
