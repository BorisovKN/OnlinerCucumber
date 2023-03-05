package onliner.tests;

/*1. Перейти на автобарахолка
* 2. отфильтровать авто по цене до 100000$
* 3. отфильтровать авто по типу кузова седан
* 4. отфильтровать авто по типу коробки передач автоматическая
* 5. проверить работу фильтра
 */

import framework.BaseTest;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/onliner/features/filtration.feature",
        glue = "onliner/steps",
        plugin = {"pretty","html:target/cucumber.html",
                "json:target/cucumber.json","json:target/cucumber-reports/CucumberTestReport.json"}
)
public class FiltrationAuto extends BaseTest {
}
