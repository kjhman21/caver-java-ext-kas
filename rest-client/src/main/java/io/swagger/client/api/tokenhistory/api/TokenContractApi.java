/*
 * th-0.7.0-v2-public
 * # Introduction  Token History API는 KLAY, FT (KIP-7, Labeled ERC-20), NFT (KIP-17, Labeled ERC-721) 토큰 정보, 이들 토큰을 주고받은 기록을 조회하는 기능을 제공합니다. 여러분은 특정 EOA가 KLAY를 주고받은 기록을 확인하거나 EOA가 가지고 있는 NFT 정보를 불러오는 등 Token History API를 다양하게 활용할 수 있습니다.   Token History API 사용에 관한 자세한 내용은 [튜토리얼](https://klaytn.com)을 확인하십시오.   이 문서 혹은 KAS에 관한 문의는 [개발자 포럼](https://forum.klaytn.com/)을 방문해 도움을 받으십시오  
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api.tokenhistory.api;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.api.tokenhistory.model.FtContractDetail;
import io.swagger.client.api.tokenhistory.model.NftContractDetail;
import io.swagger.client.api.tokenhistory.model.PageableFtContractDetails;
import io.swagger.client.api.tokenhistory.model.PageableNftContractDetails;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenContractApi {
    private ApiClient apiClient;

    public TokenContractApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenContractApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getFtContractDetail
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param ftAddress FT 컨트랙트 주소  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFtContractDetailCall(String xChainId, String ftAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/contract/ft/{ft-address}"
            .replaceAll("\\{" + "ft-address" + "\\}", apiClient.escapeString(ftAddress.toString()));

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
    private com.squareup.okhttp.Call getFtContractDetailValidateBeforeCall(String xChainId, String ftAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getFtContractDetail(Async)");
        }
        // verify the required parameter 'ftAddress' is set
        if (ftAddress == null) {
            throw new ApiException("Missing the required parameter 'ftAddress' when calling getFtContractDetail(Async)");
        }
        
        com.squareup.okhttp.Call call = getFtContractDetailCall(xChainId, ftAddress, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 특정 FT 컨트랙트 정보 조회
     * 라벨링된 FT 컨트랙트 1개의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param ftAddress FT 컨트랙트 주소  (required)
     * @return FtContractDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FtContractDetail getFtContractDetail(String xChainId, String ftAddress) throws ApiException {
        ApiResponse<FtContractDetail> resp = getFtContractDetailWithHttpInfo(xChainId, ftAddress);
        return resp.getData();
    }

    /**
     * 특정 FT 컨트랙트 정보 조회
     * 라벨링된 FT 컨트랙트 1개의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param ftAddress FT 컨트랙트 주소  (required)
     * @return ApiResponse&lt;FtContractDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FtContractDetail> getFtContractDetailWithHttpInfo(String xChainId, String ftAddress) throws ApiException {
        com.squareup.okhttp.Call call = getFtContractDetailValidateBeforeCall(xChainId, ftAddress, null, null);
        Type localVarReturnType = new TypeToken<FtContractDetail>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 특정 FT 컨트랙트 정보 조회 (asynchronously)
     * 라벨링된 FT 컨트랙트 1개의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 네트워크 체인 ID (1001 or 8217) (required)
     * @param ftAddress FT 컨트랙트 주소  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFtContractDetailAsync(String xChainId, String ftAddress, final ApiCallback<FtContractDetail> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFtContractDetailValidateBeforeCall(xChainId, ftAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FtContractDetail>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getListOfNftContracts
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 [kip, erc] (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 응답 오프셋 (pagination)  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getListOfNftContractsCall(String xChainId, String status, String type, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/contract/nft";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));

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
    private com.squareup.okhttp.Call getListOfNftContractsValidateBeforeCall(String xChainId, String status, String type, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getListOfNftContracts(Async)");
        }
        
        com.squareup.okhttp.Call call = getListOfNftContractsCall(xChainId, status, type, size, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 모든 NFT 컨트랙트 정보 목록 조회
     * 라벨링된 모든 NFT 컨트랙트들의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 [kip, erc] (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 응답 오프셋 (pagination)  (optional)
     * @return PageableNftContractDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageableNftContractDetails getListOfNftContracts(String xChainId, String status, String type, Long size, String cursor) throws ApiException {
        ApiResponse<PageableNftContractDetails> resp = getListOfNftContractsWithHttpInfo(xChainId, status, type, size, cursor);
        return resp.getData();
    }

    /**
     * 모든 NFT 컨트랙트 정보 목록 조회
     * 라벨링된 모든 NFT 컨트랙트들의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 [kip, erc] (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 응답 오프셋 (pagination)  (optional)
     * @return ApiResponse&lt;PageableNftContractDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageableNftContractDetails> getListOfNftContractsWithHttpInfo(String xChainId, String status, String type, Long size, String cursor) throws ApiException {
        com.squareup.okhttp.Call call = getListOfNftContractsValidateBeforeCall(xChainId, status, type, size, cursor, null, null);
        Type localVarReturnType = new TypeToken<PageableNftContractDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 모든 NFT 컨트랙트 정보 목록 조회 (asynchronously)
     * 라벨링된 모든 NFT 컨트랙트들의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 [kip, erc] (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 응답 오프셋 (pagination)  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListOfNftContractsAsync(String xChainId, String status, String type, Long size, String cursor, final ApiCallback<PageableNftContractDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getListOfNftContractsValidateBeforeCall(xChainId, status, type, size, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageableNftContractDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getListofFtContracts
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 (&#x27;kip&#x27; for KIPs, &#x27;erc&#x27; for ERCs, none for both) (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getListofFtContractsCall(String xChainId, String status, String type, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/contract/ft";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));

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
    private com.squareup.okhttp.Call getListofFtContractsValidateBeforeCall(String xChainId, String status, String type, Long size, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getListofFtContracts(Async)");
        }
        
        com.squareup.okhttp.Call call = getListofFtContractsCall(xChainId, status, type, size, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 모든 FT 컨트랙트 정보 목록 조회
     * 라벨링된 모든 FT 컨트랙트들의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 (&#x27;kip&#x27; for KIPs, &#x27;erc&#x27; for ERCs, none for both) (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @return PageableFtContractDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageableFtContractDetails getListofFtContracts(String xChainId, String status, String type, Long size, String cursor) throws ApiException {
        ApiResponse<PageableFtContractDetails> resp = getListofFtContractsWithHttpInfo(xChainId, status, type, size, cursor);
        return resp.getData();
    }

    /**
     * 모든 FT 컨트랙트 정보 목록 조회
     * 라벨링된 모든 FT 컨트랙트들의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 (&#x27;kip&#x27; for KIPs, &#x27;erc&#x27; for ERCs, none for both) (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @return ApiResponse&lt;PageableFtContractDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageableFtContractDetails> getListofFtContractsWithHttpInfo(String xChainId, String status, String type, Long size, String cursor) throws ApiException {
        com.squareup.okhttp.Call call = getListofFtContractsValidateBeforeCall(xChainId, status, type, size, cursor, null, null);
        Type localVarReturnType = new TypeToken<PageableFtContractDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 모든 FT 컨트랙트 정보 목록 조회 (asynchronously)
     * 라벨링된 모든 FT 컨트랙트들의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param status 라벨링 상태 [completed, processing, failed, cancelled] (optional)
     * @param type 컨트랙트 타입 (&#x27;kip&#x27; for KIPs, &#x27;erc&#x27; for ERCs, none for both) (optional)
     * @param size 응답 아이템 개수(min&#x3D;1, max&#x3D;1000, default&#x3D;100) (optional)
     * @param cursor 특정 위치를 지정하기 위한 오프셋 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListofFtContractsAsync(String xChainId, String status, String type, Long size, String cursor, final ApiCallback<PageableFtContractDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getListofFtContractsValidateBeforeCall(xChainId, status, type, size, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageableFtContractDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNftContractDetail
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress NFT 컨트랙트 주소 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNftContractDetailCall(String xChainId, String nftAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/contract/nft/{nft-address}"
            .replaceAll("\\{" + "nft-address" + "\\}", apiClient.escapeString(nftAddress.toString()));

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
    private com.squareup.okhttp.Call getNftContractDetailValidateBeforeCall(String xChainId, String nftAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getNftContractDetail(Async)");
        }
        // verify the required parameter 'nftAddress' is set
        if (nftAddress == null) {
            throw new ApiException("Missing the required parameter 'nftAddress' when calling getNftContractDetail(Async)");
        }
        
        com.squareup.okhttp.Call call = getNftContractDetailCall(xChainId, nftAddress, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 특정 NFT 컨트랙트 정보 조회
     * 라벨링된 NFT 컨트랙트 1개의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress NFT 컨트랙트 주소 (required)
     * @return NftContractDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NftContractDetail getNftContractDetail(String xChainId, String nftAddress) throws ApiException {
        ApiResponse<NftContractDetail> resp = getNftContractDetailWithHttpInfo(xChainId, nftAddress);
        return resp.getData();
    }

    /**
     * 특정 NFT 컨트랙트 정보 조회
     * 라벨링된 NFT 컨트랙트 1개의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress NFT 컨트랙트 주소 (required)
     * @return ApiResponse&lt;NftContractDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NftContractDetail> getNftContractDetailWithHttpInfo(String xChainId, String nftAddress) throws ApiException {
        com.squareup.okhttp.Call call = getNftContractDetailValidateBeforeCall(xChainId, nftAddress, null, null);
        Type localVarReturnType = new TypeToken<NftContractDetail>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 특정 NFT 컨트랙트 정보 조회 (asynchronously)
     * 라벨링된 NFT 컨트랙트 1개의 정보를 불러옵니다. 
     * @param xChainId  Klaytn 체인 네트워크 ID (1001 or 8217) (required)
     * @param nftAddress NFT 컨트랙트 주소 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNftContractDetailAsync(String xChainId, String nftAddress, final ApiCallback<NftContractDetail> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNftContractDetailValidateBeforeCall(xChainId, nftAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NftContractDetail>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
