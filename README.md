# Bài tập về nhà

- **Author:** Dương Hoàng Vũ
- **Class:** K57KMT
- **ID student:** K215480106069
 
    
## APP đã chạy và tets trên máy 
** Giao diện sau khi mở app**
![image](https://github.com/user-attachments/assets/ea56d3d1-1322-4ffc-b49c-89114ba3c002)


** Thông tin cá nhân, đoạn mp3, video mp4**

![image](https://github.com/user-attachments/assets/007794bc-c44a-4b20-9087-a428f26e4f30)

** Giao Diện bài toán giải phương trình bậc 2 cơ bản**

![image](https://github.com/user-attachments/assets/889a818f-0d76-4f07-84e2-afd046c00830)

 ![image](https://github.com/user-attachments/assets/9b6e3bf5-5a3c-4f0f-a445-a6e0ec59ce33)

## Nội dung:

-  **Cài đặt Android Studio và Android SDK**
-  **Tạo app sử dụng Java**
-  **Thư mục Assets**
  -  *Index HTML + other(s):* Sử dụng HTML, CSS, JavaScript, kiến thức đã học về web,...
-  **MainActivity:** Java ↔ JavaScript
-  **Tạo một chương trình giải ptb2, sử dụng OOP, HTML, CSS, Java, JavaScript.**

## Nội dung chi tiết:

1. Thông tin cá nhân
2.  File mp3
3.  Up video ngắn mp4
4. Sơ lược quá trình build làm bài

   ## Các chức năng chính
 **Nhập thông tin sinh viên (Họ tên, Lớp, Mã sinh viên)**
 **Xem thông tin sinh viên qua hộp thoại**
  ** Chuyển sang màn hình WebApp  **
 **Chuyển sang màn hình Tính Phương Trình Bậc Hai**
##  Công nghệ sử dụng
 **Ngôn ngữ: Java, IDE: Android Studio**  
 **Thư viện hỗ trợ:AndroidX,  AppCompat, AlertDialog** 
 **Quy trình triển khai** 
 
**1. Tạo dự án mới trong Android Studio** 

**2. Thiết kế giao diện trong XML.** 

**3. Code xử lý các sự kiện trong các Activity.** 

**4. Chạy thử nghiệm trên trình giả lập** 

###  Phương thức sau dùng để nạp giao diện chính từ file XML
` setContentView(R.layout.activity_main);`

** Tạo Giao diện cho phần tính giải phương trình bậc 2
![z6374761258319_79c8ba8538351dc92788b8d1ceef8b95](https://github.com/user-attachments/assets/8ee936c3-2f42-4ecb-8e1b-0cb282c5f71a)




## tính phương trình bậc 2
``` protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solver);

        EditText inputA = findViewById(R.id.inputA);
        EditText inputB = findViewById(R.id.inputB);
        EditText inputC = findViewById(R.id.inputC);
        Button btnSolve = findViewById(R.id.btnSolve);
        TextView resultView = findViewById(R.id.resultView);

        btnSolve.setOnClickListener(v -> {
            try {
                double a = Double.parseDouble(inputA.getText().toString());
                double b = Double.parseDouble(inputB.getText().toString());
                double c = Double.parseDouble(inputC.getText().toString());

               
    }
}



    
