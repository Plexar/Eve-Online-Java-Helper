

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

import io.swagger.client.model.PostUiAutopilotWaypointForbidden;
import io.swagger.client.model.PostUiAutopilotWaypointInternalServerError;
import io.swagger.client.model.PostUiOpenwindowContractForbidden;
import io.swagger.client.model.PostUiOpenwindowContractInternalServerError;
import io.swagger.client.model.PostUiOpenwindowInformationForbidden;
import io.swagger.client.model.PostUiOpenwindowInformationInternalServerError;
import io.swagger.client.model.PostUiOpenwindowMarketdetailsForbidden;
import io.swagger.client.model.PostUiOpenwindowMarketdetailsInternalServerError;
import io.swagger.client.model.PostUiOpenwindowNewmailForbidden;
import io.swagger.client.model.PostUiOpenwindowNewmailInternalServerError;
import io.swagger.client.model.PostUiOpenwindowNewmailNewMail;
import io.swagger.client.model.PostUiOpenwindowNewmailUnprocessableEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInterfaceApi {
    private ApiClient apiClient;

    public UserInterfaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserInterfaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for postUiAutopilotWaypoint */
    private com.squareup.okhttp.Call postUiAutopilotWaypointCall(Boolean addToBeginning, Boolean clearOtherWaypoints, Integer solarSystemId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'addToBeginning' is set
        if (addToBeginning == null) {
            throw new ApiException("Missing the required parameter 'addToBeginning' when calling postUiAutopilotWaypoint(Async)");
        }
        
        // verify the required parameter 'clearOtherWaypoints' is set
        if (clearOtherWaypoints == null) {
            throw new ApiException("Missing the required parameter 'clearOtherWaypoints' when calling postUiAutopilotWaypoint(Async)");
        }
        
        // verify the required parameter 'solarSystemId' is set
        if (solarSystemId == null) {
            throw new ApiException("Missing the required parameter 'solarSystemId' when calling postUiAutopilotWaypoint(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ui/autopilot/waypoint/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (addToBeginning != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "add_to_beginning", addToBeginning));
        if (clearOtherWaypoints != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clear_other_waypoints", clearOtherWaypoints));
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (solarSystemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "solar_system_id", solarSystemId));
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
     * Set Autopilot Waypoint
     * Set a solar system as autopilot waypoint  ---  Alternate route: &#x60;/v1/ui/autopilot/waypoint/&#x60; 
     * @param addToBeginning Whether this solar system should be added to the beginning of all waypoints (required)
     * @param clearOtherWaypoints Whether clean other waypoints beforing adding this one (required)
     * @param solarSystemId The solar system to set as autopilot waypoint (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUiAutopilotWaypoint(Boolean addToBeginning, Boolean clearOtherWaypoints, Integer solarSystemId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        postUiAutopilotWaypointWithHttpInfo(addToBeginning, clearOtherWaypoints, solarSystemId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Set Autopilot Waypoint
     * Set a solar system as autopilot waypoint  ---  Alternate route: &#x60;/v1/ui/autopilot/waypoint/&#x60; 
     * @param addToBeginning Whether this solar system should be added to the beginning of all waypoints (required)
     * @param clearOtherWaypoints Whether clean other waypoints beforing adding this one (required)
     * @param solarSystemId The solar system to set as autopilot waypoint (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUiAutopilotWaypointWithHttpInfo(Boolean addToBeginning, Boolean clearOtherWaypoints, Integer solarSystemId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postUiAutopilotWaypointCall(addToBeginning, clearOtherWaypoints, solarSystemId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Set Autopilot Waypoint (asynchronously)
     * Set a solar system as autopilot waypoint  ---  Alternate route: &#x60;/v1/ui/autopilot/waypoint/&#x60; 
     * @param addToBeginning Whether this solar system should be added to the beginning of all waypoints (required)
     * @param clearOtherWaypoints Whether clean other waypoints beforing adding this one (required)
     * @param solarSystemId The solar system to set as autopilot waypoint (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUiAutopilotWaypointAsync(Boolean addToBeginning, Boolean clearOtherWaypoints, Integer solarSystemId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUiAutopilotWaypointCall(addToBeginning, clearOtherWaypoints, solarSystemId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for postUiOpenwindowContract */
    private com.squareup.okhttp.Call postUiOpenwindowContractCall(Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new ApiException("Missing the required parameter 'contractId' when calling postUiOpenwindowContract(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ui/openwindow/contract/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (contractId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "contract_id", contractId));
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
     * Open Contract Window
     * Open the contract window inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/contract/&#x60; 
     * @param contractId The contract to open (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUiOpenwindowContract(Integer contractId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        postUiOpenwindowContractWithHttpInfo(contractId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Open Contract Window
     * Open the contract window inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/contract/&#x60; 
     * @param contractId The contract to open (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowContractWithHttpInfo(Integer contractId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowContractCall(contractId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Open Contract Window (asynchronously)
     * Open the contract window inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/contract/&#x60; 
     * @param contractId The contract to open (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowContractAsync(Integer contractId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUiOpenwindowContractCall(contractId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for postUiOpenwindowInformation */
    private com.squareup.okhttp.Call postUiOpenwindowInformationCall(Integer targetId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new ApiException("Missing the required parameter 'targetId' when calling postUiOpenwindowInformation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ui/openwindow/information/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (targetId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "target_id", targetId));
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
     * Open Information Window
     * Open the information window for a character, corporation or alliance inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/information/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/information/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/information/&#x60; 
     * @param targetId The target to open (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUiOpenwindowInformation(Integer targetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        postUiOpenwindowInformationWithHttpInfo(targetId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Open Information Window
     * Open the information window for a character, corporation or alliance inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/information/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/information/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/information/&#x60; 
     * @param targetId The target to open (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowInformationWithHttpInfo(Integer targetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowInformationCall(targetId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Open Information Window (asynchronously)
     * Open the information window for a character, corporation or alliance inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/information/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/information/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/information/&#x60; 
     * @param targetId The target to open (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowInformationAsync(Integer targetId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUiOpenwindowInformationCall(targetId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for postUiOpenwindowMarketdetails */
    private com.squareup.okhttp.Call postUiOpenwindowMarketdetailsCall(Integer typeId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException("Missing the required parameter 'typeId' when calling postUiOpenwindowMarketdetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ui/openwindow/marketdetails/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
        if (typeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type_id", typeId));
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
     * Open Market Details
     * Open the market details window for a specific typeID inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/marketdetails/&#x60; 
     * @param typeId The item type to open in market window (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUiOpenwindowMarketdetails(Integer typeId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        postUiOpenwindowMarketdetailsWithHttpInfo(typeId, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Open Market Details
     * Open the market details window for a specific typeID inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/marketdetails/&#x60; 
     * @param typeId The item type to open in market window (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowMarketdetailsWithHttpInfo(Integer typeId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowMarketdetailsCall(typeId, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Open Market Details (asynchronously)
     * Open the market details window for a specific typeID inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/marketdetails/&#x60; 
     * @param typeId The item type to open in market window (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowMarketdetailsAsync(Integer typeId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUiOpenwindowMarketdetailsCall(typeId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for postUiOpenwindowNewmail */
    private com.squareup.okhttp.Call postUiOpenwindowNewmailCall(PostUiOpenwindowNewmailNewMail newMail, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = newMail;
        
        // verify the required parameter 'newMail' is set
        if (newMail == null) {
            throw new ApiException("Missing the required parameter 'newMail' when calling postUiOpenwindowNewmail(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/ui/openwindow/newmail/".replaceAll("\\{format\\}","json");

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
     * Open New Mail Window
     * Open the New Mail window, according to settings from the request if applicable  ---  Alternate route: &#x60;/v1/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/newmail/&#x60; 
     * @param newMail The details of mail to create (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postUiOpenwindowNewmail(PostUiOpenwindowNewmailNewMail newMail, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        postUiOpenwindowNewmailWithHttpInfo(newMail, datasource, token, userAgent, xUserAgent);
    }

    /**
     * Open New Mail Window
     * Open the New Mail window, according to settings from the request if applicable  ---  Alternate route: &#x60;/v1/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/newmail/&#x60; 
     * @param newMail The details of mail to create (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postUiOpenwindowNewmailWithHttpInfo(PostUiOpenwindowNewmailNewMail newMail, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = postUiOpenwindowNewmailCall(newMail, datasource, token, userAgent, xUserAgent, null, null);
        return apiClient.execute(call);
    }

    /**
     * Open New Mail Window (asynchronously)
     * Open the New Mail window, according to settings from the request if applicable  ---  Alternate route: &#x60;/v1/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/latest/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/newmail/&#x60; 
     * @param newMail The details of mail to create (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postUiOpenwindowNewmailAsync(PostUiOpenwindowNewmailNewMail newMail, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postUiOpenwindowNewmailCall(newMail, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
