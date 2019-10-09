<%--
  Created by IntelliJ IDEA.
  User: 小感触
  Date: 2019/5/26
  Time: 21:34
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关于DD音乐</title>
    <link rel="stylesheet" href="/resource/css/about.css"/>
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css"/>
    <link rel="stylesheet" type="text/css" href="/resource/css/copyRight.css"/>
    <link rel="stylesheet" type="text/css" href="/resource/css/common.css"/>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
</head>
<body>
    <div id="app">
        <div id="title">
            <h1><div id="logo"></div>DD音乐</h1>
            <el-link href="/" target="_self" :underline="false">
                <el-button round type="primary" v-if="clientEnv==='pc'">首页</el-button>
                <el-button type="primary" v-if="clientEnv==='mobile'" size="small"> 返回首页</el-button>
            </el-link>
        </div>
        <div id="content">
            <h1>关于</h1>
            <el-divider></el-divider>
            <p v-for="statement in list1">{{statement}}</p>
            <span v-for="statement in list2">{{statement}}</span>
        </div>
        <jsp:include page="copyright.jsp"/>
    </div>
</body>
<%--<script src="https://unpkg.com/vue/dist/vue.js"></script>--%>
<script src="https://cdn.bootcss.com/vue/2.6.10/vue.min.js"></script>
<%--<script src="/resource/js/jquery_v3.4.1.js"></script>--%>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
    new Vue({
        el: '#app',
        data : function () {
            return{
                list1 : [
                    "首先很高兴你能来到DD音乐收听我所发布的音乐，同时很欣慰你也愿意来到“关于”页面查看关于DD音乐的更多信息，这里对DD音乐的开发背景，过程，总结做了简单的介绍，当然中间" +
                    "穿插了一些其他的事情以使得你能更清楚我的表述，希望通过这个页面，你对DD音乐会有一个更加全面的认识。",

                    "其实很早之前，在学习完基本的HTML, CSS, JS 之后，就已经试着用它们写过一个音乐播放器案例了，算是一个综合性质的回顾。确实，通过那个小案例了解到了很多" +
                    "需要注意的细节问题，在这个过程中，也通过这些细节问题发现了自己对某些知识细节方面掌握程度的欠缺。从之前的哪个小案例里面，确实受益良多。但是结合实际" +
                    "以现在的眼光去看之前写的那个小案例，不难发现，在功能实现上仍旧是存在很大的欠缺，包括实现方式，界面，功能完整性上，总觉得哪哪都不尽人如意。但自己仍然明白：" +
                    "这并不是在全盘否定之前做案例的过程，并不是觉得之前的案例是失败的，无意义的。只是觉得，以不同角度去看待同一事物，会因为自身学习的逐步深入，会更容易发现之前" +
                    "未意识到的问题与缺陷，但即便这样，之前的努力仍旧是不可忽视的，而且是非常有意义的。循序渐进，由浅入深！",

                    "对于DD音乐，很明显是一个在线音乐服务应用。以现在的个人能力水平，去独立实现的一个在线Web应用。个人在设计之初，期望它能完成基本的在线音乐服务，包括对音乐的后台管理" +
                    "以及前台的获取工作，在具体要实现功能的计划上，事先参照了QQ音乐，网易云音乐等音乐平台，观察它们的网页版应用中所提供的的功能，然后后续进行各项实现。原本在前台页面上的设计" +
                    "工作上，想要参照QQ音乐的样式进行设计，但是后续随着功能的逐步实现，自己的想法越来越多，慢慢在原来的基础上跑偏，最终成就了一个自认为还算可以的界面供使用。",

                    "再者，对象音乐服务而言，当初写自己的网站(www.bestBigKK.com)时，就考虑将其作为网站的一个功能模块加入进去，如果你留意过我网站的模块分类的话，你会发现现提供的几个主要功能模块中（文章，图片，视频）" +
                    "唯独缺少了另一个常见的媒体类型：音乐。针对这一点，实际上是在网站开发的时候，因为时间的原因（大三下学期开学）要进行的事情比较多，自己在开学之后因为要兼顾到日常的学习，" +
                    "很难再有充沛的时间去完成个人网站这个项目，于是在音乐服务这一问题上，为了保证能快速结束开发工作就阉割掉了。现在的话，还有一个月时间就要放假，在当前的课表上，课程相对而言" +
                    "变得少了一些，另外限于一些私人原因，现在在校处于一种.....”不是单身狗，胜似单身狗的！“的状态，所以可自由支配时间也逐渐的多了起来。与其晃晃悠悠的耗时间，还是找点事情做吧！" +
                    "所以对之前被阉割掉的音乐服务又心心念念起来，要实现它，不能荒废！DD音乐的整体而言，难度并不大，细节方面的话，前面也说过，因为曾经做过了一个简单的小案例，很多的坑都已经踩了一遍，所以" +
                    "这次只需要按部就班，保持谨慎，慢慢实现就行。",

                    "给自己计划的开发时间是利用课表空闲时间，在一周内（2019.05.20-2019.05.26）完成。说到这里，就不得不提一下我自己之前的一种“自我满足”状态了：以前在写一些综合性质的小案例时，随着功能" +
                    "逐步完善的越多，自己就越发的有一种止步不前满足感，看着这些已经完成的功能沾沾自喜，造成的结果就是，每天对着代码，看着之前已经实现过的功能，感觉好满足好开心，但是实际上自己" +
                    "的效率已经因为这些满足感变得非常低下，结果一个综合案例，拖拉拖拉到好久好久，觉得自己每天都在推进进度，实际上只是一点小修小改。还好自己已经意识到这个问题，所以现在的话，做什么之前，" +
                    "都会给自己定一个约束，用这种方式来避免之前的那种“自我满足”状态。既然立志要赚够1000枚金子，如果在赚了100枚时就开始自我满足，止步不前，拖拖拉拉，那剩下的900枚，终只是纸上谈兵沦为笑谈！对DD音乐" +
                    "来说，还好是按照预先的进度完成了。也正因之前对自己定下的约束，效率才能得到提升，有更多的时间去考虑后续要做的其他事情。",

                    "对于DD音乐的技术实现方式，就是很常规的SSM，最初也是打算使用前后端分离的形式来，但是思索再三还是放弃了。因为当初在开发网站的时候，对前后端的使用已经有了大体上的认识，如果此时再来一遍，" +
                    "总觉得有些走旧路的意思，另外上面也说过，DD音乐的实现其实并不复杂，在这种情况下还是用前后端分离的形式来，觉得有些杀鸡用牛刀了。但是打心底来说，一万个舍不得Vue，ElementUI这些东西呀，所以" +
                    "即便使用了JSP进行页面的构建，里面也还是有Vue以及ElementUI的影子，确实使用它们太方便了。虽然杀鸡不必要用牛刀，但是一些提高效率的方式也还是可以考虑的。",

                    "开发DD音乐之前就打算，如果一切按照进度能正常完成的话，就将其整理下，开源到GitHub上面，说实话，自己虽然很早就在社区注册了账户，但完全就是一伸手党（ps : GitHub平台上，仅就学习资源来说，确实" +
                    "非常非常非常非常丰富，于我而言确实帮助很大）。所以这次打算将这个项目开源，也能正式熟悉下GitHub的使用，发布自己的第一个开源项目，为开源做出一点贡献。这虽然看起来很小白，但至少是一个不错的开始，不是吗？",

                    "以后的某天，再回头看这个应用。或许又会找出一堆设计不合理，甚至说完全就是错误的地方，但还是如上面所说的，完全不会觉得自己的努力是白费的无意义的，没人生来就是圣人，也没人一步到位精通十八般武艺，" +
                    "能做的，就是在学习生活的道路上，默默努力提升自己，不骄不躁。如果说未来，这个应用仍不可避免的因为实现技术的不成熟而遭淘汰，那我想它在我的学习经历中，一定会是块儿帮助我提升的垫脚石，而非无意义" +
                    "的代码片段！要努力的还有很多，与君共勉！"

                ],
                list2 : [
                    "小感触",
                    "河南 · 郑州",
                    "2019-05-27 01:30",
                ],
                clientEnv : "pc",
            }
        },
        methods : {
            <jsp:include page="$methods.jsp"/>
        },
        mounted() {
            this.envListener();
        }
    });
</script>
</html>