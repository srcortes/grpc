// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec04/one-of.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec04;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec04.Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.sec04.Email email = 1;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>.sec04.Email email = 1;</code>
   * @return The email.
   */
  com.grpc.models.sec04.Email getEmail();
  /**
   * <code>.sec04.Email email = 1;</code>
   */
  com.grpc.models.sec04.EmailOrBuilder getEmailOrBuilder();

  /**
   * <code>.sec04.Phone phoe = 2;</code>
   * @return Whether the phoe field is set.
   */
  boolean hasPhoe();
  /**
   * <code>.sec04.Phone phoe = 2;</code>
   * @return The phoe.
   */
  com.grpc.models.sec04.Phone getPhoe();
  /**
   * <code>.sec04.Phone phoe = 2;</code>
   */
  com.grpc.models.sec04.PhoneOrBuilder getPhoeOrBuilder();

  com.grpc.models.sec04.Credentials.LoginTypeCase getLoginTypeCase();
}
