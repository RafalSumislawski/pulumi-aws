// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker
{
    /// <summary>
    /// Provides a SageMaker App resource.
    /// 
    /// ## Example Usage
    /// ### Basic usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Sagemaker.App("example", new Aws.Sagemaker.AppArgs
    ///         {
    ///             DomainId = aws_sagemaker_domain.Example.Id,
    ///             UserProfileName = aws_sagemaker_user_profile.Example.User_profile_name,
    ///             AppName = "example",
    ///             AppType = "JupyterServer",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// SageMaker Code Apps can be imported using the `id`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:sagemaker/app:App example arn:aws:sagemaker:us-west-2:012345678912:app/domain-id/user-profile-name/app-type/app-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:sagemaker/app:App")]
    public partial class App : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the app.
        /// </summary>
        [Output("appName")]
        public Output<string> AppName { get; private set; } = null!;

        /// <summary>
        /// The type of app. Valid values are `JupyterServer`, `KernelGateway` and `TensorBoard`.
        /// </summary>
        [Output("appType")]
        public Output<string> AppType { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the app.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The domain ID.
        /// </summary>
        [Output("domainId")]
        public Output<string> DomainId { get; private set; } = null!;

        /// <summary>
        /// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        /// </summary>
        [Output("resourceSpec")]
        public Output<Outputs.AppResourceSpec> ResourceSpec { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider .
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The user profile name.
        /// </summary>
        [Output("userProfileName")]
        public Output<string> UserProfileName { get; private set; } = null!;


        /// <summary>
        /// Create a App resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public App(string name, AppArgs args, CustomResourceOptions? options = null)
            : base("aws:sagemaker/app:App", name, args ?? new AppArgs(), MakeResourceOptions(options, ""))
        {
        }

        private App(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
            : base("aws:sagemaker/app:App", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing App resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static App Get(string name, Input<string> id, AppState? state = null, CustomResourceOptions? options = null)
        {
            return new App(name, id, state, options);
        }
    }

    public sealed class AppArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the app.
        /// </summary>
        [Input("appName", required: true)]
        public Input<string> AppName { get; set; } = null!;

        /// <summary>
        /// The type of app. Valid values are `JupyterServer`, `KernelGateway` and `TensorBoard`.
        /// </summary>
        [Input("appType", required: true)]
        public Input<string> AppType { get; set; } = null!;

        /// <summary>
        /// The domain ID.
        /// </summary>
        [Input("domainId", required: true)]
        public Input<string> DomainId { get; set; } = null!;

        /// <summary>
        /// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        /// </summary>
        [Input("resourceSpec")]
        public Input<Inputs.AppResourceSpecArgs>? ResourceSpec { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The user profile name.
        /// </summary>
        [Input("userProfileName", required: true)]
        public Input<string> UserProfileName { get; set; } = null!;

        public AppArgs()
        {
        }
    }

    public sealed class AppState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the app.
        /// </summary>
        [Input("appName")]
        public Input<string>? AppName { get; set; }

        /// <summary>
        /// The type of app. Valid values are `JupyterServer`, `KernelGateway` and `TensorBoard`.
        /// </summary>
        [Input("appType")]
        public Input<string>? AppType { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the app.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The domain ID.
        /// </summary>
        [Input("domainId")]
        public Input<string>? DomainId { get; set; }

        /// <summary>
        /// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        /// </summary>
        [Input("resourceSpec")]
        public Input<Inputs.AppResourceSpecGetArgs>? ResourceSpec { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider .
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The user profile name.
        /// </summary>
        [Input("userProfileName")]
        public Input<string>? UserProfileName { get; set; }

        public AppState()
        {
        }
    }
}
