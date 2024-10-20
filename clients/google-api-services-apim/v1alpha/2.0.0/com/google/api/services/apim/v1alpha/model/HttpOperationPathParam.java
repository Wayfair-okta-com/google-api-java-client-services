/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.apim.v1alpha.model;

/**
 * HTTP Path parameter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Management API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpOperationPathParam extends com.google.api.client.json.GenericJson {

  /**
   * Data type of path param
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataType;

  /**
   * Segment location in the path, 1-indexed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer position;

  /**
   * Data type of path param
   * @return value or {@code null} for none
   */
  public java.lang.String getDataType() {
    return dataType;
  }

  /**
   * Data type of path param
   * @param dataType dataType or {@code null} for none
   */
  public HttpOperationPathParam setDataType(java.lang.String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Segment location in the path, 1-indexed
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPosition() {
    return position;
  }

  /**
   * Segment location in the path, 1-indexed
   * @param position position or {@code null} for none
   */
  public HttpOperationPathParam setPosition(java.lang.Integer position) {
    this.position = position;
    return this;
  }

  @Override
  public HttpOperationPathParam set(String fieldName, Object value) {
    return (HttpOperationPathParam) super.set(fieldName, value);
  }

  @Override
  public HttpOperationPathParam clone() {
    return (HttpOperationPathParam) super.clone();
  }

}
