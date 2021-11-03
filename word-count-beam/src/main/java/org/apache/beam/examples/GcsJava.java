package org.apache.beam.examples;

import com.google.auth.oauth2.GoogleCredentials;

import com.google.cloud.ReadChannel;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.apache.beam.examples.subprocess.utils.CalActivityCodeUtils;
import org.apache.beam.examples.subprocess.utils.CalGcsHelper;
import org.apache.beam.examples.subprocess.utils.TCSoptions;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.MapElements;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.checkerframework.checker.nullness.Opt;
//import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// mvn test -Dtest=CalActivityCodeUtilsTest


public class GcsJava {

    private static final Logger LOGGER = LoggerFactory.getLogger(GcsJava.class);

    public static void main(String[] args) {

        String b = "CONTACT-DETAIL-EVENT";

        String[] argu = {
                "--calRefProjectId=eplus-dat-ide-01-b3f9",
                "--calRefBucketName=cal-df-test",
                "--calRefObjectName=beam_example/data_cal.csv"
        };

        CalGcsHelper calGcsHelper=new CalGcsHelper();
        CalActivityCodeUtils cal=new CalActivityCodeUtils(calGcsHelper);

        TCSoptions Options = PipelineOptionsFactory.fromArgs(argu).as(TCSoptions.class);
        Integer length=cal.initialize(Options);

        LOGGER.info("value for a key lenth of hashmap {} :  raf data vlue correspond{}",length ,cal.getRefData());

//        String a = "CUS-TAX-INFO-EVENT,dikm,1\nCUS-TAX-INFO-EVENTss,asdf,1\nCUSTXIF-EVT,lala,1\n";
//        cal.populateCache(a);
//        LOGGER.info("the returned value ot populate is {} ");

    }
}