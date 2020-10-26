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

@Tag("38")
class Record_4576 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4576: FirstName is Norris")
	void FirstNameOfRecord4576() {
		assertEquals("Norris", customers.get(4575).getFirstName());
	}

	@Test
	@DisplayName("Record 4576: LastName is Mestas")
	void LastNameOfRecord4576() {
		assertEquals("Mestas", customers.get(4575).getLastName());
	}

	@Test
	@DisplayName("Record 4576: Company is Willis Knighton Hlth & Fitns")
	void CompanyOfRecord4576() {
		assertEquals("Willis Knighton Hlth & Fitns", customers.get(4575).getCompany());
	}

	@Test
	@DisplayName("Record 4576: Address is 47 Langstaff Ave")
	void AddressOfRecord4576() {
		assertEquals("47 Langstaff Ave", customers.get(4575).getAddress());
	}

	@Test
	@DisplayName("Record 4576: City is Edison")
	void CityOfRecord4576() {
		assertEquals("Edison", customers.get(4575).getCity());
	}

	@Test
	@DisplayName("Record 4576: County is Middlesex")
	void CountyOfRecord4576() {
		assertEquals("Middlesex", customers.get(4575).getCounty());
	}

	@Test
	@DisplayName("Record 4576: State is NJ")
	void StateOfRecord4576() {
		assertEquals("NJ", customers.get(4575).getState());
	}

	@Test
	@DisplayName("Record 4576: ZIP is 8817")
	void ZIPOfRecord4576() {
		assertEquals("8817", customers.get(4575).getZIP());
	}

	@Test
	@DisplayName("Record 4576: Phone is 732-287-2048")
	void PhoneOfRecord4576() {
		assertEquals("732-287-2048", customers.get(4575).getPhone());
	}

	@Test
	@DisplayName("Record 4576: Fax is 732-287-3732")
	void FaxOfRecord4576() {
		assertEquals("732-287-3732", customers.get(4575).getFax());
	}

	@Test
	@DisplayName("Record 4576: Email is norris@mestas.com")
	void EmailOfRecord4576() {
		assertEquals("norris@mestas.com", customers.get(4575).getEmail());
	}

	@Test
	@DisplayName("Record 4576: Web is http://www.norrismestas.com")
	void WebOfRecord4576() {
		assertEquals("http://www.norrismestas.com", customers.get(4575).getWeb());
	}
}
