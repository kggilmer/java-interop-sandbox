package org.test.kotlinsdk

/**
 * The identifiers for the temporary security credentials that the operation
 * returns.
 */
class AssumedRoleUser private constructor(builder: BuilderImpl) {
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
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AssumedRoleUser = BuilderImpl().apply(block).build()

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

        other as AssumedRoleUser

        if (arn != other.arn) return false
        if (assumedRoleId != other.assumedRoleId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AssumedRoleUser = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AssumedRoleUser
        /**
         * The ARN of the temporary security credentials that are returned from the AssumeRole action. For more information about ARNs and how to use them in
         * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers in the
         * IAM User Guide.
         */
        fun arn(arn: String): FluentBuilder
        /**
         * A unique identifier that contains the role ID and the role session name of the role that
         * is being assumed. The role ID is generated by Amazon Web Services when the role is created.
         */
        fun assumedRoleId(assumedRoleId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ARN of the temporary security credentials that are returned from the AssumeRole action. For more information about ARNs and how to use them in
         * policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers in the
         * IAM User Guide.
         */
        var arn: String?
        /**
         * A unique identifier that contains the role ID and the role session name of the role that
         * is being assumed. The role ID is generated by Amazon Web Services when the role is created.
         */
        var assumedRoleId: String?

        fun build(): AssumedRoleUser
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var arn: String? = null
        override var assumedRoleId: String? = null

        constructor(x: AssumedRoleUser) : this() {
            this.arn = x.arn
            this.assumedRoleId = x.assumedRoleId
        }

        override fun build(): AssumedRoleUser = AssumedRoleUser(this)
        override fun arn(arn: String): FluentBuilder = apply { this.arn = arn }
        override fun assumedRoleId(assumedRoleId: String): FluentBuilder = apply { this.assumedRoleId = assumedRoleId }
    }
}
