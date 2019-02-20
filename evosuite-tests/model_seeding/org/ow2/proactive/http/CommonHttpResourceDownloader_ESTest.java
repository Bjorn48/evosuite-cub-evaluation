/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:31:39 GMT 2019
 */

package org.ow2.proactive.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ow2.proactive.http.CommonHttpResourceDownloader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommonHttpResourceDownloader_ESTest extends CommonHttpResourceDownloader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CommonHttpResourceDownloader commonHttpResourceDownloader0 = CommonHttpResourceDownloader.getInstance();
      // Undeclared exception!
      commonHttpResourceDownloader0.getResourceContent("s2+O):t", "s2+O):t", true);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CommonHttpResourceDownloader commonHttpResourceDownloader0 = CommonHttpResourceDownloader.getInstance();
      // Undeclared exception!
      commonHttpResourceDownloader0.getResource("true", "true", false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CommonHttpResourceDownloader commonHttpResourceDownloader0 = CommonHttpResourceDownloader.getInstance();
      CommonHttpResourceDownloader commonHttpResourceDownloader1 = CommonHttpResourceDownloader.getInstance();
      assertSame(commonHttpResourceDownloader1, commonHttpResourceDownloader0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CommonHttpResourceDownloader.UrlContent commonHttpResourceDownloader_UrlContent0 = new CommonHttpResourceDownloader.UrlContent("", "");
      String string0 = commonHttpResourceDownloader_UrlContent0.getFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CommonHttpResourceDownloader.UrlContent commonHttpResourceDownloader_UrlContent0 = new CommonHttpResourceDownloader.UrlContent("Content-Disposition", "O8L8?7Ct");
      String string0 = commonHttpResourceDownloader_UrlContent0.getContent();
      assertEquals("Content-Disposition", string0);
      assertEquals("O8L8?7Ct", commonHttpResourceDownloader_UrlContent0.getFileName());
  }
}
