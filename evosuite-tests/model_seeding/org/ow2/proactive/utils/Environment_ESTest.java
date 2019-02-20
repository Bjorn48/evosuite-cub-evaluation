/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:12:20 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.Environment;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Environment_ESTest extends Environment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Environment.unsetenv((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.ProcessEnvironment$Variable", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Environment.setenv((String) null, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = Environment.getPOSIXinstance();
      environment_POSIX0.libc = (Object) environment_POSIX0;
      // Undeclared exception!
      try { 
        Environment.setenv("'4j1K`", "'4j1K`", false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.ow2.proactive.utils.Environment$POSIX cannot be cast to org.ow2.proactive.utils.Environment$WinLibC
         //
         verifyException("org.ow2.proactive.utils.Environment$POSIX", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Environment.setenv("org.ow2.proactive.utils.Environment$1", "", true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = new Environment.POSIX();
      Environment.setenv("t<(BwEoQ5", "t<(BwEoQ5", false);
      Environment.setenv("t<(BwEoQ5", "t<(BwEoQ5", false);
      int int0 = Environment.setenv("", "t<(BwEoQ5", true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = new Environment.POSIX();
      Object object0 = new Object();
      environment_POSIX0.libc = object0;
      // Undeclared exception!
      try { 
        environment_POSIX0.unsetenv("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.ow2.proactive.utils.Environment$WinLibC
         //
         verifyException("org.ow2.proactive.utils.Environment$POSIX", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = new Environment.POSIX();
      int int0 = environment_POSIX0.unsetenv("org.ow2.proactive.utils.Environment$POSIX");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = new Environment.POSIX();
      int int0 = environment_POSIX0.setenv((String) null, (String) null, 3623);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = new Environment.POSIX();
      environment_POSIX0.libc = (Object) "s$vqgdO7.` 0S00mn8";
      // Undeclared exception!
      try { 
        environment_POSIX0.setenv("[Warning] could not load library 'msvcrt', skipping...", "s$vqgdO7.` 0S00mn8", 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.ow2.proactive.utils.Environment$WinLibC
         //
         verifyException("org.ow2.proactive.utils.Environment$POSIX", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Map<String, String> map0 = Environment.getenv();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Map<String, String> map0 = Environment.getwinenv();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Environment.setenv("<font color=\"#993300\"><strong>", "<font color=\"#993300\"><strong>", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Environment variable cannot contain '='
         //
         verifyException("org.ow2.proactive.utils.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = Environment.getPOSIXinstance();
      environment_POSIX0.libc = (Object) environment_POSIX0;
      // Undeclared exception!
      try { 
        Environment.unsetenv("TZ:_.u{i\":-@4");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.ow2.proactive.utils.Environment$POSIX cannot be cast to org.ow2.proactive.utils.Environment$WinLibC
         //
         verifyException("org.ow2.proactive.utils.Environment$POSIX", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Environment.POSIX environment_POSIX0 = Environment.getPOSIXinstance();
      environment_POSIX0.libc = (Object) environment_POSIX0;
      // Undeclared exception!
      try { 
        Environment.main((String[]) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.ow2.proactive.utils.Environment$POSIX cannot be cast to org.ow2.proactive.utils.Environment$WinLibC
         //
         verifyException("org.ow2.proactive.utils.Environment$POSIX", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Environment.unsetenv("TZ:_.u{i\":-@4");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Environment.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Environment environment0 = new Environment();
  }
}
