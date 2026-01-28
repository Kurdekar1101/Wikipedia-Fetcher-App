# Wikipedia Fetcher App

A simple Spring Boot application that fetches Wikipedia summaries using the Wikipedia REST API and displays results on a frontend search page. Users can search for any topic and see a brief summary, thumbnail image, and a link to the full Wikipedia page.

---

## Features

- Search any topic on Wikipedia.
- Display title, summary, and thumbnail image (if available).
- Link to full Wikipedia article.
- Clean and responsive frontend design.

---

## Tech Stack

- **Backend:** Java, Spring Boot, RestTemplate
- **Frontend:** HTML, CSS, JavaScript
- **Build Tool:** Maven

---

## Project Structure
```bash
Wikipedia-Fetcher-App/
├── src/
│ ├── main/
│ │ ├── java/com/example/wikipedia/
│ │ │ ├── Controller/WikiController.java
│ │ │ ├── Service/WikiService.java
│ │ │ └── WikipediaApplication.java
│ │ └── resources/
│ │ └── static/index.html
├── pom.xml
├── .gitignore
└── README.md
---

## Prerequisites

- Java 17+ installed
- Maven installed
- Git (optional, for cloning)

---

## Setup & Run Locally

1. **Clone the repository:**

```bash
git clone https://github.com/Kurdekar1101/Wikipedia-Fetcher-App.git
cd Wikipedia-Fetcher-App

