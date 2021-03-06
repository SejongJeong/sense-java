// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SenseClient.proto

package ai.cochlear.sense.grpc;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sense.full.v1.Request)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>bytes data = 1;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>string apikey = 2;</code>
   * @return The apikey.
   */
  String getApikey();
  /**
   * <code>string apikey = 2;</code>
   * @return The bytes for apikey.
   */
  com.google.protobuf.ByteString
      getApikeyBytes();

  /**
   * <code>string format = 3;</code>
   * @return The format.
   */
  String getFormat();
  /**
   * <code>string format = 3;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <code>string api_version = 4;</code>
   * @return The apiVersion.
   */
  String getApiVersion();
  /**
   * <code>string api_version = 4;</code>
   * @return The bytes for apiVersion.
   */
  com.google.protobuf.ByteString
      getApiVersionBytes();

  /**
   * <code>string user_agent = 5;</code>
   * @return The userAgent.
   */
  String getUserAgent();
  /**
   * <code>string user_agent = 5;</code>
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString
      getUserAgentBytes();
}
