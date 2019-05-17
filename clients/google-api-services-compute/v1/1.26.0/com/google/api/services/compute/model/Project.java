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

package com.google.api.services.compute.model;

/**
 * A Project resource. For an overview of projects, see  Cloud Platform Resource Hierarchy. (==
 * resource_for v1.projects ==) (== resource_for beta.projects ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Project extends com.google.api.client.json.GenericJson {

  /**
   * Metadata key/value pairs available to all instances contained in this project. See Custom
   * metadata for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Metadata commonInstanceMetadata;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * This signifies the default network tier used for configuring resources of the project and can
   * only take the following values: PREMIUM, STANDARD. Initially the default network tier is
   * PREMIUM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultNetworkTier;

  /**
   * [Output Only] Default service account used by VMs running in this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultServiceAccount;

  /**
   * An optional textual description of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Restricted features enabled for use on this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enabledFeatures;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * This is not the project ID, and is just a unique ID used by Compute Engine to identify
   * resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#project for projects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute
   * Engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] Quotas assigned to this project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Quota> quotas;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are
   * stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UsageExportLocation usageExportLocation;

  /**
   * [Output Only] The role this project has in a shared VPC configuration. Currently only HOST
   * projects are differentiated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String xpnProjectStatus;

  /**
   * Metadata key/value pairs available to all instances contained in this project. See Custom
   * metadata for more information.
   * @return value or {@code null} for none
   */
  public Metadata getCommonInstanceMetadata() {
    return commonInstanceMetadata;
  }

  /**
   * Metadata key/value pairs available to all instances contained in this project. See Custom
   * metadata for more information.
   * @param commonInstanceMetadata commonInstanceMetadata or {@code null} for none
   */
  public Project setCommonInstanceMetadata(Metadata commonInstanceMetadata) {
    this.commonInstanceMetadata = commonInstanceMetadata;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Project setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * This signifies the default network tier used for configuring resources of the project and can
   * only take the following values: PREMIUM, STANDARD. Initially the default network tier is
   * PREMIUM.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultNetworkTier() {
    return defaultNetworkTier;
  }

  /**
   * This signifies the default network tier used for configuring resources of the project and can
   * only take the following values: PREMIUM, STANDARD. Initially the default network tier is
   * PREMIUM.
   * @param defaultNetworkTier defaultNetworkTier or {@code null} for none
   */
  public Project setDefaultNetworkTier(java.lang.String defaultNetworkTier) {
    this.defaultNetworkTier = defaultNetworkTier;
    return this;
  }

  /**
   * [Output Only] Default service account used by VMs running in this project.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultServiceAccount() {
    return defaultServiceAccount;
  }

  /**
   * [Output Only] Default service account used by VMs running in this project.
   * @param defaultServiceAccount defaultServiceAccount or {@code null} for none
   */
  public Project setDefaultServiceAccount(java.lang.String defaultServiceAccount) {
    this.defaultServiceAccount = defaultServiceAccount;
    return this;
  }

  /**
   * An optional textual description of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional textual description of the resource.
   * @param description description or {@code null} for none
   */
  public Project setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Restricted features enabled for use on this project.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnabledFeatures() {
    return enabledFeatures;
  }

  /**
   * Restricted features enabled for use on this project.
   * @param enabledFeatures enabledFeatures or {@code null} for none
   */
  public Project setEnabledFeatures(java.util.List<java.lang.String> enabledFeatures) {
    this.enabledFeatures = enabledFeatures;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * This is not the project ID, and is just a unique ID used by Compute Engine to identify
   * resources.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * This is not the project ID, and is just a unique ID used by Compute Engine to identify
   * resources.
   * @param id id or {@code null} for none
   */
  public Project setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#project for projects.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#project for projects.
   * @param kind kind or {@code null} for none
   */
  public Project setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute
   * Engine.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute
   * Engine.
   * @param name name or {@code null} for none
   */
  public Project setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] Quotas assigned to this project.
   * @return value or {@code null} for none
   */
  public java.util.List<Quota> getQuotas() {
    return quotas;
  }

  /**
   * [Output Only] Quotas assigned to this project.
   * @param quotas quotas or {@code null} for none
   */
  public Project setQuotas(java.util.List<Quota> quotas) {
    this.quotas = quotas;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Project setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are
   * stored.
   * @return value or {@code null} for none
   */
  public UsageExportLocation getUsageExportLocation() {
    return usageExportLocation;
  }

  /**
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are
   * stored.
   * @param usageExportLocation usageExportLocation or {@code null} for none
   */
  public Project setUsageExportLocation(UsageExportLocation usageExportLocation) {
    this.usageExportLocation = usageExportLocation;
    return this;
  }

  /**
   * [Output Only] The role this project has in a shared VPC configuration. Currently only HOST
   * projects are differentiated.
   * @return value or {@code null} for none
   */
  public java.lang.String getXpnProjectStatus() {
    return xpnProjectStatus;
  }

  /**
   * [Output Only] The role this project has in a shared VPC configuration. Currently only HOST
   * projects are differentiated.
   * @param xpnProjectStatus xpnProjectStatus or {@code null} for none
   */
  public Project setXpnProjectStatus(java.lang.String xpnProjectStatus) {
    this.xpnProjectStatus = xpnProjectStatus;
    return this;
  }

  @Override
  public Project set(String fieldName, Object value) {
    return (Project) super.set(fieldName, value);
  }

  @Override
  public Project clone() {
    return (Project) super.clone();
  }

}