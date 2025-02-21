// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GrantConstraint struct {
	// A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryptionContextSubset`.
	EncryptionContextEquals map[string]string `pulumi:"encryptionContextEquals"`
	// A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryptionContextEquals`.
	EncryptionContextSubset map[string]string `pulumi:"encryptionContextSubset"`
}

// GrantConstraintInput is an input type that accepts GrantConstraintArgs and GrantConstraintOutput values.
// You can construct a concrete instance of `GrantConstraintInput` via:
//
//          GrantConstraintArgs{...}
type GrantConstraintInput interface {
	pulumi.Input

	ToGrantConstraintOutput() GrantConstraintOutput
	ToGrantConstraintOutputWithContext(context.Context) GrantConstraintOutput
}

type GrantConstraintArgs struct {
	// A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryptionContextSubset`.
	EncryptionContextEquals pulumi.StringMapInput `pulumi:"encryptionContextEquals"`
	// A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryptionContextEquals`.
	EncryptionContextSubset pulumi.StringMapInput `pulumi:"encryptionContextSubset"`
}

func (GrantConstraintArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GrantConstraint)(nil)).Elem()
}

func (i GrantConstraintArgs) ToGrantConstraintOutput() GrantConstraintOutput {
	return i.ToGrantConstraintOutputWithContext(context.Background())
}

func (i GrantConstraintArgs) ToGrantConstraintOutputWithContext(ctx context.Context) GrantConstraintOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantConstraintOutput)
}

// GrantConstraintArrayInput is an input type that accepts GrantConstraintArray and GrantConstraintArrayOutput values.
// You can construct a concrete instance of `GrantConstraintArrayInput` via:
//
//          GrantConstraintArray{ GrantConstraintArgs{...} }
type GrantConstraintArrayInput interface {
	pulumi.Input

	ToGrantConstraintArrayOutput() GrantConstraintArrayOutput
	ToGrantConstraintArrayOutputWithContext(context.Context) GrantConstraintArrayOutput
}

type GrantConstraintArray []GrantConstraintInput

func (GrantConstraintArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GrantConstraint)(nil)).Elem()
}

func (i GrantConstraintArray) ToGrantConstraintArrayOutput() GrantConstraintArrayOutput {
	return i.ToGrantConstraintArrayOutputWithContext(context.Background())
}

func (i GrantConstraintArray) ToGrantConstraintArrayOutputWithContext(ctx context.Context) GrantConstraintArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantConstraintArrayOutput)
}

type GrantConstraintOutput struct{ *pulumi.OutputState }

func (GrantConstraintOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GrantConstraint)(nil)).Elem()
}

func (o GrantConstraintOutput) ToGrantConstraintOutput() GrantConstraintOutput {
	return o
}

func (o GrantConstraintOutput) ToGrantConstraintOutputWithContext(ctx context.Context) GrantConstraintOutput {
	return o
}

// A list of key-value pairs that must match the encryption context in subsequent cryptographic operation requests. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint. Conflicts with `encryptionContextSubset`.
func (o GrantConstraintOutput) EncryptionContextEquals() pulumi.StringMapOutput {
	return o.ApplyT(func(v GrantConstraint) map[string]string { return v.EncryptionContextEquals }).(pulumi.StringMapOutput)
}

// A list of key-value pairs that must be included in the encryption context of subsequent cryptographic operation requests. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs. Conflicts with `encryptionContextEquals`.
func (o GrantConstraintOutput) EncryptionContextSubset() pulumi.StringMapOutput {
	return o.ApplyT(func(v GrantConstraint) map[string]string { return v.EncryptionContextSubset }).(pulumi.StringMapOutput)
}

type GrantConstraintArrayOutput struct{ *pulumi.OutputState }

func (GrantConstraintArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GrantConstraint)(nil)).Elem()
}

func (o GrantConstraintArrayOutput) ToGrantConstraintArrayOutput() GrantConstraintArrayOutput {
	return o
}

func (o GrantConstraintArrayOutput) ToGrantConstraintArrayOutputWithContext(ctx context.Context) GrantConstraintArrayOutput {
	return o
}

