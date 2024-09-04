package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class News20232 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News20232 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC27_0 = new HashMap<>();
    headersUC27_0.put("accept", "*/*");
    headersUC27_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC27_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC27_0.put("content-type", "text/plain");
    headersUC27_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC27_0.put("priority", "u=1, i");
    headersUC27_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC27_0.put("sec-ch-ua-mobile", "?0");
    headersUC27_0.put("sec-ch-ua-platform", "Linux");
    headersUC27_0.put("sec-fetch-dest", "empty");
    headersUC27_0.put("sec-fetch-mode", "cors");
    headersUC27_0.put("sec-fetch-site", "cross-site");
    headersUC27_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC27_1 = new HashMap<>();
    headersUC27_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC27_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC27_1.put("sec-ch-ua-mobile", "?0");
    headersUC27_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC27_25 = new HashMap<>();
    headersUC27_25.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC27_25.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC27_25.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC27_25.put("priority", "u=0, i");
    headersUC27_25.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC27_25.put("sec-ch-ua-mobile", "?0");
    headersUC27_25.put("sec-ch-ua-platform", "Linux");
    headersUC27_25.put("sec-fetch-dest", "document");
    headersUC27_25.put("sec-fetch-mode", "navigate");
    headersUC27_25.put("sec-fetch-site", "same-origin");
    headersUC27_25.put("sec-fetch-user", "?1");
    headersUC27_25.put("upgrade-insecure-requests", "1");
    headersUC27_25.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC27_32 = new HashMap<>();
    headersUC27_32.put("Upgrade-Insecure-Requests", "1");
    headersUC27_32.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC27_32.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC27_32.put("sec-ch-ua-mobile", "?0");
    headersUC27_32.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC27_33 = new HashMap<>();
    headersUC27_33.put("accept", "*/*");
    headersUC27_33.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC27_33.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC27_33.put("origin", "https://shtab.opmoscow.ru");
    headersUC27_33.put("priority", "u=1, i");
    headersUC27_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC27_33.put("sec-ch-ua-mobile", "?0");
    headersUC27_33.put("sec-ch-ua-platform", "Linux");
    headersUC27_33.put("sec-fetch-dest", "empty");
    headersUC27_33.put("sec-fetch-mode", "cors");
    headersUC27_33.put("sec-fetch-site", "cross-site");
    headersUC27_33.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC27_35 = new HashMap<>();
    headersUC27_35.put("accept", "*/*");
    headersUC27_35.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC27_35.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC27_35.put("origin", "https://shtab.opmoscow.ru");
    headersUC27_35.put("priority", "u=4, i");
    headersUC27_35.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC27_35.put("sec-ch-ua-mobile", "?0");
    headersUC27_35.put("sec-ch-ua-platform", "Linux");
    headersUC27_35.put("sec-fetch-dest", "empty");
    headersUC27_35.put("sec-fetch-mode", "no-cors");
    headersUC27_35.put("sec-fetch-site", "cross-site");
    headersUC27_35.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC27 = scenario("Archive.News20232")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=4&wv-type=7&wmode=0&wv-hit=83869153&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&rn=89417915&browser-info=we%3A1%3Aet%3A1724482268%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115108%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482268&t=gdpr(14)ti(1)")
          .headers(headersUC27_0)
          .body(RawFileBody("news20232/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC27_1),
            http("request_2")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC27_1),
            http("request_3")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC27_1),
            http("request_4")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC27_1),
            http("request_5")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC27_1),
            http("request_6")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC27_1),
            http("request_7")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC27_1),
            http("request_8")
              .get(uri2 + "/uploads/media/default/0002/08/eaeb42854c5147ecd4db172ab7aa6a48cf0de830.png")
              .headers(headersUC27_1),
            http("request_9")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC27_1),
            http("request_10")
              .get(uri2 + "/cache/0/4/b/d/9/04bd967b220c4d7ba96a243fa3a2cd85dab12d47.jpeg")
              .headers(headersUC27_1),
            http("request_11")
              .get(uri2 + "/cache/d/8/e/a/c/d8eac64df3da4a11551d3de1b44a7928f322ae4d.jpeg")
              .headers(headersUC27_1),
            http("request_12")
              .get(uri2 + "/cache/b/b/4/5/d/bb45db0c4eecede8319a25ddc2ac0a30eba43315.jpeg")
              .headers(headersUC27_1),
            http("request_13")
              .get(uri2 + "/cache/f/f/8/a/3/ff8a339e18525cf0bf96ee0234f8ae2e1de0600b.jpeg")
              .headers(headersUC27_1),
            http("request_14")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC27_1),
            http("request_15")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC27_1),
            http("request_16")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC27_1),
            http("request_17")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC27_1),
            http("request_18")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC27_1),
            http("request_19")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC27_1),
            http("request_20")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC27_1),
            http("request_21")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC27_1),
            http("request_22")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC27_1),
            http("request_23")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC27_1),
            http("request_24")
              .get("/metrika/tag.js")
              .headers(headersUC27_1),
            http("request_25")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2023/news/view/v-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram")
              .headers(headersUC27_25),
            http("request_26")
              .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_27")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_28")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_29")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_30")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC27_1),
            http("request_31")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC27_1),
            http("request_32")
              .get("/metrika/metrika_match.html")
              .headers(headersUC27_32),
            http("request_33")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A487408600%3Az%3A300%3Ai%3A20240824115110%3Aet%3A1724482270%3Ac%3A1%3Arn%3A852597922%3Arqn%3A145%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C426%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482269649%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482270%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC27_33),
            http("request_34")
              .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A487408600%3Az%3A300%3Ai%3A20240824115110%3Aet%3A1724482270%3Ac%3A1%3Arn%3A462649981%3Arqn%3A61%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C426%2C101%2C1%2C0%2C%2C93%2C%2C%2C%2C%2C623%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482269649%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482270%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC27_33),
            http("request_35")
              .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482270_fa384098155bec186af50fe5fb91851dc2e9918a5ca23bd16b01ebb51f91f286&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A487408600%3Az%3A300%3Ai%3A20240824115110%3Aet%3A1724482271%3Ac%3A1%3Arn%3A1020860224%3Arqn%3A62%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A617%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C12%2C667%2C667%2C1%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724482269649%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482271&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6100)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC27_35)
          )
      )
      .pause(15)
      .exec(
        http("request_36")
          .post("/watch/89667203/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023%2Fnews%2Fview%2Fv-moskve-obyavili-o-polnoy-gotovnosti-sistemy-elektronnogo-golosovaniya-k-vyboram&charset=utf-8&hittoken=1724482270_2fc0eb9e277a9d1b570271f76b976845c13b6a4be5e04436444c4e3e48469ab1&browser-info=nb%3A1%3Acl%3A628%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A487408600%3Az%3A300%3Ai%3A20240824115127%3Aet%3A1724482287%3Ac%3A1%3Arn%3A46674697%3Arqn%3A146%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A617%3Awv%3A2%3Ads%3A%2C%2C%2C101%2C%2C%2C%2C93%2C12%2C667%2C667%2C1%2C623%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724482269649%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1724482287&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6100)aw(1)rcm(0)cdl(na)eco(21037572)dss(1)fid(120)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ct%22%3A%5B%7B%22topic%22%3A15%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A57%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A126%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%5D%7D%7D")
          .headers(headersUC27_35)
      );

	  setUp(scnUC27.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News20232);
  }
}
