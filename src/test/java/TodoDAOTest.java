import com.ssg.webmvc.todo.dao.ConnectionUtil;
import com.ssg.webmvc.todo.dao.TodoDAO;
import com.ssg.webmvc.todo.domain.TodoVO;
import lombok.Cleanup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

public class TodoDAOTest {
    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDAO.getTime());

    }

    @Test
    public void testInsert() throws Exception {
        TodoVO vo = TodoVO.builder()
                .title("Sample Title todo..")
                .dueDate(LocalDate.now())
                .finished(true)
                .build();

        todoDAO.insert(vo);
    }

    @Test
    public void testselectAll() throws Exception {
        List<TodoVO> list = todoDAO.selectAll();
        list.forEach(System.out::println);
    }

    @Test
    public void testUpdate() throws Exception {
        TodoVO vo = TodoVO.builder()
                .tno(1L)
                .title("Updated Title")
                .dueDate(LocalDate.now())
                .finished(true)
                .build();
        todoDAO.updateOne(vo);
    }

    @Test
    public void testDelete() throws Exception {
        todoDAO.deleteOne(1L);
    }
}
