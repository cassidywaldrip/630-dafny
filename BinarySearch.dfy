
function sorted(a: array<int>) : bool
    reads a
{
   forall i,j : int :: 0 <= i < j < a.Length ==> a[i] <= a[j]
}

method BinarySearch(a: array<int>, x: int) returns (index: int)
    // what constraints, if any, should you put on the inputs? (requires clause)
        // hint: see above function (and use it!)
    // what constraints should you put on the output? (ensures clause) 
{
    // implement binary search here
    // your while loop is going to need some invariants in order to prove out the ensures clauses
}