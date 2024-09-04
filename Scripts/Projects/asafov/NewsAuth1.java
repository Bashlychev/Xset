package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class NewsAuth1 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://asafov.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersAS06_0 = new HashMap<>();
    headersAS06_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS06_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS06_0.put("sec-ch-ua-mobile", "?0");
    headersAS06_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS06_3 = new HashMap<>();
    headersAS06_3.put("Origin", "https://asafov.ru");
    headersAS06_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS06_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS06_3.put("sec-ch-ua-mobile", "?0");
    headersAS06_3.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS06_23 = new HashMap<>();
    headersAS06_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersAS06_23.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS06_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS06_23.put("priority", "u=0, i");
    headersAS06_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS06_23.put("sec-ch-ua-mobile", "?0");
    headersAS06_23.put("sec-ch-ua-platform", "Linux");
    headersAS06_23.put("sec-fetch-dest", "document");
    headersAS06_23.put("sec-fetch-mode", "navigate");
    headersAS06_23.put("sec-fetch-site", "same-origin");
    headersAS06_23.put("sec-fetch-user", "?1");
    headersAS06_23.put("upgrade-insecure-requests", "1");
    headersAS06_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS06_35 = new HashMap<>();
    headersAS06_35.put("accept", "*/*");
    headersAS06_35.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS06_35.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS06_35.put("origin", "https://asafov.ru");
    headersAS06_35.put("priority", "u=1, i");
    headersAS06_35.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS06_35.put("sec-ch-ua-mobile", "?0");
    headersAS06_35.put("sec-ch-ua-platform", "Linux");
    headersAS06_35.put("sec-fetch-dest", "empty");
    headersAS06_35.put("sec-fetch-mode", "cors");
    headersAS06_35.put("sec-fetch-site", "cross-site");
    headersAS06_35.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS06_36 = new HashMap<>();
    headersAS06_36.put("Upgrade-Insecure-Requests", "1");
    headersAS06_36.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS06_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS06_36.put("sec-ch-ua-mobile", "?0");
    headersAS06_36.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnAS06 = scenario("Projects.asafov.NewsAuth1")
      .exec(
        http("request_0")
          .get("/build/assets/app-C22gTps0.css")
          .headers(headersAS06_0)
          .resources(
            http("request_1")
              .get("/build/assets/element-BvquaXif.css")
              .headers(headersAS06_0),
            http("request_2")
              .get("/build/assets/app-CIZP6loT.css")
              .headers(headersAS06_0),
            http("request_3")
              .get("/build/assets/app-DfRqwiiA.js")
              .headers(headersAS06_3),
            http("request_4")
              .get("/build/assets/element-zM6ahEp_.js")
              .headers(headersAS06_3),
            http("request_5")
              .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
              .headers(headersAS06_3),
            http("request_6")
              .get("/assets/css/cookies.css")
              .headers(headersAS06_0),
            http("request_7")
              .get("/assets/header/images/btn-burger.svg")
              .headers(headersAS06_0),
            http("request_8")
              .get("/assets/header/images/logos/mobile-logo.svg")
              .headers(headersAS06_0),
            http("request_9")
              .get("/assets/header/images/btn-search-white.svg")
              .headers(headersAS06_0),
            http("request_10")
              .get("/assets/header/images/logos/telegram-sm.svg")
              .headers(headersAS06_0),
            http("request_11")
              .get("/assets/header/images/logos/vk-sm.svg")
              .headers(headersAS06_0),
            http("request_12")
              .get("/assets/header/images/logos/dzen-sm.svg")
              .headers(headersAS06_0),
            http("request_13")
              .get("/assets/header/images/icons/x-mark.svg")
              .headers(headersAS06_0),
            http("request_14")
              .get("/assets/header/images/icons/quote.svg")
              .headers(headersAS06_0),
            http("request_15")
              .get("/assets/header/images/logos/telegram-xs.svg")
              .headers(headersAS06_0),
            http("request_16")
              .get("/assets/header/images/logos/vk-xs.svg")
              .headers(headersAS06_0),
            http("request_17")
              .get("/assets/header/images/logos/dzen-xs.svg")
              .headers(headersAS06_0),
            http("request_18")
              .get("/assets/header/images/logos/logo-asafov.svg")
              .headers(headersAS06_0),
            http("request_19")
              .get("/assets/header/images/logos/certificate.svg")
              .headers(headersAS06_0),
            http("request_20")
              .get("/assets/header/images/btn-search-black.svg")
              .headers(headersAS06_0),
            http("request_21")
              .get("/static/banners/zen-button.png")
              .headers(headersAS06_0),
            http("request_22")
              .get("/assets/img/logos/certificate-footer.svg")
              .headers(headersAS06_0),
            http("request_23")
              .get("/avtor/arest-pavla-durova-v-aeroportu-le-burzhe-obzor-zapadnoj-pressy")
              .headers(headersAS06_23),
            http("request_24")
              .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
            http("request_25")
              .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
            http("request_26")
              .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
            http("request_27")
              .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
            http("request_28")
              .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
            http("request_29")
              .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
            http("request_30")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersAS06_0),
            http("request_31")
              .get("/assets/js/front/cookies.js")
              .headers(headersAS06_3),
            http("request_32")
              .get("/assets/js/front/header.js")
              .headers(headersAS06_3),
            http("request_33")
              .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
            http("request_34")
              .get("/static/favicon.ico")
              .headers(headersAS06_0),
            http("request_35")
              .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Favtor%2Farest-pavla-durova-v-aeroportu-le-burzhe-obzor-zapadnoj-pressy&page-ref=https%3A%2F%2Fasafov.ru%2Favtor&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A1049810004%3Az%3A300%3Ai%3A20240826203304%3Aet%3A1724686385%3Ac%3A1%3Arn%3A1020311825%3Arqn%3A65%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C126%2C62%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686384210%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686385%3At%3A%D0%90%D1%80%D0%B5%D1%81%D1%82%20%D0%9F%D0%B0%D0%B2%D0%BB%D0%B0%20%D0%94%D1%83%D1%80%D0%BE%D0%B2%D0%B0%20%D0%B2%20%D0%B0%D1%8D%D1%80%D0%BE%D0%BF%D0%BE%D1%80%D1%82%D1%83%20%D0%9B%D0%B5%20%D0%91%D1%83%D1%80%D0%B6%D0%B5%3A%20%D0%BE%D0%B1%D0%B7%D0%BE%D1%80%20%D0%B7%D0%B0%D0%BF%D0%B0%D0%B4%D0%BD%D0%BE%D0%B9%20%D0%BF%D1%80%D0%B5%D1%81%D1%81%D1%8B%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
              .headers(headersAS06_35),
            http("request_36")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersAS06_36)
          )
      );

	  setUp(scnAS06.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}