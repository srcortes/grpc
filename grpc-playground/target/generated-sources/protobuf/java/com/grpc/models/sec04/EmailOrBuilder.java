// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec04/one-of.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec04;

public interface EmailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec04.Email)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string password = 2;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
