// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VolumeAttachmentArgs;
import com.pulumi.aws.ec2.inputs.VolumeAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS EBS Volume Attachment as a top level resource, to attach and
 * detach volumes from AWS Instances.
 * 
 * &gt; **NOTE on EBS block devices:** If you use `ebs_block_device` on an `aws.ec2.Instance`, this provider will assume management over the full set of non-root EBS block devices for the instance, and treats additional block devices as drift. For this reason, `ebs_block_device` cannot be mixed with external `aws.ebs.Volume` + `aws.ec2.VolumeAttachment` resources for a given instance.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web = new Instance(&#34;web&#34;, InstanceArgs.builder()        
 *             .ami(&#34;ami-21f78e11&#34;)
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .instanceType(&#34;t2.micro&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;HelloWorld&#34;))
 *             .build());
 * 
 *         var example = new Volume(&#34;example&#34;, VolumeArgs.builder()        
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .size(1)
 *             .build());
 * 
 *         var ebsAtt = new VolumeAttachment(&#34;ebsAtt&#34;, VolumeAttachmentArgs.builder()        
 *             .deviceName(&#34;/dev/sdh&#34;)
 *             .volumeId(example.id())
 *             .instanceId(web.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * EBS Volume Attachments can be imported using `DEVICE_NAME:VOLUME_ID:INSTANCE_ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/volumeAttachment:VolumeAttachment example /dev/sdh:vol-049df61146c4d7901:i-12345678
 * ```
 * 
 *  [1]https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names [2]https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names [3]https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html
 * 
 */
@ResourceType(type="aws:ec2/volumeAttachment:VolumeAttachment")
public class VolumeAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The device name to expose to the instance (for
     * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
     * 
     */
    @Export(name="deviceName", type=String.class, parameters={})
    private Output<String> deviceName;

    /**
     * @return The device name to expose to the instance (for
     * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }
    /**
     * Set to `true` if you want to force the
     * volume to detach. Useful if previous attempts failed, but use this option only
     * as a last resort, as this can result in **data loss**. See
     * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
     * 
     */
    @Export(name="forceDetach", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDetach;

    /**
     * @return Set to `true` if you want to force the
     * volume to detach. Useful if previous attempts failed, but use this option only
     * as a last resort, as this can result in **data loss**. See
     * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
     * 
     */
    public Output<Optional<Boolean>> forceDetach() {
        return Codegen.optional(this.forceDetach);
    }
    /**
     * ID of the Instance to attach to
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return ID of the Instance to attach to
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Set this to true if you do not wish
     * to detach the volume from the instance to which it is attached at destroy
     * time, and instead just remove the attachment from this provider state. This is
     * useful when destroying an instance which has volumes created by some other
     * means attached.
     * 
     */
    @Export(name="skipDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipDestroy;

    /**
     * @return Set this to true if you do not wish
     * to detach the volume from the instance to which it is attached at destroy
     * time, and instead just remove the attachment from this provider state. This is
     * useful when destroying an instance which has volumes created by some other
     * means attached.
     * 
     */
    public Output<Optional<Boolean>> skipDestroy() {
        return Codegen.optional(this.skipDestroy);
    }
    /**
     * Set this to true to ensure that the target instance is stopped
     * before trying to detach the volume. Stops the instance, if it is not already stopped.
     * 
     */
    @Export(name="stopInstanceBeforeDetaching", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> stopInstanceBeforeDetaching;

    /**
     * @return Set this to true to ensure that the target instance is stopped
     * before trying to detach the volume. Stops the instance, if it is not already stopped.
     * 
     */
    public Output<Optional<Boolean>> stopInstanceBeforeDetaching() {
        return Codegen.optional(this.stopInstanceBeforeDetaching);
    }
    /**
     * ID of the Volume to be attached
     * 
     */
    @Export(name="volumeId", type=String.class, parameters={})
    private Output<String> volumeId;

    /**
     * @return ID of the Volume to be attached
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeAttachment(String name) {
        this(name, VolumeAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/volumeAttachment:VolumeAttachment", name, args == null ? VolumeAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeAttachment(String name, Output<String> id, @Nullable VolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/volumeAttachment:VolumeAttachment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VolumeAttachment get(String name, Output<String> id, @Nullable VolumeAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeAttachment(name, id, state, options);
    }
}
