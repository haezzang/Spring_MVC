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
 * //����Ʈ
 * 
 * @GetMapping("board") public String list() { return "board/index"; }
 * 
 * 
 * //�۾���
 * 
 * @GetMapping("write") public String insert() {
 * 
 * return "board/write_form"; }
 * 
 * //�μ�Ʈ
 * 
 * @PostMapping("insert") public String register(boardDTO dto) {
 * System.out.print(dto.getWriter()); boardService.insert(dto); return "result";
 * 
 * }
 * 
 * 
 * //����Ʈ
 * 
 * @GetMapping("select") public String list(Model model) { List<boardDTO>
 * list=boardService.select(); model.addAttribute("list",list); return
 * "board/list"; }
 * 
 * 
 * //������Ʈ ��
 * 
 * @GetMapping("update_board") public String update_form(@RequestParam int
 * idx,Model model) { boardDTO list = boardService.read(idx);
 * model.addAttribute("list",list); return "board/update_form"; }
 * 
 * 
 * 
 * //������Ʈ
 * 
 * @PostMapping("update_board") public String update(boardDTO dto) {
 * boardService.update(dto); return "result"; }
 * 
 * 
 * //����Ʈ
 * 
 * @GetMapping("delete_board") public String delete(@RequestParam int idx,Model
 * model) { boardDTO list = boardService.delete(idx);
 * model.addAttribute("list",list); return "result"; }
 * 
 * 
 * 
 * }
 */