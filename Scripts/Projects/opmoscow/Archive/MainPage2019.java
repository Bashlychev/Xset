package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2019 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2019 = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC35_0 = new HashMap<>();
    headersUC35_0.put("accept", "*/*");
    headersUC35_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC35_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC35_0.put("content-type", "text/plain");
    headersUC35_0.put("origin", "https://shtab.opmoscow.ru");
    headersUC35_0.put("priority", "u=1, i");
    headersUC35_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC35_0.put("sec-ch-ua-mobile", "?0");
    headersUC35_0.put("sec-ch-ua-platform", "Linux");
    headersUC35_0.put("sec-fetch-dest", "empty");
    headersUC35_0.put("sec-fetch-mode", "cors");
    headersUC35_0.put("sec-fetch-site", "cross-site");
    headersUC35_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC35_2 = new HashMap<>();
    headersUC35_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC35_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC35_2.put("sec-ch-ua-mobile", "?0");
    headersUC35_2.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC35_59 = new HashMap<>();
    headersUC35_59.put("Upgrade-Insecure-Requests", "1");
    headersUC35_59.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC35_59.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC35_59.put("sec-ch-ua-mobile", "?0");
    headersUC35_59.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC35_60 = new HashMap<>();
    headersUC35_60.put("accept", "*/*");
    headersUC35_60.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC35_60.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC35_60.put("origin", "https://shtab.opmoscow.ru");
    headersUC35_60.put("priority", "u=1, i");
    headersUC35_60.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC35_60.put("sec-ch-ua-mobile", "?0");
    headersUC35_60.put("sec-ch-ua-platform", "Linux");
    headersUC35_60.put("sec-fetch-dest", "empty");
    headersUC35_60.put("sec-fetch-mode", "cors");
    headersUC35_60.put("sec-fetch-site", "cross-site");
    headersUC35_60.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC35_62 = new HashMap<>();
    headersUC35_62.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC35_62.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC35_62.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC35_62.put("priority", "u=0, i");
    headersUC35_62.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC35_62.put("sec-ch-ua-mobile", "?0");
    headersUC35_62.put("sec-ch-ua-platform", "Linux");
    headersUC35_62.put("sec-fetch-dest", "document");
    headersUC35_62.put("sec-fetch-mode", "navigate");
    headersUC35_62.put("sec-fetch-site", "same-origin");
    headersUC35_62.put("sec-fetch-user", "?1");
    headersUC35_62.put("upgrade-insecure-requests", "1");
    headersUC35_62.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC35_63 = new HashMap<>();
    headersUC35_63.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC35_63.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC35_63.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC35_63.put("priority", "i");
    headersUC35_63.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC35_63.put("sec-ch-ua-mobile", "?0");
    headersUC35_63.put("sec-ch-ua-platform", "Linux");
    headersUC35_63.put("sec-fetch-dest", "image");
    headersUC35_63.put("sec-fetch-mode", "no-cors");
    headersUC35_63.put("sec-fetch-site", "same-origin");
    headersUC35_63.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri2 = "https://shtab.opmoscow.ru";
    
    String uri3 = "https://i.ytimg.com/vi";

    ScenarioBuilder scnUC35 = scenario("Archive.MainPage2019")
      .exec(
        http("request_0")
          .post("/webvisor/89667203?wv-part=12&wv-type=7&wmode=0&wv-hit=19143757&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2019&rn=27055517&browser-info=we%3A1%3Aet%3A1724483890%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121810%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483890&t=gdpr(14)ti(1)")
          .headers(headersUC35_0)
          .body(RawFileBody("mainpage2019/0000_request.gif"))
          .resources(
            http("request_1")
              .post("/webvisor/89667203?wv-part=13&wv-type=7&wmode=0&wv-hit=19143757&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2019&rn=709908498&browser-info=we%3A1%3Aet%3A1724483892%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824121812%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724483892&t=gdpr(14)ti(1)")
              .headers(headersUC35_0)
              .body(RawFileBody("mainpage2019/0001_request.gif")),
            http("request_2")
              .get(uri2 + "/build/5758.f38a32ed.css")
              .headers(headersUC35_2),
            http("request_3")
              .get(uri2 + "/build/6395.76430bbc.css")
              .headers(headersUC35_2),
            http("request_4")
              .get(uri2 + "/build/8886.31d6cfe0.css")
              .headers(headersUC35_2),
            http("request_5")
              .get(uri2 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC35_2),
            http("request_6")
              .get(uri2 + "/build/runtime.aaa04269.js")
              .headers(headersUC35_2),
            http("request_7")
              .get(uri2 + "/build/9755.89d0240d.js")
              .headers(headersUC35_2),
            http("request_8")
              .get(uri2 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC35_2),
            http("request_9")
              .get(uri2 + "/uploads/media/default/0001/17/a9f08740e44e723c62455552ad70d5a29736033a.png")
              .headers(headersUC35_2),
            http("request_10")
              .get(uri2 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC35_2),
            http("request_11")
              .get("/metrika/tag.js")
              .headers(headersUC35_2),
            http("request_12")
              .get(uri2 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_13")
              .get(uri2 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_14")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_15")
              .get(uri2 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_16")
              .get(uri2 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_17")
              .get(uri2 + "/build/fonts/subset-Montserrat-SemiBoldItalic.89c710ac.woff2"),
            http("request_18")
              .get(uri2 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
              .headers(headersUC35_2),
            http("request_19")
              .get(uri2 + "/cache/c/0/e/8/e/c0e8e6e74dc69b3706ccc519bd2e0cae360403a5.jpeg")
              .headers(headersUC35_2),
            http("request_20")
              .get(uri2 + "/cache/b/e/6/c/0/be6c0c0599be356d9e6d5b566a9bf3f96380b6f9.jpeg")
              .headers(headersUC35_2),
            http("request_21")
              .get(uri2 + "/cache/e/7/f/4/8/e7f4857e99246f842891e456a21e31672b30de0e.jpeg")
              .headers(headersUC35_2),
            http("request_22")
              .get(uri2 + "/cache/2/a/e/d/7/2aed74619e97da0bdc2987954df66fdd80ac13ef.jpeg")
              .headers(headersUC35_2),
            http("request_23")
              .get(uri2 + "/cache/f/8/3/5/8/f8358e4a8a1c1b12101d887f07e54f1e58152999.jpeg")
              .headers(headersUC35_2),
            http("request_24")
              .get(uri2 + "/cache/6/c/f/b/5/6cfb5516545927d800cd05e651adccfd335565c6.jpeg")
              .headers(headersUC35_2),
            http("request_25")
              .get(uri2 + "/cache/9/7/9/9/5/97995a1ebdd93576d5e9394884a4402bf9718fb0.jpeg")
              .headers(headersUC35_2),
            http("request_26")
              .get(uri2 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
              .headers(headersUC35_2),
            http("request_27")
              .get(uri2 + "/cache/b/d/a/8/d/bda8db27002e2f48a7139ee5393136409c3b6449.jpeg")
              .headers(headersUC35_2),
            http("request_28")
              .get(uri2 + "/cache/c/1/1/2/4/c11246b14a31b8b15c8b90ab8aa40c655a1f0120.jpeg")
              .headers(headersUC35_2),
            http("request_29")
              .get(uri2 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
              .headers(headersUC35_2),
            http("request_30")
              .get(uri2 + "/cache/5/d/8/b/4/5d8b459c957892049aea3f9cd74bb67735866f14.jpeg")
              .headers(headersUC35_2),
            http("request_31")
              .get(uri2 + "/cache/b/a/a/4/4/baa4453821a5b1193a55ce7e2a52a67aaa7cdcfd.jpeg")
              .headers(headersUC35_2),
            http("request_32")
              .get(uri2 + "/cache/6/a/1/2/e/6a12e845c5d7568c00fb3a919ec66a4cfcb72b4a.jpeg")
              .headers(headersUC35_2),
            http("request_33")
              .get(uri2 + "/cache/e/6/b/0/f/e6b0faa07d42e00e2d6ade0fa3ef47a2b4740556.jpeg")
              .headers(headersUC35_2),
            http("request_34")
              .get(uri2 + "/cache/6/0/5/9/1/605919dba069b49985cfd9e7c10246c0dc5f7a64.jpeg")
              .headers(headersUC35_2),
            http("request_35")
              .get(uri2 + "/cache/7/e/a/4/1/7ea41dd2b53562254228313797f5083d044c4fc2.jpeg")
              .headers(headersUC35_2),
            http("request_36")
              .get(uri2 + "/cache/c/3/8/d/5/c38d546474ab2ee1fbfcc0434b77a6b9350c2842.jpeg")
              .headers(headersUC35_2),
            http("request_37")
              .get(uri2 + "/cache/3/5/0/8/6/350862a929899f1abe85690ec1affdd014a3493d.jpeg")
              .headers(headersUC35_2),
            http("request_38")
              .get(uri2 + "/cache/4/2/5/0/6/425067c3f4e28f05f1b944d87b93e7e2b65eb1ae.jpeg")
              .headers(headersUC35_2),
            http("request_39")
              .get(uri2 + "/cache/9/c/2/9/4/9c29432ea84ecacf44c09ee325ecd616327cec6b.jpeg")
              .headers(headersUC35_2),
            http("request_40")
              .get(uri2 + "/cache/e/f/9/9/a/ef99afe299deb5cb5dcacd1071ebabd56b789390.jpeg")
              .headers(headersUC35_2),
            http("request_41")
              .get(uri2 + "/cache/b/0/1/8/1/b01813f0e98cd4c5e5175089c5618cbe8691fb6f.jpeg")
              .headers(headersUC35_2),
            http("request_42")
              .get(uri2 + "/cache/2/1/b/c/7/21bc7f4be7745598d6d7c2dbb1589386a573b241.jpeg")
              .headers(headersUC35_2),
            http("request_43")
              .get(uri2 + "/cache/b/b/8/5/4/bb854687ec663e4c19824c32d3f0f29c5dea9a81.jpeg")
              .headers(headersUC35_2),
            http("request_44")
              .get(uri2 + "/cache/2/a/0/0/9/2a0099db1c558badd213779d6fe5507c2af4ae80.jpeg")
              .headers(headersUC35_2),
            http("request_45")
              .get(uri2 + "/cache/9/7/7/8/b/9778b29cde67066d2e62211b378e6bb797b3040a.jpeg")
              .headers(headersUC35_2),
            http("request_46")
              .get(uri2 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
              .headers(headersUC35_2),
            http("request_47")
              .get(uri2 + "/cache/1/7/2/5/1/1725100e6a3f7292e0f7835462fc0d0a08b53462.jpeg")
              .headers(headersUC35_2),
            http("request_48")
              .get(uri2 + "/cache/6/5/7/5/c/6575c4f5a00d4f6b7306a8bd6570320bcb50fbdd.jpeg")
              .headers(headersUC35_2),
            http("request_49")
              .get(uri2 + "/cache/c/6/d/f/8/c6df89f4f9b41f2a7c4f8eec6d35d36e29db8540.jpeg")
              .headers(headersUC35_2),
            http("request_50")
              .get(uri2 + "/cache/1/e/2/1/a/1e21a13fa715a9bbbb4069acebd178273b386276.jpeg")
              .headers(headersUC35_2),
            http("request_51")
              .get(uri2 + "/cache/b/1/9/9/9/b1999d41fe4cd17dbba5b652fe3d476b5162b4e5.jpeg")
              .headers(headersUC35_2),
            http("request_52")
              .get(uri2 + "/cache/a/8/b/e/7/a8be77f4a7a1b28d9e60eb393f97343948effab9.jpeg")
              .headers(headersUC35_2),
            http("request_53")
              .get(uri2 + "/cache/e/f/e/8/f/efe8f5d05e03bc3df56113b06d2dda3910202015.jpeg")
              .headers(headersUC35_2),
            http("request_54")
              .get(uri2 + "/cache/4/9/3/2/4/49324bfceca6ae1ed91f00cf2075cdda2e114ca8.jpeg")
              .headers(headersUC35_2),
            http("request_55")
              .get(uri2 + "/cache/b/2/b/0/3/b2b0383b79563430710b777196362df59cc3b153.jpeg")
              .headers(headersUC35_2),
            http("request_56")
              .get(uri2 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC35_2),
            http("request_57")
              .get(uri2 + "/cache/3/4/3/9/2/343929eb5d18293f9c8a63c64702d07f047810d9.jpeg")
              .headers(headersUC35_2),
            http("request_58")
              .get(uri2 + "/cache/1/3/4/7/6/134762c8ed10eaa6379e484131c5e3ea7c6c27d0.jpeg")
              .headers(headersUC35_2),
            http("request_59")
              .get("/metrika/metrika_match.html")
              .headers(headersUC35_59),
            http("request_60")
              .get("/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2019&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2023&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A243537739%3Az%3A300%3Ai%3A20240824121812%3Aet%3A1724483893%3Ac%3A1%3Arn%3A159766152%3Arqn%3A207%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C1013%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724483891777%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724483893%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D1%8E%20%D0%B8%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%BE%D0%B2%D1%81%D0%BA%D0%BE%D0%B9%20%D0%B3%D0%BE%D1%80%D0%BE%D0%B4%D1%81%D0%BA%D0%BE%D0%B9%20%D0%94%D1%83%D0%BC%D1%8B%20VII%20%D1%81%D0%BE%D0%B7%D1%8B%D0%B2%D0%B0&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC35_60),
            http("request_61")
              .get(uri2 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC35_2),
            http("request_62")
              .get(uri2 + "/obshchestvennyy-shtab-po-vyboram-2019")
              .headers(headersUC35_62),
            http("request_63")
              .get(uri2 + "/cache/c/7/a/b/8/c7ab8abe318324bff599bd9eaf8263e7cca55403.jpeg")
              .headers(headersUC35_63),
            http("request_64")
              .get(uri2 + "/cache/9/a/b/d/2/9abd2ad313a8ef79d7a111471ff686d290efc9a4.jpeg")
              .headers(headersUC35_2),
            http("request_65")
              .get(uri2 + "/cache/7/f/8/1/4/7f8143fd077f8f63d71d128ba65b9dafd1007171.jpeg")
              .headers(headersUC35_2),
            http("request_66")
              .get(uri2 + "/cache/f/1/3/b/a/f13bae185e369c0ef79fb92b02a07deba2830c0d.jpeg")
              .headers(headersUC35_2),
            http("request_67")
              .get(uri2 + "/cache/1/9/4/6/f/1946fd1fe760357a5707221a3b575cfe9cd27c54.jpeg")
              .headers(headersUC35_2),
            http("request_68")
              .get(uri2 + "/build/7255.871eb160.js")
              .headers(headersUC35_2),
            http("request_69")
              .get(uri2 + "/build/6889.3f713c69.js")
              .headers(headersUC35_2),
            http("request_70")
              .get(uri2 + "/build/7729.67d87565.js")
              .headers(headersUC35_2),
            http("request_71")
              .get(uri2 + "/build/8981.bc50772a.js")
              .headers(headersUC35_2),
            http("request_72")
              .get(uri2 + "/build/3734.2c5e1582.js")
              .headers(headersUC35_2),
            http("request_73")
              .get(uri2 + "/build/9154.f1370752.js")
              .headers(headersUC35_2),
            http("request_74")
              .get(uri2 + "/build/1676.2634f191.js")
              .headers(headersUC35_2),
            http("request_75")
              .get(uri2 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC35_2),
            http("request_76")
              .get(uri3 + "/x7PnBBEfkU4/hqdefault.jpg")
              .headers(headersUC35_2),
            http("request_77")
              .get(uri3 + "/bQ2MGfmeE4g/hqdefault.jpg")
              .headers(headersUC35_2),
            http("request_78")
              .get(uri3 + "/1Ah5en_cV_k/hqdefault.jpg")
              .headers(headersUC35_2),
            http("request_79")
              .get(uri2 + "/cache/e/2/9/d/3/e29d3cd8c44804e216a35c556eecf2f6a8c1c04a.jpeg")
              .headers(headersUC35_2),
            http("request_80")
              .get(uri2 + "/cache/f/f/8/c/d/ff8cdeaecbb4ad6ae0992e744056e2a9a519c704.jpeg")
              .headers(headersUC35_2),
            http("request_81")
              .get(uri2 + "/cache/8/1/a/9/2/81a92e728b8ce56ae74f04ed04ffbfd12394946f.jpeg")
              .headers(headersUC35_2),
            http("request_82")
              .get(uri2 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC35_2)
          )
      );

	  setUp(scnUC35.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2019);
  }
}
