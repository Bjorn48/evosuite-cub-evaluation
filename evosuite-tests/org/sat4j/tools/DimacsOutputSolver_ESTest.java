/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:55:51 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimacsOutputSolver_ESTest extends DimacsOutputSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nextFreeVarId(true);
      int int0 = dimacsOutputSolver0.nextFreeVarId(false);
      assertEquals(1, dimacsOutputSolver0.realNumberOfVariables());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nextFreeVarId(true);
      int int0 = dimacsOutputSolver0.nConstraints();
      assertEquals(1, dimacsOutputSolver0.nVars());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.fixedNbClauses = true;
      VecInt vecInt0 = new VecInt(1, 1);
      IConstr iConstr0 = dimacsOutputSolver0.addExactly(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nextFreeVarId(true);
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(1, dimacsOutputSolver0.nVars());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar((-1953));
      int int0 = dimacsOutputSolver0.nextFreeVarId(true);
      assertEquals((-1952), dimacsOutputSolver0.nVars());
      assertEquals((-1952), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.newVar((-1953));
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals((-1953), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.setExpectedNumberOfClauses(660);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(489, 489);
      // Undeclared exception!
      dimacsOutputSolver0.addExactly(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1, 1);
      vecInt0.shrinkTo(2362);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly(vecInt0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) null, 638);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(569, 5000);
      // Undeclared exception!
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1);
      vecInt0.shrinkTo(43);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost(vecInt0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      VecInt vecInt0 = new VecInt(1527, 1527);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(vecInt0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1, 1);
      dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      IConstr iConstr0 = dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(2126, 2126);
      dimacsOutputSolver0.addAtLeast(vecInt0, 1);
      IConstr iConstr0 = dimacsOutputSolver0.addClause((IVecInt) vecInt0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1, 1);
      IConstr iConstr0 = dimacsOutputSolver0.addClause((IVecInt) vecInt0, 1);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.nextFreeVarId(true);
      int int0 = dimacsOutputSolver0.nVars();
      assertEquals(1, dimacsOutputSolver0.realNumberOfVariables());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly(vecInt0, (-660));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly(vecInt0, 177);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 177
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(vecInt0, 0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      dimacsOutputSolver0.setExpectedNumberOfClauses((-1));
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      assertEquals((-1), dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt(1);
      dimacsOutputSolver0.addAtMost(vecInt0, 1);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addExactly((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost(vecInt0, (-2586));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtMost((IVecInt) null, 475);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 475
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.printStat((PrintWriter) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addAtLeast(iVecInt0, 48);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 48
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.getAddedVars();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.registerLiteral(967);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      String string0 = dimacsOutputSolver0.toString(" ");
      assertEquals("Dimacs output solver", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      dimacsOutputSolver0.setExpectedNumberOfClauses((-1));
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(dimacsOutputSolver0);
      dimacsOutputSolver0.addClause(iVecInt0);
      assertEquals((-1), dimacsOutputSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.newVar(16384);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.addParity((IVecInt) null, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.realNumberOfVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver((PrintWriter) null);
      dimacsOutputSolver0.reset();
      assertEquals(0, dimacsOutputSolver0.getTimeout());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int int0 = dimacsOutputSolver0.newVar();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.modelWithInternalVariables();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.printInfos((PrintWriter) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        dimacsOutputSolver0.primeImplicant(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }
}