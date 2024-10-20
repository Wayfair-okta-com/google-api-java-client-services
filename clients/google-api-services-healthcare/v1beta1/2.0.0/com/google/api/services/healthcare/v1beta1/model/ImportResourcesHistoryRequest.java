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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Request to import the history of resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportResourcesHistoryRequest extends com.google.api.client.json.GenericJson {

  /**
   * The content structure in the source location. If not specified, the server treats the input
   * source files as BUNDLE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentStructure;

  /**
   * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectAdmin` Cloud IAM roles on the Cloud Storage location. The
   * Healthcare Service Agent Each Cloud Storage object should be a text file that contains the
   * format specified in ContentStructure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudHealthcareV1beta1FhirGcsSource gcsSource;

  /**
   * The maximum number of errors before the server cancels the operation. If not specified or set
   * to 0, defaults to 100. -1 means no maximum, the server tries to process all input. Since the
   * server executes the operation in parallel, it might not stop the operation after exactly this
   * number of errors occur.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxErrorCount;

  /**
   * The content structure in the source location. If not specified, the server treats the input
   * source files as BUNDLE.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentStructure() {
    return contentStructure;
  }

  /**
   * The content structure in the source location. If not specified, the server treats the input
   * source files as BUNDLE.
   * @param contentStructure contentStructure or {@code null} for none
   */
  public ImportResourcesHistoryRequest setContentStructure(java.lang.String contentStructure) {
    this.contentStructure = contentStructure;
    return this;
  }

  /**
   * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectAdmin` Cloud IAM roles on the Cloud Storage location. The
   * Healthcare Service Agent Each Cloud Storage object should be a text file that contains the
   * format specified in ContentStructure.
   * @return value or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1FhirGcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent
   * requires the `roles/storage.objectAdmin` Cloud IAM roles on the Cloud Storage location. The
   * Healthcare Service Agent Each Cloud Storage object should be a text file that contains the
   * format specified in ContentStructure.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public ImportResourcesHistoryRequest setGcsSource(GoogleCloudHealthcareV1beta1FhirGcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  /**
   * The maximum number of errors before the server cancels the operation. If not specified or set
   * to 0, defaults to 100. -1 means no maximum, the server tries to process all input. Since the
   * server executes the operation in parallel, it might not stop the operation after exactly this
   * number of errors occur.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxErrorCount() {
    return maxErrorCount;
  }

  /**
   * The maximum number of errors before the server cancels the operation. If not specified or set
   * to 0, defaults to 100. -1 means no maximum, the server tries to process all input. Since the
   * server executes the operation in parallel, it might not stop the operation after exactly this
   * number of errors occur.
   * @param maxErrorCount maxErrorCount or {@code null} for none
   */
  public ImportResourcesHistoryRequest setMaxErrorCount(java.lang.Long maxErrorCount) {
    this.maxErrorCount = maxErrorCount;
    return this;
  }

  @Override
  public ImportResourcesHistoryRequest set(String fieldName, Object value) {
    return (ImportResourcesHistoryRequest) super.set(fieldName, value);
  }

  @Override
  public ImportResourcesHistoryRequest clone() {
    return (ImportResourcesHistoryRequest) super.clone();
  }

}