func (o GrantConstraintArrayOutput) Index(i pulumi.IntInput) GrantConstraintOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GrantConstraint {
		return vs[0].([]GrantConstraint)[vs[1].(int)]
	}).(GrantConstraintOutput)
}

type GetKeyMultiRegionConfiguration struct {
	MultiRegionKeyType string                                     `pulumi:"multiRegionKeyType"`
	PrimaryKeys        []GetKeyMultiRegionConfigurationPrimaryKey `pulumi:"primaryKeys"`
	ReplicaKeys        []GetKeyMultiRegionConfigurationReplicaKey `pulumi:"replicaKeys"`
}

// GetKeyMultiRegionConfigurationInput is an input type that accepts GetKeyMultiRegionConfigurationArgs and GetKeyMultiRegionConfigurationOutput values.
// You can construct a concrete instance of `GetKeyMultiRegionConfigurationInput` via:
//
//          GetKeyMultiRegionConfigurationArgs{...}
type GetKeyMultiRegionConfigurationInput interface {
	pulumi.Input

	ToGetKeyMultiRegionConfigurationOutput() GetKeyMultiRegionConfigurationOutput
	ToGetKeyMultiRegionConfigurationOutputWithContext(context.Context) GetKeyMultiRegionConfigurationOutput
}

type GetKeyMultiRegionConfigurationArgs struct {
	MultiRegionKeyType pulumi.StringInput                                 `pulumi:"multiRegionKeyType"`
	PrimaryKeys        GetKeyMultiRegionConfigurationPrimaryKeyArrayInput `pulumi:"primaryKeys"`
	ReplicaKeys        GetKeyMultiRegionConfigurationReplicaKeyArrayInput `pulumi:"replicaKeys"`
}

func (GetKeyMultiRegionConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyMultiRegionConfiguration)(nil)).Elem()
}

func (i GetKeyMultiRegionConfigurationArgs) ToGetKeyMultiRegionConfigurationOutput() GetKeyMultiRegionConfigurationOutput {
	return i.ToGetKeyMultiRegionConfigurationOutputWithContext(context.Background())
}

func (i GetKeyMultiRegionConfigurationArgs) ToGetKeyMultiRegionConfigurationOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetKeyMultiRegionConfigurationOutput)
}

// GetKeyMultiRegionConfigurationArrayInput is an input type that accepts GetKeyMultiRegionConfigurationArray and GetKeyMultiRegionConfigurationArrayOutput values.
// You can construct a concrete instance of `GetKeyMultiRegionConfigurationArrayInput` via:
//
//          GetKeyMultiRegionConfigurationArray{ GetKeyMultiRegionConfigurationArgs{...} }
type GetKeyMultiRegionConfigurationArrayInput interface {
	pulumi.Input

	ToGetKeyMultiRegionConfigurationArrayOutput() GetKeyMultiRegionConfigurationArrayOutput
	ToGetKeyMultiRegionConfigurationArrayOutputWithContext(context.Context) GetKeyMultiRegionConfigurationArrayOutput
}

type GetKeyMultiRegionConfigurationArray []GetKeyMultiRegionConfigurationInput

func (GetKeyMultiRegionConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetKeyMultiRegionConfiguration)(nil)).Elem()
}

func (i GetKeyMultiRegionConfigurationArray) ToGetKeyMultiRegionConfigurationArrayOutput() GetKeyMultiRegionConfigurationArrayOutput {
	return i.ToGetKeyMultiRegionConfigurationArrayOutputWithContext(context.Background())
}

func (i GetKeyMultiRegionConfigurationArray) ToGetKeyMultiRegionConfigurationArrayOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetKeyMultiRegionConfigurationArrayOutput)
}

type GetKeyMultiRegionConfigurationOutput struct{ *pulumi.OutputState }

func (GetKeyMultiRegionConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyMultiRegionConfiguration)(nil)).Elem()
}

