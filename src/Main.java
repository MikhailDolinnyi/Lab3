import Classes.*;
import Enums.Conjunctions;
import Enums.FencePosition;
import Enums.Pronoun;

public class Main {
    public static void main(String[] args) {
        ThisTime time = new ThisTime();
        Moan moan= new Moan("Стон");
        Znaika znaika=new Znaika("Знайка");
        UnknownP unknownP = new UnknownP("Кто-то");
        Heaviness heavy = new Heaviness("Тяжесть");
        Plank plank = new Plank("Доска");
        Fence fence = new Fence("Забор");
        Hole hole = new Hole ("Пролом");
        Vintik vintik = new Vintik("Винтик");
        Ground ground = new Ground("Земля");
        House house = new House("Дом");


        System.out.println(time.time() + FencePosition.BEHIND + moan.heard(moan.getName()) + "\n"

                + znaika.listen() + ','+ Pronoun.HIM + znaika.seemed() + Conjunctions.WHAT+ unknownP.callHelp()+ "\n"+

                znaika.runTo(fence.getName()) + Conjunctions.AND + znaika.want() + znaika.climbOn(fence.getName()) +
                 Conjunctions.BUT + znaika.tried(false) + "\n" +

                heavy.activeWith(" со страшной силой", znaika.getName()) + "\n" +

                znaika.heard() + Conjunctions.WHAT + FencePosition.BEHIND +unknownP.callHelp() + znaika.breakOut(plank,fence) +
                Conjunctions.AND + znaika.lookOut(hole.getName()) + "\n"+

                FencePosition.NEAR + znaika.see(vintik.getName()) +Conjunctions.COMMA+ vintik.lieOn(ground.getName()) + "\n"+

                vintik.see(znaika.getName()) + "\n"+

                znaika.grab(vintik.getName(), " под мышки" ) + Conjunctions.COMMA + znaika.throwOn(vintik.getName(), "спину ")+
                Conjunctions.AND + znaika.carryThroughTo(vintik.getName(), hole.getName(), house.getName()) + "\n" +

                znaika.doing("несколько шагов") + Conjunctions.AND + znaika.feel(heavy.decrease()) + Conjunctions.COMMA + znaika.doing("еще шаг")+ Conjunctions.COMMA +
                znaika.cameOff(ground.getName()) + Conjunctions.AND + znaika.soarWith(vintik.getName(), " в воздух"));






    }
}
