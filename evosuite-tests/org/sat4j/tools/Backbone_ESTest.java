/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:45:23 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.core.SolverStats;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.Backbone;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.IBackboneProgressListener;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Commander;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Backbone_ESTest extends Backbone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VecInt vecInt0 = new VecInt(1, (-2846));
      int[] intArray0 = new int[9];
      intArray0[2] = (-2846);
      Backbone.Backboner.removeVarNotPresentAndSatisfiedLits(intArray0, vecInt0, 3484);
      assertTrue(vecInt0.isEmpty());
      assertEquals(0, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt(280, 50);
      int[] intArray0 = new int[3];
      Backbone.Backboner.removeVarNotPresentAndSatisfiedLits(intArray0, vecInt0, 280);
      assertEquals(0, vecInt0.size());
      assertTrue(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, 50);
      int[] intArray0 = new int[6];
      vecInt0.shrink(1617);
      Backbone.Backboner.removeVarNotPresentAndSatisfiedLits(intArray0, vecInt0, 2108);
      assertFalse(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VecInt vecInt0 = new VecInt(280, 0);
      int[] intArray0 = new int[2];
      intArray0[1] = (-347);
      Backbone.Backboner.removeVarNotPresentAndSatisfiedLits(intArray0, vecInt0, 3352);
      assertTrue(vecInt0.isEmpty());
      assertEquals(0, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      int[] intArray0 = new int[0];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(129).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      VecInt vecInt0 = new VecInt(2202, 2202);
      IVecInt iVecInt0 = vecInt0.clone();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, iVecInt0, (IVecInt) vecInt0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Backbone$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      //  // Unstable assertion: assertEquals(1, backbone0.getNumberOfSatCalls());
      
      int[] intArray0 = new int[0];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(129).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      VecInt vecInt0 = new VecInt(129);
      backbone0.compute(iSolver0, (IVecInt) vecInt0, (IVecInt) vecInt0);
      //  // Unstable assertion: assertEquals(0, backbone0.getNumberOfSatCalls());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      backbone0.compute(iSolver0);
      assertEquals(0, backbone0.getNumberOfSatCalls());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(2196, 2196);
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) dimacsOutputSolver0, intArray0, (IVecInt) vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(2196, 2196);
      Minimal4CardinalityModel minimal4CardinalityModel0 = mock(Minimal4CardinalityModel.class, new ViolatedAssumptionAnswer());
      doReturn((-1244)).when(minimal4CardinalityModel0).nVars();
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) minimal4CardinalityModel0, intArray0, (IVecInt) vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -1244
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      int[] intArray0 = new int[4];
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) statisticsSolver0, intArray0, (IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) statisticsSolver0, intArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((-5)).when(iSolver0).nVars();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -5
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      int[] intArray0 = new int[10];
      intArray0[5] = Integer.MIN_VALUE;
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) minimal4CardinalityModel0, intArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // bitIndex < 0: -2147483648
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(48, 48).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      doReturn((IConstr) null).when(iSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      int[] intArray1 = new int[4];
      intArray1[1] = 1711;
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      Backbone backbone0 = Backbone.ibb();
      try { 
        backbone0.compute((ISolver) dimacsStringSolver0, (IVecInt) null, (IVecInt) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Backbone backbone0 = Backbone.instance();
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[4];
      Minimal4CardinalityModel minimal4CardinalityModel0 = mock(Minimal4CardinalityModel.class, new ViolatedAssumptionAnswer());
      minimal4CardinalityModelArray0[0] = minimal4CardinalityModel0;
      minimal4CardinalityModelArray0[1] = minimal4CardinalityModel0;
      minimal4CardinalityModelArray0[2] = minimal4CardinalityModel0;
      minimal4CardinalityModelArray0[3] = minimal4CardinalityModel0;
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(true, minimal4CardinalityModelArray0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      SolutionFoundListener solutionFoundListener0 = mock(SolutionFoundListener.class, new ViolatedAssumptionAnswer());
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(manyCore0, iVecInt0, solutionFoundListener0);
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) abstractMinimalModel0, iVecInt0, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      int[] intArray0 = new int[6];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((-850)).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      VecInt vecInt0 = new VecInt(2202, 2202);
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) vecInt0, (IVecInt) vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -850
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(2).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      VecInt vecInt0 = new VecInt(2);
      vecInt0.pop();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) vecInt0, (IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      VecInt vecInt0 = new VecInt();
      try { 
        backbone0.compute((ISolver) statisticsSolver0, (IVecInt) vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // That solver only compute statistics
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Backbone backbone0 = Backbone.instance();
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[4];
      Minimal4CardinalityModel minimal4CardinalityModel0 = mock(Minimal4CardinalityModel.class, new ViolatedAssumptionAnswer());
      minimal4CardinalityModelArray0[0] = minimal4CardinalityModel0;
      minimal4CardinalityModelArray0[1] = minimal4CardinalityModel0;
      minimal4CardinalityModelArray0[2] = minimal4CardinalityModel0;
      minimal4CardinalityModelArray0[3] = minimal4CardinalityModel0;
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(true, minimal4CardinalityModelArray0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      SolutionFoundListener solutionFoundListener0 = mock(SolutionFoundListener.class, new ViolatedAssumptionAnswer());
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(manyCore0, iVecInt0, solutionFoundListener0);
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) abstractMinimalModel0, iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      int[] intArray0 = new int[10];
      VecInt vecInt0 = new VecInt(2202, 2202);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((-1)).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -1
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      VecInt vecInt0 = new VecInt(2202, 2202);
      int[] intArray0 = new int[2];
      intArray0[1] = Integer.MIN_VALUE;
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(2202).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) vecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // bitIndex < 0: -2147483648
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Backbone backbone0 = Backbone.instance();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      try { 
        backbone0.compute((ISolver) dimacsStringSolver0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Backbone backbone0 = Backbone.instance();
      Solver<CardinalityDataStructureYanMax>[] solverArray0 = (Solver<CardinalityDataStructureYanMax>[]) Array.newInstance(Solver.class, 0);
      ManyCore<Solver<CardinalityDataStructureYanMax>> manyCore0 = new ManyCore<Solver<CardinalityDataStructureYanMax>>(true, solverArray0);
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) manyCore0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((-74)).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -74
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ModelIterator modelIterator0 = new ModelIterator(dimacsStringSolver0, (-710L));
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) modelIterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Formula is UNSAT!
         //
         verifyException("org.sat4j.tools.Backbone", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      int[] intArray0 = new int[10];
      VecInt vecInt0 = new VecInt(2202, 2202);
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(2202).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) vecInt0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Backbone$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) null, (IVecInt) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Formula is UNSAT!
         //
         verifyException("org.sat4j.tools.Backbone", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Formula is UNSAT!
         //
         verifyException("org.sat4j.tools.Backbone", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(2).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      doReturn((IConstr) null).when(iSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(iSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      IVecInt iVecInt0 = backbone0.compute(iSolver0);
      assertEquals(0, iVecInt0.last());
      assertEquals(1, backbone0.getNumberOfSatCalls());
      assertEquals(8, iVecInt0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[7];
      Backbone backbone0 = Backbone.instance();
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(iSolver0).nVars();
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Backbone$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 299;
      Backbone backbone0 = Backbone.ibb();
      Minimal4CardinalityModel minimal4CardinalityModel0 = mock(Minimal4CardinalityModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null).when(minimal4CardinalityModel0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, false).when(minimal4CardinalityModel0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(5305, 2607).when(minimal4CardinalityModel0).nVars();
      doReturn(intArray0).when(minimal4CardinalityModel0).primeImplicant();
      doReturn(false, false).when(minimal4CardinalityModel0).removeConstr(any(org.sat4j.specs.IConstr.class));
      Commander commander0 = new Commander();
      ClausalCardinalitiesDecorator<Minimal4CardinalityModel> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0, commander0);
      IVecInt iVecInt0 = backbone0.compute((ISolver) clausalCardinalitiesDecorator0, intArray0);
      assertEquals(2, backbone0.getNumberOfSatCalls());
      assertEquals(1, iVecInt0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VecInt vecInt0 = new VecInt(299, 299);
      int[] intArray0 = new int[1];
      intArray0[0] = 299;
      Backbone.Backboner.removeVarNotPresentAndSatisfiedLits(intArray0, vecInt0, 299);
      Backbone backbone0 = Backbone.ibb();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(299);
      dimacsStringSolver0.addClause((IVecInt) vecInt0, 1);
      SolverStats solverStats0 = new SolverStats();
      solverStats0.incStarts();
      solverStats0.incRootSimplifications();
      solverStats0.incDecisions();
      solverStats0.incConflicts();
      solverStats0.toMap();
      Minimal4CardinalityModel minimal4CardinalityModel0 = mock(Minimal4CardinalityModel.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null, (IConstr) null).when(minimal4CardinalityModel0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, false).when(minimal4CardinalityModel0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(5305, 2607).when(minimal4CardinalityModel0).nVars();
      doReturn(intArray0).when(minimal4CardinalityModel0).primeImplicant();
      doReturn(false, false).when(minimal4CardinalityModel0).removeConstr(any(org.sat4j.specs.IConstr.class));
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      Commander commander0 = new Commander();
      ClausalCardinalitiesDecorator<Minimal4CardinalityModel> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0, commander0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(clausalCardinalitiesDecorator0);
      int[] intArray1 = new int[1];
      intArray1[0] = 299;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Backbone.Backboner.removeVarNotPresentAndSatisfiedLits(intArray1, vecInt0, 5709);
      assertEquals(0, vecInt0.size());
      
      IVecInt iVecInt0 = backbone0.compute((ISolver) clausalCardinalitiesDecorator0, intArray0);
      assertFalse(iVecInt0.equals((Object)vecInt0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Backbone backbone0 = Backbone.instance();
      int[] intArray0 = new int[1];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(98).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      VecInt vecInt0 = new VecInt(98);
      vecInt0.shrinkTo(98);
      // Undeclared exception!
      try { 
        backbone0.compute(iSolver0, (IVecInt) vecInt0, (IVecInt) vecInt0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Backbone$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[0];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(2).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      VecInt vecInt0 = new VecInt(2196, 2196);
      IVecInt iVecInt0 = backbone0.compute(iSolver0, (IVecInt) vecInt0, (IVecInt) vecInt0);
      assertEquals(2196, iVecInt0.size());
      assertEquals(0, backbone0.getNumberOfSatCalls());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      //  // Unstable assertion: assertEquals(1, backbone0.getNumberOfSatCalls());
      
      int[] intArray0 = new int[6];
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      VecInt vecInt0 = new VecInt(intArray0);
      backbone0.compute((ISolver) statisticsSolver0, intArray0, (IVecInt) vecInt0);
      //  // Unstable assertion: assertEquals(0, backbone0.getNumberOfSatCalls());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[8];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(22, 22).when(iSolver0).nVars();
      doReturn(intArray0).when(iSolver0).primeImplicant();
      doReturn((IConstr) null).when(iSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(iSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      backbone0.compute(iSolver0, intArray0);
      assertEquals(1, backbone0.getNumberOfSatCalls());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Backbone backbone0 = Backbone.ibb();
      int[] intArray0 = new int[10];
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) null, intArray0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Backbone$Backboner", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Backbone backbone0 = Backbone.bb();
      // Undeclared exception!
      try { 
        backbone0.compute((ISolver) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Backbone", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Backbone backbone0 = Backbone.instance((IBackboneProgressListener) null, true);
      assertEquals(0, backbone0.getNumberOfSatCalls());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Backbone backbone0 = Backbone.instance();
      int int0 = backbone0.getNumberOfSatCalls();
      assertEquals(0, int0);
  }
}
