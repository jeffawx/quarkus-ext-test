# quarkus-ext-test

`./gradlew test` fails: `No config found for interface demo.HelloConfig`

But if publish the jar by `./gradlew publishToMavenLocal -x test`, go to `application` folder, run

```
./gradlew quarkuDev
```

followed by `curl localhost:8080/sayHello` proves it's working.

in deployment module, rename `META-INF/quarkus-config-roots.list_test` to `META-INF/quarkus-config-roots.list`, then
`./gradlew test`, works!