func (o GetKeyMultiRegionConfigurationOutput) ToGetKeyMultiRegionConfigurationOutput() GetKeyMultiRegionConfigurationOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationOutput) ToGetKeyMultiRegionConfigurationOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationOutput) MultiRegionKeyType() pulumi.StringOutput {
	return o.ApplyT(func(v GetKeyMultiRegionConfiguration) string { return v.MultiRegionKeyType }).(pulumi.StringOutput)
}

func (o GetKeyMultiRegionConfigurationOutput) PrimaryKeys() GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput {
	return o.ApplyT(func(v GetKeyMultiRegionConfiguration) []GetKeyMultiRegionConfigurationPrimaryKey {
		return v.PrimaryKeys
	}).(GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput)
}

func (o GetKeyMultiRegionConfigurationOutput) ReplicaKeys() GetKeyMultiRegionConfigurationReplicaKeyArrayOutput {
	return o.ApplyT(func(v GetKeyMultiRegionConfiguration) []GetKeyMultiRegionConfigurationReplicaKey {
		return v.ReplicaKeys
	}).(GetKeyMultiRegionConfigurationReplicaKeyArrayOutput)
}

type GetKeyMultiRegionConfigurationArrayOutput struct{ *pulumi.OutputState }

func (GetKeyMultiRegionConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetKeyMultiRegionConfiguration)(nil)).Elem()
}

func (o GetKeyMultiRegionConfigurationArrayOutput) ToGetKeyMultiRegionConfigurationArrayOutput() GetKeyMultiRegionConfigurationArrayOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationArrayOutput) ToGetKeyMultiRegionConfigurationArrayOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationArrayOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationArrayOutput) Index(i pulumi.IntInput) GetKeyMultiRegionConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetKeyMultiRegionConfiguration {
		return vs[0].([]GetKeyMultiRegionConfiguration)[vs[1].(int)]
	}).(GetKeyMultiRegionConfigurationOutput)
}

type GetKeyMultiRegionConfigurationPrimaryKey struct {
	Arn    string `pulumi:"arn"`
	Region string `pulumi:"region"`
}

// GetKeyMultiRegionConfigurationPrimaryKeyInput is an input type that accepts GetKeyMultiRegionConfigurationPrimaryKeyArgs and GetKeyMultiRegionConfigurationPrimaryKeyOutput values.
// You can construct a concrete instance of `GetKeyMultiRegionConfigurationPrimaryKeyInput` via:
//
//          GetKeyMultiRegionConfigurationPrimaryKeyArgs{...}
type GetKeyMultiRegionConfigurationPrimaryKeyInput interface {
	pulumi.Input

	ToGetKeyMultiRegionConfigurationPrimaryKeyOutput() GetKeyMultiRegionConfigurationPrimaryKeyOutput
	ToGetKeyMultiRegionConfigurationPrimaryKeyOutputWithContext(context.Context) GetKeyMultiRegionConfigurationPrimaryKeyOutput
}

type GetKeyMultiRegionConfigurationPrimaryKeyArgs struct {
	Arn    pulumi.StringInput `pulumi:"arn"`
	Region pulumi.StringInput `pulumi:"region"`
}

func (GetKeyMultiRegionConfigurationPrimaryKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyMultiRegionConfigurationPrimaryKey)(nil)).Elem()
}

func (i GetKeyMultiRegionConfigurationPrimaryKeyArgs) ToGetKeyMultiRegionConfigurationPrimaryKeyOutput() GetKeyMultiRegionConfigurationPrimaryKeyOutput {
	return i.ToGetKeyMultiRegionConfigurationPrimaryKeyOutputWithContext(context.Background())
}

func (i GetKeyMultiRegionConfigurationPrimaryKeyArgs) ToGetKeyMultiRegionConfigurationPrimaryKeyOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationPrimaryKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetKeyMultiRegionConfigurationPrimaryKeyOutput)
}

