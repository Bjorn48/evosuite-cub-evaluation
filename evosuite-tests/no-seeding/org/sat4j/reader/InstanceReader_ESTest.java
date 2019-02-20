/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:25:28 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.reader.AAGReader;
import org.sat4j.reader.AIGReader;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.GroupedCNFReader;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.JSONReader;
import org.sat4j.reader.Reader;
import org.sat4j.specs.IGroupSolver;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InstanceReader_ESTest extends InstanceReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsOutputSolver0);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, groupedCNFReader0);
      int[] intArray0 = new int[4];
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
      instanceReader0.decode(intArray0, (PrintWriter) mockPrintWriter0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(statisticsSolver0, solutionFoundListener0);
      DimacsReader dimacsReader0 = new DimacsReader(minimal4CardinalityModel0);
      InstanceReader instanceReader0 = new InstanceReader(minimal4CardinalityModel0, dimacsReader0);
      boolean boolean0 = instanceReader0.hasAMapping();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      SubModelIterator subModelIterator0 = new SubModelIterator((ISolver) null, vecInt0, (-1L));
      JSONReader<SubModelIterator> jSONReader0 = new JSONReader<SubModelIterator>(subModelIterator0);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, jSONReader0);
      int[] intArray0 = new int[6];
      String string0 = instanceReader0.decode(intArray0);
      assertEquals("[0,0,0,0,0,0]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("P90xV>g.aig");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "DbK5?d|5yPfwpkgoO.aag");
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("P90xV>g.aig");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorAIG format only!
         //
         verifyException("org.sat4j.reader.AIGReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Cannot remove all the binary clauses at once!");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "nce!");
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance("Cannot remove all the binary clauses at once!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.LecteurDimacs", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("ZuGp5LX&'7q4M@91it/.aag.bz2");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      try { 
        instanceReader0.parseInstance("ZuGp5LX&'7q4M@91it/.aag.bz2");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot start processes in a unit test
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedLengthLearning<ClausalDataStructureWL> fixedLengthLearning0 = new FixedLengthLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      SearchParams searchParams0 = new SearchParams(1.0, (-3520));
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(fixedLengthLearning0, clausalDataStructureWL0, searchParams0, tabuListDecorator0, noRestarts0);
      AAGReader aAGReader0 = new AAGReader(solver0);
      InstanceReader instanceReader0 = new InstanceReader(solver0, aAGReader0);
      // Undeclared exception!
      try { 
        instanceReader0.handleFileName((String) null, "org.sat4j.tools.encoding.Policy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.getMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedLengthLearning<ClausalDataStructureWL> fixedLengthLearning0 = new FixedLengthLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      SearchParams searchParams0 = new SearchParams(1.0, (-3520));
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(fixedLengthLearning0, clausalDataStructureWL0, searchParams0, tabuListDecorator0, noRestarts0);
      InstanceReader instanceReader0 = new InstanceReader(solver0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        instanceReader0.decode(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("P90xV>g.aig");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AIGReader aIGReader0 = new AIGReader((ISolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, aIGReader0);
      try { 
        instanceReader0.parseInstance("([(-?(d+)(,-?(d+))*)?])");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("afG1.gz");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SubModelIterator subModelIterator0 = mock(SubModelIterator.class, new ViolatedAssumptionAnswer());
      FullClauseSelectorSolver<SubModelIterator> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<SubModelIterator>(subModelIterator0, true);
      VecInt vecInt0 = new VecInt(903, (-2902));
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(fullClauseSelectorSolver0, vecInt0);
      SubModelIterator subModelIterator1 = new SubModelIterator(minimal4InclusionModel0, vecInt0, (-2902));
      InstanceReader instanceReader0 = new InstanceReader(subModelIterator1);
      try { 
        instanceReader0.parseInstance(":1H<0%Y=!lf=*-=");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      try { 
        instanceReader0.parseInstance("http://1\"1Dx'e?)0Vl;My b*");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      instanceReader0.handleFileName("&t]9]=b>\"ZwX&c.aag", "I./:]gAaPy@}`uyy%8");
      Reader reader0 = instanceReader0.handleFileName("w]Hw95g0R8-M.iig.aag", "&t]9]=b>\"ZwX&c.aag");
      assertFalse(reader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedLengthLearning<ClausalDataStructureWL> fixedLengthLearning0 = new FixedLengthLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      SearchParams searchParams0 = new SearchParams(1.0, (-3520));
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(fixedLengthLearning0, clausalDataStructureWL0, searchParams0, tabuListDecorator0, noRestarts0);
      InstanceReader instanceReader0 = new InstanceReader(solver0);
      instanceReader0.handleFileName(".aig", "+vUML>e]D");
      try { 
        instanceReader0.parseInstance(".aig");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(statisticsSolver0, solutionFoundListener0);
      DimacsReader dimacsReader0 = new DimacsReader(minimal4CardinalityModel0);
      InstanceReader instanceReader0 = new InstanceReader(minimal4CardinalityModel0, dimacsReader0);
      instanceReader0.handleFileName("EZCNF", "EZCNF");
      Reader reader0 = instanceReader0.handleFileName("w]H95g0R8-M.iig", "EZCNF");
      assertFalse(reader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FixedLengthLearning<ClausalDataStructureWL> fixedLengthLearning0 = new FixedLengthLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      SearchParams searchParams0 = new SearchParams(1.0, (-3520));
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(fixedLengthLearning0, clausalDataStructureWL0, searchParams0, tabuListDecorator0, noRestarts0);
      InstanceReader instanceReader0 = new InstanceReader(solver0);
      instanceReader0.handleFileName("+vUML>e]D", "+vUML>e]D");
      Reader reader0 = instanceReader0.handleFileName("http:// D)x", "http:// D)x");
      assertFalse(reader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.parseInstance((InputStream) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input 
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      // Undeclared exception!
      try { 
        instanceReader0.hasAMapping();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        instanceReader0.decode(intArray0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.InstanceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader((IGroupSolver) null);
      InstanceReader instanceReader0 = new InstanceReader((ISolver) null, groupedCNFReader0);
      Map<Integer, String> map0 = instanceReader0.getMapping();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FixedLengthLearning<ClausalDataStructureWL> fixedLengthLearning0 = new FixedLengthLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      SearchParams searchParams0 = new SearchParams(1.0, (-3520));
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<ClausalDataStructureWL> solver0 = new Solver<ClausalDataStructureWL>(fixedLengthLearning0, clausalDataStructureWL0, searchParams0, tabuListDecorator0, noRestarts0);
      AAGReader aAGReader0 = new AAGReader(solver0);
      InstanceReader instanceReader0 = new InstanceReader(solver0, aAGReader0);
      int[] intArray0 = new int[3];
      String string0 = instanceReader0.decode(intArray0);
      assertEquals("", string0);
  }
}
