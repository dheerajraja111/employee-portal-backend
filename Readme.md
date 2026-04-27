# EmployeeProfileSvcApplication.java
    - Isme ek annotation hota hai: @SpringBootApplication
    - Yeh @SpringBootApplication annotation ek jadoo ki tarah hai. Jab aap is file ko run karte hain, toh Spring Boot automatically embedded Tomcat server start kar deta hai (default port 8080 par), saari configurations load kar leta hai, aur aapki application ko ready kar deta hai. Aapko server setup ka koi code nahi likhna padta.
    - Express mein aap usually routes, controllers, aur models banate the. Yahan standard architecture yeh follow hoti hai:
    - Controllers (@RestController): API endpoints define karte hain (e.g., GET /api/employees/{id}).
    - Services (@Service): Business logic yahan likhi jati hai. Controller request receive karke Service ko pass karta hai.
    - Repositories (@Repository): Database queries yahan hoti hain (Spring Data JPA automatically queries generate kar deta hai).
    - Entities (@Entity): Yeh aapke database table ka Java object representation hai (jaise Mongoose schema).

    - Concepts Explained: Gateway vs Orchestrator
    - Routing (Predicates): Node/Express mein aap app.use('/api', proxy...) likhte the. Spring Gateway mein hum Predicates use karte hain. Jaise upar wale code mein, agar request /api/employees/ se shuru hogi, toh gateway use automatic port 8081 par bhej dega.
    - Filters: Gateway mein aap request ko modify bhi kar sakte hain (jaise Auth headers add karna) bina backend service ko touch kiye.
    - Non-Blocking: Spring Cloud Gateway "Netty" server use karta hai (just like Node.js), isliye ye asynchronous aur non-blocking hota hai, jo high traffic handle karne ke liye best hai.

    - @Entity batata hai ki yeh ek DB table hai, aur @Id primary key define karta hai. Lombok (@Getter, @Setter) aapke code ko clean rakhta hai kyunki aapko manually getters/setters nahi likhne padte.

    - Spring Data JPA mein aapko SELECT * FROM... likhne ki zaroorat nahi hai. Sirf JpaRepository extend karne se hi aapko saare standard DB operations mil jate hain.

