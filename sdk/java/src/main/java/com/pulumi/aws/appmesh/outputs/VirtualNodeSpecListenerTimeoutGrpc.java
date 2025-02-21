// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutGrpcIdle;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutGrpcPerRequest;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecListenerTimeoutGrpc {
    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle;
    /**
     * @return The per request timeout.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest;

    @CustomType.Constructor
    private VirtualNodeSpecListenerTimeoutGrpc(
        @CustomType.Parameter("idle") @Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle,
        @CustomType.Parameter("perRequest") @Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutGrpcIdle> idle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * @return The per request timeout.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutGrpcPerRequest> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutGrpc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle;
        private @Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutGrpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle) {
            this.idle = idle;
            return this;
        }
        public Builder perRequest(@Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }        public VirtualNodeSpecListenerTimeoutGrpc build() {
            return new VirtualNodeSpecListenerTimeoutGrpc(idle, perRequest);
        }
    }
}
