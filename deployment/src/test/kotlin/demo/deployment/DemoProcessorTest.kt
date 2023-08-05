package demo.deployment

import io.quarkus.test.QuarkusUnitTest
import io.restassured.RestAssured
import org.hamcrest.Matchers
import org.jboss.shrinkwrap.api.asset.StringAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class DemoProcessorTest {
    @Test
    fun sayHello() {
        RestAssured.`when`()["/hello"].then().statusCode(200).body(Matchers.`is`("Hey"))
    }

    companion object {
        @RegisterExtension
        val config = QuarkusUnitTest().withApplicationRoot { jar: JavaArchive ->
            jar.addAsResource(
                StringAsset(
                    "quarkus.my.ext.text=Hey"
                ), "application.properties"
            )
        }
    }
}