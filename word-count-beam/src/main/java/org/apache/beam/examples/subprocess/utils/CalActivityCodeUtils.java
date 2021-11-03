package org.apache.beam.examples.subprocess.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class CalActivityCodeUtils {

    private CalGcsHelper calGcsHelper;

    public CalActivityCodeUtils(CalGcsHelper calGcsHelper) {
        this.calGcsHelper = calGcsHelper;
    }


    private static final Logger LOGGER = LoggerFactory.getLogger(CalActivityCodeUtils.class);
    private static  HashMap<String, Integer> refData = new HashMap<String, Integer>();

    public Integer initialize(TCSoptions pipelineOptions){

        String calRefProjectId  = pipelineOptions.getCalRefProjectId().get();
        String calRefBucketName = pipelineOptions.getCalRefBucketName().get();
        String calRefObjectName = pipelineOptions.getCalRefObjectName().get();

        System.out.println("IN READ Initialize function");
        String rawCalRefData= calGcsHelper.readFromGcs(calRefProjectId,calRefBucketName,calRefObjectName);
        populateCache(rawCalRefData);
        return refData.size();
    }

    private void populateCache(String rawCalRefData) {

        String[] str = rawCalRefData.split("\n");
        LOGGER.info("Length of file in populate cache {}", str.length);

        for (int i = 1; i < str.length; i++) {
            String [] arr = str[i].replace("\"","").split(",");
            Integer impLevel=99;
            String activityCode="";

            try {
                activityCode=arr[0];
                impLevel=Integer.parseInt(arr[2].replace("\"",""));
            } catch (Exception e){
                LOGGER.error("The Reference Data Unable to parse line:{}   {}  the exception message is {}",i,str[i],e);
            }
            refData.put(activityCode, impLevel);
        }
    }

    public static HashMap<String, Integer> getRefData() {
        return refData;
    }


}