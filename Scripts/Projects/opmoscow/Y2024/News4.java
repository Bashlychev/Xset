package Y2024;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class News4 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News4 = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC23_0 = new HashMap<>();
    headersUC23_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC23_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC23_0.put("sec-ch-ua-mobile", "?0");
    headersUC23_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC23_10 = new HashMap<>();
    headersUC23_10.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC23_10.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC23_10.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC23_10.put("priority", "u=0, i");
    headersUC23_10.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC23_10.put("sec-ch-ua-mobile", "?0");
    headersUC23_10.put("sec-ch-ua-platform", "Linux");
    headersUC23_10.put("sec-fetch-dest", "document");
    headersUC23_10.put("sec-fetch-mode", "navigate");
    headersUC23_10.put("sec-fetch-site", "same-origin");
    headersUC23_10.put("sec-fetch-user", "?1");
    headersUC23_10.put("upgrade-insecure-requests", "1");
    headersUC23_10.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC23_28 = new HashMap<>();
    headersUC23_28.put("Upgrade-Insecure-Requests", "1");
    headersUC23_28.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC23_28.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC23_28.put("sec-ch-ua-mobile", "?0");
    headersUC23_28.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC23_29 = new HashMap<>();
    headersUC23_29.put("accept", "*/*");
    headersUC23_29.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC23_29.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC23_29.put("origin", "https://shtab.opmoscow.ru");
    headersUC23_29.put("priority", "u=1, i");
    headersUC23_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC23_29.put("sec-ch-ua-mobile", "?0");
    headersUC23_29.put("sec-ch-ua-platform", "Linux");
    headersUC23_29.put("sec-fetch-dest", "empty");
    headersUC23_29.put("sec-fetch-mode", "cors");
    headersUC23_29.put("sec-fetch-site", "cross-site");
    headersUC23_29.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC23_31 = new HashMap<>();
    headersUC23_31.put("accept", "*/*");
    headersUC23_31.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC23_31.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC23_31.put("origin", "https://shtab.opmoscow.ru");
    headersUC23_31.put("priority", "u=4, i");
    headersUC23_31.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC23_31.put("sec-ch-ua-mobile", "?0");
    headersUC23_31.put("sec-ch-ua-platform", "Linux");
    headersUC23_31.put("sec-fetch-dest", "empty");
    headersUC23_31.put("sec-fetch-mode", "no-cors");
    headersUC23_31.put("sec-fetch-site", "cross-site");
    headersUC23_31.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC23 = scenario("News4")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC23_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC23_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC23_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC23_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC23_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC23_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC23_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC23_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC23_0),
            http("request_9")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC23_0),
            http("request_10")
              .get("/news/view/v-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory")
              .headers(headersUC23_10),
            http("request_11")
              .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_12")
              .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_13")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_14")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_15")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_16")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC23_0),
            http("request_17")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC23_0),
            http("request_18")
              .get("/build/7255.871eb160.js")
              .headers(headersUC23_0),
            http("request_19")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC23_0),
            http("request_20")
              .get("/build/7729.67d87565.js")
              .headers(headersUC23_0),
            http("request_21")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC23_0),
            http("request_22")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC23_0),
            http("request_23")
              .get("/build/9154.f1370752.js")
              .headers(headersUC23_0),
            http("request_24")
              .get("/build/1676.2634f191.js")
              .headers(headersUC23_0),
            http("request_25")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC23_0),
            http("request_26")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC23_0),
            http("request_27")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC23_0),
            http("request_28")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC23_28),
            http("request_29")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A89968758%3Az%3A300%3Ai%3A20240823191656%3Aet%3A1724422617%3Ac%3A1%3Arn%3A191653744%3Arqn%3A113%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C541%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422616388%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422617%3At%3A%D0%92%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BD%D0%B0%D1%87%D0%B0%D0%BB%D1%81%D1%8F%20%D0%BD%D0%B0%D0%B1%D0%BE%D1%80%20%D0%B2%20%D0%9A%D0%BE%D1%80%D0%BF%D1%83%D1%81%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D1%82%D0%B5%D0%BB%D0%B5%D0%B9%20%D0%BD%D0%B0%20%D1%81%D0%B5%D0%BD%D1%82%D1%8F%D0%B1%D1%80%D1%8C%D1%81%D0%BA%D0%B8%D0%B5%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC23_29),
            http("request_30")
              .get(uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A89968758%3Az%3A300%3Ai%3A20240823191657%3Aet%3A1724422617%3Ac%3A1%3Arn%3A552777082%3Arqn%3A32%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A599%3Awv%3A2%3Ads%3A0%2C0%2C541%2C31%2C1%2C0%2C%2C55%2C%2C%2C%2C%2C629%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724422616388%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422617%3At%3A%D0%92%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%D0%BD%D0%B0%D1%87%D0%B0%D0%BB%D1%81%D1%8F%20%D0%BD%D0%B0%D0%B1%D0%BE%D1%80%20%D0%B2%20%D0%9A%D0%BE%D1%80%D0%BF%D1%83%D1%81%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D1%82%D0%B5%D0%BB%D0%B5%D0%B9%20%D0%BD%D0%B0%20%D1%81%D0%B5%D0%BD%D1%82%D1%8F%D0%B1%D1%80%D1%8C%D1%81%D0%BA%D0%B8%D0%B5%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D1%8B&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC23_29),
            http("request_31")
              .post(uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fnews%2Fview%2Fv-moskve-nachalsya-nabor-v-korpus-nablyudateley-na-sentyabrskie-vybory&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724422621_b8cdb7ff3ec74681ab83befb7409c60cc035d14988cbca71fd7e44b548e3dd86&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A1%3Als%3A1333638796513%3Ahid%3A89968758%3Az%3A300%3Ai%3A20240823191701%3Aet%3A1724422621%3Ac%3A1%3Arn%3A290535406%3Arqn%3A33%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C5%2C641%2C641%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724422616388%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724422621&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)aw(0)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC23_31)
          )
      );

	  setUp(scnUC23.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News4);
  }
}
