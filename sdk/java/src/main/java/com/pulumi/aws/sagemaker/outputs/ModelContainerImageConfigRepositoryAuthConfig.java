// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ModelContainerImageConfigRepositoryAuthConfig {
    /**
     * @return The Amazon Resource Name (ARN) of an AWS Lambda function that provides credentials to authenticate to the private Docker registry where your model image is hosted. For information about how to create an AWS Lambda function, see [Create a Lambda function with the console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html) in the _AWS Lambda Developer Guide_.
     * 
     */
    private final String repositoryCredentialsProviderArn;

    @CustomType.Constructor
    private ModelContainerImageConfigRepositoryAuthConfig(@CustomType.Parameter("repositoryCredentialsProviderArn") String repositoryCredentialsProviderArn) {
        this.repositoryCredentialsProviderArn = repositoryCredentialsProviderArn;
    }

    /**
     * @return The Amazon Resource Name (ARN) of an AWS Lambda function that provides credentials to authenticate to the private Docker registry where your model image is hosted. For information about how to create an AWS Lambda function, see [Create a Lambda function with the console](https://docs.aws.amazon.com/lambda/latest/dg/getting-started-create-function.html) in the _AWS Lambda Developer Guide_.
     * 
     */
    public String repositoryCredentialsProviderArn() {
        return this.repositoryCredentialsProviderArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelContainerImageConfigRepositoryAuthConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String repositoryCredentialsProviderArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelContainerImageConfigRepositoryAuthConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryCredentialsProviderArn = defaults.repositoryCredentialsProviderArn;
        }

        public Builder repositoryCredentialsProviderArn(String repositoryCredentialsProviderArn) {
            this.repositoryCredentialsProviderArn = Objects.requireNonNull(repositoryCredentialsProviderArn);
            return this;
        }        public ModelContainerImageConfigRepositoryAuthConfig build() {
            return new ModelContainerImageConfigRepositoryAuthConfig(repositoryCredentialsProviderArn);
        }
    }
}
