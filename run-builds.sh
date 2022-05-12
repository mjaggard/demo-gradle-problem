#! /bin/bash

echo "Ensure that the same version of gradle is running in both projects"


cd test-project
./gradlew -v
./gradlew clean

cd ../spring-framework
./gradlew -v
./gradlew clean
./gradlew --stop

rm -rf ~/.gradle/caches/7.4.2/

./gradlew --parallel --no-daemon --rerun-tasks -Porg.gradle.caching=false --no-build-cache --no-configuration-cache assemble &

sleep 1

cd ../test-project
./gradlew --parallel --no-daemon --rerun-tasks --no-build-cache --no-configuration-cache build

sleep 10

kill $!
