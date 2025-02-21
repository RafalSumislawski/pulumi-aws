// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationTlsConfig {
    /**
     * @return Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate&#39;s expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
     * 
     */
    private final @Nullable Boolean insecureSkipVerification;

    @CustomType.Constructor
    private IntegrationTlsConfig(@CustomType.Parameter("insecureSkipVerification") @Nullable Boolean insecureSkipVerification) {
        this.insecureSkipVerification = insecureSkipVerification;
    }

    /**
     * @return Specifies whether or not API Gateway skips verification that the certificate for an integration endpoint is issued by a [supported certificate authority](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-supported-certificate-authorities-for-http-endpoints.html). This isn’t recommended, but it enables you to use certificates that are signed by private certificate authorities, or certificates that are self-signed. If enabled, API Gateway still performs basic certificate validation, which includes checking the certificate&#39;s expiration date, hostname, and presence of a root certificate authority. Supported only for `HTTP` and `HTTP_PROXY` integrations.
     * 
     */
    public Optional<Boolean> insecureSkipVerification() {
        return Optional.ofNullable(this.insecureSkipVerification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTlsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean insecureSkipVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTlsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insecureSkipVerification = defaults.insecureSkipVerification;
        }

        public Builder insecureSkipVerification(@Nullable Boolean insecureSkipVerification) {
            this.insecureSkipVerification = insecureSkipVerification;
            return this;
        }        public IntegrationTlsConfig build() {
            return new IntegrationTlsConfig(insecureSkipVerification);
        }
    }
}
