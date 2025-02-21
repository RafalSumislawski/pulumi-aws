// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs Empty = new DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs();

    /**
     * The method used to add instances to a replacement environment.
     * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
     * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscaling_groups` to specify the Auto Scaling group.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The method used to add instances to a replacement environment.
     * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
     * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscaling_groups` to specify the Auto Scaling group.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    private DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs() {}

    private DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs(DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs $) {
        this.action = $.action;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs $;

        public Builder() {
            $ = new DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs();
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs defaults) {
            $ = new DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The method used to add instances to a replacement environment.
         * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
         * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscaling_groups` to specify the Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The method used to add instances to a replacement environment.
         * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
         * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscaling_groups` to specify the Auto Scaling group.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        public DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionArgs build() {
            return $;
        }
    }

}
