// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mediastore

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a MediaStore Container Policy.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/mediastore"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		currentRegion, err := aws.GetRegion(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		currentCallerIdentity, err := aws.GetCallerIdentity(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleContainer, err := mediastore.NewContainer(ctx, "exampleContainer", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = mediastore.NewContainerPolicy(ctx, "exampleContainerPolicy", &mediastore.ContainerPolicyArgs{
// 			ContainerName: exampleContainer.Name,
// 			Policy: exampleContainer.Name.ApplyT(func(name string) (string, error) {
// 				return fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "	\"Version\": \"2012-10-17\",\n", "	\"Statement\": [{\n", "		\"Sid\": \"MediaStoreFullAccess\",\n", "		\"Action\": [ \"mediastore:*\" ],\n", "		\"Principal\": {\"AWS\" : \"arn:aws:iam::", currentCallerIdentity.AccountId, ":root\"},\n", "		\"Effect\": \"Allow\",\n", "		\"Resource\": \"arn:aws:mediastore:", currentRegion.Name, ":", currentCallerIdentity.AccountId, ":container/", name, "/*\",\n", "		\"Condition\": {\n", "			\"Bool\": { \"aws:SecureTransport\": \"true\" }\n", "		}\n", "	}]\n", "}\n"), nil
// 			}).(pulumi.StringOutput),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// MediaStore Container Policy can be imported using the MediaStore Container Name, e.g.,
//
// ```sh
//  $ pulumi import aws:mediastore/containerPolicy:ContainerPolicy example example
// ```
type ContainerPolicy struct {
	pulumi.CustomResourceState

	// The name of the container.
	ContainerName pulumi.StringOutput `pulumi:"containerName"`
	// The contents of the policy.
	Policy pulumi.StringOutput `pulumi:"policy"`
}

// NewContainerPolicy registers a new resource with the given unique name, arguments, and options.
func NewContainerPolicy(ctx *pulumi.Context,
	name string, args *ContainerPolicyArgs, opts ...pulumi.ResourceOption) (*ContainerPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContainerName == nil {
		return nil, errors.New("invalid value for required argument 'ContainerName'")
	}
	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	var resource ContainerPolicy
	err := ctx.RegisterResource("aws:mediastore/containerPolicy:ContainerPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContainerPolicy gets an existing ContainerPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContainerPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContainerPolicyState, opts ...pulumi.ResourceOption) (*ContainerPolicy, error) {
	var resource ContainerPolicy
	err := ctx.ReadResource("aws:mediastore/containerPolicy:ContainerPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ContainerPolicy resources.
type containerPolicyState struct {
	// The name of the container.
	ContainerName *string `pulumi:"containerName"`
	// The contents of the policy.
	Policy *string `pulumi:"policy"`
}

type ContainerPolicyState struct {
	// The name of the container.
	ContainerName pulumi.StringPtrInput
	// The contents of the policy.
	Policy pulumi.StringPtrInput
}

func (ContainerPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*containerPolicyState)(nil)).Elem()
}

type containerPolicyArgs struct {
	// The name of the container.
	ContainerName string `pulumi:"containerName"`
	// The contents of the policy.
	Policy string `pulumi:"policy"`
}

// The set of arguments for constructing a ContainerPolicy resource.
type ContainerPolicyArgs struct {
	// The name of the container.
	ContainerName pulumi.StringInput
	// The contents of the policy.
	Policy pulumi.StringInput
}

func (ContainerPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*containerPolicyArgs)(nil)).Elem()
}

type ContainerPolicyInput interface {
	pulumi.Input

	ToContainerPolicyOutput() ContainerPolicyOutput
	ToContainerPolicyOutputWithContext(ctx context.Context) ContainerPolicyOutput
}

func (*ContainerPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerPolicy)(nil)).Elem()
}

func (i *ContainerPolicy) ToContainerPolicyOutput() ContainerPolicyOutput {
	return i.ToContainerPolicyOutputWithContext(context.Background())
}

func (i *ContainerPolicy) ToContainerPolicyOutputWithContext(ctx context.Context) ContainerPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerPolicyOutput)
}

