# quarkus-ext-test

`./gradlew test` fails: `No config found for interface demo.HelloConfig`

in deployment module, rename `META-INF/quarkus-config-roots.list_test` to `META-INF/quarkus-config-roots.list`, then
`./gradlew test`, works!
