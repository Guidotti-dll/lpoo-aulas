package dao;

import model.Advogado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdvogadoDAO extends BaseDAO {

    private static Advogado resultsetToAdvogado(ResultSet rs) throws SQLException {
        Advogado advogado = new Advogado();
        advogado.setOabAdvogado(rs.getLong("id"));
        advogado.setNomeAdvogado(rs.getString("nome"));
        advogado.setEnderecoAdvogado(rs.getString("endereco"));
        advogado.setTelefoneAdvogado(rs.getString("telefone"));
        advogado.setBairroAdvogado(rs.getString("bairro"));
        advogado.setCepAdvogado(rs.getString("cep"));
        advogado.setEmailAdvogado(rs.getString("email"));

        return advogado;
    }


    public static List<Advogado> selectAllAdvogados () {
        final String sql = "SELECT * FROM advogados";
        try // try-witch-resource
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        ResultSet rs = pstmt.executeQuery();
                )
        {
            List<Advogado> advogadoList = new ArrayList<>();
            while (rs.next()) {
                advogadoList.add(resultsetToAdvogado(rs));
            }
            return advogadoList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Advogado selectAdvogadoById(Long id) {
        final String sql = "SELECT * FROM advogados WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            Advogado advogado = null;
            if (rs.next()) {
                advogado = resultsetToAdvogado(rs);
            }
            rs.close();
            return advogado;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean insertAdvogado(Advogado advogado) {
        final String sql = "INSERT INTO advogados (nome, endereco, telefone, bairro, cep , email) VALUES (?, ?, ?, ?, ?, ?)";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        )
        {
            pstmt.setString(1, advogado.getNomeAdvogado());
            pstmt.setString(2, advogado.getEnderecoAdvogado());
            pstmt.setString(3, advogado.getTelefoneAdvogado());
            pstmt.setString(4, advogado.getBairroAdvogado());
            pstmt.setString(5, advogado.getCepAdvogado());
            pstmt.setString(6, advogado.getEmailAdvogado());

            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateAdvogado(Advogado advogado) {
        final String sql = "UPDATE advogados SET nome=?, endereco=?, telefone=?, bairro=?, cep=?, email=?  WHERE id=?";
        try (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        )
        {
            pstmt.setString(1, advogado.getNomeAdvogado());
            pstmt.setString(2, advogado.getEnderecoAdvogado());
            pstmt.setString(3, advogado.getTelefoneAdvogado());
            pstmt.setString(4, advogado.getBairroAdvogado());
            pstmt.setString(5, advogado.getCepAdvogado());
            pstmt.setString(6, advogado.getEmailAdvogado());
            pstmt.setLong(7, advogado.getOabAdvogado());

            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteAdvogado(long id) {
        final String sql = "DELETE FROM advogados WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setLong(1, id);
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nLista de Advogados");
        List<Advogado> advogadoList = AdvogadoDAO.selectAllAdvogados();
        System.out.println(advogadoList);

        System.out.println("\nCriando um advogado");
        Advogado advogado = new Advogado("Mike Ross", "Rua 1", "+53995653487", "West Side", "93546-672", "mike@ross.net" );

        System.out.println(AdvogadoDAO.insertAdvogado(advogado));

        advogadoList = AdvogadoDAO.selectAllAdvogados();
        System.out.println("\nLista de advogados");
        System.out.println(advogadoList);

        System.out.println("\nAlterando um advogado");
        long advogadoId = advogadoList.get(advogadoList.size() - 1).getOabAdvogado();
        advogado = selectAdvogadoById(advogadoId);
        advogado.setBairroAdvogado("South Side");
        advogado.setEnderecoAdvogado("Rua 15");
        System.out.println(AdvogadoDAO.updateAdvogado(advogado));
        System.out.println("\nAdvogado Alterado: " + AdvogadoDAO.selectAdvogadoById(advogadoId));

        System.out.println("\nDeletando Advogado");
        System.out.println(deleteAdvogado(advogadoId));

        advogadoList = AdvogadoDAO.selectAllAdvogados();
        System.out.println("\nLista de advogados");
        System.out.println(advogadoList);

    }
}
