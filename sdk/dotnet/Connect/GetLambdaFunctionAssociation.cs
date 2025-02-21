// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect
{
    public static class GetLambdaFunctionAssociation
    {
        /// <summary>
        /// Provides details about a specific Connect Lambda Function Association.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Connect.GetLambdaFunctionAssociation.InvokeAsync(new Aws.Connect.GetLambdaFunctionAssociationArgs
        ///         {
        ///             FunctionArn = "arn:aws:lambda:us-west-2:123456789123:function:abcdefg",
        ///             InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLambdaFunctionAssociationResult> InvokeAsync(GetLambdaFunctionAssociationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLambdaFunctionAssociationResult>("aws:connect/getLambdaFunctionAssociation:getLambdaFunctionAssociation", args ?? new GetLambdaFunctionAssociationArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Connect Lambda Function Association.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Aws.Connect.GetLambdaFunctionAssociation.InvokeAsync(new Aws.Connect.GetLambdaFunctionAssociationArgs
        ///         {
        ///             FunctionArn = "arn:aws:lambda:us-west-2:123456789123:function:abcdefg",
        ///             InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLambdaFunctionAssociationResult> Invoke(GetLambdaFunctionAssociationInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetLambdaFunctionAssociationResult>("aws:connect/getLambdaFunctionAssociation:getLambdaFunctionAssociation", args ?? new GetLambdaFunctionAssociationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLambdaFunctionAssociationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
        /// </summary>
        [Input("functionArn", required: true)]
        public string FunctionArn { get; set; } = null!;

        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        public GetLambdaFunctionAssociationArgs()
        {
        }
    }

    public sealed class GetLambdaFunctionAssociationInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
        /// </summary>
        [Input("functionArn", required: true)]
        public Input<string> FunctionArn { get; set; } = null!;

        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public GetLambdaFunctionAssociationInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetLambdaFunctionAssociationResult
    {
        public readonly string FunctionArn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceId;

        [OutputConstructor]
        private GetLambdaFunctionAssociationResult(
            string functionArn,

            string id,

            string instanceId)
        {
            FunctionArn = functionArn;
            Id = id;
            InstanceId = instanceId;
        }
    }
}
