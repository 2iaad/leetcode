# Java Collections Quick Guide

## 1) List
`List<Integer> list = new ArrayList<>();`

Technical summary: An ordered, index-based collection that allows duplicates and preserves insertion order.

## 2) Set
`Set<Integer> set = new HashSet<>();`

Technical summary: A collection of unique elements with no duplicate values; `HashSet` provides average O(1) add/contains/remove.

## 3) Map
`Map<String, Integer> map = new HashMap<>();`

Technical summary: A key-value data structure where each key is unique and maps to one value; optimized for fast lookup by key.

## 4) Queue
`Queue<Integer> queue = new LinkedList<>();`

Technical summary: A FIFO structure where elements are inserted at the tail and removed from the head.

## 5) Deque
`Deque<Integer> deque = new ArrayDeque<>();`

Technical summary: A double-ended queue supporting insertion and removal from both front and back.

## When To Use + Common Methods

| Type | When to use | Example | Most used methods |
|---|---|---|---|
| List (`ArrayList`) | Need ordered data, positional access, or duplicates | Store daily temperatures where order matters and duplicate values are valid | `add`, `get`, `set`, `remove`, `size`, `contains` |
| Set (`HashSet`) | Need uniqueness and fast membership checks | Track visited node IDs in graph traversal | `add`, `contains`, `remove`, `size`, `isEmpty` |
| Map (`HashMap`) | Need fast lookup from key to value | Count word frequencies: word -> count | `put`, `get`, `getOrDefault`, `containsKey`, `remove`, `keySet` |
| Queue (`LinkedList`) | Need FIFO processing | Process print jobs in arrival order | `offer`, `poll`, `peek`, `isEmpty`, `size` |
| Deque (`ArrayDeque`) | Need operations on both ends (queue + stack behavior) | Sliding window maximum or browser history-like operations | `addFirst`, `addLast`, `pollFirst`, `pollLast`, `peekFirst`, `peekLast`, `push`, `pop` |