// GetKeyMultiRegionConfigurationPrimaryKeyArrayInput is an input type that accepts GetKeyMultiRegionConfigurationPrimaryKeyArray and GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput values.
// You can construct a concrete instance of `GetKeyMultiRegionConfigurationPrimaryKeyArrayInput` via:
//
//          GetKeyMultiRegionConfigurationPrimaryKeyArray{ GetKeyMultiRegionConfigurationPrimaryKeyArgs{...} }
type GetKeyMultiRegionConfigurationPrimaryKeyArrayInput interface {
	pulumi.Input

	ToGetKeyMultiRegionConfigurationPrimaryKeyArrayOutput() GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput
	ToGetKeyMultiRegionConfigurationPrimaryKeyArrayOutputWithContext(context.Context) GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput
}

type GetKeyMultiRegionConfigurationPrimaryKeyArray []GetKeyMultiRegionConfigurationPrimaryKeyInput

func (GetKeyMultiRegionConfigurationPrimaryKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetKeyMultiRegionConfigurationPrimaryKey)(nil)).Elem()
}

func (i GetKeyMultiRegionConfigurationPrimaryKeyArray) ToGetKeyMultiRegionConfigurationPrimaryKeyArrayOutput() GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput {
	return i.ToGetKeyMultiRegionConfigurationPrimaryKeyArrayOutputWithContext(context.Background())
}

func (i GetKeyMultiRegionConfigurationPrimaryKeyArray) ToGetKeyMultiRegionConfigurationPrimaryKeyArrayOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput)
}

type GetKeyMultiRegionConfigurationPrimaryKeyOutput struct{ *pulumi.OutputState }

func (GetKeyMultiRegionConfigurationPrimaryKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyMultiRegionConfigurationPrimaryKey)(nil)).Elem()
}

func (o GetKeyMultiRegionConfigurationPrimaryKeyOutput) ToGetKeyMultiRegionConfigurationPrimaryKeyOutput() GetKeyMultiRegionConfigurationPrimaryKeyOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationPrimaryKeyOutput) ToGetKeyMultiRegionConfigurationPrimaryKeyOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationPrimaryKeyOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationPrimaryKeyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetKeyMultiRegionConfigurationPrimaryKey) string { return v.Arn }).(pulumi.StringOutput)
}

func (o GetKeyMultiRegionConfigurationPrimaryKeyOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetKeyMultiRegionConfigurationPrimaryKey) string { return v.Region }).(pulumi.StringOutput)
}

type GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput struct{ *pulumi.OutputState }

func (GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetKeyMultiRegionConfigurationPrimaryKey)(nil)).Elem()
}

func (o GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput) ToGetKeyMultiRegionConfigurationPrimaryKeyArrayOutput() GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput) ToGetKeyMultiRegionConfigurationPrimaryKeyArrayOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput) Index(i pulumi.IntInput) GetKeyMultiRegionConfigurationPrimaryKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetKeyMultiRegionConfigurationPrimaryKey {
		return vs[0].([]GetKeyMultiRegionConfigurationPrimaryKey)[vs[1].(int)]
	}).(GetKeyMultiRegionConfigurationPrimaryKeyOutput)
}

type GetKeyMultiRegionConfigurationReplicaKey struct {
	Arn    string `pulumi:"arn"`
	Region string `pulumi:"region"`
}

// GetKeyMultiRegionConfigurationReplicaKeyInput is an input type that accepts GetKeyMultiRegionConfigurationReplicaKeyArgs and GetKeyMultiRegionConfigurationReplicaKeyOutput values.
// You can construct a concrete instance of `GetKeyMultiRegionConfigurationReplicaKeyInput` via:
//
//          GetKeyMultiRegionConfigurationReplicaKeyArgs{...}
type GetKeyMultiRegionConfigurationReplicaKeyInput interface {
	pulumi.Input

	ToGetKeyMultiRegionConfigurationReplicaKeyOutput() GetKeyMultiRegionConfigurationReplicaKeyOutput
	ToGetKeyMultiRegionConfigurationReplicaKeyOutputWithContext(context.Context) GetKeyMultiRegionConfigurationReplicaKeyOutput
}

type GetKeyMultiRegionConfigurationReplicaKeyArgs struct {
	Arn    pulumi.StringInput `pulumi:"arn"`
	Region pulumi.StringInput `pulumi:"region"`
}

