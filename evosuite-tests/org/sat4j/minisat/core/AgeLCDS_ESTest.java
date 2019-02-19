/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 15:48:23 GMT 2019
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
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.constraints.cnf.BinaryClauses;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.minisat.core.AgeLCDS;
import org.sat4j.minisat.core.ConflictTimer;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.orders.RandomLiteralSelectionStrategy;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.Glucose21Restarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVec;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AgeLCDS_ESTest extends AgeLCDS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      Constr constr0 = Constr.TAUTOLOGY;
      cardinalityDataStructureYanMax0.learnConstraint(constr0);
      solver0.setVerbose(true);
      cardinalityDataStructureYanMax0.learnConstraint(constr0);
      ageLCDS0.reduce((IVec<Constr>) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      Constr constr0 = Constr.TAUTOLOGY;
      cardinalityDataStructureYanMax0.learnConstraint(constr0);
      cardinalityDataStructureYanMax0.learnConstraint(constr0);
      IVec<Constr> iVec0 = solver0.learnts;
      cardinalityDataStructureYanMax0.learnConstraint(constr0);
      cardinalityDataStructureYanMax0.learnConstraint(constr0);
      ageLCDS0.reduce(iVec0);
      assertEquals(2, iVec0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedLengthLearning<MixedDataStructureDanielWLConciseBinary> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielWLConciseBinary>(0);
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0, (-326));
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(fixedLengthLearning0, mixedDataStructureDanielWLConciseBinary0, tabuListDecorator0, (RestartStrategy) null);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, (ConflictTimer) null);
      ConflictTimer conflictTimer0 = ageLCDS0.getTimer();
      assertNull(conflictTimer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 0);
      cardinalityDataStructureYanMax0.learnConstraint(binaryClauses0);
      cardinalityDataStructureYanMax0.learnConstraint(binaryClauses0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      // Undeclared exception!
      try { 
        ageLCDS0.reduce((IVec<Constr>) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove all the binary clauses at once!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.BinaryClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, miniSATRestarts0);
      // Undeclared exception!
      try { 
        ageLCDS0.reduce((IVec<Constr>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.AgeLCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      Constr constr0 = Constr.TAUTOLOGY;
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      Constr constr1 = mixedDataStructureDanielWL0.createUnregisteredClause(vecInt0);
      cardinalityDataStructureYanMax0.learnConstraint(constr1);
      cardinalityDataStructureYanMax0.learnConstraint(constr0);
      IVec<Constr> iVec0 = solver0.learnts;
      // Undeclared exception!
      try { 
        ageLCDS0.reduce(iVec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      BinaryClauses binaryClauses0 = new BinaryClauses(iLits0, 0);
      binaryClauses0.addBinaryClause((-779));
      binaryClauses0.addBinaryClause((-3132));
      cardinalityDataStructureYanMax0.learnConstraint(binaryClauses0);
      cardinalityDataStructureYanMax0.learnConstraint(binaryClauses0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      ageLCDS0.reduce((IVec<Constr>) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      int[] intArray0 = new int[4];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      FixedPeriodRestarts fixedPeriodRestarts1 = (FixedPeriodRestarts)ageLCDS0.getTimer();
      assertEquals(0L, fixedPeriodRestarts1.nextRestartNumberOfConflict());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NoRestarts noRestarts0 = new NoRestarts();
      AgeLCDS ageLCDS0 = new AgeLCDS((Solver<? extends DataStructureFactory>) null, noRestarts0);
      ageLCDS0.onPropagation((Constr) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      int[] intArray0 = new int[4];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      ageLCDS0.init();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Solver<MixedDataStructureDanielHT> solver0 = (Solver<MixedDataStructureDanielHT>) mock(Solver.class, new ViolatedAssumptionAnswer());
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, glucose21Restarts0);
      UnitClause unitClause0 = new UnitClause(0);
      ageLCDS0.onClauseLearning(unitClause0);
      assertTrue(unitClause0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, subsetVarOrder0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      String string0 = ageLCDS0.toString();
      assertEquals("Age based learned constraints deletion strategy with timer constant restarts strategy every 0 conflicts", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(randomLiteralSelectionStrategy0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0, (-1811));
      ArminRestarts arminRestarts0 = new ArminRestarts();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = mixedDataStructureDanielWL0.createCardinalityConstraint(vecInt0, 0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, tabuListDecorator0, arminRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, arminRestarts0);
      ageLCDS0.onConflictAnalysis(constr0);
      assertFalse(constr0.simplify());
  }
}
