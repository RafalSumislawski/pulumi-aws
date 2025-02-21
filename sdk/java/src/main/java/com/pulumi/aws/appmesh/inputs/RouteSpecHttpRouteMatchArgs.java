// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchArgs Empty = new RouteSpecHttpRouteMatchArgs();

    /**
     * The client request headers to match on.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<RouteSpecHttpRouteMatchHeaderArgs>> headers;

    /**
     * @return The client request headers to match on.
     * 
     */
    public Optional<Output<List<RouteSpecHttpRouteMatchHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    @Import(name="prefix", required=true)
    private Output<String> prefix;

    /**
     * @return The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }

    /**
     * The client request header scheme to match on. Valid values: `http`, `https`.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    /**
     * @return The client request header scheme to match on. Valid values: `http`, `https`.
     * 
     */
    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    private RouteSpecHttpRouteMatchArgs() {}

    private RouteSpecHttpRouteMatchArgs(RouteSpecHttpRouteMatchArgs $) {
        this.headers = $.headers;
        this.method = $.method;
        this.prefix = $.prefix;
        this.scheme = $.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttpRouteMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteMatchArgs $;

        public Builder() {
            $ = new RouteSpecHttpRouteMatchArgs();
        }

        public Builder(RouteSpecHttpRouteMatchArgs defaults) {
            $ = new RouteSpecHttpRouteMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headers The client request headers to match on.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<RouteSpecHttpRouteMatchHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers The client request headers to match on.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<RouteSpecHttpRouteMatchHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers The client request headers to match on.
         * 
         * @return builder
         * 
         */
        public Builder headers(RouteSpecHttpRouteMatchHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param method The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param prefix The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
         * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
         * 
         * @return builder
         * 
         */
        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
         * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param scheme The client request header scheme to match on. Valid values: `http`, `https`.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme The client request header scheme to match on. Valid values: `http`, `https`.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public RouteSpecHttpRouteMatchArgs build() {
            $.prefix = Objects.requireNonNull($.prefix, "expected parameter 'prefix' to be non-null");
            return $;
        }
    }

}
