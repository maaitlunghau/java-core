#!/bin/bash

# Navigate to the script directory
cd "$(dirname "$0")" || exit 1

# Compile Java source code
javac HelloWorld.java || exit 1

# Run Java application
java HelloWorld.java

# Remove compiled class files
rm -f -- *.class