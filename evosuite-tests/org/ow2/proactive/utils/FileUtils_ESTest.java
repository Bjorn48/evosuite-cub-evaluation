/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 19:13:07 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.FileUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtils_ESTest extends FileUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.fileSilter.CanWriteFl|Filter");
      assertNotNull(mockFile0);
      
      File file0 = MockFile.createTempFile("org.apache.commons.io.fileSilter.CanWriteFl|Filter", "org.apache.commons.io.fileSilter.CanWriteFl|Filter", (File) mockFile0);
      assertNotSame(mockFile0, file0);
      assertNotSame(file0, mockFile0);
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isFile());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.canWrite());
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter", mockFile0.getName());
      assertFalse(mockFile0.isHidden());
      assertNull(mockFile0.getParent());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals(0L, file0.getTotalSpace());
      assertEquals(0L, file0.length());
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter0org.apache.commons.io.fileSilter.CanWriteFl|Filter", file0.getName());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.fileSilter.CanWriteFl|Filter", file0.getParent());
      assertTrue(file0.exists());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.fileSilter.CanWriteFl|Filter/org.apache.commons.io.fileSilter.CanWriteFl|Filter0org.apache.commons.io.fileSilter.CanWriteFl|Filter", file0.toString());
      assertTrue(file0.canRead());
      assertTrue(file0.isFile());
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isHidden());
      assertTrue(file0.canExecute());
      assertTrue(file0.isAbsolute());
      assertEquals(0L, file0.getFreeSpace());
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertNotNull(file0);
      assertFalse(file0.equals((Object)mockFile0));
      
      URL uRL0 = mockFile0.toURL();
      assertNotSame(mockFile0, file0);
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isFile());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.canWrite());
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter", mockFile0.getName());
      assertFalse(mockFile0.isHidden());
      assertNull(mockFile0.getParent());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getQuery());
      assertNull(uRL0.getAuthority());
      assertNull(uRL0.getUserInfo());
      assertEquals("", uRL0.getHost());
      assertEquals("file", uRL0.getProtocol());
      assertNotNull(uRL0);
      assertFalse(mockFile0.equals((Object)file0));
      
      String string0 = FileUtils.getFileNameWithExtension(uRL0);
      assertNotSame(mockFile0, file0);
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter", string0);
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter", mockFile0.toString());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isFile());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.canWrite());
      assertEquals("org.apache.commons.io.fileSilter.CanWriteFl|Filter", mockFile0.getName());
      assertFalse(mockFile0.isHidden());
      assertNull(mockFile0.getParent());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getQuery());
      assertNull(uRL0.getAuthority());
      assertNull(uRL0.getUserInfo());
      assertEquals("", uRL0.getHost());
      assertEquals("file", uRL0.getProtocol());
      assertNotNull(string0);
      assertFalse(mockFile0.equals((Object)file0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = FileUtils.getExtension(".tmpdir");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          File file0 = new File("DKv^YS.}hH*rI%j#q");
          assertEquals("DKv^YS.}hH*rI%j#q", file0.getName());
          assertEquals(0L, file0.lastModified());
          assertFalse(file0.isHidden());
          assertEquals(0L, file0.getTotalSpace());
          assertFalse(file0.canRead());
          assertFalse(file0.exists());
          assertFalse(file0.isFile());
          assertEquals(0L, file0.getFreeSpace());
          assertEquals(0L, file0.length());
          assertFalse(file0.isAbsolute());
          assertNull(file0.getParent());
          assertEquals(0L, file0.getUsableSpace());
          assertFalse(file0.isDirectory());
          assertEquals("DKv^YS.}hH*rI%j#q", file0.toString());
          assertNotNull(file0);
          
          FileUtils.removeDir(file0);
          assertEquals("DKv^YS.}hH*rI%j#q", file0.getName());
          assertEquals(0L, file0.lastModified());
          assertFalse(file0.isHidden());
          assertEquals(0L, file0.getTotalSpace());
          assertFalse(file0.canRead());
          assertFalse(file0.exists());
          assertFalse(file0.isFile());
          assertEquals(0L, file0.getFreeSpace());
          assertEquals(0L, file0.length());
          assertFalse(file0.isAbsolute());
          assertNull(file0.getParent());
          assertEquals(0L, file0.getUsableSpace());
          assertFalse(file0.isDirectory());
          assertEquals("DKv^YS.}hH*rI%j#q", file0.toString());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.apache.commons.io.filefilter.CanWriteFil|Filter/org.apache.commons.io.filefilter.CanWriteFil|Filter0org.apache.commons.io.filefilter.CanWriteFil|Filter");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "org.apache.commons.io.filefilter.CanWriteFil|Filter");
      assertTrue(boolean0);
      
      Properties properties0 = FileUtils.resolvePropertiesFile("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFil|Filter/org.apache.commons.io.filefilter.CanWriteFil|Filter0org.apache.commons.io.filefilter.CanWriteFil|Filter");
      assertFalse(properties0.isEmpty());
      assertEquals(1, properties0.size());
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = new File(".tmpdir");
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isAbsolute());
      assertTrue(file0.isHidden());
      assertEquals(".tmpdir", file0.toString());
      assertFalse(file0.isFile());
      assertFalse(file0.canRead());
      assertFalse(file0.isDirectory());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.lastModified());
      assertEquals(0L, file0.getFreeSpace());
      assertNull(file0.getParent());
      assertEquals(0L, file0.getTotalSpace());
      assertEquals(".tmpdir", file0.getName());
      assertFalse(file0.exists());
      assertNotNull(file0);
      
      File file1 = FileUtils.createTempDirectory(".tmpdir", "", file0);
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isAbsolute());
      assertTrue(file0.isHidden());
      assertEquals(".tmpdir", file0.toString());
      assertFalse(file0.isFile());
      assertFalse(file0.canRead());
      assertFalse(file0.isDirectory());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.lastModified());
      assertEquals(0L, file0.getFreeSpace());
      assertNull(file0.getParent());
      assertEquals(0L, file0.getTotalSpace());
      assertEquals(".tmpdir", file0.getName());
      assertFalse(file0.exists());
      assertEquals(1392409281320L, file1.lastModified());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/.tmpdir/.tmpdir0", file1.toString());
      assertTrue(file1.isDirectory());
      assertEquals(0L, file1.getTotalSpace());
      assertEquals(0L, file1.length());
      assertFalse(file1.isFile());
      assertTrue(file1.canExecute());
      assertTrue(file1.canRead());
      assertTrue(file1.exists());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/.tmpdir", file1.getParent());
      assertTrue(file1.isHidden());
      assertEquals(0L, file1.getUsableSpace());
      assertEquals(".tmpdir0", file1.getName());
      assertEquals(0L, file1.getFreeSpace());
      assertTrue(file1.isAbsolute());
      assertTrue(file1.canWrite());
      assertNotNull(file1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      boolean boolean0 = FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      assertTrue(boolean0);
      
      File file0 = FileUtils.createTempDirectory("A \"", "Cannot create temp directory after 5 tries.", (File) null);
      assertFalse(file0.isHidden());
      assertEquals(0L, file0.getUsableSpace());
      assertEquals("/tmp/A \"0Cannot create temp directory after 5 tries.", file0.toString());
      assertTrue(file0.isAbsolute());
      assertEquals("A \"0Cannot create temp directory after 5 tries.", file0.getName());
      assertFalse(file0.canWrite());
      assertEquals(0L, file0.getFreeSpace());
      assertEquals(0L, file0.lastModified());
      assertFalse(file0.isDirectory());
      assertEquals(0L, file0.getTotalSpace());
      assertEquals(0L, file0.length());
      assertFalse(file0.canExecute());
      assertFalse(file0.exists());
      assertEquals("/tmp", file0.getParent());
      assertFalse(file0.canRead());
      assertTrue(file0.isFile());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtils.removeDir((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtils.getFileNameWithExtension((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtils.getExtension((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.FileUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtils.deleteRecursively((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtils.createTempDirectory("", "", (File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      try { 
        FileUtils.createTempDirectory("O\"7/E", "O\"7/E", (File) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.CanWriteFileFilter", "org.apache.commons.io.filefilter.CanWriteFileFilter");
      assertNotNull(mockFile0);
      
      File file0 = MockFile.createTempFile("org.apache.commons.io.filefilter.CanWriteFileFilter", "org.apache.commons.io.filefilter.CanWriteFileFilter", (File) mockFile0);
      assertNotSame(mockFile0, file0);
      assertNotSame(file0, mockFile0);
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter", mockFile0.toString());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter", mockFile0.getParent());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertFalse(mockFile0.isFile());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertTrue(mockFile0.isAbsolute());
      assertTrue(mockFile0.canExecute());
      assertEquals("org.apache.commons.io.filefilter.CanWriteFileFilter", mockFile0.getName());
      assertEquals(0L, mockFile0.length());
      assertFalse(file0.isDirectory());
      assertTrue(file0.canWrite());
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isHidden());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter0org.apache.commons.io.filefilter.CanWriteFileFilter", file0.toString());
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals("org.apache.commons.io.filefilter.CanWriteFileFilter0org.apache.commons.io.filefilter.CanWriteFileFilter", file0.getName());
      assertTrue(file0.isAbsolute());
      assertTrue(file0.exists());
      assertEquals("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter", file0.getParent());
      assertEquals(0L, file0.getFreeSpace());
      assertTrue(file0.isFile());
      assertTrue(file0.canRead());
      assertEquals(0L, file0.length());
      assertTrue(file0.canExecute());
      assertEquals(0L, file0.getTotalSpace());
      assertNotNull(file0);
      assertFalse(file0.equals((Object)mockFile0));
      
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      Properties properties0 = FileUtils.resolvePropertiesFile("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter0org.apache.commons.io.filefilter.CanWriteFileFilter");
      assertTrue(properties0.isEmpty());
      assertEquals(0, properties0.size());
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("z@Z`.]/.");
      assertNotNull(mockFile0);
      
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("z@Z`.]/.");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      assertTrue(boolean0);
      
      URL uRL0 = mockFile0.toURL();
      assertEquals(0L, mockFile0.length());
      assertEquals("z@Z`.]", mockFile0.getParent());
      assertFalse(mockFile0.isAbsolute());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals("z@Z`.]/.", mockFile0.toString());
      assertTrue(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canExecute());
      assertFalse(mockFile0.isFile());
      assertEquals(".", mockFile0.getName());
      assertTrue(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.exists());
      assertTrue(mockFile0.canRead());
      assertNull(uRL0.getQuery());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getUserInfo());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getAuthority());
      assertEquals("file", uRL0.getProtocol());
      assertEquals("", uRL0.getHost());
      assertNotNull(uRL0);
      
      String string0 = FileUtils.getFileNameWithExtension(uRL0);
      assertEquals("", string0);
      assertEquals(0L, mockFile0.length());
      assertEquals("z@Z`.]", mockFile0.getParent());
      assertFalse(mockFile0.isAbsolute());
      assertTrue(mockFile0.isDirectory());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals("z@Z`.]/.", mockFile0.toString());
      assertTrue(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canExecute());
      assertFalse(mockFile0.isFile());
      assertEquals(".", mockFile0.getName());
      assertTrue(mockFile0.isHidden());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertTrue(mockFile0.exists());
      assertTrue(mockFile0.canRead());
      assertNull(uRL0.getQuery());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertNull(uRL0.getUserInfo());
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getAuthority());
      assertEquals("file", uRL0.getProtocol());
      assertEquals("", uRL0.getHost());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.CanWriteFileFilter", "org.apache.commons.io.filefilter.CanWriteFileFilter");
      URL uRL0 = mockFile0.toURL();
      String string0 = FileUtils.getFileNameWithExtension(uRL0);
      assertEquals("org.apache.commons.io.filefilter.CanWriteFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      String string0 = FileUtils.getFileNameWithExtension(uRL0);
      assertEquals("fooExample", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = FileUtils.getExtension("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter0org.apache.commons.io.filefilter.CanWriteFileFilter");
      assertEquals("CanWriteFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = FileUtils.getExtension("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtils.createTempDirectory((String) null, (String) null, (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.CanWriteFileFilter", "org.apache.commons.io.filefilter.CanWriteFileFilter");
      FileUtils.createTempDirectory("/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter0org.apache.commons.io.filefilter.CanWriteFileFilter", "/home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter/org.apache.commons.io.filefilter.CanWriteFileFilter0org.apache.commons.io.filefilter.CanWriteFileFilter", mockFile0);
      MockFile mockFile1 = new MockFile("");
      // Undeclared exception!
      FileUtils.removeDir(mockFile1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.CanWriteFileFilter", "org.apache.commons.io.filefilter.CanWriteFileFilter");
      MockFile.createTempFile("org.apache.commons.io.filefilter.CanWriteFileFilter", "org.apache.commons.io.filefilter.CanWriteFileFilter", (File) mockFile0);
      FileUtils.removeDir(mockFile0);
      assertEquals(0L, mockFile0.lastModified());
      assertFalse(mockFile0.canExecute());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtils fileUtils0 = new FileUtils();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("");
          Path path0 = mockFile0.toPath();
          // Undeclared exception!
          try { 
            FileUtils.deleteRecursively(path0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"evosuite-master-1.0.7-SNAPSHOT.jar\" \"delete\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkDelete(SecurityManager.java:1007)
             // sun.nio.fs.UnixPath.checkDelete(UnixPath.java:807)
             // sun.nio.fs.UnixFileSystemProvider.implDelete(UnixFileSystemProvider.java:222)
             // sun.nio.fs.AbstractFileSystemProvider.delete(AbstractFileSystemProvider.java:103)
             // java.nio.file.Files.delete(Files.java:1126)
             // org.ow2.proactive.utils.FileUtils$1.visitFile(FileUtils.java:80)
             // org.ow2.proactive.utils.FileUtils$1.visitFile(FileUtils.java:77)
             // java.nio.file.Files.walkFileTree(Files.java:2670)
             // java.nio.file.Files.walkFileTree(Files.java:2742)
             // org.ow2.proactive.utils.FileUtils.deleteRecursively(FileUtils.java:77)
             // sun.reflect.GeneratedMethodAccessor203.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.CanWriteFil|Filter");
      Path path0 = mockFile0.toPath();
      try { 
        FileUtils.deleteRecursively(path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }
}