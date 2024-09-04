package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class Strategy extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://asafov.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> AS13headers_0 = new HashMap<>();
    AS13headers_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    AS13headers_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    AS13headers_0.put("sec-ch-ua-mobile", "?0");
    AS13headers_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS13_4 = new HashMap<>();
    headersAS13_4.put("Origin", "https://asafov.ru");
    headersAS13_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS13_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS13_4.put("sec-ch-ua-mobile", "?0");
    headersAS13_4.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS13_22 = new HashMap<>();
    headersAS13_22.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersAS13_22.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS13_22.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS13_22.put("priority", "u=0, i");
    headersAS13_22.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS13_22.put("sec-ch-ua-mobile", "?0");
    headersAS13_22.put("sec-ch-ua-platform", "Linux");
    headersAS13_22.put("sec-fetch-dest", "document");
    headersAS13_22.put("sec-fetch-mode", "navigate");
    headersAS13_22.put("sec-fetch-site", "same-origin");
    headersAS13_22.put("sec-fetch-user", "?1");
    headersAS13_22.put("upgrade-insecure-requests", "1");
    headersAS13_22.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS13_44 = new HashMap<>();
    headersAS13_44.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersAS13_44.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS13_44.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS13_44.put("priority", "i");
    headersAS13_44.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS13_44.put("sec-ch-ua-mobile", "?0");
    headersAS13_44.put("sec-ch-ua-platform", "Linux");
    headersAS13_44.put("sec-fetch-dest", "image");
    headersAS13_44.put("sec-fetch-mode", "no-cors");
    headersAS13_44.put("sec-fetch-site", "same-origin");
    headersAS13_44.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS13_49 = new HashMap<>();
    headersAS13_49.put("accept", "*/*");
    headersAS13_49.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS13_49.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS13_49.put("origin", "https://asafov.ru");
    headersAS13_49.put("priority", "u=1, i");
    headersAS13_49.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS13_49.put("sec-ch-ua-mobile", "?0");
    headersAS13_49.put("sec-ch-ua-platform", "Linux");
    headersAS13_49.put("sec-fetch-dest", "empty");
    headersAS13_49.put("sec-fetch-mode", "cors");
    headersAS13_49.put("sec-fetch-site", "cross-site");
    headersAS13_49.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS13_50 = new HashMap<>();
    headersAS13_50.put("Upgrade-Insecure-Requests", "1");
    headersAS13_50.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS13_50.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS13_50.put("sec-ch-ua-mobile", "?0");
    headersAS13_50.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnAS13 = scenario("Projects.asafov.Strategy")
      .exec(
        http("request_0")
          .get("/assets/css/plugins.css")
          .headers(AS13headers_0)
          .resources(
            http("request_1")
              .get("/build/assets/app-C22gTps0.css")
              .headers(AS13headers_0),
            http("request_2")
              .get("/build/assets/element-BvquaXif.css")
              .headers(AS13headers_0),
            http("request_3")
              .get("/build/assets/app-CIZP6loT.css")
              .headers(AS13headers_0),
            http("request_4")
              .get("/build/assets/app-DfRqwiiA.js")
              .headers(headersAS13_4),
            http("request_5")
              .get("/build/assets/element-zM6ahEp_.js")
              .headers(headersAS13_4),
            http("request_6")
              .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
              .headers(headersAS13_4),
            http("request_7")
              .get("/assets/css/cookies.css")
              .headers(AS13headers_0),
            http("request_8")
              .get("/assets/header/images/btn-burger.svg")
              .headers(AS13headers_0),
            http("request_9")
              .get("/assets/header/images/logos/mobile-logo.svg")
              .headers(AS13headers_0),
            http("request_10")
              .get("/assets/header/images/btn-search-white.svg")
              .headers(AS13headers_0),
            http("request_11")
              .get("/assets/header/images/logos/telegram-sm.svg")
              .headers(AS13headers_0),
            http("request_12")
              .get("/assets/header/images/logos/vk-sm.svg")
              .headers(AS13headers_0),
            http("request_13")
              .get("/assets/header/images/logos/dzen-sm.svg")
              .headers(AS13headers_0),
            http("request_14")
              .get("/assets/header/images/icons/x-mark.svg")
              .headers(AS13headers_0),
            http("request_15")
              .get("/assets/header/images/icons/quote.svg")
              .headers(AS13headers_0),
            http("request_16")
              .get("/assets/header/images/logos/telegram-xs.svg")
              .headers(AS13headers_0),
            http("request_17")
              .get("/assets/header/images/logos/vk-xs.svg")
              .headers(AS13headers_0),
            http("request_18")
              .get("/assets/header/images/logos/dzen-xs.svg")
              .headers(AS13headers_0),
            http("request_19")
              .get("/assets/header/images/logos/logo-asafov.svg")
              .headers(AS13headers_0),
            http("request_20")
              .get("/assets/header/images/logos/certificate.svg")
              .headers(AS13headers_0),
            http("request_21")
              .get("/assets/header/images/btn-search-black.svg")
              .headers(AS13headers_0),
            http("request_22")
              .get("/spec/strategy")
              .headers(headersAS13_22),
            http("request_23")
              .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
            http("request_24")
              .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
            http("request_25")
              .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
            http("request_26")
              .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
            http("request_27")
              .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
            http("request_28")
              .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
            http("request_29")
              .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
            http("request_30")
              .get("/assets/img/logos/certificate-footer.svg")
              .headers(AS13headers_0),
            http("request_31")
              .get("/assets/js/front/glightbox.min.js")
              .headers(headersAS13_4),
            http("request_32")
              .get("/assets/img/spec/strategy/kartochki_naczbez_11.jpg")
              .headers(AS13headers_0),
            http("request_33")
              .get("/assets/img/spec/strategy/kartochki_naczbez_12.jpg")
              .headers(AS13headers_0),
            http("request_34")
              .get("/assets/img/spec/strategy/kartochki_naczbez_21.jpg")
              .headers(AS13headers_0),
            http("request_35")
              .get("/assets/img/spec/strategy/kartochki_naczbez_24.jpg")
              .headers(AS13headers_0),
            http("request_36")
              .get("/assets/img/spec/strategy/kartochki_naczbez_23.jpg")
              .headers(AS13headers_0),
            http("request_37")
              .get("/assets/img/spec/strategy/kartochki_naczbez_28.jpg")
              .headers(AS13headers_0),
            http("request_38")
              .get("/assets/img/spec/strategy/kartochki_naczbez_26.jpg")
              .headers(AS13headers_0),
            http("request_39")
              .get("/assets/img/spec/strategy/kartochki_naczbez_30.jpg")
              .headers(AS13headers_0),
            http("request_40")
              .get("/assets/img/spec/strategy/kartochki_naczbez_29.jpg")
              .headers(AS13headers_0),
            http("request_41")
              .get("/assets/img/spec/strategy/kartochki_naczbez_31.jpg")
              .headers(AS13headers_0),
            http("request_42")
              .get("/assets/img/spec/strategy/kartochki_naczbez_45.jpg")
              .headers(AS13headers_0),
            http("request_43")
              .get("/assets/img/spec/strategy/kartochki_naczbez_46.jpg")
              .headers(AS13headers_0),
            http("request_44")
              .get("/assets/img/spec/strategy/kartochki_naczbez_1.jpg")
              .headers(headersAS13_44),
            http("request_45")
              .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
            http("request_46")
              .get(uri1 + "/metrika/tag.js")
              .headers(AS13headers_0),
            http("request_47")
              .get("/assets/js/front/cookies.js")
              .headers(headersAS13_4),
            http("request_48")
              .get("/assets/js/front/header.js")
              .headers(headersAS13_4),
            http("request_49")
              .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Fstrategy&page-ref=https%3A%2F%2Fasafov.ru%2Fspec%2Fbaza&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A877085664%3Az%3A300%3Ai%3A20240826204419%3Aet%3A1724687060%3Ac%3A1%3Arn%3A1002873315%3Arqn%3A94%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C134%2C61%2C4%2C0%2C%2C1243%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724687058120%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724687060%3At%3A%D0%A1%D1%82%D1%80%D0%B0%D1%82%D0%B5%D0%B3%D0%B8%D1%8F%20%D0%BD%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D0%B9%20%D0%B1%D0%B5%D0%B7%D0%BE%D0%BF%D0%B0%D1%81%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
              .headers(headersAS13_49),
            http("request_50")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersAS13_50),
            http("request_51")
              .get("/assets/img/spec/strategy/kartochki_naczbez_2.jpg")
              .headers(headersAS13_44),
            http("request_52")
              .get("/assets/img/spec/strategy/kartochki_naczbez_4.jpg")
              .headers(headersAS13_44),
            http("request_53")
              .get("/assets/img/spec/strategy/kartochki_naczbez_14.jpg")
              .headers(headersAS13_44),
            http("request_54")
              .get("/assets/img/spec/strategy/kartochki_naczbez_8.jpg")
              .headers(headersAS13_44),
            http("request_55")
              .get("/assets/img/spec/strategy/kartochki_naczbez_10.jpg")
              .headers(headersAS13_44),
            http("request_56")
              .get("/assets/img/spec/strategy/kartochki_naczbez_9.jpg")
              .headers(headersAS13_44),
            http("request_57")
              .get("/assets/img/spec/strategy/kartochki_naczbez_6.jpg")
              .headers(headersAS13_44),
            http("request_58")
              .get("/assets/img/spec/strategy/kartochki_naczbez_7.jpg")
              .headers(headersAS13_44),
            http("request_59")
              .get("/assets/img/spec/strategy/kartochki_naczbez_3.jpg")
              .headers(headersAS13_44),
            http("request_60")
              .get("/assets/img/spec/strategy/kartochki_naczbez_5.jpg")
              .headers(headersAS13_44),
            http("request_61")
              .get("/assets/img/spec/strategy/kartochki_naczbez_13.jpg")
              .headers(headersAS13_44),
            http("request_62")
              .get("/assets/img/spec/strategy/kartochki_naczbez_18.jpg")
              .headers(headersAS13_44),
            http("request_63")
              .get("/assets/img/spec/strategy/kartochki_naczbez_17.jpg")
              .headers(headersAS13_44),
            http("request_64")
              .get("/assets/img/spec/strategy/kartochki_naczbez_22.jpg")
              .headers(headersAS13_44),
            http("request_65")
              .get("/assets/img/spec/strategy/kartochki_naczbez_15.jpg")
              .headers(headersAS13_44),
            http("request_66")
              .get("/assets/img/spec/strategy/kartochki_naczbez_25.jpg")
              .headers(headersAS13_44),
            http("request_67")
              .get("/assets/img/spec/strategy/kartochki_naczbez_27.jpg")
              .headers(headersAS13_44),
            http("request_68")
              .get("/assets/img/spec/strategy/kartochki_naczbez_20.jpg")
              .headers(headersAS13_44),
            http("request_69")
              .get("/assets/img/spec/strategy/kartochki_naczbez_19.jpg")
              .headers(headersAS13_44),
            http("request_70")
              .get("/assets/img/spec/strategy/kartochki_naczbez_16.jpg")
              .headers(headersAS13_44),
            http("request_71")
              .get("/assets/img/spec/strategy/kartochki_naczbez_32.jpg")
              .headers(headersAS13_44),
            http("request_72")
              .get("/assets/img/spec/strategy/kartochki_naczbez_34.jpg")
              .headers(headersAS13_44),
            http("request_73")
              .get("/assets/img/spec/strategy/kartochki_naczbez_33.jpg")
              .headers(headersAS13_44),
            http("request_74")
              .get("/assets/img/spec/strategy/kartochki_naczbez_36.jpg")
              .headers(headersAS13_44),
            http("request_75")
              .get("/assets/img/spec/strategy/kartochki_naczbez_35.jpg")
              .headers(headersAS13_44),
            http("request_76")
              .get("/assets/img/spec/strategy/kartochki_naczbez_44.jpg")
              .headers(headersAS13_44),
            http("request_77")
              .get("/assets/img/spec/strategy/kartochki_naczbez_38.jpg")
              .headers(headersAS13_44),
            http("request_78")
              .get("/assets/img/spec/strategy/kartochki_naczbez_37.jpg")
              .headers(headersAS13_44),
            http("request_79")
              .get("/assets/img/spec/strategy/kartochki_naczbez_40.jpg")
              .headers(headersAS13_44),
            http("request_80")
              .get("/assets/img/spec/strategy/kartochki_naczbez_39.jpg")
              .headers(headersAS13_44),
            http("request_81")
              .get("/assets/img/spec/strategy/kartochki_naczbez_42.jpg")
              .headers(headersAS13_44),
            http("request_82")
              .get("/assets/img/spec/strategy/kartochki_naczbez_41.jpg")
              .headers(headersAS13_44),
            http("request_83")
              .get("/assets/img/spec/strategy/kartochki_naczbez_43.jpg")
              .headers(headersAS13_44),
            http("request_84")
              .get("/build/assets/chevron-right-black-B6v7mHTl.svg")
              .headers(headersAS13_4)
          )
      );

	  setUp(scnAS13.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
