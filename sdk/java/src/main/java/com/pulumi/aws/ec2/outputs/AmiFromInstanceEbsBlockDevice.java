// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AmiFromInstanceEbsBlockDevice {
    /**
     * @return Boolean controlling whether the EBS volumes created to
     * support each created instance will be deleted once that instance is terminated.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * @return The path at which the device is exposed to created instances.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * @return Boolean controlling whether the created EBS volumes will be encrypted. Can&#39;t be used with `snapshot_id`.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * @return Number of I/O operations per second the
     * created volumes will support.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * @return The ARN of the Outpost on which the snapshot is stored.
     * 
     */
    private final @Nullable String outpostArn;
    /**
     * @return The id of an EBS snapshot that will be used to initialize the created
     * EBS volumes. If set, the `volume_size` attribute must be at least as large as the referenced
     * snapshot.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * @return The throughput that the EBS volume supports, in MiB/s. Only valid for `volume_type` of `gp3`.
     * 
     */
    private final @Nullable Integer throughput;
    /**
     * @return The size of created volumes in GiB.
     * If `snapshot_id` is set and `volume_size` is omitted then the volume will have the same size
     * as the selected snapshot.
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * @return The type of EBS volume to create. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `standard`).
     * 
     */
    private final @Nullable String volumeType;

    @CustomType.Constructor
    private AmiFromInstanceEbsBlockDevice(
        @CustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("outpostArn") @Nullable String outpostArn,
        @CustomType.Parameter("snapshotId") @Nullable String snapshotId,
        @CustomType.Parameter("throughput") @Nullable Integer throughput,
        @CustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @CustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.outpostArn = outpostArn;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * @return Boolean controlling whether the EBS volumes created to
     * support each created instance will be deleted once that instance is terminated.
     * 
     */
    public Optional<Boolean> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * @return The path at which the device is exposed to created instances.
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Boolean controlling whether the created EBS volumes will be encrypted. Can&#39;t be used with `snapshot_id`.
     * 
     */
    public Optional<Boolean> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * @return Number of I/O operations per second the
     * created volumes will support.
     * 
     */
    public Optional<Integer> iops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * @return The ARN of the Outpost on which the snapshot is stored.
     * 
     */
    public Optional<String> outpostArn() {
        return Optional.ofNullable(this.outpostArn);
    }
    /**
     * @return The id of an EBS snapshot that will be used to initialize the created
     * EBS volumes. If set, the `volume_size` attribute must be at least as large as the referenced
     * snapshot.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * @return The throughput that the EBS volume supports, in MiB/s. Only valid for `volume_type` of `gp3`.
     * 
     */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * @return The size of created volumes in GiB.
     * If `snapshot_id` is set and `volume_size` is omitted then the volume will have the same size
     * as the selected snapshot.
     * 
     */
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * @return The type of EBS volume to create. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `standard`).
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiFromInstanceEbsBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable String deviceName;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String outpostArn;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiFromInstanceEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.outpostArn = defaults.outpostArn;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        public Builder outpostArn(@Nullable String outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }
        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public AmiFromInstanceEbsBlockDevice build() {
            return new AmiFromInstanceEbsBlockDevice(deleteOnTermination, deviceName, encrypted, iops, outpostArn, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
