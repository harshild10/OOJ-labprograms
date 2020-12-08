class NewThread  {
String name; // name of thread
long time1;
Thread t;
NewThread(String threadname,long time) {
name = threadname;
time1=time;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
}
// This is the entry point for thread.
public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println(name);
Thread.sleep(time1);
}
} catch (InterruptedException e) {
System.out.println(name + "Interrupted");
}
System.out.println(name + " exiting.");
}
}

class MultiThreadDemo {
public static void main(String args[]) {
 // start threads
new NewThread("BMS COLLEGE OF ENGINEERING",1000);
new NewThread("CSE",200);
try {
// wait for other threads to end
Thread.sleep(10000);
System.out.println("Main Thread is awake\n");
} catch (InterruptedException e) {
System.out.println("Main thread Interrupted");
}
System.out.println("Main thread exiting.");
}
}



















































