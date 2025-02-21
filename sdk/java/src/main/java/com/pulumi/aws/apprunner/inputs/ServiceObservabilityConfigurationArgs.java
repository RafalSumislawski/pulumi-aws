// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ServiceObservabilityConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceObservabilityConfigurationArgs Empty = new ServiceObservabilityConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the observability configuration that is associated with the service.
     * 
     */
    @Import(name="observabilityConfigurationArn", required=true)
    private Output<String> observabilityConfigurationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the observability configuration that is associated with the service.
     * 
     */
    public Output<String> observabilityConfigurationArn() {
        return this.observabilityConfigurationArn;
    }

    /**
     * When `true`, an observability configuration resource is associated with the service.
     * 
     */
    @Import(name="observabilityEnabled", required=true)
    private Output<Boolean> observabilityEnabled;

    /**
     * @return When `true`, an observability configuration resource is associated with the service.
     * 
     */
    public Output<Boolean> observabilityEnabled() {
        return this.observabilityEnabled;
    }

    private ServiceObservabilityConfigurationArgs() {}

    private ServiceObservabilityConfigurationArgs(ServiceObservabilityConfigurationArgs $) {
        this.observabilityConfigurationArn = $.observabilityConfigurationArn;
        this.observabilityEnabled = $.observabilityEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceObservabilityConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceObservabilityConfigurationArgs $;

        public Builder() {
            $ = new ServiceObservabilityConfigurationArgs();
        }

        public Builder(ServiceObservabilityConfigurationArgs defaults) {
            $ = new ServiceObservabilityConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param observabilityConfigurationArn The Amazon Resource Name (ARN) of the observability configuration that is associated with the service.
         * 
         * @return builder
         * 
         */
        public Builder observabilityConfigurationArn(Output<String> observabilityConfigurationArn) {
            $.observabilityConfigurationArn = observabilityConfigurationArn;
            return this;
        }

        /**
         * @param observabilityConfigurationArn The Amazon Resource Name (ARN) of the observability configuration that is associated with the service.
         * 
         * @return builder
         * 
         */
        public Builder observabilityConfigurationArn(String observabilityConfigurationArn) {
            return observabilityConfigurationArn(Output.of(observabilityConfigurationArn));
        }

        /**
         * @param observabilityEnabled When `true`, an observability configuration resource is associated with the service.
         * 
         * @return builder
         * 
         */
        public Builder observabilityEnabled(Output<Boolean> observabilityEnabled) {
            $.observabilityEnabled = observabilityEnabled;
            return this;
        }

        /**
         * @param observabilityEnabled When `true`, an observability configuration resource is associated with the service.
         * 
         * @return builder
         * 
         */
        public Builder observabilityEnabled(Boolean observabilityEnabled) {
            return observabilityEnabled(Output.of(observabilityEnabled));
        }

        public ServiceObservabilityConfigurationArgs build() {
            $.observabilityConfigurationArn = Objects.requireNonNull($.observabilityConfigurationArn, "expected parameter 'observabilityConfigurationArn' to be non-null");
            $.observabilityEnabled = Objects.requireNonNull($.observabilityEnabled, "expected parameter 'observabilityEnabled' to be non-null");
            return $;
        }
    }

}
