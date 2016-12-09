package io.appium.java_client.pagefactory_tests.widgets.html;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory_tests.widgets.Movie;
import io.appium.java_client.pagefactory_tests.widgets.WidgetTest;
import org.apache.commons.lang3.StringUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HtmlWidgetTest implements WidgetTest {

    private static ChromeDriver driver;
    private static RottenTomatoesSite rottenTomatoesSite;

    /**
     * initialization.
     */
    @BeforeClass public static void beforeClass() throws Exception {

        if (Platform.getCurrent().is(Platform.WINDOWS)) {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
                "src/test/java/io/appium/java_client/pagefactory_tests/chromedriver.exe");
        } else {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
                "src/test/java/io/appium/java_client/pagefactory_tests/chromedriver");
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        rottenTomatoesSite = new RottenTomatoesSite();
        PageFactory.initElements(
            new AppiumFieldDecorator(driver, new TimeOutDuration(5, TimeUnit.SECONDS)),
            rottenTomatoesSite);
    }

    /**
     * finishing.
     */
    @AfterClass public static void afterClass() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * The setting up.
     */
    @Before public void setUp() throws Exception {
        if (driver != null) {
            driver.get("file:///" + new File(
                "src/test/java/io/appium/java_client/RottenTomatoesSnapshot.html")
                .getAbsolutePath());
        }
    }

    @Test
    @Override public void checkACommonWidget() {
        assertTrue(rottenTomatoesSite.getSimpleMovieCount() == 30);
        Movie movie = rottenTomatoesSite.getASimpleMovie(0);
        assertTrue(!StringUtils.isBlank(movie.title()));
        assertTrue(!StringUtils.isBlank(movie.score()));
        assertNotNull(movie.getPoster());
        movie.goToReview();

        rottenTomatoesSite.checkSimpleReview();
    }

    @Override
    @Test public void checkAnAnnotatedWidget() {
        assertTrue(rottenTomatoesSite.getAnnotatedMovieCount() == 30);
        Movie movie = rottenTomatoesSite.getAnAnnotatedMovie(0);
        assertTrue(!StringUtils.isBlank(movie.title()));
        assertTrue(!StringUtils.isBlank(movie.score()));
        assertNotNull(movie.getPoster());
        movie.goToReview();

        rottenTomatoesSite.checkAnnotatedReview();
    }


    @Override
    @Test public void checkAnExtendedWidget() {
        assertTrue(rottenTomatoesSite.getExtendeddMovieCount() == 30);
        Movie movie = rottenTomatoesSite.getAnExtendedMovie(0);
        assertTrue(!StringUtils.isBlank(movie.title()));
        assertTrue(!StringUtils.isBlank(movie.score()));
        assertNotNull(movie.getPoster());
        movie.goToReview();

        rottenTomatoesSite.checkExtendedReview();
    }

    @Override
    @Test public void checkTheLocatorOverridingOnAWidget() {
        try {
            assertTrue(rottenTomatoesSite.getFakedMovieCount() == 0);
        } catch (Exception e) {
            if (!NoSuchElementException.class.isAssignableFrom(e.getClass())) {
                throw e;
            }
        }

        rottenTomatoesSite.getASimpleMovie(0).goToReview();

        try {
            rottenTomatoesSite.checkFakeReview();
        } catch (Exception e) {
            if (NoSuchElementException.class.isAssignableFrom(e.getClass())) {
                return;
            } else {
                throw e;
            }
        }
        throw new RuntimeException("Any exception was expected");
    }
}
