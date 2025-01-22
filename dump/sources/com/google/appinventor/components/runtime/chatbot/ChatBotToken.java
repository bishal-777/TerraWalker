package com.google.appinventor.components.runtime.chatbot;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;

public final class ChatBotToken {
    /* access modifiers changed from: private */
    public static Descriptors.FileDescriptor descriptor;
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_request_descriptor = ((Descriptors.Descriptor) getDescriptor().getMessageTypes().get(2));
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_request_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_request_descriptor, new String[]{"Version", "Token", "Uuid", "Question", "System", "Apikey", "Provider", "Model"});
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_response_descriptor = ((Descriptors.Descriptor) getDescriptor().getMessageTypes().get(3));
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_response_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_response_descriptor, new String[]{"Version", "Status", "Uuid", "Answer"});
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_token_descriptor = ((Descriptors.Descriptor) getDescriptor().getMessageTypes().get(1));
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_token_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_token_descriptor, new String[]{"Version", "Keyid", "Generation", "Unsigned", "Signature"});
    /* access modifiers changed from: private */
    public static final Descriptors.Descriptor internal_static_unsigned_descriptor = ((Descriptors.Descriptor) getDescriptor().getMessageTypes().get(0));
    /* access modifiers changed from: private */
    public static final GeneratedMessageV3.FieldAccessorTable internal_static_unsigned_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unsigned_descriptor, new String[]{"Huuid", "Version", "Generation"});

    public interface requestOrBuilder extends MessageOrBuilder {
        String getApikey();

        ByteString getApikeyBytes();

        String getModel();

        ByteString getModelBytes();

        String getProvider();

        ByteString getProviderBytes();

        String getQuestion();

        ByteString getQuestionBytes();

        String getSystem();

        ByteString getSystemBytes();

        token getToken();

        tokenOrBuilder getTokenOrBuilder();

        String getUuid();

        ByteString getUuidBytes();

        long getVersion();

        boolean hasApikey();

        boolean hasModel();

        boolean hasProvider();

        boolean hasQuestion();

        boolean hasSystem();

        boolean hasToken();

        boolean hasUuid();

        boolean hasVersion();
    }

    public interface responseOrBuilder extends MessageOrBuilder {
        String getAnswer();

        ByteString getAnswerBytes();

        long getStatus();

        String getUuid();

        ByteString getUuidBytes();

        long getVersion();

        boolean hasAnswer();

        boolean hasStatus();

        boolean hasUuid();

        boolean hasVersion();
    }

    public interface tokenOrBuilder extends MessageOrBuilder {
        long getGeneration();

        long getKeyid();

        ByteString getSignature();

        ByteString getUnsigned();

        long getVersion();

        boolean hasGeneration();

        boolean hasKeyid();

        boolean hasSignature();

        boolean hasUnsigned();

        boolean hasVersion();
    }

    public interface unsignedOrBuilder extends MessageOrBuilder {
        long getGeneration();

        String getHuuid();

        ByteString getHuuidBytes();

        long getVersion();

        boolean hasGeneration();

        boolean hasHuuid();

        boolean hasVersion();
    }

    private ChatBotToken() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite) registry);
    }

    public static final class unsigned extends GeneratedMessageV3 implements unsignedOrBuilder {
        private static final unsigned DEFAULT_INSTANCE = new unsigned();
        public static final int GENERATION_FIELD_NUMBER = 3;
        public static final int HUUID_FIELD_NUMBER = 1;
        @Deprecated
        public static final Parser<unsigned> PARSER = new AbstractParser<unsigned>() {
            public unsigned parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new unsigned(input, extensionRegistry);
            }
        };
        public static final int VERSION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public long generation_;
        /* access modifiers changed from: private */
        public volatile Object huuid_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public long version_;

        private unsigned(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private unsigned() {
            this.memoizedIsInitialized = -1;
            this.huuid_ = "";
            this.version_ = 0;
            this.generation_ = 0;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private unsigned(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            ByteString bs = input.readBytes();
                            this.bitField0_ |= 1;
                            this.huuid_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 2;
                            this.version_ = input.readUInt64();
                            break;
                        case 24:
                            this.bitField0_ |= 4;
                            this.generation_ = input.readUInt64();
                            break;
                        default:
                            if (parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                break;
                            } else {
                                done = true;
                                break;
                            }
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatBotToken.internal_static_unsigned_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatBotToken.internal_static_unsigned_fieldAccessorTable.ensureFieldAccessorsInitialized(unsigned.class, Builder.class);
        }

        public boolean hasHuuid() {
            return (this.bitField0_ & 1) == 1;
        }

        public String getHuuid() {
            Object ref = this.huuid_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.huuid_ = s;
            }
            return s;
        }

        public ByteString getHuuidBytes() {
            Object ref = this.huuid_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.huuid_ = b;
            return b;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 2) == 2;
        }

        public long getVersion() {
            return this.version_;
        }

        public boolean hasGeneration() {
            return (this.bitField0_ & 4) == 4;
        }

        public long getGeneration() {
            return this.generation_;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessageV3.writeString(output, 1, this.huuid_);
            }
            if ((this.bitField0_ & 2) == 2) {
                output.writeUInt64(2, this.version_);
            }
            if ((this.bitField0_ & 4) == 4) {
                output.writeUInt64(3, this.generation_);
            }
            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.huuid_);
            }
            if ((this.bitField0_ & 2) == 2) {
                size2 += CodedOutputStream.computeUInt64Size(2, this.version_);
            }
            if ((this.bitField0_ & 4) == 4) {
                size2 += CodedOutputStream.computeUInt64Size(3, this.generation_);
            }
            int size3 = size2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size3;
            return size3;
        }

        public boolean equals(Object obj) {
            boolean result;
            boolean result2;
            boolean result3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof unsigned)) {
                return ChatBotToken.super.equals(obj);
            }
            unsigned other = (unsigned) obj;
            boolean result4 = 1 != 0 && hasHuuid() == other.hasHuuid();
            if (hasHuuid()) {
                result4 = result4 && getHuuid().equals(other.getHuuid());
            }
            if (!result4 || hasVersion() != other.hasVersion()) {
                result = false;
            } else {
                result = true;
            }
            if (hasVersion()) {
                if (!result || getVersion() != other.getVersion()) {
                    result = false;
                } else {
                    result = true;
                }
            }
            if (!result || hasGeneration() != other.hasGeneration()) {
                result2 = false;
            } else {
                result2 = true;
            }
            if (hasGeneration()) {
                if (!result2 || getGeneration() != other.getGeneration()) {
                    result2 = false;
                } else {
                    result2 = true;
                }
            }
            if (!result2 || !this.unknownFields.equals(other.unknownFields)) {
                result3 = false;
            } else {
                result3 = true;
            }
            return result3;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = getDescriptorForType().hashCode() + 779;
            if (hasHuuid()) {
                hash = (((hash * 37) + 1) * 53) + getHuuid().hashCode();
            }
            if (hasVersion()) {
                hash = (((hash * 37) + 2) * 53) + Internal.hashLong(getVersion());
            }
            if (hasGeneration()) {
                hash = (((hash * 37) + 3) * 53) + Internal.hashLong(getGeneration());
            }
            int hash2 = (hash * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static unsigned parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (unsigned) PARSER.parseFrom(data);
        }

        public static unsigned parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (unsigned) PARSER.parseFrom(data, extensionRegistry);
        }

        public static unsigned parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (unsigned) PARSER.parseFrom(data);
        }

        public static unsigned parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (unsigned) PARSER.parseFrom(data, extensionRegistry);
        }

        public static unsigned parseFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static unsigned parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static unsigned parseDelimitedFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static unsigned parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static unsigned parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static unsigned parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(unsigned prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            return new Builder(parent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements unsignedOrBuilder {
            private int bitField0_;
            private long generation_;
            private Object huuid_;
            private long version_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatBotToken.internal_static_unsigned_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatBotToken.internal_static_unsigned_fieldAccessorTable.ensureFieldAccessorsInitialized(unsigned.class, Builder.class);
            }

            private Builder() {
                this.huuid_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.huuid_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (unsigned.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                unsigned.super.clear();
                this.huuid_ = "";
                this.bitField0_ &= -2;
                this.version_ = 0;
                this.bitField0_ &= -3;
                this.generation_ = 0;
                this.bitField0_ &= -5;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ChatBotToken.internal_static_unsigned_descriptor;
            }

            public unsigned getDefaultInstanceForType() {
                return unsigned.getDefaultInstance();
            }

            public unsigned build() {
                unsigned result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw newUninitializedMessageException(result);
            }

            public unsigned buildPartial() {
                unsigned result = new unsigned((GeneratedMessageV3.Builder) this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) == 1) {
                    to_bitField0_ = 0 | 1;
                }
                Object unused = result.huuid_ = this.huuid_;
                if ((from_bitField0_ & 2) == 2) {
                    to_bitField0_ |= 2;
                }
                long unused2 = result.version_ = this.version_;
                if ((from_bitField0_ & 4) == 4) {
                    to_bitField0_ |= 4;
                }
                long unused3 = result.generation_ = this.generation_;
                int unused4 = result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return unsigned.super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return unsigned.super.setField(field, value);
            }

            public Builder clearField(Descriptors.FieldDescriptor field) {
                return unsigned.super.clearField(field);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return unsigned.super.clearOneof(oneof);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return unsigned.super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return unsigned.super.addRepeatedField(field, value);
            }

            /* Debug info: failed to restart local var, previous not found, register: 1 */
            public Builder mergeFrom(Message other) {
                if (other instanceof unsigned) {
                    return mergeFrom((unsigned) (unsigned) other);
                }
                unsigned.super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(unsigned other) {
                if (other != unsigned.getDefaultInstance()) {
                    if (other.hasHuuid()) {
                        this.bitField0_ |= 1;
                        this.huuid_ = other.huuid_;
                        onChanged();
                    }
                    if (other.hasVersion()) {
                        setVersion(other.getVersion());
                    }
                    if (other.hasGeneration()) {
                        setGeneration(other.getGeneration());
                    }
                    mergeUnknownFields(other.unknownFields);
                    onChanged();
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                try {
                    unsigned parsedMessage = (unsigned) unsigned.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    unsigned parsedMessage2 = e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } catch (Throwable th) {
                    if (0 != 0) {
                        mergeFrom((unsigned) null);
                    }
                    throw th;
                }
            }

            public boolean hasHuuid() {
                return (this.bitField0_ & 1) == 1;
            }

            public String getHuuid() {
                Object ref = this.huuid_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.huuid_ = s;
                return s;
            }

            public ByteString getHuuidBytes() {
                Object ref = this.huuid_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.huuid_ = b;
                return b;
            }

            public Builder setHuuid(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.huuid_ = value;
                onChanged();
                return this;
            }

            public Builder clearHuuid() {
                this.bitField0_ &= -2;
                this.huuid_ = unsigned.getDefaultInstance().getHuuid();
                onChanged();
                return this;
            }

            public Builder setHuuidBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.huuid_ = value;
                onChanged();
                return this;
            }

            public boolean hasVersion() {
                return (this.bitField0_ & 2) == 2;
            }

            public long getVersion() {
                return this.version_;
            }

            public Builder setVersion(long value) {
                this.bitField0_ |= 2;
                this.version_ = value;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -3;
                this.version_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGeneration() {
                return (this.bitField0_ & 4) == 4;
            }

            public long getGeneration() {
                return this.generation_;
            }

            public Builder setGeneration(long value) {
                this.bitField0_ |= 4;
                this.generation_ = value;
                onChanged();
                return this;
            }

            public Builder clearGeneration() {
                this.bitField0_ &= -5;
                this.generation_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return unsigned.super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return unsigned.super.mergeUnknownFields(unknownFields);
            }
        }

        public static unsigned getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<unsigned> parser() {
            return PARSER;
        }

        public Parser<unsigned> getParserForType() {
            return PARSER;
        }

        public unsigned getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class token extends GeneratedMessageV3 implements tokenOrBuilder {
        private static final token DEFAULT_INSTANCE = new token();
        public static final int GENERATION_FIELD_NUMBER = 3;
        public static final int KEYID_FIELD_NUMBER = 2;
        @Deprecated
        public static final Parser<token> PARSER = new AbstractParser<token>() {
            public token parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new token(input, extensionRegistry);
            }
        };
        public static final int SIGNATURE_FIELD_NUMBER = 5;
        public static final int UNSIGNED_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public long generation_;
        /* access modifiers changed from: private */
        public long keyid_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public ByteString signature_;
        /* access modifiers changed from: private */
        public ByteString unsigned_;
        /* access modifiers changed from: private */
        public long version_;

        private token(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private token() {
            this.memoizedIsInitialized = -1;
            this.version_ = 1;
            this.keyid_ = 1;
            this.generation_ = 0;
            this.unsigned_ = ByteString.EMPTY;
            this.signature_ = ByteString.EMPTY;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private token(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.version_ = input.readUInt64();
                            break;
                        case 16:
                            this.bitField0_ |= 2;
                            this.keyid_ = input.readUInt64();
                            break;
                        case 24:
                            this.bitField0_ |= 4;
                            this.generation_ = input.readUInt64();
                            break;
                        case 34:
                            this.bitField0_ |= 8;
                            this.unsigned_ = input.readBytes();
                            break;
                        case 42:
                            this.bitField0_ |= 16;
                            this.signature_ = input.readBytes();
                            break;
                        default:
                            if (parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                break;
                            } else {
                                done = true;
                                break;
                            }
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatBotToken.internal_static_token_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatBotToken.internal_static_token_fieldAccessorTable.ensureFieldAccessorsInitialized(token.class, Builder.class);
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public long getVersion() {
            return this.version_;
        }

        public boolean hasKeyid() {
            return (this.bitField0_ & 2) == 2;
        }

        public long getKeyid() {
            return this.keyid_;
        }

        public boolean hasGeneration() {
            return (this.bitField0_ & 4) == 4;
        }

        public long getGeneration() {
            return this.generation_;
        }

        public boolean hasUnsigned() {
            return (this.bitField0_ & 8) == 8;
        }

        public ByteString getUnsigned() {
            return this.unsigned_;
        }

        public boolean hasSignature() {
            return (this.bitField0_ & 16) == 16;
        }

        public ByteString getSignature() {
            return this.signature_;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                output.writeUInt64(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                output.writeUInt64(2, this.keyid_);
            }
            if ((this.bitField0_ & 4) == 4) {
                output.writeUInt64(3, this.generation_);
            }
            if ((this.bitField0_ & 8) == 8) {
                output.writeBytes(4, this.unsigned_);
            }
            if ((this.bitField0_ & 16) == 16) {
                output.writeBytes(5, this.signature_);
            }
            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                size2 = 0 + CodedOutputStream.computeUInt64Size(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                size2 += CodedOutputStream.computeUInt64Size(2, this.keyid_);
            }
            if ((this.bitField0_ & 4) == 4) {
                size2 += CodedOutputStream.computeUInt64Size(3, this.generation_);
            }
            if ((this.bitField0_ & 8) == 8) {
                size2 += CodedOutputStream.computeBytesSize(4, this.unsigned_);
            }
            if ((this.bitField0_ & 16) == 16) {
                size2 += CodedOutputStream.computeBytesSize(5, this.signature_);
            }
            int size3 = size2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size3;
            return size3;
        }

        public boolean equals(Object obj) {
            boolean result;
            boolean result2;
            boolean result3;
            boolean result4;
            boolean result5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof token)) {
                return ChatBotToken.super.equals(obj);
            }
            token other = (token) obj;
            boolean result6 = 1 != 0 && hasVersion() == other.hasVersion();
            if (hasVersion()) {
                result6 = result6 && getVersion() == other.getVersion();
            }
            if (!result6 || hasKeyid() != other.hasKeyid()) {
                result = false;
            } else {
                result = true;
            }
            if (hasKeyid()) {
                if (!result || getKeyid() != other.getKeyid()) {
                    result = false;
                } else {
                    result = true;
                }
            }
            if (!result || hasGeneration() != other.hasGeneration()) {
                result2 = false;
            } else {
                result2 = true;
            }
            if (hasGeneration()) {
                if (!result2 || getGeneration() != other.getGeneration()) {
                    result2 = false;
                } else {
                    result2 = true;
                }
            }
            if (!result2 || hasUnsigned() != other.hasUnsigned()) {
                result3 = false;
            } else {
                result3 = true;
            }
            if (hasUnsigned()) {
                if (!result3 || !getUnsigned().equals(other.getUnsigned())) {
                    result3 = false;
                } else {
                    result3 = true;
                }
            }
            if (!result3 || hasSignature() != other.hasSignature()) {
                result4 = false;
            } else {
                result4 = true;
            }
            if (hasSignature()) {
                if (!result4 || !getSignature().equals(other.getSignature())) {
                    result4 = false;
                } else {
                    result4 = true;
                }
            }
            if (!result4 || !this.unknownFields.equals(other.unknownFields)) {
                result5 = false;
            } else {
                result5 = true;
            }
            return result5;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = getDescriptorForType().hashCode() + 779;
            if (hasVersion()) {
                hash = (((hash * 37) + 1) * 53) + Internal.hashLong(getVersion());
            }
            if (hasKeyid()) {
                hash = (((hash * 37) + 2) * 53) + Internal.hashLong(getKeyid());
            }
            if (hasGeneration()) {
                hash = (((hash * 37) + 3) * 53) + Internal.hashLong(getGeneration());
            }
            if (hasUnsigned()) {
                hash = (((hash * 37) + 4) * 53) + getUnsigned().hashCode();
            }
            if (hasSignature()) {
                hash = (((hash * 37) + 5) * 53) + getSignature().hashCode();
            }
            int hash2 = (hash * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static token parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (token) PARSER.parseFrom(data);
        }

        public static token parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (token) PARSER.parseFrom(data, extensionRegistry);
        }

        public static token parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (token) PARSER.parseFrom(data);
        }

        public static token parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (token) PARSER.parseFrom(data, extensionRegistry);
        }

        public static token parseFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static token parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static token parseDelimitedFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static token parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static token parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static token parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(token prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            return new Builder(parent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements tokenOrBuilder {
            private int bitField0_;
            private long generation_;
            private long keyid_;
            private ByteString signature_;
            private ByteString unsigned_;
            private long version_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatBotToken.internal_static_token_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatBotToken.internal_static_token_fieldAccessorTable.ensureFieldAccessorsInitialized(token.class, Builder.class);
            }

            private Builder() {
                this.version_ = 1;
                this.keyid_ = 1;
                this.unsigned_ = ByteString.EMPTY;
                this.signature_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.version_ = 1;
                this.keyid_ = 1;
                this.unsigned_ = ByteString.EMPTY;
                this.signature_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (token.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                token.super.clear();
                this.version_ = 1;
                this.bitField0_ &= -2;
                this.keyid_ = 1;
                this.bitField0_ &= -3;
                this.generation_ = 0;
                this.bitField0_ &= -5;
                this.unsigned_ = ByteString.EMPTY;
                this.bitField0_ &= -9;
                this.signature_ = ByteString.EMPTY;
                this.bitField0_ &= -17;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ChatBotToken.internal_static_token_descriptor;
            }

            public token getDefaultInstanceForType() {
                return token.getDefaultInstance();
            }

            public token build() {
                token result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw newUninitializedMessageException(result);
            }

            public token buildPartial() {
                token result = new token((GeneratedMessageV3.Builder) this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) == 1) {
                    to_bitField0_ = 0 | 1;
                }
                long unused = result.version_ = this.version_;
                if ((from_bitField0_ & 2) == 2) {
                    to_bitField0_ |= 2;
                }
                long unused2 = result.keyid_ = this.keyid_;
                if ((from_bitField0_ & 4) == 4) {
                    to_bitField0_ |= 4;
                }
                long unused3 = result.generation_ = this.generation_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                ByteString unused4 = result.unsigned_ = this.unsigned_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                ByteString unused5 = result.signature_ = this.signature_;
                int unused6 = result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return token.super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return token.super.setField(field, value);
            }

            public Builder clearField(Descriptors.FieldDescriptor field) {
                return token.super.clearField(field);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return token.super.clearOneof(oneof);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return token.super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return token.super.addRepeatedField(field, value);
            }

            /* Debug info: failed to restart local var, previous not found, register: 1 */
            public Builder mergeFrom(Message other) {
                if (other instanceof token) {
                    return mergeFrom((token) (token) other);
                }
                token.super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(token other) {
                if (other != token.getDefaultInstance()) {
                    if (other.hasVersion()) {
                        setVersion(other.getVersion());
                    }
                    if (other.hasKeyid()) {
                        setKeyid(other.getKeyid());
                    }
                    if (other.hasGeneration()) {
                        setGeneration(other.getGeneration());
                    }
                    if (other.hasUnsigned()) {
                        setUnsigned(other.getUnsigned());
                    }
                    if (other.hasSignature()) {
                        setSignature(other.getSignature());
                    }
                    mergeUnknownFields(other.unknownFields);
                    onChanged();
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                try {
                    token parsedMessage = (token) token.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    token parsedMessage2 = e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } catch (Throwable th) {
                    if (0 != 0) {
                        mergeFrom((token) null);
                    }
                    throw th;
                }
            }

            public boolean hasVersion() {
                return (this.bitField0_ & 1) == 1;
            }

            public long getVersion() {
                return this.version_;
            }

            public Builder setVersion(long value) {
                this.bitField0_ |= 1;
                this.version_ = value;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = 1;
                onChanged();
                return this;
            }

            public boolean hasKeyid() {
                return (this.bitField0_ & 2) == 2;
            }

            public long getKeyid() {
                return this.keyid_;
            }

            public Builder setKeyid(long value) {
                this.bitField0_ |= 2;
                this.keyid_ = value;
                onChanged();
                return this;
            }

            public Builder clearKeyid() {
                this.bitField0_ &= -3;
                this.keyid_ = 1;
                onChanged();
                return this;
            }

            public boolean hasGeneration() {
                return (this.bitField0_ & 4) == 4;
            }

            public long getGeneration() {
                return this.generation_;
            }

            public Builder setGeneration(long value) {
                this.bitField0_ |= 4;
                this.generation_ = value;
                onChanged();
                return this;
            }

            public Builder clearGeneration() {
                this.bitField0_ &= -5;
                this.generation_ = 0;
                onChanged();
                return this;
            }

            public boolean hasUnsigned() {
                return (this.bitField0_ & 8) == 8;
            }

            public ByteString getUnsigned() {
                return this.unsigned_;
            }

            public Builder setUnsigned(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.unsigned_ = value;
                onChanged();
                return this;
            }

            public Builder clearUnsigned() {
                this.bitField0_ &= -9;
                this.unsigned_ = token.getDefaultInstance().getUnsigned();
                onChanged();
                return this;
            }

            public boolean hasSignature() {
                return (this.bitField0_ & 16) == 16;
            }

            public ByteString getSignature() {
                return this.signature_;
            }

            public Builder setSignature(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.signature_ = value;
                onChanged();
                return this;
            }

            public Builder clearSignature() {
                this.bitField0_ &= -17;
                this.signature_ = token.getDefaultInstance().getSignature();
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return token.super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return token.super.mergeUnknownFields(unknownFields);
            }
        }

        public static token getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<token> parser() {
            return PARSER;
        }

        public Parser<token> getParserForType() {
            return PARSER;
        }

        public token getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class request extends GeneratedMessageV3 implements requestOrBuilder {
        public static final int APIKEY_FIELD_NUMBER = 6;
        private static final request DEFAULT_INSTANCE = new request();
        public static final int MODEL_FIELD_NUMBER = 8;
        @Deprecated
        public static final Parser<request> PARSER = new AbstractParser<request>() {
            public request parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new request(input, extensionRegistry);
            }
        };
        public static final int PROVIDER_FIELD_NUMBER = 7;
        public static final int QUESTION_FIELD_NUMBER = 4;
        public static final int SYSTEM_FIELD_NUMBER = 5;
        public static final int TOKEN_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object apikey_;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object model_;
        /* access modifiers changed from: private */
        public volatile Object provider_;
        /* access modifiers changed from: private */
        public volatile Object question_;
        /* access modifiers changed from: private */
        public volatile Object system_;
        /* access modifiers changed from: private */
        public token token_;
        /* access modifiers changed from: private */
        public volatile Object uuid_;
        /* access modifiers changed from: private */
        public long version_;

        private request(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private request() {
            this.memoizedIsInitialized = -1;
            this.version_ = 1;
            this.uuid_ = "";
            this.question_ = "";
            this.system_ = "";
            this.apikey_ = "";
            this.provider_ = "chatgpt";
            this.model_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private request(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.version_ = input.readUInt64();
                            break;
                        case 18:
                            token.Builder subBuilder = (this.bitField0_ & 2) == 2 ? this.token_.toBuilder() : null;
                            this.token_ = input.readMessage(token.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.token_);
                                this.token_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 2;
                            break;
                        case 26:
                            ByteString bs = input.readBytes();
                            this.bitField0_ |= 4;
                            this.uuid_ = bs;
                            break;
                        case 34:
                            ByteString bs2 = input.readBytes();
                            this.bitField0_ |= 8;
                            this.question_ = bs2;
                            break;
                        case 42:
                            ByteString bs3 = input.readBytes();
                            this.bitField0_ |= 16;
                            this.system_ = bs3;
                            break;
                        case 50:
                            ByteString bs4 = input.readBytes();
                            this.bitField0_ |= 32;
                            this.apikey_ = bs4;
                            break;
                        case 58:
                            ByteString bs5 = input.readBytes();
                            this.bitField0_ |= 64;
                            this.provider_ = bs5;
                            break;
                        case 66:
                            ByteString bs6 = input.readBytes();
                            this.bitField0_ |= 128;
                            this.model_ = bs6;
                            break;
                        default:
                            if (parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                break;
                            } else {
                                done = true;
                                break;
                            }
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatBotToken.internal_static_request_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatBotToken.internal_static_request_fieldAccessorTable.ensureFieldAccessorsInitialized(request.class, Builder.class);
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public long getVersion() {
            return this.version_;
        }

        public boolean hasToken() {
            return (this.bitField0_ & 2) == 2;
        }

        public token getToken() {
            return this.token_ == null ? token.getDefaultInstance() : this.token_;
        }

        public tokenOrBuilder getTokenOrBuilder() {
            return this.token_ == null ? token.getDefaultInstance() : this.token_;
        }

        public boolean hasUuid() {
            return (this.bitField0_ & 4) == 4;
        }

        public String getUuid() {
            Object ref = this.uuid_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.uuid_ = s;
            }
            return s;
        }

        public ByteString getUuidBytes() {
            Object ref = this.uuid_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.uuid_ = b;
            return b;
        }

        public boolean hasQuestion() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getQuestion() {
            Object ref = this.question_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.question_ = s;
            }
            return s;
        }

        public ByteString getQuestionBytes() {
            Object ref = this.question_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.question_ = b;
            return b;
        }

        public boolean hasSystem() {
            return (this.bitField0_ & 16) == 16;
        }

        public String getSystem() {
            Object ref = this.system_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.system_ = s;
            }
            return s;
        }

        public ByteString getSystemBytes() {
            Object ref = this.system_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.system_ = b;
            return b;
        }

        public boolean hasApikey() {
            return (this.bitField0_ & 32) == 32;
        }

        public String getApikey() {
            Object ref = this.apikey_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.apikey_ = s;
            }
            return s;
        }

        public ByteString getApikeyBytes() {
            Object ref = this.apikey_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.apikey_ = b;
            return b;
        }

        public boolean hasProvider() {
            return (this.bitField0_ & 64) == 64;
        }

        public String getProvider() {
            Object ref = this.provider_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.provider_ = s;
            }
            return s;
        }

        public ByteString getProviderBytes() {
            Object ref = this.provider_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.provider_ = b;
            return b;
        }

        public boolean hasModel() {
            return (this.bitField0_ & 128) == 128;
        }

        public String getModel() {
            Object ref = this.model_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.model_ = s;
            }
            return s;
        }

        public ByteString getModelBytes() {
            Object ref = this.model_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.model_ = b;
            return b;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                output.writeUInt64(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                output.writeMessage(2, getToken());
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessageV3.writeString(output, 3, this.uuid_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessageV3.writeString(output, 4, this.question_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessageV3.writeString(output, 5, this.system_);
            }
            if ((this.bitField0_ & 32) == 32) {
                GeneratedMessageV3.writeString(output, 6, this.apikey_);
            }
            if ((this.bitField0_ & 64) == 64) {
                GeneratedMessageV3.writeString(output, 7, this.provider_);
            }
            if ((this.bitField0_ & 128) == 128) {
                GeneratedMessageV3.writeString(output, 8, this.model_);
            }
            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                size2 = 0 + CodedOutputStream.computeUInt64Size(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                size2 += CodedOutputStream.computeMessageSize(2, getToken());
            }
            if ((this.bitField0_ & 4) == 4) {
                size2 += GeneratedMessageV3.computeStringSize(3, this.uuid_);
            }
            if ((this.bitField0_ & 8) == 8) {
                size2 += GeneratedMessageV3.computeStringSize(4, this.question_);
            }
            if ((this.bitField0_ & 16) == 16) {
                size2 += GeneratedMessageV3.computeStringSize(5, this.system_);
            }
            if ((this.bitField0_ & 32) == 32) {
                size2 += GeneratedMessageV3.computeStringSize(6, this.apikey_);
            }
            if ((this.bitField0_ & 64) == 64) {
                size2 += GeneratedMessageV3.computeStringSize(7, this.provider_);
            }
            if ((this.bitField0_ & 128) == 128) {
                size2 += GeneratedMessageV3.computeStringSize(8, this.model_);
            }
            int size3 = size2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size3;
            return size3;
        }

        public boolean equals(Object obj) {
            boolean result;
            boolean result2;
            boolean result3;
            boolean result4;
            boolean result5;
            boolean result6;
            boolean result7;
            boolean result8;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof request)) {
                return ChatBotToken.super.equals(obj);
            }
            request other = (request) obj;
            boolean result9 = 1 != 0 && hasVersion() == other.hasVersion();
            if (hasVersion()) {
                result9 = result9 && getVersion() == other.getVersion();
            }
            if (!result9 || hasToken() != other.hasToken()) {
                result = false;
            } else {
                result = true;
            }
            if (hasToken()) {
                if (!result || !getToken().equals(other.getToken())) {
                    result = false;
                } else {
                    result = true;
                }
            }
            if (!result || hasUuid() != other.hasUuid()) {
                result2 = false;
            } else {
                result2 = true;
            }
            if (hasUuid()) {
                if (!result2 || !getUuid().equals(other.getUuid())) {
                    result2 = false;
                } else {
                    result2 = true;
                }
            }
            if (!result2 || hasQuestion() != other.hasQuestion()) {
                result3 = false;
            } else {
                result3 = true;
            }
            if (hasQuestion()) {
                if (!result3 || !getQuestion().equals(other.getQuestion())) {
                    result3 = false;
                } else {
                    result3 = true;
                }
            }
            if (!result3 || hasSystem() != other.hasSystem()) {
                result4 = false;
            } else {
                result4 = true;
            }
            if (hasSystem()) {
                if (!result4 || !getSystem().equals(other.getSystem())) {
                    result4 = false;
                } else {
                    result4 = true;
                }
            }
            if (!result4 || hasApikey() != other.hasApikey()) {
                result5 = false;
            } else {
                result5 = true;
            }
            if (hasApikey()) {
                if (!result5 || !getApikey().equals(other.getApikey())) {
                    result5 = false;
                } else {
                    result5 = true;
                }
            }
            if (!result5 || hasProvider() != other.hasProvider()) {
                result6 = false;
            } else {
                result6 = true;
            }
            if (hasProvider()) {
                if (!result6 || !getProvider().equals(other.getProvider())) {
                    result6 = false;
                } else {
                    result6 = true;
                }
            }
            if (!result6 || hasModel() != other.hasModel()) {
                result7 = false;
            } else {
                result7 = true;
            }
            if (hasModel()) {
                if (!result7 || !getModel().equals(other.getModel())) {
                    result7 = false;
                } else {
                    result7 = true;
                }
            }
            if (!result7 || !this.unknownFields.equals(other.unknownFields)) {
                result8 = false;
            } else {
                result8 = true;
            }
            return result8;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = getDescriptorForType().hashCode() + 779;
            if (hasVersion()) {
                hash = (((hash * 37) + 1) * 53) + Internal.hashLong(getVersion());
            }
            if (hasToken()) {
                hash = (((hash * 37) + 2) * 53) + getToken().hashCode();
            }
            if (hasUuid()) {
                hash = (((hash * 37) + 3) * 53) + getUuid().hashCode();
            }
            if (hasQuestion()) {
                hash = (((hash * 37) + 4) * 53) + getQuestion().hashCode();
            }
            if (hasSystem()) {
                hash = (((hash * 37) + 5) * 53) + getSystem().hashCode();
            }
            if (hasApikey()) {
                hash = (((hash * 37) + 6) * 53) + getApikey().hashCode();
            }
            if (hasProvider()) {
                hash = (((hash * 37) + 7) * 53) + getProvider().hashCode();
            }
            if (hasModel()) {
                hash = (((hash * 37) + 8) * 53) + getModel().hashCode();
            }
            int hash2 = (hash * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static request parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (request) PARSER.parseFrom(data);
        }

        public static request parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (request) PARSER.parseFrom(data, extensionRegistry);
        }

        public static request parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (request) PARSER.parseFrom(data);
        }

        public static request parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (request) PARSER.parseFrom(data, extensionRegistry);
        }

        public static request parseFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static request parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static request parseDelimitedFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static request parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static request parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static request parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(request prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            return new Builder(parent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements requestOrBuilder {
            private Object apikey_;
            private int bitField0_;
            private Object model_;
            private Object provider_;
            private Object question_;
            private Object system_;
            private SingleFieldBuilderV3<token, token.Builder, tokenOrBuilder> tokenBuilder_;
            private token token_;
            private Object uuid_;
            private long version_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatBotToken.internal_static_request_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatBotToken.internal_static_request_fieldAccessorTable.ensureFieldAccessorsInitialized(request.class, Builder.class);
            }

            private Builder() {
                this.version_ = 1;
                this.token_ = null;
                this.uuid_ = "";
                this.question_ = "";
                this.system_ = "";
                this.apikey_ = "";
                this.provider_ = "chatgpt";
                this.model_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.version_ = 1;
                this.token_ = null;
                this.uuid_ = "";
                this.question_ = "";
                this.system_ = "";
                this.apikey_ = "";
                this.provider_ = "chatgpt";
                this.model_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (request.alwaysUseFieldBuilders) {
                    getTokenFieldBuilder();
                }
            }

            public Builder clear() {
                request.super.clear();
                this.version_ = 1;
                this.bitField0_ &= -2;
                if (this.tokenBuilder_ == null) {
                    this.token_ = null;
                } else {
                    this.tokenBuilder_.clear();
                }
                this.bitField0_ &= -3;
                this.uuid_ = "";
                this.bitField0_ &= -5;
                this.question_ = "";
                this.bitField0_ &= -9;
                this.system_ = "";
                this.bitField0_ &= -17;
                this.apikey_ = "";
                this.bitField0_ &= -33;
                this.provider_ = "chatgpt";
                this.bitField0_ &= -65;
                this.model_ = "";
                this.bitField0_ &= -129;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ChatBotToken.internal_static_request_descriptor;
            }

            public request getDefaultInstanceForType() {
                return request.getDefaultInstance();
            }

            public request build() {
                request result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw newUninitializedMessageException(result);
            }

            public request buildPartial() {
                request result = new request((GeneratedMessageV3.Builder) this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) == 1) {
                    to_bitField0_ = 0 | 1;
                }
                long unused = result.version_ = this.version_;
                if ((from_bitField0_ & 2) == 2) {
                    to_bitField0_ |= 2;
                }
                if (this.tokenBuilder_ == null) {
                    token unused2 = result.token_ = this.token_;
                } else {
                    token unused3 = result.token_ = this.tokenBuilder_.build();
                }
                if ((from_bitField0_ & 4) == 4) {
                    to_bitField0_ |= 4;
                }
                Object unused4 = result.uuid_ = this.uuid_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                Object unused5 = result.question_ = this.question_;
                if ((from_bitField0_ & 16) == 16) {
                    to_bitField0_ |= 16;
                }
                Object unused6 = result.system_ = this.system_;
                if ((from_bitField0_ & 32) == 32) {
                    to_bitField0_ |= 32;
                }
                Object unused7 = result.apikey_ = this.apikey_;
                if ((from_bitField0_ & 64) == 64) {
                    to_bitField0_ |= 64;
                }
                Object unused8 = result.provider_ = this.provider_;
                if ((from_bitField0_ & 128) == 128) {
                    to_bitField0_ |= 128;
                }
                Object unused9 = result.model_ = this.model_;
                int unused10 = result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return request.super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return request.super.setField(field, value);
            }

            public Builder clearField(Descriptors.FieldDescriptor field) {
                return request.super.clearField(field);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return request.super.clearOneof(oneof);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return request.super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return request.super.addRepeatedField(field, value);
            }

            /* Debug info: failed to restart local var, previous not found, register: 1 */
            public Builder mergeFrom(Message other) {
                if (other instanceof request) {
                    return mergeFrom((request) (request) other);
                }
                request.super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(request other) {
                if (other != request.getDefaultInstance()) {
                    if (other.hasVersion()) {
                        setVersion(other.getVersion());
                    }
                    if (other.hasToken()) {
                        mergeToken(other.getToken());
                    }
                    if (other.hasUuid()) {
                        this.bitField0_ |= 4;
                        this.uuid_ = other.uuid_;
                        onChanged();
                    }
                    if (other.hasQuestion()) {
                        this.bitField0_ |= 8;
                        this.question_ = other.question_;
                        onChanged();
                    }
                    if (other.hasSystem()) {
                        this.bitField0_ |= 16;
                        this.system_ = other.system_;
                        onChanged();
                    }
                    if (other.hasApikey()) {
                        this.bitField0_ |= 32;
                        this.apikey_ = other.apikey_;
                        onChanged();
                    }
                    if (other.hasProvider()) {
                        this.bitField0_ |= 64;
                        this.provider_ = other.provider_;
                        onChanged();
                    }
                    if (other.hasModel()) {
                        this.bitField0_ |= 128;
                        this.model_ = other.model_;
                        onChanged();
                    }
                    mergeUnknownFields(other.unknownFields);
                    onChanged();
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                try {
                    request parsedMessage = (request) request.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    request parsedMessage2 = e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } catch (Throwable th) {
                    if (0 != 0) {
                        mergeFrom((request) null);
                    }
                    throw th;
                }
            }

            public boolean hasVersion() {
                return (this.bitField0_ & 1) == 1;
            }

            public long getVersion() {
                return this.version_;
            }

            public Builder setVersion(long value) {
                this.bitField0_ |= 1;
                this.version_ = value;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = 1;
                onChanged();
                return this;
            }

            public boolean hasToken() {
                return (this.bitField0_ & 2) == 2;
            }

            public token getToken() {
                if (this.tokenBuilder_ == null) {
                    return this.token_ == null ? token.getDefaultInstance() : this.token_;
                }
                return this.tokenBuilder_.getMessage();
            }

            public Builder setToken(token value) {
                if (this.tokenBuilder_ != null) {
                    this.tokenBuilder_.setMessage(value);
                } else if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.token_ = value;
                    onChanged();
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setToken(token.Builder builderForValue) {
                if (this.tokenBuilder_ == null) {
                    this.token_ = builderForValue.build();
                    onChanged();
                } else {
                    this.tokenBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeToken(token value) {
                if (this.tokenBuilder_ == null) {
                    if ((this.bitField0_ & 2) != 2 || this.token_ == null || this.token_ == token.getDefaultInstance()) {
                        this.token_ = value;
                    } else {
                        this.token_ = token.newBuilder(this.token_).mergeFrom(value).buildPartial();
                    }
                    onChanged();
                } else {
                    this.tokenBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder clearToken() {
                if (this.tokenBuilder_ == null) {
                    this.token_ = null;
                    onChanged();
                } else {
                    this.tokenBuilder_.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public token.Builder getTokenBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return getTokenFieldBuilder().getBuilder();
            }

            public tokenOrBuilder getTokenOrBuilder() {
                if (this.tokenBuilder_ != null) {
                    return this.tokenBuilder_.getMessageOrBuilder();
                }
                return this.token_ == null ? token.getDefaultInstance() : this.token_;
            }

            private SingleFieldBuilderV3<token, token.Builder, tokenOrBuilder> getTokenFieldBuilder() {
                if (this.tokenBuilder_ == null) {
                    this.tokenBuilder_ = new SingleFieldBuilderV3<>(getToken(), getParentForChildren(), isClean());
                    this.token_ = null;
                }
                return this.tokenBuilder_;
            }

            public boolean hasUuid() {
                return (this.bitField0_ & 4) == 4;
            }

            public String getUuid() {
                Object ref = this.uuid_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.uuid_ = s;
                return s;
            }

            public ByteString getUuidBytes() {
                Object ref = this.uuid_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.uuid_ = b;
                return b;
            }

            public Builder setUuid(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 4;
                this.uuid_ = value;
                onChanged();
                return this;
            }

            public Builder clearUuid() {
                this.bitField0_ &= -5;
                this.uuid_ = request.getDefaultInstance().getUuid();
                onChanged();
                return this;
            }

            public Builder setUuidBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 4;
                this.uuid_ = value;
                onChanged();
                return this;
            }

            public boolean hasQuestion() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getQuestion() {
                Object ref = this.question_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.question_ = s;
                return s;
            }

            public ByteString getQuestionBytes() {
                Object ref = this.question_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.question_ = b;
                return b;
            }

            public Builder setQuestion(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.question_ = value;
                onChanged();
                return this;
            }

            public Builder clearQuestion() {
                this.bitField0_ &= -9;
                this.question_ = request.getDefaultInstance().getQuestion();
                onChanged();
                return this;
            }

            public Builder setQuestionBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.question_ = value;
                onChanged();
                return this;
            }

            public boolean hasSystem() {
                return (this.bitField0_ & 16) == 16;
            }

            public String getSystem() {
                Object ref = this.system_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.system_ = s;
                return s;
            }

            public ByteString getSystemBytes() {
                Object ref = this.system_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.system_ = b;
                return b;
            }

            public Builder setSystem(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.system_ = value;
                onChanged();
                return this;
            }

            public Builder clearSystem() {
                this.bitField0_ &= -17;
                this.system_ = request.getDefaultInstance().getSystem();
                onChanged();
                return this;
            }

            public Builder setSystemBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 16;
                this.system_ = value;
                onChanged();
                return this;
            }

            public boolean hasApikey() {
                return (this.bitField0_ & 32) == 32;
            }

            public String getApikey() {
                Object ref = this.apikey_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.apikey_ = s;
                return s;
            }

            public ByteString getApikeyBytes() {
                Object ref = this.apikey_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.apikey_ = b;
                return b;
            }

            public Builder setApikey(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.apikey_ = value;
                onChanged();
                return this;
            }

            public Builder clearApikey() {
                this.bitField0_ &= -33;
                this.apikey_ = request.getDefaultInstance().getApikey();
                onChanged();
                return this;
            }

            public Builder setApikeyBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 32;
                this.apikey_ = value;
                onChanged();
                return this;
            }

            public boolean hasProvider() {
                return (this.bitField0_ & 64) == 64;
            }

            public String getProvider() {
                Object ref = this.provider_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.provider_ = s;
                return s;
            }

            public ByteString getProviderBytes() {
                Object ref = this.provider_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.provider_ = b;
                return b;
            }

            public Builder setProvider(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.provider_ = value;
                onChanged();
                return this;
            }

            public Builder clearProvider() {
                this.bitField0_ &= -65;
                this.provider_ = request.getDefaultInstance().getProvider();
                onChanged();
                return this;
            }

            public Builder setProviderBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 64;
                this.provider_ = value;
                onChanged();
                return this;
            }

            public boolean hasModel() {
                return (this.bitField0_ & 128) == 128;
            }

            public String getModel() {
                Object ref = this.model_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.model_ = s;
                return s;
            }

            public ByteString getModelBytes() {
                Object ref = this.model_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.model_ = b;
                return b;
            }

            public Builder setModel(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 128;
                this.model_ = value;
                onChanged();
                return this;
            }

            public Builder clearModel() {
                this.bitField0_ &= -129;
                this.model_ = request.getDefaultInstance().getModel();
                onChanged();
                return this;
            }

            public Builder setModelBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 128;
                this.model_ = value;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return request.super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return request.super.mergeUnknownFields(unknownFields);
            }
        }

        public static request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<request> parser() {
            return PARSER;
        }

        public Parser<request> getParserForType() {
            return PARSER;
        }

        public request getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class response extends GeneratedMessageV3 implements responseOrBuilder {
        public static final int ANSWER_FIELD_NUMBER = 4;
        private static final response DEFAULT_INSTANCE = new response();
        @Deprecated
        public static final Parser<response> PARSER = new AbstractParser<response>() {
            public response parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new response(input, extensionRegistry);
            }
        };
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object answer_;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public long status_;
        /* access modifiers changed from: private */
        public volatile Object uuid_;
        /* access modifiers changed from: private */
        public long version_;

        private response(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private response() {
            this.memoizedIsInitialized = -1;
            this.version_ = 1;
            this.status_ = 0;
            this.uuid_ = "";
            this.answer_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private response(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            boolean done = false;
            while (!done) {
                try {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.version_ = input.readUInt64();
                            break;
                        case 16:
                            this.bitField0_ |= 2;
                            this.status_ = input.readUInt64();
                            break;
                        case 26:
                            ByteString bs = input.readBytes();
                            this.bitField0_ |= 4;
                            this.uuid_ = bs;
                            break;
                        case 34:
                            ByteString bs2 = input.readBytes();
                            this.bitField0_ |= 8;
                            this.answer_ = bs2;
                            break;
                        default:
                            if (parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                break;
                            } else {
                                done = true;
                                break;
                            }
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatBotToken.internal_static_response_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatBotToken.internal_static_response_fieldAccessorTable.ensureFieldAccessorsInitialized(response.class, Builder.class);
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public long getVersion() {
            return this.version_;
        }

        public boolean hasStatus() {
            return (this.bitField0_ & 2) == 2;
        }

        public long getStatus() {
            return this.status_;
        }

        public boolean hasUuid() {
            return (this.bitField0_ & 4) == 4;
        }

        public String getUuid() {
            Object ref = this.uuid_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.uuid_ = s;
            }
            return s;
        }

        public ByteString getUuidBytes() {
            Object ref = this.uuid_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.uuid_ = b;
            return b;
        }

        public boolean hasAnswer() {
            return (this.bitField0_ & 8) == 8;
        }

        public String getAnswer() {
            Object ref = this.answer_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                this.answer_ = s;
            }
            return s;
        }

        public ByteString getAnswerBytes() {
            Object ref = this.answer_;
            if (!(ref instanceof String)) {
                return (ByteString) ref;
            }
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.answer_ = b;
            return b;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                output.writeUInt64(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                output.writeUInt64(2, this.status_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessageV3.writeString(output, 3, this.uuid_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessageV3.writeString(output, 4, this.answer_);
            }
            this.unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                size2 = 0 + CodedOutputStream.computeUInt64Size(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                size2 += CodedOutputStream.computeUInt64Size(2, this.status_);
            }
            if ((this.bitField0_ & 4) == 4) {
                size2 += GeneratedMessageV3.computeStringSize(3, this.uuid_);
            }
            if ((this.bitField0_ & 8) == 8) {
                size2 += GeneratedMessageV3.computeStringSize(4, this.answer_);
            }
            int size3 = size2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size3;
            return size3;
        }

        public boolean equals(Object obj) {
            boolean result;
            boolean result2;
            boolean result3;
            boolean result4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof response)) {
                return ChatBotToken.super.equals(obj);
            }
            response other = (response) obj;
            boolean result5 = 1 != 0 && hasVersion() == other.hasVersion();
            if (hasVersion()) {
                result5 = result5 && getVersion() == other.getVersion();
            }
            if (!result5 || hasStatus() != other.hasStatus()) {
                result = false;
            } else {
                result = true;
            }
            if (hasStatus()) {
                if (!result || getStatus() != other.getStatus()) {
                    result = false;
                } else {
                    result = true;
                }
            }
            if (!result || hasUuid() != other.hasUuid()) {
                result2 = false;
            } else {
                result2 = true;
            }
            if (hasUuid()) {
                if (!result2 || !getUuid().equals(other.getUuid())) {
                    result2 = false;
                } else {
                    result2 = true;
                }
            }
            if (!result2 || hasAnswer() != other.hasAnswer()) {
                result3 = false;
            } else {
                result3 = true;
            }
            if (hasAnswer()) {
                if (!result3 || !getAnswer().equals(other.getAnswer())) {
                    result3 = false;
                } else {
                    result3 = true;
                }
            }
            if (!result3 || !this.unknownFields.equals(other.unknownFields)) {
                result4 = false;
            } else {
                result4 = true;
            }
            return result4;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = getDescriptorForType().hashCode() + 779;
            if (hasVersion()) {
                hash = (((hash * 37) + 1) * 53) + Internal.hashLong(getVersion());
            }
            if (hasStatus()) {
                hash = (((hash * 37) + 2) * 53) + Internal.hashLong(getStatus());
            }
            if (hasUuid()) {
                hash = (((hash * 37) + 3) * 53) + getUuid().hashCode();
            }
            if (hasAnswer()) {
                hash = (((hash * 37) + 4) * 53) + getAnswer().hashCode();
            }
            int hash2 = (hash * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static response parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (response) PARSER.parseFrom(data);
        }

        public static response parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (response) PARSER.parseFrom(data, extensionRegistry);
        }

        public static response parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (response) PARSER.parseFrom(data);
        }

        public static response parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (response) PARSER.parseFrom(data, extensionRegistry);
        }

        public static response parseFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static response parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static response parseDelimitedFrom(InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static response parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static response parseFrom(CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static response parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(response prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            if (this == DEFAULT_INSTANCE) {
                return new Builder();
            }
            return new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
            return new Builder(parent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements responseOrBuilder {
            private Object answer_;
            private int bitField0_;
            private long status_;
            private Object uuid_;
            private long version_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatBotToken.internal_static_response_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatBotToken.internal_static_response_fieldAccessorTable.ensureFieldAccessorsInitialized(response.class, Builder.class);
            }

            private Builder() {
                this.version_ = 1;
                this.uuid_ = "";
                this.answer_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.version_ = 1;
                this.uuid_ = "";
                this.answer_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (response.alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                response.super.clear();
                this.version_ = 1;
                this.bitField0_ &= -2;
                this.status_ = 0;
                this.bitField0_ &= -3;
                this.uuid_ = "";
                this.bitField0_ &= -5;
                this.answer_ = "";
                this.bitField0_ &= -9;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ChatBotToken.internal_static_response_descriptor;
            }

            public response getDefaultInstanceForType() {
                return response.getDefaultInstance();
            }

            public response build() {
                response result = buildPartial();
                if (result.isInitialized()) {
                    return result;
                }
                throw newUninitializedMessageException(result);
            }

            public response buildPartial() {
                response result = new response((GeneratedMessageV3.Builder) this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 1) == 1) {
                    to_bitField0_ = 0 | 1;
                }
                long unused = result.version_ = this.version_;
                if ((from_bitField0_ & 2) == 2) {
                    to_bitField0_ |= 2;
                }
                long unused2 = result.status_ = this.status_;
                if ((from_bitField0_ & 4) == 4) {
                    to_bitField0_ |= 4;
                }
                Object unused3 = result.uuid_ = this.uuid_;
                if ((from_bitField0_ & 8) == 8) {
                    to_bitField0_ |= 8;
                }
                Object unused4 = result.answer_ = this.answer_;
                int unused5 = result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return response.super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return response.super.setField(field, value);
            }

            public Builder clearField(Descriptors.FieldDescriptor field) {
                return response.super.clearField(field);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return response.super.clearOneof(oneof);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return response.super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return response.super.addRepeatedField(field, value);
            }

            /* Debug info: failed to restart local var, previous not found, register: 1 */
            public Builder mergeFrom(Message other) {
                if (other instanceof response) {
                    return mergeFrom((response) (response) other);
                }
                response.super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(response other) {
                if (other != response.getDefaultInstance()) {
                    if (other.hasVersion()) {
                        setVersion(other.getVersion());
                    }
                    if (other.hasStatus()) {
                        setStatus(other.getStatus());
                    }
                    if (other.hasUuid()) {
                        this.bitField0_ |= 4;
                        this.uuid_ = other.uuid_;
                        onChanged();
                    }
                    if (other.hasAnswer()) {
                        this.bitField0_ |= 8;
                        this.answer_ = other.answer_;
                        onChanged();
                    }
                    mergeUnknownFields(other.unknownFields);
                    onChanged();
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                try {
                    response parsedMessage = (response) response.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    response parsedMessage2 = e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } catch (Throwable th) {
                    if (0 != 0) {
                        mergeFrom((response) null);
                    }
                    throw th;
                }
            }

            public boolean hasVersion() {
                return (this.bitField0_ & 1) == 1;
            }

            public long getVersion() {
                return this.version_;
            }

            public Builder setVersion(long value) {
                this.bitField0_ |= 1;
                this.version_ = value;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = 1;
                onChanged();
                return this;
            }

            public boolean hasStatus() {
                return (this.bitField0_ & 2) == 2;
            }

            public long getStatus() {
                return this.status_;
            }

            public Builder setStatus(long value) {
                this.bitField0_ |= 2;
                this.status_ = value;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public boolean hasUuid() {
                return (this.bitField0_ & 4) == 4;
            }

            public String getUuid() {
                Object ref = this.uuid_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.uuid_ = s;
                return s;
            }

            public ByteString getUuidBytes() {
                Object ref = this.uuid_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.uuid_ = b;
                return b;
            }

            public Builder setUuid(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 4;
                this.uuid_ = value;
                onChanged();
                return this;
            }

            public Builder clearUuid() {
                this.bitField0_ &= -5;
                this.uuid_ = response.getDefaultInstance().getUuid();
                onChanged();
                return this;
            }

            public Builder setUuidBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 4;
                this.uuid_ = value;
                onChanged();
                return this;
            }

            public boolean hasAnswer() {
                return (this.bitField0_ & 8) == 8;
            }

            public String getAnswer() {
                Object ref = this.answer_;
                if (ref instanceof String) {
                    return (String) ref;
                }
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                if (!bs.isValidUtf8()) {
                    return s;
                }
                this.answer_ = s;
                return s;
            }

            public ByteString getAnswerBytes() {
                Object ref = this.answer_;
                if (!(ref instanceof String)) {
                    return (ByteString) ref;
                }
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.answer_ = b;
                return b;
            }

            public Builder setAnswer(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.answer_ = value;
                onChanged();
                return this;
            }

            public Builder clearAnswer() {
                this.bitField0_ &= -9;
                this.answer_ = response.getDefaultInstance().getAnswer();
                onChanged();
                return this;
            }

            public Builder setAnswerBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 8;
                this.answer_ = value;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return response.super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return response.super.mergeUnknownFields(unknownFields);
            }
        }

        public static response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<response> parser() {
            return PARSER;
        }

        public Parser<response> getParserForType() {
            return PARSER;
        }

        public response getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\nchat.proto\"D\n\bunsigned\u0012\r\n\u0005huuid\u0018\u0001 \u0001(\t\u0012\u0012\n\u0007version\u0018\u0002 \u0001(\u0004:\u00010\u0012\u0015\n\ngeneration\u0018\u0003 \u0001(\u0004:\u00010\"i\n\u0005token\u0012\u0012\n\u0007version\u0018\u0001 \u0001(\u0004:\u00011\u0012\u0010\n\u0005keyid\u0018\u0002 \u0001(\u0004:\u00011\u0012\u0015\n\ngeneration\u0018\u0003 \u0001(\u0004:\u00010\u0012\u0010\n\bunsigned\u0018\u0004 \u0001(\f\u0012\u0011\n\tsignature\u0018\u0005 \u0001(\f\"\u0001\n\u0007request\u0012\u0012\n\u0007version\u0018\u0001 \u0001(\u0004:\u00011\u0012\u0015\n\u0005token\u0018\u0002 \u0001(\u000b2\u0006.token\u0012\f\n\u0004uuid\u0018\u0003 \u0001(\t\u0012\u0010\n\bquestion\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006system\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006apikey\u0018\u0006 \u0001(\t\u0012\u0019\n\bprovider\u0018\u0007 \u0001(\t:\u0007chatgpt\u0012\r\n\u0005model\u0018\b \u0001(\t\"O\n\bresponse\u0012\u0012\n\u0007version\u0018\u0001 \u0001(\u0004:\u00011\u0012\u0011\n\u0006status\u0018\u0002 \u0001(\u0004:\u0001", "0\u0012\f\n\u0004uuid\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006answer\u0018\u0004 \u0001(\tBA\n1com.google.appinventor.components.runtime.chatbotB\fChatBotToken"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor root) {
                Descriptors.FileDescriptor unused = ChatBotToken.descriptor = root;
                return null;
            }
        });
    }
}
