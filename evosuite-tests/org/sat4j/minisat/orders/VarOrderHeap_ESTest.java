/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:47:31 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.Heap;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomLiteralSelectionStrategy;
import org.sat4j.minisat.orders.UserFixedPhaseSelectionStrategy;
import org.sat4j.minisat.orders.VarOrderHeap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VarOrderHeap_ESTest extends VarOrderHeap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      lits0.getFromPool(29);
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      assertEquals("tries to first branch on a single phase watched unassigned variable (pure literal if using a CB data structure) else VSIDS from MiniSAT", pureOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      lits0.nextFreeVarId(true);
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      Lits lits1 = new Lits();
      pureOrder0.setLits(lits1);
      pureOrder0.init();
      assertEquals(0, pureOrder0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      iLits0.nextFreeVarId(true);
      pureOrder0.setLits(iLits0);
      pureOrder0.init();
      pureOrder0.updateActivity(1);
      int int0 = pureOrder0.numberOfInterestingVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      levelBasedVarOrderHeap0.setVarDecay(614.0465691012276);
      levelBasedVarOrderHeap0.varDecayActivity();
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("\"!mPw!");
      varOrderHeap0.printStat(mockPrintWriter0, "\"!mPw!");
      assertEquals(0, varOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UserFixedPhaseSelectionStrategy userFixedPhaseSelectionStrategy0 = new UserFixedPhaseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(userFixedPhaseSelectionStrategy0);
      levelBasedVarOrderHeap0.updateActivity(0);
      double double0 = levelBasedVarOrderHeap0.varActivity(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      double double0 = pureOrder0.varActivity(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      pureOrder0.undo(0);
      int int0 = pureOrder0.select();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      pureOrder0.setLits(iLits0);
      ILits iLits1 = pureOrder0.getVocabulary();
      assertEquals(0, iLits1.nVars());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      lits0.getFromPool(1);
      pureOrder0.setLits(lits0);
      ILits iLits0 = pureOrder0.getVocabulary();
      assertSame(iLits0, lits0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      Heap heap0 = varOrderHeap0.createHeap((double[]) null);
      assertTrue(heap0.empty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      // Undeclared exception!
      try { 
        varOrderHeap0.varActivity(98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 49
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      // Undeclared exception!
      try { 
        varOrderHeap0.updateVarAtDecisionLevel(814);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.updateVar(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.updateVar((-2215));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1108
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.updateActivity((-34));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -34
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.undo(16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      // Undeclared exception!
      try { 
        pureOrder0.undo(99);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PureOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      pureOrder0.undo(1);
      // Undeclared exception!
      try { 
        pureOrder0.select();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.sat4j.minisat.orders.AbstractPhaserecordingSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      // Undeclared exception!
      try { 
        varOrderHeap0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap((IPhaseSelectionStrategy) null);
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.assignLiteral(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(randomLiteralSelectionStrategy0);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 7693;
      varOrderHeap0.activity = doubleArray0;
      int int0 = varOrderHeap0.numberOfInterestingVariables();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      iLits0.nextFreeVarId(true);
      pureOrder0.setLits(iLits0);
      pureOrder0.init();
      pureOrder0.undo(1);
      pureOrder0.updateVar(2);
      assertEquals(0, pureOrder0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      pureOrder0.setLits(iLits0);
      pureOrder0.init();
      pureOrder0.updateVar(1);
      assertEquals(20, pureOrder0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      pureOrder0.setLits(iLits0);
      pureOrder0.init();
      pureOrder0.undo(0);
      iLits0.satisfies(0);
      int int0 = pureOrder0.select();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      lits0.getFromPool(1);
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      int int0 = pureOrder0.select();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      String string0 = varOrderHeap0.toString();
      assertEquals("VSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double[] doubleArray0 = varOrderHeap0.getVariableHeuristics();
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      pureOrder0.updateVarAtDecisionLevel(2);
      assertEquals(20, pureOrder0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      levelBasedVarOrderHeap0.setPhaseSelectionStrategy(phaseInLastLearnedClauseSelectionStrategy0);
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      ILits iLits0 = pureOrder0.getVocabulary();
      assertNull(iLits0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      pureOrder0.assignLiteral((-494));
      assertEquals(0, pureOrder0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      double double0 = pureOrder0.varActivity(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = (PhaseInLastLearnedClauseSelectionStrategy)levelBasedVarOrderHeap0.getPhaseSelectionStrategy();
      assertEquals("phase appearing in latest learned clause", phaseInLastLearnedClauseSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      Lits lits0 = new Lits();
      pureOrder0.setLits(lits0);
      pureOrder0.init();
      pureOrder0.undo(0);
      pureOrder0.undo(0);
      assertEquals(0, pureOrder0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      // Undeclared exception!
      try { 
        pureOrder0.printStat((PrintWriter) null, "VSIDS like heuristics from MiniSAT using a heap ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }
}