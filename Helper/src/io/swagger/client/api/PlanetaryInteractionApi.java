

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

import io.swagger.client.model.GetCharactersCharacterIdPlanets200Ok;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsForbidden;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdForbidden;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdInternalServerError;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdNotFound;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdOk;
import io.swagger.client.model.GetUniverseSchematicsSchematicIdInternalServerError;
import io.swagger.client.model.GetUniverseSchematicsSchematicIdNotFound;
import io.swagger.client.model.GetUniverseSchematicsSchematicIdOk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanetaryInteractionApi {
    private ApiClient apiClient;

    public PlanetaryInteractionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlanetaryInteractionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCharactersCharacterIdPlanets */
    private com.squareup.okhttp.Call getCharactersCharacterIdPlanetsCall(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdPlanets(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/planets/".replaceAll("\\{format\\}","json")
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
     * Get colonies
     * Returns a list of all planetary colonies owned by a character.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60;   ---  This route is cached for up to 600 seconds
     * @param characterId Character id of the target character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;GetCharactersCharacterIdPlanets200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdPlanets200Ok> getCharactersCharacterIdPlanets(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdPlanets200Ok>> resp = getCharactersCharacterIdPlanetsWithHttpInfo(characterId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get colonies
     * Returns a list of all planetary colonies owned by a character.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60;   ---  This route is cached for up to 600 seconds
     * @param characterId Character id of the target character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdPlanets200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdPlanets200Ok>> getCharactersCharacterIdPlanetsWithHttpInfo(Integer characterId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsCall(characterId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdPlanets200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get colonies (asynchronously)
     * Returns a list of all planetary colonies owned by a character.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/latest/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60;   ---  This route is cached for up to 600 seconds
     * @param characterId Character id of the target character (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdPlanetsAsync(Integer characterId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<List<GetCharactersCharacterIdPlanets200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsCall(characterId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdPlanets200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCharactersCharacterIdPlanetsPlanetId */
    private com.squareup.okhttp.Call getCharactersCharacterIdPlanetsPlanetIdCall(Integer characterId, Integer planetId, String datasource, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdPlanetsPlanetId(Async)");
        }
        
        // verify the required parameter 'planetId' is set
        if (planetId == null) {
            throw new ApiException("Missing the required parameter 'planetId' when calling getCharactersCharacterIdPlanetsPlanetId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/characters/{character_id}/planets/{planet_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
        .replaceAll("\\{" + "planet_id" + "\\}", apiClient.escapeString(planetId.toString()));

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
     * Get colony layout
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information on this endpoint will not update until this criteria is met.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/{planet_id}/&#x60;   ---  This route is cached for up to 600 seconds
     * @param characterId Character id of the target character (required)
     * @param planetId Planet id of the target planet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdPlanetsPlanetIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdPlanetsPlanetIdOk getCharactersCharacterIdPlanetsPlanetId(Integer characterId, Integer planetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdPlanetsPlanetIdOk> resp = getCharactersCharacterIdPlanetsPlanetIdWithHttpInfo(characterId, planetId, datasource, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get colony layout
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information on this endpoint will not update until this criteria is met.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/{planet_id}/&#x60;   ---  This route is cached for up to 600 seconds
     * @param characterId Character id of the target character (required)
     * @param planetId Planet id of the target planet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdPlanetsPlanetIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdPlanetsPlanetIdOk> getCharactersCharacterIdPlanetsPlanetIdWithHttpInfo(Integer characterId, Integer planetId, String datasource, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsPlanetIdCall(characterId, planetId, datasource, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdPlanetsPlanetIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get colony layout (asynchronously)
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information on this endpoint will not update until this criteria is met.  ---  Alternate route: &#x60;/v1/characters/{character_id}/planets/{planet_id}/&#x60;   ---  This route is cached for up to 600 seconds
     * @param characterId Character id of the target character (required)
     * @param planetId Planet id of the target planet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param token Access token to use, if preferred over a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdPlanetsPlanetIdAsync(Integer characterId, Integer planetId, String datasource, String token, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdPlanetsPlanetIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsPlanetIdCall(characterId, planetId, datasource, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdPlanetsPlanetIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUniverseSchematicsSchematicId */
    private com.squareup.okhttp.Call getUniverseSchematicsSchematicIdCall(Integer schematicId, String datasource, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'schematicId' is set
        if (schematicId == null) {
            throw new ApiException("Missing the required parameter 'schematicId' when calling getUniverseSchematicsSchematicId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/universe/schematics/{schematic_id}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "schematic_id" + "\\}", apiClient.escapeString(schematicId.toString()));

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
     * Get schematic information
     * Get information on a planetary factory schematic  ---  Alternate route: &#x60;/v1/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/latest/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/dev/universe/schematics/{schematic_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param schematicId A PI schematic ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetUniverseSchematicsSchematicIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicId(Integer schematicId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetUniverseSchematicsSchematicIdOk> resp = getUniverseSchematicsSchematicIdWithHttpInfo(schematicId, datasource, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get schematic information
     * Get information on a planetary factory schematic  ---  Alternate route: &#x60;/v1/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/latest/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/dev/universe/schematics/{schematic_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param schematicId A PI schematic ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetUniverseSchematicsSchematicIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseSchematicsSchematicIdOk> getUniverseSchematicsSchematicIdWithHttpInfo(Integer schematicId, String datasource, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseSchematicsSchematicIdCall(schematicId, datasource, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseSchematicsSchematicIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get schematic information (asynchronously)
     * Get information on a planetary factory schematic  ---  Alternate route: &#x60;/v1/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/latest/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/dev/universe/schematics/{schematic_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     * @param schematicId A PI schematic ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseSchematicsSchematicIdAsync(Integer schematicId, String datasource, String userAgent, String xUserAgent, final ApiCallback<GetUniverseSchematicsSchematicIdOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUniverseSchematicsSchematicIdCall(schematicId, datasource, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseSchematicsSchematicIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
