package com.example.demo.properyimport org.springframework.beans.factory.annotation.Autowiredimport org.springframework.boot.ApplicationArgumentsimport org.springframework.boot.ApplicationRunnerimport org.springframework.stereotype.Component@Componentclass CustomPropertiesRunner : ApplicationRunner {    @Autowired    lateinit var customerProperties: CustomProperties    override fun run(args: ApplicationArguments?) {        println("customerProperties.name = ${customerProperties.name}")        println("customerProperties.age = ${customerProperties.age}")    }}