func (GetKeyMultiRegionConfigurationReplicaKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyMultiRegionConfigurationReplicaKey)(nil)).Elem()
}

func (i GetKeyMultiRegionConfigurationReplicaKeyArgs) ToGetKeyMultiRegionConfigurationReplicaKeyOutput() GetKeyMultiRegionConfigurationReplicaKeyOutput {
	return i.ToGetKeyMultiRegionConfigurationReplicaKeyOutputWithContext(context.Background())
}

func (i GetKeyMultiRegionConfigurationReplicaKeyArgs) ToGetKeyMultiRegionConfigurationReplicaKeyOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationReplicaKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetKeyMultiRegionConfigurationReplicaKeyOutput)
}

// GetKeyMultiRegionConfigurationReplicaKeyArrayInput is an input type that accepts GetKeyMultiRegionConfigurationReplicaKeyArray and GetKeyMultiRegionConfigurationReplicaKeyArrayOutput values.
// You can construct a concrete instance of `GetKeyMultiRegionConfigurationReplicaKeyArrayInput` via:
//
//          GetKeyMultiRegionConfigurationReplicaKeyArray{ GetKeyMultiRegionConfigurationReplicaKeyArgs{...} }
type GetKeyMultiRegionConfigurationReplicaKeyArrayInput interface {
	pulumi.Input

	ToGetKeyMultiRegionConfigurationReplicaKeyArrayOutput() GetKeyMultiRegionConfigurationReplicaKeyArrayOutput
	ToGetKeyMultiRegionConfigurationReplicaKeyArrayOutputWithContext(context.Context) GetKeyMultiRegionConfigurationReplicaKeyArrayOutput
}

type GetKeyMultiRegionConfigurationReplicaKeyArray []GetKeyMultiRegionConfigurationReplicaKeyInput

func (GetKeyMultiRegionConfigurationReplicaKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetKeyMultiRegionConfigurationReplicaKey)(nil)).Elem()
}

func (i GetKeyMultiRegionConfigurationReplicaKeyArray) ToGetKeyMultiRegionConfigurationReplicaKeyArrayOutput() GetKeyMultiRegionConfigurationReplicaKeyArrayOutput {
	return i.ToGetKeyMultiRegionConfigurationReplicaKeyArrayOutputWithContext(context.Background())
}

func (i GetKeyMultiRegionConfigurationReplicaKeyArray) ToGetKeyMultiRegionConfigurationReplicaKeyArrayOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationReplicaKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetKeyMultiRegionConfigurationReplicaKeyArrayOutput)
}

type GetKeyMultiRegionConfigurationReplicaKeyOutput struct{ *pulumi.OutputState }

func (GetKeyMultiRegionConfigurationReplicaKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKeyMultiRegionConfigurationReplicaKey)(nil)).Elem()
}

func (o GetKeyMultiRegionConfigurationReplicaKeyOutput) ToGetKeyMultiRegionConfigurationReplicaKeyOutput() GetKeyMultiRegionConfigurationReplicaKeyOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationReplicaKeyOutput) ToGetKeyMultiRegionConfigurationReplicaKeyOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationReplicaKeyOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationReplicaKeyOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetKeyMultiRegionConfigurationReplicaKey) string { return v.Arn }).(pulumi.StringOutput)
}

func (o GetKeyMultiRegionConfigurationReplicaKeyOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetKeyMultiRegionConfigurationReplicaKey) string { return v.Region }).(pulumi.StringOutput)
}

type GetKeyMultiRegionConfigurationReplicaKeyArrayOutput struct{ *pulumi.OutputState }

func (GetKeyMultiRegionConfigurationReplicaKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetKeyMultiRegionConfigurationReplicaKey)(nil)).Elem()
}

