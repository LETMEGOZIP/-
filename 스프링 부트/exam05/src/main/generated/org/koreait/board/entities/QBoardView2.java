package org.koreait.board.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardView2 is a Querydsl query type for BoardView2
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardView2 extends EntityPathBase<BoardView2> {

    private static final long serialVersionUID = 1082924649L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardView2 boardView2 = new QBoardView2("boardView2");

    public final QBoardView2Id id;

    public QBoardView2(String variable) {
        this(BoardView2.class, forVariable(variable), INITS);
    }

    public QBoardView2(Path<? extends BoardView2> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardView2(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardView2(PathMetadata metadata, PathInits inits) {
        this(BoardView2.class, metadata, inits);
    }

    public QBoardView2(Class<? extends BoardView2> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QBoardView2Id(forProperty("id")) : null;
    }

}

