package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class News2 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News2 = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC21_0 = new HashMap<>();
    headersUC21_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC21_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC21_0.put("sec-ch-ua-mobile", "?0");
    headersUC21_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC21_9 = new HashMap<>();
    headersUC21_9.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC21_9.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC21_9.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC21_9.put("priority", "u=0, i");
    headersUC21_9.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC21_9.put("sec-ch-ua-mobile", "?0");
    headersUC21_9.put("sec-ch-ua-platform", "Linux");
    headersUC21_9.put("sec-fetch-dest", "document");
    headersUC21_9.put("sec-fetch-mode", "navigate");
    headersUC21_9.put("sec-fetch-site", "same-origin");
    headersUC21_9.put("sec-fetch-user", "?1");
    headersUC21_9.put("upgrade-insecure-requests", "1");
    headersUC21_9.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC21_27 = new HashMap<>();
    headersUC21_27.put("Upgrade-Insecure-Requests", "1");
    headersUC21_27.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC21_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC21_27.put("sec-ch-ua-mobile", "?0");
    headersUC21_27.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC21_28 = new HashMap<>();
    headersUC21_28.put("accept", "*/*");
    headersUC21_28.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC21_28.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC21_28.put("origin", "https://shtab.opmoscow.ru");
    headersUC21_28.put("priority", "u=1, i");
    headersUC21_28.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC21_28.put("sec-ch-ua-mobile", "?0");
    headersUC21_28.put("sec-ch-ua-platform", "Linux");
    headersUC21_28.put("sec-fetch-dest", "empty");
    headersUC21_28.put("sec-fetch-mode", "cors");
    headersUC21_28.put("sec-fetch-site", "cross-site");
    headersUC21_28.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC21_30 = new HashMap<>();
    headersUC21_30.put("accept", "*/*");
    headersUC21_30.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC21_30.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC21_30.put("origin", "https://shtab.opmoscow.ru");
    headersUC21_30.put("priority", "u=4, i");
    headersUC21_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC21_30.put("sec-ch-ua-mobile", "?0");
    headersUC21_30.put("sec-ch-ua-platform", "Linux");
    headersUC21_30.put("sec-fetch-dest", "empty");
    headersUC21_30.put("sec-fetch-mode", "no-cors");
    headersUC21_30.put("sec-fetch-site", "cross-site");
    headersUC21_30.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC21 = scenario("Projects.asafov.News2")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC21_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC21_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC21_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC21_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC21_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC21_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC21_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC21_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC21_0),
            http("request_9")
              .get("/news/view/v-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve")
              .headers(headersUC21_9),
            http("request_10")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC21_0),
            http("request_11")
              .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_12")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_13")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_14")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_15")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC21_0),
            http("request_16")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC21_0),
            http("request_17")
              .get("/build/7255.871eb160.js")
              .headers(headersUC21_0),
            http("request_18")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC21_0),
            http("request_19")
              .get("/build/7729.67d87565.js")
              .headers(headersUC21_0),
            http("request_20")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC21_0),
            http("request_21")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC21_0),
            http("request_22")
              .get("/build/9154.f1370752.js")
              .headers(headersUC21_0),
            http("request_23")
              .get("/build/1676.2634f191.js")
              .headers(headersUC21_0),
            http("request_24")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC21_0),
            http("request_25")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC21_0),
            http("request_26")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC21_0),
            http("request_27")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC21_27),
            http("request_28")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A372307503%3Az%3A300%3Ai%3A20240823191236%3Aet%3A1724422356%3Ac%3A1%3Arn%3A907965397%3Arqn%3A100%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C493%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422355726%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422356%3At%3A%D0%92%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5%20%D0%BF%D1%80%D0%BE%D1%85%D0%BE%D0%B4%D0%B8%D1%82%20%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC21_28),
            http("request_29")
              .get(uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A372307503%3Az%3A300%3Ai%3A20240823191236%3Aet%3A1724422356%3Ac%3A1%3Arn%3A5263152%3Arqn%3A13%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C493%2C24%2C1%2C0%2C%2C38%2C1%2C%2C%2C%2C557%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422355726%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422356%3At%3A%D0%92%20%D1%88%D1%82%D0%B0%D1%82%D0%BD%D0%BE%D0%BC%20%D1%80%D0%B5%D0%B6%D0%B8%D0%BC%D0%B5%20%D0%BF%D1%80%D0%BE%D1%85%D0%BE%D0%B4%D0%B8%D1%82%20%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC21_28),
            http("request_30")
              .post(uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-shtatnom-rezhime-prohodit-testovoe-golosovanie-v-moskve&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422356_8c9365581bef7910d48ab8bb5293a33a6930f611cb21eed6dd35e2877fffee95&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A372307503%3Az%3A300%3Ai%3A20240823191236%3Aet%3A1724422357%3Ac%3A1%3Arn%3A381155992%3Arqn%3A14%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A577%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C%2C588%2C588%2C0%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422355726%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422357&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(1)rcm(0)cdl(na)eco(16851712)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC21_30)
          )
      );

	  setUp(scnUC21.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News2);
  }
}
