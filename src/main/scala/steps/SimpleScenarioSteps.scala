package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.Matchers

class SimpleScenarioSteps extends ScalaDsl with EN with Matchers {

  private var cukeCount = 0
  private var amFull = false

  Given("""^I have '(\d+)' cukes in the jar$""") {
    cukesInJar: Int => cukeCount = cukesInJar
  }

  When("""^I eat '(\d+)' cukes$""") {
    cukesEaten: Int => {
      cukeCount -= cukesEaten
      if (cukesEaten >= 2) amFull = true
    }
  }

  Then("""^There are '(\d+)' cukes in the jar$""") {
    cukesLeft: Int => cukeCount should be (cukesLeft)
  }

  Then("""^I am full$""") {
    () => amFull should be (true)
  }

  Then("""^I am not full$""") {
    () => amFull should be (false)
  }
}
