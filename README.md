# 🏫 Chikoro Backend - School Management API

## 📋 Overview

**Chikoro Backend**It is a modern, scalable School Management System backend API built with **Spring Boot 4.0.2** and **Java 21**. This API provides comprehensive management features for educational institutions, including student management, course administration, attendance tracking, and more.

## 🚀 Tech Stack

| Component | Technology | Version | Purpose |
|-----------|------------|---------|---------|
| **Backend Framework** | Spring Boot | 4.0.2 | Core application framework |
| **Java Version** | Java | 21 | Programming language |
| **Build Tool** | Maven | - | Dependency management & build |
| **Database** | PostgreSQL | Latest | Primary data storage |
| **Cloud Storage** | Bun Cloud | - | File storage & media hosting |
| **Web Framework** | Spring Web MVC | - | REST API development |
| **Monitoring** | Spring Boot Actuator | - | Application health & metrics |
| **Development** | Spring Boot DevTools | - | Hot reload & development tools |

## 🗄️ Database Schema

We use **PostgreSQL** as our primary relational database. Key features:

- ✅ **ACID Compliance** - Ensures data integrity
- ✅ **JSON Support** - Flexible data structures
- ✅ **Full-Text Search** - Advanced search capabilities
- ✅ **Scalability** - Handles large datasets efficiently
- ✅ **Security** - Robust authentication & authorization

## ☁️ Cloud Storage with Bun Cloud

For file storage and media hosting, we leverage **Bun Cloud**:

| Feature | Benefit |
|---------|---------|
| **Object Storage** | Store student documents, images, and files |
| **CDN Integration** | Fast content delivery worldwide |
| **Scalability** | Automatically scales with demand |
| **Security** | Encrypted storage & access controls |
| **Cost-Effective** | Pay only for what you use |

## 📁 Project Structure

```
chikoro_backend/
├── src/main/java/com/xanyati/chikoro_backend/
│   ├── ChikoroBackendApplication.java    # Main application class
│   ├── controllers/                      # REST API controllers
│   ├── services/                         # Business logic layer
│   ├── repositories/                     # Data access layer
│   ├── models/                           # Entity classes
│   └── config/                           # Configuration classes
├── src/main/resources/
│   ├── application.properties            # Application configuration
│   ├── static/                           # Static resources
│   └── templates/                        # View templates
└── src/test/                            # Test files
```

## 🛠️ Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+
- PostgreSQL 14+
- Bun Cloud account (for file storage)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-org/chikoro_backend.git
   cd chikoro_backend
   ```

2. **Configure database**
   - Create a PostgreSQL database
   - Update `application.properties` with your credentials

3. **Configure Bun Cloud**
   - Create a Bun Cloud account
   - Get your API keys
   - Add credentials to configuration

4. **Build and run**
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

### Configuration

Create `src/main/resources/application.properties`:

```properties
# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/chikoro_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

# Bun Cloud Configuration
bun.cloud.api-key=your_api_key
bun.cloud.bucket-name=chikoro-storage
bun.cloud.region=us-east-1

# Server Configuration
server.port=8080
spring.application.name=chikoro-backend
```

## 📚 API Features

### Core Modules

| Module | Endpoints | Description |
|--------|-----------|-------------|
| **Student Management** | `/api/students/*` | CRUD operations for students |
| **Course Management** | `/api/courses/*` | Manage courses & curriculum |
| **Attendance Tracking** | `/api/attendance/*` | Record & monitor attendance |
| **Grade Management** | `/api/grades/*` | Handle student grades & reports |
| **User Authentication** | `/api/auth/*` | User login & registration |
| **File Management** | `/api/files/*` | Upload/download files via Bun Cloud |

### API Documentation

Once running, access:
- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **API Docs**: `http://localhost:8080/v3/api-docs`
- **Actuator Endpoints**: `http://localhost:8080/actuator`

## 🧪 Testing

Run tests with:
```bash
./mvnw test
```

Test coverage includes:
- ✅ Unit tests for services
- ✅ Integration tests for controllers
- ✅ Repository tests with H2 database
- ✅ API endpoint testing

## 📊 Monitoring & Health

Spring Boot Actuator provides:
- **Health Checks**: `GET /actuator/health`
- **Metrics**: `GET /actuator/metrics`
- **Info**: `GET /actuator/info`
- **Environment**: `GET /actuator/env`

## 🔐 Security Features

- JWT-based authentication
- Role-based access control (RBAC)
- Password encryption with BCrypt
- CORS configuration
- Rate limiting
- SQL injection prevention

## 🚢 Deployment

### Docker Deployment

```dockerfile
FROM openjdk:21-jdk-slim
COPY target/chikoro_backend-*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

### Cloud Deployment Options

| Platform | Configuration | Notes |
|----------|---------------|-------|
| **AWS** | ECS/EKS with RDS | Full AWS ecosystem |
| **Azure** | App Service with Azure DB | Microsoft ecosystem |
| **Google Cloud** | Cloud Run with Cloud SQL | Google ecosystem |
| **Heroku** | Heroku Postgres add-on | Simple deployment |

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit changes (`git commit -m 'Add amazing feature'`)
4. Push to branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Support

For support, email support@xanyati.com or open an issue in the GitHub repository.

---

**Built with ❤️ by Xanyati Team** | **Version**: 0.0.1-SNAPSHOT | **Last Updated**: January 2026
