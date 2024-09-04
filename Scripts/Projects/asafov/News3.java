package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class News3 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersAS05_0 = new HashMap<>();
    headersAS05_0.put("accept", "*/*");
    headersAS05_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS05_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS05_0.put("content-type", "text/plain");
    headersAS05_0.put("origin", "https://asafov.ru");
    headersAS05_0.put("priority", "u=1, i");
    headersAS05_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS05_0.put("sec-ch-ua-mobile", "?0");
    headersAS05_0.put("sec-ch-ua-platform", "Linux");
    headersAS05_0.put("sec-fetch-dest", "empty");
    headersAS05_0.put("sec-fetch-mode", "cors");
    headersAS05_0.put("sec-fetch-site", "cross-site");
    headersAS05_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS05_1 = new HashMap<>();
    headersAS05_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS05_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS05_1.put("sec-ch-ua-mobile", "?0");
    headersAS05_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS05_4 = new HashMap<>();
    headersAS05_4.put("Origin", "https://asafov.ru");
    headersAS05_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS05_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS05_4.put("sec-ch-ua-mobile", "?0");
    headersAS05_4.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS05_24 = new HashMap<>();
    headersAS05_24.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersAS05_24.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS05_24.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS05_24.put("priority", "u=0, i");
    headersAS05_24.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS05_24.put("sec-ch-ua-mobile", "?0");
    headersAS05_24.put("sec-ch-ua-platform", "Linux");
    headersAS05_24.put("sec-fetch-dest", "document");
    headersAS05_24.put("sec-fetch-mode", "navigate");
    headersAS05_24.put("sec-fetch-site", "same-origin");
    headersAS05_24.put("sec-fetch-user", "?1");
    headersAS05_24.put("upgrade-insecure-requests", "1");
    headersAS05_24.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS05_36 = new HashMap<>();
    headersAS05_36.put("accept", "*/*");
    headersAS05_36.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS05_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS05_36.put("origin", "https://asafov.ru");
    headersAS05_36.put("priority", "u=1, i");
    headersAS05_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS05_36.put("sec-ch-ua-mobile", "?0");
    headersAS05_36.put("sec-ch-ua-platform", "Linux");
    headersAS05_36.put("sec-fetch-dest", "empty");
    headersAS05_36.put("sec-fetch-mode", "cors");
    headersAS05_36.put("sec-fetch-site", "cross-site");
    headersAS05_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS05_37 = new HashMap<>();
    headersAS05_37.put("Upgrade-Insecure-Requests", "1");
    headersAS05_37.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS05_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS05_37.put("sec-ch-ua-mobile", "?0");
    headersAS05_37.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://asafov.ru";

    ScenarioBuilder scnAS05 = scenario("Projects.asafov.News3")
      .exec(
        http("request_0")
          .post("/webvisor/64870417?wv-part=2&wv-type=7&wmode=0&wv-hit=516033656&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Faleksandr-asafov-nablyudaetsya-kaskad-otkazov-so-storony-dazhe-novoj-parlamentskoj-oppoziczii&rn=1058746416&browser-info=we%3A1%3Aet%3A1724685971%3Aw%3A1905x927%3Av%3A1420%3Az%3A300%3Ai%3A20240826202611%3Au%3A1724676906572442126%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724685971&t=gdpr(14)ti(1)")
          .headers(headersAS05_0)
          .body(RawFileBody("news3/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/build/assets/app-C22gTps0.css")
              .headers(headersAS05_1),
            http("request_2")
              .get(uri2 + "/build/assets/element-BvquaXif.css")
              .headers(headersAS05_1),
            http("request_3")
              .get(uri2 + "/build/assets/app-CIZP6loT.css")
              .headers(headersAS05_1),
            http("request_4")
              .get(uri2 + "/build/assets/app-DfRqwiiA.js")
              .headers(headersAS05_4),
            http("request_5")
              .get(uri2 + "/build/assets/element-zM6ahEp_.js")
              .headers(headersAS05_4),
            http("request_6")
              .get(uri2 + "/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
              .headers(headersAS05_4),
            http("request_7")
              .get(uri2 + "/assets/css/cookies.css")
              .headers(headersAS05_1),
            http("request_8")
              .get(uri2 + "/assets/header/images/btn-burger.svg")
              .headers(headersAS05_1),
            http("request_9")
              .get(uri2 + "/assets/header/images/logos/mobile-logo.svg")
              .headers(headersAS05_1),
            http("request_10")
              .get(uri2 + "/assets/header/images/btn-search-white.svg")
              .headers(headersAS05_1),
            http("request_11")
              .get(uri2 + "/assets/header/images/logos/telegram-sm.svg")
              .headers(headersAS05_1),
            http("request_12")
              .get(uri2 + "/assets/header/images/logos/vk-sm.svg")
              .headers(headersAS05_1),
            http("request_13")
              .get(uri2 + "/assets/header/images/logos/dzen-sm.svg")
              .headers(headersAS05_1),
            http("request_14")
              .get(uri2 + "/assets/header/images/icons/x-mark.svg")
              .headers(headersAS05_1),
            http("request_15")
              .get(uri2 + "/assets/header/images/icons/quote.svg")
              .headers(headersAS05_1),
            http("request_16")
              .get(uri2 + "/assets/header/images/logos/telegram-xs.svg")
              .headers(headersAS05_1),
            http("request_17")
              .get(uri2 + "/assets/header/images/logos/vk-xs.svg")
              .headers(headersAS05_1),
            http("request_18")
              .get(uri2 + "/assets/header/images/logos/dzen-xs.svg")
              .headers(headersAS05_1),
            http("request_19")
              .get(uri2 + "/assets/header/images/logos/logo-asafov.svg")
              .headers(headersAS05_1),
            http("request_20")
              .get(uri2 + "/assets/header/images/logos/certificate.svg")
              .headers(headersAS05_1),
            http("request_21")
              .get(uri2 + "/assets/header/images/btn-search-black.svg")
              .headers(headersAS05_1),
            http("request_22")
              .get(uri2 + "/static/banners/zen-button.png")
              .headers(headersAS05_1),
            http("request_23")
              .get(uri2 + "/assets/img/logos/certificate-footer.svg")
              .headers(headersAS05_1),
            http("request_24")
              .get(uri2 + "/news/aleksandr-asafov-nablyudaetsya-kaskad-otkazov-so-storony-dazhe-novoj-parlamentskoj-oppoziczii")
              .headers(headersAS05_24),
            http("request_25")
              .get(uri2 + "/build/assets/bebasneueregular-DlvXiAZl.woff2"),
            http("request_26")
              .get(uri2 + "/build/assets/bebasneuebold-BLfzrUoX.woff2"),
            http("request_27")
              .get(uri2 + "/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
            http("request_28")
              .get(uri2 + "/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
            http("request_29")
              .get(uri2 + "/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
            http("request_30")
              .get(uri2 + "/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
            http("request_31")
              .get("/metrika/tag.js")
              .headers(headersAS05_1),
            http("request_32")
              .get(uri2 + "/assets/js/front/cookies.js")
              .headers(headersAS05_4),
            http("request_33")
              .get(uri2 + "/assets/js/front/header.js")
              .headers(headersAS05_4),
            http("request_34")
              .get(uri2 + "/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
            http("request_35")
              .get(uri2 + "/static/favicon.ico")
              .headers(headersAS05_1),
            http("request_36")
              .get("/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Faleksandr-asafov-nablyudaetsya-kaskad-otkazov-so-storony-dazhe-novoj-parlamentskoj-oppoziczii&page-ref=https%3A%2F%2Fasafov.ru%2Fnews%3Fpage%3D38&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A537646066%3Az%3A300%3Ai%3A20240826202611%3Aet%3A1724685972%3Ac%3A1%3Arn%3A590168616%3Arqn%3A45%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C139%2C58%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724685971178%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724685972%3At%3A%D0%90%D0%BB%D0%B5%D0%BA%D1%81%D0%B0%D0%BD%D0%B4%D1%80%20%D0%90%D1%81%D0%B0%D1%84%D0%BE%D0%B2%3A%20%C2%AB%D0%9D%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20%C2%AB%D0%BA%D0%B0%D1%81%D0%BA%D0%B0%D0%B4%20%D0%BE%D1%82%D0%BA%D0%B0%D0%B7%D0%BE%D0%B2%C2%BB%20%D1%81%D0%BE%20%D1%81%D1%82%D0%BE%D1%80%D0%BE%D0%BD%D1%8B%20%D0%B4%D0%B0%D0%B6%D0%B5%20%D0%BD%D0%BE%D0%B2%D0%BE%D0%B9%20%D0%BF%D0%B0%D1%80%D0%BB%D0%B0%D0%BC%D0%B5%D0%BD%D1%82%D1%81%D0%BA%D0%BE%D0%B9%20%D0%BE%D0%BF%D0%BF%D0%BE%D0%B7%D0%B8%D1%86%D0%B8%D0%B8%C2%BB%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
              .headers(headersAS05_36),
            http("request_37")
              .get("/metrika/metrika_match.html")
              .headers(headersAS05_37)
          )
      );

	  setUp(scnAS05.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
