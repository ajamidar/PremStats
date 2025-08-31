# ⚽PremStats - Premier League StatFinder

**PremStats** is a Java-based Spring Boot application backed by PostgreSQL, designed to give football analysts, fans, and developers rich access to Premier League player and team statistics. The system ingests real-time-esque scraped data via a Python scraping pipeline, normalizes it into CSV, and persists it for fast, filterable querying.

Users can explore in-depth metrics including goals, assists, expected goals (xG), expected assists (xA), disciplinary data, playing time, and more—filtered by attributes like nationality, age, position, and team.

[![Java](https://img.shields.io/badge/Java-21+-blue.svg)]()
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green.svg)]()
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15+-blue.svg)]()
[![License: MIT](https://img.shields.io/badge/License-MIT-lightgrey.svg)]()
[![Code Quality](https://img.shields.io/badge/Code%20Quality-%E2%9C%94%20High-brightgreen.svg)]()

## 📋Table of Contents

- [Key Features](#key-features)  
- [Tech Stack](#tech-stack)
- [Guide](#premstats-guide)

---

## 🚀Key Features

- Comprehensive player and team statistics (goals, assists, xG, xA, cards, minutes, starts, etc.)
- Multi-dimensional filters: nation, age range, position, team, performance thresholds
- Data ingestion via web scraping with Python (BeautifulSoup + pandas)
- CSV conversion pipeline feeding into PostgreSQL
- RESTful API layer with clean endpoints for integration or UI building
- Designed for extensibility: add new metrics, sources, or output consumers easily

---

## 💡PremStats Guide
- Use Data_Scraping.py python file to scrape player/team data from 'https://fbref.com/en/comps/9/Premier-League-Stats' straight onto a CSV file, using BeautifulSoup and pandas
- CSV file's data is then moved into the PostgreSQL database
- Java based Springboot application then accesses the data, which can then me used for further use.
- For example usage, check out the [Demo Video](https://youtu.be/HKyv-CQXnxA), which shows the entire process from start to end.

## 🤖Tech Stack

- **Backend:** Java, Spring Boot  
- **Database:** PostgreSQL  
- **Scraping & ETL:** Python, BeautifulSoup, pandas  
- **Data Exchange:** CSV intermediary  
- **Build/Dependency:** Maven  
- **Configuration:** `.properties` or `.yaml` for Spring Boot  


