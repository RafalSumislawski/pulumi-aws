// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsArgs Empty = new VirtualNodeSpecBackendDefaultsArgs();

    /**
     * The default client policy for virtual service backends. See above for details.
     * 
     */
    @Import(name="clientPolicy")
    private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyArgs> clientPolicy;

    /**
     * @return The default client policy for virtual service backends. See above for details.
     * 
     */
    public Optional<Output<VirtualNodeSpecBackendDefaultsClientPolicyArgs>> clientPolicy() {
        return Optional.ofNullable(this.clientPolicy);
    }

    private VirtualNodeSpecBackendDefaultsArgs() {}

    private VirtualNodeSpecBackendDefaultsArgs(VirtualNodeSpecBackendDefaultsArgs $) {
        this.clientPolicy = $.clientPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientPolicy The default client policy for virtual service backends. See above for details.
         * 
         * @return builder
         * 
         */
        public Builder clientPolicy(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyArgs> clientPolicy) {
            $.clientPolicy = clientPolicy;
            return this;
        }

        /**
         * @param clientPolicy The default client policy for virtual service backends. See above for details.
         * 
         * @return builder
         * 
         */
        public Builder clientPolicy(VirtualNodeSpecBackendDefaultsClientPolicyArgs clientPolicy) {
            return clientPolicy(Output.of(clientPolicy));
        }

        public VirtualNodeSpecBackendDefaultsArgs build() {
            return $;
        }
    }

}
