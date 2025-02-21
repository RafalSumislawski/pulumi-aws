// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketNotificationArgs;
import com.pulumi.aws.s3.inputs.BucketNotificationState;
import com.pulumi.aws.s3.outputs.BucketNotificationLambdaFunction;
import com.pulumi.aws.s3.outputs.BucketNotificationQueue;
import com.pulumi.aws.s3.outputs.BucketNotificationTopic;
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
 * Manages a S3 Bucket Notification Configuration. For additional information, see the [Configuring S3 Event Notifications section in the Amazon S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).
 * 
 * &gt; **NOTE:** S3 Buckets only support a single notification configuration. Declaring multiple `aws.s3.BucketNotification` resources to the same S3 Bucket will cause a perpetual difference in configuration. See the example &#34;Trigger multiple Lambda functions&#34; for an option.
 * 
 * ## Example Usage
 * ### Add notification configuration to SNS Topic
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
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var topic = new Topic(&#34;topic&#34;, TopicArgs.builder()        
 *             .policy(bucket.arn().apply(arn -&gt; &#34;&#34;&#34;
 * {
 *     &#34;Version&#34;:&#34;2012-10-17&#34;,
 *     &#34;Statement&#34;:[{
 *         &#34;Effect&#34;: &#34;Allow&#34;,
 *         &#34;Principal&#34;: { &#34;Service&#34;: &#34;s3.amazonaws.com&#34; },
 *         &#34;Action&#34;: &#34;SNS:Publish&#34;,
 *         &#34;Resource&#34;: &#34;arn:aws:sns:*:*:s3-event-notification-topic&#34;,
 *         &#34;Condition&#34;:{
 *             &#34;ArnLike&#34;:{&#34;aws:SourceArn&#34;:&#34;%s&#34;}
 *         }
 *     }]
 * }
 * &#34;, arn)))
 *             .build());
 * 
 *         var bucketNotification = new BucketNotification(&#34;bucketNotification&#34;, BucketNotificationArgs.builder()        
 *             .bucket(bucket.id())
 *             .topics(BucketNotificationTopicArgs.builder()
 *                 .topicArn(topic.arn())
 *                 .events(&#34;s3:ObjectCreated:*&#34;)
 *                 .filterSuffix(&#34;.log&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Add notification configuration to SQS Queue
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
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .policy(bucket.arn().apply(arn -&gt; &#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Principal&#34;: &#34;*&#34;,
 *       &#34;Action&#34;: &#34;sqs:SendMessage&#34;,
 * 	  &#34;Resource&#34;: &#34;arn:aws:sqs:*:*:s3-event-notification-queue&#34;,
 *       &#34;Condition&#34;: {
 *         &#34;ArnEquals&#34;: { &#34;aws:SourceArn&#34;: &#34;%s&#34; }
 *       }
 *     }
 *   ]
 * }
 * &#34;, arn)))
 *             .build());
 * 
 *         var bucketNotification = new BucketNotification(&#34;bucketNotification&#34;, BucketNotificationArgs.builder()        
 *             .bucket(bucket.id())
 *             .queues(BucketNotificationQueueArgs.builder()
 *                 .queueArn(queue.arn())
 *                 .events(&#34;s3:ObjectCreated:*&#34;)
 *                 .filterSuffix(&#34;.log&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Add notification configuration to Lambda Function
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.resources.CustomResourceOptions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var iamForLambda = new Role(&#34;iamForLambda&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;lambda.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var func = new Function(&#34;func&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;your-function.zip&#34;))
 *             .role(iamForLambda.arn())
 *             .handler(&#34;exports.example&#34;)
 *             .runtime(&#34;go1.x&#34;)
 *             .build());
 * 
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var allowBucket = new Permission(&#34;allowBucket&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(func.arn())
 *             .principal(&#34;s3.amazonaws.com&#34;)
 *             .sourceArn(bucket.arn())
 *             .build());
 * 
 *         var bucketNotification = new BucketNotification(&#34;bucketNotification&#34;, BucketNotificationArgs.builder()        
 *             .bucket(bucket.id())
 *             .lambdaFunctions(BucketNotificationLambdaFunctionArgs.builder()
 *                 .lambdaFunctionArn(func.arn())
 *                 .events(&#34;s3:ObjectCreated:*&#34;)
 *                 .filterPrefix(&#34;AWSLogs/&#34;)
 *                 .filterSuffix(&#34;.log&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(allowBucket)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Trigger multiple Lambda functions
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.resources.CustomResourceOptions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var iamForLambda = new Role(&#34;iamForLambda&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;lambda.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var func1 = new Function(&#34;func1&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;your-function1.zip&#34;))
 *             .role(iamForLambda.arn())
 *             .handler(&#34;exports.example&#34;)
 *             .runtime(&#34;go1.x&#34;)
 *             .build());
 * 
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var allowBucket1 = new Permission(&#34;allowBucket1&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(func1.arn())
 *             .principal(&#34;s3.amazonaws.com&#34;)
 *             .sourceArn(bucket.arn())
 *             .build());
 * 
 *         var func2 = new Function(&#34;func2&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;your-function2.zip&#34;))
 *             .role(iamForLambda.arn())
 *             .handler(&#34;exports.example&#34;)
 *             .build());
 * 
 *         var allowBucket2 = new Permission(&#34;allowBucket2&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(func2.arn())
 *             .principal(&#34;s3.amazonaws.com&#34;)
 *             .sourceArn(bucket.arn())
 *             .build());
 * 
 *         var bucketNotification = new BucketNotification(&#34;bucketNotification&#34;, BucketNotificationArgs.builder()        
 *             .bucket(bucket.id())
 *             .lambdaFunctions(            
 *                 BucketNotificationLambdaFunctionArgs.builder()
 *                     .lambdaFunctionArn(func1.arn())
 *                     .events(&#34;s3:ObjectCreated:*&#34;)
 *                     .filterPrefix(&#34;AWSLogs/&#34;)
 *                     .filterSuffix(&#34;.log&#34;)
 *                     .build(),
 *                 BucketNotificationLambdaFunctionArgs.builder()
 *                     .lambdaFunctionArn(func2.arn())
 *                     .events(&#34;s3:ObjectCreated:*&#34;)
 *                     .filterPrefix(&#34;OtherLogs/&#34;)
 *                     .filterSuffix(&#34;.log&#34;)
 *                     .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     allowBucket1,
 *                     allowBucket2)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Add multiple notification configurations to SQS Queue
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
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .policy(bucket.arn().apply(arn -&gt; &#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Principal&#34;: &#34;*&#34;,
 *       &#34;Action&#34;: &#34;sqs:SendMessage&#34;,
 * 	  &#34;Resource&#34;: &#34;arn:aws:sqs:*:*:s3-event-notification-queue&#34;,
 *       &#34;Condition&#34;: {
 *         &#34;ArnEquals&#34;: { &#34;aws:SourceArn&#34;: &#34;%s&#34; }
 *       }
 *     }
 *   ]
 * }
 * &#34;, arn)))
 *             .build());
 * 
 *         var bucketNotification = new BucketNotification(&#34;bucketNotification&#34;, BucketNotificationArgs.builder()        
 *             .bucket(bucket.id())
 *             .queues(            
 *                 BucketNotificationQueueArgs.builder()
 *                     .id(&#34;image-upload-event&#34;)
 *                     .queueArn(queue.arn())
 *                     .events(&#34;s3:ObjectCreated:*&#34;)
 *                     .filterPrefix(&#34;images/&#34;)
 *                     .build(),
 *                 BucketNotificationQueueArgs.builder()
 *                     .id(&#34;video-upload-event&#34;)
 *                     .queueArn(queue.arn())
 *                     .events(&#34;s3:ObjectCreated:*&#34;)
 *                     .filterPrefix(&#34;videos/&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * S3 bucket notification can be imported using the `bucket`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketNotification:BucketNotification bucket_notification bucket-name
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketNotification:BucketNotification")
public class BucketNotification extends com.pulumi.resources.CustomResource {
    /**
     * Name of the bucket for notification configuration.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return Name of the bucket for notification configuration.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Whether to enable Amazon EventBridge notifications.
     * 
     */
    @Export(name="eventbridge", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> eventbridge;

    /**
     * @return Whether to enable Amazon EventBridge notifications.
     * 
     */
    public Output<Optional<Boolean>> eventbridge() {
        return Codegen.optional(this.eventbridge);
    }
    /**
     * Used to configure notifications to a Lambda Function. See below.
     * 
     */
    @Export(name="lambdaFunctions", type=List.class, parameters={BucketNotificationLambdaFunction.class})
    private Output</* @Nullable */ List<BucketNotificationLambdaFunction>> lambdaFunctions;

    /**
     * @return Used to configure notifications to a Lambda Function. See below.
     * 
     */
    public Output<Optional<List<BucketNotificationLambdaFunction>>> lambdaFunctions() {
        return Codegen.optional(this.lambdaFunctions);
    }
    /**
     * Notification configuration to SQS Queue. See below.
     * 
     */
    @Export(name="queues", type=List.class, parameters={BucketNotificationQueue.class})
    private Output</* @Nullable */ List<BucketNotificationQueue>> queues;

    /**
     * @return Notification configuration to SQS Queue. See below.
     * 
     */
    public Output<Optional<List<BucketNotificationQueue>>> queues() {
        return Codegen.optional(this.queues);
    }
    /**
     * Notification configuration to SNS Topic. See below.
     * 
     */
    @Export(name="topics", type=List.class, parameters={BucketNotificationTopic.class})
    private Output</* @Nullable */ List<BucketNotificationTopic>> topics;

    /**
     * @return Notification configuration to SNS Topic. See below.
     * 
     */
    public Output<Optional<List<BucketNotificationTopic>>> topics() {
        return Codegen.optional(this.topics);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketNotification(String name) {
        this(name, BucketNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketNotification(String name, BucketNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketNotification(String name, BucketNotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketNotification:BucketNotification", name, args == null ? BucketNotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketNotification(String name, Output<String> id, @Nullable BucketNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketNotification:BucketNotification", name, state, makeResourceOptions(options, id));
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
    public static BucketNotification get(String name, Output<String> id, @Nullable BucketNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketNotification(name, id, state, options);
    }
}
