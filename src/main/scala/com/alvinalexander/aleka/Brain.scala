package com.alvinalexander.aleka

import akka.actor.Actor
import akka.event.Logging
import akka.actor.Props
import akka.actor.ActorRef
import akka.actor.ActorLogging

class Brain extends Actor with ActorLogging {

    // actors we communicate with
    val mouth = context.actorSelection("../mouth")
    
    // handle messages sent to us
    def receive = {

        case Hello =>
            log.info("Brain got a Hello message")
            mouth ! SayHello

        case unknown =>
            log.info("Brain got an unknown message: " + unknown)

    }

}

