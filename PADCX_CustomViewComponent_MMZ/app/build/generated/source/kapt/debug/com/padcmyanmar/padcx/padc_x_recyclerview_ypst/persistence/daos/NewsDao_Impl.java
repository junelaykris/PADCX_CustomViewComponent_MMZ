package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.daos;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO;
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO;
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.PublicationVO;
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO;
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.typeconverters.CommentListTypeConverter;
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.typeconverters.LikeUsersTypeConverter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsVO> __insertionAdapterOfNewsVO;

  private final LikeUsersTypeConverter __likeUsersTypeConverter = new LikeUsersTypeConverter();

  private final CommentListTypeConverter __commentListTypeConverter = new CommentListTypeConverter();

  private final EntityDeletionOrUpdateAdapter<NewsVO> __deletionAdapterOfNewsVO;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsVO = new EntityInsertionAdapter<NewsVO>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `news` (`id`,`title`,`heroImage`,`description`,`likedUsers`,`comments`,`publicationName`,`postedDate`,`postedTime`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsVO value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getHeroImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHeroImage());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        final String _tmp;
        _tmp = __likeUsersTypeConverter.toString(value.getLikedUsers());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __commentListTypeConverter.toString(value.getComments());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        final PublicationVO _tmpPublication = value.getPublication();
        if(_tmpPublication != null) {
          if (_tmpPublication.getPublicationName() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpPublication.getPublicationName());
          }
          if (_tmpPublication.getPostedDate() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpPublication.getPostedDate());
          }
          if (_tmpPublication.getPostedTime() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpPublication.getPostedTime());
          }
        } else {
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
        }
      }
    };
    this.__deletionAdapterOfNewsVO = new EntityDeletionOrUpdateAdapter<NewsVO>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `news` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsVO value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM news";
        return _query;
      }
    };
  }

  @Override
  public void insertNews(final NewsVO noteVO) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNewsVO.insert(noteVO);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllNews(final List<NewsVO> news) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNewsVO.insert(news);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteNews(final NewsVO note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfNewsVO.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<NewsVO>> getAllNews() {
    final String _sql = "SELECT * FROM news";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"news"}, false, new Callable<List<NewsVO>>() {
      @Override
      public List<NewsVO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfHeroImage = CursorUtil.getColumnIndexOrThrow(_cursor, "heroImage");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfLikedUsers = CursorUtil.getColumnIndexOrThrow(_cursor, "likedUsers");
          final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(_cursor, "comments");
          final int _cursorIndexOfPublicationName = CursorUtil.getColumnIndexOrThrow(_cursor, "publicationName");
          final int _cursorIndexOfPostedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "postedDate");
          final int _cursorIndexOfPostedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "postedTime");
          final List<NewsVO> _result = new ArrayList<NewsVO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NewsVO _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpHeroImage;
            _tmpHeroImage = _cursor.getString(_cursorIndexOfHeroImage);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final ArrayList<UserVO> _tmpLikedUsers;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfLikedUsers);
            _tmpLikedUsers = __likeUsersTypeConverter.toUserList(_tmp);
            final ArrayList<CommentVO> _tmpComments;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfComments);
            _tmpComments = __commentListTypeConverter.toCommentList(_tmp_1);
            final PublicationVO _tmpPublication;
            if (! (_cursor.isNull(_cursorIndexOfPublicationName) && _cursor.isNull(_cursorIndexOfPostedDate) && _cursor.isNull(_cursorIndexOfPostedTime))) {
              final String _tmpPublicationName;
              _tmpPublicationName = _cursor.getString(_cursorIndexOfPublicationName);
              final String _tmpPostedDate;
              _tmpPostedDate = _cursor.getString(_cursorIndexOfPostedDate);
              final String _tmpPostedTime;
              _tmpPostedTime = _cursor.getString(_cursorIndexOfPostedTime);
              _tmpPublication = new PublicationVO(_tmpPublicationName,_tmpPostedDate,_tmpPostedTime);
            }  else  {
              _tmpPublication = null;
            }
            _item = new NewsVO(_tmpId,_tmpTitle,_tmpHeroImage,_tmpDescription,_tmpPublication,_tmpLikedUsers,_tmpComments);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<NewsVO> getNewsById(final int noteId) {
    final String _sql = "SELECT * FROM news WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, noteId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"news"}, false, new Callable<NewsVO>() {
      @Override
      public NewsVO call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfHeroImage = CursorUtil.getColumnIndexOrThrow(_cursor, "heroImage");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfLikedUsers = CursorUtil.getColumnIndexOrThrow(_cursor, "likedUsers");
          final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(_cursor, "comments");
          final int _cursorIndexOfPublicationName = CursorUtil.getColumnIndexOrThrow(_cursor, "publicationName");
          final int _cursorIndexOfPostedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "postedDate");
          final int _cursorIndexOfPostedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "postedTime");
          final NewsVO _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpHeroImage;
            _tmpHeroImage = _cursor.getString(_cursorIndexOfHeroImage);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final ArrayList<UserVO> _tmpLikedUsers;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfLikedUsers);
            _tmpLikedUsers = __likeUsersTypeConverter.toUserList(_tmp);
            final ArrayList<CommentVO> _tmpComments;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfComments);
            _tmpComments = __commentListTypeConverter.toCommentList(_tmp_1);
            final PublicationVO _tmpPublication;
            if (! (_cursor.isNull(_cursorIndexOfPublicationName) && _cursor.isNull(_cursorIndexOfPostedDate) && _cursor.isNull(_cursorIndexOfPostedTime))) {
              final String _tmpPublicationName;
              _tmpPublicationName = _cursor.getString(_cursorIndexOfPublicationName);
              final String _tmpPostedDate;
              _tmpPostedDate = _cursor.getString(_cursorIndexOfPostedDate);
              final String _tmpPostedTime;
              _tmpPostedTime = _cursor.getString(_cursorIndexOfPostedTime);
              _tmpPublication = new PublicationVO(_tmpPublicationName,_tmpPostedDate,_tmpPostedTime);
            }  else  {
              _tmpPublication = null;
            }
            _result = new NewsVO(_tmpId,_tmpTitle,_tmpHeroImage,_tmpDescription,_tmpPublication,_tmpLikedUsers,_tmpComments);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
