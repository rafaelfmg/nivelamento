package main.kotlin.app

import javax.persistence.Persistence

fun main(){

    println("Trato Started")
    val factory = Persistence.createEntityManagerFactory("test")
    val entityManager = factory.createEntityManager()
    entityManager.transaction.begin()
}