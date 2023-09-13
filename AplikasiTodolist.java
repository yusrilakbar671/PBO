public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    /**
     * Menampilkan todo list
     */

    public static void showTodolist() {

    }

    /**
     * Menambah todo ke list
     */
    public static void addTodolist(String todo){
      // cek apakah model penuh?
      var isFull = true;
      for (int i = 0; i < model.length; i++) {
        if (model[i] == null){
            // model masih ada yang kosong
            isFull = false;
            break;
        }
      }

        // jika penuh, kita resize ukuran array 2x lipat
        if(isFull) {
            var temp : String[] = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data arraynya NULL
        for (var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Menghapus todo dari list
     */

    public static void removeTodolist(){

    }
    /**
     * Menampilkan view todo list
     */
    

    public static void viewShowTodolist(){
        for (var i = 0; i < model.length; i++) {
           var todo = model[i];
           var no = i + 1;

           if (todo != null) {
            System.out.println(no + "." + todo);
           }
        }
    }

    public static void testShowTodolist(){
        model[0] = "Belajar java dasar";
        model[1] = "Studi Kasus java dasar : membuat aplikasi Todolist";
        showTodolist();
    }

    /**
     * Menampilkan view menambahkan todo list
     */

    public static void viewAddTodolist(){

    }

    /**
     * Menampilkan view menghapus todo list
     */

    public static void viewRemoveTodolist(){

    }
}