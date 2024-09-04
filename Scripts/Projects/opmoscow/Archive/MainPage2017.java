package Archive;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class MainPage2017 extends Simulation {

  {
    HttpProtocolBuilder httpProtocol_MainPage2017 = http
      .baseUrl("https://www.youtube.com")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headersUC41_0 = new HashMap<>();
    headersUC41_0.put("accept", "*/*");
    headersUC41_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_0.put("authorization", "SAPISIDHASH 1724484197_a02b56160a713046d9a3820f1f69c70018f5d60e");
    headersUC41_0.put("content-type", "application/json");
    headersUC41_0.put("origin", "https://www.youtube.com");
    headersUC41_0.put("priority", "u=1, i");
    headersUC41_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_0.put("sec-ch-ua-mobile", "?0");
    headersUC41_0.put("sec-ch-ua-platform", "Linux");
    headersUC41_0.put("sec-fetch-dest", "empty");
    headersUC41_0.put("sec-fetch-mode", "cors");
    headersUC41_0.put("sec-fetch-site", "same-origin");
    headersUC41_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_0.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_0.put("x-goog-authuser", "1");
    headersUC41_0.put("x-goog-event-time", "1724484197324");
    headersUC41_0.put("x-goog-request-time", "1724484197324");
    headersUC41_0.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSj9k6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC41_0.put("x-origin", "https://www.youtube.com");
    headersUC41_0.put("x-youtube-ad-signals", "dt=1724484101211&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKoEtvHyUSQH2Ey_SVMg1XpqTpgMfQznbKQB9ABTiTTbGFMAJgBNsP5Fp1Nw3wAhNPxtuNhY4pVbVXVhruePkG1Xa6NWuw");
    headersUC41_0.put("x-youtube-client-name", "56");
    headersUC41_0.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC41_0.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC41_0.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC41_1 = new HashMap<>();
    headersUC41_1.put("accept", "*/*");
    headersUC41_1.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_1.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_1.put("authorization", "SAPISIDHASH 1724484197_a02b56160a713046d9a3820f1f69c70018f5d60e");
    headersUC41_1.put("content-type", "application/json");
    headersUC41_1.put("origin", "https://www.youtube.com");
    headersUC41_1.put("priority", "u=1, i");
    headersUC41_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_1.put("sec-ch-ua-mobile", "?0");
    headersUC41_1.put("sec-ch-ua-platform", "Linux");
    headersUC41_1.put("sec-fetch-dest", "empty");
    headersUC41_1.put("sec-fetch-mode", "cors");
    headersUC41_1.put("sec-fetch-site", "same-origin");
    headersUC41_1.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_1.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_1.put("x-goog-authuser", "1");
    headersUC41_1.put("x-goog-event-time", "1724484197329");
    headersUC41_1.put("x-goog-request-time", "1724484197329");
    headersUC41_1.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSj9k6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC41_1.put("x-origin", "https://www.youtube.com");
    headersUC41_1.put("x-youtube-ad-signals", "dt=1724484098412&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C220&vis=1&wgl=true&ca_type=image&bid=ANyPxKoMy4ZZtHAg2pQqTbTwrE2PFQLB9mQz-aBomjWtfUyzmhozsMRLXe7MJFxjqw2H84l-3MHIydLhGB9wvhIu46CZBLBkJA");
    headersUC41_1.put("x-youtube-client-name", "56");
    headersUC41_1.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC41_1.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC41_1.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC41_2 = new HashMap<>();
    headersUC41_2.put("accept", "*/*");
    headersUC41_2.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_2.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_2.put("authorization", "SAPISIDHASH 1724484197_a02b56160a713046d9a3820f1f69c70018f5d60e");
    headersUC41_2.put("content-type", "application/json");
    headersUC41_2.put("origin", "https://www.youtube.com");
    headersUC41_2.put("priority", "u=1, i");
    headersUC41_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_2.put("sec-ch-ua-mobile", "?0");
    headersUC41_2.put("sec-ch-ua-platform", "Linux");
    headersUC41_2.put("sec-fetch-dest", "empty");
    headersUC41_2.put("sec-fetch-mode", "cors");
    headersUC41_2.put("sec-fetch-site", "same-origin");
    headersUC41_2.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_2.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_2.put("x-goog-authuser", "1");
    headersUC41_2.put("x-goog-event-time", "1724484197331");
    headersUC41_2.put("x-goog-request-time", "1724484197331");
    headersUC41_2.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSj9k6a2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC41_2.put("x-origin", "https://www.youtube.com");
    headersUC41_2.put("x-youtube-ad-signals", "dt=1724484101160&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKrkTa42P47ONLCL-e0kaDX60KNg4y8hvabfMEzoT2EkridKZaSaXcLzb4R_9d9x-ekOOusjEP310D_maQ-Dm-26ohQPag");
    headersUC41_2.put("x-youtube-client-name", "56");
    headersUC41_2.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC41_2.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC41_2.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC41_3 = new HashMap<>();
    headersUC41_3.put("accept", "*/*");
    headersUC41_3.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_3.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_3.put("content-type", "text/plain");
    headersUC41_3.put("origin", "https://shtab.opmoscow.ru");
    headersUC41_3.put("priority", "u=1, i");
    headersUC41_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_3.put("sec-ch-ua-mobile", "?0");
    headersUC41_3.put("sec-ch-ua-platform", "Linux");
    headersUC41_3.put("sec-fetch-dest", "empty");
    headersUC41_3.put("sec-fetch-mode", "cors");
    headersUC41_3.put("sec-fetch-site", "cross-site");
    headersUC41_3.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC41_4 = new HashMap<>();
    headersUC41_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_4.put("sec-ch-ua-mobile", "?0");
    headersUC41_4.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC41_70 = new HashMap<>();
    headersUC41_70.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC41_70.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_70.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_70.put("priority", "u=0, i");
    headersUC41_70.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_70.put("sec-ch-ua-mobile", "?0");
    headersUC41_70.put("sec-ch-ua-platform", "Linux");
    headersUC41_70.put("sec-fetch-dest", "document");
    headersUC41_70.put("sec-fetch-mode", "navigate");
    headersUC41_70.put("sec-fetch-site", "same-origin");
    headersUC41_70.put("sec-fetch-user", "?1");
    headersUC41_70.put("upgrade-insecure-requests", "1");
    headersUC41_70.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC41_72 = new HashMap<>();
    headersUC41_72.put("Origin", "https://www.youtube.com");
    headersUC41_72.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_72.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_72.put("sec-ch-ua-mobile", "?0");
    headersUC41_72.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC41_89 = new HashMap<>();
    headersUC41_89.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC41_89.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_89.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_89.put("priority", "i");
    headersUC41_89.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_89.put("sec-ch-ua-mobile", "?0");
    headersUC41_89.put("sec-ch-ua-platform", "Linux");
    headersUC41_89.put("sec-fetch-dest", "image");
    headersUC41_89.put("sec-fetch-mode", "no-cors");
    headersUC41_89.put("sec-fetch-site", "same-origin");
    headersUC41_89.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC41_100 = new HashMap<>();
    headersUC41_100.put("Upgrade-Insecure-Requests", "1");
    headersUC41_100.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_100.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_100.put("sec-ch-ua-mobile", "?0");
    headersUC41_100.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headersUC41_102 = new HashMap<>();
    headersUC41_102.put("accept", "*/*");
    headersUC41_102.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_102.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_102.put("origin", "https://shtab.opmoscow.ru");
    headersUC41_102.put("priority", "u=1, i");
    headersUC41_102.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_102.put("sec-ch-ua-mobile", "?0");
    headersUC41_102.put("sec-ch-ua-platform", "Linux");
    headersUC41_102.put("sec-fetch-dest", "empty");
    headersUC41_102.put("sec-fetch-mode", "cors");
    headersUC41_102.put("sec-fetch-site", "cross-site");
    headersUC41_102.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headersUC41_114 = new HashMap<>();
    headersUC41_114.put("accept", "*/*");
    headersUC41_114.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_114.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_114.put("origin", "https://www.youtube.com");
    headersUC41_114.put("priority", "u=1, i");
    headersUC41_114.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_114.put("sec-ch-ua-mobile", "?0");
    headersUC41_114.put("sec-ch-ua-platform", "Linux");
    headersUC41_114.put("sec-fetch-dest", "empty");
    headersUC41_114.put("sec-fetch-mode", "cors");
    headersUC41_114.put("sec-fetch-site", "cross-site");
    headersUC41_114.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_114.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC41_115 = new HashMap<>();
    headersUC41_115.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headersUC41_115.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_115.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_115.put("priority", "u=0, i");
    headersUC41_115.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_115.put("sec-ch-ua-mobile", "?0");
    headersUC41_115.put("sec-ch-ua-platform", "Linux");
    headersUC41_115.put("sec-fetch-dest", "iframe");
    headersUC41_115.put("sec-fetch-mode", "navigate");
    headersUC41_115.put("sec-fetch-site", "cross-site");
    headersUC41_115.put("upgrade-insecure-requests", "1");
    headersUC41_115.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_115.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC41_123 = new HashMap<>();
    headersUC41_123.put("accept", "*/*");
    headersUC41_123.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_123.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_123.put("content-type", "application/json+protobuf");
    headersUC41_123.put("origin", "https://www.youtube.com");
    headersUC41_123.put("priority", "u=1, i");
    headersUC41_123.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_123.put("sec-ch-ua-mobile", "?0");
    headersUC41_123.put("sec-ch-ua-platform", "Linux");
    headersUC41_123.put("sec-fetch-dest", "empty");
    headersUC41_123.put("sec-fetch-mode", "cors");
    headersUC41_123.put("sec-fetch-site", "cross-site");
    headersUC41_123.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_123.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_123.put("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw");
    headersUC41_123.put("x-user-agent", "grpc-web-javascript/0.1");
    
    Map<CharSequence, String> headersUC41_124 = new HashMap<>();
    headersUC41_124.put("accept", "*/*");
    headersUC41_124.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_124.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_124.put("authorization", "SAPISIDHASH 1d5b27c6a579a965f51cbd7d4693f8a3b7fc42cb");
    headersUC41_124.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
    headersUC41_124.put("origin", "https://www.youtube.com");
    headersUC41_124.put("priority", "u=1, i");
    headersUC41_124.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_124.put("sec-ch-ua-mobile", "?0");
    headersUC41_124.put("sec-ch-ua-platform", "Linux");
    headersUC41_124.put("sec-fetch-dest", "empty");
    headersUC41_124.put("sec-fetch-mode", "cors");
    headersUC41_124.put("sec-fetch-site", "cross-site");
    headersUC41_124.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_124.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_124.put("x-goog-authuser", "0");
    
    Map<CharSequence, String> headersUC41_150 = new HashMap<>();
    headersUC41_150.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headersUC41_150.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_150.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_150.put("priority", "i");
    headersUC41_150.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_150.put("sec-ch-ua-mobile", "?0");
    headersUC41_150.put("sec-ch-ua-platform", "Linux");
    headersUC41_150.put("sec-fetch-dest", "image");
    headersUC41_150.put("sec-fetch-mode", "no-cors");
    headersUC41_150.put("sec-fetch-site", "same-origin");
    headersUC41_150.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_150.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    
    Map<CharSequence, String> headersUC41_170 = new HashMap<>();
    headersUC41_170.put("accept", "*/*");
    headersUC41_170.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_170.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_170.put("authorization", "SAPISIDHASH 1724484209_d7722aa2b4750b2f1195725aef4dea8f8294c442");
    headersUC41_170.put("content-type", "application/json");
    headersUC41_170.put("origin", "https://www.youtube.com");
    headersUC41_170.put("priority", "u=1, i");
    headersUC41_170.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_170.put("sec-ch-ua-mobile", "?0");
    headersUC41_170.put("sec-ch-ua-platform", "Linux");
    headersUC41_170.put("sec-fetch-dest", "empty");
    headersUC41_170.put("sec-fetch-mode", "cors");
    headersUC41_170.put("sec-fetch-site", "same-origin");
    headersUC41_170.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_170.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_170.put("x-goog-authuser", "1");
    headersUC41_170.put("x-goog-event-time", "1724484209524");
    headersUC41_170.put("x-goog-request-time", "1724484209524");
    headersUC41_170.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjolKa2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC41_170.put("x-origin", "https://www.youtube.com");
    headersUC41_170.put("x-youtube-ad-signals", "dt=1724484206591&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKqUV6ROjJJ2I952DAejwbgOz_iNiTNPpVCye95aELDHG52XKInr42h3RgHlvImdAEvDzPwSpLppXF_FnJiv17PJJVXVmw");
    headersUC41_170.put("x-youtube-client-name", "56");
    headersUC41_170.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC41_170.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC41_170.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC41_171 = new HashMap<>();
    headersUC41_171.put("accept", "*/*");
    headersUC41_171.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_171.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_171.put("authorization", "SAPISIDHASH 1724484210_e9b8cd15b6e289409ff51ddccf17ddac6202a39d");
    headersUC41_171.put("content-type", "application/json");
    headersUC41_171.put("origin", "https://www.youtube.com");
    headersUC41_171.put("priority", "u=1, i");
    headersUC41_171.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_171.put("sec-ch-ua-mobile", "?0");
    headersUC41_171.put("sec-ch-ua-platform", "Linux");
    headersUC41_171.put("sec-fetch-dest", "empty");
    headersUC41_171.put("sec-fetch-mode", "cors");
    headersUC41_171.put("sec-fetch-site", "same-origin");
    headersUC41_171.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_171.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_171.put("x-goog-authuser", "1");
    headersUC41_171.put("x-goog-event-time", "1724484210521");
    headersUC41_171.put("x-goog-request-time", "1724484210522");
    headersUC41_171.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjolKa2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC41_171.put("x-origin", "https://www.youtube.com");
    headersUC41_171.put("x-youtube-ad-signals", "dt=1724484207872&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C230&vis=1&wgl=true&ca_type=image&bid=ANyPxKprT68nKQbhT1tguclCe0JH_0ZExp2KsY4IHd1Wh4XhrtDP-uVCeo1gzA5opbXSeIv8zskkeVnOXJLA6uOiB0uH6UAOeQ");
    headersUC41_171.put("x-youtube-client-name", "56");
    headersUC41_171.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC41_171.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC41_171.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC41_172 = new HashMap<>();
    headersUC41_172.put("accept", "*/*");
    headersUC41_172.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_172.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_172.put("authorization", "SAPISIDHASH 1724484211_f4de6ef71d754836e41a65a5a71a05cee0e5176f");
    headersUC41_172.put("content-type", "application/json");
    headersUC41_172.put("origin", "https://www.youtube.com");
    headersUC41_172.put("priority", "u=1, i");
    headersUC41_172.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_172.put("sec-ch-ua-mobile", "?0");
    headersUC41_172.put("sec-ch-ua-platform", "Linux");
    headersUC41_172.put("sec-fetch-dest", "empty");
    headersUC41_172.put("sec-fetch-mode", "cors");
    headersUC41_172.put("sec-fetch-site", "same-origin");
    headersUC41_172.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    headersUC41_172.put("x-client-data", "CIS2yQEIo7bJAQipncoBCMD7ygEIlaHLAQiHoM0BCLnIzQEY9snNAQ==");
    headersUC41_172.put("x-goog-authuser", "1");
    headersUC41_172.put("x-goog-event-time", "1724484211523");
    headersUC41_172.put("x-goog-request-time", "1724484211524");
    headersUC41_172.put("x-goog-visitor-id", "CgtjQ195YTlpZUhIWSjolKa2BjIKCgJSVRIEGgAgVQ%3D%3D");
    headersUC41_172.put("x-origin", "https://www.youtube.com");
    headersUC41_172.put("x-youtube-ad-signals", "dt=1724484208855&flash=0&frm=2&u_tz=300&u_his=1&u_h=1080&u_w=1920&u_ah=1048&u_aw=1920&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C32%2C0%2C32%2C1920%2C32%2C1920%2C1048%2C370%2C220&vis=1&wgl=true&ca_type=image&bid=ANyPxKpqUreNLtqTLMI5tRP8e8LvUcep1jc68InGJxBqisIb6krAAiXiG-uN0XAfUzhVS6o9O5ZBXeiZz58_Hlue2IFikJ1N8g");
    headersUC41_172.put("x-youtube-client-name", "56");
    headersUC41_172.put("x-youtube-client-version", "1.20240820.01.00");
    headersUC41_172.put("x-youtube-time-zone", "Asia/Tashkent");
    headersUC41_172.put("x-youtube-utc-offset", "300");
    
    Map<CharSequence, String> headersUC41_173 = new HashMap<>();
    headersUC41_173.put("accept", "*/*");
    headersUC41_173.put("accept-encoding", "gzip, deflate, br, zstd");
    headersUC41_173.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
    headersUC41_173.put("origin", "https://shtab.opmoscow.ru");
    headersUC41_173.put("priority", "u=4, i");
    headersUC41_173.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
    headersUC41_173.put("sec-ch-ua-mobile", "?0");
    headersUC41_173.put("sec-ch-ua-platform", "Linux");
    headersUC41_173.put("sec-fetch-dest", "empty");
    headersUC41_173.put("sec-fetch-mode", "no-cors");
    headersUC41_173.put("sec-fetch-site", "cross-site");
    headersUC41_173.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
    
    String uri01 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";
    
    String uri03 = "https://googleads.g.doubleclick.net/pagead/id";
    
    String uri04 = "https://www.google.com/js/th/JNHVvl2kSR9fjdF95zymQ6dEkKki6kBWa3TewZmiOS4.js";
    
    String uri05 = "https://fonts.gstatic.com/s/roboto/v18";
    
    String uri06 = "https://www.gstatic.com";
    
    String uri07 = "https://i.ytimg.com";
    
    String uri08 = "https://play.google.com/log";
    
    String uri09 = "https://static.doubleclick.net/instream/ad_status.js";
    
    String uri10 = "https://mc.yandex.ru";
    
    String uri11 = "https://yt3.ggpht.com/ytc/AIdro_mktnPA9QixCMMgHNNhLp7f-hVaD1rhcMEb01OjEmg=s68-c-k-c0x00ffffff-no-rj";
    
    String uri12 = "https://shtab.opmoscow.ru";

    ScenarioBuilder scnUC41 = scenario("Archive.MainPage2017")
      .exec(
        http("request_0")
          .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
          .headers(headersUC41_0)
          .body(RawFileBody("mainpage2017/0000_request.json"))
          .resources(
            http("request_1")
              .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headersUC41_1)
              .body(RawFileBody("mainpage2017/0001_request.json")),
            http("request_2")
              .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headersUC41_2)
              .body(RawFileBody("mainpage2017/0002_request.json")),
            http("request_3")
              .post(uri10 + "/webvisor/89667203?wv-part=3&wv-type=7&wmode=0&wv-hit=958389606&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2017&rn=828124826&browser-info=we%3A1%3Aet%3A1724484196%3Aw%3A1905x927%3Av%3A1410%3Az%3A300%3Ai%3A20240824122315%3Au%3A1724415537121602245%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724484196&t=gdpr(14)ti(1)")
              .headers(headersUC41_3)
              .body(RawFileBody("mainpage2017/0003_request.gif")),
            http("request_4")
              .get(uri12 + "/build/5758.f38a32ed.css")
              .headers(headersUC41_4),
            http("request_5")
              .get(uri12 + "/build/6395.76430bbc.css")
              .headers(headersUC41_4),
            http("request_6")
              .get(uri12 + "/build/8886.31d6cfe0.css")
              .headers(headersUC41_4),
            http("request_7")
              .get(uri12 + "/build/shtadopm_css_head.dfe3f750.css")
              .headers(headersUC41_4),
            http("request_8")
              .get(uri12 + "/build/runtime.aaa04269.js")
              .headers(headersUC41_4),
            http("request_9")
              .get(uri12 + "/build/9755.89d0240d.js")
              .headers(headersUC41_4),
            http("request_10")
              .get(uri12 + "/build/shtadopm_app_head.a800bb8d.js")
              .headers(headersUC41_4),
            http("request_11")
              .get(uri12 + "/uploads/media/default/0001/17/58c05bb485337c784f3cc6cac17428e948213050.png")
              .headers(headersUC41_4),
            http("request_12")
              .get(uri12 + "/build/images/shtadopm/menu-arrow.svg")
              .headers(headersUC41_4),
            http("request_13")
              .get(uri12 + "/cache/b/1/9/9/9/b1999d41fe4cd17dbba5b652fe3d476b5162b4e5.jpeg")
              .headers(headersUC41_4),
            http("request_14")
              .get(uri12 + "/cache/0/6/7/4/c/0674cb551940a2b3517fed859062de9f80a85eb4.jpeg")
              .headers(headersUC41_4),
            http("request_15")
              .get(uri12 + "/cache/1/0/f/7/4/10f74876981740667fe60f2413c7e098cac25fb7.jpeg")
              .headers(headersUC41_4),
            http("request_16")
              .get(uri12 + "/cache/9/c/0/5/7/9c0579092da48f670e8f09bb2464a2adca4f016c.jpeg")
              .headers(headersUC41_4),
            http("request_17")
              .get(uri12 + "/cache/6/b/c/6/5/6bc65df092650e751f4df776d31593b6b1a06379.jpeg")
              .headers(headersUC41_4),
            http("request_18")
              .get(uri12 + "/cache/e/a/0/d/f/ea0dff986d38d4fde789c16e7ccc9f5d784f570f.jpeg")
              .headers(headersUC41_4),
            http("request_19")
              .get(uri12 + "/cache/c/0/b/4/2/c0b42ed564857d29771776adfe9f5004c366890f.jpeg")
              .headers(headersUC41_4),
            http("request_20")
              .get(uri12 + "/cache/7/8/f/0/c/78f0c431a34bf4e5e98f264bf9359ac396a448ae.jpeg")
              .headers(headersUC41_4),
            http("request_21")
              .get(uri12 + "/cache/6/4/f/8/7/64f873aeec3fe8f808a39164cd36029c2e8cbd11.jpeg")
              .headers(headersUC41_4),
            http("request_22")
              .get(uri12 + "/cache/3/8/b/b/2/38bb2de8f5b15ce44eb2b67abd07a8d8320b8a4c.jpeg")
              .headers(headersUC41_4),
            http("request_23")
              .get(uri12 + "/cache/4/9/f/d/5/49fd588d87ca2f2994daaac19972f96b3cddd67f.jpeg")
              .headers(headersUC41_4),
            http("request_24")
              .get(uri12 + "/cache/c/1/1/2/4/c11246b14a31b8b15c8b90ab8aa40c655a1f0120.jpeg")
              .headers(headersUC41_4),
            http("request_25")
              .get(uri12 + "/cache/1/c/0/5/6/1c056c291a0ab490787ab146c21287346281f94e.jpeg")
              .headers(headersUC41_4),
            http("request_26")
              .get(uri12 + "/cache/9/6/9/2/2/9692280782531aef8b8ba418c90ec4f0effc5be5.jpeg")
              .headers(headersUC41_4),
            http("request_27")
              .get(uri12 + "/cache/b/1/e/6/3/b1e6349294a6faab03d90c7cd7cede2209ca3380.jpeg")
              .headers(headersUC41_4),
            http("request_28")
              .get(uri12 + "/cache/a/6/9/6/b/a696b7677997432e1e0c350f8c7d5f9549529fe2.jpeg")
              .headers(headersUC41_4),
            http("request_29")
              .get(uri12 + "/cache/b/5/0/3/7/b5037ea095062afd1bc7c5faf6da034ce984ccdb.jpeg")
              .headers(headersUC41_4),
            http("request_30")
              .get(uri12 + "/cache/a/a/3/3/1/aa331ba8755f7d011b952620065e69a56ec20e0c.jpeg")
              .headers(headersUC41_4),
            http("request_31")
              .get(uri12 + "/cache/a/b/f/3/5/abf353b22fb0332ceb5341bbaa7227e7c878b322.jpeg")
              .headers(headersUC41_4),
            http("request_32")
              .get(uri12 + "/cache/a/e/e/f/e/aeefec5a2aa80990aa28f356dc93c2768b356a07.jpeg")
              .headers(headersUC41_4),
            http("request_33")
              .get(uri12 + "/cache/3/0/1/b/f/301bfbb39d892f988da0750604e4dd499619c1c8.jpeg")
              .headers(headersUC41_4),
            http("request_34")
              .get(uri12 + "/cache/c/7/3/8/5/c7385bb8b930c02f3a75e3107cc8d875a8b91c27.jpeg")
              .headers(headersUC41_4),
            http("request_35")
              .get(uri12 + "/cache/6/f/0/c/6/6f0c640c9572d46b3ddb5c0610e26a1c2b4cb77d.jpeg")
              .headers(headersUC41_4),
            http("request_36")
              .get(uri12 + "/cache/0/c/5/2/2/0c52299a070cd5fab2900506283a573d0dae70a6.png")
              .headers(headersUC41_4),
            http("request_37")
              .get(uri12 + "/cache/5/b/f/3/b/5bf3baa05ab9f7d33599f3f3d42f1ea8ba9deb88.jpeg")
              .headers(headersUC41_4),
            http("request_38")
              .get(uri12 + "/cache/7/c/5/4/8/7c5487d4bcfa29837ee76f41f3573e90fc36321c.jpeg")
              .headers(headersUC41_4),
            http("request_39")
              .get(uri12 + "/cache/b/e/f/4/e/bef4e5a4f9f141432439b79a592c702c9089c3f1.jpeg")
              .headers(headersUC41_4),
            http("request_40")
              .get(uri12 + "/cache/9/7/7/8/b/9778b29cde67066d2e62211b378e6bb797b3040a.jpeg")
              .headers(headersUC41_4),
            http("request_41")
              .get(uri12 + "/cache/f/b/6/c/3/fb6c37537dc66818fbbb5c705f7f4aaf2cdba3b7.jpeg")
              .headers(headersUC41_4),
            http("request_42")
              .get(uri12 + "/cache/c/3/a/0/d/c3a0d5f69c55eeee80cae83bf86d6555ae928aaa.jpeg")
              .headers(headersUC41_4),
            http("request_43")
              .get(uri12 + "/cache/8/7/b/d/9/87bd9b31f80769cb48c7464bfbb84044913e68be.jpeg")
              .headers(headersUC41_4),
            http("request_44")
              .get(uri12 + "/cache/e/f/7/b/0/ef7b04dd45af93e32e85e1702ac91319d71d30d8.jpeg")
              .headers(headersUC41_4),
            http("request_45")
              .get(uri12 + "/cache/0/4/7/d/9/047d974f2f6138b0ec36f9c7bbc9a7dd931e79fb.jpeg")
              .headers(headersUC41_4),
            http("request_46")
              .get(uri12 + "/cache/4/f/c/7/3/4fc735b98fb78401dc1cbb07e5e70ff2ea027cf1.jpeg")
              .headers(headersUC41_4),
            http("request_47")
              .get(uri12 + "/cache/c/1/e/d/b/c1edbf7c533474477f7bdb0404e7189ddf7863f4.jpeg")
              .headers(headersUC41_4),
            http("request_48")
              .get(uri12 + "/cache/1/7/0/f/8/170f8dc8d8dd475268b102c275842ac0633828f5.jpeg")
              .headers(headersUC41_4),
            http("request_49")
              .get(uri12 + "/cache/2/d/a/9/c/2da9c27ba9e010d49523ad885b8952974e6e459c.jpeg")
              .headers(headersUC41_4),
            http("request_50")
              .get(uri12 + "/cache/0/f/9/5/1/0f951f83e542f5eae9a7351dba0fdb2cdce46bfd.jpeg")
              .headers(headersUC41_4),
            http("request_51")
              .get(uri12 + "/build/images/opmoscow/loading.svg")
              .headers(headersUC41_4),
            http("request_52")
              .get(uri12 + "/cache/a/3/0/8/c/a308c3fa596749a380b134a0073537cfe7d28956.jpeg")
              .headers(headersUC41_4),
            http("request_53")
              .get(uri10 + "/metrika/tag.js")
              .headers(headersUC41_4),
            http("request_54")
              .get(uri12 + "/build/fonts/subset-Montserrat-Medium.7994d51c.woff2"),
            http("request_55")
              .get(uri12 + "/build/fonts/subset-Montserrat-Italic.8fdd15c3.woff2"),
            http("request_56")
              .get(uri12 + "/build/fonts/subset-Montserrat-SemiBold.82fabb03.woff2"),
            http("request_57")
              .get(uri12 + "/build/fonts/subset-Montserrat-Bold.7d4b8bb6.woff2"),
            http("request_58")
              .get(uri12 + "/build/fonts/subset-Montserrat-Regular.84af6cfd.woff2"),
            http("request_59")
              .get(uri12 + "/uploads/media/default/0001/14/21a0648e5571656f7ed6e535085406fd062ad43e.jpeg")
              .headers(headersUC41_4),
            http("request_60")
              .get(uri12 + "/uploads/media/default/0001/14/12cce32e0c81de5b61a9be20e18be65a39c5319f.jpeg")
              .headers(headersUC41_4),
            http("request_61")
              .get(uri12 + "/uploads/media/default/0001/14/13b9c97ed6df8c329a58f7dba34c6d55d1657f21.jpeg")
              .headers(headersUC41_4),
            http("request_62")
              .get(uri12 + "/uploads/media/default/0001/14/3a67ff645b14b2520c5c6cbb52a2c39feb582ab1.jpeg")
              .headers(headersUC41_4),
            http("request_63")
              .get(uri12 + "/uploads/media/default/0001/14/38f5de17a7547e36480e4c7ecac2a890923cd164.jpeg")
              .headers(headersUC41_4),
            http("request_64")
              .get(uri12 + "/uploads/media/default/0001/14/a79023d36337aaf23a2daaf7aed618b750183a57.jpeg")
              .headers(headersUC41_4),
            http("request_65")
              .get(uri12 + "/uploads/media/default/0001/14/8410850754971c6f40ca52d62fbb7c81462ef02a.jpeg")
              .headers(headersUC41_4),
            http("request_66")
              .get(uri12 + "/uploads/media/default/0001/14/a4b610d71b701917f7df9a27eac5d47003008951.jpeg")
              .headers(headersUC41_4),
            http("request_67")
              .get(uri12 + "/uploads/media/default/0001/14/afc1488d6483d302d3022d24a3040f4c301b941c.jpeg")
              .headers(headersUC41_4),
            http("request_68")
              .get(uri12 + "/uploads/media/default/0001/14/eaecacc2e3514469430bce8a5df2315ce58c04fb.jpeg")
              .headers(headersUC41_4),
            http("request_69")
              .get(uri12 + "/uploads/media/default/0001/14/85da895e062e1fa2d56deb19ff4479b1a24f44de.jpeg")
              .headers(headersUC41_4),
            http("request_70")
              .get(uri12 + "/obshchestvennyy-shtab-po-vyboram-2017")
              .headers(headersUC41_70),
            http("request_71")
              .get("/s/player/a87a9450/www-player.css")
              .headers(headersUC41_4),
            http("request_72")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
              .headers(headersUC41_72),
            http("request_73")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
              .headers(headersUC41_72),
            http("request_74")
              .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
              .headers(headersUC41_72),
            http("request_75")
              .get(uri12 + "/cache/e/3/6/9/b/e369b498b60e0754cd536681ebf3938471f78592.jpeg")
              .headers(headersUC41_4),
            http("request_76")
              .get(uri12 + "/cache/2/2/3/8/3/223835c7242fa6462739b1306045c617fa66ea93.jpeg")
              .headers(headersUC41_4),
            http("request_77")
              .get(uri12 + "/cache/1/9/0/a/a/190aa09ba5213dd2154126951a9b50154ecac036.jpeg")
              .headers(headersUC41_4),
            http("request_78")
              .get(uri12 + "/build/7255.871eb160.js")
              .headers(headersUC41_4),
            http("request_79")
              .get(uri12 + "/build/6889.3f713c69.js")
              .headers(headersUC41_4),
            http("request_80")
              .get(uri12 + "/build/7729.67d87565.js")
              .headers(headersUC41_4),
            http("request_81")
              .get(uri12 + "/build/8981.bc50772a.js")
              .headers(headersUC41_4),
            http("request_82")
              .get(uri12 + "/build/3734.2c5e1582.js")
              .headers(headersUC41_4),
            http("request_83")
              .get(uri12 + "/build/9154.f1370752.js")
              .headers(headersUC41_4),
            http("request_84")
              .get(uri12 + "/build/1676.2634f191.js")
              .headers(headersUC41_4),
            http("request_85")
              .get(uri12 + "/build/shtadopm_app_footer.9745ecad.js")
              .headers(headersUC41_4),
            http("request_86")
              .get(uri12 + "/cache/b/6/0/c/5/b60c5db16ff89da5e31b0ab4881264fae089c101.jpeg")
              .headers(headersUC41_4),
            http("request_87")
              .get(uri12 + "/cache/3/a/5/9/d/3a59da649d92efc49cd8b6b6e8c2d0be6c711095.jpeg")
              .headers(headersUC41_4),
            http("request_88")
              .get(uri12 + "/cache/b/c/a/d/b/bcadbd1620342ccff834407886a34248ca57c756.jpeg")
              .headers(headersUC41_4),
            http("request_89")
              .get(uri12 + "/cache/e/d/8/c/3/ed8c32c3902c9bfc46659f76a5cb7bd2f4052fd8.jpeg")
              .headers(headersUC41_89),
            http("request_90")
              .get(uri07 + "/vi/xEW8LUxNzhA/hqdefault.jpg")
              .headers(headersUC41_4),
            http("request_91")
              .get(uri07 + "/vi/zU2JDBTKEKQ/hqdefault.jpg")
              .headers(headersUC41_4),
            http("request_92")
              .get(uri07 + "/vi/ZEusk9cwc9M/hqdefault.jpg")
              .headers(headersUC41_4),
            http("request_93")
              .get(uri12 + "/build/images/mCSB_buttons.5b35a39c.png"),
            http("request_94")
              .get(uri07 + "/vi/xEW8LUxNzhA/hqdefault.jpg")
              .headers(headersUC41_4),
            http("request_95")
              .get(uri07 + "/vi/zU2JDBTKEKQ/hqdefault.jpg")
              .headers(headersUC41_4),
            http("request_96")
              .get(uri12 + "/cache/b/6/0/c/5/b60c5db16ff89da5e31b0ab4881264fae089c101.jpeg")
              .headers(headersUC41_4),
            http("request_97")
              .get(uri12 + "/cache/3/a/5/9/d/3a59da649d92efc49cd8b6b6e8c2d0be6c711095.jpeg")
              .headers(headersUC41_4),
            http("request_98")
              .get(uri12 + "/cache/b/c/a/d/b/bcadbd1620342ccff834407886a34248ca57c756.jpeg")
              .headers(headersUC41_4),
            http("request_99")
              .get(uri07 + "/vi/ZEusk9cwc9M/hqdefault.jpg")
              .headers(headersUC41_4),
            http("request_100")
              .get(uri10 + "/metrika/metrika_match.html")
              .headers(headersUC41_100),
            http("request_101")
              .get(uri12 + "/build/images/shtadopm/favicon/site.webmanifest")
              .headers(headersUC41_4),
            http("request_102")
              .get(uri10 + "/watch/89667203?wmode=7&page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2017&page-ref=https%3A%2F%2Fshtab.opmoscow.ru%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A596516084%3Az%3A300%3Ai%3A20240824122319%3Aet%3A1724484199%3Ac%3A1%3Arn%3A849751862%3Arqn%3A215%3Au%3A1724415537121602245%3Aw%3A1920x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C1024%2C831%2C%2C11%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724484197323%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724484199%3At%3A%D0%9E%D0%B1%D1%89%D0%B5%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B9%20%D1%88%D1%82%D0%B0%D0%B1%20%D0%BF%D0%BE%20%D0%BD%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B7%D0%B0%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%B0%D0%BC%D0%B8%20%D0%BC%D1%83%D0%BD%D0%B8%D1%86%D0%B8%D0%BF%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D1%85%20%D0%B4%D0%B5%D0%BF%D1%83%D1%82%D0%B0%D1%82%D0%BE%D0%B2%202017&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
              .headers(headersUC41_102)
          )
      )
      .pause(4)
      .exec(
        http("request_103")
          .get("/s/player/a87a9450/www-player.css")
          .headers(headersUC41_4)
          .resources(
            http("request_104")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
              .headers(headersUC41_72),
            http("request_105")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
              .headers(headersUC41_72),
            http("request_106")
              .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
              .headers(headersUC41_72)
          )
      )
      .pause(1)
      .exec(
        http("request_107")
          .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
          .headers(headersUC41_4)
          .resources(
            http("request_108")
              .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
              .headers(headersUC41_4),
            http("request_109")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
              .headers(headersUC41_4),
            http("request_110")
              .get(uri09)
              .headers(headersUC41_4),
            http("request_111")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
              .headers(headersUC41_4),
            http("request_112")
              .get(uri04)
              .headers(headersUC41_4),
            http("request_113")
              .get(uri07 + "/vi_webp/L48ky9hkFcc/hqdefault.webp")
              .headers(headersUC41_4),
            http("request_114")
              .get(uri03)
              .headers(headersUC41_114),
            http("request_115")
              .get("/embed/L48ky9hkFcc")
              .headers(headersUC41_115),
            http("request_116")
              .get(uri11)
              .headers(headersUC41_4),
            http("request_117")
              .get("/s/player/a87a9450/www-player.css")
              .headers(headersUC41_4),
            http("request_118")
              .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
              .headers(headersUC41_4),
            http("request_119")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
              .headers(headersUC41_72),
            http("request_120")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
              .headers(headersUC41_72),
            http("request_121")
              .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
              .headers(headersUC41_72),
            http("request_122")
              .get(uri06 + "/eureka/clank/128/cast_sender.js")
              .headers(headersUC41_4),
            http("request_123")
              .post(uri01 + "/Create")
              .headers(headersUC41_123)
              .body(RawFileBody("mainpage2017/0123_request.dat")),
            http("request_124")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484207231\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,68.59999999962747]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484207232\"]", ""),
            http("request_125")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484207414\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,47.80000000074506]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.20000000018626451]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.40000000037252903]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,724.8999999994412]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484207414\"]"),
            http("request_126")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484207418\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.300000000745058]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484207418\"]"),
            http("request_127")
              .post(uri01 + "/GenerateIT")
              .headers(headersUC41_123)
              .body(RawFileBody("mainpage2017/0127_request.dat")),
            http("request_128")
              .get("/embed/BI07axwX9Qg")
              .headers(headersUC41_115),
            http("request_129")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
              .headers(headersUC41_4),
            http("request_130")
              .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
              .headers(headersUC41_4),
            http("request_131")
              .get("/s/player/a87a9450/www-player.css")
              .headers(headersUC41_4),
            http("request_132")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
              .headers(headersUC41_4),
            http("request_133")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu5mxKOzY.woff2")
              .headers(headersUC41_72),
            http("request_134")
              .get(uri05 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
              .headers(headersUC41_72),
            http("request_135")
              .get(uri05 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
              .headers(headersUC41_72),
            http("request_136")
              .get(uri09)
              .headers(headersUC41_4),
            http("request_137")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
              .headers(headersUC41_4),
            http("request_138")
              .get(uri04)
              .headers(headersUC41_4),
            http("request_139")
              .get(uri07 + "/vi_webp/BI07axwX9Qg/hqdefault.webp")
              .headers(headersUC41_4),
            http("request_140")
              .get(uri11)
              .headers(headersUC41_4),
            http("request_141")
              .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
              .headers(headersUC41_4),
            http("request_142")
              .get(uri06 + "/eureka/clank/128/cast_sender.js")
              .headers(headersUC41_4),
            http("request_143")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484208134\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,76]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484208135\"]", ""),
            http("request_144")
              .post(uri01 + "/Create")
              .headers(headersUC41_123)
              .body(RawFileBody("mainpage2017/0144_request.dat")),
            http("request_145")
              .get(uri03)
              .headers(headersUC41_114),
            http("request_146")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484208551\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,50.89999999944121]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.19999999925494194]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.7000000001862645]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,520.2000000001863]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484208551\"]"),
            http("request_147")
              .post(uri01 + "/GenerateIT")
              .headers(headersUC41_123)
              .body(RawFileBody("mainpage2017/0147_request.dat")),
            http("request_148")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484208554\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.099999999627471]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484208555\"]"),
            http("request_149")
              .get("/embed/OrNbE-V9hKU")
              .headers(headersUC41_115),
            http("request_150")
              .get("/generate_204?v_792A")
              .headers(headersUC41_150),
            http("request_151")
              .get("/generate_204?fsrU9Q")
              .headers(headersUC41_150),
            http("request_152")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/embed.js")
              .headers(headersUC41_4),
            http("request_153")
              .get("/s/player/a87a9450/www-embed-player.vflset/www-embed-player.js")
              .headers(headersUC41_4),
            http("request_154")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/base.js")
              .headers(headersUC41_4),
            http("request_155")
              .get(uri09)
              .headers(headersUC41_4),
            http("request_156")
              .get("/s/player/a87a9450/player_ias.vflset/en_US/remote.js")
              .headers(headersUC41_4),
            http("request_157")
              .get(uri04)
              .headers(headersUC41_4),
            http("request_158")
              .get(uri07 + "/vi_webp/OrNbE-V9hKU/hqdefault.webp")
              .headers(headersUC41_4),
            http("request_159")
              .get(uri11)
              .headers(headersUC41_4),
            http("request_160")
              .get(uri06 + "/cv/js/sender/v1/cast_sender.js")
              .headers(headersUC41_4),
            http("request_161")
              .get(uri06 + "/eureka/clank/128/cast_sender.js")
              .headers(headersUC41_4),
            http("request_162")
              .get(uri12 + "/build/images/shtadopm/favicon/favicon.ico")
              .headers(headersUC41_4),
            http("request_163")
              .get(uri03)
              .headers(headersUC41_114),
            http("request_164")
              .post(uri01 + "/Create")
              .headers(headersUC41_123)
              .body(RawFileBody("mainpage2017/0164_request.dat")),
            http("request_165")
              .get("/generate_204?Y10t3g")
              .headers(headersUC41_150),
            http("request_166")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,null,[1,0,0,0,0]]],1828,[[\"1724484209099\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"aGIf\\\"]],[null,87.5]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"aGIf\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484209100\"]", ""),
            http("request_167")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484209293\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fil\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,43.59999999962747]]]],[\\\"/client_streamz/bg/el\\\",null,[\\\"en\\\",\\\"bk\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0]],[[[\\\"q\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.09999999962747097]],[[[\\\"S\\\"],[\\\"\\\"],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,0.7000000001862645]]]],[\\\"/client_streamz/bg/wrl\\\",null,[\\\"mn\\\",\\\"ac\\\",\\\"sc\\\",\\\"rk\\\",\\\"mk\\\"],[[[[\\\"c\\\"],[null,1],[null,0],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[null,319.30000000074506]]]],[\\\"/client_streamz/bg/po/csc\\\",null,[\\\"cs\\\",\\\"rk\\\",\\\"mk\\\"],[[[[null,3],[\\\"HVXUKVy98PAjvWs7DkU0\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fic\\\",null,[\\\"ke\\\"],[[[[\\\"_\\\"]],[1]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,1]],\"1724484209293\"]"),
            http("request_168")
              .post(uri08 + "?format=json&hasfast=true&authuser=0")
              .headers(headersUC41_124)
              .formParam("[[1,null,null,null,null,null,null,null,null,null,[null,null,null,null,\"en\",null,\"27\",null,[[[\"Chromium\",\"128\"],[\"Not;A", "Brand\",\"24\"],[\"Google Chrome\",\"128\"]],0,\"Linux\",\"6.5.0\",\"x86\",\"\",\"128.0.6613.84\"],[1,0,0,0,0]]],1828,[[\"1724484209296\",null,null,null,null,null,null,\"[[[\\\"/client_streamz/bg/fsc\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[1]]]],[\\\"/client_streamz/bg/fsl\\\",null,[\\\"rk\\\",\\\"ke\\\"],[[[[\\\"\\\"],[\\\"_\\\"]],[null,2.5]]]]]]\",null,null,null,null,null,null,-18000,[null,null,null,\"[]\"],null,null,null,null,2]],\"1724484209297\"]"),
            http("request_169")
              .post(uri01 + "/GenerateIT")
              .headers(headersUC41_123)
              .body(RawFileBody("mainpage2017/0169_request.dat")),
            http("request_170")
              .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headersUC41_170)
              .body(RawFileBody("mainpage2017/0170_request.json")),
            http("request_171")
              .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headersUC41_171)
              .body(RawFileBody("mainpage2017/0171_request.json")),
            http("request_172")
              .post("/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
              .headers(headersUC41_172)
              .body(RawFileBody("mainpage2017/0172_request.json"))
          )
      )
      .pause(2)
      .exec(
        http("request_173")
          .post(uri10 + "/watch/89667203/1?page-url=https%3A%2F%2Fshtab.opmoscow.ru%2Fobshchestvennyy-shtab-po-vyboram-2017&charset=utf-8&hittoken=1724484200_cc4531ae653e4bcc81671785e7cc724039a76c90ae9bca0e7a90344927f3c224&browser-info=nb%3A1%3Acl%3A1372%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A153221606478%3Ahid%3A596516084%3Az%3A300%3Ai%3A20240824122334%3Aet%3A1724484214%3Ac%3A1%3Arn%3A442663224%3Arqn%3A216%3Au%3A1724415537121602245%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A2063%3Awv%3A2%3Ads%3A%2C%2C%2C482%2C%2C%2C%2C114%2C0%2C11671%2C11671%2C9%2C2465%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724484197323%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1724484214&t=gdpr(14)clc(0-0-0)rqnt(2)lt(26900)aw(1)rcm(0)cdl(na)eco(21037572)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ct%22%3A%5B%7B%22topic%22%3A15%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A57%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%2C%7B%22topic%22%3A126%2C%22version%22%3A%22chrome.2%3A2%3A5%22%7D%5D%7D%7D")
          .headers(headersUC41_173)
      );

	  setUp(scnUC41.injectOpen(atOnceUsers(1))).protocols(httpProtocol_MainPage2017);
  }
}
