package com.sofkau.questions;

import com.sofkau.models.ResponseExchange;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ReturnExchangeResponse implements Question<ResponseExchange> {
    @Override
    public ResponseExchange answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponseExchange.class);
    }

    public static ReturnExchangeResponse returnExchangeResponse(){
        return new ReturnExchangeResponse();
    }
}
