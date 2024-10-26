## Hi I'm Kitto <img src="https://user-images.githubusercontent.com/1303154/88677602-1635ba80-d120-11ea-84d8-d263ba5fc3c0.gif" width="28px" height="28px" alt="hi">

# 💻 Công nghệ và công cụ sử dụng
[![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](#) [![Bootstrap Badge](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)](#) [![Mariadb Badge](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)](#) [![IDEA Badge](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](#) ![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

### Class diagram
![class-diagram](https://github.com/user-attachments/assets/ccf09a05-1b3e-428a-9407-948fbfef1ca6)


### Database diagram
![database-diagram](https://github.com/user-attachments/assets/c5aecbe1-3e14-43a0-bcd1-622d3c0bab26)

### Dashboard
![image](https://github.com/user-attachments/assets/1c6d8965-298e-4a64-953b-97a80a14cee1)

### List Loai Thuoc
![image](https://github.com/user-attachments/assets/fe7526f3-80a2-4b6a-b946-fac2d6cfc7dd)

### List Thuoc
![image](https://github.com/user-attachments/assets/c9356d33-b68b-40f7-98f0-5207e6baafa1)

### Insert Thuoc 
![image](https://github.com/user-attachments/assets/885ad9f4-816c-4c3d-887b-b1eec21d75a5)
![image](https://github.com/user-attachments/assets/80a7693a-a016-4e65-8688-0aaa8a0d7c60)
![image](https://github.com/user-attachments/assets/7377a474-847b-4eb5-a100-34d87a3787b5)

### models
##### LoaiThuoc
```
@Entity
@Table(name = "loaithuoc")
public class LoaiThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maLoai;
    private String tenLoai;

    @OneToMany(mappedBy = "loaiThuoc", cascade = CascadeType.ALL)
    private List<Thuoc> thuocs;
```
#### Thuoc
```
@Entity
@Table(name = "thuoc")
@NamedQueries({
        @NamedQuery(name = "thuoc.getAll", query = "select t from Thuoc t"),
        @NamedQuery(name = "thuoc.getThuocByLoai", query = "select t from Thuoc t inner join t.loaiThuoc lt where lt.maLoai =: maLoai")
})
public class Thuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long maThuoc;
    private String tenThuoc;
    private double gia;
    private LocalDate namSX;
    @ManyToOne
    @JoinColumn(name = "maLoai")
    private LoaiThuoc loaiThuoc;
```
### repositories
#### instance
##### ConnectDB
```
public class ConnectDB {
    private static ConnectDB instance;
    EntityManager em;

    private ConnectDB() {
        em = Persistence.createEntityManagerFactory("default").createEntityManager();
    }

    public static ConnectDB getInstance() {
        if (instance == null) {
            instance = new ConnectDB();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public static void main(String[] args) {
        ConnectDB.getInstance().getEntityManager();
    }
}
```
### data
#### AddData
```
public class AddData {
    public static void main(String[] args) {
        LoaiThuoc l1 = new LoaiThuoc("Thuoc Cam", null);
        Thuoc t1 = new Thuoc("Panadol",5000, LocalDate.of(2024, 1, 1), l1);
        Thuoc t2 = new Thuoc("Aspirin",3000,LocalDate.of(2023, 2, 1), l1);
        Thuoc t3 = new Thuoc("Ibuprofen",8000,LocalDate.of(2022, 10, 1), l1);

        List<Thuoc> thuocs = List.of(t1, t2, t3);
        l1.setThuocs(thuocs);
        LoaiThuocRepository loaiThuocRepository = new LoaiThuocRepository();
        loaiThuocRepository.insert(l1);
}
```




