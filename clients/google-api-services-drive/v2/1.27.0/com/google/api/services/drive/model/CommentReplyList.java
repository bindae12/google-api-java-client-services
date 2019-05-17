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

package com.google.api.services.drive.model;

/**
 * A list of replies to a comment on a file in Google Drive.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommentReplyList extends com.google.api.client.json.GenericJson {

  /**
   * The list of replies. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CommentReply> items;

  static {
    // hack to force ProGuard to consider CommentReply used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CommentReply.class);
  }

  /**
   * This is always drive#commentReplyList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A link to the next page of replies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextLink;

  /**
   * The page token for the next page of replies. This will be absent if the end of the replies list
   * has been reached. If the token is rejected for any reason, it should be discarded, and
   * pagination should be restarted from the first page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A link back to this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The list of replies. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @return value or {@code null} for none
   */
  public java.util.List<CommentReply> getItems() {
    return items;
  }

  /**
   * The list of replies. If nextPageToken is populated, then this list may be incomplete and an
   * additional page of results should be fetched.
   * @param items items or {@code null} for none
   */
  public CommentReplyList setItems(java.util.List<CommentReply> items) {
    this.items = items;
    return this;
  }

  /**
   * This is always drive#commentReplyList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#commentReplyList.
   * @param kind kind or {@code null} for none
   */
  public CommentReplyList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A link to the next page of replies.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextLink() {
    return nextLink;
  }

  /**
   * A link to the next page of replies.
   * @param nextLink nextLink or {@code null} for none
   */
  public CommentReplyList setNextLink(java.lang.String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * The page token for the next page of replies. This will be absent if the end of the replies list
   * has been reached. If the token is rejected for any reason, it should be discarded, and
   * pagination should be restarted from the first page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The page token for the next page of replies. This will be absent if the end of the replies list
   * has been reached. If the token is rejected for any reason, it should be discarded, and
   * pagination should be restarted from the first page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public CommentReplyList setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A link back to this list.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this list.
   * @param selfLink selfLink or {@code null} for none
   */
  public CommentReplyList setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public CommentReplyList set(String fieldName, Object value) {
    return (CommentReplyList) super.set(fieldName, value);
  }

  @Override
  public CommentReplyList clone() {
    return (CommentReplyList) super.clone();
  }

}