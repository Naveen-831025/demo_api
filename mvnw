#!/bin/sh
set -e

# Maven Wrapper Script

MAVEN_VERSION=3.8.1
MVN_CMD="mvn"

if [ -n "$MAVEN_OPTS" ]; then
  MVN_CMD="$MVN_CMD $MAVEN_OPTS"
fi

if [ -n "$MAVEN_HOME" ]; then
  MVN_CMD="$MAVEN_HOME/bin/mvn"
fi

if [ ! -x "$MVN_CMD" ]; then
  echo "Maven is not installed. Please install Maven or set MAVEN_HOME."
  exit 1
fi

exec "$MVN_CMD" "$@"