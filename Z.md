# Java Data Structures — Quick Reference

| Data Structure & Declaration | How It Differs | Main Methods | When to Use | Memory Layout |
|---|---|---|---|---|
| **Array**<br>`int[] arr = new int[10];`<br>`String[] s = {"a","b"};` | Fixed size, fastest access by index, holds primitives or objects. No built-in resize. | `arr[i]`, `arr.length`, `Arrays.sort()`, `Arrays.copyOf()` | You know the size upfront and need O(1) index access (e.g., DP table, fixed buffer). | **Contiguous block** on heap. Elements stored back-to-back, address = base + i × size. Cache-friendly. |
| **ArrayList**<br>`List<Integer> list = new ArrayList<>();` | Dynamic array, resizes automatically. Slower inserts/removes in middle than `LinkedList`, but faster random access. Only objects (no primitives — uses boxing). | `add(e)`, `get(i)`, `set(i,e)`, `remove(i)`, `size()`, `contains(e)` | Default list when you need a resizable, indexable sequence. | **Contiguous backing array** on heap; doubles in size when full. References to objects, not the objects themselves. |
| **LinkedList**<br>`List<Integer> ll = new LinkedList<>();` | Doubly-linked nodes. O(1) insert/remove at ends, O(n) random access. Worse cache performance than `ArrayList`. | `add(e)`, `addFirst(e)`, `addLast(e)`, `removeFirst()`, `peek()`, `get(i)` | Frequent insertions/deletions at head/tail; or as a `Queue`/`Deque`. | **Scattered nodes** on heap. Each node holds value + 2 pointers (prev, next). Not cache-friendly. |
| **HashMap**<br>`Map<String,Integer> m = new HashMap<>();` | Key-value pairs, O(1) average lookup. Unordered. Allows one `null` key. Differs from `TreeMap` (sorted) and `LinkedHashMap` (insertion order). | `put(k,v)`, `get(k)`, `remove(k)`, `containsKey(k)`, `keySet()`, `entrySet()` | Counting frequencies, caching, fast key lookups (most interview problems). | **Array of buckets** (hash table). Each bucket is a linked list or balanced tree (after threshold). Keys hashed to indices. |
| **HashSet**<br>`Set<String> set = new HashSet<>();` | Unique elements only, O(1) add/lookup. Backed by `HashMap`. No duplicates, unordered. | `add(e)`, `remove(e)`, `contains(e)`, `size()` | Deduplication, "have I seen this?" checks. | Backed by a `HashMap` where values are a dummy constant. Same bucket layout. |
| **TreeMap**<br>`Map<String,Integer> tm = new TreeMap<>();` | Sorted by keys (Red-Black tree). O(log n) ops. Slower than `HashMap` but ordered. | `put`, `get`, `firstKey()`, `lastKey()`, `floorKey(k)`, `ceilingKey(k)` | Need sorted keys, range queries, or nearest-key lookups. | **Red-Black tree nodes** on heap, each with key, value, color, and 3 pointers (parent, left, right). |
| **TreeSet**<br>`Set<Integer> ts = new TreeSet<>();` | Sorted, unique elements. Backed by `TreeMap`. O(log n) ops vs O(1) for `HashSet`. | `add`, `remove`, `first()`, `last()`, `floor(e)`, `ceiling(e)` | Maintain sorted unique values, find closest element. | Backed by `TreeMap` — same Red-Black tree structure. |
| **Stack** (prefer `Deque`)<br>`Deque<Integer> st = new ArrayDeque<>();` | LIFO. `Stack` class is legacy/synchronized — use `ArrayDeque` instead. | `push(e)`, `pop()`, `peek()`, `isEmpty()` | DFS, expression parsing, undo, backtracking. | `ArrayDeque` uses a **circular array**; grows when full. Contiguous, cache-friendly. |
| **Queue / Deque**<br>`Deque<Integer> q = new ArrayDeque<>();` | FIFO (queue) or both ends (deque). `ArrayDeque` is faster than `LinkedList` for queue use. | `offer(e)`, `poll()`, `peek()`, `addFirst`, `addLast` | BFS, sliding window, task scheduling. | **Circular array** on heap (for `ArrayDeque`). |
| **PriorityQueue**<br>`PriorityQueue<Integer> pq = new PriorityQueue<>();` | Min-heap by default. O(log n) insert/remove, O(1) peek. Not sorted on iteration — only the head is min. | `offer(e)`, `poll()`, `peek()`, custom `Comparator` in constructor | Top-K problems, Dijkstra, scheduling by priority. | **Binary heap** stored as a contiguous array. Parent at `(i-1)/2`, children at `2i+1` and `2i+2`. |

---

## Quick Comparison Cheatsheet

| Operation | Array | ArrayList | LinkedList | HashMap | TreeMap |
|---|---|---|---|---|---|
| Access by index | O(1) | O(1) | O(n) | — | — |
| Insert at end | — | O(1) amortized | O(1) | — | — |
| Insert at middle | O(n) | O(n) | O(n) | — | — |
| Search by key/value | O(n) | O(n) | O(n) | O(1) avg | O(log n) |
| Memory locality | Excellent | Excellent | Poor | Moderate | Poor |

---

## Key Memory Concepts

- **Contiguous (Array, ArrayList, ArrayDeque, PriorityQueue):** elements live next to each other → CPU cache loves it → faster in practice.
- **Node-based (LinkedList, TreeMap, TreeSet):** elements scattered, each holds pointers → more memory overhead, more cache misses.
- **Hash-based (HashMap, HashSet):** array of buckets, each bucket points to a chain (or tree) of entries → fast average case, but extra memory for unused buckets (load factor 0.75).
- **In Java, all non-primitive structures store references** to objects on the heap, not the objects themselves. Only `int[]`, `double[]`, etc. hold primitives directly.
