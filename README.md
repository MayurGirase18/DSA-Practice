# Array Stack Implementation in Java (DSA)

This project implements a **Stack data structure using an array** in Java.  
It is a menu-driven program created for understanding **Data Structures and Algorithms (DSA)** concepts clearly.

---

## 📌 Stack Overview

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
The element inserted last is removed first.

---

## 🚀 Operations Supported

1. **Push**  
   Inserts an element into the stack if it is not full.

2. **Pop**  
   Removes the top element from the stack if it is not empty.

3. **Peep**  
   Displays the element stored at a given index in the stack.

4. **Display**  
   Shows all the elements present in the stack.

---

## ⚙️ Implementation Details

- Stack is implemented using a **static integer array**
- Stack size is entered by the user at runtime
- `top` variable tracks the current top element
- Overflow and underflow conditions are handled

---

## 🔁 Program Flow

1. Start the program
2. Ask the user to enter the **size of the stack**
3. Create the stack array with the given size
4. Display the stack operation menu:
   - Push
   - Pop
   - Peep
   - Display
   - Exit
5. Accept the user's choice
6. Perform the selected operation:
   - **Push**:  
     - Check for stack overflow  
     - Insert element and increment `top`
   - **Pop**:  
     - Check for stack underflow  
     - Remove element and decrement `top`
   - **Peep**:  
     - Check if stack is empty  
     - Display element at the given index
   - **Display**:  
     - Print all stack elements from bottom to top
7. Repeat the menu until the exit condition is met
8. End the program

---

## 🧠 Key Variables

- `int[] arr` – Stores stack elements  
- `int top` – Index of the top element  
- `int size` – Maximum stack capacity  

---