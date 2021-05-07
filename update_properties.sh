#!/bin/bash

# Assign the filename
touch local.properties
echo "baseUrl=\"$1\"" >> local.properties
echo "apiKey=\"$2\"" >> local.properties
echo "gateway=\"$3\"" >> local.properties
echo "appType=\"$4\"" >> local.properties

#echo "gateway=$3" >> local.properties
#echo "appType=$4" >> local.properties
