plugins {
    id("io.quarkus.extension")
    kotlin("jvm")
    kotlin("kapt")
}

dependencies {
    implementation(platform("io.quarkus:quarkus-bom:3.2.2.Final"))
    implementation("io.quarkus:quarkus-undertow")
    kapt("io.quarkus:quarkus-extension-processor:3.2.2.Final")
    kaptTest("io.quarkus:quarkus-extension-processor:3.2.2.Final")
}

quarkusExtension {
    deploymentModule.set("my-ext-deployment")
}