#!/bin/bash

# Creates an archetype from this project. The archetype will be cleaned up and installed into
# the local archetype catalog.

ARCH_DIR=./target/generated-sources/archetype
DATA_DIR=$ARCH_DIR/src/main/resources/archetype-resources

echo "generating archetype from current project"
mvn clean archetype:create-from-project > archetype-generation.log

echo "cleaning up generated artifact's resources"
rm $DATA_DIR/OSGI-INF/*
rm $DATA_DIR/META-INF/*
rm $DATA_DIR/create-archetype.sh
rm $DATA_DIR/archetype-generation.log
rm -rf $ARCH_DIR/target

echo "installing archetype locally. Run 'mvn archetype:generate -DarchetypeCatalog=local' to use"
mvn install -f $ARCH_DIR/pom.xml >> archetype-generation.log

