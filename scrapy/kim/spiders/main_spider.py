import scrapy
from scrapy import FormRequest

from loginform import fill_login_form


class KimSpider(scrapy.Spider):
    name = "kim"
    prefix = 'http://kimdongjo.com/'
    start_urls = ['http://kimdongjo.com/bbs/login.php']
    password_key = 'PASSWORD'
    
    def after_login(self, response):
        if 'location.replace' in response.body:
            #print 'raw: %s' % res
            yield scrapy.Request(url='http://kimdongjo.com/bbs/board.php?bo_table=conditions', callback=self.parse_conditions)
            
    def parse_conditions(self, response):
        print 'conditions: %s' % response.body
        
            
            
        # urls = [
        #     '/bbs/board.php?bo_table=conditions',
        # ]
        # for url in urls:
        #     yield scrapy.Request(url=url, callback=self.parse)

    def parse(self, response):
        #print self.settings.attributes['PASSWORD']
        print self.settings.get(self.password_key)
        return FormRequest(self.prefix+'bbs/login_check.php',
                           formdata={'mb_id': 'nberserk', 'mb_password': self.settings.get(self.password_key)}, method='POST',
            callback=self.after_login
        )
        
