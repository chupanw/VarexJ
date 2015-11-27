#!/bin/sh

#clean
ant -buildfile VarexJ/build.xml clean
ant -buildfile VarexJ/jpf-nhandler/build.xml clean

#build
ant -buildfile VarexJ/build.xml build
ant -buildfile VarexJ/jpf-nhandler/build.xml build

#test
ant -buildfile VarexJ/build.xml test