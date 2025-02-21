// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    /**
     * Name of the CloudFront function.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the CloudFront function.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The function’s stage, either `DEVELOPMENT` or `LIVE`.
     * 
     */
    @Import(name="stage", required=true)
    private Output<String> stage;

    /**
     * @return The function’s stage, either `DEVELOPMENT` or `LIVE`.
     * 
     */
    public Output<String> stage() {
        return this.stage;
    }

    private GetFunctionArgs() {}

    private GetFunctionArgs(GetFunctionArgs $) {
        this.name = $.name;
        this.stage = $.stage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionArgs $;

        public Builder() {
            $ = new GetFunctionArgs();
        }

        public Builder(GetFunctionArgs defaults) {
            $ = new GetFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the CloudFront function.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the CloudFront function.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param stage The function’s stage, either `DEVELOPMENT` or `LIVE`.
         * 
         * @return builder
         * 
         */
        public Builder stage(Output<String> stage) {
            $.stage = stage;
            return this;
        }

        /**
         * @param stage The function’s stage, either `DEVELOPMENT` or `LIVE`.
         * 
         * @return builder
         * 
         */
        public Builder stage(String stage) {
            return stage(Output.of(stage));
        }

        public GetFunctionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.stage = Objects.requireNonNull($.stage, "expected parameter 'stage' to be non-null");
            return $;
        }
    }

}
