// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec05/v4/television.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec05.v4;

public interface TelevisionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec05.v4.Television)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string brand = 1;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 1;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>int32 price = 2;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>.sec05.v4.Type type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.sec05.v4.Type type = 3;</code>
   * @return The type.
   */
  com.grpc.models.sec05.v4.Type getType();
}