func (o GetKeyMultiRegionConfigurationReplicaKeyArrayOutput) ToGetKeyMultiRegionConfigurationReplicaKeyArrayOutput() GetKeyMultiRegionConfigurationReplicaKeyArrayOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationReplicaKeyArrayOutput) ToGetKeyMultiRegionConfigurationReplicaKeyArrayOutputWithContext(ctx context.Context) GetKeyMultiRegionConfigurationReplicaKeyArrayOutput {
	return o
}

func (o GetKeyMultiRegionConfigurationReplicaKeyArrayOutput) Index(i pulumi.IntInput) GetKeyMultiRegionConfigurationReplicaKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetKeyMultiRegionConfigurationReplicaKey {
		return vs[0].([]GetKeyMultiRegionConfigurationReplicaKey)[vs[1].(int)]
	}).(GetKeyMultiRegionConfigurationReplicaKeyOutput)
}

type GetSecretSecret struct {
	Context     map[string]string `pulumi:"context"`
	GrantTokens []string          `pulumi:"grantTokens"`
	Name        string            `pulumi:"name"`
	Payload     string            `pulumi:"payload"`
}

// GetSecretSecretInput is an input type that accepts GetSecretSecretArgs and GetSecretSecretOutput values.
// You can construct a concrete instance of `GetSecretSecretInput` via:
//
//          GetSecretSecretArgs{...}
type GetSecretSecretInput interface {
	pulumi.Input

	ToGetSecretSecretOutput() GetSecretSecretOutput
	ToGetSecretSecretOutputWithContext(context.Context) GetSecretSecretOutput
}

type GetSecretSecretArgs struct {
	Context     pulumi.StringMapInput   `pulumi:"context"`
	GrantTokens pulumi.StringArrayInput `pulumi:"grantTokens"`
	Name        pulumi.StringInput      `pulumi:"name"`
	Payload     pulumi.StringInput      `pulumi:"payload"`
}

func (GetSecretSecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretSecret)(nil)).Elem()
}

func (i GetSecretSecretArgs) ToGetSecretSecretOutput() GetSecretSecretOutput {
	return i.ToGetSecretSecretOutputWithContext(context.Background())
}

func (i GetSecretSecretArgs) ToGetSecretSecretOutputWithContext(ctx context.Context) GetSecretSecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSecretSecretOutput)
}

// GetSecretSecretArrayInput is an input type that accepts GetSecretSecretArray and GetSecretSecretArrayOutput values.
// You can construct a concrete instance of `GetSecretSecretArrayInput` via:
//
//          GetSecretSecretArray{ GetSecretSecretArgs{...} }
type GetSecretSecretArrayInput interface {
	pulumi.Input

	ToGetSecretSecretArrayOutput() GetSecretSecretArrayOutput
	ToGetSecretSecretArrayOutputWithContext(context.Context) GetSecretSecretArrayOutput
}

type GetSecretSecretArray []GetSecretSecretInput

func (GetSecretSecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSecretSecret)(nil)).Elem()
}

func (i GetSecretSecretArray) ToGetSecretSecretArrayOutput() GetSecretSecretArrayOutput {
	return i.ToGetSecretSecretArrayOutputWithContext(context.Background())
}

func (i GetSecretSecretArray) ToGetSecretSecretArrayOutputWithContext(ctx context.Context) GetSecretSecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSecretSecretArrayOutput)
}

type GetSecretSecretOutput struct{ *pulumi.OutputState }

func (GetSecretSecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretSecret)(nil)).Elem()
}

func (o GetSecretSecretOutput) ToGetSecretSecretOutput() GetSecretSecretOutput {
	return o
}

func (o GetSecretSecretOutput) ToGetSecretSecretOutputWithContext(ctx context.Context) GetSecretSecretOutput {
	return o
}

func (o GetSecretSecretOutput) Context() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetSecretSecret) map[string]string { return v.Context }).(pulumi.StringMapOutput)
}

func (o GetSecretSecretOutput) GrantTokens() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretSecret) []string { return v.GrantTokens }).(pulumi.StringArrayOutput)
}

func (o GetSecretSecretOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretSecret) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetSecretSecretOutput) Payload() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretSecret) string { return v.Payload }).(pulumi.StringOutput)
}

