package co.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.banistmo.userinterfaces.GooglePage.YOUTUBE_ICON;

public class PageValidation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(YOUTUBE_ICON).viewedBy(actor).asBoolean();
    }

    public static PageValidation isVisible(){
        return new PageValidation();
    }
}
