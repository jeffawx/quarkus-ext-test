package demo

import io.quarkus.runtime.annotations.ConfigItem
import io.quarkus.runtime.annotations.ConfigPhase
import io.quarkus.runtime.annotations.ConfigRoot

@ConfigRoot(phase = ConfigPhase.BUILD_TIME, name = "my.ext")
class HelloConfig {
    /**
     * test
     */
    @ConfigItem(defaultValue = "Hello World")
    @JvmField
    var text: String? = null
}
