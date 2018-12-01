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

package com.google.api.services.cloudfunctions.v1beta2.model;

/**
 * Metadata describing an Operation
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Functions API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationMetadataV1Beta2 extends com.google.api.client.json.GenericJson {

  /**
   * The original request that started the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> request;

  /**
   * Target of the operation - for example
   * projects/project-1/locations/region-1/functions/function-1
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Type of operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The last update timestamp of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Version id of the function created or updated by an API call. This field is only populated for
   * Create and Update operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long versionId;

  /**
   * The original request that started the operation.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getRequest() {
    return request;
  }

  /**
   * The original request that started the operation.
   * @param request request or {@code null} for none
   */
  public OperationMetadataV1Beta2 setRequest(java.util.Map<String, java.lang.Object> request) {
    this.request = request;
    return this;
  }

  /**
   * Target of the operation - for example
   * projects/project-1/locations/region-1/functions/function-1
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Target of the operation - for example
   * projects/project-1/locations/region-1/functions/function-1
   * @param target target or {@code null} for none
   */
  public OperationMetadataV1Beta2 setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * Type of operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of operation.
   * @param type type or {@code null} for none
   */
  public OperationMetadataV1Beta2 setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The last update timestamp of the operation.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last update timestamp of the operation.
   * @param updateTime updateTime or {@code null} for none
   */
  public OperationMetadataV1Beta2 setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Version id of the function created or updated by an API call. This field is only populated for
   * Create and Update operations.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersionId() {
    return versionId;
  }

  /**
   * Version id of the function created or updated by an API call. This field is only populated for
   * Create and Update operations.
   * @param versionId versionId or {@code null} for none
   */
  public OperationMetadataV1Beta2 setVersionId(java.lang.Long versionId) {
    this.versionId = versionId;
    return this;
  }

  @Override
  public OperationMetadataV1Beta2 set(String fieldName, Object value) {
    return (OperationMetadataV1Beta2) super.set(fieldName, value);
  }

  @Override
  public OperationMetadataV1Beta2 clone() {
    return (OperationMetadataV1Beta2) super.clone();
  }

}
