#!/usr/bin/env bash

cd /home/ec2-user/server
sudo /usr/bin/java -jar *.war > /dev/null 2> /dev/null < /dev/null &
