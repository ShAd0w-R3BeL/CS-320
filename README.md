CS 320: Software Testing, Automation, and Quality Assurance
Southern New Hampshire University

📌 Overview
This repository contains the software testing suites, automation scripts, and quality assurance documentation developed during the CS 320 course at SNHU. The focus of this course is on applying rigorous testing strategies—including unit testing, verification, and validation—throughout the Software Development Life Cycle (SDLC) to ensure high-quality, error-free applications.

🎯 Course Competencies
I have demonstrated technical proficiency in the following competencies:

Unit Testing (CS-30415): Creating robust unit tests using JUnit 5 to uncover logic errors and ensure code coverage.

Testing Analysis (CS-30416): Analyzing various software testing approaches (Static vs. Dynamic, Manual vs. Automated) based on specific business requirements.

Strategic Strategy Application (CS-30417): Applying appropriate testing strategies—such as black-box and white-box testing—to meet functional and non-functional requirements.

📝 Reflection & Portfolio Narrative
How can I ensure that my code, program, or software is functional and secure?
I ensure functionality and security by shifting testing to the left in the development cycle. Using JUnit 5, I developed test suites for the Contact, Task, and Appointment services that target 100% branch coverage. This ensures every logic path—including error handling for null values and character limits—is verified. Security is addressed through defensive programming and input validation; for example, ensuring that unique IDs are immutable once set prevents unauthorized data manipulation within the service.

How do I interpret user needs and incorporate them into a program?
I interpret user needs by decomposing business requirement documents into specific technical constraints. For the Contact Service, "user needs" were expressed as strict data requirements (e.g., a 10-digit phone number). I incorporated these by implementing validation logic in the constructors and setters of my Java classes. By writing tests that specifically target these requirements, I create a feedback loop that guarantees the software aligns with the original user specifications.

How do I approach designing software?
My approach to software design is centered on modularity and testability. I separate the data objects (like Contact.java) from the business logic (like ContactService.java). This separation of concerns allows for easier maintenance and more focused unit testing. By designing with a "test-first" mindset, I ensure that each component is decoupled and that the system architecture can handle edge cases without failing the entire application.

🛠 Tech Stack & Tools
Language: Java

Framework: JUnit 5

Environment: Codio / Eclipse

Concepts: Test-Driven Development (TDD), Boundary Value Analysis, Equivalence Partitioning, and Continuous Integration.

📂 Project Highlights
Project One: Unit Testing & Coverage
Objective: Building a comprehensive test suite for a multi-service application.

Deliverables: Verified the reliability of the application using JUnit tests, ensuring that all requirements were met through automated validation of Contact, Task, and Appointment services.

Project Two: Comprehensive Test Plan & Execution
Objective: Developing a full-scale testing strategy and reflection.

Deliverables: Integrated automation and manual testing concepts to report on defects, released escapements, and overall software quality management.

📖 Key Learnings
The SDLC Role: Understanding how testing integrates into every phase, from requirements gathering to maintenance.

Automation: Leveraging Maven and JUnit to reduce manual regression testing and increase deployment speed.

Quality Management: Utilizing ISO/IEC/IEEE 29119-3 standards to maintain professional-grade QA documentation.

⚖️ Academic Integrity & AI Disclosure
These projects were completed for academic credit at Southern New Hampshire University.

AI Usage: Generative AI was used as a tool for structuring documentation and troubleshooting test failures, in compliance with the SNHU discipline-specific AI guidelines.

Usage Note: This code is for portfolio demonstration only. Current students should refer to the SNHU Academic Integrity Policy before utilizing any external code.

🚀 Getting Started
To explore the code in this repository, you can clone it to your local machine:

git clone https://github.com/ShAd0w-R3BeL/CS-300.git

📫 Contact
Name: Matthew Wood

Email: matthew.wood16@snhu.edu

LinkedIn: linkedin.com/in/matthew-r-wood-56b3b44b/
