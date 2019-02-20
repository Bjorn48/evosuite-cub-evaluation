/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:31:43 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.ObjectArrayFormatter;
import org.ow2.proactive.utils.Tools;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tools_ESTest extends Tools_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("w{L}HPq4jv;#vYO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: w
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("\"");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls(" category\">");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = Tools.formatDate("'@&T:^:C");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Tools.getElapsedTime(9223372036854775807L);
      assertEquals("-34s ago", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Tools.getFormattedDate(0L);
      assertEquals("1/1/70 12:00 AM", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(9223372036854775807L, 3600000L);
      assertEquals("56m  -1ms", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Tools.formatNChar((-170), (-170), 'J');
      assertEquals("-170", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjectArrayFormatter objectArrayFormatter0 = new ObjectArrayFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      objectArrayFormatter0.setTitle(list0);
      String string0 = Tools.getStringAsArray(objectArrayFormatter0);
      assertEquals("\t java.class java.properties\n", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = Tools.formatDate("5");
      assertEquals(5000L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = Tools.formatDate("-2843");
      assertEquals((-2843000L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parseCommandLine((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.logAvailableScriptEngines((Logger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getStringAsArray((ObjectArrayFormatter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getHostURL((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getHostURL(" +");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 0:  +
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      Tools.formatNChar(2147440699, 2147440699, 'Z');
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.formatDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.dataSpaceConfigPropertyToUrls((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Logger logger0 = Logger.getRootLogger();
      Tools.logAvailableScriptEngines(logger0);
      assertFalse(logger0.isDebugEnabled());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("mn ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period length isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("s ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period length isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("16115d 20h ago");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: a
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period string isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period string is empty
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("9\"");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("Available script engines: ");
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = Tools.shellExtension();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("<~>&VPYE~e$u\nkS%O");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("syEP<$7sWk!G/} a");
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("V/6&l%");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = Tools.getHostURL("org.apache.commons.io.filefilter.AbstractFileFilter");
      assertEquals("rmi://localhost/", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = Tools.getHostURL("rmi://localhost/");
      assertEquals("rmi://localhost/", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long long0 = Tools.formatDate(":");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = Tools.formatDate(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::868");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      System.setCurrentTimeMillis(99L);
      String string0 = Tools.getElapsedTime((-1443L));
      assertEquals("1s ago", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      System.setCurrentTimeMillis(60000L);
      String string0 = Tools.getElapsedTime((-1443L));
      assertEquals("1mn ago", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = Tools.getElapsedTime(46);
      assertEquals("16115d 20h ago", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      System.setCurrentTimeMillis(10485760L);
      String string0 = Tools.getElapsedTime((-1260L));
      assertEquals("2h54mn ago", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = Tools.getFormattedDate((-513L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = Tools.getFormattedDate(782L);
      assertEquals("1/1/70 12:00 AM", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(3600L, 3600L);
      assertEquals("  0ms", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(1073741824L, 0L);
      assertEquals("12 days - 10h 15m 41s 824ms", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(1000, (-707L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(0L, 86400000L);
      assertEquals("1 day -   0ms", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = Tools.getFormattedDuration((-883L), (-883L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Tools tools0 = new Tools();
      assertEquals("", tools0.shellExtension());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ObjectArrayFormatter objectArrayFormatter0 = new ObjectArrayFormatter();
      // Undeclared exception!
      try { 
        Tools.getStringAsArray(objectArrayFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Title array does not contain anything !
         //
         verifyException("org.ow2.proactive.utils.ObjectArrayFormatter", e);
      }
  }
}
