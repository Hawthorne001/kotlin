// ISSUE: KT-57100
// WITH_STDLIB

interface C07I01{
    fun some() {}
}

interface C07I02{
    suspend fun some() {}
}

class C07C01: C07I01, C07I02 {
    override <!CONFLICTING_OVERLOADS!>fun some()<!> {}
}
