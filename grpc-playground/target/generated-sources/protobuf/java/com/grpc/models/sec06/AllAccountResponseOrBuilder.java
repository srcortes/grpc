// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec06/bank-service.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec06;

public interface AllAccountResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec06.AllAccountResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sec06.AccountBalance account = 1;</code>
   */
  java.util.List<com.grpc.models.sec06.AccountBalance> 
      getAccountList();
  /**
   * <code>repeated .sec06.AccountBalance account = 1;</code>
   */
  com.grpc.models.sec06.AccountBalance getAccount(int index);
  /**
   * <code>repeated .sec06.AccountBalance account = 1;</code>
   */
  int getAccountCount();
  /**
   * <code>repeated .sec06.AccountBalance account = 1;</code>
   */
  java.util.List<? extends com.grpc.models.sec06.AccountBalanceOrBuilder> 
      getAccountOrBuilderList();
  /**
   * <code>repeated .sec06.AccountBalance account = 1;</code>
   */
  com.grpc.models.sec06.AccountBalanceOrBuilder getAccountOrBuilder(
      int index);
}
