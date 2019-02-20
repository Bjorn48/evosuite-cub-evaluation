/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:33:07 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.QuadraticPrimeImplicantStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.tools.Minimal4CardinalityModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuadraticPrimeImplicantStrategy_ESTest extends QuadraticPrimeImplicantStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      SearchParams searchParams0 = new SearchParams((-382.2483), 1586);
      int[] intArray0 = new int[8];
      MiniSATLearning<MixedDataStructureDanielHT> miniSATLearning0 = new MiniSATLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(miniSATLearning0, mixedDataStructureDanielHT0, searchParams0, subsetVarOrder0, lubyRestarts0);
      solver0.qhead = 32;
      // Undeclared exception!
      try { 
        quadraticPrimeImplicantStrategy0.compute(solver0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      PureOrder pureOrder0 = new PureOrder((-35));
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, pureOrder0, miniSATRestarts0);
      solver0.newVar(128);
      int[] intArray0 = quadraticPrimeImplicantStrategy0.compute(solver0);
      assertEquals(128, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      FixedLengthLearning<MixedDataStructureDanielWLConciseBinary> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(fixedLengthLearning0, mixedDataStructureDanielWLConciseBinary0, varOrderHeap0, fixedPeriodRestarts0);
      // Undeclared exception!
      try { 
        quadraticPrimeImplicantStrategy0.setAndPropagate(solver0, 2049);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2049
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        quadraticPrimeImplicantStrategy0.compute((Solver<? extends DataStructureFactory>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.QuadraticPrimeImplicantStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        quadraticPrimeImplicantStrategy0.getPrimeImplicantAsArrayWithHoles();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Call the compute method first!
         //
         verifyException("org.sat4j.minisat.core.QuadraticPrimeImplicantStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      FixedLengthLearning<MixedDataStructureDanielWLConciseBinary> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      PureOrder pureOrder0 = new PureOrder();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(fixedLengthLearning0, mixedDataStructureDanielWLConciseBinary0, pureOrder0, fixedPeriodRestarts0);
      int[] intArray0 = quadraticPrimeImplicantStrategy0.compute(solver0);
      int[] intArray1 = quadraticPrimeImplicantStrategy0.getPrimeImplicantAsArrayWithHoles();
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      FixedLengthLearning<ClausalDataStructureWL> fixedLengthLearning0 = new FixedLengthLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(fixedLengthLearning0, clausalDataStructureWL0, naturalStaticOrder0, arminRestarts0);
      solver0.verbose = true;
      int[] intArray0 = quadraticPrimeImplicantStrategy0.compute(solver0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      SearchParams searchParams0 = new SearchParams(2985, (-380.64527), 2985, 2985);
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      EMARestarts eMARestarts0 = new EMARestarts();
      NoLearningNoHeuristics<MixedDataStructureDanielWL> noLearningNoHeuristics0 = new NoLearningNoHeuristics<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<Minimal4CardinalityModel> basicLauncher0 = new BasicLauncher<Minimal4CardinalityModel>(aSolverFactory0);
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(noLearningNoHeuristics0, mixedDataStructureDanielWL0, searchParams0, naturalStaticOrder0, eMARestarts0, basicLauncher0);
      solver0.enqueue(116);
      // Undeclared exception!
      try { 
        quadraticPrimeImplicantStrategy0.compute(solver0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      FixedLengthLearning<ClausalDataStructureWL> fixedLengthLearning0 = new FixedLengthLearning<ClausalDataStructureWL>(0);
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(fixedLengthLearning0, clausalDataStructureWL0, naturalStaticOrder0, arminRestarts0);
      // Undeclared exception!
      try { 
        quadraticPrimeImplicantStrategy0.setAndPropagate(solver0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      QuadraticPrimeImplicantStrategy quadraticPrimeImplicantStrategy0 = new QuadraticPrimeImplicantStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      NoLearningButHeuristics<MixedDataStructureDanielWL> noLearningButHeuristics0 = new NoLearningButHeuristics<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(noLearningButHeuristics0, mixedDataStructureDanielWL0, varOrderHeap0, lubyRestarts0);
      solver0.enqueue(32);
      boolean boolean0 = quadraticPrimeImplicantStrategy0.setAndPropagate(solver0, 32);
      assertTrue(boolean0);
  }
}
