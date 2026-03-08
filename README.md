# 🎓 Sistema de Gestión Universitaria

Sistema de administración universitaria desarrollado en **Java** con conexión a base de datos **MySQL**. Permite gestionar alumnos, materias, notas e inscripciones desde una plataforma centralizada, con sistema de autenticación de usuarios.

---

## ✨ Funcionalidades

- **Gestión de Alumnos** — Alta, modificación y baja de alumnos con datos personales y académicos
- **Registro de Notas** — Carga y actualización de calificaciones por materia
- **Administración de Materias** — CRUD completo de materias disponibles
- **Inscripciones** — Gestión de inscripciones de alumnos a materias
- **Autenticación** — Sistema de login con usuario y contraseña

---

## 🛠️ Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| Java | Lenguaje principal |
| MySQL | Base de datos relacional |
| JDBC | Conexión Java ↔ MySQL |
| IntelliJ IDEA / Eclipse | Entorno de desarrollo |

---

## ⚙️ Requisitos previos

- Java JDK 8 o superior
- MySQL Server
- IDE: IntelliJ IDEA o Eclipse

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/ianrodriguezy/ProyectoTransversalUniversidad.git
   ```

2. Importa el proyecto en tu IDE como proyecto Java existente.

3. Crea la base de datos en MySQL y ejecuta el script SQL ubicado en `/GestionUniversidad/db/`.

4. Configura las credenciales de base de datos en el archivo de conexión.

5. Ejecuta la clase principal `Main.java`.

---

## 📁 Estructura del proyecto

```
ProyectoTransversalUniversidad/
└── GestionUniversidad/
    └── src/
        └── Universidad/
            ├── AccesoaDatos/     # Conexión y acceso a MySQL
            ├── Entidades/        # Clases modelo (Alumno, Materia...)
            └── Vistas/           # Interfaz de usuario
```

---

## 👤 Autor

**Ian Rodriguez**
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Ian%20Rodriguez-0077B5?style=flat&logo=linkedin)](https://www.linkedin.com/in/ian-rodriguez-8351a1221/)
[![GitHub](https://img.shields.io/badge/GitHub-ianrodriguezy-181717?style=flat&logo=github)](https://github.com/ianrodriguezy)
