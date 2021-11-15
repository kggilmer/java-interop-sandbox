import kotlin.Unit;
import org.junit.jupiter.api.Test;
import org.test.kotlinsdk.AssumedRoleUser;
import org.test.kotlinsdk.AssumedRoleUserMin;
import org.test.kotlinsdk.AssumedRoleUserMinBuilder;
import org.test.kotlinsdk.JavaInteropKt;

public class TypeInteropTest {

    @Test
    public void testRequestTypeCreation() {
        AssumedRoleUser tr = AssumedRoleUser.fluentBuilder ().build();

        System.out.println(tr.getClass().getCanonicalName());

        AssumedRoleUserMin trm = AssumedRoleUserMin.Companion.invoke(builder -> {
            builder.setAssumedRoleId("asdf");
            builder.setArn("asdfadf");
            builder.build();
            return Unit.INSTANCE;}
        );

        System.out.println(trm.getArn());

        AssumedRoleUserMin asum = new AssumedRoleUserMinBuilder()
                .assumedRoleId("ari")
                .arn("arn")
                .build();

        System.out.println(asum.getArn());

        // JavaInteropKt.javaBuilder();
    }
}
