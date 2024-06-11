package mappers;

import dtos.TransactionDto;
import model.Transaction;

public class TransactionMapper {
    public static Transaction mapFrom(TransactionDto transactionDto){
        return Transaction.builder()
                .id(transactionDto.id())
                .reservation(transactionDto.reservation())
                .amount(transactionDto.amount())
                .dateTime(transactionDto.dateTime())
                .payMethods(transactionDto.payMethods())
                .status(transactionDto.status())
                .build();
    }

    public static TransactionDto mapFrom(Transaction transaction){
        return TransactionDto.builder()
                .id(transaction.getId())
                .reservation(transaction.getReservation())
                .amount(transaction.getAmount())
                .dateTime(transaction.getDateTime())
                .payMethods(transaction.getPayMethods())
                .status(transaction.getStatus())
                .build();
    }
}
