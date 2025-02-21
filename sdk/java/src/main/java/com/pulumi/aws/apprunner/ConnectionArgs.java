// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Name of the connection.
     * 
     */
    @Import(name="connectionName", required=true)
    private Output<String> connectionName;

    /**
     * @return Name of the connection.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }

    /**
     * The source repository provider. Valid values: `GITHUB`.
     * 
     */
    @Import(name="providerType", required=true)
    private Output<String> providerType;

    /**
     * @return The source repository provider. Valid values: `GITHUB`.
     * 
     */
    public Output<String> providerType() {
        return this.providerType;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.connectionName = $.connectionName;
        this.providerType = $.providerType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName Name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName Name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param providerType The source repository provider. Valid values: `GITHUB`.
         * 
         * @return builder
         * 
         */
        public Builder providerType(Output<String> providerType) {
            $.providerType = providerType;
            return this;
        }

        /**
         * @param providerType The source repository provider. Valid values: `GITHUB`.
         * 
         * @return builder
         * 
         */
        public Builder providerType(String providerType) {
            return providerType(Output.of(providerType));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ConnectionArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.providerType = Objects.requireNonNull($.providerType, "expected parameter 'providerType' to be non-null");
            return $;
        }
    }

}
