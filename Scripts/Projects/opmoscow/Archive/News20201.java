package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class News20201 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_News20201 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC32_0 = new HashMap<>();
    headersUC32_0.put("accept", "*/*");
    headersUC32_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC32_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC32_0.put("content-type", "text/plain");
    headersUC32_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC32_0.put("priority", "u=1, i");
    headersUC32_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC32_0.put("sec-ch-ua-mobile", "?0");
    headersUC32_0.put("sec-ch-ua-platform", "Linux");
    headersUC32_0.put("sec-fetch-dest", "empty");
    headersUC32_0.put("sec-fetch-mode", "cors");
    headersUC32_0.put("sec-fetch-site", "cross-site");
    headersUC32_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC32_1 = new HashMap<>();
    headersUC32_1.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC32_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC32_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC32_1.put("priority", "u=0, i");
    headersUC32_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC32_1.put("sec-ch-ua-mobile", "?0");
    headersUC32_1.put("sec-ch-ua-platform", "Linux");
    headersUC32_1.put("sec-fetch-dest", "document");
    headersUC32_1.put("sec-fetch-mode", "navigate");
    headersUC32_1.put("sec-fetch-site", "same-origin");
    headersUC32_1.put("sec-fetch-user", "?1");
    headersUC32_1.put("upgrade-insecure-requests", "1");
    headersUC32_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC32_2 = new HashMap<>();
    headersUC32_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC32_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC32_2.put("sec-ch-ua-mobile", "?0");
    headersUC32_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC32_45 = new HashMap<>();
    headersUC32_45.put("Upgrade-Insecure-Requests", "1");
    headersUC32_45.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC32_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC32_45.put("sec-ch-ua-mobile", "?0");
    headersUC32_45.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC32_46 = new HashMap<>();
    headersUC32_46.put("accept", "*/*");
    headersUC32_46.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC32_46.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC32_46.put("origin", "https://shtab.opmoscow.ru");
    headersUC32_46.put("priority", "u=1, i");
    headersUC32_46.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC32_46.put("sec-ch-ua-mobile", "?0");
    headersUC32_46.put("sec-ch-ua-platform", "Linux");
    headersUC32_46.put("sec-fetch-dest", "empty");
    headersUC32_46.put("sec-fetch-mode", "cors");
    headersUC32_46.put("sec-fetch-site", "cross-site");
    headersUC32_46.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC32_48 = new HashMap<>();
    headersUC32_48.put("accept", "*/*");
    headersUC32_48.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC32_48.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC32_48.put("origin", "https://shtab.opmoscow.ru");
    headersUC32_48.put("priority", "u=4, i");
    headersUC32_48.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC32_48.put("sec-ch-ua-mobile", "?0");
    headersUC32_48.put("sec-ch-ua-platform", "Linux");
    headersUC32_48.put("sec-fetch-dest", "empty");
    headersUC32_48.put("sec-fetch-mode", "no-cors");
    headersUC32_48.put("sec-fetch-site", "cross-site");
    headersUC32_48.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";
    
    String uri3 = "https://yastatic.net";

    ScenarioBuilder scnUC32 = scenario("Archive.News20201")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=2&wv-type=7&wmode=0&wv-hit=451458334&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&rn=917482600&browser-info=we%3A1%3Aet%3A1724482602%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824115642%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724482602&t=gdpr(14)ti(1)")
          .headers(headersUC32_0)
          .body(RawFileBody("news20201/0000_request.gif"))
          .resources(
            http("request_1")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-09-2020/news/view/obshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley")
              .headers(headersUC32_1),
            http("request_2")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC32_2),
            http("request_3")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC32_2),
            http("request_4")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC32_2),
            http("request_5")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC32_2),
            http("request_6")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC32_2),
            http("request_7")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC32_2),
            http("request_8")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC32_2),
            http("request_9")
              .get(uri2 + "/uploads/media/default/0001/17/fd8989ee232a5bcc0b5e27147745db79c5a9a874.png")
              .headers(headersUC32_2),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC32_2),
            http("request_11")
              .get(uri2 + "/cache/6/3/0/b/9/630b99d3daf0a1a119530a0d31c92cde1fd5d47f.jpeg")
              .headers(headersUC32_2),
            http("request_12")
              .get(uri2 + "/cache/a/8/9/0/6/a890650742d2a376e707f60bd15c61b46b6c7e5e.jpeg")
              .headers(headersUC32_2),
            http("request_13")
              .get(uri2 + "/cache/7/5/d/c/d/75dcdaf47c5ec3bb491bdbe716a7a02652b47479.jpeg")
              .headers(headersUC32_2),
            http("request_14")
              .get(uri2 + "/cache/1/d/1/5/7/1d1571cff098a9fcfdb7f42d131812d857d9aead.jpeg")
              .headers(headersUC32_2),
            http("request_15")
              .get(uri2 + "/cache/8/7/8/a/2/878a23c8a034812650d046cc3931976788dcc9e0.jpeg")
              .headers(headersUC32_2),
            http("request_16")
              .get(uri2 + "/cache/d/e/b/7/d/deb7dc8cf81bb714cb9978dd76b0b5292632cfb2.jpeg")
              .headers(headersUC32_2),
            http("request_17")
              .get(uri2 + "/cache/9/8/d/6/a/98d6ad4ff3a904a3b61bcb0740a99445d2dd0f51.jpeg")
              .headers(headersUC32_2),
            http("request_18")
              .get(uri2 + "/cache/1/6/0/b/2/160b206e8c9e9b5300e407d575a137423fd055ed.jpeg")
              .headers(headersUC32_2),
            http("request_19")
              .get(uri2 + "/cache/2/b/d/f/5/2bdf5310207655a8519a4958327ff372034609aa.jpeg")
              .headers(headersUC32_2),
            http("request_20")
              .get(uri2 + "/cache/b/8/7/b/7/b87b718ed133a2548a2721e7952af34a72d0be0d.jpeg")
              .headers(headersUC32_2),
            http("request_21")
              .get(uri2 + "/cache/9/d/e/c/e/9dece5a5f4e8aef45d490c2a649f2ff959f02bb7.jpeg")
              .headers(headersUC32_2),
            http("request_22")
              .get(uri2 + "/cache/d/5/2/d/1/d52d1eaa1e489a625a5a6ccfcd59de13a88c8829.jpeg")
              .headers(headersUC32_2),
            http("request_23")
              .get(uri2 + "/cache/f/1/1/8/5/f11852c12ff92bc9e17621be16844a1b683dacf7.jpeg")
              .headers(headersUC32_2),
            http("request_24")
              .get(uri2 + "/cache/3/1/0/b/6/310b624c75604b8b916f5a0484a951f4d91b4a61.jpeg")
              .headers(headersUC32_2),
            http("request_25")
              .get(uri2 + "/cache/d/0/c/1/0/d0c10757dddbd00ba2f0023cacc6b24cddac7cbf.jpeg")
              .headers(headersUC32_2),
            http("request_26")
              .get(uri2 + "/cache/4/9/f/9/e/49f9e2ef858135beda52fa28336cb3b07bf2305e.jpeg")
              .headers(headersUC32_2),
            http("request_27")
              .get(uri3 + "/es5-shims/0.0.2/es5-shims.min.js")
              .headers(headersUC32_2),
            http("request_28")
              .get(uri3 + "/share2/share.js")
              .headers(headersUC32_2),
            http("request_29")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC32_2),
            http("request_30")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC32_2),
            http("request_31")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC32_2),
            http("request_32")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC32_2),
            http("request_33")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC32_2),
            http("request_34")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC32_2),
            http("request_35")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC32_2),
            http("request_36")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC32_2),
            http("request_37")
              .get("/metrika/tag.js")
              .headers(headersUC32_2),
            http("request_38")
              .get(uri2 + "/build/fonts/subset-Montserrat-BoldItalic.d7b1ec9e.woff2"),
            http("request_39")
              .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_40")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_41")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_42")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_43")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC32_2),
            http("request_44")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC32_2),
            http("request_45")
              .get("/metrika/metrika_match.html")
              .headers(headersUC32_45),
            http("request_46")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A69111172%3Az%3A300%3Ai%3A20240824115644%3Aet%3A1724482605%3Ac%3A1%3Arn%3A330626482%3Arqn%3A161%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C464%2C20%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482604133%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482605%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC32_46),
            http("request_47")
              .get("/watch/26812653?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020&charset=utf-8&site-info=%7B%22shareVersion%22%3A2%2C%22strategy%22%3A%22a%2Ff%2Ft%22%7D&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A69111172%3Az%3A300%3Ai%3A20240824115644%3Aet%3A1724482605%3Ac%3A1%3Arn%3A333426535%3Arqn%3A79%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A643%3Awv%3A2%3Ads%3A0%2C0%2C464%2C20%2C1%2C0%2C%2C173%2C%2C%2C%2C%2C660%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724482604133%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482605%3At%3AProject%20name&t=gdpr(14)clc(0-0-0)rqnt(1)lt(6000)aw(1)rcm(0)cdl(na)eco(16851712)ti(1)")
              .headers(headersUC32_46),
            http("request_48")
              .post("/watch/26812653/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-09-2020%2Fnews%2Fview%2Fobshchestvennyy-shtab-rezultaty-tradicionnogo-golosovaniya-podtverdili-vybor-elektronnyh-izbirateley&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724482604_d55c9454fcaaacff85e6f85ce201bd0dbff283135257030cb025dfd28de0c09d&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A2%3Adp%3A0%3Als%3A1333638796513%3Ahid%3A69111172%3Az%3A300%3Ai%3A20240824115645%3Aet%3A1724482605%3Ac%3A1%3Arn%3A1039128199%3Arqn%3A80%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A%2C%2C%2C%2C%2C%2C%2C%2C12%2C707%2C707%2C2%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724482604133%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724482605&t=gdpr(14)mc(p-1)clc(0-0-0)rqnt(2)lt(6000)aw(1)rcm(0)cdl(na)eco(16851712)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22services%22%3A%22vkontakte%22%7D")
              .headers(headersUC32_48)
          )
      );

	  setUp(scnUC32.injectOpen(atOnceUsers(1))).protocols(httpProtocol_News20201);
  }
}
