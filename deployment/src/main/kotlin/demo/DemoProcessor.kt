package demo

import io.quarkus.deployment.annotations.BuildStep
import io.quarkus.deployment.builditem.FeatureBuildItem
import io.quarkus.undertow.deployment.ServletBuildItem

class DemoProcessor {
    @BuildStep
    fun feature(): FeatureBuildItem {
        return FeatureBuildItem("my-ext")
    }

    @BuildStep
    fun helloServlet(
        config: HelloConfig
    ): ServletBuildItem {
        return ServletBuildItem.builder("my-ext", HelloServlet::class.java.name)
            .addInitParam("text", config.text())
            .addMapping("/sayHello").build()
    }
}
