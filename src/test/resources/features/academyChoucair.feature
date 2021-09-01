# AUTOR: JFGarcia

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for automation course
      Given than dwayne  wants to learn automation a the Academy Choucair
      | strUser    |  strPassword   |
      | 15442460   | Choucair2021*  |
      When he search for the course  on the choucair Academy plataform
      | strCourse                   |
      | Metodología Bancolombia     |
      Then he finds the course calles resources
      | strCourse                   |
      | Metodología Bancolombia     |