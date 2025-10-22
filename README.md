# Bank Account Simulator

A simple Java command-line program that simulates basic bank account operations.

---

## 🎯 Objective
Create a bank account simulator to practice designing and building a full, end-to-end Java application.

---

## 🧠 Learning Goals
- Strengthen and apply core **object-oriented programming principles**.
- Write **clean, readable, maintainable code** with clear separation of concerns.
- Maintain a **structured, professional GitHub repository**.
- Deliver a **fully functional MVP**, then iterate with new features and refinements.
- Gradually integrate **new Java concepts** as they are learned (e.g., generics, reflection, patterns, JSON).

---

## 🏗️ Planned Features (MVP)
- Create, deposit, withdraw, transfer, and close accounts.
- Support multiple account types: Checking, Savings, and Credit.
- Persist data to a local file for simple storage.
- Command-line interface for user interaction.

---

## 🔄 Project Roadmap
1. **MVP:** Basic account management, file I/O, and CLI.
2. **Post-MVP:** Add interest rules, transaction history, and validation improvements.
3. **Later iterations:** Introduce patterns (Factory, Strategy), JSON persistence, and unit tests.

---

## 📁 Planned Package Structure

- **bank.ui** - BankUI 

- **bank.domain** - Account - CheckingAccount - SavingsAccount - CreditAccount - Status

- **bank.service** - AccountService

- **bank.storage** - AccountRepository - FileAccountRepository - AccountSerializer

## 🧰 Tech Stack
- **Language:** Java
- **Build Tool:** Gradle
- **Storage:** File-based (CSV for MVP)
- **Environment:** Command-line application

---

## 🚧 Current Progress
- Implemented `CLIMenu` class for user interaction.
- Menu supports input handling and basic navigation.
- Next step: add `BankUI` entry point and connect service logic.

---

## ▶️ How to Run
After building the project, the application will start from the `Main` class:
```bash
gradlew run