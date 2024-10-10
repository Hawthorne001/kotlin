/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Auto-generated file. DO NOT EDIT!
// Generated by org.jetbrains.kotlin.generators.builtins.numbers.primitives.WasmBooleanGenerator

@file:Suppress("UNUSED_PARAMETER")

package kotlin

import kotlin.wasm.internal.*

/** Represents a value which is either `true` or `false`. */
@WasmAutoboxed
public actual class Boolean private constructor(private val value: Boolean) : Comparable<Boolean> {
    @SinceKotlin("1.3")
    public actual companion object {}

    /** Returns the inverse of this boolean. */
    @kotlin.internal.IntrinsicConstEvaluation
    @WasmOp(WasmOp.I32_EQZ)
    public actual operator fun not(): Boolean =
        implementedAsIntrinsic

    /**
     * Performs a logical `and` operation between this Boolean and the [other] one. Unlike the `&&` operator,
     * this function does not perform short-circuit evaluation. Both `this` and [other] will always be evaluated.
     */
    @kotlin.internal.IntrinsicConstEvaluation
    @WasmOp(WasmOp.I32_AND)
    public actual infix fun and(other: Boolean): Boolean =
        implementedAsIntrinsic

    /**
     * Performs a logical `or` operation between this Boolean and the [other] one. Unlike the `||` operator,
     * this function does not perform short-circuit evaluation. Both `this` and [other] will always be evaluated.
     */
    @kotlin.internal.IntrinsicConstEvaluation
    @WasmOp(WasmOp.I32_OR)
    public actual infix fun or(other: Boolean): Boolean =
        implementedAsIntrinsic

    /** Performs a logical `xor` operation between this Boolean and the [other] one. */
    @kotlin.internal.IntrinsicConstEvaluation
    @WasmOp(WasmOp.I32_XOR)
    public actual infix fun xor(other: Boolean): Boolean =
        implementedAsIntrinsic

    @kotlin.internal.IntrinsicConstEvaluation
    public actual override fun compareTo(other: Boolean): Int =
        wasm_i32_compareTo(this.toInt(), other.toInt())

    @kotlin.internal.IntrinsicConstEvaluation
    public actual override fun toString(): String =
        if (this) "true" else "false"

    @kotlin.internal.IntrinsicConstEvaluation
    public actual override fun equals(other: Any?): Boolean {
        return if (other !is Boolean) {
            false
        } else {
            wasm_i32_eq(this.toInt(), other.toInt())
        }
    }

    public actual override fun hashCode(): Int =
        if (this) 1231 else 1237

    @WasmNoOpCast
    internal fun toInt(): Int =
        implementedAsIntrinsic
}
