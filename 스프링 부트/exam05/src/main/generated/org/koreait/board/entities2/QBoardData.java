package org.koreait.board.entities2;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardData is a Querydsl query type for BoardData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardData extends EntityPathBase<BoardData> {

    private static final long serialVersionUID = -1309059704L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardData boardData = new QBoardData("boardData");

    public final org.koreait.global.entities.QBaseEntity _super = new org.koreait.global.entities.QBaseEntity(this);

    public final QBoard board;

    public final StringPath content = createString("content");

    public final org.koreait.member.entities.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDt = _super.modDt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDt = _super.regDt;

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath subject = createString("subject");

    public final ListPath<HashTag, QHashTag> tags = this.<HashTag, QHashTag>createList("tags", HashTag.class, QHashTag.class, PathInits.DIRECT2);

    public QBoardData(String variable) {
        this(BoardData.class, forVariable(variable), INITS);
    }

    public QBoardData(Path<? extends BoardData> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardData(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardData(PathMetadata metadata, PathInits inits) {
        this(BoardData.class, metadata, inits);
    }

    public QBoardData(Class<? extends BoardData> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board")) : null;
        this.member = inits.isInitialized("member") ? new org.koreait.member.entities.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

