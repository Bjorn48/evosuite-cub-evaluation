/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:42:22 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolverService;
import org.sat4j.specs.Lbool;
import org.sat4j.specs.RandomAccessModel;
import org.sat4j.tools.TextOutputTracing;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextOutputTracing_ESTest extends TextOutputTracing_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      Integer integer0 = new Integer(0);
      Object object0 = new Object();
      hashMap0.put(integer0, object0);
      textOutputTracing0.propagating(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      Object object0 = new Object();
      hashMap0.put((Integer) Integer.MIN_VALUE, object0);
      textOutputTracing0.propagating(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      Integer integer0 = new Integer(1230);
      hashMap0.put(integer0, "-1");
      textOutputTracing0.propagating(1230);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>((Map<Integer, Object>) null);
      textOutputTracing0.propagating(2362);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.learnUnit(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.delete((IConstr) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, MixedDataStructureDanielWL> hashMap0 = new HashMap<Integer, MixedDataStructureDanielWL>();
      TextOutputTracing<MixedDataStructureDanielWL> textOutputTracing0 = new TextOutputTracing<MixedDataStructureDanielWL>(hashMap0);
      textOutputTracing0.restarting();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>((Map<Integer, String>) null);
      Lbool lbool0 = Lbool.TRUE;
      textOutputTracing0.end(lbool0);
      assertEquals("T", lbool0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.backtracking(2362);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      TextOutputTracing<Integer> textOutputTracing0 = new TextOutputTracing<Integer>(hashMap0);
      textOutputTracing0.solutionFound((int[]) null, (RandomAccessModel) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.enqueueing(0, (IConstr) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      ISolverService iSolverService0 = mock(ISolverService.class, new ViolatedAssumptionAnswer());
      textOutputTracing0.init(iSolverService0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.conflictFound(2963);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextOutputTracing<Integer> textOutputTracing0 = new TextOutputTracing<Integer>((Map<Integer, Integer>) null);
      textOutputTracing0.start();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      TextOutputTracing<String> textOutputTracing0 = new TextOutputTracing<String>(hashMap0);
      textOutputTracing0.beginLoop();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Integer, MixedDataStructureDanielWL> hashMap0 = new HashMap<Integer, MixedDataStructureDanielWL>();
      TextOutputTracing<MixedDataStructureDanielWL> textOutputTracing0 = new TextOutputTracing<MixedDataStructureDanielWL>(hashMap0);
      textOutputTracing0.conflictFound((IConstr) null, 57, 57);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.learn((IConstr) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.cleaning();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      TextOutputTracing<Integer> textOutputTracing0 = new TextOutputTracing<Integer>(hashMap0);
      textOutputTracing0.adding((-2663));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      TextOutputTracing<Integer> textOutputTracing0 = new TextOutputTracing<Integer>(hashMap0);
      textOutputTracing0.assuming(2963);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TextOutputTracing<Object> textOutputTracing0 = new TextOutputTracing<Object>(hashMap0);
      textOutputTracing0.backjump((-2663));
  }
}
