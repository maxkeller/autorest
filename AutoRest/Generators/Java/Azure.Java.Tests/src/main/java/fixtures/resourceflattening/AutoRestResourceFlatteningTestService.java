/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.resourceflattening;

import com.microsoft.rest.AzureClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.logging.HttpLoggingInterceptor.Level;
import com.squareup.okhttp.ResponseBody;
import fixtures.resourceflattening.models.ErrorException;
import fixtures.resourceflattening.models.FlattenedProduct;
import fixtures.resourceflattening.models.Resource;
import fixtures.resourceflattening.models.ResourceCollection;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.PUT;

/**
 * The interface for AutoRestResourceFlatteningTestService class.
 */
public interface AutoRestResourceFlatteningTestService {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Sets the logging level for OkHttp client.
     *
     * @param logLevel the logging level enum.
     */
    void setLogLevel(Level logLevel);

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets The management credentials for Azure..
     *
     * @return the credentials value.
     */
    ServiceClientCredentials getCredentials();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    void setAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout for Long Running Operations..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout for Long Running Operations..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * The interface defining all the services for AutoRestResourceFlatteningTestService to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestResourceFlatteningTestServiceService {
        @PUT("/azure/resource-flatten/array")
        Call<ResponseBody> putArray(@Body List<Resource> resourceArray, @Header("accept-language") String acceptLanguage);

        @GET("/azure/resource-flatten/array")
        Call<ResponseBody> getArray(@Header("accept-language") String acceptLanguage);

        @PUT("/azure/resource-flatten/dictionary")
        Call<ResponseBody> putDictionary(@Body Map<String, FlattenedProduct> resourceDictionary, @Header("accept-language") String acceptLanguage);

        @GET("/azure/resource-flatten/dictionary")
        Call<ResponseBody> getDictionary(@Header("accept-language") String acceptLanguage);

        @PUT("/azure/resource-flatten/resourcecollection")
        Call<ResponseBody> putResourceCollection(@Body ResourceCollection resourceComplexObject, @Header("accept-language") String acceptLanguage);

        @GET("/azure/resource-flatten/resourcecollection")
        Call<ResponseBody> getResourceCollection(@Header("accept-language") String acceptLanguage);

    }

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> putArray(List<Resource> resourceArray) throws ErrorException, IOException;

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putArrayAsync(List<Resource> resourceArray, final ServiceCallback<Void> serviceCallback);

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the List&lt;FlattenedProduct&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<FlattenedProduct>> getArray() throws ErrorException, IOException;

    /**
     * Get External Resource as an Array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getArrayAsync(final ServiceCallback<List<FlattenedProduct>> serviceCallback);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> putDictionary(Map<String, FlattenedProduct> resourceDictionary) throws ErrorException, IOException;

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary, final ServiceCallback<Void> serviceCallback);

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Map&lt;String, FlattenedProduct&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Map<String, FlattenedProduct>> getDictionary() throws ErrorException, IOException;

    /**
     * Get External Resource as a Dictionary.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getDictionaryAsync(final ServiceCallback<Map<String, FlattenedProduct>> serviceCallback);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> putResourceCollection(ResourceCollection resourceComplexObject) throws ErrorException, IOException;

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putResourceCollectionAsync(ResourceCollection resourceComplexObject, final ServiceCallback<Void> serviceCallback);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the ResourceCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ResourceCollection> getResourceCollection() throws ErrorException, IOException;

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getResourceCollectionAsync(final ServiceCallback<ResourceCollection> serviceCallback);

}
