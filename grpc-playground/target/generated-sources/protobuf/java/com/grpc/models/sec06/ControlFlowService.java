// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec07/flow-control.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec06;

public final class ControlFlowService {
  private ControlFlowService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec07_Output_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec07_Output_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec07_RequestSize_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec07_RequestSize_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030sec07/flow-control.proto\022\005sec07\"\027\n\006Out" +
      "put\022\r\n\005value\030\001 \001(\005\"\033\n\013RequestSize\022\014\n\004siz" +
      "e\030\001 \001(\0052J\n\022FlowControlService\0224\n\013GetMess" +
      "ages\022\022.sec07.RequestSize\032\r.sec07.Output(" +
      "\0010\001B-\n\025com.grpc.models.sec06B\022ControlFlo" +
      "wServiceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sec07_Output_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sec07_Output_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec07_Output_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_sec07_RequestSize_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sec07_RequestSize_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec07_RequestSize_descriptor,
        new java.lang.String[] { "Size", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
