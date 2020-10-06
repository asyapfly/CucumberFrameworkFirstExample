package org.example.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.example.CoffeeMachine;
import org.junit.Assert;

public class MySteps {
    private final CoffeeMachine coffeeMachine = new CoffeeMachine();

    @Дано("^Польщователь добавляет в кофемашину (\\d+) грамм зёрен$")
    public void польщовательДобавляетВКофемашинуГраммЗёрен(int coffee) {
        coffeeMachine.addCoffeeSeeds(coffee);
        System.out.println("Пользователь добавил" + coffee + " грамм кофе");
    }

    @И("^пользователь добавляет в кофемашину (\\d+) миллилитров воды$")
    public void пользовательДобавляетВКофемашинуМиллилитровВоды(int water) {
        coffeeMachine.addWater(water);
        System.out.println("Пользователь добавил" + water + " ml воды");
    }

    @Когда("^Пользователь делает кружку с кофе$")
    public void пользовательДелаетКружкуСКофе() {
        coffeeMachine.doOneCupOfCoffee();
        System.out.println("Пользователь делает кружку кофе");
    }

    @Тогда("^в кофемашине осталось (\\d+) грамм зерен$")
    public void вКофемашинеОсталосьГраммЗерен(int coffee) {
        Assert.assertEquals(coffee, coffeeMachine.getCoffeeSeeds());

    }

    @И("^в кофмашине осталось (\\d+) миллилитров воды$")
    public void вКофмашинеОсталосьМиллилитровВоды(int water) {
        Assert.assertEquals(water, coffeeMachine.getWater());
    }
}
