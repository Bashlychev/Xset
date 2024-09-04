package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class News20183 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News20183 = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC39_0 = new HashMap<>();
    headersUC39_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC39_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC39_0.put("sec-ch-ua-mobile", "?0");
    headersUC39_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC39_17 = new HashMap<>();
    headersUC39_17.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC39_17.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC39_17.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC39_17.put("priority", "u=0, i");
    headersUC39_17.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC39_17.put("sec-ch-ua-mobile", "?0");
    headersUC39_17.put("sec-ch-ua-platform", "Linux");
    headersUC39_17.put("sec-fetch-dest", "document");
    headersUC39_17.put("sec-fetch-mode", "navigate");
    headersUC39_17.put("sec-fetch-site", "same-origin");
    headersUC39_17.put("sec-fetch-user", "?1");
    headersUC39_17.put("upgrade-insecure-requests", "1");
    headersUC39_17.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC39_29 = new HashMap<>();
    headersUC39_29.put("Upgrade-Insecure-Requests", "1");
    headersUC39_29.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC39_29.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC39_29.put("sec-ch-ua-mobile", "?0");
    headersUC39_29.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC39_30 = new HashMap<>();
    headersUC39_30.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC39_30.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC39_30.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC39_30.put("priority", "i");
    headersUC39_30.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC39_30.put("sec-ch-ua-mobile", "?0");
    headersUC39_30.put("sec-ch-ua-platform", "Linux");
    headersUC39_30.put("sec-fetch-dest", "image");
    headersUC39_30.put("sec-fetch-mode", "no-cors");
    headersUC39_30.put("sec-fetch-site", "same-origin");
    headersUC39_30.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC39_36 = new HashMap<>();
    headersUC39_36.put("accept", "*/*");
    headersUC39_36.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC39_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC39_36.put("origin", "https://shtab.opmoscow.ru");
    headersUC39_36.put("priority", "u=1, i");
    headersUC39_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC39_36.put("sec-ch-ua-mobile", "?0");
    headersUC39_36.put("sec-ch-ua-platform", "Linux");
    headersUC39_36.put("sec-fetch-dest", "empty");
    headersUC39_36.put("sec-fetch-mode", "cors");
    headersUC39_36.put("sec-fetch-site", "cross-site");
    headersUC39_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC39_40 = new HashMap<>();
    headersUC39_40.put("accept", "*/*");
    headersUC39_40.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC39_40.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC39_40.put("origin", "https://shtab.opmoscow.ru");
    headersUC39_40.put("priority", "u=4, i");
    headersUC39_40.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC39_40.put("sec-ch-ua-mobile", "?0");
    headersUC39_40.put("sec-ch-ua-platform", "Linux");
    headersUC39_40.put("sec-fetch-dest", "empty");
    headersUC39_40.put("sec-fetch-mode", "no-cors");
    headersUC39_40.put("sec-fetch-site", "cross-site");
    headersUC39_40.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC39 = scenario("Archive.News20183")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC39_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC39_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC39_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC39_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC39_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC39_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC39_0),
            http("request_7")
              .get("/uploads/media/default/0001/17/4bd9b9fe185a7be5441247e5d48c32d33bbd3e7e.png")
              .headers(headersUC39_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC39_0),
            http("request_9")
              .get("/uploads/media/default/0001/13/389eb6cd8214f82e33d62b7e41a665cf76b28950.jpeg")
              .headers(headersUC39_0),
            http("request_10")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC39_0),
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
              .get("/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
            http("request_17")
              .get("/obshchestvennyy-shtab-po-vyboram-2018/news/view/moskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov")
              .headers(headersUC39_17),
            http("request_18")
              .get("/uploads/media/default/0001/13/496992576aa979a7a1553aa91f8ec2b9f319dd94.jpeg")
              .headers(headersUC39_0),
            http("request_19")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC39_0),
            http("request_20")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC39_0),
            http("request_21")
              .get("/build/7255.871eb160.js")
              .headers(headersUC39_0),
            http("request_22")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC39_0),
            http("request_23")
              .get("/build/7729.67d87565.js")
              .headers(headersUC39_0),
            http("request_24")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC39_0),
            http("request_25")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC39_0),
            http("request_26")
              .get("/build/9154.f1370752.js")
              .headers(headersUC39_0),
            http("request_27")
              .get("/build/1676.2634f191.js")
              .headers(headersUC39_0),
            http("request_28")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC39_0),
            http("request_29")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC39_29),
            http("request_30")
              .get("/cache/c/7/c/4/b/c7c4b2eaf1091fa9e5de10cdacdd3877950cd464.jpeg")
              .headers(headersUC39_30),
            http("request_31")
              .get("/cache/6/5/e/8/b/65e8b353289518328d62955193b8a2abb40dc2f4.jpeg")
              .headers(headersUC39_30),
            http("request_32")
              .get("/cache/a/c/e/2/9/ace292356c5f6d7c559efa0ecdc72fea89b10242.jpeg")
              .headers(headersUC39_30),
            http("request_33")
              .get("/cache/1/3/e/b/5/13eb5dc322ac1374a5fbed78d83af3ec79cab7c8.jpeg")
              .headers(headersUC39_30),
            http("request_34")
              .get("/cache/c/e/2/3/7/ce23700e5e737b84dba12ee62e3bdf9faf3853d8.jpeg")
              .headers(headersUC39_30),
            http("request_35")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC39_0),
            http("request_36")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmoskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A38282892%3Az%3A300%3Ai%3A20240824120930%3Aet%3A1724483370%3Ac%3A1%3Arn%3A918452872%3Arqn%3A190%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C464%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483369793%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483370%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC39_36),
            http("request_37")
              .get(uri1 + "/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmoskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A38282892%3Az%3A300%3Ai%3A20240824120930%3Aet%3A1724483371%3Ac%3A1%3Arn%3A309435203%3Arqn%3A117%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A650%3Awv%3A2%3Ads%3A0%2C0%2C464%2C240%2C1%2C0%2C%2C59%2C%2C%2C%2C%2C767%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483369793%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483371%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC39_36),
            http("request_38")
              .get("/cache/c/8/f/c/8/c8fc846345814f8b6ab3e75a75533d3f26500930.jpeg")
              .headers(headersUC39_30),
            http("request_39")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC39_0),
            http("request_40")
              .post(uri1 + "/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2018%2Fnews%2Fview%2Fmoskve-vazhen-chestnyy-rezultat-prezidentskih-vyborov&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724483370_55e69d83438e57a3c54f1946967190f3aee4592f07d7d5cdc701610f7f7883aa&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A38282892%3Az%3A300%3Ai%3A20240824120930%3Aet%3A1724483371%3Ac%3A1%3Arn%3A611013708%3Arqn%3A118%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C11%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724483369793%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483371&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC39_40)
          )
      );

	  setUp(scnUC39.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News20183);
  }
}
