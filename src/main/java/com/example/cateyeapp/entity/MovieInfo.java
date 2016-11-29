package com.example.cateyeapp.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/11/29.
 */

public class MovieInfo {

    /**
     * expires : 1800
     */

    private ControlBean control;
    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":false,"movies":[{"late":false,"cnms":0,"sn":0,"showInfo":"今天181家影院放映2244场","preSale":0,"vd":"","dir":"大卫·叶茨","star":"埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","cat":"冒险,奇幻,家庭","wish":130686,"3d":true,"pn":236,"img":"http://p0.meituan.net/165.220/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕","rt":"2016-11-25上映","scm":"神奇动物城，法师显超能","imax":true,"snum":89309,"showDate":"","src":"","dur":133,"nm":"神奇动物在哪里","time":"","id":248918},{"late":false,"cnms":0,"sn":0,"showInfo":"今天177家影院放映1048场","preSale":0,"vd":"","dir":"罗恩·克莱蒙兹,约翰·马斯克,唐·霍尔,克里斯·威廉姆斯","star":"奥伊伊·卡瓦略,道恩·强森,Rachel House","cat":"动画,动作,冒险","wish":42849,"3d":true,"pn":125,"img":"http://p1.meituan.net/165.220/movie/dd600d0f054b234402edc3a93cd21da7133550.jpeg","sc":9.2,"ver":"2D/3D/中国巨幕/全景声","rt":"2016-11-25上映","scm":"航海家后代，征程向大海","imax":false,"snum":27605,"showDate":"","src":"","dur":107,"nm":"海洋奇缘","time":"","id":246222},{"late":false,"cnms":0,"sn":0,"showInfo":"今天19家影院放映19场","preSale":1,"vd":"","dir":"罗伯特·泽米吉斯","star":"布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","cat":"爱情,动作,战争","wish":41671,"3d":false,"pn":192,"img":"http://p0.meituan.net/165.220/movie/9aa8a2df88d43ad08fbf0d1c6878bb5579675.jpg","sc":0,"ver":"2D/中国巨幕","rt":"本周三上映","scm":"夫妇皆仇敌，枕边藏杀机","imax":false,"snum":28454,"showDate":"","src":"","dur":124,"nm":"间谍同盟","time":"","id":346564},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"新海诚","star":"上白石萌音,神木隆之介,长泽雅美","cat":"剧情,爱情,动画","wish":248555,"3d":false,"pn":172,"img":"http://p0.meituan.net/165.220/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg","sc":0,"ver":"2D","rt":"本周五上映","scm":"寻君千里行，心系君之名","imax":false,"snum":16614,"showDate":"","src":"","dur":107,"nm":"你的名字。","time":"","id":344881},{"late":false,"cnms":0,"sn":0,"showInfo":"今天169家影院放映747场","preSale":0,"vd":"","dir":"林岭东,钱文锜","star":"吴彦祖,张孝全,张若昀","cat":"剧情,动作,悬疑","wish":29674,"3d":false,"pn":188,"img":"http://p0.meituan.net/165.220/movie/a4469e30fc41d262ad021d5dd0dd73aa767743.jpg","sc":7.1,"ver":"2D","rt":"2016-11-25上映","scm":"血清三路抢，大火吞真相","imax":false,"snum":19322,"showDate":"","src":"","dur":100,"nm":"冲天火","time":"","id":341529},{"late":false,"cnms":0,"sn":0,"showInfo":"今天170家影院放映694场","preSale":0,"vd":"","dir":"冯小刚","star":"范冰冰,郭涛,董成鹏","cat":"剧情,喜剧","wish":185572,"3d":false,"pn":211,"img":"http://p1.meituan.net/165.220/movie/8e5eabeadf237a10227a3124419410ef549583.jpg","sc":7.9,"ver":"2D/中国巨幕/全景声","rt":"2016-11-18上映","scm":"金莲戏中戏，官场局中局","imax":false,"snum":176968,"showDate":"","src":"","dur":140,"nm":"我不是潘金莲","time":"","id":341749},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"蒂姆·波顿","star":"伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","cat":"冒险,奇幻","wish":95974,"3d":true,"pn":107,"img":"http://p0.meituan.net/165.220/movie/eccf1862c4f30042a373a080acc18ccf9587819.jpeg","sc":0,"ver":"2D/3D/中国巨幕","rt":"本周五上映","scm":"异能桃花源，穿越时光圈","imax":false,"snum":1148,"showDate":"","src":"","dur":126,"nm":"佩小姐的奇幻城堡","time":"","id":246373},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"尔冬升","star":"林更新,何润东,蒋梦婕","cat":"剧情,动作,武侠","wish":93687,"3d":true,"pn":115,"img":"http://p0.meituan.net/165.220/movie/c3eaa8556346814f2a3a79ffef0924b4577174.jpg","sc":0,"ver":"3D/中国巨幕","rt":"本周五上映","scm":"冬升携老怪，千仗无一败","imax":false,"snum":1146,"showDate":"","src":"","dur":107,"nm":"三少爷的剑","time":"","id":79088},{"late":false,"cnms":0,"sn":0,"showInfo":"今天150家影院放映373场","preSale":0,"vd":"","dir":"静野孔文","star":"高山南,天海佑希,林原惠美","cat":"动画,悬疑","wish":43219,"3d":false,"pn":80,"img":"http://p0.meituan.net/165.220/movie/6742d5169d136a58a3b1ca2fd071e88c248086.jpg","sc":8.8,"ver":"2D","rt":"2016-11-25上映","scm":"美女有异瞳，黑暗再行动","imax":false,"snum":17805,"showDate":"","src":"","dur":112,"nm":"名侦探柯南：纯黑的恶梦","time":"","id":344073},{"late":false,"cnms":0,"sn":0,"showInfo":"今天113家影院放映292场","preSale":0,"vd":"","dir":"斯科特·德瑞克森","star":"本尼迪克特·康伯巴奇,切瓦特·埃加福特,瑞秋·麦克亚当斯","cat":"动作,冒险,奇幻","wish":205273,"3d":true,"pn":534,"img":"http://p1.meituan.net/165.220/movie/aa492b57443fc95a5b3b46c459d59e50898549.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-11-04上映","scm":"车祸手迟钝，修炼成神棍","imax":true,"snum":332857,"showDate":"","src":"","dur":115,"nm":"奇异博士","time":"","id":246124},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"宋啸","star":"陈赫,宋智孝,大卫·贝利","cat":"喜剧,动作,冒险","wish":40120,"3d":false,"pn":122,"img":"http://p0.meituan.net/165.220/movie/658b714699f37110db35e343474ccf12808915.png","sc":0,"ver":"2D/中国巨幕","rt":"本周五上映","scm":"中法韩跑男，为夺宝闯关","imax":false,"snum":1462,"showDate":"","src":"","dur":91,"nm":"超级快递","time":"","id":343866},{"late":false,"cnms":0,"sn":0,"showInfo":"今天92家影院放映172场","preSale":0,"vd":"","dir":"马侃","star":"高以翔,王水林,秦晓飞","cat":"喜剧,爱情","wish":40251,"3d":false,"pn":72,"img":"http://p0.meituan.net/165.220/movie/63df54245e2a87bcbe4d9f7a4ee496e6963165.jpg","sc":7.9,"ver":"2D","rt":"2016-11-25上映","scm":"身高有差距，恋爱零距离","imax":false,"snum":5411,"showDate":"","src":"","dur":91,"nm":"最萌身高差","time":"","id":345105},{"late":false,"cnms":0,"sn":0,"showInfo":"今天61家影院放映94场","preSale":0,"vd":"","dir":"陈兵","star":"安宰贤,安以轩,方中信","cat":"剧情,爱情","wish":20845,"3d":false,"pn":70,"img":"http://p1.meituan.net/165.220/movie/98d1eac6f63b475e1d937c19666029c4238607.jpg","sc":7.8,"ver":"2D","rt":"2016-11-25上映","scm":"处女爱处男，结局并不惨","imax":false,"snum":1425,"showDate":"","src":"","dur":90,"nm":"我是处女座","time":"","id":344437},{"late":false,"cnms":0,"sn":0,"showInfo":"今天68家影院放映80场","preSale":0,"vd":"","dir":"周广兴","star":"那威,倪新宇,陈美行","cat":"恐怖,惊悚,悬疑","wish":17215,"3d":false,"pn":33,"img":"http://p0.meituan.net/165.220/movie/b313dcb28fbd25fd116485ee9ada2737980656.jpeg","sc":3.7,"ver":"2D","rt":"2016-11-25上映","scm":"夫人突暴毙，地下藏玄机","imax":false,"snum":1887,"showDate":"","src":"","dur":89,"nm":"怨灵地下室","time":"","id":1182756},{"late":false,"cnms":0,"sn":0,"showInfo":"今天52家影院放映75场","preSale":0,"vd":"","dir":"林浩然","star":"陈妍希,杰克逊·拉斯波恩,成康","cat":"剧情,爱情,悬疑","wish":11823,"3d":false,"pn":39,"img":"http://p0.meituan.net/165.220/movie/501b866b4605b4933b1ebec67bc49da74245946.jpg","sc":7.4,"ver":"2D","rt":"2016-11-25上映","scm":"只是被车撞，生活却变样","imax":false,"snum":560,"showDate":"","src":"","dur":95,"nm":"夏威夷之恋","time":"","id":337195},{"late":false,"cnms":0,"sn":0,"showInfo":"今天37家影院放映65场","preSale":0,"vd":"","dir":"彼得·博格","star":"马克·沃尔伯格,吉娜·罗德里格兹,库尔特·拉塞尔","cat":"剧情,动作,灾难","wish":26131,"3d":false,"pn":228,"img":"http://p0.meituan.net/165.220/movie/c8d8a0a51af8da4489727296ebf2d548617916.jpg","sc":8.3,"ver":"2D/中国巨幕","rt":"2016-11-15上映","scm":"海上遇井喷，英勇救同伴","imax":false,"snum":30273,"showDate":"","src":"","dur":108,"nm":"深海浩劫","time":"","id":248675},{"late":false,"cnms":0,"sn":0,"showInfo":"今天27家影院放映58场","preSale":0,"vd":"","dir":"李安","star":"乔·阿尔文,克里斯汀·斯图尔特,加内特·赫德兰","cat":"剧情,战争","wish":33615,"3d":true,"pn":281,"img":"http://p0.meituan.net/165.220/movie/0469a4bbcf69d46357256bc100bed703787664.jpg","sc":8.3,"ver":"3D/中国巨幕","rt":"2016-11-11上映","scm":"半场无战事，少年初长时","imax":false,"snum":54426,"showDate":"","src":"","dur":113,"nm":"比利·林恩的中场战事","time":"","id":247736},{"late":false,"cnms":0,"sn":0,"showInfo":"今天18家影院放映36场","preSale":0,"vd":"","dir":"林超贤","star":"张涵予,彭于晏,冯文娟","cat":"动作,犯罪,剧情","wish":57407,"3d":false,"pn":296,"img":"http://p0.meituan.net/165.220/movie/8f8efcd7a8c3dbcbe13fe2cd855ea6a42750455.jpg","sc":9.3,"ver":"2D/中国巨幕","rt":"2016-09-30上映","scm":"商船藏毒品，冤屈难洗清","imax":false,"snum":819508,"showDate":"","src":"","dur":124,"nm":"湄公河行动","time":"","id":338391},{"late":false,"cnms":0,"sn":0,"showInfo":"今天20家影院放映36场","preSale":0,"vd":"","dir":"宫元宏彰","star":"田中真弓,大谷育江,冈村明美","cat":"动画,冒险","wish":118442,"3d":false,"pn":108,"img":"http://p0.meituan.net/165.220/movie/e17eb219908416b7ee3bf07c2dc295ac945415.jpg","sc":9.1,"ver":"2D","rt":"2016-11-11上映","scm":"热血海贼王，冒险新起航","imax":false,"snum":95406,"showDate":"","src":"","dur":121,"nm":"航海王之黄金城","time":"","id":344902},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"埃兰·克里维","star":"尼古拉斯·霍尔特,菲丽希缇·琼斯,Johny Mathew","cat":"动作,惊悚","wish":19636,"3d":true,"pn":90,"img":"http://p0.meituan.net/165.220/movie/394490e44943bebd375ffae1a7fe113e492426.jpg","sc":0,"ver":"2D/中国巨幕/3D","rt":"本周五上映","scm":"舍命战毒枭，为爱去狂飙","imax":false,"snum":88,"showDate":"","src":"","dur":88,"nm":"极速之巅","time":"","id":336835},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"李凯","star":"娄淇,杨凯迪,谢波","cat":"恐怖,惊悚,科幻","wish":6717,"3d":false,"pn":47,"img":"http://p1.meituan.net/165.220/movie/99b80de56746a9de620f08cb33bd21e15407178.jpg","sc":0,"ver":"2D","rt":"本周五上映","scm":"驴友去探险，误闯食人岛","imax":false,"snum":130,"showDate":"","src":"","dur":94,"nm":"食人岛","time":"","id":1132403},{"late":false,"cnms":0,"sn":0,"showInfo":"今天10家影院放映19场","preSale":0,"vd":"","dir":"马蒂亚斯·霍恩","star":"赵又廷,倪妮,尤赖亚·谢尔顿","cat":"动作,冒险,奇幻","wish":23294,"3d":true,"pn":212,"img":"http://p0.meituan.net/165.220/movie/c3cb7d5ec4d961c793bd812805a30bc4621134.jpg","sc":6.4,"ver":"2D/3D/中国巨幕","rt":"2016-11-18上映","scm":"异世来相逢，勇者得重生","imax":false,"snum":19199,"showDate":"","src":"","dur":108,"nm":"勇士之门","time":"","id":248637},{"late":false,"cnms":0,"sn":0,"showInfo":"今天7家影院放映10场","preSale":0,"vd":"","dir":"安兵基","star":"佟大为,陈妍希,吕云骢","cat":"剧情,喜剧,家庭","wish":39153,"3d":false,"pn":166,"img":"http://p1.meituan.net/165.220/movie/119fc2dd0b9c55001831e6fc5dd2a374115176.jpg","sc":8.3,"ver":"2D","rt":"2016-11-11上映","scm":"主播有点烦，儿孙太能缠","imax":false,"snum":36463,"showDate":"","src":"","dur":103,"nm":"外公芳龄38","time":"","id":342427},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","preSale":1,"vd":"","dir":"张末","star":"倪妮,霍建华,马苏","cat":"喜剧,爱情,奇幻","wish":90821,"3d":false,"pn":127,"img":"http://p0.meituan.net/165.220/movie/08b6b34f8a6144dfb385f64dd8adfc22619538.jpg","sc":0,"ver":"2D","rt":"下周五上映","scm":"哭成小笨蛋，笑回长大前","imax":false,"snum":1255,"showDate":"","src":"","dur":109,"nm":"28岁未成年","time":"","id":343413},{"late":false,"cnms":0,"sn":0,"showInfo":"今天7家影院放映9场","preSale":0,"vd":"","dir":"亚瑟·本扎昆","star":"凯文·亚当斯,让-保罗·卢弗,凡妮莎·吉德","cat":"喜剧,爱情","wish":19648,"3d":false,"pn":76,"img":"http://p1.meituan.net/165.220/movie/2d5fb108c7868e870daa1787cee484b7697168.jpg","sc":7.4,"ver":"2D","rt":"2016-11-18上映","scm":"穷人爱公主，神灯来帮助","imax":false,"snum":10869,"showDate":"","src":"","dur":101,"nm":"阿拉丁与神灯","time":"","id":346365},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","preSale":1,"vd":"","dir":"周隼","star":"胡歌,宋佳,颜卓灵","cat":"爱情,悬疑,犯罪","wish":30023,"3d":false,"pn":52,"img":"http://p0.meituan.net/165.220/movie/d4def49e4f1b238c939334f8915bd8ac829204.png","sc":0,"ver":"2D","rt":"下周五上映","scm":"绑架十二年，归家惹事端","imax":false,"snum":674,"showDate":"","src":"","dur":0,"nm":"那年夏天你去了哪里","time":"","id":1187526},{"late":false,"cnms":0,"sn":0,"showInfo":"今天6家影院放映8场","preSale":0,"vd":"","dir":"钟萱","star":"钟萱,温兆伦,刘宇珽","cat":"恐怖,惊悚,悬疑","wish":4173,"3d":false,"pn":47,"img":"http://p0.meituan.net/165.220/movie/0b5e98a4b7044cc7e445da18c460e104373854.jpg","sc":5.8,"ver":"2D","rt":"2016-11-18上映","scm":"神秘白云桥，阴阳交界处","imax":false,"snum":2333,"showDate":"","src":"","dur":94,"nm":"白云桥","time":"","id":1187417},{"late":false,"cnms":0,"sn":0,"showInfo":"今天5家影院放映8场","preSale":0,"vd":"","dir":"郭翔","star":"马德钟,王大治,刘力扬","cat":"剧情,喜剧,爱情","wish":3016,"3d":false,"pn":77,"img":"http://p1.meituan.net/165.220/movie/69920759ab83d5343db11ef889946ff0107209.jpg","sc":0,"ver":"2D","rt":"2016-11-25上映","scm":"不惑未婚男，追女赴越南","imax":false,"snum":230,"showDate":"","src":"","dur":96,"nm":"越囧","time":"","id":246674},{"late":false,"cnms":0,"sn":0,"showInfo":"今天6家影院放映7场","preSale":0,"vd":"","dir":"钱国伟","star":"岑丽香,郑欣宜,何佩瑜","cat":"喜剧,动作","wish":9601,"3d":false,"pn":94,"img":"http://p1.meituan.net/165.220/movie/8e5efcec13d45ceaf7bad90a376a8d87368553.jpg","sc":8,"ver":"2D","rt":"2016-11-18上映","scm":"六个姐妹花，拳脚功夫佳","imax":false,"snum":1500,"showDate":"","src":"","dur":102,"nm":"辣警霸王花","time":"","id":342096},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映5场","preSale":0,"vd":"","dir":"周申,刘露","star":"任素汐,大力,刘帅良","cat":"剧情,喜剧","wish":29385,"3d":false,"pn":157,"img":"http://p1.meituan.net/165.220/movie/13d4883803f25244d266c7cd3ac2f15d327618.jpg","sc":8.5,"ver":"2D","rt":"2016-10-28上映","scm":"谎言圆不上，人比驴荒唐","imax":false,"snum":135020,"showDate":"","src":"","dur":111,"nm":"驴得水","time":"","id":410612},{"late":false,"cnms":0,"sn":0,"showInfo":"今天4家影院放映5场","preSale":0,"vd":"","dir":"摩撒利","star":"殷果儿,丁汇宇,刘小奇","cat":"爱情,惊悚,悬疑","wish":17879,"3d":false,"pn":34,"img":"http://p0.meituan.net/165.220/movie/dd9d76aaa8a1bdad4f2907b78efb594f95916.jpeg","sc":5,"ver":"2D","rt":"2016-11-11上映","scm":"东方魔幻书，怪力乱神出","imax":false,"snum":4381,"showDate":"","src":"","dur":88,"nm":"聊斋新编之画皮新娘","time":"","id":346546},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"左伟晨","star":"姚亦,陈相丞,杜乔","cat":"剧情,动作,科幻","wish":684,"3d":false,"pn":22,"img":"http://p0.meituan.net/165.220/movie/c2c53225574fabcc298fdd7d61e3c2a68890528.png","sc":0,"ver":"2D","rt":"本周五上映","scm":"外星大叛乱，王子来避难","imax":false,"snum":203,"showDate":"","src":"","dur":87,"nm":"东宫皇子","time":"","id":1189884},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-08 下周四上映","preSale":1,"vd":"","dir":"梅尔·吉布森","star":"安德鲁·加菲尔德,雨果·维文,卢克·布雷西","cat":"剧情,战争","wish":12577,"3d":false,"pn":94,"img":"http://p1.meituan.net/165.220/movie/9581cfbc221ab927b6c856524e96d319769553.jpg","sc":0,"ver":"2D","rt":"下周四上映","scm":"士兵有信仰，战场拒拿枪","imax":false,"snum":179,"showDate":"","src":"","dur":139,"nm":"血战钢锯岭","time":"","id":338349},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"鲍强","star":"杜旭东,郭鹏,王亚楠","cat":"剧情,喜剧","wish":172,"3d":false,"pn":9,"img":"http://p0.meituan.net/165.220/movie/1e153092456ef2efc3d183b3a7836678760985.png","sc":0,"ver":"2D","rt":"本周五上映","scm":"文艺村里汉，城市不孤单","imax":false,"snum":9,"showDate":"","src":"","dur":90,"nm":"锅是铁","time":"","id":1197623},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映3场","preSale":0,"vd":"","dir":"王川","star":"刘婧荦,刘校妤,姚姝","cat":"动画,冒险,奇幻","wish":14265,"3d":true,"pn":57,"img":"http://p1.meituan.net/165.220/movie/1c941143ac74b89cf16a4884585131be164722.jpg","sc":9.4,"ver":"2D/3D","rt":"2014-10-01上映","scm":"蛮吉唤脉兽，决战不回头","imax":false,"snum":11402,"showDate":"","src":"","dur":90,"nm":"魁拔Ⅲ战神崛起","time":"","id":78018},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映2场","preSale":0,"vd":"","dir":"王子鸣","star":"文章,李连杰,刘诗诗","cat":"喜剧,悬疑","wish":12353,"3d":false,"pn":114,"img":"http://p0.meituan.net/165.220/movie/__14112446__9201076.jpg","sc":7.4,"ver":"2D","rt":"2013-06-21上映","scm":"李连杰变毒舌，文章依旧卖贱","imax":false,"snum":7416,"showDate":"","src":"","dur":98,"nm":"不二神探","time":"","id":78135},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"刘伟强","star":"黄晓明,阮经天,李宇春","cat":"动作,古装","wish":2985,"3d":true,"pn":296,"img":"http://p0.meituan.net/165.220/movie/37/207482.jpg","sc":6.1,"ver":"2D/3D","rt":"2012-12-20上映","scm":"特工太暴力，杀人取首级","imax":false,"snum":1526,"showDate":"","src":"","dur":112,"nm":"血滴子","time":"","id":937},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"刘辉","star":"徐海乔,蒋松,王洁曦","cat":"惊悚,恐怖","wish":641,"3d":false,"pn":44,"img":"http://p0.meituan.net/165.220/movie/__21284489__9331903.jpg","sc":3.9,"ver":"2D","rt":"2013-09-06上映","scm":"古镇缠凶灵，连环来索命","imax":false,"snum":319,"showDate":"","src":"","dur":90,"nm":"古镇凶灵之巫咒缠身","time":"","id":78316},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"杨江","star":"宋洋,梦丽,冉天","cat":"剧情,动作","wish":1253,"3d":false,"pn":36,"img":"http://p0.meituan.net/165.220/movie/a423cfe5184eedfa38d9bc6a7cfa0ca0138163.jpg","sc":6.5,"ver":"2D","rt":"2014-10-24上映","scm":"敌我殊死斗，悬念环环扣","imax":false,"snum":322,"showDate":"","src":"","dur":86,"nm":"狙击时刻","time":"","id":246077},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"曾宪林","star":"小连杀,叮当,郝祥海","cat":"动画,喜剧,冒险","wish":3659,"3d":true,"pn":82,"img":"http://p0.meituan.net/165.220/movie/f8c8ff13e5ba8a1dab7d6a5341701b0a175485.jpg","sc":7.5,"ver":"2D/3D","rt":"2015-01-01上映","scm":"兔子砸了场，死敌来帮忙","imax":false,"snum":10424,"showDate":"","src":"","dur":88,"nm":"闯堂兔2：疯狂马戏团","time":"","id":246100},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"吴京","star":"吴京,余男,倪大红","cat":"动作,战争","wish":67199,"3d":true,"pn":159,"img":"http://p1.meituan.net/165.220/movie/0fec3a88133e569ca0067e12f7ad0b80987252.jpg","sc":9.3,"ver":"2D/3D/中国巨幕","rt":"2015-04-02上映","scm":"铁血特种兵，兄弟生死情","imax":false,"snum":612776,"showDate":"","src":"","dur":90,"nm":"战狼","time":"","id":78304},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"韩延","star":"白百何,吴彦祖,李媛","cat":"剧情,喜剧,爱情","wish":98747,"3d":false,"pn":339,"img":"http://p0.meituan.net/165.220/movie/b2ab50366d817a9638e20a90cdbc9284196116.jpg","sc":9,"ver":"2D/IMAX 2D/中国巨幕","rt":"2015-08-13上映","scm":"肿瘤君滚开，吴彦祖快来","imax":true,"snum":605559,"showDate":"","src":"","dur":125,"nm":"滚蛋吧！肿瘤君","time":"","id":246505},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"刘星,胡明钢,于兰","star":"佟瑞欣,郭伟华,马晓伟","cat":"战争,历史,剧情","wish":331,"3d":false,"pn":0,"img":"http://p0.meituan.net/165.220/movie/91b3eb5fd8ea1f15e6a4a6c35842f63389899.jpg","sc":0,"ver":"2D","rt":"2016-10-10上映","scm":"红军历万难，决战生死间","imax":false,"snum":442,"showDate":"","src":"","dur":94,"nm":"遵义会议","time":"","id":1189048},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"张蠡","star":"诺布钍呷,陶多多,曲木古火·秋风","cat":"剧情,冒险,爱情","wish":2568,"3d":false,"pn":70,"img":"http://p0.meituan.net/165.220/movie/7461b7416fd36f10abe6c46a70baae9886561.jpg","sc":8.1,"ver":"2D","rt":"2016-11-03上映","scm":"思父少年郎，寻访路漫长","imax":false,"snum":1083,"showDate":"","src":"","dur":120,"nm":"我的圣途","time":"","id":343347},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"闵晋涛","star":"赵泳鑫,檀健次,冯家妹","cat":"恐怖,惊悚","wish":3646,"3d":false,"pn":12,"img":"http://p1.meituan.net/165.220/movie/85cb54fd3f6e0a1046a948e371cc81ac97044.jpg","sc":5.9,"ver":"2D","rt":"2016-11-04上映","scm":"记者探鬼域，废楼陷囹圄","imax":false,"snum":1229,"showDate":"","src":"","dur":85,"nm":"恐怖笔记","time":"","id":341297},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-01 本周四上映","preSale":1,"vd":"","dir":"谢云鹏,杜昌博","star":"郑昊,张墨锡,王佳琦","cat":"剧情,爱情","wish":2049,"3d":false,"pn":265,"img":"http://p1.meituan.net/165.220/movie/808a19b387ec5dcbbb016513f9634a9d1415574.jpg","sc":0,"ver":"2D","rt":"本周四上映","scm":"女孩遭性侵，山村来打拼","imax":false,"snum":62,"showDate":"","src":"","dur":92,"nm":"爱你的人","time":"","id":345529},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"李柯","star":"隋咏良,尤靖茹,薛祺","cat":"剧情,爱情,冒险","wish":1102,"3d":false,"pn":68,"img":"http://p0.meituan.net/165.220/movie/afb1ae81d7ef6a57c5abc20d9fcdd35920580551.jpg","sc":0,"ver":"2D","rt":"本周五上映","scm":"沙漠越野赛，飙车为求爱","imax":false,"snum":13,"showDate":"","src":"","dur":95,"nm":"沙漠之心","time":"","id":1197460},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"张一白","star":"彭于晏,倪妮,郑恺","cat":"剧情,爱情","wish":74203,"3d":false,"pn":378,"img":"http://p0.meituan.net/165.220/movie/153d2a327b80b0e57ff6feb3e6aecebf585878.jpg","sc":8,"ver":"2D","rt":"2014-12-05上映","scm":"纯情已不再，青春忙堕胎","imax":false,"snum":375286,"showDate":"","src":"","dur":119,"nm":"匆匆那年","time":"","id":245980},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"郑成峰","star":"琪琪,王琪,孙科","cat":"动画,冒险,奇幻","wish":16011,"3d":true,"pn":134,"img":"http://p1.meituan.net/165.220/movie/cbfafe6043a950843bd42714f14fc4f5437749.jpg","sc":6.1,"ver":"2D/3D","rt":"2015-09-03上映","scm":"魔镜伸恶手，公主斗皇后","imax":false,"snum":14760,"showDate":"","src":"","dur":83,"nm":"魔镜奇缘","time":"","id":341113},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"陈思诚","star":"王宝强,刘昊然,陈赫","cat":"喜剧,动作,悬疑","wish":142841,"3d":false,"pn":610,"img":"http://p1.meituan.net/165.220/movie/bf9a569dc60cb6699dff81c1c2ce8cd8172737.jpg","sc":9,"ver":"2D/中国巨幕","rt":"2015-12-31上映","scm":"宝强背黑锅，破案麻烦多","imax":false,"snum":1328931,"showDate":"","src":"","dur":135,"nm":"唐人街探案","time":"","id":247300},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"姚婷婷","star":"白敬亭,郭姝彤,李宏毅","cat":"爱情,剧情","wish":94492,"3d":false,"pn":454,"img":"http://p1.meituan.net/165.220/movie/702e327012a1e8d82c644690f2a9d827196818.jpg","sc":8.6,"ver":"2D","rt":"2016-04-22上映","scm":"天骄亦迷茫，有梦任高翔","imax":false,"snum":270044,"showDate":"","src":"","dur":108,"nm":"谁的青春不迷茫","time":"","id":246582},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"宁海强","star":"李东学,聂远,于小伟","cat":"历史,战争,动作","wish":10456,"3d":false,"pn":134,"img":"http://p0.meituan.net/165.220/movie/487c91816e531c33063fefa657d4c6e4656569.jpeg","sc":8.8,"ver":"2D/中国巨幕","rt":"2016-10-14上映","scm":"夜奔百余里，行军创奇迹","imax":false,"snum":17367,"showDate":"","src":"","dur":102,"nm":"勇士","time":"","id":346759},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"刘雨霖","star":"毛孩,李倩,刘蓓","cat":"剧情","wish":11050,"3d":false,"pn":176,"img":"http://p0.meituan.net/165.220/movie/44e7bf41b8d9bf7a061b5647bb3f0fc9586345.jpg","sc":7.7,"ver":"2D","rt":"2016-11-04上映","scm":"婚后无话讲，与谁诉短长","imax":false,"snum":6765,"showDate":"","src":"","dur":110,"nm":"一句顶一万句","time":"","id":345216},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"张坚庭","star":"郑嘉颖,小小彬,李呈媛","cat":"剧情,喜剧,爱情","wish":16655,"3d":false,"pn":61,"img":"http://p0.meituan.net/165.220/movie/34f14bdd361cae758f52dae3436082d1801317.jpg","sc":8.2,"ver":"2D","rt":"2016-11-10上映","scm":"育儿新绝招，假装被破产","imax":false,"snum":1922,"showDate":"","src":"","dur":96,"nm":"贫穷富爸爸","time":"","id":336061}]}
     */

