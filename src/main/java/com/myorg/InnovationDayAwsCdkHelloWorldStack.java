package com.myorg;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;
import software.amazon.awscdk.services.s3.Bucket;

public class InnovationDayAwsCdkHelloWorldStack extends Stack {
    public InnovationDayAwsCdkHelloWorldStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public InnovationDayAwsCdkHelloWorldStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here
        Bucket.Builder.create(this, "innovationDayBucket")
                .versioned(true).build();
    }
}
