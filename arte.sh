#!/bin/bash
SCRIPT="`readlink -e $0`"
SCRIPTPATH="`dirname $SCRIPT`"
java -jar $SCRIPTPATH/ARTE.jar < $1
