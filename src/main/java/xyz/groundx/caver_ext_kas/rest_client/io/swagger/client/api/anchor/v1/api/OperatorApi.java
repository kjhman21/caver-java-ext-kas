/*
 * Anchor API
 * # Introduction 이 문서는 KAS\\(Klaytn API Service\\)의 Anchor API를 소개하는 문서입니다. Anchor API는 서비스 체인 데이터의 신뢰성을 보장하기 위해 데이터 신뢰성을 증명할 수 있는 메타데이터를 Klaytn 메인 체인에 전송하는 기능을 제공합니다.  자세한 사용 예시는 [튜토리얼](링크)를 확인하십시오.    # Error Codes  ## 400: Bad Request   | Code | Messages |   | --- | --- |   | 1071010 | data don't exist 1072100 | same payload ID or payload was already anchored 1072101 | all configured accounts have insufficient funds |  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.v1.api;

import com.google.gson.reflect.TypeToken;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.v1.model.Operator;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.v1.model.Operators;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperatorApi {
    private ApiClient apiClient;

    public OperatorApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OperatorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOperator
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param operatorId 오퍼레이터 계정 주소 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOperatorCall(String xChainId, String operatorId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/operator/{operator-id}"
            .replaceAll("\\{" + "operator-id" + "\\}", apiClient.escapeString(operatorId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOperatorValidateBeforeCall(String xChainId, String operatorId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getOperator(Async)");
        }
        // verify the required parameter 'operatorId' is set
        if (operatorId == null) {
            throw new ApiException("Missing the required parameter 'operatorId' when calling getOperator(Async)");
        }
        
        com.squareup.okhttp.Call call = getOperatorCall(xChainId, operatorId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 특정 오퍼레이터 조회
     * 해당 오퍼레이터 설정 및 오퍼레이터 계정 잔액을 조회합니다.
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param operatorId 오퍼레이터 계정 주소 (required)
     * @return Operator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Operator getOperator(String xChainId, String operatorId) throws ApiException {
        ApiResponse<Operator> resp = getOperatorWithHttpInfo(xChainId, operatorId);
        return resp.getData();
    }

    /**
     * 특정 오퍼레이터 조회
     * 해당 오퍼레이터 설정 및 오퍼레이터 계정 잔액을 조회합니다.
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param operatorId 오퍼레이터 계정 주소 (required)
     * @return ApiResponse&lt;Operator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Operator> getOperatorWithHttpInfo(String xChainId, String operatorId) throws ApiException {
        com.squareup.okhttp.Call call = getOperatorValidateBeforeCall(xChainId, operatorId, null, null);
        Type localVarReturnType = new TypeToken<Operator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 특정 오퍼레이터 조회 (asynchronously)
     * 해당 오퍼레이터 설정 및 오퍼레이터 계정 잔액을 조회합니다.
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param operatorId 오퍼레이터 계정 주소 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOperatorAsync(String xChainId, String operatorId, final ApiCallback<Operator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOperatorValidateBeforeCall(xChainId, operatorId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Operator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveOperators
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param size 검색할 계정의 최대 사이즈 (optional, default to 100)
     * @param cursor 마지막으로 검색된 커서의 정보 (optional)
     * @param fromTimestamp 검색하고자 하는 처음 시간의 타임스탬프 (초단위) (optional)
     * @param toTimestamp 검색하고자 하는 마지막 시간의 타임스탬프 (초단위) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveOperatorsCall(String xChainId, Long size, String cursor, Long fromTimestamp, Long toTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/operator";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (fromTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from-timestamp", fromTimestamp));
        if (toTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to-timestamp", toTimestamp));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveOperatorsValidateBeforeCall(String xChainId, Long size, String cursor, Long fromTimestamp, Long toTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling retrieveOperators(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveOperatorsCall(xChainId, size, cursor, fromTimestamp, toTimestamp, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 모든 오퍼레이터 목록 조회
     * 이미 생성된 오퍼레이터 목록 및 각 오퍼레이터 설정값을 조회합니다.
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param size 검색할 계정의 최대 사이즈 (optional, default to 100)
     * @param cursor 마지막으로 검색된 커서의 정보 (optional)
     * @param fromTimestamp 검색하고자 하는 처음 시간의 타임스탬프 (초단위) (optional)
     * @param toTimestamp 검색하고자 하는 마지막 시간의 타임스탬프 (초단위) (optional)
     * @return Operators
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Operators retrieveOperators(String xChainId, Long size, String cursor, Long fromTimestamp, Long toTimestamp) throws ApiException {
        ApiResponse<Operators> resp = retrieveOperatorsWithHttpInfo(xChainId, size, cursor, fromTimestamp, toTimestamp);
        return resp.getData();
    }

    /**
     * 모든 오퍼레이터 목록 조회
     * 이미 생성된 오퍼레이터 목록 및 각 오퍼레이터 설정값을 조회합니다.
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param size 검색할 계정의 최대 사이즈 (optional, default to 100)
     * @param cursor 마지막으로 검색된 커서의 정보 (optional)
     * @param fromTimestamp 검색하고자 하는 처음 시간의 타임스탬프 (초단위) (optional)
     * @param toTimestamp 검색하고자 하는 마지막 시간의 타임스탬프 (초단위) (optional)
     * @return ApiResponse&lt;Operators&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Operators> retrieveOperatorsWithHttpInfo(String xChainId, Long size, String cursor, Long fromTimestamp, Long toTimestamp) throws ApiException {
        com.squareup.okhttp.Call call = retrieveOperatorsValidateBeforeCall(xChainId, size, cursor, fromTimestamp, toTimestamp, null, null);
        Type localVarReturnType = new TypeToken<Operators>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 모든 오퍼레이터 목록 조회 (asynchronously)
     * 이미 생성된 오퍼레이터 목록 및 각 오퍼레이터 설정값을 조회합니다.
     * @param xChainId Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param size 검색할 계정의 최대 사이즈 (optional, default to 100)
     * @param cursor 마지막으로 검색된 커서의 정보 (optional)
     * @param fromTimestamp 검색하고자 하는 처음 시간의 타임스탬프 (초단위) (optional)
     * @param toTimestamp 검색하고자 하는 마지막 시간의 타임스탬프 (초단위) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveOperatorsAsync(String xChainId, Long size, String cursor, Long fromTimestamp, Long toTimestamp, final ApiCallback<Operators> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveOperatorsValidateBeforeCall(xChainId, size, cursor, fromTimestamp, toTimestamp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Operators>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
