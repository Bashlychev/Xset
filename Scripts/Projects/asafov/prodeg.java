package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class prodeg extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersAS19_0 = new HashMap<>();
    headersAS19_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS19_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS19_0.put("sec-ch-ua-mobile", "?0");
    headersAS19_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS19_22 = new HashMap<>();
    headersAS19_22.put("Origin", "https://prodeg.asafov.ru");
    headersAS19_22.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS19_22.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS19_22.put("sec-ch-ua-mobile", "?0");
    headersAS19_22.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS19_38 = new HashMap<>();
    headersAS19_38.put("Upgrade-Insecure-Requests", "1");
    headersAS19_38.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS19_38.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS19_38.put("sec-ch-ua-mobile", "?0");
    headersAS19_38.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS19_39 = new HashMap<>();
    headersAS19_39.put("accept", "*/*");
    headersAS19_39.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS19_39.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS19_39.put("origin", "https://prodeg.asafov.ru");
    headersAS19_39.put("priority", "u=1, i");
    headersAS19_39.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS19_39.put("sec-ch-ua-mobile", "?0");
    headersAS19_39.put("sec-ch-ua-platform", "Linux");
    headersAS19_39.put("sec-fetch-dest", "empty");
    headersAS19_39.put("sec-fetch-mode", "cors");
    headersAS19_39.put("sec-fetch-site", "cross-site");
    headersAS19_39.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS19_43 = new HashMap<>();
    headersAS19_43.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersAS19_43.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS19_43.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS19_43.put("priority", "u=0, i");
    headersAS19_43.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS19_43.put("sec-ch-ua-mobile", "?0");
    headersAS19_43.put("sec-ch-ua-platform", "Linux");
    headersAS19_43.put("sec-fetch-dest", "document");
    headersAS19_43.put("sec-fetch-mode", "navigate");
    headersAS19_43.put("sec-fetch-site", "cross-site");
    headersAS19_43.put("sec-fetch-user", "?1");
    headersAS19_43.put("upgrade-insecure-requests", "1");
    headersAS19_43.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS19_59 = new HashMap<>();
    headersAS19_59.put("accept", "*/*");
    headersAS19_59.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS19_59.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS19_59.put("origin", "https://prodeg.asafov.ru");
    headersAS19_59.put("priority", "u=4, i");
    headersAS19_59.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS19_59.put("sec-ch-ua-mobile", "?0");
    headersAS19_59.put("sec-ch-ua-platform", "Linux");
    headersAS19_59.put("sec-fetch-dest", "empty");
    headersAS19_59.put("sec-fetch-mode", "no-cors");
    headersAS19_59.put("sec-fetch-site", "cross-site");
    headersAS19_59.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS19_61 = new HashMap<>();
    headersAS19_61.put("accept", "application/json, text/javascript, */*; q=0.01");
    headersAS19_61.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS19_61.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS19_61.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
    headersAS19_61.put("origin", "https://prodeg.asafov.ru");
    headersAS19_61.put("priority", "u=1, i");
    headersAS19_61.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS19_61.put("sec-ch-ua-mobile", "?0");
    headersAS19_61.put("sec-ch-ua-platform", "Linux");
    headersAS19_61.put("sec-fetch-dest", "empty");
    headersAS19_61.put("sec-fetch-mode", "cors");
    headersAS19_61.put("sec-fetch-site", "same-origin");
    headersAS19_61.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS19_61.put("x-requested-with", "XMLHttpRequest");
    
    String uri2 = "https://prodeg.asafov.ru";
    
    String uri3 = "https://fonts.gstatic.com/s";
    
    String uri4 = "https://fonts.googleapis.com/css2";

    ScenarioBuilder scnAS19 = scenario("Projects.asafov.prodeg")
      .exec(
        http("request_0")
          .get(uri4 + "?family=Roboto+Mono:ital,wght@0,100..700;1,100..700&family=Unbounded:wght@200..900&display=swap")
          .headers(headersAS19_0)
          .resources(
            http("request_1")
              .get(uri2 + "/assets/css/bootstrap.css")
              .headers(headersAS19_0),
            http("request_2")
              .get(uri2 + "/assets/css/bs-rewrite.css")
              .headers(headersAS19_0),
            http("request_3")
              .get(uri2 + "/assets/css/accordion-rewrite-slider.css")
              .headers(headersAS19_0),
            http("request_4")
              .get(uri2 + "/assets/css/accordion-rewrite-faq.css")
              .headers(headersAS19_0),
            http("request_5")
              .get(uri2 + "/assets/css/accordion-rewrite-fakes.css")
              .headers(headersAS19_0),
            http("request_6")
              .get(uri2 + "/assets/css/style.css")
              .headers(headersAS19_0),
            http("request_7")
              .get(uri2 + "/assets/css/map.css")
              .headers(headersAS19_0),
            http("request_8")
              .get(uri2 + "/assets/css/map-regions.css")
              .headers(headersAS19_0),
            http("request_9")
              .get(uri2 + "/assets/css/lightslider.css")
              .headers(headersAS19_0),
            http("request_10")
              .get(uri2 + "/assets/js/bootstrap.bundle.js")
              .headers(headersAS19_0),
            http("request_11")
              .get(uri2 + "/assets/js/jquery-3.7.1.min.js")
              .headers(headersAS19_0),
            http("request_12")
              .get(uri2 + "/assets/js/lightslider.js")
              .headers(headersAS19_0),
            http("request_13")
              .get(uri2 + "/assets/js/main.js")
              .headers(headersAS19_0),
            http("request_14")
              .get(uri2 + "/assets/images/svg/logo-white.svg")
              .headers(headersAS19_0),
            http("request_15")
              .get(uri2 + "/assets/images/svg/download-btn.svg")
              .headers(headersAS19_0),
            http("request_16")
              .get(uri2 + "/assets/images/svg/logo-colored.svg")
              .headers(headersAS19_0),
            http("request_17")
              .get("/metrika/tag.js")
              .headers(headersAS19_0),
            http("request_18")
              .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhPq3-OXg.woff2"),
            http("request_19")
              .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhLq38.woff2"),
            http("request_20")
              .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwv8ZfrxE.woff2"),
            http("request_21")
              .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwu8Zf.woff2"),
            http("request_22")
              .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhPq3-OXg.woff2")
              .headers(headersAS19_22),
            http("request_23")
              .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhLq38.woff2")
              .headers(headersAS19_22),
            http("request_24")
              .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwv8ZfrxE.woff2")
              .headers(headersAS19_22),
            http("request_25")
              .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwu8Zf.woff2")
              .headers(headersAS19_22),
            http("request_26")
              .get(uri2 + "/assets/images/svg/pixel-trailing-bg.svg")
              .headers(headersAS19_0),
            http("request_27")
              .get(uri2 + "/assets/images/svg/slider-dots.svg"),
            http("request_28")
              .get(uri2 + "/assets/images/who/sobyanin.jpg")
              .headers(headersAS19_0),
            http("request_29")
              .get(uri2 + "/assets/images/who/peskov.jpg")
              .headers(headersAS19_0),
            http("request_30")
              .get(uri2 + "/assets/images/who/putin.jpg")
              .headers(headersAS19_0),
            http("request_31")
              .get(uri2 + "/assets/images/who/mishustin.jpg")
              .headers(headersAS19_0),
            http("request_32")
              .get(uri2 + "/assets/images/who/chernyshenko.jpg")
              .headers(headersAS19_0),
            http("request_33")
              .get(uri2 + "/assets/images/who/medvedev.jpg")
              .headers(headersAS19_0),
            http("request_34")
              .get(uri2 + "/assets/images/who/manturov.jpg")
              .headers(headersAS19_0),
            http("request_35")
              .get(uri2 + "/assets/images/who/mashkov.jpg")
              .headers(headersAS19_0),
            http("request_36")
              .get(uri2 + "/assets/images/who/novak.jpg")
              .headers(headersAS19_0),
            http("request_37")
              .get(uri2 + "/assets/images/other/chart-deg.jpg")
              .headers(headersAS19_0),
            http("request_38")
              .get("/metrika/metrika_match.html")
              .headers(headersAS19_38),
            http("request_39")
              .get("/watch/96586904?wmode=7&page-url=https%3A%2F%2Fprodeg.asafov.ru%2F%23&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A700442758813%3Ahid%3A236092770%3Az%3A300%3Ai%3A20240827092205%3Aet%3A1724732525%3Ac%3A1%3Arn%3A480708180%3Arqn%3A4%3Au%3A1724676906572442126%3Aw%3A1920x959%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C198%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724732525052%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732525%3At%3A%D0%94%D0%B8%D1%81%D1%82%D0%B0%D0%BD%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D0%BE%D0%B5%20%D1%8D%D0%BB%D0%B5%D0%BA%D1%82%D1%80%D0%BE%D0%BD%D0%BD%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%2C%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%94%D0%AD%D0%93%20%D0%B2%202024%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersAS19_39),
            http("request_40")
              .get(uri2 + "/assets/images/opinions/vybornyy.jpg")
              .headers(headersAS19_0),
            http("request_41")
              .get(uri2 + "/assets/images/opinions/kudzagova.jpg")
              .headers(headersAS19_0),
            http("request_42")
              .get(uri2 + "/assets/images/opinions/naumov.jpg")
              .headers(headersAS19_0),
            http("request_43")
              .get(uri2 + "/")
              .headers(headersAS19_43),
            http("request_44")
              .get(uri2 + "/assets/images/opinions/nilov.jpg")
              .headers(headersAS19_0),
            http("request_45")
              .get(uri2 + "/assets/images/opinions/nifantiev.jpg")
              .headers(headersAS19_0),
            http("request_46")
              .get(uri2 + "/assets/images/opinions/romanenko.jpg")
              .headers(headersAS19_0),
            http("request_47")
              .get(uri2 + "/assets/images/opinions/hvostov.jpg")
              .headers(headersAS19_0),
            http("request_48")
              .get(uri2 + "/assets/images/opinions/chernishov.jpg")
              .headers(headersAS19_0),
            http("request_49")
              .get(uri2 + "/assets/images/opinions/asafov.jpg")
              .headers(headersAS19_0),
            http("request_50")
              .get(uri2 + "/assets/images/opinions/bashirov.jpg")
              .headers(headersAS19_0),
            http("request_51")
              .get(uri2 + "/assets/images/opinions/martinov.jpg")
              .headers(headersAS19_0),
            http("request_52")
              .get(uri2 + "/assets/images/opinions/starovoitov.jpg")
              .headers(headersAS19_0),
            http("request_53")
              .get(uri2 + "/assets/images/svg/pixel-trailing-dark-bg.svg")
              .headers(headersAS19_0),
            http("request_54")
              .get(uri2 + "/assets/images/svg/accordeon-arrow-fakes.svg"),
            http("request_55")
              .get(uri2 + "/assets/images/opinions/shapovalov.jpeg")
              .headers(headersAS19_0),
            http("request_56")
              .get(uri2 + "/assets/images/svg/accordeon-arrow.svg"),
            http("request_57")
              .get(uri2 + "/favicon.ico?v1")
              .headers(headersAS19_0),
            http("request_58")
              .get(uri2 + "/favicon.ico?v1")
              .headers(headersAS19_0)
          )
      )
      .pause(22)
      .exec(
        http("request_59")
          .post("/watch/96586904/1?page-url=https%3A%2F%2Fprodeg.asafov.ru%2F%23&charset=utf-8&hittoken=1724732525_3c45def8d1aa2c33969a3875b59b7b9be0e6e65baf58499388cc2b1d52cce93d&browser-info=nb%3A1%3Acl%3A187%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A700442758813%3Ahid%3A236092770%3Az%3A300%3Ai%3A20240827092227%3Aet%3A1724732548%3Ac%3A1%3Arn%3A104930438%3Arqn%3A5%3Au%3A1724676906572442126%3Aw%3A1905x959%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A343%3Awv%3A2%3Ads%3A%2C%2C%2C232%2C%2C%2C%2C14%2C0%2C484%2C484%2C4%2C447%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724732525052%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1724732548&t=gdpr(14)clc(2-950-709)rqnt(2)aw(1)rcm(0)cdl(na)eco(21037572)dss(2)fid(230)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ct%22%3A%5B%7B%22topic%22%3A57%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A96%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A289%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%5D%7D%7D")
          .headers(headersAS19_59)
      )
      .pause(5)
      .exec(
        http("request_60")
          .post("/watch/96586904/1?page-url=https%3A%2F%2Fprodeg.asafov.ru%2F%23&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724732525_3c45def8d1aa2c33969a3875b59b7b9be0e6e65baf58499388cc2b1d52cce93d&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A700442758813%3Ahid%3A236092770%3Az%3A300%3Ai%3A20240827092233%3Aet%3A1724732553%3Ac%3A1%3Arn%3A248850088%3Arqn%3A6%3Au%3A1724676906572442126%3Aw%3A1905x959%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724732525052%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732553&t=gdpr(14)clc(2-950-709)rqnt(3)aw(1)rcm(0)cdl(na)eco(21037572)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22fi%22%3A%22a(1)b(PA3AA~)c(7zOtRVrx01D5q8kJJgHz8jLSzo5PvwqlMt2LkDyJGrs%3D)%22%2C%22ite%22%3A1%7D%7D")
          .headers(headersAS19_59)
          .resources(
            http("request_61")
              .post(uri2 + "/send.php")
              .headers(headersAS19_61)
              .formParam("name", "Dog")
              .formParam("email", "dog@mail.ru")
              .formParam("message", "Dog")
          )
      );

	  setUp(scnAS19.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
