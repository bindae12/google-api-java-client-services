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

package com.google.api.services.gmail.model;

/**
 * Labels are used to categorize messages and threads within the user's mailbox.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Label extends com.google.api.client.json.GenericJson {

  /**
   * The color to assign to the label. Color is only available for labels that have their type set
   * to user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LabelColor color;

  /**
   * The immutable ID of the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The visibility of the label in the label list in the Gmail web interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelListVisibility;

  /**
   * The visibility of the label in the message list in the Gmail web interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageListVisibility;

  /**
   * The total number of messages with the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer messagesTotal;

  /**
   * The number of unread messages with the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer messagesUnread;

  /**
   * The display name of the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The total number of threads with the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer threadsTotal;

  /**
   * The number of unread threads with the label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer threadsUnread;

  /**
   * The owner type for the label. User labels are created by the user and can be modified and
   * deleted by the user and can be applied to any message or thread. System labels are internally
   * created and cannot be added, modified, or deleted. System labels may be able to be applied to
   * or removed from messages and threads under some circumstances but this is not guaranteed. For
   * example, users can apply and remove the INBOX and UNREAD labels from messages and threads, but
   * cannot apply or remove the DRAFTS or SENT labels from messages or threads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The color to assign to the label. Color is only available for labels that have their type set
   * to user.
   * @return value or {@code null} for none
   */
  public LabelColor getColor() {
    return color;
  }

  /**
   * The color to assign to the label. Color is only available for labels that have their type set
   * to user.
   * @param color color or {@code null} for none
   */
  public Label setColor(LabelColor color) {
    this.color = color;
    return this;
  }

  /**
   * The immutable ID of the label.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The immutable ID of the label.
   * @param id id or {@code null} for none
   */
  public Label setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The visibility of the label in the label list in the Gmail web interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelListVisibility() {
    return labelListVisibility;
  }

  /**
   * The visibility of the label in the label list in the Gmail web interface.
   * @param labelListVisibility labelListVisibility or {@code null} for none
   */
  public Label setLabelListVisibility(java.lang.String labelListVisibility) {
    this.labelListVisibility = labelListVisibility;
    return this;
  }

  /**
   * The visibility of the label in the message list in the Gmail web interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageListVisibility() {
    return messageListVisibility;
  }

  /**
   * The visibility of the label in the message list in the Gmail web interface.
   * @param messageListVisibility messageListVisibility or {@code null} for none
   */
  public Label setMessageListVisibility(java.lang.String messageListVisibility) {
    this.messageListVisibility = messageListVisibility;
    return this;
  }

  /**
   * The total number of messages with the label.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMessagesTotal() {
    return messagesTotal;
  }

  /**
   * The total number of messages with the label.
   * @param messagesTotal messagesTotal or {@code null} for none
   */
  public Label setMessagesTotal(java.lang.Integer messagesTotal) {
    this.messagesTotal = messagesTotal;
    return this;
  }

  /**
   * The number of unread messages with the label.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMessagesUnread() {
    return messagesUnread;
  }

  /**
   * The number of unread messages with the label.
   * @param messagesUnread messagesUnread or {@code null} for none
   */
  public Label setMessagesUnread(java.lang.Integer messagesUnread) {
    this.messagesUnread = messagesUnread;
    return this;
  }

  /**
   * The display name of the label.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The display name of the label.
   * @param name name or {@code null} for none
   */
  public Label setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The total number of threads with the label.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getThreadsTotal() {
    return threadsTotal;
  }

  /**
   * The total number of threads with the label.
   * @param threadsTotal threadsTotal or {@code null} for none
   */
  public Label setThreadsTotal(java.lang.Integer threadsTotal) {
    this.threadsTotal = threadsTotal;
    return this;
  }

  /**
   * The number of unread threads with the label.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getThreadsUnread() {
    return threadsUnread;
  }

  /**
   * The number of unread threads with the label.
   * @param threadsUnread threadsUnread or {@code null} for none
   */
  public Label setThreadsUnread(java.lang.Integer threadsUnread) {
    this.threadsUnread = threadsUnread;
    return this;
  }

  /**
   * The owner type for the label. User labels are created by the user and can be modified and
   * deleted by the user and can be applied to any message or thread. System labels are internally
   * created and cannot be added, modified, or deleted. System labels may be able to be applied to
   * or removed from messages and threads under some circumstances but this is not guaranteed. For
   * example, users can apply and remove the INBOX and UNREAD labels from messages and threads, but
   * cannot apply or remove the DRAFTS or SENT labels from messages or threads.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The owner type for the label. User labels are created by the user and can be modified and
   * deleted by the user and can be applied to any message or thread. System labels are internally
   * created and cannot be added, modified, or deleted. System labels may be able to be applied to
   * or removed from messages and threads under some circumstances but this is not guaranteed. For
   * example, users can apply and remove the INBOX and UNREAD labels from messages and threads, but
   * cannot apply or remove the DRAFTS or SENT labels from messages or threads.
   * @param type type or {@code null} for none
   */
  public Label setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Label set(String fieldName, Object value) {
    return (Label) super.set(fieldName, value);
  }

  @Override
  public Label clone() {
    return (Label) super.clone();
  }

}