package org.koreait.board.entities2;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -450658114L;

    public static final QBoard board = new QBoard("board");

    public final org.koreait.global.entities.QBaseEntity _super = new org.koreait.global.entities.QBaseEntity(this);

    public final StringPath bid = createString("bid");

    public final StringPath bname = createString("bname");

    public final ListPath<BoardData, QBoardData> items = this.<BoardData, QBoardData>createList("items", BoardData.class, QBoardData.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDt = _super.modDt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDt = _super.regDt;

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

