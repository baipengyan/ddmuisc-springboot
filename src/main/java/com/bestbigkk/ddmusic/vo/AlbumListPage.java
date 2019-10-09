package com.bestbigkk.ddmusic.vo;

import com.bestbigkk.ddmusic.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @author 开
 */
@Component
@Scope(value="prototype")
public class AlbumListPage implements Serializable{

    private PageNotice pageNotice;
    private Pagination pagination;
    private List albumList;

    public AlbumListPage(PageNotice pageNotice) {
        this.pageNotice = pageNotice;
    }

    @Autowired
    public AlbumListPage(PageNotice pageNotice, Pagination pagination, List albumList) {
        this.pageNotice = pageNotice;
        this.pagination = pagination;
        this.albumList = albumList;
    }

    @Override
    public String toString() {
        return "AlbumListPage{" +
                "pageNotice=" + pageNotice +
                ", AlbumList=" + albumList +
                ", pagination=" + pagination +
                '}';
    }

    public PageNotice getPageNotice() {
        return pageNotice;
    }

    public void setPageNotice(PageNotice pageNotice) {
        this.pageNotice = pageNotice;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
