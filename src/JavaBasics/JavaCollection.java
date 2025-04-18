package JavaBasics;

public class JavaCollection {
    public static void main(String[] args) {
// What is Java Collections Framework (JCF)?
// The Java Collections Framework is a set of classes and interfaces that implement commonly reusable data structures like:

// Lists
// Sets
// Queues
// Maps

// It helps developers store, access, manipulate, and organize data efficiently.

// ✅ Why do we use Collections in Java?
// Dynamic Data Structures
// Unlike arrays, collections can grow or shrink dynamically.

// Built-in Methods
// Collections provide powerful methods like add(), remove(), contains(), sort(), etc.

// Code Reusability
// You don’t need to write data structure logic from scratch (e.g., linked list or hash table logic).

// Performance Optimization
// Collections are well-tested, optimized, and used in real-world Java apps.

// Interfaces for Flexibility
// You can switch from one type to another easily using interfaces like List, Set, Map.

// 🔗 Hierarchy of Java Collections
// There are two main root interfaces:

// Collection → for storing individual elements

// Map → for storing key-value pairs

// Here’s how they break down:


// 1. Collection
//    ├── List (ordered, allows duplicates)
//    │   ├── ArrayList
//    │   ├── LinkedList
//    │   └── Vector / Stack
//    ├── Set (no duplicates)
//    │   ├── HashSet
//    │   └── LinkedHashSet
//    └── Queue (FIFO)
//        └── PriorityQueue

// 2. Map (key-value pairs)
//    ├── HashMap
//    ├── LinkedHashMap
//    └── TreeMap

// 🧠 When to use what?

// Interface/Class	                         Use Case

// ArrayList	                  Fast random access, dynamic array
// LinkedList	                    Fast insert/delete from ends
// HashSet	                      Unique elements, no specific order
// LinkedHashSet	          Unique elements, maintains insertion order
// HashMap	                   Key-value pairs, fast access via key
// TreeMap	                         Sorted key-value pairs
// Stack	                            LIFO operations
// Queue / Deque	                 FIFO / double-ended queue
    }
}
