// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec04/composition.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec04;

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec04.Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.sec04.Address address = 2;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.sec04.Address address = 2;</code>
   * @return The address.
   */
  com.grpc.models.sec04.Address getAddress();
  /**
   * <code>.sec04.Address address = 2;</code>
   */
  com.grpc.models.sec04.AddressOrBuilder getAddressOrBuilder();
}
