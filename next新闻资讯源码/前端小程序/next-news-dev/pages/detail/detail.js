const app = getApp()

Page({

  data: {
    newsDetail: {},
    // content: "<p>三比罗嘎东岸脚下蜥脚类恐龙行进足迹。</p><img src='http://itzixi.com:88/group1/M00/00/03/CpoxxFwIveWAQLilAAPyhJ1D2Ys477.png' style='width:100%;'><p>新发现的三比罗嘎东岸岩壁上多种类恐龙足迹分布点。</p><p>JEEP品牌首辆七座SUV大指挥官于4月17日正式上市，这是一辆国内特供车型，也就是说全球只有中国地区销售。大指挥官指导价27.98-40.98万，竞品车型为丰田汉兰达、福特锐界、以及大众途昂等</p><img src='http://itzixi.com:88/group1/M00/00/02/CpoxxFwE7k-ANI2kAAReVsBN3Kw664.png' style='width:100%;'><p>全国首批大指挥官实车到店后，讯哥在一个交流群里看到了一位车友询问广汽菲克4S店销售的回复截图，从销售回复的内容来看，大指挥官目前订车优惠3万起步，同时还有大礼包赠送，高配车型的最高优惠可达5万。不过具体的真实性还有待确认，不过这也预示着大指挥官未来的终端优惠巨大。而从外观来看，大指挥官有着Jeep家族式风格，不过前脸造型更加扁平宽大，气势非常足，而且两边LED大灯组与中网相连，一体感更强</p>"
  },

  onLoad(params) {
    var me = this;

    // debugger;
    var newsId = params.newsId;
    console.log("传递过来的新闻id为：" + newsId);

    wx.request({
      url: app.serverUrl + '/news/detail/' + newsId,
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        // console.log(res.data);
        var mydata = res.data;
        var status = mydata.status;
        if (status === 200) {
          var newsDetail = mydata.data;
          me.setData({
            newsDetail: newsDetail
          });
        }
      }
    })
  }
})