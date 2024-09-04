package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class TradCen extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://asafov.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersAS11_0 = new HashMap<>();
    headersAS11_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS11_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS11_0.put("sec-ch-ua-mobile", "?0");
    headersAS11_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS11_4 = new HashMap<>();
    headersAS11_4.put("Origin", "https://asafov.ru");
    headersAS11_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS11_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS11_4.put("sec-ch-ua-mobile", "?0");
    headersAS11_4.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS11_53 = new HashMap<>();
    headersAS11_53.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersAS11_53.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS11_53.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS11_53.put("priority", "u=0, i");
    headersAS11_53.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS11_53.put("sec-ch-ua-mobile", "?0");
    headersAS11_53.put("sec-ch-ua-platform", "Linux");
    headersAS11_53.put("sec-fetch-dest", "document");
    headersAS11_53.put("sec-fetch-mode", "navigate");
    headersAS11_53.put("sec-fetch-site", "same-origin");
    headersAS11_53.put("sec-fetch-user", "?1");
    headersAS11_53.put("upgrade-insecure-requests", "1");
    headersAS11_53.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS11_69 = new HashMap<>();
    headersAS11_69.put("accept", "*/*");
    headersAS11_69.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS11_69.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS11_69.put("origin", "https://asafov.ru");
    headersAS11_69.put("priority", "u=1, i");
    headersAS11_69.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS11_69.put("sec-ch-ua-mobile", "?0");
    headersAS11_69.put("sec-ch-ua-platform", "Linux");
    headersAS11_69.put("sec-fetch-dest", "empty");
    headersAS11_69.put("sec-fetch-mode", "cors");
    headersAS11_69.put("sec-fetch-site", "cross-site");
    headersAS11_69.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS11_70 = new HashMap<>();
    headersAS11_70.put("Upgrade-Insecure-Requests", "1");
    headersAS11_70.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS11_70.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS11_70.put("sec-ch-ua-mobile", "?0");
    headersAS11_70.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnAS11 = scenario("Projects.asafov.TradCen")
      .exec(
        http("request_0")
          .get("/assets/css/plugins.css")
          .headers(headersAS11_0)
          .resources(
            http("request_1")
              .get("/build/assets/app-C22gTps0.css")
              .headers(headersAS11_0),
            http("request_2")
              .get("/build/assets/element-BvquaXif.css")
              .headers(headersAS11_0),
            http("request_3")
              .get("/build/assets/app-CIZP6loT.css")
              .headers(headersAS11_0),
            http("request_4")
              .get("/build/assets/app-DfRqwiiA.js")
              .headers(headersAS11_4),
            http("request_5")
              .get("/build/assets/element-zM6ahEp_.js")
              .headers(headersAS11_4),
            http("request_6")
              .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
              .headers(headersAS11_4),
            http("request_7")
              .get("/assets/css/cookies.css")
              .headers(headersAS11_0),
            http("request_8")
              .get("/assets/header/images/btn-burger.svg")
              .headers(headersAS11_0),
            http("request_9")
              .get("/assets/header/images/logos/mobile-logo.svg")
              .headers(headersAS11_0),
            http("request_10")
              .get("/assets/header/images/btn-search-white.svg")
              .headers(headersAS11_0),
            http("request_11")
              .get("/assets/header/images/logos/telegram-sm.svg")
              .headers(headersAS11_0),
            http("request_12")
              .get("/assets/header/images/logos/vk-sm.svg")
              .headers(headersAS11_0),
            http("request_13")
              .get("/assets/header/images/logos/dzen-sm.svg")
              .headers(headersAS11_0),
            http("request_14")
              .get("/assets/header/images/icons/x-mark.svg")
              .headers(headersAS11_0),
            http("request_15")
              .get("/assets/header/images/icons/quote.svg")
              .headers(headersAS11_0),
            http("request_16")
              .get("/assets/header/images/logos/telegram-xs.svg")
              .headers(headersAS11_0),
            http("request_17")
              .get("/assets/header/images/logos/vk-xs.svg")
              .headers(headersAS11_0),
            http("request_18")
              .get("/assets/header/images/logos/dzen-xs.svg")
              .headers(headersAS11_0),
            http("request_19")
              .get("/assets/header/images/logos/logo-asafov.svg")
              .headers(headersAS11_0),
            http("request_20")
              .get("/assets/header/images/logos/certificate.svg")
              .headers(headersAS11_0),
            http("request_21")
              .get("/assets/header/images/btn-search-black.svg")
              .headers(headersAS11_0),
            http("request_22")
              .get("/assets/img/spec/05.jpg")
              .headers(headersAS11_0),
            http("request_23")
              .get("/assets/img/spec/01strana_01.jpg")
              .headers(headersAS11_0),
            http("request_24")
              .get("/assets/img/spec/02obshhestvo_01.jpg")
              .headers(headersAS11_0),
            http("request_25")
              .get("/assets/img/spec/03chelovek_01.jpg")
              .headers(headersAS11_0),
            http("request_26")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__1.jpg")
              .headers(headersAS11_0),
            http("request_27")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__2.jpg")
              .headers(headersAS11_0),
            http("request_28")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__3.jpg")
              .headers(headersAS11_0),
            http("request_29")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__4.jpg")
              .headers(headersAS11_0),
            http("request_30")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__5.jpg")
              .headers(headersAS11_0),
            http("request_31")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__6.jpg")
              .headers(headersAS11_0),
            http("request_32")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__7.jpg")
              .headers(headersAS11_0),
            http("request_33")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__8.jpg")
              .headers(headersAS11_0),
            http("request_34")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__9.jpg")
              .headers(headersAS11_0),
            http("request_35")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__10.jpg")
              .headers(headersAS11_0),
            http("request_36")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__11.jpg")
              .headers(headersAS11_0),
            http("request_37")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__12.jpg")
              .headers(headersAS11_0),
            http("request_38")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__13.jpg")
              .headers(headersAS11_0),
            http("request_39")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__14.jpg")
              .headers(headersAS11_0),
            http("request_40")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__15.jpg")
              .headers(headersAS11_0),
            http("request_41")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__16.jpg")
              .headers(headersAS11_0),
            http("request_42")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__17.jpg")
              .headers(headersAS11_0),
            http("request_43")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__18.jpg")
              .headers(headersAS11_0),
            http("request_44")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__19.jpg")
              .headers(headersAS11_0),
            http("request_45")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__20.jpg")
              .headers(headersAS11_0),
            http("request_46")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__21.jpg")
              .headers(headersAS11_0),
            http("request_47")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__22.jpg")
              .headers(headersAS11_0),
            http("request_48")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__23.jpg")
              .headers(headersAS11_0),
            http("request_49")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__24.jpg")
              .headers(headersAS11_0),
            http("request_50")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__25.jpg")
              .headers(headersAS11_0),
            http("request_51")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__26.jpg")
              .headers(headersAS11_0),
            http("request_52")
              .get("/assets/img/spec/traditio/kartochka_trdnczennosti__27.jpg")
              .headers(headersAS11_0),
            http("request_53")
              .get("/spec/traditio")
              .headers(headersAS11_53),
            http("request_54")
              .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
            http("request_55")
              .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
            http("request_56")
              .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
            http("request_57")
              .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
            http("request_58")
              .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
            http("request_59")
              .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
            http("request_60")
              .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
            http("request_61")
              .get("/assets/img/logos/certificate-footer.svg")
              .headers(headersAS11_0),
            http("request_62")
              .get("/assets/js/front/glightbox.min.js")
              .headers(headersAS11_4),
            http("request_63")
              .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
            http("request_64")
              .get("/assets/js/front/lightbox.js")
              .headers(headersAS11_4),
            http("request_65")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersAS11_0),
            http("request_66")
              .get("/assets/js/front/cookies.js")
              .headers(headersAS11_4),
            http("request_67")
              .get("/assets/js/front/header.js")
              .headers(headersAS11_4),
            http("request_68")
              .get("/static/favicon.ico")
              .headers(headersAS11_0),
            http("request_69")
              .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Ftraditio&page-ref=https%3A%2F%2Fasafov.ru%2Fworld%2Fukrainskij-naczizm-osnovnye-istochniki-i-sostavnye-chasti&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A980645755%3Az%3A300%3Ai%3A20240826204155%3Aet%3A1724686916%3Ac%3A1%3Arn%3A897026199%3Arqn%3A91%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C120%2C65%2C1%2C0%2C%2C403%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686914822%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686916%3At%3A%D0%A2%D1%80%D0%B0%D0%B4%D0%B8%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D0%B5%20%D1%80%D0%BE%D1%81%D1%81%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B5%20%D0%B4%D1%83%D1%85%D0%BE%D0%B2%D0%BD%D0%BE-%D0%BD%D1%80%D0%B0%D0%B2%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B5%20%D1%86%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%B2%20%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BF%D1%86%D0%B8%D0%B8%20%C2%AB%D0%94%D0%9D%D0%9A%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8%C2%BB&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
              .headers(headersAS11_69),
            http("request_70")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersAS11_70)
          )
      );

	  setUp(scnAS11.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