type GetSecretSecretArrayOutput struct{ *pulumi.OutputState }

func (GetSecretSecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSecretSecret)(nil)).Elem()
}

func (o GetSecretSecretArrayOutput) ToGetSecretSecretArrayOutput() GetSecretSecretArrayOutput {
	return o
}

func (o GetSecretSecretArrayOutput) ToGetSecretSecretArrayOutputWithContext(ctx context.Context) GetSecretSecretArrayOutput {
	return o
}

func (o GetSecretSecretArrayOutput) Index(i pulumi.IntInput) GetSecretSecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetSecretSecret {
		return vs[0].([]GetSecretSecret)[vs[1].(int)]
	}).(GetSecretSecretOutput)
}

type GetSecretsSecret struct {
	// An optional mapping that makes up the Encryption Context for the secret.
	Context map[string]string `pulumi:"context"`
	// An optional list of Grant Tokens for the secret.
	GrantTokens []string `pulumi:"grantTokens"`
	// The name to export this secret under in the attributes.
	Name string `pulumi:"name"`
	// Base64 encoded payload, as returned from a KMS encrypt operation.
	Payload string `pulumi:"payload"`
}

// GetSecretsSecretInput is an input type that accepts GetSecretsSecretArgs and GetSecretsSecretOutput values.
// You can construct a concrete instance of `GetSecretsSecretInput` via:
//
//          GetSecretsSecretArgs{...}
type GetSecretsSecretInput interface {
	pulumi.Input

	ToGetSecretsSecretOutput() GetSecretsSecretOutput
	ToGetSecretsSecretOutputWithContext(context.Context) GetSecretsSecretOutput
}

type GetSecretsSecretArgs struct {
	// An optional mapping that makes up the Encryption Context for the secret.
	Context pulumi.StringMapInput `pulumi:"context"`
	// An optional list of Grant Tokens for the secret.
	GrantTokens pulumi.StringArrayInput `pulumi:"grantTokens"`
	// The name to export this secret under in the attributes.
	Name pulumi.StringInput `pulumi:"name"`
	// Base64 encoded payload, as returned from a KMS encrypt operation.
	Payload pulumi.StringInput `pulumi:"payload"`
}

func (GetSecretsSecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsSecret)(nil)).Elem()
}

func (i GetSecretsSecretArgs) ToGetSecretsSecretOutput() GetSecretsSecretOutput {
	return i.ToGetSecretsSecretOutputWithContext(context.Background())
}

func (i GetSecretsSecretArgs) ToGetSecretsSecretOutputWithContext(ctx context.Context) GetSecretsSecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSecretsSecretOutput)
}

// GetSecretsSecretArrayInput is an input type that accepts GetSecretsSecretArray and GetSecretsSecretArrayOutput values.
// You can construct a concrete instance of `GetSecretsSecretArrayInput` via:
//
//          GetSecretsSecretArray{ GetSecretsSecretArgs{...} }
type GetSecretsSecretArrayInput interface {
	pulumi.Input

	ToGetSecretsSecretArrayOutput() GetSecretsSecretArrayOutput
	ToGetSecretsSecretArrayOutputWithContext(context.Context) GetSecretsSecretArrayOutput
}

type GetSecretsSecretArray []GetSecretsSecretInput

func (GetSecretsSecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSecretsSecret)(nil)).Elem()
}

func (i GetSecretsSecretArray) ToGetSecretsSecretArrayOutput() GetSecretsSecretArrayOutput {
	return i.ToGetSecretsSecretArrayOutputWithContext(context.Background())
}

func (i GetSecretsSecretArray) ToGetSecretsSecretArrayOutputWithContext(ctx context.Context) GetSecretsSecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSecretsSecretArrayOutput)
}

type GetSecretsSecretOutput struct{ *pulumi.OutputState }

func (GetSecretsSecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecretsSecret)(nil)).Elem()
}

func (o GetSecretsSecretOutput) ToGetSecretsSecretOutput() GetSecretsSecretOutput {
	return o
}

