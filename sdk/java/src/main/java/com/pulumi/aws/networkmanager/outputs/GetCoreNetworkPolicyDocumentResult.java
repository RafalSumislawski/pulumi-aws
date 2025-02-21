// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentAttachmentPolicy;
import com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentCoreNetworkConfiguration;
import com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentSegment;
import com.pulumi.aws.networkmanager.outputs.GetCoreNetworkPolicyDocumentSegmentAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCoreNetworkPolicyDocumentResult {
    private final @Nullable List<GetCoreNetworkPolicyDocumentAttachmentPolicy> attachmentPolicies;
    private final List<GetCoreNetworkPolicyDocumentCoreNetworkConfiguration> coreNetworkConfigurations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Standard JSON policy document rendered based on the arguments above.
     * 
     */
    private final String json;
    private final @Nullable List<GetCoreNetworkPolicyDocumentSegmentAction> segmentActions;
    private final List<GetCoreNetworkPolicyDocumentSegment> segments;
    private final @Nullable String version;

    @CustomType.Constructor
    private GetCoreNetworkPolicyDocumentResult(
        @CustomType.Parameter("attachmentPolicies") @Nullable List<GetCoreNetworkPolicyDocumentAttachmentPolicy> attachmentPolicies,
        @CustomType.Parameter("coreNetworkConfigurations") List<GetCoreNetworkPolicyDocumentCoreNetworkConfiguration> coreNetworkConfigurations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("json") String json,
        @CustomType.Parameter("segmentActions") @Nullable List<GetCoreNetworkPolicyDocumentSegmentAction> segmentActions,
        @CustomType.Parameter("segments") List<GetCoreNetworkPolicyDocumentSegment> segments,
        @CustomType.Parameter("version") @Nullable String version) {
        this.attachmentPolicies = attachmentPolicies;
        this.coreNetworkConfigurations = coreNetworkConfigurations;
        this.id = id;
        this.json = json;
        this.segmentActions = segmentActions;
        this.segments = segments;
        this.version = version;
    }

    public List<GetCoreNetworkPolicyDocumentAttachmentPolicy> attachmentPolicies() {
        return this.attachmentPolicies == null ? List.of() : this.attachmentPolicies;
    }
    public List<GetCoreNetworkPolicyDocumentCoreNetworkConfiguration> coreNetworkConfigurations() {
        return this.coreNetworkConfigurations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Standard JSON policy document rendered based on the arguments above.
     * 
     */
    public String json() {
        return this.json;
    }
    public List<GetCoreNetworkPolicyDocumentSegmentAction> segmentActions() {
        return this.segmentActions == null ? List.of() : this.segmentActions;
    }
    public List<GetCoreNetworkPolicyDocumentSegment> segments() {
        return this.segments;
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoreNetworkPolicyDocumentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetCoreNetworkPolicyDocumentAttachmentPolicy> attachmentPolicies;
        private List<GetCoreNetworkPolicyDocumentCoreNetworkConfiguration> coreNetworkConfigurations;
        private String id;
        private String json;
        private @Nullable List<GetCoreNetworkPolicyDocumentSegmentAction> segmentActions;
        private List<GetCoreNetworkPolicyDocumentSegment> segments;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoreNetworkPolicyDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentPolicies = defaults.attachmentPolicies;
    	      this.coreNetworkConfigurations = defaults.coreNetworkConfigurations;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.segmentActions = defaults.segmentActions;
    	      this.segments = defaults.segments;
    	      this.version = defaults.version;
        }

        public Builder attachmentPolicies(@Nullable List<GetCoreNetworkPolicyDocumentAttachmentPolicy> attachmentPolicies) {
            this.attachmentPolicies = attachmentPolicies;
            return this;
        }
        public Builder attachmentPolicies(GetCoreNetworkPolicyDocumentAttachmentPolicy... attachmentPolicies) {
            return attachmentPolicies(List.of(attachmentPolicies));
        }
        public Builder coreNetworkConfigurations(List<GetCoreNetworkPolicyDocumentCoreNetworkConfiguration> coreNetworkConfigurations) {
            this.coreNetworkConfigurations = Objects.requireNonNull(coreNetworkConfigurations);
            return this;
        }
        public Builder coreNetworkConfigurations(GetCoreNetworkPolicyDocumentCoreNetworkConfiguration... coreNetworkConfigurations) {
            return coreNetworkConfigurations(List.of(coreNetworkConfigurations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder json(String json) {
            this.json = Objects.requireNonNull(json);
            return this;
        }
        public Builder segmentActions(@Nullable List<GetCoreNetworkPolicyDocumentSegmentAction> segmentActions) {
            this.segmentActions = segmentActions;
            return this;
        }
        public Builder segmentActions(GetCoreNetworkPolicyDocumentSegmentAction... segmentActions) {
            return segmentActions(List.of(segmentActions));
        }
        public Builder segments(List<GetCoreNetworkPolicyDocumentSegment> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }
        public Builder segments(GetCoreNetworkPolicyDocumentSegment... segments) {
            return segments(List.of(segments));
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetCoreNetworkPolicyDocumentResult build() {
            return new GetCoreNetworkPolicyDocumentResult(attachmentPolicies, coreNetworkConfigurations, id, json, segmentActions, segments, version);
        }
    }
}
