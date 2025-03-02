<!-- === WATCHER HEADER START === -->
<!-- File: todo-android/README.md -->
<!-- Managed by file watcher -->
<!-- === WATCHER HEADER END === -->
# 🤖 Todo App Android Client

This repository contains the Android Kotlin client implementation for the Todo App ecosystem. It provides a native Android interface for creating, managing, and synchronizing todo lists.

## 📚 Overview

The Android client is part of the larger Todo App ecosystem that enables secure, decentralized todo list management. Key features include:

- Local todo list creation and management
- Secure storage using Android's security capabilities
- Synchronization with IPFS for cross-device access
- Cryptographic identity management for secure operations

## 🧩 Current Implementation

The Android client currently implements:

- ✅ Basic application structure with Gradle configuration
- ✅ Echo Service that satisfies initial requirements (System.1.1.Android.1)
- ✅ Unit tests mapped to requirements
- ✅ CI integration with the system repository
- 🚧 UI implementation (planned)
- 🚧 Full IPFS integration (planned)

## 🔧 Technology Stack

- **Language**: Kotlin 1.7.20+
- **Minimum Android Version**: API 24 (Android 7.0 Nougat)
- **Target Android Version**: API 33 (Android 13)
- **Build System**: Gradle
- **Testing Framework**: JUnit 4
- **CI Pipeline**: GitHub Actions

## 🚀 Getting Started

### Prerequisites

- Android Studio Dolphin (2022.1.1) or newer
- JDK 8 or higher
- Android SDK with API level 33
- Git

### Development Setup

1. Clone this repository:
```bash
git clone https://github.com/journalbrand/todo-android.git
```

2. Open the project in Android Studio:
```bash
studio todo-android
```

3. Build the application:
```bash
cd todo-android
./gradlew build
```

4. Run tests:
```bash
./gradlew test
```

### Project Structure

```
todo-android/
├── app/                    # Main application module
│   ├── build.gradle        # Module-level build configuration
│   └── src/
│       ├── main/           # Main source code
│       │   ├── java/       # Kotlin/Java sources
│       │   │   └── com/journalbrand/todo/
│       │   │       └── EchoService.kt # Initial service implementation
│       │   ├── res/        # Android resources
│       │   └── AndroidManifest.xml # App manifest
│       └── test/           # Unit tests
│           ├── java/       # Test sources
│           │   └── com/journalbrand/todo/
│           │       └── EchoServiceTest.kt # Tests for EchoService
│           └── test-mappings.jsonld # Mapping of tests to requirements
├── build.gradle            # Project-level build configuration
├── gradle.properties       # Gradle configuration properties
└── requirements/           # Component requirements
    └── requirements.jsonld # Android-specific requirements
```

## 📋 Requirements

The Android client implements specific requirements defined in the JSON-LD format:

- Requirements are stored in `requirements/requirements.jsonld`
- Tests are mapped to requirements in `app/src/test/test-mappings.jsonld`
- Every implementation must satisfy specific requirements

### Key Requirements

- **System.1.1.Android.1**: Input handling capability (implemented in EchoService)
- **System.1.1.Android.1.1**: Todo List Management (planned)
- **System.1.1.Android.1.2**: Todo Item Management (planned)
- **System.1.1.Android.1.3**: Android Local Storage (planned)
- **System.2.1.Android.1.1**: Android IPFS Backup (planned)
- **System.3.1.Android.1**: Android Cryptographic Identity (planned)

## 🧪 Testing

All code must be thoroughly tested and mapped to requirements:

1. Each test should verify a specific requirement
2. Test mapping should be defined in `app/src/test/test-mappings.jsonld`
3. Run tests before submitting changes:
```bash
./gradlew test
```

## 🔄 CI/CD Integration

This repository integrates with the Todo App CI/CD pipeline:

- **CI Workflow**: `.github/workflows/ci.yml`
- **Artifacts**: Test results in JSON-LD format
- **Integration**: Test results are sent to the system repository for compliance checks

## 🔗 Related Repositories

The Android client is part of a multi-repository ecosystem:

- [todo-system](https://github.com/journalbrand/todo-system) - System-level coordination, requirements and CI/CD orchestration
- [todo-ios](https://github.com/journalbrand/todo-ios) - iOS client
- [todo-ipfs](https://github.com/journalbrand/todo-ipfs) - IPFS node implementation

## 📝 Contributing

To contribute to the Android client:

1. Fork the repository
2. Create a feature branch
3. Implement your changes following Kotlin best practices
4. Add tests that map to requirements
5. Ensure the CI workflow passes
6. Submit a pull request

## 📜 License

This project is licensed under the MIT License - see the LICENSE file for details. 
