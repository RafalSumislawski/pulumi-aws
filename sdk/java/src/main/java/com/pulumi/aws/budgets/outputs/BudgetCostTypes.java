// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetCostTypes {
    /**
     * @return A boolean value whether to include credits in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeCredit;
    /**
     * @return Specifies whether a budget includes discounts. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeDiscount;
    /**
     * @return A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeOtherSubscription;
    /**
     * @return A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeRecurring;
    /**
     * @return A boolean value whether to include refunds in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeRefund;
    /**
     * @return A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeSubscription;
    /**
     * @return A boolean value whether to include support costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeSupport;
    /**
     * @return A boolean value whether to include tax in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeTax;
    /**
     * @return A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeUpfront;
    /**
     * @return Specifies whether a budget uses the amortized rate. Defaults to `false`
     * 
     */
    private final @Nullable Boolean useAmortized;
    /**
     * @return A boolean value whether to use blended costs in the cost budget. Defaults to `false`
     * 
     */
    private final @Nullable Boolean useBlended;

    @CustomType.Constructor
    private BudgetCostTypes(
        @CustomType.Parameter("includeCredit") @Nullable Boolean includeCredit,
        @CustomType.Parameter("includeDiscount") @Nullable Boolean includeDiscount,
        @CustomType.Parameter("includeOtherSubscription") @Nullable Boolean includeOtherSubscription,
        @CustomType.Parameter("includeRecurring") @Nullable Boolean includeRecurring,
        @CustomType.Parameter("includeRefund") @Nullable Boolean includeRefund,
        @CustomType.Parameter("includeSubscription") @Nullable Boolean includeSubscription,
        @CustomType.Parameter("includeSupport") @Nullable Boolean includeSupport,
        @CustomType.Parameter("includeTax") @Nullable Boolean includeTax,
        @CustomType.Parameter("includeUpfront") @Nullable Boolean includeUpfront,
        @CustomType.Parameter("useAmortized") @Nullable Boolean useAmortized,
        @CustomType.Parameter("useBlended") @Nullable Boolean useBlended) {
        this.includeCredit = includeCredit;
        this.includeDiscount = includeDiscount;
        this.includeOtherSubscription = includeOtherSubscription;
        this.includeRecurring = includeRecurring;
        this.includeRefund = includeRefund;
        this.includeSubscription = includeSubscription;
        this.includeSupport = includeSupport;
        this.includeTax = includeTax;
        this.includeUpfront = includeUpfront;
        this.useAmortized = useAmortized;
        this.useBlended = useBlended;
    }

    /**
     * @return A boolean value whether to include credits in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeCredit() {
        return Optional.ofNullable(this.includeCredit);
    }
    /**
     * @return Specifies whether a budget includes discounts. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeDiscount() {
        return Optional.ofNullable(this.includeDiscount);
    }
    /**
     * @return A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeOtherSubscription() {
        return Optional.ofNullable(this.includeOtherSubscription);
    }
    /**
     * @return A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeRecurring() {
        return Optional.ofNullable(this.includeRecurring);
    }
    /**
     * @return A boolean value whether to include refunds in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeRefund() {
        return Optional.ofNullable(this.includeRefund);
    }
    /**
     * @return A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeSubscription() {
        return Optional.ofNullable(this.includeSubscription);
    }
    /**
     * @return A boolean value whether to include support costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeSupport() {
        return Optional.ofNullable(this.includeSupport);
    }
    /**
     * @return A boolean value whether to include tax in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeTax() {
        return Optional.ofNullable(this.includeTax);
    }
    /**
     * @return A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> includeUpfront() {
        return Optional.ofNullable(this.includeUpfront);
    }
    /**
     * @return Specifies whether a budget uses the amortized rate. Defaults to `false`
     * 
     */
    public Optional<Boolean> useAmortized() {
        return Optional.ofNullable(this.useAmortized);
    }
    /**
     * @return A boolean value whether to use blended costs in the cost budget. Defaults to `false`
     * 
     */
    public Optional<Boolean> useBlended() {
        return Optional.ofNullable(this.useBlended);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetCostTypes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean includeCredit;
        private @Nullable Boolean includeDiscount;
        private @Nullable Boolean includeOtherSubscription;
        private @Nullable Boolean includeRecurring;
        private @Nullable Boolean includeRefund;
        private @Nullable Boolean includeSubscription;
        private @Nullable Boolean includeSupport;
        private @Nullable Boolean includeTax;
        private @Nullable Boolean includeUpfront;
        private @Nullable Boolean useAmortized;
        private @Nullable Boolean useBlended;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetCostTypes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeCredit = defaults.includeCredit;
    	      this.includeDiscount = defaults.includeDiscount;
    	      this.includeOtherSubscription = defaults.includeOtherSubscription;
    	      this.includeRecurring = defaults.includeRecurring;
    	      this.includeRefund = defaults.includeRefund;
    	      this.includeSubscription = defaults.includeSubscription;
    	      this.includeSupport = defaults.includeSupport;
    	      this.includeTax = defaults.includeTax;
    	      this.includeUpfront = defaults.includeUpfront;
    	      this.useAmortized = defaults.useAmortized;
    	      this.useBlended = defaults.useBlended;
        }

        public Builder includeCredit(@Nullable Boolean includeCredit) {
            this.includeCredit = includeCredit;
            return this;
        }
        public Builder includeDiscount(@Nullable Boolean includeDiscount) {
            this.includeDiscount = includeDiscount;
            return this;
        }
        public Builder includeOtherSubscription(@Nullable Boolean includeOtherSubscription) {
            this.includeOtherSubscription = includeOtherSubscription;
            return this;
        }
        public Builder includeRecurring(@Nullable Boolean includeRecurring) {
            this.includeRecurring = includeRecurring;
            return this;
        }
        public Builder includeRefund(@Nullable Boolean includeRefund) {
            this.includeRefund = includeRefund;
            return this;
        }
        public Builder includeSubscription(@Nullable Boolean includeSubscription) {
            this.includeSubscription = includeSubscription;
            return this;
        }
        public Builder includeSupport(@Nullable Boolean includeSupport) {
            this.includeSupport = includeSupport;
            return this;
        }
        public Builder includeTax(@Nullable Boolean includeTax) {
            this.includeTax = includeTax;
            return this;
        }
        public Builder includeUpfront(@Nullable Boolean includeUpfront) {
            this.includeUpfront = includeUpfront;
            return this;
        }
        public Builder useAmortized(@Nullable Boolean useAmortized) {
            this.useAmortized = useAmortized;
            return this;
        }
        public Builder useBlended(@Nullable Boolean useBlended) {
            this.useBlended = useBlended;
            return this;
        }        public BudgetCostTypes build() {
            return new BudgetCostTypes(includeCredit, includeDiscount, includeOtherSubscription, includeRecurring, includeRefund, includeSubscription, includeSupport, includeTax, includeUpfront, useAmortized, useBlended);
        }
    }
}
