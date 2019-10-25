/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 24 12:42:46 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.TableStockage;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TableStockage_ESTest extends TableStockage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[4][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Class<Object> class0 = Object.class;
      tableStockage0.setColumnClass(0, class0);
      assertEquals(1, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[4];
      Object[][] objectArray0 = new Object[7][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      // Undeclared exception!
      try { 
        tableStockage0.getValueAt(1, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getValueAt(1, 147);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Object[][] objectArray0 = new Object[2][5];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      tableStockage0.setValueAt("", 1, 1);
      assertEquals(2, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Object[][] objectArray0 = new Object[0][8];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      tableStockage0.setColumnName(1, "O5@");
      assertEquals(8, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(543, 543);
      Boolean boolean0 = Boolean.TRUE;
      tableStockage0.remplirMatrice(boolean0, 1, 0);
      assertEquals(542, tableStockage0.getRowCount());
      assertEquals(543, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(2635, 2635);
      tableStockage0.getValueAt(0, 0);
      assertEquals(2635, tableStockage0.getColumnCount());
      assertEquals(2634, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "O.A\"";
      Object[][] objectArray0 = new Object[4][4];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Object object0 = tableStockage0.getValueAt(0, 0);
      assertEquals("O.A\"", object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      int int0 = tableStockage0.getRowCount();
      assertEquals(0, int0);
      assertEquals(0, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      String[] stringArray0 = tableStockage0.getNomColonnes();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "O.A\"";
      Object[][] objectArray0 = new Object[4][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(0);
      assertEquals("O.A\"", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "";
      Object[][] objectArray0 = new Object[1][2];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      int int0 = tableStockage0.getColumnCount();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[9][8];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      int int0 = tableStockage0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(2635, 2635);
      tableStockage0.getColumnClass(0);
      assertEquals(2635, tableStockage0.getColumnCount());
      assertEquals(2634, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass((-20), (Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getColumnName((-562));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -562
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage((String[]) null, (Object[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[10];
      Object[][] objectArray0 = new Object[1][2];
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage(stringArray0, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage((-474), (-474));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[4][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        tableStockage0.setValueAt(object0, 366, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[1][7];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      int int0 = tableStockage0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      DefaultEditorKit.CopyAction defaultEditorKit_CopyAction0 = new DefaultEditorKit.CopyAction();
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice(defaultEditorKit_CopyAction0, 0, 543);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.text.DefaultEditorKit$CopyAction cannot be cast to java.lang.String
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[4][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice("O.A\"", (-2814), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2815
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(543, 543);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass(543, class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[4][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Class<String> class0 = String.class;
      tableStockage0.setColumnClass(0, class0);
      assertEquals(1, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[4][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      boolean boolean0 = tableStockage0.isCellEditable((-134), (-222));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setColumnName(0, "fr.unice.gfarce.interGraph.TableStockage");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(3021, 3021);
      Class<Boolean> class0 = Boolean.class;
      tableStockage0.setColumnClass(496, class0);
      assertEquals(3021, tableStockage0.getColumnCount());
      assertEquals(3020, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[4][4];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String[] stringArray1 = tableStockage0.getNomColonnes();
      assertSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Object[][] objectArray0 = new Object[1][2];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getColumnClass(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }
}
