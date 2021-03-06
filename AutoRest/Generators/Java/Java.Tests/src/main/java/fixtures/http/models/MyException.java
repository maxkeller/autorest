/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.models;

import com.microsoft.rest.AutoRestException;
import retrofit.Response;

/**
 * Exception thrown for an invalid response with A information.
 */
public class MyException extends AutoRestException {
    /**
     * Information about the associated HTTP response.
     */
    private Response response;
    /**
     * The actual response body.
     */
    private A body;
    /**
     * Initializes a new instance of the MyException class.
     */
    public MyException() { }
    /**
     * Initializes a new instance of the MyException class.
     *
     * @param message The exception message.
     */
    public MyException(final String message) {
        super(message);
    }
    /**
     * Initializes a new instance of the MyException class.
     *
     * @param message the exception message
     * @param cause   exception that caused this exception to occur
     */
    public MyException(final String message, final Throwable cause) {
        super(message, cause);
    }
    /**
     * Initializes a new instance of the MyException class.
     *
     * @param cause exception that caused this exception to occur
     */
    public MyException(final Throwable cause) {
        super(cause);
    }
    /**
     * Gets information about the associated HTTP response.
     *
     * @return the HTTP response
     */
    public Response getResponse() {
        return response;
    }
    /**
     * Gets the HTTP response body.
     *
     * @return the response body
     */
    public A getBody() {
        return body;
    }
    /**
     * Sets the HTTP response.
     *
     * @param response the HTTP response
     */
    public void setResponse(Response response) {
        this.response = response;
    }
    /**
     * Sets the HTTP response body.
     *
     * @param body the response body
     */
    public void setBody(A body) {
        this.body = body;
    }
}
