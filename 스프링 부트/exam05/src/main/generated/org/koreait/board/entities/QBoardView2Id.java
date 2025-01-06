package org.koreait.board.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardView2Id is a Querydsl query type for BoardView2Id
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QBoardView2Id extends BeanPath<BoardView2Id> {

    private static final long serialVersionUID = 1308504420L;

    public static final QBoardView2Id boardView2Id = new QBoardView2Id("boardView2Id");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final NumberPath<Integer> uid = createNumber("uid", Integer.class);

    public QBoardView2Id(String variable) {
        super(BoardView2Id.class, forVariable(variable));
    }

    public QBoardView2Id(Path<? extends BoardView2Id> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardView2Id(PathMetadata metadata) {
        super(BoardView2Id.class, metadata);
    }

}

