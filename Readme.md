### **EmployeeProfileSvcApplication.java**

* It contains an annotation: `@SpringBootApplication`

* This `@SpringBootApplication` annotation works like magic. When you run this file, Spring Boot automatically starts an embedded Tomcat server (by default on port 8080), loads all configurations, and gets your application ready. You don’t have to write any code to set up the server.

* In Express, you usually create routes, controllers, and models. Here, the standard architecture follows this pattern:

    * **Controllers (`@RestController`)**: Define API endpoints (e.g., `GET /api/employees/{id}`)
    * **Services (`@Service`)**: Business logic is written here. The controller receives the request and passes it to the service.
    * **Repositories (`@Repository`)**: Database queries are handled here (Spring Data JPA automatically generates queries)
    * **Entities (`@Entity`)**: This is the Java object representation of your database table (similar to a Mongoose schema)

---

### **Concepts Explained: Gateway vs Orchestrator**

* **Routing (Predicates):** In Node/Express, you write something like `app.use('/api', proxy...)`. In Spring Gateway, we use *Predicates*. For example, if a request starts with `/api/employees/`, the gateway automatically forwards it to port 8081.

* **Filters:** In the gateway, you can modify requests (e.g., adding authentication headers) without touching the backend service.

* **Non-Blocking:** Spring Cloud Gateway uses the "Netty" server (similar to Node.js), making it asynchronous and non-blocking, which is ideal for handling high traffic.

---

* `@Entity` indicates that the class represents a database table, and `@Id` defines the primary key. Lombok annotations (`@Getter`, `@Setter`) keep your code clean by removing the need to manually write getters and setters.

* In Spring Data JPA, you don’t need to write queries like `SELECT * FROM...`. By simply extending `JpaRepository`, you get all standard database operations automatically.
