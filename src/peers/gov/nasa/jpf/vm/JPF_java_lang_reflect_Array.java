//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.vm;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * MJI NativePeer class for java.lang.reflect.Array library abstraction
 */
public class JPF_java_lang_reflect_Array extends NativePeer {
  @MJI
  public int getLength__Ljava_lang_Object_2__I (MJIEnv env, int clsObjRef, 
                                                    int objRef) {
    if (objRef == MJIEnv.NULL) {
      env.throwException(NativeMethodInfo.CTX, "java.lang.NullPointerException", "array argument is null");
      return 0;
    }
    if (!env.isArray(objRef)) {
      env.throwException(NativeMethodInfo.CTX, "java.lang.IllegalArgumentException", "argument is not an array");
      return 0;
    }

    return env.getArrayLength(NativeMethodInfo.CTX, objRef);
  }
  
  @MJI
  public int newArray__Ljava_lang_Class_2I__Ljava_lang_Object_2 (MJIEnv env, int clsRef,
                                                                        int componentTypeRef, int length) {
    ClassInfo ci = env.getReferredClassInfo(NativeMethodInfo.CTX, componentTypeRef);
    String clsName = ci.getName();
    
    return createNewArray( env, clsName, length);
  }
  
  static int createNewArray (MJIEnv env, String clsName, int length) {
    int aRef = MJIEnv.NULL;
    
    if ("boolean".equals(clsName)) { aRef = env.newBooleanArray(length); }
    else if ("byte".equals(clsName)) { aRef = env.newByteArray(length); }
    else if ("char".equals(clsName)) { aRef = env.newCharArray(NativeMethodInfo.CTX, length); }
    else if ("short".equals(clsName)) { aRef = env.newShortArray(length); }
    else if ("int".equals(clsName)) { aRef = env.newIntArray(length); }
    else if ("long".equals(clsName)) { aRef = env.newLongArray(length); }
    else if ("float".equals(clsName)) { aRef = env.newFloatArray(length); }
    else if ("double".equals(clsName)) { aRef = env.newDoubleArray(length); }
    else { aRef = env.newObjectArray(clsName, length); }
    return aRef;    
  }
  
  @MJI
  public int multiNewArray__Ljava_lang_Class_2_3I__Ljava_lang_Object_2 (MJIEnv env, int clsRef,
                                                                               int componentTypeRef,
                                                                               int dimArrayRef) {
    ClassInfo ci = env.getReferredClassInfo(NativeMethodInfo.CTX, componentTypeRef);
    String clsName = ci.getName();
    int n = env.getArrayLength(NativeMethodInfo.CTX, dimArrayRef);
    int i;

    clsName = Types.getTypeSignature(clsName, true);
    
    String arrayType = "[";
    for (i=2; i<n; i++) arrayType += '[';
    arrayType += clsName;
    
    int[] dim = new int[n];
    for (i=0; i<n; i++) {
      dim[i] = env.getIntArrayElement(dimArrayRef, i);
    }
    
    int aRef = createNewMultiArray(env, arrayType, dim, 0); 
    return aRef;
  }
  
  static int createNewMultiArray (MJIEnv env, String arrayType, int[] dim, int level) {
    int aRef = MJIEnv.NULL;
    int len = dim[level];
    
    if (level < dim.length-1) {
      aRef = env.newObjectArray(arrayType, len);
    
      for (int i=0; i<len; i++) {
        int eRef = createNewMultiArray(env, arrayType.substring(1), dim, level+1);
        env.setReferenceArrayElement(NativeMethodInfo.CTX, aRef, i, new One<>(eRef));
      }
    } else {
      aRef = createNewArray( env, arrayType, len);
    }
    
    return aRef;
  }

