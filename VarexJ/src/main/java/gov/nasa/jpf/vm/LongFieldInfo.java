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
import gov.nasa.jpf.JPFException;



/**
 *
 */
public class LongFieldInfo extends DoubleSlotFieldInfo {
  long init;

  public LongFieldInfo (String name, int modifiers) {
    super(name, "J", modifiers);
  }

  public void setConstantValue(Object constValue){
    if (constValue instanceof Long){
      cv = constValue;
      init = (Long)constValue;

    } else {
      throw new JPFException("illegal long ConstValue=" + constValue);
    }
  }

  public void initialize (FeatureExpr ctx, ElementInfo ei, ThreadInfo ti) {
    ei.getFields().setLongValue( ctx, storageOffset, new One<>(init));
  }

  public int getStorageSize() {
    return 2;
  }

  public Class<? extends ChoiceGenerator<?>> getChoiceGeneratorType() {
    return LongChoiceGenerator.class;
  }

  public String valueToString (Fields f) {
    long v = f.getLongValue(storageOffset).getValue();
    return Long.toString(v);
  }

  public Object getValueObject (Fields f){
    long v = f.getLongValue(storageOffset).getValue();
    return new Long(v);
  }

  public boolean isLongField(){
    return true;
  }
  
  @Override
	public boolean isByteField() {
		return true;
	}
  
  @Override
	public boolean isShortField() {
		return true;
	}
  
	@Override
	public boolean isIntField() {
		return true;
	}

  public boolean isNumericField(){
    return true;
  }
}

