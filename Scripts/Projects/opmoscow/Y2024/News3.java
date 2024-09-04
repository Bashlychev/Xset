package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class News3 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News3 = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC22_0 = new HashMap<>();
    headersUC22_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC22_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC22_0.put("sec-ch-ua-mobile", "?0");
    headersUC22_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC22_14 = new HashMap<>();
    headersUC22_14.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC22_14.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC22_14.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC22_14.put("priority", "u=0, i");
    headersUC22_14.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC22_14.put("sec-ch-ua-mobile", "?0");
    headersUC22_14.put("sec-ch-ua-platform", "Linux");
    headersUC22_14.put("sec-fetch-dest", "document");
    headersUC22_14.put("sec-fetch-mode", "navigate");
    headersUC22_14.put("sec-fetch-site", "same-origin");
    headersUC22_14.put("sec-fetch-user", "?1");
    headersUC22_14.put("upgrade-insecure-requests", "1");
    headersUC22_14.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC22_27 = new HashMap<>();
    headersUC22_27.put("Upgrade-Insecure-Requests", "1");
    headersUC22_27.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC22_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC22_27.put("sec-ch-ua-mobile", "?0");
    headersUC22_27.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru/metrika";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC22 = scenario("Projects.asafov.News3")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC22_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC22_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC22_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC22_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC22_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC22_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC22_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC22_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC22_0),
            http("request_9")
              .get(uri1 + "/tag.js")
              .headers(headersUC22_0),
            http("request_10")
              .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_11")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_12")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_13")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_14")
              .get("/news/view/v-stolice-startovalo-testovoe-golosovanie")
              .headers(headersUC22_14),
            http("request_15")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC22_0),
            http("request_16")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC22_0),
            http("request_17")
              .get("/build/7255.871eb160.js")
              .headers(headersUC22_0),
            http("request_18")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC22_0),
            http("request_19")
              .get("/build/7729.67d87565.js")
              .headers(headersUC22_0),
            http("request_20")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC22_0),
            http("request_21")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC22_0),
            http("request_22")
              .get("/build/9154.f1370752.js")
              .headers(headersUC22_0),
            http("request_23")
              .get("/build/1676.2634f191.js")
              .headers(headersUC22_0),
            http("request_24")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC22_0),
            http("request_25")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC22_0),
            http("request_26")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC22_0),
            http("request_27")
              .get(uri1 + "/metrika_match.html")
              .headers(headersUC22_27)
          )
      );

	  setUp(scnUC22.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News3);
  }
}
