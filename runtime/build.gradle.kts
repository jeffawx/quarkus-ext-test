plugins {
    id("io.quarkus.extension")
    kotlin("jvm")
}

dependencies {
    implementation(platform("io.quarkus:quarkus-bom:3.2.2.Final"))
    implementation("io.quarkus:quarkus-undertow")
}

quarkusExtension {
    deploymentModule.set("my-ext-deployment")
}