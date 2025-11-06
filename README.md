# PC Builder

**Tim:**
Kelas: D4 IT D
Anggota:
Ba'abdil Razky Ardinanta (3124600092)
Thariq Kemal Choiruddin (312460119)

## Deskripsi Singkat Arsitektur

Arsitektur ini berpusat pada kelas abstrak `base.Component` yang memungkinkan semua komponen (seperti `CPU`, `SSD`, `Mouse`) diperlakukan secara polimorfik. 

Kami menerapkan **Builder Pattern** (`PCBuilder`) untuk memisahkan logika perakitan PC dari `Main.java`, membuat kode `Main` lebih bersih dan fokus. Kami juga telah merefaktor *code smell* **Feature Envy** dengan memindahkan logika laporan (`generateReport`) ke dalam kelas `PC` yang sesuai, mengikuti prinsip *Tell, Don't Ask* dan meningkatkan enkapsulasi.

## Personal Reflection
1. Momen “Aha!” Terbesar
Momen "klik" terbesar saya adalah saat Misi 2 (Feature Envy) pada PCReportGenerator. Awalnya, saya pikir memindahkan method itu hanya soal "merapikan" kode. Tapi saat saya memindahkan generateReport() ke dalam PC.java dan menghapus (PC pc) dari parameternya, saya sadar ini bukan cuma soal rapi. Ini soal kepemilikan data. Method itu "cemburu" karena ia bekerja pada data yang bukan miliknya. Dengan memindahkannya, kita memberikan logika itu kepada kelas yang memiliki datanya (PC), yang secara instan memperbaiki enkapsulasi dan mengurangi coupling antar kelas.

2. Kelemahan Terbesar Saya/Tim
kami tidak mendapat kritik dari tim auditor

3. Skill Baru Paling Berharga
Skill mengidentifikasi dan merefaktor "code smell" (seperti Feature Envy). Di dunia kerja, kita akan lebih sering membaca dan memperbaiki kode orang lain daripada menulis dari nol. Mampu melihat kode yang "cemburu" (seperti PCReportGenerator) atau kelas yang "terlalu gemuk" (seperti Main kami sebelum ada PCBuilder) dan tahu cara memperbaikinya (dengan 'Move Method' atau 'Extract Class') adalah skill yang sangat berharga untuk mencegah technical debt dan menjaga codebase tetap sehat.