// ContainerPolicyArrayInput is an input type that accepts ContainerPolicyArray and ContainerPolicyArrayOutput values.
// You can construct a concrete instance of `ContainerPolicyArrayInput` via:
//
//          ContainerPolicyArray{ ContainerPolicyArgs{...} }
type ContainerPolicyArrayInput interface {
	pulumi.Input

	ToContainerPolicyArrayOutput() ContainerPolicyArrayOutput
	ToContainerPolicyArrayOutputWithContext(context.Context) ContainerPolicyArrayOutput
}

type ContainerPolicyArray []ContainerPolicyInput

func (ContainerPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerPolicy)(nil)).Elem()
}

func (i ContainerPolicyArray) ToContainerPolicyArrayOutput() ContainerPolicyArrayOutput {
	return i.ToContainerPolicyArrayOutputWithContext(context.Background())
}

func (i ContainerPolicyArray) ToContainerPolicyArrayOutputWithContext(ctx context.Context) ContainerPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerPolicyArrayOutput)
}

// ContainerPolicyMapInput is an input type that accepts ContainerPolicyMap and ContainerPolicyMapOutput values.
// You can construct a concrete instance of `ContainerPolicyMapInput` via:
//
//          ContainerPolicyMap{ "key": ContainerPolicyArgs{...} }
type ContainerPolicyMapInput interface {
	pulumi.Input

	ToContainerPolicyMapOutput() ContainerPolicyMapOutput
	ToContainerPolicyMapOutputWithContext(context.Context) ContainerPolicyMapOutput
}

type ContainerPolicyMap map[string]ContainerPolicyInput

func (ContainerPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerPolicy)(nil)).Elem()
}

func (i ContainerPolicyMap) ToContainerPolicyMapOutput() ContainerPolicyMapOutput {
	return i.ToContainerPolicyMapOutputWithContext(context.Background())
}

func (i ContainerPolicyMap) ToContainerPolicyMapOutputWithContext(ctx context.Context) ContainerPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerPolicyMapOutput)
}

type ContainerPolicyOutput struct{ *pulumi.OutputState }

func (ContainerPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ContainerPolicy)(nil)).Elem()
}

func (o ContainerPolicyOutput) ToContainerPolicyOutput() ContainerPolicyOutput {
	return o
}

func (o ContainerPolicyOutput) ToContainerPolicyOutputWithContext(ctx context.Context) ContainerPolicyOutput {
	return o
}

// The name of the container.
func (o ContainerPolicyOutput) ContainerName() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerPolicy) pulumi.StringOutput { return v.ContainerName }).(pulumi.StringOutput)
}

// The contents of the policy.
func (o ContainerPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *ContainerPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

type ContainerPolicyArrayOutput struct{ *pulumi.OutputState }

func (ContainerPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContainerPolicy)(nil)).Elem()
}

func (o ContainerPolicyArrayOutput) ToContainerPolicyArrayOutput() ContainerPolicyArrayOutput {
	return o
}

func (o ContainerPolicyArrayOutput) ToContainerPolicyArrayOutputWithContext(ctx context.Context) ContainerPolicyArrayOutput {
	return o
}

func (o ContainerPolicyArrayOutput) Index(i pulumi.IntInput) ContainerPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ContainerPolicy {
		return vs[0].([]*ContainerPolicy)[vs[1].(int)]
	}).(ContainerPolicyOutput)
}

type ContainerPolicyMapOutput struct{ *pulumi.OutputState }

func (ContainerPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContainerPolicy)(nil)).Elem()
}

func (o ContainerPolicyMapOutput) ToContainerPolicyMapOutput() ContainerPolicyMapOutput {
	return o
}

func (o ContainerPolicyMapOutput) ToContainerPolicyMapOutputWithContext(ctx context.Context) ContainerPolicyMapOutput {
	return o
}

func (o ContainerPolicyMapOutput) MapIndex(k pulumi.StringInput) ContainerPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ContainerPolicy {
		return vs[0].(map[string]*ContainerPolicy)[vs[1].(string)]
	}).(ContainerPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerPolicyInput)(nil)).Elem(), &ContainerPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerPolicyArrayInput)(nil)).Elem(), ContainerPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerPolicyMapInput)(nil)).Elem(), ContainerPolicyMap{})
	pulumi.RegisterOutputType(ContainerPolicyOutput{})
	pulumi.RegisterOutputType(ContainerPolicyArrayOutput{})
	pulumi.RegisterOutputType(ContainerPolicyMapOutput{})
}
