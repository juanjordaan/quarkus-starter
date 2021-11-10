package cloud.jordaan.juan.api.interfaces.rest;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.Route.HttpMethod;
import io.quarkus.vertx.web.RoutingExchange;
import io.vertx.ext.web.RoutingContext;


import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class GreetingRoutes {

    @Route(methods = Route.HttpMethod.GET)
    public Uni<String> hello() {
        return Uni.createFrom().item("Hello RESTEasy");
    }
}
