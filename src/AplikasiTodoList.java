public class AplikasiTodoList {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testAddToDoList();
    }

    public static void showToDoList() {
        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            int No = i + 1;

            if (todo != null) {
                System.out.println(No + ". " + todo);
            }
        }
    }

    public static void testShowToDoList() {
        model[0] = "Belajar";

        showToDoList();
    }


    public static void addToDoList(String todo) {
        boolean isFull = true;
        for(int i = 1; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            String[] temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddToDoList(){
        addToDoList("Belajar");
        addToDoList("Makan");
        addToDoList("Bekerja");
        showToDoList();
    }

    public static boolean deleteToDoList(Integer number) {
        if ((number - 1 ) >= model.length) {
            return false;
        } else if  (model[number - 1] == null){
          return false;
        } else {
           for (int i = (number - 1); i < model.length; i++){
               if ( i == (model.length - 1)) {
                   model[i] = null;
               } else {
                   model[i] = model [i + 1];
               }
           }
           return true;
        }
    }

    public  static void testRemoveToDoList() {
        addToDoList("Belajar");
        addToDoList("Bekerja");
        addToDoList("Makan");

        deleteToDoList(2);
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        String nama = input("Nama");
        System.out.println("Hi " + nama);
    }

    public static void viewToDoList() {
        while (true){
            System.out.println("To Do List");
            showToDoList();
            System.out.println("Menu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            String input = input("Pilih: ");

            if (input.equals("1")) {
                viewAddToDoList();
            } else if (input.equals("2")) {
                viewDeleteToDoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilih input yang valid");
            }
        }

    }

    public static void testViewToDoList() {
        addToDoList("Belajar");
        addToDoList("Bekerja");
        addToDoList("Makan");

        viewToDoList();
    }

    public static void viewAddToDoList() {
        System.out.println("Tambah To Do List");

        String todo = input("Todo (x) Jika Batal");

        if (todo.equals("x")){

        } else{
            addToDoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addToDoList("Belajar");
        addToDoList("Bekerja");
        addToDoList("Makan");

        viewAddToDoList();
        showToDoList();
    }

    public static void viewDeleteToDoList() {
        System.out.println("Menghapus Todo List");
        String number = input("Input Nomor Todo yang Ingin Dihapus (x) Jika Batal");

        if (number.equals("x")){

        } else{
            boolean success = deleteToDoList(Integer.valueOf(number));
            if(!success) {
                System.out.println("Gagal Hapus To Do List");
            }
        }
    }

    public static void testViewDeleteToDoList(){
        addToDoList("Belajar");
        addToDoList("Bekerja");
        addToDoList("Makan");
        showToDoList();
        viewDeleteToDoList();
        showToDoList();
    }
}
