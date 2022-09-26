/*
 * package kr.hs.study.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * import kr.hs.study.dto.boardDTO; import kr.hs.study.dto.memberDTO; import
 * kr.hs.study.service.boardInterface; import
 * kr.hs.study.service.memberInterface;
 * 
 * @Controller public class BoardController {
 * 
 * @Autowired private boardInterface boardService;
 * 
 * //리스트
 * 
 * @GetMapping("board") public String list() { return "board/index"; }
 * 
 * 
 * //글쓰기
 * 
 * @GetMapping("write") public String insert() {
 * 
 * return "board/write_form"; }
 * 
 * //인서트
 * 
 * @PostMapping("insert") public String register(boardDTO dto) {
 * System.out.print(dto.getWriter()); boardService.insert(dto); return "result";
 * 
 * }
 * 
 * 
 * //셀렉트
 * 
 * @GetMapping("select") public String list(Model model) { List<boardDTO>
 * list=boardService.select(); model.addAttribute("list",list); return
 * "board/list"; }
 * 
 * 
 * //업데이트 폼
 * 
 * @GetMapping("update_board") public String update_form(@RequestParam int
 * idx,Model model) { boardDTO list = boardService.read(idx);
 * model.addAttribute("list",list); return "board/update_form"; }
 * 
 * 
 * 
 * //업데이트
 * 
 * @PostMapping("update_board") public String update(boardDTO dto) {
 * boardService.update(dto); return "result"; }
 * 
 * 
 * //딜리트
 * 
 * @GetMapping("delete_board") public String delete(@RequestParam int idx,Model
 * model) { boardDTO list = boardService.delete(idx);
 * model.addAttribute("list",list); return "result"; }
 * 
 * 
 * 
 * }
 */