  @MJI
  public int get__Ljava_lang_Object_2I__Ljava_lang_Object_2 (MJIEnv env, int clsRef,
                                                                    int aref, int index){
    String at = env.getArrayType(aref);
    FeatureExpr ctx = NativeMethodInfo.CTX;
	if (at.equals("int")){
      int vref = env.newObject(ctx, "java.lang.Integer");
      env.setIntField(ctx, vref, "value", new One<>(env.getIntArrayElement(aref,index)));
      return vref;
      
    } else if (at.equals("long")){
      int vref = env.newObject(ctx, "java.lang.Long");
      env.setLongField(ctx, vref, "value", env.getLongArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("double")){
      int vref = env.newObject(ctx, "java.lang.Double");
      env.setDoubleField(ctx, vref, "value", env.getDoubleArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("boolean")){
      int vref = env.newObject(ctx, "java.lang.Boolean");
      env.setBooleanField(vref, "value", env.getBooleanArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("char")){
      int vref = env.newObject(ctx, "java.lang.Character");
      env.setCharField(ctx, vref, "value", env.getCharArrayElement(aref,index).getValue());
      return vref;
      
    } else if (at.equals("byte")){
      int vref = env.newObject(ctx, "java.lang.Byte");
      env.setByteField(vref, "value", env.getByteArrayElement(aref,index));
      return vref;
      
    } else if (at.equals("short")){
      int vref = env.newObject(ctx, "java.lang.Short");
      env.setShortField(ctx, vref, "value", env.getShortArrayElement(aref,index));
      return vref;

    } else if (at.equals("float")){
      int vref = env.newObject(ctx, "java.lang.Float");
      env.setFloatField(vref, "value", env.getFloatArrayElement(aref,index));
      return vref;

    } else {
      return env.getReferenceArrayElement(aref, index);
    }
  }

  private static boolean check (MJIEnv env, int aref, int index) {
    if (aref == MJIEnv.NULL) {
      env.throwException(NativeMethodInfo.CTX, "java.lang.NullPointerException", "array argument is null");
      return false;
    }
    if (!env.isArray(aref)) {
      env.throwException(NativeMethodInfo.CTX, "java.lang.IllegalArgumentException", "argument is not an array");
      return false;
    }
    if (index < 0 || index >= env.getArrayLength(NativeMethodInfo.CTX, aref)) {
      env.throwException(NativeMethodInfo.CTX, "java.lang.IndexOutOfBoundsException", "index " + index + " is out of bounds");
      return false;
    }
    return true;
  }

  @MJI
  public boolean getBoolean__Ljava_lang_Object_2I__Z (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getBooleanArrayElement(aref, index);
    }
    return false;
  }

  @MJI
  public static byte getByte__Ljava_lang_Object_2I__B (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getByteArrayElement(aref, index);
    }
    return 0;
  }

  @MJI
  public char getChar__Ljava_lang_Object_2I__C (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getCharArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public short getShort__Ljava_lang_Object_2I__S (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getShortArrayElement(aref, index);
    }
    return 0;
  }

  @MJI
  public int getInt__Ljava_lang_Object_2I__I (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getIntArrayElement(aref, index);
    }
    return 0;
  }

  @MJI
  public long getLong__Ljava_lang_Object_2I__J (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getLongArrayElement(aref, index);
    }
    return 0;
  }

  @MJI
  public float getFloat__Ljava_lang_Object_2I__F (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getFloatArrayElement(aref, index);
    }
    return 0;
  }

  @MJI
  public double getDouble__Ljava_lang_Object_2I__D (MJIEnv env, int clsRef, int aref, int index) {
    if (check(env, aref, index)) {
      return env.getDoubleArrayElement(aref, index).getValue();
    }
    return 0;
  }

  @MJI
  public void setBoolean__Ljava_lang_Object_2IZ__V (MJIEnv env, int clsRef, int aref, int index, boolean val) {
    if (check(env, aref, index)) {
      env.setBooleanArrayElement(aref, index, val);
    }
  }

  @MJI
  public void setByte__Ljava_lang_Object_2IB__V (MJIEnv env, int clsRef, int aref, int index, byte val) {
    if (check(env, aref, index)) {
      env.setByteArrayElement(NativeMethodInfo.CTX, aref, index, val);
    }
  }

  @MJI
  public void setChar__Ljava_lang_Object_2IC__V (MJIEnv env, int clsRef, int aref, int index, char val) {
    if (check(env, aref, index)) {
      env.setCharArrayElement(NativeMethodInfo.CTX, aref, index, val);
    }
  }

  @MJI
  public void setShort__Ljava_lang_Object_2IS__V (MJIEnv env, int clsRef, int aref, int index, short val) {
    if (check(env, aref, index)) {
      env.setShortArrayElement(aref, index, val);
    }
  }

  @MJI
  public void setInt__Ljava_lang_Object_2II__V (MJIEnv env, int clsRef, int aref, int index, int val) {
    if (check(env, aref, index)) {
      env.setIntArrayElement(NativeMethodInfo.CTX, aref, index, new One<>(val));
    }
  }

  @MJI
  public void setLong__Ljava_lang_Object_2IJ__V (MJIEnv env, int clsRef, int aref, int index, long val) {
    if (check(env, aref, index)) {
      env.setLongArrayElement(NativeMethodInfo.CTX, aref, index, val);
    }
  }

  @MJI
  public void setFloat__Ljava_lang_Object_2IF__V (MJIEnv env, int clsRef, int aref, int index, float val) {
    if (check(env, aref, index)) {
      env.setFloatArrayElement(aref, index, val);
    }
  }

  @MJI
  public void setDouble__Ljava_lang_Object_2ID__V (MJIEnv env, int clsRef, int aref, int index, double val) {
    if (check(env, aref, index)) {
      env.setDoubleArrayElement(NativeMethodInfo.CTX, aref, index, new One<>(val));
    }
  }
}
