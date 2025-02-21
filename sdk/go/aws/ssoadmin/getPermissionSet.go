// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ssoadmin

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get a Single Sign-On (SSO) Permission Set.
func LookupPermissionSet(ctx *pulumi.Context, args *LookupPermissionSetArgs, opts ...pulumi.InvokeOption) (*LookupPermissionSetResult, error) {
	var rv LookupPermissionSetResult
	err := ctx.Invoke("aws:ssoadmin/getPermissionSet:getPermissionSet", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPermissionSet.
type LookupPermissionSetArgs struct {
	// The Amazon Resource Name (ARN) of the permission set.
	Arn *string `pulumi:"arn"`
	// The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
	InstanceArn string `pulumi:"instanceArn"`
	// The name of the SSO Permission Set.
	Name *string `pulumi:"name"`
	// Key-value map of resource tags.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getPermissionSet.
type LookupPermissionSetResult struct {
	Arn         string `pulumi:"arn"`
	CreatedDate string `pulumi:"createdDate"`
	// The description of the Permission Set.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id          string `pulumi:"id"`
	InstanceArn string `pulumi:"instanceArn"`
	Name        string `pulumi:"name"`
	// The relay state URL used to redirect users within the application during the federation authentication process.
	RelayState string `pulumi:"relayState"`
	// The length of time that the application user sessions are valid in the ISO-8601 standard.
	SessionDuration string `pulumi:"sessionDuration"`
	// Key-value map of resource tags.
	Tags map[string]string `pulumi:"tags"`
}

func LookupPermissionSetOutput(ctx *pulumi.Context, args LookupPermissionSetOutputArgs, opts ...pulumi.InvokeOption) LookupPermissionSetResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPermissionSetResult, error) {
			args := v.(LookupPermissionSetArgs)
			r, err := LookupPermissionSet(ctx, &args, opts...)
			var s LookupPermissionSetResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPermissionSetResultOutput)
}

// A collection of arguments for invoking getPermissionSet.
type LookupPermissionSetOutputArgs struct {
	// The Amazon Resource Name (ARN) of the permission set.
	Arn pulumi.StringPtrInput `pulumi:"arn"`
	// The Amazon Resource Name (ARN) of the SSO Instance associated with the permission set.
	InstanceArn pulumi.StringInput `pulumi:"instanceArn"`
	// The name of the SSO Permission Set.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Key-value map of resource tags.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupPermissionSetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPermissionSetArgs)(nil)).Elem()
}

// A collection of values returned by getPermissionSet.
type LookupPermissionSetResultOutput struct{ *pulumi.OutputState }

func (LookupPermissionSetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPermissionSetResult)(nil)).Elem()
}

func (o LookupPermissionSetResultOutput) ToLookupPermissionSetResultOutput() LookupPermissionSetResultOutput {
	return o
}

func (o LookupPermissionSetResultOutput) ToLookupPermissionSetResultOutputWithContext(ctx context.Context) LookupPermissionSetResultOutput {
	return o
}

func (o LookupPermissionSetResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupPermissionSetResultOutput) CreatedDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.CreatedDate }).(pulumi.StringOutput)
}

// The description of the Permission Set.
func (o LookupPermissionSetResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPermissionSetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPermissionSetResultOutput) InstanceArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.InstanceArn }).(pulumi.StringOutput)
}

func (o LookupPermissionSetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.Name }).(pulumi.StringOutput)
}

// The relay state URL used to redirect users within the application during the federation authentication process.
func (o LookupPermissionSetResultOutput) RelayState() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.RelayState }).(pulumi.StringOutput)
}

// The length of time that the application user sessions are valid in the ISO-8601 standard.
func (o LookupPermissionSetResultOutput) SessionDuration() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) string { return v.SessionDuration }).(pulumi.StringOutput)
}

// Key-value map of resource tags.
func (o LookupPermissionSetResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupPermissionSetResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPermissionSetResultOutput{})
}
