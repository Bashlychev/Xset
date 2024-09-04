package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Operatori extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_Operatori = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC05_0 = new HashMap<>();
    headersUC05_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC05_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC05_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC05_0.put("priority", "u=0, i");
    headersUC05_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC05_0.put("sec-ch-ua-mobile", "?0");
    headersUC05_0.put("sec-ch-ua-platform", "Linux");
    headersUC05_0.put("sec-fetch-dest", "document");
    headersUC05_0.put("sec-fetch-mode", "navigate");
    headersUC05_0.put("sec-fetch-site", "cross-site");
    headersUC05_0.put("sec-fetch-user", "?1");
    headersUC05_0.put("upgrade-insecure-requests", "1");
    headersUC05_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC05_1 = new HashMap<>();
    headersUC05_1.put("accept", "*/*");
    headersUC05_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC05_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC05_1.put("content-type", "text/plain");
    headersUC05_1.put("origin", "https://shtab.opmoscow.ru");
    headersUC05_1.put("priority", "u=1, i");
    headersUC05_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC05_1.put("sec-ch-ua-mobile", "?0");
    headersUC05_1.put("sec-ch-ua-platform", "Linux");
    headersUC05_1.put("sec-fetch-dest", "empty");
    headersUC05_1.put("sec-fetch-mode", "cors");
    headersUC05_1.put("sec-fetch-site", "cross-site");
    headersUC05_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC05_4 = new HashMap<>();
    headersUC05_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC05_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC05_4.put("sec-ch-ua-mobile", "?0");
    headersUC05_4.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC05_9 = new HashMap<>();
    headersUC05_9.put("accept", "*/*");
    headersUC05_9.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC05_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC05_9.put("origin", "https://shtab.opmoscow.ru");
    headersUC05_9.put("priority", "u=1, i");
    headersUC05_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC05_9.put("sec-ch-ua-mobile", "?0");
    headersUC05_9.put("sec-ch-ua-platform", "Linux");
    headersUC05_9.put("sec-fetch-dest", "empty");
    headersUC05_9.put("sec-fetch-mode", "cors");
    headersUC05_9.put("sec-fetch-site", "cross-site");
    headersUC05_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC05_10 = new HashMap<>();
    headersUC05_10.put("Upgrade-Insecure-Requests", "1");
    headersUC05_10.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC05_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC05_10.put("sec-ch-ua-mobile", "?0");
    headersUC05_10.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC05_11 = new HashMap<>();
    headersUC05_11.put("accept", "*/*");
    headersUC05_11.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC05_11.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC05_11.put("origin", "https://shtab.opmoscow.ru");
    headersUC05_11.put("priority", "u=4, i");
    headersUC05_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC05_11.put("sec-ch-ua-mobile", "?0");
    headersUC05_11.put("sec-ch-ua-platform", "Linux");
    headersUC05_11.put("sec-fetch-dest", "empty");
    headersUC05_11.put("sec-fetch-mode", "no-cors");
    headersUC05_11.put("sec-fetch-site", "cross-site");
    headersUC05_11.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC05 = scenario("Operatori")
      .exec(
        http("request_0")
          .get(uri2 + "/operatory-videocentra")
          .headers(headersUC05_0)
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=1066330092&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&rn=607946703&browser-info=we%3A1%3Aet%3A1724486220%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125659%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486220&t=gdpr(14)ti(1)")
              .headers(headersUC05_1)
              .body(RawFileBody("operatori/0001_request.gif")),
            http("request_2")
              .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=1066330092&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&rn=227017096&browser-info=we%3A1%3Aet%3A1724486221%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125701%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486221&t=gdpr(14)ti(1)")
              .headers(headersUC05_1)
              .body(RawFileBody("operatori/0002_request.gif")),
            http("request_3")
              .post("/webvisor/89667203?wv-part=1&wv-type=7&wmode=0&wv-hit=1066330092&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&rn=694761994&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724486219%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824125659%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724486219&t=gdpr(14)ti(1)")
              .headers(headersUC05_1)
              .body(RawFileBody("operatori/0003_request.gif")),
            http("request_4")
              .get("/metrika/tag.js")
              .headers(headersUC05_4),
            http("request_5")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_6")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_7")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_8")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC05_4),
            http("request_9")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A605080385%3Az%3A300%3Ai%3A20240824125702%3Aet%3A1724486222%3Ac%3A1%3Arn%3A858699657%3Arqn%3A234%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C583%2C2%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724486221692%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724486222%3At%3A%D0%A1%D0%BB%D0%B5%D0%B4%D0%B8%D0%BC%20%D0%B7%D0%B0%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BA%D0%B0%D0%BC%D0%B8%20%D1%87%D0%B5%D1%80%D0%B5%D0%B7%20%D0%BC%D0%BE%D0%BD%D0%B8%D1%82%D0%BE%D1%80%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC05_9),
            http("request_10")
              .get("/metrika/metrika_match.html")
              .headers(headersUC05_10)
          )
      )
      .pause(21)
      .exec(
        http("request_11")
          .post("/watch/89667203/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Foperatory-videocentra&charset=utf-8&hittoken=1724486222_60a7e660dcb7e19f19269e27f1ce4e274c48b71347468918599f3eeb7e9e52ef&browser-info=nb%3A1%3Acl%3A419%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A605080385%3Az%3A300%3Ai%3A20240824125724%3Aet%3A1724486245%3Ac%3A1%3Arn%3A938428050%3Arqn%3A235%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A749%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C190%2C0%2C777%2C777%2C1%2C777%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724486221692%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1724486245&t=gdpr(14)clc(0-0-0)rqnt(2)lt(5900)aw(0)rcm(0)cdl(na)eco(21037572)dss(2)fid(210)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ct%22%3A%5B%7B%22topic%22%3A15%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A57%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A126%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%5D%7D%7D")
          .headers(headersUC05_11)
      );

	  setUp(scnUC05.injectOpen(atOnceUsers(1))).protocols(httpProtocol_Operatori);
  }
}
