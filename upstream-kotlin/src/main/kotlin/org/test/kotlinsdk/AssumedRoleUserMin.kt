package org.test.kotlinsdk

/**
 * The identifiers for the temporary security credentials that the operation
 * returns.
 */
class AssumedRoleUserMin private constructor(builder: Builder) {
    /**
     * The ARN of the temporary security credentials that are returned from the AssumeRole action. For more information about ARNs and how to use them in
     * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers in the
     * IAM User Guide.
     */
    val arn: String? = builder.arn
    /**
     * A unique identifier that contains the role ID and the role session name of the role that
     * is being assumed. The role ID is generated by Amazon Web Services when the role is created.
     */
    val assumedRoleId: String? = builder.assumedRoleId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): AssumedRoleUserMin = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssumedRoleUser(")
        append("arn=$arn,")
        append("assumedRoleId=$assumedRoleId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = arn?.hashCode() ?: 0
        result = 31 * result + (assumedRoleId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AssumedRoleUserMin

        if (arn != other.arn) return false
        if (assumedRoleId != other.assumedRoleId) return false

        return true
    }

    fun copy(block: Builder.() -> kotlin.Unit = {}): AssumedRoleUserMin = Builder(this).apply(block).build()

    public class Builder() {
        var arn: String? = null
        var assumedRoleId: String? = null

        constructor(x: AssumedRoleUserMin) : this() {
            this.arn = x.arn
            this.assumedRoleId = x.assumedRoleId
        }

        fun build(): AssumedRoleUserMin = AssumedRoleUserMin(this)
    }
}