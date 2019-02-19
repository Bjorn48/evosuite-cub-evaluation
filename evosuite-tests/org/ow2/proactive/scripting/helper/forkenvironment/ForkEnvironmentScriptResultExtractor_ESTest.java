/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:56:44 GMT 2019
 */

package org.ow2.proactive.scripting.helper.forkenvironment;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ow2.proactive.scripting.helper.forkenvironment.ForkEnvironmentScriptResultExtractor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForkEnvironmentScriptResultExtractor_ESTest extends ForkEnvironmentScriptResultExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForkEnvironmentScriptResultExtractor forkEnvironmentScriptResultExtractor0 = new ForkEnvironmentScriptResultExtractor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("preJavaHomeCmd", "preJavaHomeCmd");
      String[] stringArray0 = forkEnvironmentScriptResultExtractor0.getJavaPrefixCommand(hashMap0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ForkEnvironmentScriptResultExtractor forkEnvironmentScriptResultExtractor0 = new ForkEnvironmentScriptResultExtractor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("preJavaHomeCmd", forkEnvironmentScriptResultExtractor0);
      String[] stringArray0 = forkEnvironmentScriptResultExtractor0.getJavaPrefixCommand(hashMap0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ForkEnvironmentScriptResultExtractor forkEnvironmentScriptResultExtractor0 = new ForkEnvironmentScriptResultExtractor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = forkEnvironmentScriptResultExtractor0.getJavaPrefixCommand(hashMap0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ForkEnvironmentScriptResultExtractor forkEnvironmentScriptResultExtractor0 = new ForkEnvironmentScriptResultExtractor();
      String[] stringArray0 = forkEnvironmentScriptResultExtractor0.getJavaPrefixCommand((Map<String, Object>) null);
      assertEquals(0, stringArray0.length);
  }
}
