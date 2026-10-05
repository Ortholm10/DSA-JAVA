# Arrays & Hashing

Frequency counting, fast lookups with `HashMap` / `HashSet`, prefix sums.

## Problems Solved

| # | Problem | Difficulty | Key idea | Time | Space | Solution |
| --- | --- | --- | --- | --- | --- | --- |
| 1 | Contains Duplicate | Easy | `HashMap` lookup before insert | O(n) | O(n) | [ContainsDuplicate.java](ContainsDuplicate.java) |
| 2 | Valid Anagram | Easy | Count array of 26 letters | O(n) | O(1) | [ValidAnagram.java](ValidAnagram.java) |
| 3 | Two Sum | Easy | One-pass `HashMap` of complements | O(n) | O(n) | [TwoSum.java](TwoSum.java) |
| 4 | Group Anagrams | Medium | Sorted word as `HashMap` key | O(n · k log k) | O(n · k) | [GroupAnagrams.java](GroupAnagrams.java) |

> `n` = number of elements (or words), `k` = length of the longest word.

---

## 1. Contains Duplicate

**Problem:** Return `true` if any value appears at least twice in the array.

**Approach:** Walk through the array once, keeping a `HashMap` of values already seen.
- If the current number is already in the map, a duplicate exists, so return `true`.
- Otherwise add it and continue.
- If the loop finishes, return `false`.

| | Complexity | Why |
| --- | --- | --- |
| Time | O(n) | One pass; `containsKey` and `put` are O(1) on average |
| Space | O(n) | The map can hold every element if there are no duplicates |

**Note:** The map stores the index as its value, but it is never read. A `HashSet<Integer>` does the same job with less code.

---

## 2. Valid Anagram

**Problem:** Return `true` if `t` is an anagram of `s` (same letters, same counts).

**Approach:** Count letters with a fixed-size `int[26]` array instead of a map.
- If the lengths differ, return `false` right away.
- For each index, add 1 for the letter in `s` and subtract 1 for the letter in `t` (`c[ch - 'a']`).
- If every count ends at 0, the strings are anagrams.

| | Complexity | Why |
| --- | --- | --- |
| Time | O(n) | One pass over the strings, then a fixed 26-step check |
| Space | O(1) | The count array is always 26 ints, regardless of input size |

**Note:** This assumes lowercase letters `a-z` only. For Unicode input, switch to a `HashMap<Character, Integer>`, which makes space O(k) for `k` distinct characters.

---

## 3. Two Sum

**Problem:** Return the indices of the two numbers that add up to `target`.

**Approach:** One-pass `HashMap` that maps each value to its index.
- For each `nums[i]`, compute the complement `target - nums[i]`.
- If the complement is already in the map, return both indices.
- Otherwise store `nums[i] -> i` and move on.

| | Complexity | Why |
| --- | --- | --- |
| Time | O(n) | Each element is visited once with an O(1) lookup |
| Space | O(n) | The map may store up to n entries |

**Note:** The brute-force version checks every pair, which is O(n²) time. The map trades O(n) extra space for a much faster lookup.

---

## 4. Group Anagrams

**Problem:** Group the words that are anagrams of each other.

**Approach:** Use the sorted letters of each word as a canonical key.
- Sort the characters of a word (`"eat"` -> `"aet"`).
- Anagrams always produce the same sorted key, so use it as the key in a `HashMap<String, List<String>>`.
- Add the original word to that key's list.
- Return all the lists with `new ArrayList<>(map.values())`.

| | Complexity | Why |
| --- | --- | --- |
| Time | O(n · k log k) | Sorting each of the n words of length k costs k log k |
| Space | O(n · k) | The map stores every word plus its sorted key |

**Note:** A 26-count array as the key (as in Valid Anagram) removes the sort and gives O(n · k) time.

---

## Patterns Used

- **Seen-before check:** `HashMap` / `HashSet` lookups in O(1) replace nested loops (Contains Duplicate, Two Sum).
- **Frequency counting:** a count array for a small fixed alphabet (Valid Anagram).
- **Canonical key:** transform each item into a shared key so equivalent items group together (Group Anagrams).
