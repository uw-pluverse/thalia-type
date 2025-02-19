#!/usr/bin/env bash

set -e
set -u
set -o pipefail

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
cd $SCRIPT_DIR

JAR_FOLDER="../../jars/*.jar"

pushd doc2json
mkdir -p docs
if [ -z "$( ls -A 'docs/' )" ]; then
    ./doc2json.py --language jar -i /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.412.b06-1.fc40.x86_64/jre/lib/rt.jar -o docs/rt-json-doc
    find $JAR_FOLDER -type f | parallel ./doc2json.py --language jar -i \{\} -o docs/\{/.\}-json-doc
fi

rm -rf so-docs
mkdir -p so-docs/rt
mkdir -p so-docs/joda
mkdir -p so-docs/android
mkdir -p so-docs/gwt
mkdir -p so-docs/hibernate
mkdir -p so-docs/xstream
cp docs/rt-json-doc/* so-docs/rt
cp docs/joda-time-2.0-json-doc/* so-docs/joda
cp docs/android-13-json-doc/* so-docs/android
cp docs/gwt-user-json-doc/* so-docs/gwt
cp docs/gwt-dev-2.9.0-json-doc/* so-docs/gwt
cp docs/hibernate-3.5.3-json-doc/* so-docs/hibernate
cp docs/hibernate-annotations-json-doc/* so-docs/hibernate
cp docs/hibernate-shards-json-doc/* so-docs/hibernate
cp docs/hibernate-validator-json-doc/* so-docs/hibernate
cp docs/xstream-1.4.4-json-doc/* so-docs/xstream
popd


thalia --language java --transformations 0 --batch 10 -i 50 -P --max-depth 2 --generator api --api-doc-path doc2json/so-docs/rt/ --api-rules thalia/example-apis/java-stdlib/api-rules.json --keep-all --name rt-session --library-path '../snq-server/src/test/resources/jars/so/*'
thalia --language java --transformations 0 --batch 10 -i 50 -P --max-depth 2 --generator api --api-doc-path doc2json/so-docs/joda/ --api-rules thalia/example-apis/java-stdlib/api-rules.json --keep-all --name joda-session --library-path '../snq-server/src/test/resources/jars/so/*'
thalia --language java --transformations 0 --batch 10 -i 50 -P --max-depth 2 --generator api --api-doc-path doc2json/so-docs/android/ --api-rules thalia/example-apis/java-stdlib/api-rules.json --keep-all --name android-session --library-path '../snq-server/src/test/resources/jars/so/*'
thalia --language java --transformations 0 --batch 10 -i 50 -P --max-depth 2 --generator api --api-doc-path doc2json/so-docs/gwt/ --api-rules thalia/example-apis/java-stdlib/api-rules.json --keep-all --name gwt-session --library-path '../snq-server/src/test/resources/jars/so/*'
thalia --language java --transformations 0 --batch 10 -i 50 -P --max-depth 2 --generator api --api-doc-path doc2json/so-docs/hibernate/ --api-rules thalia/example-apis/java-stdlib/api-rules.json --keep-all --name hibernate-session --library-path '../snq-server/src/test/resources/jars/so/*'
thalia --language java --transformations 0 --batch 10 -i 50 -P --max-depth 2 --generator api --api-doc-path doc2json/so-docs/xstream/ --api-rules thalia/example-apis/java-stdlib/api-rules.json --keep-all --name xstream-session --library-path '../snq-server/src/test/resources/jars/so/*'


./fix_imports.py bugs/rt-session/generator/ thalia-rt
./fix_imports.py bugs/joda-session/generator/ thalia-joda
./fix_imports.py bugs/android-session/generator/ thalia-android
./fix_imports.py bugs/gwt-session/generator/ thalia-gwt
./fix_imports.py bugs/xstream-session/generator/ thalia-xstream
./fix_imports.py bugs/hibernate-session/generator/ thalia-hibernate

# copy the generated files into ./snippets-thalia
./rename.py
