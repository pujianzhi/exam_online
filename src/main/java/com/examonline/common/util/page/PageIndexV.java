package com.examonline.common.util.page;

public class PageIndexV {
    public static Integer[] getPageIndex(Integer currentPage,Integer totalPage,Integer[] pageIndexs){

        if(totalPage<=pageIndexs.length){
            pageIndexs = new Integer[totalPage];
            for (int i = 0; i <pageIndexs.length ; i++) {
                pageIndexs[i] = i+1;
            }
        }else {
//            pageIndexs = new Integer[5];
//                在前面
            if(currentPage+((pageIndexs.length-1)/2)>=totalPage){
                for (int i = 0,j = totalPage-pageIndexs.length; i < pageIndexs.length ; i++,j++) {
                    pageIndexs[i] = j+1;
                }
//                    在后面
            }else if (currentPage-((pageIndexs.length-1)/2)<=1){
                for (int i = 0; i <pageIndexs.length ; i++) {
                    pageIndexs[i] = i+1;
                }
//                    在中间
            }else {
                for (int i = 0, j = currentPage-((pageIndexs.length-1)/2); j < currentPage ; j++,i++) {
                    pageIndexs[i] = j;
                }
                pageIndexs[(pageIndexs.length-1)/2] = currentPage;
                for (int i = (pageIndexs.length-1)/2+1,j=currentPage; i <pageIndexs.length ; i++,j++) {
                    pageIndexs[i] = j+1;
                }
            }
        }
        return pageIndexs;
    }
}
