import scrapy
from scrapy import FormRequest

from loginform import fill_login_form


class QuotesSpider(scrapy.Spider):
    name = "quotes"

    login_url = "http://"

    def start_requests(self):
        yield scrapy.Request(self.login_url, self.parse_login)

    def parse_login(self, response):
        data, url, method = fill_login_form(response.url, response.body, "nberserk", "test")

        return FormRequest(url, formdata=dict(data), method=method, callback=self.start_crawl)

    def start_crawl(self, response):
        urls = [
            '/bbs/board.php?bo_table=conditions',
        ]
        for url in urls:
            yield scrapy.Request(url=url, callback=self.parse)

    def parse(self, response):
        page = response.url.split("/")[-2]
        filename = 'quotes-%s.html' % page
        with open(filename, 'wb') as f:
            f.write(response.body)
        self.log('Saved file %s' % filename)

