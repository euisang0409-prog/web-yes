package com.korea.movie_reservation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.movie_reservation.dao.ReservationDAO;
import com.korea.movie_reservation.vo.ReservationVO;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ReservationService {


	private final ReservationDAO reservationDAO;


	public int insertReservation(ReservationVO vo) {

		return reservationDAO.insertReservation(vo);

	}

	public int updateReservation(ReservationVO vo) {
		
		return reservationDAO.updateReservation(vo);
	}
	
	public List<ReservationVO> findReservationDetails(){

		return reservationDAO.findReservationDetails();

	}
}