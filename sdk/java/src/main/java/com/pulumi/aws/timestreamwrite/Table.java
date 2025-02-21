// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.timestreamwrite;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.timestreamwrite.TableArgs;
import com.pulumi.aws.timestreamwrite.inputs.TableState;
import com.pulumi.aws.timestreamwrite.outputs.TableMagneticStoreWriteProperties;
import com.pulumi.aws.timestreamwrite.outputs.TableRetentionProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Timestream table resource.
 * 
 * ## Example Usage
 * ### Basic usage
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
 *         var example = new Table(&#34;example&#34;, TableArgs.builder()        
 *             .databaseName(aws_timestreamwrite_database.example().database_name())
 *             .tableName(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Full usage
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
 *         var example = new Table(&#34;example&#34;, TableArgs.builder()        
 *             .databaseName(aws_timestreamwrite_database.example().database_name())
 *             .tableName(&#34;example&#34;)
 *             .retentionProperties(TableRetentionPropertiesArgs.builder()
 *                 .magneticStoreRetentionPeriodInDays(30)
 *                 .memoryStoreRetentionPeriodInHours(8)
 *                 .build())
 *             .tags(Map.of(&#34;Name&#34;, &#34;example-timestream-table&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Timestream tables can be imported using the `table_name` and `database_name` separate by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:timestreamwrite/table:Table example ExampleTable:ExampleDatabase
 * ```
 * 
 */
@ResourceType(type="aws:timestreamwrite/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    /**
     * The ARN that uniquely identifies this table.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN that uniquely identifies this table.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the Timestream database.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the Timestream database.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * 
     */
    @Export(name="magneticStoreWriteProperties", type=TableMagneticStoreWriteProperties.class, parameters={})
    private Output<TableMagneticStoreWriteProperties> magneticStoreWriteProperties;

    /**
     * @return Contains properties to set on the table when enabling magnetic store writes. See Magnetic Store Write Properties below for more details.
     * 
     */
    public Output<TableMagneticStoreWriteProperties> magneticStoreWriteProperties() {
        return this.magneticStoreWriteProperties;
    }
    /**
     * The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magnetic_store_retention_period_in_days` default to 73000 and `memory_store_retention_period_in_hours` defaults to 6.
     * 
     */
    @Export(name="retentionProperties", type=TableRetentionProperties.class, parameters={})
    private Output<TableRetentionProperties> retentionProperties;

    /**
     * @return The retention duration for the memory store and magnetic store. See Retention Properties below for more details. If not provided, `magnetic_store_retention_period_in_days` default to 73000 and `memory_store_retention_period_in_hours` defaults to 6.
     * 
     */
    public Output<TableRetentionProperties> retentionProperties() {
        return this.retentionProperties;
    }
    /**
     * The name of the Timestream table.
     * 
     */
    @Export(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return The name of the Timestream table.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }
    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:timestreamwrite/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Table(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:timestreamwrite/table:Table", name, state, makeResourceOptions(options, id));
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
    public static Table get(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
