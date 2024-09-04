package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class Parties extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://asafov.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headers_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Origin", "https://asafov.ru");
    headers_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headers_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_44 = new HashMap<>();
    headers_44.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_44.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_44.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headers_44.put("priority", "u=0, i");
    headers_44.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_44.put("sec-ch-ua-mobile", "?0");
    headers_44.put("sec-ch-ua-platform", "Linux");
    headers_44.put("sec-fetch-dest", "document");
    headers_44.put("sec-fetch-mode", "navigate");
    headers_44.put("sec-fetch-site", "cross-site");
    headers_44.put("sec-fetch-user", "?1");
    headers_44.put("upgrade-insecure-requests", "1");
    headers_44.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_50 = new HashMap<>();
    headers_50.put("accept", "*/*");
    headers_50.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_50.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headers_50.put("origin", "https://asafov.ru");
    headers_50.put("priority", "u=1, i");
    headers_50.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_50.put("sec-ch-ua-mobile", "?0");
    headers_50.put("sec-ch-ua-platform", "Linux");
    headers_50.put("sec-fetch-dest", "empty");
    headers_50.put("sec-fetch-mode", "cors");
    headers_50.put("sec-fetch-site", "cross-site");
    headers_50.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_51 = new HashMap<>();
    headers_51.put("Upgrade-Insecure-Requests", "1");
    headers_51.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headers_51.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headers_51.put("sec-ch-ua-mobile", "?0");
    headers_51.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scn = scenario("Projects.asafov.Parties")
      .exec(
        http("request_0")
          .get("/build/assets/app-C22gTps0.css")
          .headers(headers_0)
          .resources(
            http("request_1")
              .get("/build/assets/element-BvquaXif.css")
              .headers(headers_0),
            http("request_2")
              .get("/build/assets/app-CIZP6loT.css")
              .headers(headers_0),
            http("request_3")
              .get("/build/assets/app-DfRqwiiA.js")
              .headers(headers_3),
            http("request_4")
              .get("/build/assets/element-zM6ahEp_.js")
              .headers(headers_3),
            http("request_5")
              .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
              .headers(headers_3),
            http("request_6")
              .get("/assets/css/cookies.css")
              .headers(headers_0),
            http("request_7")
              .get("/assets/header/images/btn-burger.svg")
              .headers(headers_0),
            http("request_8")
              .get("/assets/header/images/logos/mobile-logo.svg")
              .headers(headers_0),
            http("request_9")
              .get("/assets/header/images/btn-search-white.svg")
              .headers(headers_0),
            http("request_10")
              .get("/assets/header/images/logos/telegram-sm.svg")
              .headers(headers_0),
            http("request_11")
              .get("/assets/header/images/logos/vk-sm.svg")
              .headers(headers_0),
            http("request_12")
              .get("/assets/header/images/logos/dzen-sm.svg")
              .headers(headers_0),
            http("request_13")
              .get("/assets/header/images/icons/x-mark.svg")
              .headers(headers_0),
            http("request_14")
              .get("/assets/header/images/icons/quote.svg")
              .headers(headers_0),
            http("request_15")
              .get("/assets/header/images/logos/telegram-xs.svg")
              .headers(headers_0),
            http("request_16")
              .get("/assets/header/images/logos/vk-xs.svg")
              .headers(headers_0),
            http("request_17")
              .get("/assets/header/images/logos/dzen-xs.svg")
              .headers(headers_0),
            http("request_18")
              .get("/assets/header/images/logos/logo-asafov.svg")
              .headers(headers_0),
            http("request_19")
              .get("/assets/header/images/logos/certificate.svg")
              .headers(headers_0),
            http("request_20")
              .get("/assets/header/images/btn-search-black.svg")
              .headers(headers_0),
            http("request_21")
              .get("/storage/media/2022/01/01_er-logo.png")
              .headers(headers_0),
            http("request_22")
              .get("/storage/media/2022/01/02_kp-logo.png")
              .headers(headers_0),
            http("request_23")
              .get("/storage/media/2022/01/04_ldpr-logo.png")
              .headers(headers_0),
            http("request_24")
              .get("/storage/media/2022/01/05_nl-logo.png")
              .headers(headers_0),
            http("request_25")
              .get("/storage/media/2022/01/03_sr-logo.png")
              .headers(headers_0),
            http("request_26")
              .get("/storage/media/2022/01/14_gp-logo.png")
              .headers(headers_0),
            http("request_27")
              .get("/storage/media/2022/01/09_kr-logo.png")
              .headers(headers_0),
            http("request_28")
              .get("/storage/media/2022/01/13_rost-logo.png")
              .headers(headers_0),
            http("request_29")
              .get("/storage/media/2022/01/06_pp-logo.png")
              .headers(headers_0),
            http("request_30")
              .get("/storage/media/2022/01/12_ppd-logo.png")
              .headers(headers_0),
            http("request_31")
              .get("/storage/media/2022/01/07_rodina-logo.png")
              .headers(headers_0),
            http("request_32")
              .get("/storage/media/2022/01/15_svoboda.png")
              .headers(headers_0),
            http("request_33")
              .get("/storage/media/2022/01/08_yabloko-logo.png")
              .headers(headers_0),
            http("request_34")
              .get("/storage/media/2022/01/10_za-logo.png")
              .headers(headers_0),
            http("request_35")
              .get("/storage/media/2022/01/11_zelenye-logo.png")
              .headers(headers_0),
            http("request_36")
              .get("/storage/media/2022/02/16_parnas.png")
              .headers(headers_0),
            http("request_37")
              .get("/assets/img/logos/certificate-footer.svg")
              .headers(headers_0),
            http("request_38")
              .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
            http("request_39")
              .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
            http("request_40")
              .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
            http("request_41")
              .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
            http("request_42")
              .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
            http("request_43")
              .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
            http("request_44")
              .get("/parties")
              .headers(headers_44),
            http("request_45")
              .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
            http("request_46")
              .get(uri1 + "/metrika/tag.js")
              .headers(headers_0),
            http("request_47")
              .get("/assets/js/front/cookies.js")
              .headers(headers_3),
            http("request_48")
              .get("/assets/js/front/header.js")
              .headers(headers_3),
            http("request_49")
              .get("/static/favicon.ico")
              .headers(headers_0),
            http("request_50")
              .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fparties&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A168437915%3Az%3A300%3Ai%3A20240827092440%3Aet%3A1724732680%3Ac%3A1%3Arn%3A589798144%3Arqn%3A148%3Au%3A1724676906572442126%3Aw%3A1905x959%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C129%2C90%2C1%2C0%2C%2C37%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724732680105%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732680%3At%3A%D0%98%D0%BD%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%86%D0%B8%D1%8F%20%D0%BE%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D1%8F%D1%85%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
              .headers(headers_50),
            http("request_51")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headers_51)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