    private int status;
    /**
     * hasNext : false
     * movies : [{"late":false,"cnms":0,"sn":0,"showInfo":"今天181家影院放映2244场","preSale":0,"vd":"","dir":"大卫·叶茨","star":"埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔","cat":"冒险,奇幻,家庭","wish":130686,"3d":true,"pn":236,"img":"http://p0.meituan.net/165.220/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕","rt":"2016-11-25上映","scm":"神奇动物城，法师显超能","imax":true,"snum":89309,"showDate":"","src":"","dur":133,"nm":"神奇动物在哪里","time":"","id":248918},{"late":false,"cnms":0,"sn":0,"showInfo":"今天177家影院放映1048场","preSale":0,"vd":"","dir":"罗恩·克莱蒙兹,约翰·马斯克,唐·霍尔,克里斯·威廉姆斯","star":"奥伊伊·卡瓦略,道恩·强森,Rachel House","cat":"动画,动作,冒险","wish":42849,"3d":true,"pn":125,"img":"http://p1.meituan.net/165.220/movie/dd600d0f054b234402edc3a93cd21da7133550.jpeg","sc":9.2,"ver":"2D/3D/中国巨幕/全景声","rt":"2016-11-25上映","scm":"航海家后代，征程向大海","imax":false,"snum":27605,"showDate":"","src":"","dur":107,"nm":"海洋奇缘","time":"","id":246222},{"late":false,"cnms":0,"sn":0,"showInfo":"今天19家影院放映19场","preSale":1,"vd":"","dir":"罗伯特·泽米吉斯","star":"布拉德·皮特,玛丽昂·歌迪亚,马修·古迪","cat":"爱情,动作,战争","wish":41671,"3d":false,"pn":192,"img":"http://p0.meituan.net/165.220/movie/9aa8a2df88d43ad08fbf0d1c6878bb5579675.jpg","sc":0,"ver":"2D/中国巨幕","rt":"本周三上映","scm":"夫妇皆仇敌，枕边藏杀机","imax":false,"snum":28454,"showDate":"","src":"","dur":124,"nm":"间谍同盟","time":"","id":346564},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"新海诚","star":"上白石萌音,神木隆之介,长泽雅美","cat":"剧情,爱情,动画","wish":248555,"3d":false,"pn":172,"img":"http://p0.meituan.net/165.220/movie/910b2e6c7cb0da947d65ef5c33929eb9366676.jpg","sc":0,"ver":"2D","rt":"本周五上映","scm":"寻君千里行，心系君之名","imax":false,"snum":16614,"showDate":"","src":"","dur":107,"nm":"你的名字。","time":"","id":344881},{"late":false,"cnms":0,"sn":0,"showInfo":"今天169家影院放映747场","preSale":0,"vd":"","dir":"林岭东,钱文锜","star":"吴彦祖,张孝全,张若昀","cat":"剧情,动作,悬疑","wish":29674,"3d":false,"pn":188,"img":"http://p0.meituan.net/165.220/movie/a4469e30fc41d262ad021d5dd0dd73aa767743.jpg","sc":7.1,"ver":"2D","rt":"2016-11-25上映","scm":"血清三路抢，大火吞真相","imax":false,"snum":19322,"showDate":"","src":"","dur":100,"nm":"冲天火","time":"","id":341529},{"late":false,"cnms":0,"sn":0,"showInfo":"今天170家影院放映694场","preSale":0,"vd":"","dir":"冯小刚","star":"范冰冰,郭涛,董成鹏","cat":"剧情,喜剧","wish":185572,"3d":false,"pn":211,"img":"http://p1.meituan.net/165.220/movie/8e5eabeadf237a10227a3124419410ef549583.jpg","sc":7.9,"ver":"2D/中国巨幕/全景声","rt":"2016-11-18上映","scm":"金莲戏中戏，官场局中局","imax":false,"snum":176968,"showDate":"","src":"","dur":140,"nm":"我不是潘金莲","time":"","id":341749},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"蒂姆·波顿","star":"伊娃·格林,阿沙·巴特菲尔德,塞缪尔·杰克逊","cat":"冒险,奇幻","wish":95974,"3d":true,"pn":107,"img":"http://p0.meituan.net/165.220/movie/eccf1862c4f30042a373a080acc18ccf9587819.jpeg","sc":0,"ver":"2D/3D/中国巨幕","rt":"本周五上映","scm":"异能桃花源，穿越时光圈","imax":false,"snum":1148,"showDate":"","src":"","dur":126,"nm":"佩小姐的奇幻城堡","time":"","id":246373},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"尔冬升","star":"林更新,何润东,蒋梦婕","cat":"剧情,动作,武侠","wish":93687,"3d":true,"pn":115,"img":"http://p0.meituan.net/165.220/movie/c3eaa8556346814f2a3a79ffef0924b4577174.jpg","sc":0,"ver":"3D/中国巨幕","rt":"本周五上映","scm":"冬升携老怪，千仗无一败","imax":false,"snum":1146,"showDate":"","src":"","dur":107,"nm":"三少爷的剑","time":"","id":79088},{"late":false,"cnms":0,"sn":0,"showInfo":"今天150家影院放映373场","preSale":0,"vd":"","dir":"静野孔文","star":"高山南,天海佑希,林原惠美","cat":"动画,悬疑","wish":43219,"3d":false,"pn":80,"img":"http://p0.meituan.net/165.220/movie/6742d5169d136a58a3b1ca2fd071e88c248086.jpg","sc":8.8,"ver":"2D","rt":"2016-11-25上映","scm":"美女有异瞳，黑暗再行动","imax":false,"snum":17805,"showDate":"","src":"","dur":112,"nm":"名侦探柯南：纯黑的恶梦","time":"","id":344073},{"late":false,"cnms":0,"sn":0,"showInfo":"今天113家影院放映292场","preSale":0,"vd":"","dir":"斯科特·德瑞克森","star":"本尼迪克特·康伯巴奇,切瓦特·埃加福特,瑞秋·麦克亚当斯","cat":"动作,冒险,奇幻","wish":205273,"3d":true,"pn":534,"img":"http://p1.meituan.net/165.220/movie/aa492b57443fc95a5b3b46c459d59e50898549.jpg","sc":9,"ver":"3D/IMAX 3D/中国巨幕/全景声","rt":"2016-11-04上映","scm":"车祸手迟钝，修炼成神棍","imax":true,"snum":332857,"showDate":"","src":"","dur":115,"nm":"奇异博士","time":"","id":246124},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"宋啸","star":"陈赫,宋智孝,大卫·贝利","cat":"喜剧,动作,冒险","wish":40120,"3d":false,"pn":122,"img":"http://p0.meituan.net/165.220/movie/658b714699f37110db35e343474ccf12808915.png","sc":0,"ver":"2D/中国巨幕","rt":"本周五上映","scm":"中法韩跑男，为夺宝闯关","imax":false,"snum":1462,"showDate":"","src":"","dur":91,"nm":"超级快递","time":"","id":343866},{"late":false,"cnms":0,"sn":0,"showInfo":"今天92家影院放映172场","preSale":0,"vd":"","dir":"马侃","star":"高以翔,王水林,秦晓飞","cat":"喜剧,爱情","wish":40251,"3d":false,"pn":72,"img":"http://p0.meituan.net/165.220/movie/63df54245e2a87bcbe4d9f7a4ee496e6963165.jpg","sc":7.9,"ver":"2D","rt":"2016-11-25上映","scm":"身高有差距，恋爱零距离","imax":false,"snum":5411,"showDate":"","src":"","dur":91,"nm":"最萌身高差","time":"","id":345105},{"late":false,"cnms":0,"sn":0,"showInfo":"今天61家影院放映94场","preSale":0,"vd":"","dir":"陈兵","star":"安宰贤,安以轩,方中信","cat":"剧情,爱情","wish":20845,"3d":false,"pn":70,"img":"http://p1.meituan.net/165.220/movie/98d1eac6f63b475e1d937c19666029c4238607.jpg","sc":7.8,"ver":"2D","rt":"2016-11-25上映","scm":"处女爱处男，结局并不惨","imax":false,"snum":1425,"showDate":"","src":"","dur":90,"nm":"我是处女座","time":"","id":344437},{"late":false,"cnms":0,"sn":0,"showInfo":"今天68家影院放映80场","preSale":0,"vd":"","dir":"周广兴","star":"那威,倪新宇,陈美行","cat":"恐怖,惊悚,悬疑","wish":17215,"3d":false,"pn":33,"img":"http://p0.meituan.net/165.220/movie/b313dcb28fbd25fd116485ee9ada2737980656.jpeg","sc":3.7,"ver":"2D","rt":"2016-11-25上映","scm":"夫人突暴毙，地下藏玄机","imax":false,"snum":1887,"showDate":"","src":"","dur":89,"nm":"怨灵地下室","time":"","id":1182756},{"late":false,"cnms":0,"sn":0,"showInfo":"今天52家影院放映75场","preSale":0,"vd":"","dir":"林浩然","star":"陈妍希,杰克逊·拉斯波恩,成康","cat":"剧情,爱情,悬疑","wish":11823,"3d":false,"pn":39,"img":"http://p0.meituan.net/165.220/movie/501b866b4605b4933b1ebec67bc49da74245946.jpg","sc":7.4,"ver":"2D","rt":"2016-11-25上映","scm":"只是被车撞，生活却变样","imax":false,"snum":560,"showDate":"","src":"","dur":95,"nm":"夏威夷之恋","time":"","id":337195},{"late":false,"cnms":0,"sn":0,"showInfo":"今天37家影院放映65场","preSale":0,"vd":"","dir":"彼得·博格","star":"马克·沃尔伯格,吉娜·罗德里格兹,库尔特·拉塞尔","cat":"剧情,动作,灾难","wish":26131,"3d":false,"pn":228,"img":"http://p0.meituan.net/165.220/movie/c8d8a0a51af8da4489727296ebf2d548617916.jpg","sc":8.3,"ver":"2D/中国巨幕","rt":"2016-11-15上映","scm":"海上遇井喷，英勇救同伴","imax":false,"snum":30273,"showDate":"","src":"","dur":108,"nm":"深海浩劫","time":"","id":248675},{"late":false,"cnms":0,"sn":0,"showInfo":"今天27家影院放映58场","preSale":0,"vd":"","dir":"李安","star":"乔·阿尔文,克里斯汀·斯图尔特,加内特·赫德兰","cat":"剧情,战争","wish":33615,"3d":true,"pn":281,"img":"http://p0.meituan.net/165.220/movie/0469a4bbcf69d46357256bc100bed703787664.jpg","sc":8.3,"ver":"3D/中国巨幕","rt":"2016-11-11上映","scm":"半场无战事，少年初长时","imax":false,"snum":54426,"showDate":"","src":"","dur":113,"nm":"比利·林恩的中场战事","time":"","id":247736},{"late":false,"cnms":0,"sn":0,"showInfo":"今天18家影院放映36场","preSale":0,"vd":"","dir":"林超贤","star":"张涵予,彭于晏,冯文娟","cat":"动作,犯罪,剧情","wish":57407,"3d":false,"pn":296,"img":"http://p0.meituan.net/165.220/movie/8f8efcd7a8c3dbcbe13fe2cd855ea6a42750455.jpg","sc":9.3,"ver":"2D/中国巨幕","rt":"2016-09-30上映","scm":"商船藏毒品，冤屈难洗清","imax":false,"snum":819508,"showDate":"","src":"","dur":124,"nm":"湄公河行动","time":"","id":338391},{"late":false,"cnms":0,"sn":0,"showInfo":"今天20家影院放映36场","preSale":0,"vd":"","dir":"宫元宏彰","star":"田中真弓,大谷育江,冈村明美","cat":"动画,冒险","wish":118442,"3d":false,"pn":108,"img":"http://p0.meituan.net/165.220/movie/e17eb219908416b7ee3bf07c2dc295ac945415.jpg","sc":9.1,"ver":"2D","rt":"2016-11-11上映","scm":"热血海贼王，冒险新起航","imax":false,"snum":95406,"showDate":"","src":"","dur":121,"nm":"航海王之黄金城","time":"","id":344902},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"埃兰·克里维","star":"尼古拉斯·霍尔特,菲丽希缇·琼斯,Johny Mathew","cat":"动作,惊悚","wish":19636,"3d":true,"pn":90,"img":"http://p0.meituan.net/165.220/movie/394490e44943bebd375ffae1a7fe113e492426.jpg","sc":0,"ver":"2D/中国巨幕/3D","rt":"本周五上映","scm":"舍命战毒枭，为爱去狂飙","imax":false,"snum":88,"showDate":"","src":"","dur":88,"nm":"极速之巅","time":"","id":336835},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"李凯","star":"娄淇,杨凯迪,谢波","cat":"恐怖,惊悚,科幻","wish":6717,"3d":false,"pn":47,"img":"http://p1.meituan.net/165.220/movie/99b80de56746a9de620f08cb33bd21e15407178.jpg","sc":0,"ver":"2D","rt":"本周五上映","scm":"驴友去探险，误闯食人岛","imax":false,"snum":130,"showDate":"","src":"","dur":94,"nm":"食人岛","time":"","id":1132403},{"late":false,"cnms":0,"sn":0,"showInfo":"今天10家影院放映19场","preSale":0,"vd":"","dir":"马蒂亚斯·霍恩","star":"赵又廷,倪妮,尤赖亚·谢尔顿","cat":"动作,冒险,奇幻","wish":23294,"3d":true,"pn":212,"img":"http://p0.meituan.net/165.220/movie/c3cb7d5ec4d961c793bd812805a30bc4621134.jpg","sc":6.4,"ver":"2D/3D/中国巨幕","rt":"2016-11-18上映","scm":"异世来相逢，勇者得重生","imax":false,"snum":19199,"showDate":"","src":"","dur":108,"nm":"勇士之门","time":"","id":248637},{"late":false,"cnms":0,"sn":0,"showInfo":"今天7家影院放映10场","preSale":0,"vd":"","dir":"安兵基","star":"佟大为,陈妍希,吕云骢","cat":"剧情,喜剧,家庭","wish":39153,"3d":false,"pn":166,"img":"http://p1.meituan.net/165.220/movie/119fc2dd0b9c55001831e6fc5dd2a374115176.jpg","sc":8.3,"ver":"2D","rt":"2016-11-11上映","scm":"主播有点烦，儿孙太能缠","imax":false,"snum":36463,"showDate":"","src":"","dur":103,"nm":"外公芳龄38","time":"","id":342427},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","preSale":1,"vd":"","dir":"张末","star":"倪妮,霍建华,马苏","cat":"喜剧,爱情,奇幻","wish":90821,"3d":false,"pn":127,"img":"http://p0.meituan.net/165.220/movie/08b6b34f8a6144dfb385f64dd8adfc22619538.jpg","sc":0,"ver":"2D","rt":"下周五上映","scm":"哭成小笨蛋，笑回长大前","imax":false,"snum":1255,"showDate":"","src":"","dur":109,"nm":"28岁未成年","time":"","id":343413},{"late":false,"cnms":0,"sn":0,"showInfo":"今天7家影院放映9场","preSale":0,"vd":"","dir":"亚瑟·本扎昆","star":"凯文·亚当斯,让-保罗·卢弗,凡妮莎·吉德","cat":"喜剧,爱情","wish":19648,"3d":false,"pn":76,"img":"http://p1.meituan.net/165.220/movie/2d5fb108c7868e870daa1787cee484b7697168.jpg","sc":7.4,"ver":"2D","rt":"2016-11-18上映","scm":"穷人爱公主，神灯来帮助","imax":false,"snum":10869,"showDate":"","src":"","dur":101,"nm":"阿拉丁与神灯","time":"","id":346365},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-09 下周五上映","preSale":1,"vd":"","dir":"周隼","star":"胡歌,宋佳,颜卓灵","cat":"爱情,悬疑,犯罪","wish":30023,"3d":false,"pn":52,"img":"http://p0.meituan.net/165.220/movie/d4def49e4f1b238c939334f8915bd8ac829204.png","sc":0,"ver":"2D","rt":"下周五上映","scm":"绑架十二年，归家惹事端","imax":false,"snum":674,"showDate":"","src":"","dur":0,"nm":"那年夏天你去了哪里","time":"","id":1187526},{"late":false,"cnms":0,"sn":0,"showInfo":"今天6家影院放映8场","preSale":0,"vd":"","dir":"钟萱","star":"钟萱,温兆伦,刘宇珽","cat":"恐怖,惊悚,悬疑","wish":4173,"3d":false,"pn":47,"img":"http://p0.meituan.net/165.220/movie/0b5e98a4b7044cc7e445da18c460e104373854.jpg","sc":5.8,"ver":"2D","rt":"2016-11-18上映","scm":"神秘白云桥，阴阳交界处","imax":false,"snum":2333,"showDate":"","src":"","dur":94,"nm":"白云桥","time":"","id":1187417},{"late":false,"cnms":0,"sn":0,"showInfo":"今天5家影院放映8场","preSale":0,"vd":"","dir":"郭翔","star":"马德钟,王大治,刘力扬","cat":"剧情,喜剧,爱情","wish":3016,"3d":false,"pn":77,"img":"http://p1.meituan.net/165.220/movie/69920759ab83d5343db11ef889946ff0107209.jpg","sc":0,"ver":"2D","rt":"2016-11-25上映","scm":"不惑未婚男，追女赴越南","imax":false,"snum":230,"showDate":"","src":"","dur":96,"nm":"越囧","time":"","id":246674},{"late":false,"cnms":0,"sn":0,"showInfo":"今天6家影院放映7场","preSale":0,"vd":"","dir":"钱国伟","star":"岑丽香,郑欣宜,何佩瑜","cat":"喜剧,动作","wish":9601,"3d":false,"pn":94,"img":"http://p1.meituan.net/165.220/movie/8e5efcec13d45ceaf7bad90a376a8d87368553.jpg","sc":8,"ver":"2D","rt":"2016-11-18上映","scm":"六个姐妹花，拳脚功夫佳","imax":false,"snum":1500,"showDate":"","src":"","dur":102,"nm":"辣警霸王花","time":"","id":342096},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映5场","preSale":0,"vd":"","dir":"周申,刘露","star":"任素汐,大力,刘帅良","cat":"剧情,喜剧","wish":29385,"3d":false,"pn":157,"img":"http://p1.meituan.net/165.220/movie/13d4883803f25244d266c7cd3ac2f15d327618.jpg","sc":8.5,"ver":"2D","rt":"2016-10-28上映","scm":"谎言圆不上，人比驴荒唐","imax":false,"snum":135020,"showDate":"","src":"","dur":111,"nm":"驴得水","time":"","id":410612},{"late":false,"cnms":0,"sn":0,"showInfo":"今天4家影院放映5场","preSale":0,"vd":"","dir":"摩撒利","star":"殷果儿,丁汇宇,刘小奇","cat":"爱情,惊悚,悬疑","wish":17879,"3d":false,"pn":34,"img":"http://p0.meituan.net/165.220/movie/dd9d76aaa8a1bdad4f2907b78efb594f95916.jpeg","sc":5,"ver":"2D","rt":"2016-11-11上映","scm":"东方魔幻书，怪力乱神出","imax":false,"snum":4381,"showDate":"","src":"","dur":88,"nm":"聊斋新编之画皮新娘","time":"","id":346546},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"左伟晨","star":"姚亦,陈相丞,杜乔","cat":"剧情,动作,科幻","wish":684,"3d":false,"pn":22,"img":"http://p0.meituan.net/165.220/movie/c2c53225574fabcc298fdd7d61e3c2a68890528.png","sc":0,"ver":"2D","rt":"本周五上映","scm":"外星大叛乱，王子来避难","imax":false,"snum":203,"showDate":"","src":"","dur":87,"nm":"东宫皇子","time":"","id":1189884},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-08 下周四上映","preSale":1,"vd":"","dir":"梅尔·吉布森","star":"安德鲁·加菲尔德,雨果·维文,卢克·布雷西","cat":"剧情,战争","wish":12577,"3d":false,"pn":94,"img":"http://p1.meituan.net/165.220/movie/9581cfbc221ab927b6c856524e96d319769553.jpg","sc":0,"ver":"2D","rt":"下周四上映","scm":"士兵有信仰，战场拒拿枪","imax":false,"snum":179,"showDate":"","src":"","dur":139,"nm":"血战钢锯岭","time":"","id":338349},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"鲍强","star":"杜旭东,郭鹏,王亚楠","cat":"剧情,喜剧","wish":172,"3d":false,"pn":9,"img":"http://p0.meituan.net/165.220/movie/1e153092456ef2efc3d183b3a7836678760985.png","sc":0,"ver":"2D","rt":"本周五上映","scm":"文艺村里汉，城市不孤单","imax":false,"snum":9,"showDate":"","src":"","dur":90,"nm":"锅是铁","time":"","id":1197623},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映3场","preSale":0,"vd":"","dir":"王川","star":"刘婧荦,刘校妤,姚姝","cat":"动画,冒险,奇幻","wish":14265,"3d":true,"pn":57,"img":"http://p1.meituan.net/165.220/movie/1c941143ac74b89cf16a4884585131be164722.jpg","sc":9.4,"ver":"2D/3D","rt":"2014-10-01上映","scm":"蛮吉唤脉兽，决战不回头","imax":false,"snum":11402,"showDate":"","src":"","dur":90,"nm":"魁拔Ⅲ战神崛起","time":"","id":78018},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映2场","preSale":0,"vd":"","dir":"王子鸣","star":"文章,李连杰,刘诗诗","cat":"喜剧,悬疑","wish":12353,"3d":false,"pn":114,"img":"http://p0.meituan.net/165.220/movie/__14112446__9201076.jpg","sc":7.4,"ver":"2D","rt":"2013-06-21上映","scm":"李连杰变毒舌，文章依旧卖贱","imax":false,"snum":7416,"showDate":"","src":"","dur":98,"nm":"不二神探","time":"","id":78135},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"刘伟强","star":"黄晓明,阮经天,李宇春","cat":"动作,古装","wish":2985,"3d":true,"pn":296,"img":"http://p0.meituan.net/165.220/movie/37/207482.jpg","sc":6.1,"ver":"2D/3D","rt":"2012-12-20上映","scm":"特工太暴力，杀人取首级","imax":false,"snum":1526,"showDate":"","src":"","dur":112,"nm":"血滴子","time":"","id":937},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"刘辉","star":"徐海乔,蒋松,王洁曦","cat":"惊悚,恐怖","wish":641,"3d":false,"pn":44,"img":"http://p0.meituan.net/165.220/movie/__21284489__9331903.jpg","sc":3.9,"ver":"2D","rt":"2013-09-06上映","scm":"古镇缠凶灵，连环来索命","imax":false,"snum":319,"showDate":"","src":"","dur":90,"nm":"古镇凶灵之巫咒缠身","time":"","id":78316},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"杨江","star":"宋洋,梦丽,冉天","cat":"剧情,动作","wish":1253,"3d":false,"pn":36,"img":"http://p0.meituan.net/165.220/movie/a423cfe5184eedfa38d9bc6a7cfa0ca0138163.jpg","sc":6.5,"ver":"2D","rt":"2014-10-24上映","scm":"敌我殊死斗，悬念环环扣","imax":false,"snum":322,"showDate":"","src":"","dur":86,"nm":"狙击时刻","time":"","id":246077},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"曾宪林","star":"小连杀,叮当,郝祥海","cat":"动画,喜剧,冒险","wish":3659,"3d":true,"pn":82,"img":"http://p0.meituan.net/165.220/movie/f8c8ff13e5ba8a1dab7d6a5341701b0a175485.jpg","sc":7.5,"ver":"2D/3D","rt":"2015-01-01上映","scm":"兔子砸了场，死敌来帮忙","imax":false,"snum":10424,"showDate":"","src":"","dur":88,"nm":"闯堂兔2：疯狂马戏团","time":"","id":246100},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"吴京","star":"吴京,余男,倪大红","cat":"动作,战争","wish":67199,"3d":true,"pn":159,"img":"http://p1.meituan.net/165.220/movie/0fec3a88133e569ca0067e12f7ad0b80987252.jpg","sc":9.3,"ver":"2D/3D/中国巨幕","rt":"2015-04-02上映","scm":"铁血特种兵，兄弟生死情","imax":false,"snum":612776,"showDate":"","src":"","dur":90,"nm":"战狼","time":"","id":78304},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"韩延","star":"白百何,吴彦祖,李媛","cat":"剧情,喜剧,爱情","wish":98747,"3d":false,"pn":339,"img":"http://p0.meituan.net/165.220/movie/b2ab50366d817a9638e20a90cdbc9284196116.jpg","sc":9,"ver":"2D/IMAX 2D/中国巨幕","rt":"2015-08-13上映","scm":"肿瘤君滚开，吴彦祖快来","imax":true,"snum":605559,"showDate":"","src":"","dur":125,"nm":"滚蛋吧！肿瘤君","time":"","id":246505},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"刘星,胡明钢,于兰","star":"佟瑞欣,郭伟华,马晓伟","cat":"战争,历史,剧情","wish":331,"3d":false,"pn":0,"img":"http://p0.meituan.net/165.220/movie/91b3eb5fd8ea1f15e6a4a6c35842f63389899.jpg","sc":0,"ver":"2D","rt":"2016-10-10上映","scm":"红军历万难，决战生死间","imax":false,"snum":442,"showDate":"","src":"","dur":94,"nm":"遵义会议","time":"","id":1189048},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"张蠡","star":"诺布钍呷,陶多多,曲木古火·秋风","cat":"剧情,冒险,爱情","wish":2568,"3d":false,"pn":70,"img":"http://p0.meituan.net/165.220/movie/7461b7416fd36f10abe6c46a70baae9886561.jpg","sc":8.1,"ver":"2D","rt":"2016-11-03上映","scm":"思父少年郎，寻访路漫长","imax":false,"snum":1083,"showDate":"","src":"","dur":120,"nm":"我的圣途","time":"","id":343347},{"late":false,"cnms":0,"sn":0,"showInfo":"今天1家影院放映1场","preSale":0,"vd":"","dir":"闵晋涛","star":"赵泳鑫,檀健次,冯家妹","cat":"恐怖,惊悚","wish":3646,"3d":false,"pn":12,"img":"http://p1.meituan.net/165.220/movie/85cb54fd3f6e0a1046a948e371cc81ac97044.jpg","sc":5.9,"ver":"2D","rt":"2016-11-04上映","scm":"记者探鬼域，废楼陷囹圄","imax":false,"snum":1229,"showDate":"","src":"","dur":85,"nm":"恐怖笔记","time":"","id":341297},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-01 本周四上映","preSale":1,"vd":"","dir":"谢云鹏,杜昌博","star":"郑昊,张墨锡,王佳琦","cat":"剧情,爱情","wish":2049,"3d":false,"pn":265,"img":"http://p1.meituan.net/165.220/movie/808a19b387ec5dcbbb016513f9634a9d1415574.jpg","sc":0,"ver":"2D","rt":"本周四上映","scm":"女孩遭性侵，山村来打拼","imax":false,"snum":62,"showDate":"","src":"","dur":92,"nm":"爱你的人","time":"","id":345529},{"late":false,"cnms":0,"sn":0,"showInfo":"2016-12-02 本周五上映","preSale":1,"vd":"","dir":"李柯","star":"隋咏良,尤靖茹,薛祺","cat":"剧情,爱情,冒险","wish":1102,"3d":false,"pn":68,"img":"http://p0.meituan.net/165.220/movie/afb1ae81d7ef6a57c5abc20d9fcdd35920580551.jpg","sc":0,"ver":"2D","rt":"本周五上映","scm":"沙漠越野赛，飙车为求爱","imax":false,"snum":13,"showDate":"","src":"","dur":95,"nm":"沙漠之心","time":"","id":1197460},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"张一白","star":"彭于晏,倪妮,郑恺","cat":"剧情,爱情","wish":74203,"3d":false,"pn":378,"img":"http://p0.meituan.net/165.220/movie/153d2a327b80b0e57ff6feb3e6aecebf585878.jpg","sc":8,"ver":"2D","rt":"2014-12-05上映","scm":"纯情已不再，青春忙堕胎","imax":false,"snum":375286,"showDate":"","src":"","dur":119,"nm":"匆匆那年","time":"","id":245980},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"郑成峰","star":"琪琪,王琪,孙科","cat":"动画,冒险,奇幻","wish":16011,"3d":true,"pn":134,"img":"http://p1.meituan.net/165.220/movie/cbfafe6043a950843bd42714f14fc4f5437749.jpg","sc":6.1,"ver":"2D/3D","rt":"2015-09-03上映","scm":"魔镜伸恶手，公主斗皇后","imax":false,"snum":14760,"showDate":"","src":"","dur":83,"nm":"魔镜奇缘","time":"","id":341113},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"陈思诚","star":"王宝强,刘昊然,陈赫","cat":"喜剧,动作,悬疑","wish":142841,"3d":false,"pn":610,"img":"http://p1.meituan.net/165.220/movie/bf9a569dc60cb6699dff81c1c2ce8cd8172737.jpg","sc":9,"ver":"2D/中国巨幕","rt":"2015-12-31上映","scm":"宝强背黑锅，破案麻烦多","imax":false,"snum":1328931,"showDate":"","src":"","dur":135,"nm":"唐人街探案","time":"","id":247300},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"姚婷婷","star":"白敬亭,郭姝彤,李宏毅","cat":"爱情,剧情","wish":94492,"3d":false,"pn":454,"img":"http://p1.meituan.net/165.220/movie/702e327012a1e8d82c644690f2a9d827196818.jpg","sc":8.6,"ver":"2D","rt":"2016-04-22上映","scm":"天骄亦迷茫，有梦任高翔","imax":false,"snum":270044,"showDate":"","src":"","dur":108,"nm":"谁的青春不迷茫","time":"","id":246582},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"宁海强","star":"李东学,聂远,于小伟","cat":"历史,战争,动作","wish":10456,"3d":false,"pn":134,"img":"http://p0.meituan.net/165.220/movie/487c91816e531c33063fefa657d4c6e4656569.jpeg","sc":8.8,"ver":"2D/中国巨幕","rt":"2016-10-14上映","scm":"夜奔百余里，行军创奇迹","imax":false,"snum":17367,"showDate":"","src":"","dur":102,"nm":"勇士","time":"","id":346759},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"刘雨霖","star":"毛孩,李倩,刘蓓","cat":"剧情","wish":11050,"3d":false,"pn":176,"img":"http://p0.meituan.net/165.220/movie/44e7bf41b8d9bf7a061b5647bb3f0fc9586345.jpg","sc":7.7,"ver":"2D","rt":"2016-11-04上映","scm":"婚后无话讲，与谁诉短长","imax":false,"snum":6765,"showDate":"","src":"","dur":110,"nm":"一句顶一万句","time":"","id":345216},{"late":false,"cnms":0,"sn":0,"showInfo":"今天暂无场次","preSale":0,"vd":"","dir":"张坚庭","star":"郑嘉颖,小小彬,李呈媛","cat":"剧情,喜剧,爱情","wish":16655,"3d":false,"pn":61,"img":"http://p0.meituan.net/165.220/movie/34f14bdd361cae758f52dae3436082d1801317.jpg","sc":8.2,"ver":"2D","rt":"2016-11-10上映","scm":"育儿新绝招，假装被破产","imax":false,"snum":1922,"showDate":"","src":"","dur":96,"nm":"贫穷富爸爸","time":"","id":336061}]
     */

    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        private boolean hasNext;
        /**
         * late : false
         * cnms : 0
         * sn : 0
         * showInfo : 今天181家影院放映2244场
         * preSale : 0
         * vd :
         * dir : 大卫·叶茨
         * star : 埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔
         * cat : 冒险,奇幻,家庭
         * wish : 130686
         * 3d : true
         * pn : 236
         * img : http://p0.meituan.net/165.220/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg
         * sc : 9.0
         * ver : 3D/IMAX 3D/中国巨幕
         * rt : 2016-11-25上映
         * scm : 神奇动物城，法师显超能
         * imax : true
         * snum : 89309
         * showDate :
         * src :
         * dur : 133
         * nm : 神奇动物在哪里
         * time :
         * id : 248918
         */

        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            private boolean late;
            private int cnms;
            private int sn;
            private String showInfo;
            private int preSale;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            @SerializedName("3d")
            private boolean value3d;
            private int pn;
            private String img;
            private double sc;
            private String ver;
            private String rt;
            private String scm;
            private boolean imax;
            private int snum;
            private String showDate;
            private String src;
            private int dur;
            private String nm;
            private String time;
            private int id;

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean isValue3d() {
                return value3d;
            }

            public void setValue3d(boolean value3d) {
                this.value3d = value3d;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
