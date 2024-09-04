package Projects.asafov;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class Baza extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://asafov.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersAS12_0 = new HashMap<>();
    headersAS12_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersAS12_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS12_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS12_0.put("priority", "u=0, i");
    headersAS12_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS12_0.put("sec-ch-ua-mobile", "?0");
    headersAS12_0.put("sec-ch-ua-platform", "Linux");
    headersAS12_0.put("sec-fetch-dest", "document");
    headersAS12_0.put("sec-fetch-mode", "navigate");
    headersAS12_0.put("sec-fetch-site", "same-origin");
    headersAS12_0.put("sec-fetch-user", "?1");
    headersAS12_0.put("upgrade-insecure-requests", "1");
    headersAS12_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS12_1 = new HashMap<>();
    headersAS12_1.put("Origin", "https://asafov.ru");
    headersAS12_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS12_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS12_1.put("sec-ch-ua-mobile", "?0");
    headersAS12_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS12_11 = new HashMap<>();
    headersAS12_11.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS12_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS12_11.put("sec-ch-ua-mobile", "?0");
    headersAS12_11.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersAS12_12 = new HashMap<>();
    headersAS12_12.put("accept", "*/*");
    headersAS12_12.put("accept-encoding", "gzip, deflate, br, zstd");
    headersAS12_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersAS12_12.put("origin", "https://asafov.ru");
    headersAS12_12.put("priority", "u=1, i");
    headersAS12_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS12_12.put("sec-ch-ua-mobile", "?0");
    headersAS12_12.put("sec-ch-ua-platform", "Linux");
    headersAS12_12.put("sec-fetch-dest", "empty");
    headersAS12_12.put("sec-fetch-mode", "cors");
    headersAS12_12.put("sec-fetch-site", "cross-site");
    headersAS12_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersAS12_13 = new HashMap<>();
    headersAS12_13.put("Upgrade-Insecure-Requests", "1");
    headersAS12_13.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersAS12_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersAS12_13.put("sec-ch-ua-mobile", "?0");
    headersAS12_13.put("sec-ch-ua-platform", "Linux");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnAS12 = scenario("Projects.asafov.Baza")
      .exec(
        http("request_0")
          .get("/spec/baza")
          .headers(headersAS12_0)
          .resources(
            http("request_1")
              .get("/build/assets/element-zM6ahEp_.js")
              .headers(headersAS12_1),
            http("request_2")
              .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
              .headers(headersAS12_1),
            http("request_3")
              .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
            http("request_4")
              .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
            http("request_5")
              .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
            http("request_6")
              .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
            http("request_7")
              .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
            http("request_8")
              .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
            http("request_9")
              .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
            http("request_10")
              .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
            http("request_11")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersAS12_11),
            http("request_12")
              .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Fbaza&page-ref=https%3A%2F%2Fasafov.ru%2Fworld%2Fukrainskij-naczizm-osnovnye-istochniki-i-sostavnye-chasti&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A548275838%3Az%3A300%3Ai%3A20240826204322%3Aet%3A1724687002%3Ac%3A1%3Arn%3A23778320%3Arqn%3A93%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A534%3Awv%3A2%3Ads%3A0%2C0%2C105%2C4%2C1%2C0%2C%2C517%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724687001543%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724687002%3At%3A%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D1%8B%20%D0%B3%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D0%BE%D0%B9%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B8%20%D0%BF%D0%BE%20%D1%81%D0%BE%D1%85%D1%80%D0%B0%D0%BD%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B8%20%D1%83%D0%BA%D1%80%D0%B5%D0%BF%D0%BB%D0%B5%D0%BD%D0%B8%D1%8E%20%D1%82%D1%80%D0%B0%D0%B4%D0%B8%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D1%85%20%D1%80%D0%BE%D1%81%D1%81%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D1%85%20%D0%B4%D1%83%D1%85%D0%BE%D0%B2%D0%BD%D0%BE-%D0%BD%D1%80%D0%B0%D0%B2%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D1%85%20%D1%86%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B5%D0%B9%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
              .headers(headersAS12_12),
            http("request_13")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersAS12_13)
          )
      );

	  setUp(scnAS12.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
