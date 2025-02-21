// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs;
import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs;
import com.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs;
import com.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowDefinitionState extends com.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionState Empty = new FlowDefinitionState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of your flow definition.
     * 
     */
    @Import(name="flowDefinitionName")
    private @Nullable Output<String> flowDefinitionName;

    /**
     * @return The name of your flow definition.
     * 
     */
    public Optional<Output<String>> flowDefinitionName() {
        return Optional.ofNullable(this.flowDefinitionName);
    }

    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    @Import(name="humanLoopActivationConfig")
    private @Nullable Output<FlowDefinitionHumanLoopActivationConfigArgs> humanLoopActivationConfig;

    /**
     * @return An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    public Optional<Output<FlowDefinitionHumanLoopActivationConfigArgs>> humanLoopActivationConfig() {
        return Optional.ofNullable(this.humanLoopActivationConfig);
    }

    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    @Import(name="humanLoopConfig")
    private @Nullable Output<FlowDefinitionHumanLoopConfigArgs> humanLoopConfig;

    /**
     * @return An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    public Optional<Output<FlowDefinitionHumanLoopConfigArgs>> humanLoopConfig() {
        return Optional.ofNullable(this.humanLoopConfig);
    }

    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    @Import(name="humanLoopRequestSource")
    private @Nullable Output<FlowDefinitionHumanLoopRequestSourceArgs> humanLoopRequestSource;

    /**
     * @return Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    public Optional<Output<FlowDefinitionHumanLoopRequestSourceArgs>> humanLoopRequestSource() {
        return Optional.ofNullable(this.humanLoopRequestSource);
    }

    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    @Import(name="outputConfig")
    private @Nullable Output<FlowDefinitionOutputConfigArgs> outputConfig;

    /**
     * @return An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    public Optional<Output<FlowDefinitionOutputConfigArgs>> outputConfig() {
        return Optional.ofNullable(this.outputConfig);
    }

    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private FlowDefinitionState() {}

    private FlowDefinitionState(FlowDefinitionState $) {
        this.arn = $.arn;
        this.flowDefinitionName = $.flowDefinitionName;
        this.humanLoopActivationConfig = $.humanLoopActivationConfig;
        this.humanLoopConfig = $.humanLoopConfig;
        this.humanLoopRequestSource = $.humanLoopRequestSource;
        this.outputConfig = $.outputConfig;
        this.roleArn = $.roleArn;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDefinitionState $;

        public Builder() {
            $ = new FlowDefinitionState();
        }

        public Builder(FlowDefinitionState defaults) {
            $ = new FlowDefinitionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param flowDefinitionName The name of your flow definition.
         * 
         * @return builder
         * 
         */
        public Builder flowDefinitionName(@Nullable Output<String> flowDefinitionName) {
            $.flowDefinitionName = flowDefinitionName;
            return this;
        }

        /**
         * @param flowDefinitionName The name of your flow definition.
         * 
         * @return builder
         * 
         */
        public Builder flowDefinitionName(String flowDefinitionName) {
            return flowDefinitionName(Output.of(flowDefinitionName));
        }

        /**
         * @param humanLoopActivationConfig An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
         * 
         * @return builder
         * 
         */
        public Builder humanLoopActivationConfig(@Nullable Output<FlowDefinitionHumanLoopActivationConfigArgs> humanLoopActivationConfig) {
            $.humanLoopActivationConfig = humanLoopActivationConfig;
            return this;
        }

        /**
         * @param humanLoopActivationConfig An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
         * 
         * @return builder
         * 
         */
        public Builder humanLoopActivationConfig(FlowDefinitionHumanLoopActivationConfigArgs humanLoopActivationConfig) {
            return humanLoopActivationConfig(Output.of(humanLoopActivationConfig));
        }

        /**
         * @param humanLoopConfig An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
         * 
         * @return builder
         * 
         */
        public Builder humanLoopConfig(@Nullable Output<FlowDefinitionHumanLoopConfigArgs> humanLoopConfig) {
            $.humanLoopConfig = humanLoopConfig;
            return this;
        }

        /**
         * @param humanLoopConfig An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
         * 
         * @return builder
         * 
         */
        public Builder humanLoopConfig(FlowDefinitionHumanLoopConfigArgs humanLoopConfig) {
            return humanLoopConfig(Output.of(humanLoopConfig));
        }

        /**
         * @param humanLoopRequestSource Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
         * 
         * @return builder
         * 
         */
        public Builder humanLoopRequestSource(@Nullable Output<FlowDefinitionHumanLoopRequestSourceArgs> humanLoopRequestSource) {
            $.humanLoopRequestSource = humanLoopRequestSource;
            return this;
        }

        /**
         * @param humanLoopRequestSource Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
         * 
         * @return builder
         * 
         */
        public Builder humanLoopRequestSource(FlowDefinitionHumanLoopRequestSourceArgs humanLoopRequestSource) {
            return humanLoopRequestSource(Output.of(humanLoopRequestSource));
        }

        /**
         * @param outputConfig An object containing information about where the human review results will be uploaded. See Output Config details below.
         * 
         * @return builder
         * 
         */
        public Builder outputConfig(@Nullable Output<FlowDefinitionOutputConfigArgs> outputConfig) {
            $.outputConfig = outputConfig;
            return this;
        }

        /**
         * @param outputConfig An object containing information about where the human review results will be uploaded. See Output Config details below.
         * 
         * @return builder
         * 
         */
        public Builder outputConfig(FlowDefinitionOutputConfigArgs outputConfig) {
            return outputConfig(Output.of(outputConfig));
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public FlowDefinitionState build() {
            return $;
        }
    }

}
