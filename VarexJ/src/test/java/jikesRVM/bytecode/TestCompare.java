/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package jikesRVM.bytecode;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("unused")
public class TestCompare extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[]{"+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice"};

	@Test
	public void test() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			zero_cmp();
			i_cmp();
			l_cmp();
			f_cmp();
			d_cmp();
			a_cmp();
			null_cmp();
			str_cmp();
		}
	}

  static void zero_cmp() {
    int i = -1;

    System.out.print("zero_cmp Expected: 100110 Actual: ");
    if (i != 0) System.out.print(1); else fail(); // ifeq
    if (i == 0) fail(); else System.out.print(0); // ifne
    if (i >= 0) fail(); else System.out.print(0); // iflt
    if (i <  0) System.out.print(1); else fail(); // ifge
    if (i <= 0) System.out.print(1); else fail(); // ifgt
    if (i >  0) fail(); else System.out.print(0); // ifle
    System.out.println();
  }

  static void i_cmp() {
    int i = -1;
    int j = 0;

    System.out.print("i_cmp Expected: 100110 Actual: ");
    if (i != j) System.out.print(1); else fail(); // if_icmpeq
    if (i == j) fail(); else System.out.print(0); // if_icmpne
    if (i >= j) fail(); else System.out.print(0); // if_icmplt
    if (i <  j) System.out.print(1); else fail(); // if_icmpge
    if (i <= j) System.out.print(1); else fail(); // if_icmpgt
    if (i >  j) fail(); else System.out.print(0); // if_icmple
    System.out.println();
  }

  static void l_cmp() {
    long a = 1;
    long b = 2;

    System.out.print("l_cmp Expected: 100010001 Actual: ");

    if (a <  b) System.out.print(1); else fail(); // lcmp(-1)
    if (a == b) fail(); else System.out.print(0);
    if (a >  b) fail(); else System.out.print(0);

    if (a <  a) fail(); else System.out.print(0);
    
    long c = a;
    if (c == a) System.out.print(1); else fail(); // lcmp(0)
    if (a >  a) fail(); else System.out.print(0);

    if (b <  a) fail(); else System.out.print(0);
    if (b == a) fail(); else System.out.print(0);
    if (b >  a) System.out.print(1); else fail(); // lcmp(1)

    System.out.println();
  }

  static void f_cmp() {
    float a = 1;
    float b = 2;

    System.out.print("f_cmp Expected: 100010001 Actual: ");

    if (a <  b) System.out.print(1); else fail(); // fcmp[lg](-1)
    if (a == b) fail(); else System.out.print(0);
    if (a >  b) fail(); else System.out.print(0);

    if (a <  a) fail(); else System.out.print(0);
    if (a == a) System.out.print(1); else fail(); // fcmp[lg](0)
    if (a >  a) fail(); else System.out.print(0);

    if (b <  a) fail(); else System.out.print(0);
    if (b == a) fail(); else System.out.print(0);
    if (b >  a) System.out.print(1); else fail(); // fcmp[lg](1)

    System.out.println();
  }

  static void d_cmp() {
    double a = 1;
    double b = 2;

    System.out.print("d_cmp Expected: 100010001 Actual: ");

    if (a <  b) System.out.print(1); else fail(); // dcmp[lg](-1)
    if (a == b) fail(); else System.out.print(0);
    if (a >  b) fail(); else System.out.print(0);
                                                 
    if (a <  a) fail(); else System.out.print(0);
    if (a == a) System.out.print(1); else fail(); // dcmp[lg](0)
    if (a >  a) fail(); else System.out.print(0);
                                                 
    if (b <  a) fail(); else System.out.print(0);
    if (b == a) fail(); else System.out.print(0);
    if (b >  a) System.out.print(1); else fail(); // dcmp[lg](1)

    System.out.println();
  }

  
static void a_cmp() {
    Object a = null;
    Object b = null;
    System.out.print("a_cmp Expected: 10 Actual: ");
    if (a == b) System.out.print(1); else fail(); // if_acmpne
    if (a != b) fail(); else System.out.print(0); // if_acmpeq
    System.out.println();
  }

  static void null_cmp() {
    Object o = null;
    System.out.print("null_cmp Expected: 10 Actual: ");
    if (o == null) System.out.print(1); else fail(); // ifnonnull
    if (o != null) fail(); else System.out.print(0); // ifnull
    System.out.println();
   }

  static void str_cmp() {
    String s1 = "abc";
    String s2 = "abc";
    String s3 = "ab";
    s3 = s3 + "c";
    System.out.println("str_cmp Expected: true,false Actual: " + (s1 == s2) + "," + (s1 == s3));
  }
}
