# SmartShop – AI-Powered E-Commerce Platform

> 🚧 Status: In Progress

## Overview
SmartShop is a full-stack AI-powered e-commerce 
platform built with Java Spring Boot backend 
and React.js frontend.

## Features
- 🔐 JWT Authentication & Authorization
- 👥 Role-Based Access (USER/ADMIN)
- 🛒 Product Catalog with Search & Filter
- 🛍️ Cart & Order Management
- 🤖 AI Chatbot (Google Gemini via Spring AI)
- 🔍 Smart Search using Natural Language
- 💡 Personalized Product Recommendations

## Tech Stack
### Backend
- Java 17 + Spring Boot 3.x
- Spring Security + JWT
- Spring AI + Google Gemini API
- MySQL + Spring Data JPA
- Lombok, Maven

### Frontend
- React.js (In Progress)
- Axios for API calls

## API Endpoints
### Auth
- POST /api/v1/auth/register
- POST /api/v1/auth/login

### Products
- GET /api/v1/products
- GET /api/v1/products/search
- POST /api/v1/products (Admin)

### Cart
- GET /api/v1/cart
- POST /api/v1/cart/add
- DELETE /api/v1/cart/{id}

### Orders
- POST /api/v1/orders/place
- GET /api/v1/orders/my

### AI
- POST /api/v1/ai/chat
- POST /api/v1/ai/search
- GET /api/v1/ai/recommend

## Setup Instructions
1. Clone the repo
2. Copy application-example.properties 
   to application.properties
3. Add your credentials
4. Run: mvn spring-boot:run

## Status
- ✅ Backend APIs Complete
- ✅ JWT Authentication
- ✅ Spring AI Integration
- 🔄 React Frontend In Progress
- ⏳ Deployment Coming Soon# SmartShop-Backend
