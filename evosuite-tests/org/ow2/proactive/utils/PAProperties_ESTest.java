/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:57:19 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.PAProperties;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PAProperties_ESTest extends PAProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = PAProperties.getFileEncoding();
      assertEquals("US-ASCII", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PAProperties pAProperties0 = new PAProperties();
  }
}
