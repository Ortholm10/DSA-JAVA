# DSA-JAVA

My data structures and algorithms practice in **Java**, organised by pattern. Every solution is a small, runnable file with the idea, time and space complexity written at the top.

[![Java](https://img.shields.io/badge/Java-21-orange)](https://openjdk.org/) [![LeetCode](https://img.shields.io/badge/LeetCode-Ortholm10-FFA116)](https://leetcode.com/u/Ortholm10/) [![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

**About me:** 2nd-year B.Tech CSE student at UVCE, Bengaluru (batch 2025–2029), building towards a Java backend and AI internship.
**Profiles:** [GitHub](https://github.com/Ortholm10) · [LeetCode](https://leetcode.com/u/Ortholm10/)

## Progress

Update the count each time you add a solution.

| # | Topic | Solved |
| --- | --- | :---: |
| 01 | [Arrays & Hashing](01-arrays-and-hashing/) | 0 |
| 02 | [Two Pointers](02-two-pointers/) | 0 |
| 03 | [Sliding Window](03-sliding-window/) | 0 |
| 04 | [Stack & Queue](04-stack-and-queue/) | 0 |
| 05 | [Binary Search](05-binary-search/) | 0 |
| 06 | [Linked List](06-linked-list/) | 0 |
| 07 | [Recursion & Backtracking](07-recursion-and-backtracking/) | 0 |
| 08 | [Trees](08-trees/) | 0 |
| 09 | [Heap / Priority Queue](09-heap-priority-queue/) | 0 |
| 10 | [Greedy](10-greedy/) | 0 |
| 11 | [Graphs](11-graphs/) | 0 |
| 12 | [Dynamic Programming](12-dynamic-programming/) | 0 |
| | **Total** | **0** |

Extras: [SQL](sql/) · [Contests](contests/) · [Codeforces](codeforces/)

## Repository structure

```
DSA-JAVA/
├── 01-arrays-and-hashing/     one folder per pattern, each with its own README table
├── ...
├── 12-dynamic-programming/
├── sql/                       LeetCode SQL 50
├── contests/                  upsolved contest problems
├── codeforces/                Codeforces problems
├── templates/Template.java    starting point for every new solution
└── README.md
```

## How each solution is written

1. Copy [`templates/Template.java`](templates/Template.java) into the right topic folder.
2. Rename the file and the class to the problem name, for example `TwoSum.java` with `public class TwoSum`.
3. Fill in the header: LeetCode number, link, pattern, idea in my own words, time and space.
4. Add a few checks in `main` so the file runs on its own.
5. Add a row to the topic's README table and bump the count above.

Files have no `package` line, so each one compiles and runs by itself.

## Run a solution

```bash
cd 01-arrays-and-hashing
javac TwoSum.java
java TwoSum
```

Needs JDK 21 or newer.

## My rules

- **45-minute rule:** if I'm stuck after 45 minutes, I read the idea (not the code), close it, and write the solution from scratch. I then re-solve it a few days later.
- **Pattern first:** I name the pattern before writing code.
- **Commit messages:** `Add Two Sum (LC 1)`, one problem per commit.

## Resources

- [NeetCode 150](https://neetcode.io/practice) for the problem list
- [Striver's A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/) for extra practice
- [LeetCode](https://leetcode.com/) for judging and weekly contests

## License

[MIT](LICENSE)
