import java.util.ArrayList;
import java.util.List;

public class Executer {


    public static void main(String[] args) {
        double totalSquare = 0;
        double averageSquare = 0;
        int amountOfTrapMoreThenAverage = 0;
        List<Trapecia> trapecii = new ArrayList<Trapecia>();
        trapecii.add(new Trapecia(new Point(0,0), new Point(1,5), new Point(2,1), new Point(3,0)));
        trapecii.add(new Trapecia(new Point(0,0), new Point(2,2), new Point(4,2), new Point(6,0)));

        trapecii.get(0).isIsoscelesTrapezoid();
        trapecii.get(1).isIsoscelesTrapezoid();
        System.out.println("Square is "+trapecii.get(0).calculateArea());
        System.out.println("Square is "+trapecii.get(1).calculateArea());
        System.out.println("Per is "+trapecii.get(0).calculatePerimeter());
        System.out.println("Per is "+trapecii.get(1).calculatePerimeter());

        for (Trapecia t : trapecii){
            totalSquare+=t.calculateArea();
        }
        for (Trapecia t : trapecii){

            if(t.calculateArea()>(totalSquare/trapecii.size())){
                amountOfTrapMoreThenAverage++;
            }
        }
        System.out.println(amountOfTrapMoreThenAverage);

    }

}
