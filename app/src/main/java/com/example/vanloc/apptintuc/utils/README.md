# Trước hết em xin được giải thích em đến trái đất này để làm gì ạ!

Nhiều thứ xin ra không phải để xài, áp dụng tư tưởng hướng đối tượng.
Những chức năng có thể tách hẳn ra mà không làm rối code. Như xử lý hình ảnh, convert md5, gửi mail, cắt chuỗi, thay thế chuỗi hay buồn buồn gom luôn hàm hết nối database vô luôn cũng được.....
Những chức năng trên không lớn để xây dựng hẳn 1 package. Thì ta hãy để nó vào utils. Và ta thấy những chức năng trên dùng chung được nhiều, đấy, đấy là oop. 

Để khi ta cần sử dụng, gọi nó ra hỗ trợ ta.


Rồi nha cu, chú ý vào những hàm a viết, đa số những hàm trong đây éo liên quan gì và mỗi hàm thực hiện những nhiệm vụ khác nhau.
Code mẫu để làm 1 việc đó cũng có sẵn trên mạng và stackoverflow.


Có vài thứ:

Tại sao khi khai báo biến lại có từ khóa `static` và `final`?
final --> chỉ được gán giá trị 1 lần duy nhất khi tạo biến
static --> gọi hàm hoặc biến không cần khởi tạo đối tượng

static chỉ dùng khi nó được dùng hầu hết trong hàm vì mỗi lần vô 1 method hoặc class nó sẽ khởi tạo tốn bộ nhớ.
Không vấn đề gì nếu static đó chỉ là 1 biến nắm giữ 1 giá trị, nếu nó nắm giữ 1 datatable hoặc listview hoặc array thì ngậm đắng vì sao chương trình của tôi quá chậm.
Anh thường làm biếng nên cứ khai báo static. :v

Lưu ý chỗ này nha bưởi.


Một chút về log, nó tương tự như bên console.log của PHP nghĩa là không hiển thị ra giao diện người dùng
thay vào đó nó hiện trên logcat(php là console trên developer mode của chrome).
Ứng dụng nhiều vô số kể, ví dụ như:
 - Thay vì phải debug từng dòng coi nó chạy tới đó không, show log ra. Nhiều lúc nôn khi sự kiện 1 button đặt log vô, ngon lành.
 - Coi được cả giá trị mình thích truyền vào sao cũng được, và hỗ trợ 
 - 1 số nơi không debug được(anh nghĩ thế vì bên CSharp khi vào thread ko debug được) còn thằng bên này khi kế thừa Servicces có 1 số lúc không debug được thì đặt Log.

1 số lưu ý khi dùng log. Trong 1 số chỗ gọi Log để in ra, không chắc chắn giá trị đó có values hay không thì nên check null trước. 1 số trường hợp bị crash app.

Sao lúc anh dùng Log.e, lúc anh dùng Log.d, a nổi loạn à?

No, no, anh éo phải bệnh.
Mỗi Log.action() có 1 chức năng.

Sắp sếp theo thứ tự ưu tiên nha, cái nào trước thì hay dùng nhất.

 - Log.d: d là **D**ebug. Sử dụng khi muốn debug 1 cái gì đó. Nếu bạn muốn in ra bất cứ cái gì(thường là biến để kiểm tra).
 - Log.e: e trong *E*rror. Debug chỗ đó biết là bị lỗi rồi, nhưng không biết lỗi đó là gì, wtf? Hãy dùng Log.e để bắt, nên để trong try catch.
  try {} catch {Log.e(úm ba la xì bùa)}
 - Log.i: *I*nformation. Sử dụng để gửi thông báo: ồ, tao đã làm *XONG* việc đó rồi, éo có lỗi(Log.e) hay đột biến dữ liệu(Log.d) nên mày éo phải làm những việc đó đâu. 
 - Log.w, Log.v, Log.wtf tự tìm hiểu. Vì a ít xài nên không nghiên cứu.


