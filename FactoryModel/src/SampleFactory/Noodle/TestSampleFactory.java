package SampleFactory.Noodle;

import java.util.ArrayList;
import java.util.List;

public class TestSampleFactory {

    public static void main(String[] args) {

        List<Noodles> noodlesList = new ArrayList<Noodles>();

        noodlesList.add(SampleFactory.getNoodles(1));
        noodlesList.add(SampleFactory.getNoodles(2));
        noodlesList.add(SampleFactory.getNoodles(0));

        for(Noodles noodles:noodlesList){
            noodles.price();
        }


    }

}
