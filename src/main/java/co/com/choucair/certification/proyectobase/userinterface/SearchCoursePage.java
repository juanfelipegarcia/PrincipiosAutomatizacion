package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona Cursos y Certificaciones")
            .located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    //public static final Target COPY = Target.the( "copy inicial del elemento encontrado" )
      //      .located(By.xpath("//*[@id=\"yui_3_17_2_1_1630472845520_290\"]/div[3]/div/div/a[3]/strong"));
    public static final Target SELECT_COURSE = Target.the("Da click para ir al curso encontrado")
            .located(By.xpath("//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=489']"));
}