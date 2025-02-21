// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs Empty = new ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs();

    /**
     * Whether to delete the volume on termination. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    @Import(name="deleteOnTermination")
    private @Nullable Output<String> deleteOnTermination;

    /**
     * @return Whether to delete the volume on termination. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    public Optional<Output<String>> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }

    /**
     * Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<String> encrypted;

    /**
     * @return Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
     * 
     */
    public Optional<Output<String>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * Number of Input/Output (I/O) operations per second to provision for an `io1` or `io2` volume.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return Number of Input/Output (I/O) operations per second to provision for an `io1` or `io2` volume.
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Identifier of the EC2 Volume Snapshot.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    /**
     * @return Identifier of the EC2 Volume Snapshot.
     * 
     */
    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * Size of the volume, in GiB.
     * 
     */
    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    /**
     * @return Size of the volume, in GiB.
     * 
     */
    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    /**
     * Type of the volume. For example, `gp2` or `io2`.
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    /**
     * @return Type of the volume. For example, `gp2` or `io2`.
     * 
     */
    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs() {}

    private ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs(ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs $) {
        this.deleteOnTermination = $.deleteOnTermination;
        this.encrypted = $.encrypted;
        this.iops = $.iops;
        this.kmsKeyId = $.kmsKeyId;
        this.snapshotId = $.snapshotId;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs $;

        public Builder() {
            $ = new ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs();
        }

        public Builder(ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs defaults) {
            $ = new ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteOnTermination Whether to delete the volume on termination. Defaults to unset, which is the value inherited from the parent image.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnTermination(@Nullable Output<String> deleteOnTermination) {
            $.deleteOnTermination = deleteOnTermination;
            return this;
        }

        /**
         * @param deleteOnTermination Whether to delete the volume on termination. Defaults to unset, which is the value inherited from the parent image.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnTermination(String deleteOnTermination) {
            return deleteOnTermination(Output.of(deleteOnTermination));
        }

        /**
         * @param encrypted Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<String> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(String encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param iops Number of Input/Output (I/O) operations per second to provision for an `io1` or `io2` volume.
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops Number of Input/Output (I/O) operations per second to provision for an `io1` or `io2` volume.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param kmsKeyId Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId Amazon Resource Name (ARN) of the Key Management Service (KMS) Key for encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param snapshotId Identifier of the EC2 Volume Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId Identifier of the EC2 Volume Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param volumeSize Size of the volume, in GiB.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        /**
         * @param volumeSize Size of the volume, in GiB.
         * 
         * @return builder
         * 
         */
        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        /**
         * @param volumeType Type of the volume. For example, `gp2` or `io2`.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType Type of the volume. For example, `gp2` or `io2`.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public ContainerRecipeInstanceConfigurationBlockDeviceMappingEbsArgs build() {
            return $;
        }
    }

}
