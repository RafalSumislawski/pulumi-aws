// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserStackAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final UserStackAssociationState Empty = new UserStackAssociationState();

    /**
     * Authentication type for the user.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Output<String> authenticationType;

    /**
     * @return Authentication type for the user.
     * 
     */
    public Optional<Output<String>> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    @Import(name="sendEmailNotification")
    private @Nullable Output<Boolean> sendEmailNotification;

    /**
     * @return Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    public Optional<Output<Boolean>> sendEmailNotification() {
        return Optional.ofNullable(this.sendEmailNotification);
    }

    /**
     * Name of the stack that is associated with the user.
     * 
     */
    @Import(name="stackName")
    private @Nullable Output<String> stackName;

    /**
     * @return Name of the stack that is associated with the user.
     * 
     */
    public Optional<Output<String>> stackName() {
        return Optional.ofNullable(this.stackName);
    }

    /**
     * Email address of the user who is associated with the stack.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Email address of the user who is associated with the stack.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private UserStackAssociationState() {}

    private UserStackAssociationState(UserStackAssociationState $) {
        this.authenticationType = $.authenticationType;
        this.sendEmailNotification = $.sendEmailNotification;
        this.stackName = $.stackName;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserStackAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserStackAssociationState $;

        public Builder() {
            $ = new UserStackAssociationState();
        }

        public Builder(UserStackAssociationState defaults) {
            $ = new UserStackAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType Authentication type for the user.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType Authentication type for the user.
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the user is created in the user pool.
         * 
         * @return builder
         * 
         */
        public Builder sendEmailNotification(@Nullable Output<Boolean> sendEmailNotification) {
            $.sendEmailNotification = sendEmailNotification;
            return this;
        }

        /**
         * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the user is created in the user pool.
         * 
         * @return builder
         * 
         */
        public Builder sendEmailNotification(Boolean sendEmailNotification) {
            return sendEmailNotification(Output.of(sendEmailNotification));
        }

        /**
         * @param stackName Name of the stack that is associated with the user.
         * 
         * @return builder
         * 
         */
        public Builder stackName(@Nullable Output<String> stackName) {
            $.stackName = stackName;
            return this;
        }

        /**
         * @param stackName Name of the stack that is associated with the user.
         * 
         * @return builder
         * 
         */
        public Builder stackName(String stackName) {
            return stackName(Output.of(stackName));
        }

        /**
         * @param userName Email address of the user who is associated with the stack.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Email address of the user who is associated with the stack.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public UserStackAssociationState build() {
            return $;
        }
    }

}
