package com.alvinalexander.aleka

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.event.Logging

object Aleka1 extends App {

    // an actor needs an ActorSystem
    val system = ActorSystem("AlekaSystem")

    // create the actors in our play
    val mouth = system.actorOf(Props[Mouth], name = "mouth")
    val brain = system.actorOf(Props[Brain], name = "brain")

    // send the brain two messages
    brain ! Hello
    brain ! "hello"

    Thread.sleep(500)
    
    // shut down the system
    system.terminate

}