func (o GetSecretsSecretOutput) ToGetSecretsSecretOutputWithContext(ctx context.Context) GetSecretsSecretOutput {
	return o
}

// An optional mapping that makes up the Encryption Context for the secret.
func (o GetSecretsSecretOutput) Context() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetSecretsSecret) map[string]string { return v.Context }).(pulumi.StringMapOutput)
}

// An optional list of Grant Tokens for the secret.
func (o GetSecretsSecretOutput) GrantTokens() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecretsSecret) []string { return v.GrantTokens }).(pulumi.StringArrayOutput)
}

// The name to export this secret under in the attributes.
func (o GetSecretsSecretOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretsSecret) string { return v.Name }).(pulumi.StringOutput)
}

// Base64 encoded payload, as returned from a KMS encrypt operation.
func (o GetSecretsSecretOutput) Payload() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecretsSecret) string { return v.Payload }).(pulumi.StringOutput)
}

type GetSecretsSecretArrayOutput struct{ *pulumi.OutputState }

func (GetSecretsSecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSecretsSecret)(nil)).Elem()
}

func (o GetSecretsSecretArrayOutput) ToGetSecretsSecretArrayOutput() GetSecretsSecretArrayOutput {
	return o
}

func (o GetSecretsSecretArrayOutput) ToGetSecretsSecretArrayOutputWithContext(ctx context.Context) GetSecretsSecretArrayOutput {
	return o
}

func (o GetSecretsSecretArrayOutput) Index(i pulumi.IntInput) GetSecretsSecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetSecretsSecret {
		return vs[0].([]GetSecretsSecret)[vs[1].(int)]
	}).(GetSecretsSecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantConstraintInput)(nil)).Elem(), GrantConstraintArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantConstraintArrayInput)(nil)).Elem(), GrantConstraintArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetKeyMultiRegionConfigurationInput)(nil)).Elem(), GetKeyMultiRegionConfigurationArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetKeyMultiRegionConfigurationArrayInput)(nil)).Elem(), GetKeyMultiRegionConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetKeyMultiRegionConfigurationPrimaryKeyInput)(nil)).Elem(), GetKeyMultiRegionConfigurationPrimaryKeyArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetKeyMultiRegionConfigurationPrimaryKeyArrayInput)(nil)).Elem(), GetKeyMultiRegionConfigurationPrimaryKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetKeyMultiRegionConfigurationReplicaKeyInput)(nil)).Elem(), GetKeyMultiRegionConfigurationReplicaKeyArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetKeyMultiRegionConfigurationReplicaKeyArrayInput)(nil)).Elem(), GetKeyMultiRegionConfigurationReplicaKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSecretSecretInput)(nil)).Elem(), GetSecretSecretArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSecretSecretArrayInput)(nil)).Elem(), GetSecretSecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSecretsSecretInput)(nil)).Elem(), GetSecretsSecretArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetSecretsSecretArrayInput)(nil)).Elem(), GetSecretsSecretArray{})
	pulumi.RegisterOutputType(GrantConstraintOutput{})
	pulumi.RegisterOutputType(GrantConstraintArrayOutput{})
	pulumi.RegisterOutputType(GetKeyMultiRegionConfigurationOutput{})
	pulumi.RegisterOutputType(GetKeyMultiRegionConfigurationArrayOutput{})
	pulumi.RegisterOutputType(GetKeyMultiRegionConfigurationPrimaryKeyOutput{})
	pulumi.RegisterOutputType(GetKeyMultiRegionConfigurationPrimaryKeyArrayOutput{})
	pulumi.RegisterOutputType(GetKeyMultiRegionConfigurationReplicaKeyOutput{})
	pulumi.RegisterOutputType(GetKeyMultiRegionConfigurationReplicaKeyArrayOutput{})
	pulumi.RegisterOutputType(GetSecretSecretOutput{})
	pulumi.RegisterOutputType(GetSecretSecretArrayOutput{})
	pulumi.RegisterOutputType(GetSecretsSecretOutput{})
	pulumi.RegisterOutputType(GetSecretsSecretArrayOutput{})
}
