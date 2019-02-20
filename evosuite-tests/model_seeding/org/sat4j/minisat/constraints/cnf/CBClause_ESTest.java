/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:26:43 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.CBClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.MandatoryLiteralListener;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.specs.VarMapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CBClause_ESTest extends CBClause_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(1);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.undo(1);
      // Undeclared exception!
      try { 
        cBClause0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.rescaleBy(0.0);
      assertEquals(0.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.setLearnt();
      cBClause0.falsified = (-2216);
      // Undeclared exception!
      try { 
        cBClause0.register();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.calcReason((-2604), vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.growTo(3714, (-989));
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(2, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      vecInt0.shrink(1887);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(2, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null, false);
      cBClause0.falsified = 7;
      cBClause0.remove();
      assertFalse(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(1403);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null, false);
      int int0 = cBClause0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null, true);
      boolean boolean0 = cBClause0.learnt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.propagate((UnitPropagationListener) null, (-1207));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush((-949));
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.locked();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.locked();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      // Undeclared exception!
      try { 
        CBClause.brandNewClause((UnitPropagationListener) null, (ILits) null, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush((-1714));
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause((IVecInt) null, (ILits) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink(2508);
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(vecInt0, (ILits) null, false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause((IVecInt) null, (ILits) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(vecInt0, (ILits) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-534));
      CBClause cBClause0 = null;
      try {
        cBClause0 = new CBClause(vecInt0, (ILits) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.assertConstraint((UnitPropagationListener) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.register();
      assertEquals(0.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush((-516));
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.toString();
      assertFalse(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.falsified = (-1);
      assertFalse(cBClause0.learnt());
      
      cBClause0.setLearnt();
      cBClause0.register();
      assertTrue(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(3249);
      // Undeclared exception!
      try { 
        CBClause.brandNewClause((UnitPropagationListener) null, (ILits) null, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.calcReason(2, vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null, false);
      vecInt0.unsafePush((-1082));
      // Undeclared exception!
      try { 
        cBClause0.calcReason((-1082), vecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.calcReason((-1), vecInt0);
      assertFalse(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush((-534));
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.simplify();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      boolean boolean0 = cBClause0.simplify();
      assertFalse(cBClause0.learnt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(3235);
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.assertConstraintIfNeeded((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.forwardActivity(0.0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.canBeSatisfiedByCountingLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.size();
      assertFalse(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.toString((VarMapper) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.get((-307));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -307
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.setActivity(0.0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.getAssertionLevel(vecInt0, (-4426));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.rescaleBy((-1.0));
      assertEquals(-0.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.calcReasonOnTheFly((-3744), vecInt0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.propagatePI((MandatoryLiteralListener) null, 57);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.requiredNumberOfSatisfiedLiterals();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      boolean boolean0 = cBClause0.learnt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.incActivity(2.0);
      assertEquals(2.0, cBClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.isSatisfied();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      cBClause0.setLearnt();
      // Undeclared exception!
      try { 
        cBClause0.register();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      double double0 = cBClause0.getActivity();
      assertEquals(0.0, double0, 0.01);
      assertFalse(cBClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        cBClause0.canBePropagatedMultipleTimes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = CBClause.brandNewClause((UnitPropagationListener) null, (ILits) null, vecInt0);
      // Undeclared exception!
      try { 
        cBClause0.remove((UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.CBClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      CBClause cBClause0 = new CBClause(vecInt0, (ILits) null);
      Constr constr0 = cBClause0.toConstraint();
      assertFalse(constr0.learnt());
  }
}
