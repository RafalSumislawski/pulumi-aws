// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCoreNetworkPolicyDocumentCoreNetworkConfiguration {
    /**
     * @return List of strings containing Autonomous System Numbers (ASNs) to assign to Core Network Edges. By default, the core network automatically assigns an ASN for each Core Network Edge but you can optionally define the ASN in the edge-locations for each Region. The ASN uses an array of integer ranges only from `64512` to `65534` and `4200000000` to `4294967294` expressed as a string like `&#34;64512-65534&#34;`. No other ASN ranges can be used.
     * 
     */
    private final List<String> asnRanges;
    /**
     * @return A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
     * 
     */
    private final List<GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation> edgeLocations;
    /**
     * @return The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
     * 
     */
    private final @Nullable List<String> insideCidrBlocks;
    /**
     * @return Indicates whether the core network forwards traffic over multiple equal-cost routes using VPN. The value can be either `true` or `false`. The default is `true`.
     * 
     */
    private final @Nullable Boolean vpnEcmpSupport;

    @CustomType.Constructor
    private GetCoreNetworkPolicyDocumentCoreNetworkConfiguration(
        @CustomType.Parameter("asnRanges") List<String> asnRanges,
        @CustomType.Parameter("edgeLocations") List<GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation> edgeLocations,
        @CustomType.Parameter("insideCidrBlocks") @Nullable List<String> insideCidrBlocks,
        @CustomType.Parameter("vpnEcmpSupport") @Nullable Boolean vpnEcmpSupport) {
        this.asnRanges = asnRanges;
        this.edgeLocations = edgeLocations;
        this.insideCidrBlocks = insideCidrBlocks;
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    /**
     * @return List of strings containing Autonomous System Numbers (ASNs) to assign to Core Network Edges. By default, the core network automatically assigns an ASN for each Core Network Edge but you can optionally define the ASN in the edge-locations for each Region. The ASN uses an array of integer ranges only from `64512` to `65534` and `4200000000` to `4294967294` expressed as a string like `&#34;64512-65534&#34;`. No other ASN ranges can be used.
     * 
     */
    public List<String> asnRanges() {
        return this.asnRanges;
    }
    /**
     * @return A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
     * 
     */
    public List<GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation> edgeLocations() {
        return this.edgeLocations;
    }
    /**
     * @return The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
     * 
     */
    public List<String> insideCidrBlocks() {
        return this.insideCidrBlocks == null ? List.of() : this.insideCidrBlocks;
    }
    /**
     * @return Indicates whether the core network forwards traffic over multiple equal-cost routes using VPN. The value can be either `true` or `false`. The default is `true`.
     * 
     */
    public Optional<Boolean> vpnEcmpSupport() {
        return Optional.ofNullable(this.vpnEcmpSupport);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoreNetworkPolicyDocumentCoreNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> asnRanges;
        private List<GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation> edgeLocations;
        private @Nullable List<String> insideCidrBlocks;
        private @Nullable Boolean vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoreNetworkPolicyDocumentCoreNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asnRanges = defaults.asnRanges;
    	      this.edgeLocations = defaults.edgeLocations;
    	      this.insideCidrBlocks = defaults.insideCidrBlocks;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder asnRanges(List<String> asnRanges) {
            this.asnRanges = Objects.requireNonNull(asnRanges);
            return this;
        }
        public Builder asnRanges(String... asnRanges) {
            return asnRanges(List.of(asnRanges));
        }
        public Builder edgeLocations(List<GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation> edgeLocations) {
            this.edgeLocations = Objects.requireNonNull(edgeLocations);
            return this;
        }
        public Builder edgeLocations(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocation... edgeLocations) {
            return edgeLocations(List.of(edgeLocations));
        }
        public Builder insideCidrBlocks(@Nullable List<String> insideCidrBlocks) {
            this.insideCidrBlocks = insideCidrBlocks;
            return this;
        }
        public Builder insideCidrBlocks(String... insideCidrBlocks) {
            return insideCidrBlocks(List.of(insideCidrBlocks));
        }
        public Builder vpnEcmpSupport(@Nullable Boolean vpnEcmpSupport) {
            this.vpnEcmpSupport = vpnEcmpSupport;
            return this;
        }        public GetCoreNetworkPolicyDocumentCoreNetworkConfiguration build() {
            return new GetCoreNetworkPolicyDocumentCoreNetworkConfiguration(asnRanges, edgeLocations, insideCidrBlocks, vpnEcmpSupport);
        }
    }
}
