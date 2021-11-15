import org.test.kotlinsdk.AssumedRoleUserMin
import kotlin.test.Test

class KotlinUsageTest {

    @Test
    fun testCanCreateType() {
        val t = AssumedRoleUserMin { assumedRoleId = "adsf" }

        val t2b = AssumedRoleUserMin.Builder()
        t2b.arn = "adsf"

        val t2 = t2b.build()

    }
}