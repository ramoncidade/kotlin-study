package com.cidade.kotlinkafkastudy.entrypoint.http

import com.cidade.kotlinkafkastudy.entrypoint.http.data.GreetingContractResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class HelloController{

    @GetMapping("/{name}")
     fun hello(@PathVariable name: String ) : ResponseEntity<GreetingContractResponse>{
        val greeting =  GreetingContractResponse(name.split("_")[0])
         return ResponseEntity.ok(greeting)
     }

}