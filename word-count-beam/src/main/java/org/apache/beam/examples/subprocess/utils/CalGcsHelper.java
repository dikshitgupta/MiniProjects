package org.apache.beam.examples.subprocess.utils;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class CalGcsHelper {

    public String readFromGcs(String calRefProjectId,String calRefBucketName, String calRefObjectName){

        System.out.println("IN READ FROM GCS FUNTIOn ");
        Storage storage = StorageOptions.newBuilder().setProjectId(calRefProjectId).build().getService();
        Blob blob = storage.get(BlobId.of(calRefBucketName, calRefObjectName));
        String rawCalRefData = new String(blob.getContent());
        return rawCalRefData;

    }
}
