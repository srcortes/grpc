// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec04/map.proto

// Protobuf Java Version: 3.25.1
package com.grpc.models.sec04;

/**
 * Protobuf type {@code sec04.Dealer}
 */
public final class Dealer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sec04.Dealer)
    DealerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Dealer.newBuilder() to construct.
  private Dealer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Dealer() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Dealer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.models.sec04.Map.internal_static_sec04_Dealer_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetInventory();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.models.sec04.Map.internal_static_sec04_Dealer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.models.sec04.Dealer.class, com.grpc.models.sec04.Dealer.Builder.class);
  }

  public static final int INVENTORY_FIELD_NUMBER = 1;
  private static final class InventoryDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, com.grpc.models.sec04.Car> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, com.grpc.models.sec04.Car>newDefaultInstance(
                com.grpc.models.sec04.Map.internal_static_sec04_Dealer_InventoryEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.grpc.models.sec04.Car.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, com.grpc.models.sec04.Car> inventory_;
  private com.google.protobuf.MapField<java.lang.Integer, com.grpc.models.sec04.Car>
  internalGetInventory() {
    if (inventory_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          InventoryDefaultEntryHolder.defaultEntry);
    }
    return inventory_;
  }
  public int getInventoryCount() {
    return internalGetInventory().getMap().size();
  }
  /**
   * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
   */
  @java.lang.Override
  public boolean containsInventory(
      int key) {

    return internalGetInventory().getMap().containsKey(key);
  }
  /**
   * Use {@link #getInventoryMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car> getInventory() {
    return getInventoryMap();
  }
  /**
   * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car> getInventoryMap() {
    return internalGetInventory().getMap();
  }
  /**
   * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
com.grpc.models.sec04.Car getInventoryOrDefault(
      int key,
      /* nullable */
