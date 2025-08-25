# design-patterns-study
# Java Design Patterns — Before & After

A curated collection of **Java design pattern implementations** with clear explanations, runnable examples, and **side‑by‑side comparisons** of code **before** and **after** applying each pattern.

---

## What you'll find

* Concise explanations of each pattern’s intent and when to use it.
* A **`before/`** package showing the naïve or tightly coupled approach.
* An **`after/`** package showing the refactored solution using the pattern.
* Notes on benefits, trade‑offs, and how the pattern improves the design.

---

## Repository structure

Each top‑level package (folder) represents a **pattern category** (e.g., `behavioral`, `creational`, `structural`). Inside each pattern, you’ll find two sub‑packages:

```
<category>/<pattern>/
├─ before/   # Implementation without the pattern (baseline)
└─ after/    # Refactored implementation using the pattern
```

**Example (Observer Pattern):**

```
behavioral/observer/
├─ before/
│  ├─ Customer.java
│  ├─ Product.java
│  └─ Main.java
└─ after/
   ├─ Observer.java
   ├─ Subject.java
   ├─ Customer.java
   ├─ Product.java
   └─ Main.java
```

---

## How to run

You can run examples using any Java‑friendly setup (IDE or command line). Typical options:

* **IDE (IntelliJ/Eclipse/VS Code):** Open the project and run the `Main` class inside each `before/` or `after/` package.
* 
---
## Goals

* Demonstrate how patterns **reduce coupling**, **improve extensibility**, and **clarify responsibilities**.
* Provide minimal, focused examples you can copy, run, and adapt.


Choose a license that fits your needs (e.g., MIT). Add it as `LICENSE` at the repo root.

