// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec06/bank-service.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec06;

public interface AccountBalanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec06.AccountBalance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 account_number = 1;</code>
   * @return The accountNumber.
   */
  int getAccountNumber();

  /**
   * <code>int32 balance = 2;</code>
   * @return The balance.
   */
  int getBalance();
}