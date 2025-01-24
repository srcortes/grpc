// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec06/bank-service.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec06;

/**
 * Protobuf type {@code sec06.TransferResponse}
 */
public final class TransferResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sec06.TransferResponse)
    TransferResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferResponse.newBuilder() to construct.
  private TransferResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferResponse() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.models.sec06.BankServiceUnary.internal_static_sec06_TransferResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.models.sec06.BankServiceUnary.internal_static_sec06_TransferResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.models.sec06.TransferResponse.class, com.grpc.models.sec06.TransferResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_ = 0;
  /**
   * <code>.sec06.TransferStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.sec06.TransferStatus status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public com.grpc.models.sec06.TransferStatus getStatus() {
    com.grpc.models.sec06.TransferStatus result = com.grpc.models.sec06.TransferStatus.forNumber(status_);
    return result == null ? com.grpc.models.sec06.TransferStatus.UNRECOGNIZED : result;
  }

  public static final int FROM_ACCOUNT_FIELD_NUMBER = 2;
  private com.grpc.models.sec06.AccountBalance fromAccount_;
  /**
   * <code>.sec06.AccountBalance from_account = 2;</code>
   * @return Whether the fromAccount field is set.
   */
  @java.lang.Override
  public boolean hasFromAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.sec06.AccountBalance from_account = 2;</code>
   * @return The fromAccount.
   */
  @java.lang.Override
  public com.grpc.models.sec06.AccountBalance getFromAccount() {
    return fromAccount_ == null ? com.grpc.models.sec06.AccountBalance.getDefaultInstance() : fromAccount_;
  }
  /**
   * <code>.sec06.AccountBalance from_account = 2;</code>
   */
  @java.lang.Override
  public com.grpc.models.sec06.AccountBalanceOrBuilder getFromAccountOrBuilder() {
    return fromAccount_ == null ? com.grpc.models.sec06.AccountBalance.getDefaultInstance() : fromAccount_;
  }

  public static final int TO_ACCOUNT_FIELD_NUMBER = 3;
  private com.grpc.models.sec06.AccountBalance toAccount_;
  /**
   * <code>.sec06.AccountBalance to_account = 3;</code>
   * @return Whether the toAccount field is set.
   */
  @java.lang.Override
  public boolean hasToAccount() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.sec06.AccountBalance to_account = 3;</code>
   * @return The toAccount.
   */
  @java.lang.Override
  public com.grpc.models.sec06.AccountBalance getToAccount() {
    return toAccount_ == null ? com.grpc.models.sec06.AccountBalance.getDefaultInstance() : toAccount_;
  }
  /**
   * <code>.sec06.AccountBalance to_account = 3;</code>
   */
  @java.lang.Override
  public com.grpc.models.sec06.AccountBalanceOrBuilder getToAccountOrBuilder() {
    return toAccount_ == null ? com.grpc.models.sec06.AccountBalance.getDefaultInstance() : toAccount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != com.grpc.models.sec06.TransferStatus.FAIL.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getFromAccount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getToAccount());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != com.grpc.models.sec06.TransferStatus.FAIL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFromAccount());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getToAccount());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.models.sec06.TransferResponse)) {
      return super.equals(obj);
    }
    com.grpc.models.sec06.TransferResponse other = (com.grpc.models.sec06.TransferResponse) obj;

    if (status_ != other.status_) return false;
    if (hasFromAccount() != other.hasFromAccount()) return false;
    if (hasFromAccount()) {
      if (!getFromAccount()
          .equals(other.getFromAccount())) return false;
    }
    if (hasToAccount() != other.hasToAccount()) return false;
    if (hasToAccount()) {
      if (!getToAccount()
          .equals(other.getToAccount())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasFromAccount()) {
      hash = (37 * hash) + FROM_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getFromAccount().hashCode();
    }
    if (hasToAccount()) {
      hash = (37 * hash) + TO_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getToAccount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.models.sec06.TransferResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.grpc.models.sec06.TransferResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.grpc.models.sec06.TransferResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.models.sec06.TransferResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.models.sec06.TransferResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code sec06.TransferResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sec06.TransferResponse)
      com.grpc.models.sec06.TransferResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.models.sec06.BankServiceUnary.internal_static_sec06_TransferResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.models.sec06.BankServiceUnary.internal_static_sec06_TransferResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.models.sec06.TransferResponse.class, com.grpc.models.sec06.TransferResponse.Builder.class);
    }

    // Construct using com.grpc.models.sec06.TransferResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFromAccountFieldBuilder();
        getToAccountFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      status_ = 0;
      fromAccount_ = null;
      if (fromAccountBuilder_ != null) {
        fromAccountBuilder_.dispose();
        fromAccountBuilder_ = null;
      }
      toAccount_ = null;
      if (toAccountBuilder_ != null) {
        toAccountBuilder_.dispose();
        toAccountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.models.sec06.BankServiceUnary.internal_static_sec06_TransferResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.models.sec06.TransferResponse getDefaultInstanceForType() {
      return com.grpc.models.sec06.TransferResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.models.sec06.TransferResponse build() {
      com.grpc.models.sec06.TransferResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.models.sec06.TransferResponse buildPartial() {
      com.grpc.models.sec06.TransferResponse result = new com.grpc.models.sec06.TransferResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.grpc.models.sec06.TransferResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.status_ = status_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fromAccount_ = fromAccountBuilder_ == null
            ? fromAccount_
            : fromAccountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.toAccount_ = toAccountBuilder_ == null
            ? toAccount_
            : toAccountBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.models.sec06.TransferResponse) {
        return mergeFrom((com.grpc.models.sec06.TransferResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.models.sec06.TransferResponse other) {
      if (other == com.grpc.models.sec06.TransferResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasFromAccount()) {
        mergeFromAccount(other.getFromAccount());
      }
      if (other.hasToAccount()) {
        mergeToAccount(other.getToAccount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getFromAccountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getToAccountFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.sec06.TransferStatus status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.sec06.TransferStatus status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.TransferStatus status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.grpc.models.sec06.TransferStatus getStatus() {
      com.grpc.models.sec06.TransferStatus result = com.grpc.models.sec06.TransferStatus.forNumber(status_);
      return result == null ? com.grpc.models.sec06.TransferStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.sec06.TransferStatus status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.grpc.models.sec06.TransferStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.TransferStatus status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;
      onChanged();
      return this;
    }

    private com.grpc.models.sec06.AccountBalance fromAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.models.sec06.AccountBalance, com.grpc.models.sec06.AccountBalance.Builder, com.grpc.models.sec06.AccountBalanceOrBuilder> fromAccountBuilder_;
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     * @return Whether the fromAccount field is set.
     */
    public boolean hasFromAccount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     * @return The fromAccount.
     */
    public com.grpc.models.sec06.AccountBalance getFromAccount() {
      if (fromAccountBuilder_ == null) {
        return fromAccount_ == null ? com.grpc.models.sec06.AccountBalance.getDefaultInstance() : fromAccount_;
      } else {
        return fromAccountBuilder_.getMessage();
      }
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     */
    public Builder setFromAccount(com.grpc.models.sec06.AccountBalance value) {
      if (fromAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fromAccount_ = value;
      } else {
        fromAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     */
    public Builder setFromAccount(
        com.grpc.models.sec06.AccountBalance.Builder builderForValue) {
      if (fromAccountBuilder_ == null) {
        fromAccount_ = builderForValue.build();
      } else {
        fromAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     */
    public Builder mergeFromAccount(com.grpc.models.sec06.AccountBalance value) {
      if (fromAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fromAccount_ != null &&
          fromAccount_ != com.grpc.models.sec06.AccountBalance.getDefaultInstance()) {
          getFromAccountBuilder().mergeFrom(value);
        } else {
          fromAccount_ = value;
        }
      } else {
        fromAccountBuilder_.mergeFrom(value);
      }
      if (fromAccount_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     */
    public Builder clearFromAccount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fromAccount_ = null;
      if (fromAccountBuilder_ != null) {
        fromAccountBuilder_.dispose();
        fromAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     */
    public com.grpc.models.sec06.AccountBalance.Builder getFromAccountBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFromAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     */
    public com.grpc.models.sec06.AccountBalanceOrBuilder getFromAccountOrBuilder() {
      if (fromAccountBuilder_ != null) {
        return fromAccountBuilder_.getMessageOrBuilder();
      } else {
        return fromAccount_ == null ?
            com.grpc.models.sec06.AccountBalance.getDefaultInstance() : fromAccount_;
      }
    }
    /**
     * <code>.sec06.AccountBalance from_account = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.models.sec06.AccountBalance, com.grpc.models.sec06.AccountBalance.Builder, com.grpc.models.sec06.AccountBalanceOrBuilder> 
        getFromAccountFieldBuilder() {
      if (fromAccountBuilder_ == null) {
        fromAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.models.sec06.AccountBalance, com.grpc.models.sec06.AccountBalance.Builder, com.grpc.models.sec06.AccountBalanceOrBuilder>(
                getFromAccount(),
                getParentForChildren(),
                isClean());
        fromAccount_ = null;
      }
      return fromAccountBuilder_;
    }

    private com.grpc.models.sec06.AccountBalance toAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.models.sec06.AccountBalance, com.grpc.models.sec06.AccountBalance.Builder, com.grpc.models.sec06.AccountBalanceOrBuilder> toAccountBuilder_;
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     * @return Whether the toAccount field is set.
     */
    public boolean hasToAccount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     * @return The toAccount.
     */
    public com.grpc.models.sec06.AccountBalance getToAccount() {
      if (toAccountBuilder_ == null) {
        return toAccount_ == null ? com.grpc.models.sec06.AccountBalance.getDefaultInstance() : toAccount_;
      } else {
        return toAccountBuilder_.getMessage();
      }
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     */
    public Builder setToAccount(com.grpc.models.sec06.AccountBalance value) {
      if (toAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toAccount_ = value;
      } else {
        toAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     */
    public Builder setToAccount(
        com.grpc.models.sec06.AccountBalance.Builder builderForValue) {
      if (toAccountBuilder_ == null) {
        toAccount_ = builderForValue.build();
      } else {
        toAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     */
    public Builder mergeToAccount(com.grpc.models.sec06.AccountBalance value) {
      if (toAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          toAccount_ != null &&
          toAccount_ != com.grpc.models.sec06.AccountBalance.getDefaultInstance()) {
          getToAccountBuilder().mergeFrom(value);
        } else {
          toAccount_ = value;
        }
      } else {
        toAccountBuilder_.mergeFrom(value);
      }
      if (toAccount_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     */
    public Builder clearToAccount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      toAccount_ = null;
      if (toAccountBuilder_ != null) {
        toAccountBuilder_.dispose();
        toAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     */
    public com.grpc.models.sec06.AccountBalance.Builder getToAccountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getToAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     */
    public com.grpc.models.sec06.AccountBalanceOrBuilder getToAccountOrBuilder() {
      if (toAccountBuilder_ != null) {
        return toAccountBuilder_.getMessageOrBuilder();
      } else {
        return toAccount_ == null ?
            com.grpc.models.sec06.AccountBalance.getDefaultInstance() : toAccount_;
      }
    }
    /**
     * <code>.sec06.AccountBalance to_account = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.models.sec06.AccountBalance, com.grpc.models.sec06.AccountBalance.Builder, com.grpc.models.sec06.AccountBalanceOrBuilder> 
        getToAccountFieldBuilder() {
      if (toAccountBuilder_ == null) {
        toAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.models.sec06.AccountBalance, com.grpc.models.sec06.AccountBalance.Builder, com.grpc.models.sec06.AccountBalanceOrBuilder>(
                getToAccount(),
                getParentForChildren(),
                isClean());
        toAccount_ = null;
      }
      return toAccountBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sec06.TransferResponse)
  }

  // @@protoc_insertion_point(class_scope:sec06.TransferResponse)
  private static final com.grpc.models.sec06.TransferResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.models.sec06.TransferResponse();
  }

  public static com.grpc.models.sec06.TransferResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferResponse>
      PARSER = new com.google.protobuf.AbstractParser<TransferResponse>() {
    @java.lang.Override
    public TransferResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TransferResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.models.sec06.TransferResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

