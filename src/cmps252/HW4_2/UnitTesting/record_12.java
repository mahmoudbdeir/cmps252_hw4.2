package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("20")
class Record_12 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 12: FirstName is Pattie")
	void FirstNameOfRecord12() {
		assertEquals("Pattie", customers.get(11).getFirstName());
	}

	@Test
	@DisplayName("Record 12: LastName is Brudnicki")
	void LastNameOfRecord12() {
		assertEquals("Brudnicki", customers.get(11).getLastName());
	}

	@Test
	@DisplayName("Record 12: Company is J Gilbert Parrish Jr")
	void CompanyOfRecord12() {
		assertEquals("J Gilbert Parrish Jr", customers.get(11).getCompany());
	}

	@Test
	@DisplayName("Record 12: Address is 1355 California Ave")
	void AddressOfRecord12() {
		assertEquals("1355 California Ave", customers.get(11).getAddress());
	}

	@Test
	@DisplayName("Record 12: City is Las Cruces")
	void CityOfRecord12() {
		assertEquals("Las Cruces", customers.get(11).getCity());
	}

	@Test
	@DisplayName("Record 12: County is Dona Ana")
	void CountyOfRecord12() {
		assertEquals("Dona Ana", customers.get(11).getCounty());
	}

	@Test
	@DisplayName("Record 12: State is NM")
	void StateOfRecord12() {
		assertEquals("NM", customers.get(11).getState());
	}

	@Test
	@DisplayName("Record 12: ZIP is 88001")
	void ZIPOfRecord12() {
		assertEquals("88001", customers.get(11).getZIP());
	}

	@Test
	@DisplayName("Record 12: Phone is 505-525-8255")
	void PhoneOfRecord12() {
		assertEquals("505-525-8255", customers.get(11).getPhone());
	}

	@Test
	@DisplayName("Record 12: Fax is 505-525-7556")
	void FaxOfRecord12() {
		assertEquals("505-525-7556", customers.get(11).getFax());
	}

	@Test
	@DisplayName("Record 12: Email is pattie@brudnicki.com")
	void EmailOfRecord12() {
		assertEquals("pattie@brudnicki.com", customers.get(11).getEmail());
	}

	@Test
	@DisplayName("Record 12: Web is http://www.pattiebrudnicki.com")
	void WebOfRecord12() {
		assertEquals("http://www.pattiebrudnicki.com", customers.get(11).getWeb());
	}
}
