package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2020 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2020 = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC31_0 = new HashMap<>();
    headersUC31_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC31_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC31_0.put("sec-ch-ua-mobile", "?0");
    headersUC31_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC31_22 = new HashMap<>();
    headersUC31_22.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC31_22.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC31_22.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC31_22.put("priority", "u=0, i");
    headersUC31_22.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC31_22.put("sec-ch-ua-mobile", "?0");
    headersUC31_22.put("sec-ch-ua-platform", "Linux");
    headersUC31_22.put("sec-fetch-dest", "document");
    headersUC31_22.put("sec-fetch-mode", "navigate");
    headersUC31_22.put("sec-fetch-site", "same-origin");
    headersUC31_22.put("sec-fetch-user", "?1");
    headersUC31_22.put("upgrade-insecure-requests", "1");
    headersUC31_22.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC31_23 = new HashMap<>();
    headersUC31_23.put("Upgrade-Insecure-Requests", "1");
    headersUC31_23.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC31_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC31_23.put("sec-ch-ua-mobile", "?0");
    headersUC31_23.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC31_36 = new HashMap<>();
    headersUC31_36.put("accept", "*/*");
    headersUC31_36.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC31_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC31_36.put("origin", "https://shtab.opmoscow.ru");
    headersUC31_36.put("priority", "u=1, i");
    headersUC31_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC31_36.put("sec-ch-ua-mobile", "?0");
    headersUC31_36.put("sec-ch-ua-platform", "Linux");
    headersUC31_36.put("sec-fetch-dest", "empty");
    headersUC31_36.put("sec-fetch-mode", "cors");
    headersUC31_36.put("sec-fetch-site", "cross-site");
    headersUC31_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";
    
    String uri3 = "https://i.ytimg.com/vi";

    ScenarioBuilder scnUC31 = scenario("Archive.MainPage2020")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC31_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC31_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC31_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC31_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC31_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC31_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC31_0),
            http("request_7")
              .get("/uploads/media/default/0001/15/d8fd939e1bb28172b3676c657fb92b74a41518d4.png")
              .headers(headersUC31_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC31_0),
            http("request_9")
              .get("/cache/9/9/8/9/3/99893a39b66f9284a0e8fd26b648badd4c0318b5.png")
              .headers(headersUC31_0),
            http("request_10")
              .get("/cache/2/8/5/6/f/2856f2d1ebdccb8ba5412461c0eb8cb3f9ff9a4a.jpeg")
              .headers(headersUC31_0),
            http("request_11")
              .get("/cache/e/e/b/e/d/eebed9e7adf8d3de1e56e5726526fae84cad8ec5.png")
              .headers(headersUC31_0),
            http("request_12")
              .get("/cache/1/5/7/1/d/1571df28d12d91e60387cfd8933e068724d39113.jpeg")
              .headers(headersUC31_0),
            http("request_13")
              .get("/cache/b/d/3/e/a/bd3eaa644cb769c937543eb1bfb79e3c306cd7e7.jpeg")
              .headers(headersUC31_0),
            http("request_14")
              .get("/cache/f/7/8/8/9/f788969d6b72a6697516a6d7a4dcb1b5b77a2ebc.jpeg")
              .headers(headersUC31_0),
            http("request_15")
              .get("/build/images/opmoscow/loading.svg")
              .headers(headersUC31_0),
            http("request_16")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC31_0),
            http("request_17")
              .get("/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_18")
              .get("/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_19")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_20")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_21")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_22")
              .get("/obshchestvennyy-shtab-po-vyboram-2020")
              .headers(headersUC31_22),
            http("request_23")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC31_23),
            http("request_24")
              .get("/cache/e/9/f/6/f/e9f6f8422307ed59ecf7d3f8199c47104705f895.jpeg")
              .headers(headersUC31_0),
            http("request_25")
              .get("/cache/f/8/4/f/e/f84feac61fc54a02c74141fb1e6e3eaa306f55a8.jpeg")
              .headers(headersUC31_0),
            http("request_26")
              .get("/cache/7/2/f/9/c/72f9c13f4182f816425efed16acc8c45602b680e.jpeg")
              .headers(headersUC31_0),
            http("request_27")
              .get("/cache/d/a/e/3/5/dae35437407848b0cc930a879a120fe99e1dfb60.jpeg")
              .headers(headersUC31_0),
            http("request_28")
              .get("/cache/a/c/c/8/d/acc8d6cf4c6c3b524a575fc5411701653557cc91.jpeg")
              .headers(headersUC31_0),
            http("request_29")
              .get("/cache/2/9/a/c/6/29ac691aa6a8d331b94ca63dfbc691bffc66c22a.png")
              .headers(headersUC31_0),
            http("request_30")
              .get("/build/7255.871eb160.js")
              .headers(headersUC31_0),
            http("request_31")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC31_0),
            http("request_32")
              .get("/build/7729.67d87565.js")
              .headers(headersUC31_0),
            http("request_33")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC31_0),
            http("request_34")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC31_0),
            http("request_35")
              .get("/build/9154.f1370752.js")
              .headers(headersUC31_0),
            http("request_36")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2020&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A490738847%3Az%3A300%3Ai%3A20240824121233%3Aet%3A1724483554%3Ac%3A1%3Arn%3A1051478856%3Arqn%3A199%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C492%2C%2C2%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483553189%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483554%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8E%20%D0%B8%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%D0%BC%20%D0%BF%D0%BE%20%D0%BF%D0%BE%D0%BF%D1%80%D0%B0%D0%B2%D0%BA%D0%B0%D0%BC%20%D0%B2%20%D0%9A%D0%BE%D0%BD%D1%81%D1%82%D0%B8%D1%82%D1%83%D1%86%D0%B8%D1%8E%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B9%D1%81%D0%BA%D0%BE%D0%B9%20%D0%A4%D0%B5%D0%B4%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B8&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC31_36),
            http("request_37")
              .get("/build/1676.2634f191.js")
              .headers(headersUC31_0),
            http("request_38")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC31_0),
            http("request_39")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC31_0),
            http("request_40")
              .get(uri3 + "/gUerbOs0ZHc/hqdefault.jpg")
              .headers(headersUC31_0),
            http("request_41")
              .get(uri3 + "/aJj5lLy4e3w/hqdefault.jpg")
              .headers(headersUC31_0),
            http("request_42")
              .get(uri3 + "/GRLRqEK_6q4/hqdefault.jpg")
              .headers(headersUC31_0),
            http("request_43")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC31_0)
          )
      );

	  setUp(scnUC31.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2020);
  }
}
