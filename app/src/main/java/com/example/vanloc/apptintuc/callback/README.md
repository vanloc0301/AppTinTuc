[Tìm hiểu về callback](https://www.youtube.com/watch?v=fWNaR-rxAic)
:troll :v

Callback? What the callback?

Ý tưởng của callback đó chính là thông báo đồng bộ hoặc không đồng bộ với một class nếu công việc trong một class khác đã được hoàn thành. Ví dụ:

```java
class A implements ICallback {
     MyObject o;
     B b = new B(this, someParameter);

     @Override
     public void callback(MyObject o){
           this.o = o;
     }
}

class B {
     ICallback ic;
     B(ICallback ic, someParameter){
         this.ic = ic;
     }

    new Thread(new Runnable(){
         public void run(){
             // some calculation
             ic.callback(myObject)
         }
    }).start(); 
}

interface ICallback(){
    public void callback(MyObject o);
}
```

Class A gọi Class B để hoàn thành một vài việc trong một Thread. Nếu Thread này hoàn thành xong công viêc, nó sẽ thông báo Class A thông qua callback và cung cấp kết quả. Vì vậy không cần thiết phải polling hoặc làm gì đó. Bạn sẽ nhận được kết quả ngay sau khi nó có.

Trong Android, Callback được sử dụng ví dụ như giữa Activities và Fragments. Do Fragments nên là modular, bạn cần định nghĩa callback trong Fragment để gọi method trong Activity.

Nguyên tắc của Hollywood:
"Đừng gọi cho chúng tôi, chúng tôi sẽ gọi cho bạn"
Nó làm xong nó gọi cho mình.


