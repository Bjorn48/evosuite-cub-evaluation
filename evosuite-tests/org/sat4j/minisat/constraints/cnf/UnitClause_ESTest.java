/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:52:05 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.MandatoryLiteralListener;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.specs.VarMapper;
import org.sat4j.tools.DotSearchTracing;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnitClause_ESTest extends UnitClause_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(37);
      VecInt vecInt0 = new VecInt(37);
      unitClause0.calcReasonOnTheFly(37, (IVecInt) null, vecInt0);
      assertTrue(vecInt0.isEmpty());
      assertEquals(0, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3463);
      unitClause0.activity = (double) (byte) (-83);
      double double0 = unitClause0.getActivity();
      assertEquals((-83.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(0);
      int int0 = unitClause0.get(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1);
      int int0 = unitClause0.get((-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-1));
      // Undeclared exception!
      try { 
        unitClause0.remove((UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-1));
      ClauseOnlyLearning<MixedDataStructureSingleWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      PureOrder pureOrder0 = new PureOrder((-1));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(clauseOnlyLearning0, mixedDataStructureSingleWL0, searchParams0, pureOrder0, miniSATRestarts0, (ILogAble) null);
      // Undeclared exception!
      try { 
        unitClause0.remove(solver0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      UnitClause unitClause0 = new UnitClause(0);
      // Undeclared exception!
      try { 
        unitClause0.calcReason((-1), vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      UnitClause unitClause0 = new UnitClause(0);
      unitClause0.calcReason((-1), vecInt0);
      assertEquals(1, vecInt0.size());
      assertEquals(1, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-3905));
      unitClause0.calcReason((-3905), (IVecInt) null);
      assertFalse(unitClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1);
      boolean boolean0 = unitClause0.learnt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(0);
      ClauseOnlyLearning<MixedDataStructureSingleWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VarOrderHeap varOrderHeap0 = mock(VarOrderHeap.class, new ViolatedAssumptionAnswer());
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(clauseOnlyLearning0, mixedDataStructureSingleWL0, randomWalkDecorator0, lubyRestarts0);
      unitClause0.assertConstraint(solver0);
      assertFalse(unitClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(0);
      String string0 = unitClause0.toString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3463);
      DotSearchTracing<String> dotSearchTracing0 = new DotSearchTracing<String>("Not implemented yet!");
      String string0 = unitClause0.toString((VarMapper) dotSearchTracing0);
      assertEquals("-1731", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3368);
      // Undeclared exception!
      try { 
        unitClause0.get(3368);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-258));
      int int0 = unitClause0.get((-258));
      assertEquals((-258), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(15);
      ClauseOnlyLearning<MixedDataStructureSingleWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      PureOrder pureOrder0 = new PureOrder(15);
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(clauseOnlyLearning0, mixedDataStructureSingleWL0, searchParams0, pureOrder0, miniSATRestarts0, (ILogAble) null);
      unitClause0.remove(solver0);
      assertFalse(solver0.isSolverKeptHot());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3473);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      unitClause0.calcReasonOnTheFly((-1), vecInt0, vecInt0);
      assertEquals(2, vecInt0.size());
      assertEquals(3472, vecInt0.last());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1289);
      unitClause0.setActivity(1289);
      double double0 = unitClause0.getActivity();
      assertEquals(1289.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3463);
      // Undeclared exception!
      try { 
        unitClause0.propagate((UnitPropagationListener) null, 3463);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3463);
      boolean boolean0 = unitClause0.canBeSatisfiedByCountingLiterals();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-101));
      unitClause0.register();
      assertFalse(unitClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1289);
      boolean boolean0 = unitClause0.canBePropagatedMultipleTimes();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3463);
      // Undeclared exception!
      try { 
        unitClause0.locked();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-2831));
      int int0 = unitClause0.getAssertionLevel((IVecInt) null, (-2831));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3463);
      // Undeclared exception!
      try { 
        unitClause0.rescaleBy(3463);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-1263));
      boolean boolean0 = unitClause0.simplify();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause((-1407));
      String string0 = unitClause0.toString((VarMapper) null);
      assertEquals("--704", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1289);
      // Undeclared exception!
      try { 
        unitClause0.setLearnt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(0);
      ClauseOnlyLearning<MixedDataStructureSingleWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VarOrderHeap varOrderHeap0 = mock(VarOrderHeap.class, new ViolatedAssumptionAnswer());
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(clauseOnlyLearning0, mixedDataStructureSingleWL0, randomWalkDecorator0, lubyRestarts0);
      unitClause0.assertConstraintIfNeeded(solver0);
      assertFalse(unitClause0.learnt());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(0);
      unitClause0.forwardActivity(4559.0);
      assertTrue(unitClause0.canBeSatisfiedByCountingLiterals());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(583);
      unitClause0.incActivity(583);
      assertFalse(unitClause0.simplify());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1289);
      double double0 = unitClause0.getActivity();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1);
      // Undeclared exception!
      try { 
        unitClause0.propagatePi((MandatoryLiteralListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3463);
      boolean boolean0 = unitClause0.isSatisfied();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(3343);
      int int0 = unitClause0.requiredNumberOfSatisfiedLiterals();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UnitClause unitClause0 = new UnitClause(1289);
      int int0 = unitClause0.size();
      assertEquals(1, int0);
  }
}
