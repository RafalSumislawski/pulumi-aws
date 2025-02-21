// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kms
{
    public static class GetCipherText
    {
        /// <summary>
        /// The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
        /// by using an AWS KMS customer master key. The value returned by this data source
        /// changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
        /// resource.
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
        ///         var oauthConfig = new Aws.Kms.Key("oauthConfig", new Aws.Kms.KeyArgs
        ///         {
        ///             Description = "oauth config",
        ///             IsEnabled = true,
        ///         });
        ///         var oauth = Aws.Kms.GetCipherText.Invoke(new Aws.Kms.GetCipherTextInvokeArgs
        ///         {
        ///             KeyId = oauthConfig.KeyId,
        ///             Plaintext = @"{
        ///   ""client_id"": ""e587dbae22222f55da22"",
        ///   ""client_secret"": ""8289575d00000ace55e1815ec13673955721b8a5""
        /// }
        /// ",
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCipherTextResult> InvokeAsync(GetCipherTextArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCipherTextResult>("aws:kms/getCipherText:getCipherText", args ?? new GetCipherTextArgs(), options.WithDefaults());

        /// <summary>
        /// The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
        /// by using an AWS KMS customer master key. The value returned by this data source
        /// changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
        /// resource.
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
        ///         var oauthConfig = new Aws.Kms.Key("oauthConfig", new Aws.Kms.KeyArgs
        ///         {
        ///             Description = "oauth config",
        ///             IsEnabled = true,
        ///         });
        ///         var oauth = Aws.Kms.GetCipherText.Invoke(new Aws.Kms.GetCipherTextInvokeArgs
        ///         {
        ///             KeyId = oauthConfig.KeyId,
        ///             Plaintext = @"{
        ///   ""client_id"": ""e587dbae22222f55da22"",
        ///   ""client_secret"": ""8289575d00000ace55e1815ec13673955721b8a5""
        /// }
        /// ",
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCipherTextResult> Invoke(GetCipherTextInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCipherTextResult>("aws:kms/getCipherText:getCipherText", args ?? new GetCipherTextInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCipherTextArgs : Pulumi.InvokeArgs
    {
        [Input("context")]
        private Dictionary<string, string>? _context;

        /// <summary>
        /// An optional mapping that makes up the encryption context.
        /// </summary>
        public Dictionary<string, string> Context
        {
            get => _context ?? (_context = new Dictionary<string, string>());
            set => _context = value;
        }

        /// <summary>
        /// Globally unique key ID for the customer master key.
        /// </summary>
        [Input("keyId", required: true)]
        public string KeyId { get; set; } = null!;

        /// <summary>
        /// Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        /// </summary>
        [Input("plaintext", required: true)]
        public string Plaintext { get; set; } = null!;

        public GetCipherTextArgs()
        {
        }
    }

    public sealed class GetCipherTextInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("context")]
        private InputMap<string>? _context;

        /// <summary>
        /// An optional mapping that makes up the encryption context.
        /// </summary>
        public InputMap<string> Context
        {
            get => _context ?? (_context = new InputMap<string>());
            set => _context = value;
        }

        /// <summary>
        /// Globally unique key ID for the customer master key.
        /// </summary>
        [Input("keyId", required: true)]
        public Input<string> KeyId { get; set; } = null!;

        /// <summary>
        /// Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
        /// </summary>
        [Input("plaintext", required: true)]
        public Input<string> Plaintext { get; set; } = null!;

        public GetCipherTextInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCipherTextResult
    {
        /// <summary>
        /// Base64 encoded ciphertext
        /// </summary>
        public readonly string CiphertextBlob;
        public readonly ImmutableDictionary<string, string>? Context;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string KeyId;
        public readonly string Plaintext;

        [OutputConstructor]
        private GetCipherTextResult(
            string ciphertextBlob,

            ImmutableDictionary<string, string>? context,

            string id,

            string keyId,

            string plaintext)
        {
            CiphertextBlob = ciphertextBlob;
            Context = context;
            Id = id;
            KeyId = keyId;
            Plaintext = plaintext;
        }
    }
}
