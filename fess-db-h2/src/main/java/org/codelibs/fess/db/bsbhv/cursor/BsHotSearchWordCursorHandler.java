package org.codelibs.fess.db.bsbhv.cursor;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.dbflute.jdbc.CursorHandler;
import org.codelibs.fess.db.exbhv.cursor.HotSearchWordCursor;

/**
 * The cursor handler of HotSearchWord.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsHotSearchWordCursorHandler implements CursorHandler {

    /**
     * Handle the cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException When it fails to handle the SQL.
     */
    public Object handle(ResultSet rs) throws SQLException {
        return fetchCursor(createTypeSafeCursor(rs));
    }

    /**
     * Create the type-safe cursor.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     * @return The created type-safe cursor. (NotNull)
     * @throws SQLException When it fails to handle the SQL.
     */
    protected HotSearchWordCursor createTypeSafeCursor(ResultSet rs) throws SQLException {
        final HotSearchWordCursor cursor = new HotSearchWordCursor();
        cursor.accept(rs);
        return cursor;
    }

    /**
     * Fetch the cursor.
     * @param cursor The type-safe cursor for the query, which has first pointer. (NotNull)
     * @return The result object of handling process. (NullAllowed)
     * @throws SQLException When it fails to handle the SQL.
     */
    protected abstract Object fetchCursor(HotSearchWordCursor cursor) throws SQLException;
}
