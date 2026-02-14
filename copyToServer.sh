#!/bin/bash

if [ $# -eq 2 ]; then
	echo "Usage: $0 <param1> <param2>"
	exit 1
fi

fileName=$1
asstFile=$2

scp ${fileName} cs358.campus.up.edu:${asstFile}/${fileName}
