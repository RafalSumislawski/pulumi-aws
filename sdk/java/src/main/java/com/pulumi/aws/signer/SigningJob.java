// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.signer.SigningJobArgs;
import com.pulumi.aws.signer.inputs.SigningJobState;
import com.pulumi.aws.signer.outputs.SigningJobDestination;
import com.pulumi.aws.signer.outputs.SigningJobRevocationRecord;
import com.pulumi.aws.signer.outputs.SigningJobSignedObject;
import com.pulumi.aws.signer.outputs.SigningJobSource;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a Signer Signing Job.
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
 *         var testSp = new SigningProfile(&#34;testSp&#34;, SigningProfileArgs.builder()        
 *             .platformId(&#34;AWSLambda-SHA384-ECDSA&#34;)
 *             .build());
 * 
 *         var buildSigningJob = new SigningJob(&#34;buildSigningJob&#34;, SigningJobArgs.builder()        
 *             .profileName(testSp.name())
 *             .source(SigningJobSourceArgs.builder()
 *                 .s3(SigningJobSourceS3Args.builder()
 *                     .bucket(&#34;s3-bucket-name&#34;)
 *                     .key(&#34;object-to-be-signed.zip&#34;)
 *                     .version(&#34;jADjFYYYEXAMPLETszPjOmCMFDzd9dN1&#34;)
 *                     .build())
 *                 .build())
 *             .destination(SigningJobDestinationArgs.builder()
 *                 .s3(SigningJobDestinationS3Args.builder()
 *                     .bucket(&#34;s3-bucket-name&#34;)
 *                     .prefix(&#34;signed/&#34;)
 *                     .build())
 *                 .build())
 *             .ignoreSigningJobFailure(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Signer signing jobs can be imported using the `job_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:signer/signingJob:SigningJob test_signer_signing_job 9ed7e5c3-b8d4-4da0-8459-44e0b068f7ee
 * ```
 * 
 */
@ResourceType(type="aws:signer/signingJob:SigningJob")
public class SigningJob extends com.pulumi.resources.CustomResource {
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
     * 
     */
    @Export(name="completedAt", type=String.class, parameters={})
    private Output<String> completedAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
     * 
     */
    public Output<String> completedAt() {
        return this.completedAt;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The S3 bucket in which to save your signed object. See Destination below for details.
     * 
     */
    @Export(name="destination", type=SigningJobDestination.class, parameters={})
    private Output<SigningJobDestination> destination;

    /**
     * @return The S3 bucket in which to save your signed object. See Destination below for details.
     * 
     */
    public Output<SigningJobDestination> destination() {
        return this.destination;
    }
    /**
     * Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
     * 
     */
    @Export(name="ignoreSigningJobFailure", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreSigningJobFailure;

    /**
     * @return Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
     * 
     */
    public Output<Optional<Boolean>> ignoreSigningJobFailure() {
        return Codegen.optional(this.ignoreSigningJobFailure);
    }
    /**
     * The ID of the signing job on output.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return The ID of the signing job on output.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * The IAM entity that initiated the signing job.
     * 
     */
    @Export(name="jobInvoker", type=String.class, parameters={})
    private Output<String> jobInvoker;

    /**
     * @return The IAM entity that initiated the signing job.
     * 
     */
    public Output<String> jobInvoker() {
        return this.jobInvoker;
    }
    /**
     * The AWS account ID of the job owner.
     * 
     */
    @Export(name="jobOwner", type=String.class, parameters={})
    private Output<String> jobOwner;

    /**
     * @return The AWS account ID of the job owner.
     * 
     */
    public Output<String> jobOwner() {
        return this.jobOwner;
    }
    /**
     * A human-readable name for the signing platform associated with the signing job.
     * 
     */
    @Export(name="platformDisplayName", type=String.class, parameters={})
    private Output<String> platformDisplayName;

    /**
     * @return A human-readable name for the signing platform associated with the signing job.
     * 
     */
    public Output<String> platformDisplayName() {
        return this.platformDisplayName;
    }
    /**
     * The platform to which your signed code image will be distributed.
     * 
     */
    @Export(name="platformId", type=String.class, parameters={})
    private Output<String> platformId;

    /**
     * @return The platform to which your signed code image will be distributed.
     * 
     */
    public Output<String> platformId() {
        return this.platformId;
    }
    /**
     * The name of the profile to initiate the signing operation.
     * 
     */
    @Export(name="profileName", type=String.class, parameters={})
    private Output<String> profileName;

    /**
     * @return The name of the profile to initiate the signing operation.
     * 
     */
    public Output<String> profileName() {
        return this.profileName;
    }
    /**
     * The version of the signing profile used to initiate the signing job.
     * 
     */
    @Export(name="profileVersion", type=String.class, parameters={})
    private Output<String> profileVersion;

    /**
     * @return The version of the signing profile used to initiate the signing job.
     * 
     */
    public Output<String> profileVersion() {
        return this.profileVersion;
    }
    /**
     * The IAM principal that requested the signing job.
     * 
     */
    @Export(name="requestedBy", type=String.class, parameters={})
    private Output<String> requestedBy;

    /**
     * @return The IAM principal that requested the signing job.
     * 
     */
    public Output<String> requestedBy() {
        return this.requestedBy;
    }
    /**
     * A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
     * 
     */
    @Export(name="revocationRecords", type=List.class, parameters={SigningJobRevocationRecord.class})
    private Output<List<SigningJobRevocationRecord>> revocationRecords;

    /**
     * @return A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
     * 
     */
    public Output<List<SigningJobRevocationRecord>> revocationRecords() {
        return this.revocationRecords;
    }
    /**
     * The time when the signature of a signing job expires.
     * 
     */
    @Export(name="signatureExpiresAt", type=String.class, parameters={})
    private Output<String> signatureExpiresAt;

    /**
     * @return The time when the signature of a signing job expires.
     * 
     */
    public Output<String> signatureExpiresAt() {
        return this.signatureExpiresAt;
    }
    /**
     * Name of the S3 bucket where the signed code image is saved by code signing.
     * 
     */
    @Export(name="signedObjects", type=List.class, parameters={SigningJobSignedObject.class})
    private Output<List<SigningJobSignedObject>> signedObjects;

    /**
     * @return Name of the S3 bucket where the signed code image is saved by code signing.
     * 
     */
    public Output<List<SigningJobSignedObject>> signedObjects() {
        return this.signedObjects;
    }
    /**
     * The S3 bucket that contains the object to sign. See Source below for details.
     * 
     */
    @Export(name="source", type=SigningJobSource.class, parameters={})
    private Output<SigningJobSource> source;

    /**
     * @return The S3 bucket that contains the object to sign. See Source below for details.
     * 
     */
    public Output<SigningJobSource> source() {
        return this.source;
    }
    /**
     * Status of the signing job.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the signing job.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * String value that contains the status reason.
     * 
     */
    @Export(name="statusReason", type=String.class, parameters={})
    private Output<String> statusReason;

    /**
     * @return String value that contains the status reason.
     * 
     */
    public Output<String> statusReason() {
        return this.statusReason;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SigningJob(String name) {
        this(name, SigningJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SigningJob(String name, SigningJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SigningJob(String name, SigningJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingJob:SigningJob", name, args == null ? SigningJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SigningJob(String name, Output<String> id, @Nullable SigningJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingJob:SigningJob", name, state, makeResourceOptions(options, id));
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
    public static SigningJob get(String name, Output<String> id, @Nullable SigningJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SigningJob(name, id, state, options);
    }
}
