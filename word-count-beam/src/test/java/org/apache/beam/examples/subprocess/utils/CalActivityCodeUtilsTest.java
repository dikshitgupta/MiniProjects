package org.apache.beam.examples.subprocess.utils;

import org.apache.beam.examples.subprocess.utils.CalActivityCodeUtils;
import org.apache.beam.examples.subprocess.utils.TCSoptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class CalActivityCodeUtilsTest {

    String[] argu = {
            "--calRefProjectId=eplus-dat",
            "--calRefBucketName=cal-df-test",
            "--calRefObjectName=beam_example/data_cal.csv"
    };

    String dummyrefdata = "column1,column2,column3\nCUS-TAX-INFO-EVENT,column2,1\nCUS-STATUS-EVENT,column2,1\nCUS-BASIC-EVENT,column2,1\nCUS-ADDRESS-EVENT,column2,1\n" +
            "CONTACT-DETAIL-EVENT,column2,1\nCUS-PREF-EVENT-EVENT,column2,1\nCONTACT-DETAIL-EVENT,column2,1\nCUS-PREF-EVENT,column2,1\nCUSTOMER-SEARCH,column2,1\n" +
            "ACCOUNT-UPDATE,column2,1\nACCOUNT-CREATE,column2,1\n";
    String calRefProjectId = "eplus-dat";
    String calRefBucketName = "cal-df-test";
    String calRefObjectName = "beam_example/data_cal.csv";
    TCSoptions Options = PipelineOptionsFactory.fromArgs(argu).as(TCSoptions.class);

  @Test
  public void testInitialize() {

      CalGcsHelper calGcsHelperMock= mock(CalGcsHelper.class);
      when(calGcsHelperMock.readFromGcs(calRefProjectId,calRefBucketName,calRefObjectName)).thenReturn(dummyrefdata);
      CalActivityCodeUtils calActivityCodeUtils=new CalActivityCodeUtils(calGcsHelperMock);
      int length = calActivityCodeUtils.initialize(Options);

    System.out.printf("initialized value %d ", length);
    System.out.println("mocked method is " + calGcsHelperMock.readFromGcs(calRefProjectId,calRefBucketName,calRefObjectName));
    assertTrue(10 == calActivityCodeUtils.initialize(Options));
  }
}
