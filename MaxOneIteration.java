import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 15/05/17.
 */
public class MaxOneIteration {

    public static void main(String... args){

        new MaxOneIteration().run();
    }

    public void run(){
        List<Statement> statementList = new ArrayList();

        statementList.add(new Statement("last2", null));
        statementList.add(new Statement("first", new Numero(1)));
        statementList.add(new Statement("second", new Numero(2)));
        statementList.add(new Statement("third", new Numero(3)));
        statementList.add(new Statement("last", null));
        statementList.add(new Statement("fifth", new Numero(5)));
        statementList.add(new Statement("sixth", new Numero(6)));
        statementList.add(new Statement("last1", null));

        Numero max = new Numero(1);

        for(Statement statement : statementList){
            if(statement.order == null){
                statement.order = max;
            }else if(statement.order.order >= max.order){
                max.order = statement.order.order + 1;
            }
        }

    }

    class Statement{

        Statement(String name, Numero order){
            this.name = name;
            this.order = order;
        }
        String name;
        Numero order;
    }

    class Numero{

        Numero(Integer value){
            this.order = value;
        }
        Integer order;
    }
}
