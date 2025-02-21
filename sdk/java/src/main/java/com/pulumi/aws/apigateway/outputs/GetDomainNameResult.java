// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.aws.apigateway.outputs.GetDomainNameEndpointConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainNameResult {
    /**
     * @return ARN of the found custom domain name.
     * 
     */
    private final String arn;
    /**
     * @return ARN for an AWS-managed certificate that is used by edge-optimized endpoint for this domain name.
     * 
     */
    private final String certificateArn;
    /**
     * @return Name of the certificate that is used by edge-optimized endpoint for this domain name.
     * 
     */
    private final String certificateName;
    /**
     * @return Upload date associated with the domain certificate.
     * 
     */
    private final String certificateUploadDate;
    /**
     * @return Hostname created by Cloudfront to represent the distribution that implements this domain name mapping.
     * 
     */
    private final String cloudfrontDomainName;
    /**
     * @return For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`) that can be used to create a Route53 alias record for the distribution.
     * 
     */
    private final String cloudfrontZoneId;
    private final String domainName;
    /**
     * @return List of objects with the endpoint configuration of this domain name.
     * 
     */
    private final List<GetDomainNameEndpointConfiguration> endpointConfigurations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return ARN for an AWS-managed certificate that is used for validating the regional domain name.
     * 
     */
    private final String regionalCertificateArn;
    /**
     * @return User-friendly name of the certificate that is used by regional endpoint for this domain name.
     * 
     */
    private final String regionalCertificateName;
    /**
     * @return Hostname for the custom domain&#39;s regional endpoint.
     * 
     */
    private final String regionalDomainName;
    /**
     * @return Hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
     * 
     */
    private final String regionalZoneId;
    /**
     * @return Security policy for the domain name.
     * 
     */
    private final String securityPolicy;
    /**
     * @return Key-value map of tags for the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private GetDomainNameResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificateArn") String certificateArn,
        @CustomType.Parameter("certificateName") String certificateName,
        @CustomType.Parameter("certificateUploadDate") String certificateUploadDate,
        @CustomType.Parameter("cloudfrontDomainName") String cloudfrontDomainName,
        @CustomType.Parameter("cloudfrontZoneId") String cloudfrontZoneId,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("endpointConfigurations") List<GetDomainNameEndpointConfiguration> endpointConfigurations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("regionalCertificateArn") String regionalCertificateArn,
        @CustomType.Parameter("regionalCertificateName") String regionalCertificateName,
        @CustomType.Parameter("regionalDomainName") String regionalDomainName,
        @CustomType.Parameter("regionalZoneId") String regionalZoneId,
        @CustomType.Parameter("securityPolicy") String securityPolicy,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.arn = arn;
        this.certificateArn = certificateArn;
        this.certificateName = certificateName;
        this.certificateUploadDate = certificateUploadDate;
        this.cloudfrontDomainName = cloudfrontDomainName;
        this.cloudfrontZoneId = cloudfrontZoneId;
        this.domainName = domainName;
        this.endpointConfigurations = endpointConfigurations;
        this.id = id;
        this.regionalCertificateArn = regionalCertificateArn;
        this.regionalCertificateName = regionalCertificateName;
        this.regionalDomainName = regionalDomainName;
        this.regionalZoneId = regionalZoneId;
        this.securityPolicy = securityPolicy;
        this.tags = tags;
    }

    /**
     * @return ARN of the found custom domain name.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return ARN for an AWS-managed certificate that is used by edge-optimized endpoint for this domain name.
     * 
     */
    public String certificateArn() {
        return this.certificateArn;
    }
    /**
     * @return Name of the certificate that is used by edge-optimized endpoint for this domain name.
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }
    /**
     * @return Upload date associated with the domain certificate.
     * 
     */
    public String certificateUploadDate() {
        return this.certificateUploadDate;
    }
    /**
     * @return Hostname created by Cloudfront to represent the distribution that implements this domain name mapping.
     * 
     */
    public String cloudfrontDomainName() {
        return this.cloudfrontDomainName;
    }
    /**
     * @return For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`) that can be used to create a Route53 alias record for the distribution.
     * 
     */
    public String cloudfrontZoneId() {
        return this.cloudfrontZoneId;
    }
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return List of objects with the endpoint configuration of this domain name.
     * 
     */
    public List<GetDomainNameEndpointConfiguration> endpointConfigurations() {
        return this.endpointConfigurations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ARN for an AWS-managed certificate that is used for validating the regional domain name.
     * 
     */
    public String regionalCertificateArn() {
        return this.regionalCertificateArn;
    }
    /**
     * @return User-friendly name of the certificate that is used by regional endpoint for this domain name.
     * 
     */
    public String regionalCertificateName() {
        return this.regionalCertificateName;
    }
    /**
     * @return Hostname for the custom domain&#39;s regional endpoint.
     * 
     */
    public String regionalDomainName() {
        return this.regionalDomainName;
    }
    /**
     * @return Hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
     * 
     */
    public String regionalZoneId() {
        return this.regionalZoneId;
    }
    /**
     * @return Security policy for the domain name.
     * 
     */
    public String securityPolicy() {
        return this.securityPolicy;
    }
    /**
     * @return Key-value map of tags for the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificateArn;
        private String certificateName;
        private String certificateUploadDate;
        private String cloudfrontDomainName;
        private String cloudfrontZoneId;
        private String domainName;
        private List<GetDomainNameEndpointConfiguration> endpointConfigurations;
        private String id;
        private String regionalCertificateArn;
        private String regionalCertificateName;
        private String regionalDomainName;
        private String regionalZoneId;
        private String securityPolicy;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.certificateName = defaults.certificateName;
    	      this.certificateUploadDate = defaults.certificateUploadDate;
    	      this.cloudfrontDomainName = defaults.cloudfrontDomainName;
    	      this.cloudfrontZoneId = defaults.cloudfrontZoneId;
    	      this.domainName = defaults.domainName;
    	      this.endpointConfigurations = defaults.endpointConfigurations;
    	      this.id = defaults.id;
    	      this.regionalCertificateArn = defaults.regionalCertificateArn;
    	      this.regionalCertificateName = defaults.regionalCertificateName;
    	      this.regionalDomainName = defaults.regionalDomainName;
    	      this.regionalZoneId = defaults.regionalZoneId;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        public Builder certificateName(String certificateName) {
            this.certificateName = Objects.requireNonNull(certificateName);
            return this;
        }
        public Builder certificateUploadDate(String certificateUploadDate) {
            this.certificateUploadDate = Objects.requireNonNull(certificateUploadDate);
            return this;
        }
        public Builder cloudfrontDomainName(String cloudfrontDomainName) {
            this.cloudfrontDomainName = Objects.requireNonNull(cloudfrontDomainName);
            return this;
        }
        public Builder cloudfrontZoneId(String cloudfrontZoneId) {
            this.cloudfrontZoneId = Objects.requireNonNull(cloudfrontZoneId);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder endpointConfigurations(List<GetDomainNameEndpointConfiguration> endpointConfigurations) {
            this.endpointConfigurations = Objects.requireNonNull(endpointConfigurations);
            return this;
        }
        public Builder endpointConfigurations(GetDomainNameEndpointConfiguration... endpointConfigurations) {
            return endpointConfigurations(List.of(endpointConfigurations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder regionalCertificateArn(String regionalCertificateArn) {
            this.regionalCertificateArn = Objects.requireNonNull(regionalCertificateArn);
            return this;
        }
        public Builder regionalCertificateName(String regionalCertificateName) {
            this.regionalCertificateName = Objects.requireNonNull(regionalCertificateName);
            return this;
        }
        public Builder regionalDomainName(String regionalDomainName) {
            this.regionalDomainName = Objects.requireNonNull(regionalDomainName);
            return this;
        }
        public Builder regionalZoneId(String regionalZoneId) {
            this.regionalZoneId = Objects.requireNonNull(regionalZoneId);
            return this;
        }
        public Builder securityPolicy(String securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetDomainNameResult build() {
            return new GetDomainNameResult(arn, certificateArn, certificateName, certificateUploadDate, cloudfrontDomainName, cloudfrontZoneId, domainName, endpointConfigurations, id, regionalCertificateArn, regionalCertificateName, regionalDomainName, regionalZoneId, securityPolicy, tags);
        }
    }
}
