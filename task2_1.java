// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


public class task2_1 {
    public static void main(String[] args) {
        StringBuilder command = new StringBuilder();
        String[] filter = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        String foundation = "select * from students where ";
        command.append(foundation);
        int flag = 0;
        for(int i = 0; i < filter.length; i ++){
            String[] key = filter[i].split(":");
            if (!key[1].equals("null")){
                command.append(key[0]).append("=").append(key[1]).append(" and ");
                flag ++;    
            }else {
                continue;
            }
        }
        if (flag == 0){
            System.out.println("Внимание!!! Нет параметров для фильтрации.");
            System.exit(0);
        }
        command.delete(command.length() - 5,command.length());
        System.out.println("Строка sql-запроса: ==> ");
        System.out.println(command);
    }
}
