package Y2024;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class CandidatesLDPR extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_CandidatesLDPR = http
      .baseUrl("https://shtab.opmoscow.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC16_0 = new HashMap<>();
    headersUC16_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC16_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC16_0.put("sec-ch-ua-mobile", "?0");
    headersUC16_0.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC16_45 = new HashMap<>();
    headersUC16_45.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC16_45.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC16_45.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC16_45.put("priority", "u=0, i");
    headersUC16_45.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC16_45.put("sec-ch-ua-mobile", "?0");
    headersUC16_45.put("sec-ch-ua-platform", "Linux");
    headersUC16_45.put("sec-fetch-dest", "document");
    headersUC16_45.put("sec-fetch-mode", "navigate");
    headersUC16_45.put("sec-fetch-site", "same-origin");
    headersUC16_45.put("sec-fetch-user", "?1");
    headersUC16_45.put("upgrade-insecure-requests", "1");
    headersUC16_45.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC16_66 = new HashMap<>();
    headersUC16_66.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC16_66.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC16_66.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC16_66.put("priority", "i");
    headersUC16_66.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC16_66.put("sec-ch-ua-mobile", "?0");
    headersUC16_66.put("sec-ch-ua-platform", "Linux");
    headersUC16_66.put("sec-fetch-dest", "image");
    headersUC16_66.put("sec-fetch-mode", "no-cors");
    headersUC16_66.put("sec-fetch-site", "same-origin");
    headersUC16_66.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC16_70 = new HashMap<>();
    headersUC16_70.put("Upgrade-Insecure-Requests", "1");
    headersUC16_70.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC16_70.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC16_70.put("sec-ch-ua-mobile", "?0");
    headersUC16_70.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC16_74 = new HashMap<>();
    headersUC16_74.put("accept", "*/*");
    headersUC16_74.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC16_74.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC16_74.put("origin", "https://shtab.opmoscow.ru");
    headersUC16_74.put("priority", "u=1, i");
    headersUC16_74.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC16_74.put("sec-ch-ua-mobile", "?0");
    headersUC16_74.put("sec-ch-ua-platform", "Linux");
    headersUC16_74.put("sec-fetch-dest", "empty");
    headersUC16_74.put("sec-fetch-mode", "cors");
    headersUC16_74.put("sec-fetch-site", "cross-site");
    headersUC16_74.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri1 = "https://mc.yandex.ru";

    ScenarioBuilder scnUC16 = scenario("Y2024.CandidatesLDPR")
      .exec(
        http("request_0")
          .get("/build/5758.f38a32ed.css")
          .headers(headersUC16_0)
          .resources(
            http("request_1")
              .get("/build/6395.76430bbc.css")
              .headers(headersUC16_0),
            http("request_2")
              .get("/build/8886.31d6cfe0.css")
              .headers(headersUC16_0),
            http("request_3")
              .get("/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC16_0),
            http("request_4")
              .get("/build/runtime.aaa04269.js")
              .headers(headersUC16_0),
            http("request_5")
              .get("/build/9755.89d0240d.js")
              .headers(headersUC16_0),
            http("request_6")
              .get("/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC16_0),
            http("request_7")
              .get("/uploads/media/default/0002/72/b82c6b9232be05330d6d61c58a53100e9a78f81d.png")
              .headers(headersUC16_0),
            http("request_8")
              .get("/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC16_0),
            http("request_9")
              .get("/cache/f/c/e/b/6/fceb652d4b4aed86e4b7baf387f1da74ddde1e79.jpeg")
              .headers(headersUC16_0),
            http("request_10")
              .get("/cache/6/c/3/b/4/6c3b4ab4c8aa8746a2a4855e03a2bd15c60c4ce3.jpeg")
              .headers(headersUC16_0),
            http("request_11")
              .get("/cache/5/1/f/e/a/51feafea52abd4cd4d5428a70731f95720eccb9b.png")
              .headers(headersUC16_0),
            http("request_12")
              .get("/cache/f/7/9/6/d/f796dd12f583c524e35df7e2541fea9a0dcc8763.jpeg")
              .headers(headersUC16_0),
            http("request_13")
              .get("/cache/4/4/2/a/f/442af39a0353822e89f8751c1435be9e8d40753b.jpeg")
              .headers(headersUC16_0),
            http("request_14")
              .get("/cache/d/a/a/e/1/daae1d18bec766a897a5c77db1ae254661c737ec.jpeg")
              .headers(headersUC16_0),
            http("request_15")
              .get("/cache/c/2/e/2/a/c2e2ab4c04d799e96be1098062c00129a2dbf7a6.jpeg")
              .headers(headersUC16_0),
            http("request_16")
              .get("/cache/a/3/9/c/e/a39ce9aa3137b8e066a478a8ac1d14dfedcb2de3.jpeg")
              .headers(headersUC16_0),
            http("request_17")
              .get("/cache/9/3/7/e/5/937e57a0faf748efde1edee4da69c8795ab17752.jpeg")
              .headers(headersUC16_0),
            http("request_18")
              .get("/cache/0/0/c/5/7/00c5762c7c6851f580125a2223e0db22f55e0f0b.jpeg")
              .headers(headersUC16_0),
            http("request_19")
              .get("/cache/d/1/9/0/e/d190e339d90b2b3c01ad8f807f9edfdb461dc054.jpeg")
              .headers(headersUC16_0),
            http("request_20")
              .get("/cache/d/e/9/f/f/de9ff9d3136aac5505b09e6b823ac2110f417c76.png")
              .headers(headersUC16_0),
            http("request_21")
              .get("/cache/6/d/3/5/2/6d352fddfa485861905c4c8bebc587c4385e3f9b.jpeg")
              .headers(headersUC16_0),
            http("request_22")
              .get("/cache/e/b/0/9/7/eb09736a423c1b59c2ff6759c4dbbd42ce5d2853.png")
              .headers(headersUC16_0),
            http("request_23")
              .get("/cache/b/6/7/9/6/b6796c8ad829660569e5d40eef50e728bef734ad.jpeg")
              .headers(headersUC16_0),
            http("request_24")
              .get("/cache/6/b/7/5/a/6b75a534b4e05922e30b2484374c736467a1e33c.jpeg")
              .headers(headersUC16_0),
            http("request_25")
              .get("/cache/d/1/c/2/c/d1c2c90f951e81ef3edf31f59c00ba7b622bc53a.jpeg")
              .headers(headersUC16_0),
            http("request_26")
              .get("/cache/3/9/8/5/d/3985d385973dd34090f5cbd600eda6fe54809fe7.jpeg")
              .headers(headersUC16_0),
            http("request_27")
              .get("/cache/7/f/b/f/1/7fbf1e45c017476860042725871dbc99c1a24da4.jpeg")
              .headers(headersUC16_0),
            http("request_28")
              .get("/cache/1/a/f/1/2/1af12ef55a569ce2c3e7b352c9eb130f85f2ffc7.jpeg")
              .headers(headersUC16_0),
            http("request_29")
              .get("/cache/6/2/2/e/4/622e4968101dd0baae1e304a57cd64413d2838d8.jpeg")
              .headers(headersUC16_0),
            http("request_30")
              .get("/cache/8/9/1/8/1/89181ef4c300d15b551845b338050446f8dd7c76.jpeg")
              .headers(headersUC16_0),
            http("request_31")
              .get("/cache/1/d/0/4/b/1d04b98ae36ab2d142cb0ab8d6167459f768a4bb.jpeg")
              .headers(headersUC16_0),
            http("request_32")
              .get("/cache/3/5/3/9/a/3539a6f2371071f1193435ec353b2ee1316106e2.jpeg")
              .headers(headersUC16_0),
            http("request_33")
              .get("/cache/f/a/0/b/a/fa0babd10b2cacabe8398213a656aaa610c438c0.jpeg")
              .headers(headersUC16_0),
            http("request_34")
              .get("/cache/1/c/d/d/3/1cdd313658bffa460915af3d4478e3e56e201f84.jpeg")
              .headers(headersUC16_0),
            http("request_35")
              .get("/cache/4/7/e/5/1/47e513f33c6fda38b81a1d6944eabf1c3f42ef10.jpeg")
              .headers(headersUC16_0),
            http("request_36")
              .get("/cache/8/e/0/a/a/8e0aa877a106aab9947ddc13259b9648bfcf2296.jpeg")
              .headers(headersUC16_0),
            http("request_37")
              .get("/cache/1/f/1/b/0/1f1b0e6a121bbf9a8bc415e884b6c58442287afc.jpeg")
              .headers(headersUC16_0),
            http("request_38")
              .get("/cache/6/6/a/5/c/66a5cf64334ed9a8232ba13c50794be99fb593ae.jpeg")
              .headers(headersUC16_0),
            http("request_39")
              .get("/cache/7/9/0/0/f/7900fed3378f2edda839b5c37e11cb00f554a6fe.jpeg")
              .headers(headersUC16_0),
            http("request_40")
              .get("/cache/2/0/1/5/d/2015defcf94414a540419db1a7fc927bd0dbf7e4.jpeg")
              .headers(headersUC16_0),
            http("request_41")
              .get("/cache/5/7/e/c/b/57ecbb0366d96ed51fd7fd7be408588613ed9255.jpeg")
              .headers(headersUC16_0),
            http("request_42")
              .get("/cache/0/9/9/0/d/0990df123059a1ff0ce2988fd2848ba7dd480df5.jpeg")
              .headers(headersUC16_0),
            http("request_43")
              .get("/cache/a/5/d/1/4/a5d145acf2fdce274505d7bc64e397c7122927e3.jpeg")
              .headers(headersUC16_0),
            http("request_44")
              .get("/cache/1/b/c/1/2/1bc12f1877ad35707c9dc301666ac5c6ae881360.jpeg")
              .headers(headersUC16_0),
            http("request_45")
              .get("/party/view/ldpr")
              .headers(headersUC16_45),
            http("request_46")
              .get(uri1 + "/metrika/tag.js")
              .headers(headersUC16_0),
            http("request_47")
              .get("/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_48")
              .get("/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_49")
              .get("/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_50")
              .get("/cache/e/d/7/0/d/ed70d13a07e73720c0043d42f9c3c11030bbc549.jpeg")
              .headers(headersUC16_0),
            http("request_51")
              .get("/cache/a/4/1/b/d/a41bd973508442fac8f66e1baadcbbaa37442125.jpeg")
              .headers(headersUC16_0),
            http("request_52")
              .get("/cache/0/a/1/5/3/0a15371ca80dd85896eb3e4574227415451d8240.jpeg")
              .headers(headersUC16_0),
            http("request_53")
              .get("/cache/5/4/1/0/f/5410f363624ba3ba6ceb5610b2b7ff36d0bc65d1.jpeg")
              .headers(headersUC16_0),
            http("request_54")
              .get("/cache/8/2/6/5/c/8265c5ac35286dbcbc1cb33f07d4414cb0290b8b.jpeg")
              .headers(headersUC16_0),
            http("request_55")
              .get("/cache/1/b/4/0/8/1b4085061ccd7b3b3b116ad25cc32597d90f17f8.jpeg")
              .headers(headersUC16_0),
            http("request_56")
              .get("/cache/d/0/a/9/5/d0a9548f5e29a9bc768f59d672ddc6d5c6d2f17e.jpeg")
              .headers(headersUC16_0),
            http("request_57")
              .get("/cache/3/1/7/7/f/3177f30560f9f06c2e34fc80dc51795a0cf59125.png")
              .headers(headersUC16_0),
            http("request_58")
              .get("/build/7255.871eb160.js")
              .headers(headersUC16_0),
            http("request_59")
              .get("/build/6889.3f713c69.js")
              .headers(headersUC16_0),
            http("request_60")
              .get("/build/7729.67d87565.js")
              .headers(headersUC16_0),
            http("request_61")
              .get("/build/8981.bc50772a.js")
              .headers(headersUC16_0),
            http("request_62")
              .get("/build/3734.2c5e1582.js")
              .headers(headersUC16_0),
            http("request_63")
              .get("/build/9154.f1370752.js")
              .headers(headersUC16_0),
            http("request_64")
              .get("/build/1676.2634f191.js")
              .headers(headersUC16_0),
            http("request_65")
              .get("/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC16_0),
            http("request_66")
              .get("/cache/8/f/8/c/b/8f8cbc1ba7d61dbad84e6b47a01689750a3f7f79.jpeg")
              .headers(headersUC16_66),
            http("request_67")
              .get("/cache/8/f/a/e/b/8faebfa0c40b6ec064fd3e8badbba6f5d4ad685e.jpeg")
              .headers(headersUC16_66),
            http("request_68")
              .get("/cache/3/3/3/c/4/333c48746176859d57c4999a1a7418eadf2f3a1e.jpeg")
              .headers(headersUC16_66),
            http("request_69")
              .get("/cache/2/3/f/5/9/23f5956697cfffb798da360f6fd383320eb3f6aa.jpeg")
              .headers(headersUC16_66),
            http("request_70")
              .get(uri1 + "/metrika/metrika_match.html")
              .headers(headersUC16_70),
            http("request_71")
              .get("/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC16_0),
            http("request_72")
              .get("/cache/3/2/2/6/4/32264fb5764a25bd512653f957ca6760953b4eef.jpeg")
              .headers(headersUC16_66),
            http("request_73")
              .get("/cache/f/0/d/7/b/f0d7bdacbab63911ed072be33f13b98e0d8c33b8.jpeg")
              .headers(headersUC16_66),
            http("request_74")
              .get(uri1 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fldpr&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fparty%2Fview%2Fkommunisty-rossii&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A378890624%3Az%3A300%3Ai%3A20240823185005%3Aet%3A1724421005%3Ac%3A1%3Arn%3A379095546%3Arqn%3A69%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1302%2C23%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724421003782%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724421005%3At%3A%D0%9A%D0%B0%D0%BD%D0%B4%D0%B8%D0%B4%D0%B0%D1%82%D1%8B%20%D0%BE%D1%82%20%D0%BF%D0%B0%D1%80%D1%82%D0%B8%D0%B8%20%D0%9B%D0%94%D0%9F%D0%A0&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC16_74)
          )
      );

	  setUp(scnUC16.injectOpen(atOnceUsers(1))).protocols(httpProtocol_CandidatesLDPR);
  }
}
