package Y2024;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class CandidatesKPRF extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesKPRF = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC13_0 = new HashMap<>();
    headersUC13_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC13_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC13_0.put("sec-ch-ua-mobile", "?0");
    headersUC13_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC13_49 = new HashMap<>();
    headersUC13_49.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC13_49.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC13_49.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC13_49.put("priority", "u=0, i");
    headersUC13_49.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC13_49.put("sec-ch-ua-mobile", "?0");
    headersUC13_49.put("sec-ch-ua-platform", "Linux");
    headersUC13_49.put("sec-fetch-dest", "document");
    headersUC13_49.put("sec-fetch-mode", "navigate");
    headersUC13_49.put("sec-fetch-site", "same-origin");
    headersUC13_49.put("sec-fetch-user", "?1");
    headersUC13_49.put("upgrade-insecure-requests", "1");
    headersUC13_49.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC13_74 = new HashMap<>();
    headersUC13_74.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC13_74.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC13_74.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC13_74.put("priority", "u=0, i");
    headersUC13_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC13_74.put("sec-ch-ua-mobile", "?0");
    headersUC13_74.put("sec-ch-ua-platform", "Linux");
    headersUC13_74.put("sec-fetch-dest", "iframe");
    headersUC13_74.put("sec-fetch-mode", "navigate");
    headersUC13_74.put("sec-fetch-site", "cross-site");
    headersUC13_74.put("upgrade-insecure-requests", "1");
    headersUC13_74.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC13_75 = new HashMap<>();
    headersUC13_75.put("accept", "*/*");
    headersUC13_75.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC13_75.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC13_75.put("origin", "https://shtab.opmoscow.ru");
    headersUC13_75.put("priority", "u=1, i");
    headersUC13_75.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC13_75.put("sec-ch-ua-mobile", "?0");
    headersUC13_75.put("sec-ch-ua-platform", "Linux");
    headersUC13_75.put("sec-fetch-dest", "empty");
    headersUC13_75.put("sec-fetch-mode", "cors");
    headersUC13_75.put("sec-fetch-site", "cross-site");
    headersUC13_75.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scn = scenario("Y2024.CandidatesKPRF")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC13_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC13_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC13_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC13_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC13_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC13_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC13_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC13_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC13_0),
            http("request_9")
              .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
              .headers(headersUC13_0),
            http("request_10")
              .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
              .headers(headersUC13_0),
            http("request_11")
              .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
              .headers(headersUC13_0),
            http("request_12")
              .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
              .headers(headersUC13_0),
            http("request_13")
              .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
              .headers(headersUC13_0),
            http("request_14")
              .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
              .headers(headersUC13_0),
            http("request_15")
              .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
              .headers(headersUC13_0),
            http("request_16")
              .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
              .headers(headersUC13_0),
            http("request_17")
              .get("/cache/f/c/b/b/5/fcbb52286931297bc81767bf546f6e7e1598f309.jpeg")
              .headers(headersUC13_0),
            http("request_18")
              .get("/cache/4/2/a/8/f/42a8fc44f7037c3b00198c2de5efc54a5ef1be3b.jpeg")
              .headers(headersUC13_0),
            http("request_19")
              .get("/cache/2/b/e/9/5/2be9547c10349bcd6bf07699a793be4bbb64d948.jpeg")
              .headers(headersUC13_0),
            http("request_20")
              .get("/cache/1/2/0/d/7/120d7d7f25e681a801f292dbff29fc06194a51a5.jpeg")
              .headers(headersUC13_0),
            http("request_21")
              .get("/cache/9/a/9/3/d/9a93dfb6167b38a18b7106214c4c1bea4e90b513.jpeg")
              .headers(headersUC13_0),
            http("request_22")
              .get("/cache/2/b/e/d/f/2bedf909001f8d8517156acf3158d92bcd072862.jpeg")
              .headers(headersUC13_0),
            http("request_23")
              .get("/cache/7/f/7/0/1/7f701569753338b92c139d278f3ba8b3fb6fb9e2.jpeg")
              .headers(headersUC13_0),
            http("request_24")
              .get("/cache/7/5/b/3/9/75b39d240ba9771f0fa972b1590d9474734e0e40.jpeg")
              .headers(headersUC13_0),
            http("request_25")
              .get("/cache/e/9/7/c/6/e97c6acbd515443e779f1913b157e364b43974e1.jpeg")
              .headers(headersUC13_0),
            http("request_26")
              .get("/cache/3/b/b/8/2/3bb826762205d7f20fa361da159be30b80e7e3f1.png")
              .headers(headersUC13_0),
            http("request_27")
              .get("/cache/8/a/c/a/f/8acafdb68b8430fa6dd864ca7f84d35334ecc98e.jpeg")
              .headers(headersUC13_0),
            http("request_28")
              .get("/cache/e/2/6/c/1/e26c1a1f955096e2d9dd1d240fb48d26dd2879eb.jpeg")
              .headers(headersUC13_0),
            http("request_29")
              .get("/cache/e/5/e/a/8/e5ea834da9f5372d364177d21928a525f70bfacd.jpeg")
              .headers(headersUC13_0),
            http("request_30")
              .get("/cache/d/9/a/c/7/d9ac7c98caa4042118582f4fafdc3cbd06e8ca79.jpeg")
              .headers(headersUC13_0),
            http("request_31")
              .get("/cache/7/1/b/d/8/71bd886d9c4f746a6a867ec9ac4d63ce2ea110b6.jpeg")
              .headers(headersUC13_0),
            http("request_32")
              .get("/cache/2/3/8/e/5/238e57533a6aa104f7f98c41435555053103d3ad.jpeg")
              .headers(headersUC13_0),
            http("request_33")
              .get("/cache/7/4/4/d/d/744dd843d10bcc93e56248039d8064c43e1c2032.jpeg")
              .headers(headersUC13_0),
            http("request_34")
              .get("/cache/0/3/4/3/2/03432100c44db7ee51bde31e4857f1014844856b.jpeg")
              .headers(headersUC13_0),
            http("request_35")
              .get("/cache/b/4/f/8/c/b4f8ce61c766b3a6d89a83ab026a90f2d94f15d0.jpeg")
              .headers(headersUC13_0),
            http("request_36")
              .get("/cache/b/7/7/8/4/b7784349c04e2f00dbaa15ffbe9775fe05e2899f.jpeg")
              .headers(headersUC13_0),
            http("request_37")
              .get("/cache/e/0/5/7/8/e05783c3a49e0021de817903302b8414fb46f9b1.jpeg")
              .headers(headersUC13_0),
            http("request_38")
              .get("/cache/9/2/4/5/7/92457e7b6859d855253152084f1d6ac1bae3fd24.jpeg")
              .headers(headersUC13_0),
            http("request_39")
              .get("/cache/4/e/3/7/4/4e374acc137ad102b8238d4b3cf4eabdb4b77c29.png")
              .headers(headersUC13_0),
            http("request_40")
              .get("/cache/5/1/e/3/0/51e30c7b2e63f13d97e0701cf2f0446896bfc2f3.png")
              .headers(headersUC13_0),
            http("request_41")
              .get("/cache/8/2/9/7/2/82972024ef49f37480c04e108e7262b6a9a2b508.jpeg")
              .headers(headersUC13_0),
            http("request_42")
              .get("/cache/1/1/f/1/9/11f198e3c153294706800c40d0048c1d5cbdcf2a.jpeg")
              .headers(headersUC13_0),
            http("request_43")
              .get("/cache/1/9/7/4/f/1974f1befe50b9c48e53619d88082505c0143c2d.jpeg")
              .headers(headersUC13_0),
            http("request_44")
              .get("/cache/5/f/9/6/3/5f963b3042f145555e6fc8fae58497dcef919731.jpeg")
              .headers(headersUC13_0),
            http("request_45")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC13_0),
            http("request_46")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_47")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_48")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_49")
              .get("/party/view/kprf")
              .headers(headersUC13_49),
            http("request_50")
              .get("/cache/9/a/9/3/6/9a936d62f9c8e0bb6ba92966bbd9b9843bc6fd9b.jpeg")
              .headers(headersUC13_0),
            http("request_51")
              .get("/cache/3/c/c/7/1/3cc71325ea14d314ecde2859f19f56b0c9e5f5be.jpeg")
              .headers(headersUC13_0),
            http("request_52")
              .get("/cache/a/b/9/d/2/ab9d2cb50b67558fa07edecb67db3ce02f462a3b.jpeg")
              .headers(headersUC13_0),
            http("request_53")
              .get("/cache/3/f/d/2/d/3fd2d661121582944803ba094333c15f973e1be2.jpeg")
              .headers(headersUC13_0),
            http("request_54")
              .get("/cache/6/2/4/f/0/624f0e29e55d1ccb9bd66277a0d1206d93973b23.jpeg")
              .headers(headersUC13_0),
            http("request_55")
              .get("/cache/8/6/2/5/4/86254a7d8c72fa2b8cc07fb47010548152746851.jpeg")
              .headers(headersUC13_0),
            http("request_56")
              .get("/cache/d/a/8/5/8/da8588bec3051a685d6f53147cab321da45e13c6.jpeg")
              .headers(headersUC13_0),
            http("request_57")
              .get("/cache/a/4/4/e/6/a44e6a2681b634c0f0107fd201d2c594c2280d8b.jpeg")
              .headers(headersUC13_0),
            http("request_58")
              .get("/cache/8/3/a/0/3/83a0334607f2cd42833fb2c731bd6144e93fa0ee.jpeg")
              .headers(headersUC13_0),
            http("request_59")
              .get("/cache/1/4/6/5/0/14650f75b396152cc67b2e58aae4b0caad6a0138.jpeg")
              .headers(headersUC13_0),
            http("request_60")
              .get("/cache/b/b/2/6/9/bb269e4b384cf118b8b2e49f0a921067b78d484e.jpeg")
              .headers(headersUC13_0),
            http("request_61")
              .get("/cache/e/a/b/8/8/eab88c26ecf12083a408d684baca215f82815488.jpeg")
              .headers(headersUC13_0),
            http("request_62")
              .get("/cache/9/9/7/8/3/99783494aed4e68017e6ede5cc9a41512191de4e.png")
              .headers(headersUC13_0),
            http("request_63")
              .get("/cache/4/0/7/e/a/407ea411eac9304237fc18301b973e9d4b638b0f.jpeg")
              .headers(headersUC13_0),
            http("request_64")
              .get("/build/7255.871eb160.js")
              .headers(headersUC13_0),
            http("request_65")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC13_0),
            http("request_66")
              .get("/build/7729.67d87565.js")
              .headers(headersUC13_0),
            http("request_67")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC13_0),
            http("request_68")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC13_0),
            http("request_69")
              .get("/build/9154.f1370752.js")
              .headers(headersUC13_0),
            http("request_70")
              .get("/build/1676.2634f191.js")
              .headers(headersUC13_0),
            http("request_71")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC13_0),
            http("request_72")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC13_0),
            http("request_73")
              .get("/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC13_0),
            http("request_74")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC13_74),
            http("request_75")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkprf&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A938525320%3Az%3A300%3Ai%3A20240823184612%3Aet%3A1724420772%3Ac%3A1%3Arn%3A41154201%3Arqn%3A63%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C585%2C%2C0%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724420771480%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724420772%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9A%D0%9F%D0%A0%D0%A4&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC13_75)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesKPRF);
  }
}
