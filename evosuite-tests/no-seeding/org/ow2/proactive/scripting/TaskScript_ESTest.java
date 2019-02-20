/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:41:30 GMT 2019
 */

package org.ow2.proactive.scripting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.Reader;
import java.io.Serializable;
import java.time.temporal.ChronoField;
import java.util.function.BiFunction;
import javax.script.Bindings;
import javax.script.SimpleBindings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import org.ow2.proactive.scripting.Script;
import org.ow2.proactive.scripting.ScriptResult;
import org.ow2.proactive.scripting.ScriptTest;
import org.ow2.proactive.scripting.TaskScript;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TaskScript_ESTest extends TaskScript_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      Object object0 = new Object();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      simpleBindings0.put("result", object0);
      ScriptResult<Serializable> scriptResult0 = taskScript0.getResult("] using context classloader ", simpleBindings0);
      assertTrue(scriptResult0.errorOccured());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      File file0 = MockFile.createTempFile("F`m", "result");
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests(file0);
      TaskScript taskScript0 = new TaskScript(scriptTest_ScriptForTests0);
      String string0 = taskScript0.getId();
      assertEquals("/tmp/F`m0result", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("", "");
      TaskScript taskScript0 = new TaskScript(scriptTest_ScriptForTests0);
      String string0 = taskScript0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Script<ChronoField> script0 = (Script<ChronoField>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        taskScript0.getResult(object0, (Bindings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.TaskScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Script<Integer> script0 = (Script<Integer>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      // Undeclared exception!
      try { 
        taskScript0.getReader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TaskScript taskScript0 = null;
      try {
        taskScript0 = new TaskScript((Script) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleBindings simpleBindings0 = new SimpleBindings();
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      ScriptResult<Serializable> scriptResult0 = taskScript0.getResult(simpleBindings0, simpleBindings0);
      assertNull(scriptResult0.getOutput());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleBindings simpleBindings0 = new SimpleBindings();
      Script<ChronoField> script0 = (Script<ChronoField>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      ScriptResult<Serializable> scriptResult0 = taskScript0.getResult((Object) null, simpleBindings0);
      assertNull(scriptResult0.getHostname());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn(">x0`\"'C").when(script0).getScript();
      doReturn(">x0`\"'C").when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      simpleBindings0.put("result", (Object) taskScript0);
      BiFunction<String, Object, Integer> biFunction0 = (BiFunction<String, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      simpleBindings0.replaceAll(biFunction0);
      ScriptResult<Serializable> scriptResult0 = taskScript0.getResult(taskScript0, simpleBindings0);
      assertNull(scriptResult0.getOutput());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn(">x0`\"'C").when(script0).getScript();
      doReturn(">x0`\"'C").when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      simpleBindings0.put("result", (Object) taskScript0);
      ScriptResult<Serializable> scriptResult0 = taskScript0.getResult(taskScript0.DEFAULT_OUTPUT_MAX_SIZE, simpleBindings0);
      assertFalse(scriptResult0.errorOccured());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Script<Integer> script0 = (Script<Integer>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      ScriptResult<Serializable> scriptResult0 = taskScript0.getResult("result", simpleBindings0);
      assertNull(scriptResult0.getOutput());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn(">x0`\"'C").when(script0).getScript();
      doReturn(">x0`\"'C").when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      Reader reader0 = taskScript0.getReader();
      assertNotNull(reader0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn(">x0`\"'C").when(script0).getScript();
      doReturn(">x0`\"'C").when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      taskScript0.prepareSpecialBindings(simpleBindings0);
      assertEquals(1048576, Script.DEFAULT_OUTPUT_MAX_SIZE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Script<Long> script0 = (Script<Long>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      String string0 = taskScript0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      TaskScript taskScript0 = new TaskScript(script0);
      String string0 = taskScript0.getDefaultScriptName();
      assertEquals("TaskScript", string0);
  }
}
