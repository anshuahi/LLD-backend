package accessmodifiers;

import accessmodifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
//      st.name = "Anshu";    // not accessible because name is private member
        st.age = 23;    // age is public
        st.batchId = 3;
        st.psp = 80.1;
    }
}
