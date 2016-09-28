package com.korea.message.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.dto.MessageVO;
import com.korea.dto.MessageViewVO;
import com.korea.dto.UsersVO;

@Repository
public class MessageDAOImpl implements MessageDAO{
	
	@Autowired
	SqlSession session;

	@Override
	public List<MessageVO> getMessageNewList(UsersVO usersVO) {
		return session.selectList("Message.messageNewList", usersVO);
	}
	@Override
	public List<MessageVO> getMessageAllList(String id) {
		return session.selectList("Message.messageAllList", id);
	}
	@Override
	public MessageVO getMessageInfo(String message_no) {
		return (MessageVO) session.selectOne("Message.messageInfo", message_no);
	}
	@Override
	public List<MessageViewVO> getMessageUserSearch() {
		return session.selectList("Message.messageUserSearch");
	}
	@Override
	public void insertMessage(MessageVO messageVO) {
		session.insert("Message.messageInsert", messageVO);
	}
	@Override
	public void updateMessageDel(MessageVO messageVO) {
		session.delete("Message.messageDelete", messageVO);
	}
	@Override
	public void updateMessageRead(String message_no) {
		session.update("Message.messageReadUpdate",message_no);
	}
}
