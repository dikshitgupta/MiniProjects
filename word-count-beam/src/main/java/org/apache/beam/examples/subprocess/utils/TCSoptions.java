package org.apache.beam.examples.subprocess.utils;

import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.Validation;
import org.apache.beam.sdk.options.ValueProvider;

public interface TCSoptions extends PipelineOptions {
    /** Extends the PipelineOptions to include like pubSub topic, etc. */
//    @Description(
//            "The Cloud Pub/Sub subscription to consume from. "
//                    + "Format: projects/<project-id>/subscriptions/<subscription-name>.")
//    @Validation.Required
//    ValueProvider<String> getInputSubscription();
//
//    void setInputSubscription(ValueProvider<String> inputSubscription);

    @Description("Variable to get CalRef ProjectId")
    ValueProvider<String> getCalRefProjectId();

    void setCalRefProjectId(ValueProvider<String> calRefProjectId);

    @Description("Variable to get CalRef BucketName ")
    ValueProvider<String> getCalRefBucketName();

    void setCalRefBucketName(ValueProvider<String> calRefBucketName);

    @Description("Variable to get CalRef ObjectName ")
    ValueProvider<String> getCalRefObjectName();

    void setCalRefObjectName(ValueProvider<String> calRefObjectName);

//
//    @Description("Output topic to send back classified TCS messages")
//    @Validation.Required
//    ValueProvider<String> getOutputTopic();
//
//    void setOutputTopic(ValueProvider<String> outputTopic);
//
//    @Description(
//            "Pub/Sub topic to write the invalid messages to."
//                    + "Format: projects/<project-id>/subscriptions/<subscription-name>.")
//    @Validation.Required
//    ValueProvider<String> getInvalidMessagesTopic();
//
//    void setInvalidMessagesTopic(ValueProvider<String> inputTopic);
//
//    @Description("Path to the reference file on GCS, on the form gs://BUCKET/FILE_NAME")
//    @Validation.Required
//    ValueProvider<String> getGcsPathRefTableFile();
//
//    void setGcsPathRefTableFile(ValueProvider<String> gcsPathRefTable);
}

