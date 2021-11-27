package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class StepDefinitions extends Base{
    @Given("I open a browser")
    public void i_open_a_browser() {

        driver.get(baseURL);

    }
    @Given("I go to the contact us page")
    public void i_go_to_the_contact_us_page() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=contact']")).click();
        //*[@id="contact-link"]/a
        Thread.sleep(3000);
        System.out.println("Here");
    }
    @When("I chose a subject heading")
    public void i_chose_a_subject_heading() throws InterruptedException {
        Select se = new Select(driver.findElement(By.xpath("//*[@id='id_contact']")));
        se.selectByValue("2");
        Thread.sleep(3000);

    }
    @When("I enter my email as {string}")
    public void i_enter_my_email_as(String string) {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abcd@gmail.com");
    }
    @When("I enter my order reference as {string}")
    public void i_enter_my_order_reference_as(String string) {
        driver.findElement(By.xpath("//*[@id='id_order']")).sendKeys("abcd1234");
    }
    @When("I attach the picture for the product")
    public void i_attach_the_picture_for_the_product() throws InterruptedException {
/*
        driver.findElement(By.xpath("//*[@id=\"uniform-fileUpload\"]/span[1]")).sendKeys("/Users/mraian/Pictures/images.jpeg");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"uniform-fileUpload\"]/span[2]")).click();


 */
    }
    @When("I enter my message")
    public void i_enter_my_message() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='message']")).sendKeys("problem with this product");
        Thread.sleep(3000);



    }

    @When("I click on the send button")
    public void i_click_on_the_send_button() {

    }
    @Then("I should see the confirmation text")
    public void i_should_see_the_confirmation_text() {

    }
}