com.grpc.models.sec04.Car defaultValue) {

    java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car> map =
        internalGetInventory().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
   */
  @java.lang.Override
  public com.grpc.models.sec04.Car getInventoryOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car> map =
        internalGetInventory().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetInventory(),
        InventoryDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, com.grpc.models.sec04.Car> entry
         : internalGetInventory().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, com.grpc.models.sec04.Car>
      inventory__ = InventoryDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, inventory__);
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
    if (!(obj instanceof com.grpc.models.sec04.Dealer)) {
      return super.equals(obj);
    }
    com.grpc.models.sec04.Dealer other = (com.grpc.models.sec04.Dealer) obj;

    if (!internalGetInventory().equals(
        other.internalGetInventory())) return false;
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
    if (!internalGetInventory().getMap().isEmpty()) {
      hash = (37 * hash) + INVENTORY_FIELD_NUMBER;
      hash = (53 * hash) + internalGetInventory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.models.sec04.Dealer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.grpc.models.sec04.Dealer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.grpc.models.sec04.Dealer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.models.sec04.Dealer parseFrom(
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
  public static Builder newBuilder(com.grpc.models.sec04.Dealer prototype) {
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
   * Protobuf type {@code sec04.Dealer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sec04.Dealer)
      com.grpc.models.sec04.DealerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.models.sec04.Map.internal_static_sec04_Dealer_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetInventory();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableInventory();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.models.sec04.Map.internal_static_sec04_Dealer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.models.sec04.Dealer.class, com.grpc.models.sec04.Dealer.Builder.class);
    }

    // Construct using com.grpc.models.sec04.Dealer.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableInventory().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.models.sec04.Map.internal_static_sec04_Dealer_descriptor;
    }

    @java.lang.Override
    public com.grpc.models.sec04.Dealer getDefaultInstanceForType() {
      return com.grpc.models.sec04.Dealer.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.models.sec04.Dealer build() {
      com.grpc.models.sec04.Dealer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.models.sec04.Dealer buildPartial() {
      com.grpc.models.sec04.Dealer result = new com.grpc.models.sec04.Dealer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.grpc.models.sec04.Dealer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inventory_ = internalGetInventory().build(InventoryDefaultEntryHolder.defaultEntry);
      }
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
      if (other instanceof com.grpc.models.sec04.Dealer) {
        return mergeFrom((com.grpc.models.sec04.Dealer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.models.sec04.Dealer other) {
      if (other == com.grpc.models.sec04.Dealer.getDefaultInstance()) return this;
      internalGetMutableInventory().mergeFrom(
          other.internalGetInventory());
      bitField0_ |= 0x00000001;
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
            case 10: {
              com.google.protobuf.MapEntry<java.lang.Integer, com.grpc.models.sec04.Car>
              inventory__ = input.readMessage(
                  InventoryDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableInventory().ensureBuilderMap().put(
                  inventory__.getKey(), inventory__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private static final class InventoryConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.Integer, com.grpc.models.sec04.CarOrBuilder, com.grpc.models.sec04.Car> {
      @java.lang.Override
      public com.grpc.models.sec04.Car build(com.grpc.models.sec04.CarOrBuilder val) {
        if (val instanceof com.grpc.models.sec04.Car) { return (com.grpc.models.sec04.Car) val; }
        return ((com.grpc.models.sec04.Car.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.Integer, com.grpc.models.sec04.Car> defaultEntry() {
        return InventoryDefaultEntryHolder.defaultEntry;
      }
    };
    private static final InventoryConverter inventoryConverter = new InventoryConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.Integer, com.grpc.models.sec04.CarOrBuilder, com.grpc.models.sec04.Car, com.grpc.models.sec04.Car.Builder> inventory_;
    private com.google.protobuf.MapFieldBuilder<java.lang.Integer, com.grpc.models.sec04.CarOrBuilder, com.grpc.models.sec04.Car, com.grpc.models.sec04.Car.Builder>
        internalGetInventory() {
      if (inventory_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(inventoryConverter);
      }
      return inventory_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.Integer, com.grpc.models.sec04.CarOrBuilder, com.grpc.models.sec04.Car, com.grpc.models.sec04.Car.Builder>
        internalGetMutableInventory() {
      if (inventory_ == null) {
        inventory_ = new com.google.protobuf.MapFieldBuilder<>(inventoryConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return inventory_;
    }
    public int getInventoryCount() {
      return internalGetInventory().ensureBuilderMap().size();
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    @java.lang.Override
    public boolean containsInventory(
        int key) {

      return internalGetInventory().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getInventoryMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car> getInventory() {
      return getInventoryMap();
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car> getInventoryMap() {
      return internalGetInventory().getImmutableMap();
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
com.grpc.models.sec04.Car getInventoryOrDefault(
        int key,
        /* nullable */
com.grpc.models.sec04.Car defaultValue) {

      java.util.Map<java.lang.Integer, com.grpc.models.sec04.CarOrBuilder> map = internalGetMutableInventory().ensureBuilderMap();
      return map.containsKey(key) ? inventoryConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    @java.lang.Override
    public com.grpc.models.sec04.Car getInventoryOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, com.grpc.models.sec04.CarOrBuilder> map = internalGetMutableInventory().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return inventoryConverter.build(map.get(key));
    }
    public Builder clearInventory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableInventory().clear();
      return this;
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    public Builder removeInventory(
        int key) {

      internalGetMutableInventory().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car>
        getMutableInventory() {
      bitField0_ |= 0x00000001;
      return internalGetMutableInventory().ensureMessageMap();
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    public Builder putInventory(
        int key,
        com.grpc.models.sec04.Car value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableInventory().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    public Builder putAllInventory(
        java.util.Map<java.lang.Integer, com.grpc.models.sec04.Car> values) {
      for (java.util.Map.Entry<java.lang.Integer, com.grpc.models.sec04.Car> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableInventory().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;int32, .sec04.Car&gt; inventory = 1;</code>
     */
    public com.grpc.models.sec04.Car.Builder putInventoryBuilderIfAbsent(
        int key) {
      java.util.Map<java.lang.Integer, com.grpc.models.sec04.CarOrBuilder> builderMap = internalGetMutableInventory().ensureBuilderMap();
      com.grpc.models.sec04.CarOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.grpc.models.sec04.Car.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.grpc.models.sec04.Car) {
        entry = ((com.grpc.models.sec04.Car) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.grpc.models.sec04.Car.Builder) entry;
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


    // @@protoc_insertion_point(builder_scope:sec04.Dealer)
  }

  // @@protoc_insertion_point(class_scope:sec04.Dealer)
  private static final com.grpc.models.sec04.Dealer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.models.sec04.Dealer();
  }

  public static com.grpc.models.sec04.Dealer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dealer>
      PARSER = new com.google.protobuf.AbstractParser<Dealer>() {
    @java.lang.Override
    public Dealer parsePartialFrom(
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

  public static com.google.protobuf.Parser<Dealer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dealer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.models.sec04.Dealer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

