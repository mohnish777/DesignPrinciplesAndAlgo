# 🚀 Kotlin Mastery: Design Principles & Algorithms

> A comprehensive learning repository showcasing hands-on practice with **SOLID principles**, **Design Patterns**, **Kotlin Coroutines**, and **Data Structures & Algorithms**.

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-Studio-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

---

## 📋 Table of Contents

- [Overview](#-overview)
- [What's Inside](#-whats-inside)
- [Project Structure](#-project-structure)
- [Key Implementations](#-key-implementations)
- [Learning Progress](#-learning-progress)
- [How to Run](#-how-to-run)
- [Connect](#-connect)

---

## 🎯 Overview

This repository is my **personal learning playground** where I strengthen my fundamentals in software engineering. It demonstrates my commitment to mastering:

- ✅ **Clean Code Principles** - SOLID, DRY, KISS
- ✅ **Design Patterns** - 23 Gang of Four patterns
- ✅ **Asynchronous Programming** - Kotlin Coroutines, Flow, Channels
- ✅ **Data Structures & Algorithms** - Problem-solving with optimal solutions
- ✅ **Kotlin Advanced Features** - Sealed classes, Higher-order functions, Generics

### 📊 Repository Stats

```
📁 Total Kotlin Files: 100+
🧵 Coroutine Examples: 20+
🧮 Algorithm Solutions: 15+
🎓 Kotlin Concepts: 60+
⏱️ Hours Invested: 200+
```

---

## 📦 What's Inside

### 🏗️ Design Patterns (In Progress)

#### Behavioral Patterns
- [ ] Memento Pattern
- [ ] State Pattern
- [ ] Strategy Pattern
- [ ] Iterator Pattern
- [ ] Command Pattern
- [ ] Template Method Pattern
- [ ] Observer Pattern
- [ ] Mediator Pattern
- [ ] Chain of Responsibility Pattern
- [ ] Visitor Pattern
- [ ] Interpreter Pattern

#### Structural Patterns
- [ ] Composite Pattern
- [ ] Adapter Pattern
- [ ] Bridge Pattern
- [ ] Proxy Pattern
- [ ] Flyweight Pattern
- [ ] Facade Pattern
- [ ] Decorator Pattern

#### Creational Patterns
- [ ] Prototype Pattern
- [ ] Singleton Pattern
- [ ] Factory Method Pattern
- [ ] Abstract Factory Pattern
- [ ] Builder Pattern

### 🧵 Kotlin Coroutines

**Comprehensive coroutine implementations covering:**

| Topic | Implementation | Key Concepts |
|-------|---------------|--------------|
| **Basics** | `code19mins.kt`, `code21mins.kt` | GlobalScope, launch, Thread management |
| **Structured Concurrency** | `code33mins.kt`, `code48mins.kt` | runBlocking, coroutine scope |
| **Async/Await** | `code52.10mins.kt`, `Async&Await.kt` | Deferred, async builders |
| **Dispatchers** | `code1hr05mins/`, `code1hr08mins.kt` | IO, Main, Default dispatchers |
| **Advanced** | `UserDataManager.kt`, `urlrace4.kt` | Real-world async patterns |
| **Cancellation** | `code1hr11mins.kt`, `code1hr13mins.kt` | Cooperative cancellation |
| **Suspension** | `bostansmeeting/code1.kt` | suspendCancellableCoroutine |

**Highlights:**
- 🎯 Converting callback-based APIs to suspend functions
- 🏎️ URL race condition handling with coroutines
- 📊 Parallel data fetching with async/await
- 🛡️ Proper exception handling in coroutines

### 🧮 Data Structures & Algorithms

**Algorithm implementations with time/space complexity analysis:**

| Problem | Solution | Time | Space |
|---------|----------|------|-------|
| **Pair Sum** | HashMap approach | O(n) | O(n) |
| **Pair Product** | Complement lookup | O(n) | O(n) |
| **Anagrams** | Character frequency | O(n+m) | O(n) |
| **Intersection** | Set-based lookup | O(n+m) | O(min(n,m)) |
| **Most Frequent Char** | HashMap counting | O(n) | O(n) |
| **Sum Numbers (Recursive)** | Recursion | O(n) | O(n) |

**Key Features:**
- ✅ Multiple approaches (brute force vs optimized)
- ✅ Detailed complexity analysis in comments
- ✅ Performance testing with large datasets
- ✅ Clean, readable Kotlin code

### 🎓 Kotlin Fundamentals

**Core Kotlin concepts practiced:**

- **OOP Principles**: Inheritance, Polymorphism, Abstraction, Encapsulation
- **Advanced Features**: 
  - Sealed Classes (`video48.kt`)
  - Object Declarations (`video45.kt`)
  - Interfaces & Abstract Classes (`video42.kt`, `video43.kt`)
  - Visibility Modifiers (`video41.kt`)
  - Higher-Order Functions & Lambdas (`video49.kt`)
  - Generics & Variance (`Covariance.kt`)
- **Functional Programming**: Lambda expressions, Extension functions, Scope functions

---

## 📁 Project Structure

```
app/src/main/java/com/example/designPrinciplesAndAlgo/
│
├── 🧵 coroutine/              # Kotlin Coroutines implementations
│   ├── anushkaudemy/          # Async/Await patterns
│   ├── bostansmeeting/        # Suspension & cancellation
│   └── code*.kt               # Progressive learning files
│
├── 🧮 strucyByAlvin/          # Data Structures & Algorithms
│   ├── PairSum.kt
│   ├── PairProduct.kt
│   ├── anagrams.kt
│   ├── intersection.kt
│   └── ...
│
├── 🎓 smartherd/              # Kotlin fundamentals
│   ├── video*.kt              # Concept-wise practice files
│   └── urlrace*.kt            # Coroutine race conditions
│
├── 🏗️ practice/              # Advanced Kotlin features
│   └── Covariance.kt
│
└── 📱 MainActivity.kt         # Android integration
```

---

## 🔥 Key Implementations

### 1️⃣ Coroutine-Based URL Race Detector
```kotlin
// Fetches multiple URLs concurrently and finds the fastest
class UrlRace(val links: ArrayList<String>) {
    suspend fun fastestLink() {
        coroutineScope {
            for (link in links) {
                launch { list.add(fetchUrl(link)) }
            }
        }
        println("Fastest: ${list.sortedBy { it.second }.get(0)}")
    }
}
```

### 2️⃣ Optimized Pair Sum (O(n) solution)
```kotlin
fun pairSum(numbers: List<Int>, targetSum: Int): List<Int> {
    val previousNums: HashMap<Int, Int> = hashMapOf()
    numbers.forEachIndexed { index, num ->
        val complement = targetSum - num
        if (complement in previousNums.keys)
            return listOf(previousNums[complement]!!, index)
        previousNums[num] = index
    }
    return listOf()
}
```

### 3️⃣ Callback to Suspend Function Conversion
```kotlin
suspend fun fetchConvertToSuspend(callbackApi: CallbackApi): String {
    return suspendCancellableCoroutine { cont ->
        callbackApi.fetchData { result, error ->
            if (error != null) cont.resumeWithException(Exception("Error"))
            else cont.resume(result!!)
        }
    }
}
```

---

## 📊 Learning Progress

### ✅ Completed
- [x] Kotlin Fundamentals (60+ practice files)
- [x] Coroutines Basics & Advanced Patterns
- [x] Data Structures & Algorithms (Array/HashMap problems)
- [x] OOP Principles in Kotlin
- [x] Functional Programming Concepts
- [x] Generics & Variance (Covariance, Contravariance)

### 🔄 In Progress
- [ ] SOLID Principles (S, O, L, I, D)
- [ ] 23 Design Patterns (Behavioral, Structural, Creational)
- [ ] Advanced Algorithm Problems
- [ ] Kotlin Flow & Channels

### 🎯 Upcoming
- [ ] Clean Architecture Implementation
- [ ] Unit Testing with JUnit & MockK
- [ ] Dependency Injection (Hilt/Koin)

---

## 🛠️ How to Run

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 11+
- Kotlin 1.9+

### Steps
```bash
# Clone the repository
git https://github.com/mohnish777/DesignPrinciplesAndAlgo.git

# Open in Android Studio
# File > Open > Select the project directory

# Run any Kotlin file
# Right-click on any .kt file with main() function
# Select "Run 'FileNameKt'"
```

### Running Specific Examples

**Coroutines:**
```bash
# Run any coroutine example
app/src/main/java/com/example/designPrinciplesAndAlgo/coroutine/code48mins.kt
```

**Algorithms:**
```bash
# Run algorithm with test cases
app/src/main/java/com/example/designPrinciplesAndAlgo/strucyByAlvin/PairSum.kt
```

---

## 💡 What Makes This Repository Special?

### 🎓 Learning-Focused
- **Progressive Learning**: Files organized by complexity
- **Detailed Comments**: Every implementation includes explanations
- **Multiple Approaches**: Brute force → Optimized solutions
- **Complexity Analysis**: Time & space complexity documented

### 💼 Interview-Ready
- **Common Patterns**: Covers frequently asked interview problems
- **Best Practices**: Clean code, proper naming, SOLID principles
- **Real-World Scenarios**: Practical implementations, not just theory

### 🚀 Continuous Growth
- **Active Learning**: Regular commits and updates
- **Diverse Topics**: From basics to advanced concepts
- **Hands-On Practice**: Every concept backed by working code

---

## 📚 Resources & References

This repository is built using knowledge from:
- **Kotlin Official Documentation**
- **Structy by Alvin** - Data Structures & Algorithms
- **Smartherd Kotlin Course** - Kotlin Fundamentals
- **Anushka Udemy Course** - Kotlin Coroutines
- **Gang of Four Design Patterns**

---

## 🤝 Connect

I'm actively learning and improving my skills. Feel free to:
- ⭐ Star this repo if you find it helpful
- 🐛 Open issues for suggestions
- 🤝 Connect with me on [LinkedIn](https://www.linkedin.com/in/mohnish-chittoory/)
- 📧 Reach out: cmohnishkumar1205@gmail.com

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

<div align="center">

### 🌟 "The only way to learn a new programming language is by writing programs in it." - Dennis Ritchie

**Made with ❤️ and lots of ☕ by Mohnish Chittoory**

</div>

