#!/bin/bash

# Create installer with diet JRE
# On my Ubuntu, required: sudo apt-get install fakeroot
jpackage --name testdatamaker --input target --main-jar testdatamaker-0.0.1-SNAPSHOT.jar --runtime-image dietjre
