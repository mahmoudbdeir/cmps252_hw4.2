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

@Tag("25")
class Record_3906 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3906: FirstName is Clarissa")
	void FirstNameOfRecord3906() {
		assertEquals("Clarissa", customers.get(3905).getFirstName());
	}

	@Test
	@DisplayName("Record 3906: LastName is Ignasiak")
	void LastNameOfRecord3906() {
		assertEquals("Ignasiak", customers.get(3905).getLastName());
	}

	@Test
	@DisplayName("Record 3906: Company is Ralston Cycle")
	void CompanyOfRecord3906() {
		assertEquals("Ralston Cycle", customers.get(3905).getCompany());
	}

	@Test
	@DisplayName("Record 3906: Address is 10001 Lile Dr")
	void AddressOfRecord3906() {
		assertEquals("10001 Lile Dr", customers.get(3905).getAddress());
	}

	@Test
	@DisplayName("Record 3906: City is Little Rock")
	void CityOfRecord3906() {
		assertEquals("Little Rock", customers.get(3905).getCity());
	}

	@Test
	@DisplayName("Record 3906: County is Pulaski")
	void CountyOfRecord3906() {
		assertEquals("Pulaski", customers.get(3905).getCounty());
	}

	@Test
	@DisplayName("Record 3906: State is AR")
	void StateOfRecord3906() {
		assertEquals("AR", customers.get(3905).getState());
	}

	@Test
	@DisplayName("Record 3906: ZIP is 72205")
	void ZIPOfRecord3906() {
		assertEquals("72205", customers.get(3905).getZIP());
	}

	@Test
	@DisplayName("Record 3906: Phone is 501-221-8360")
	void PhoneOfRecord3906() {
		assertEquals("501-221-8360", customers.get(3905).getPhone());
	}

	@Test
	@DisplayName("Record 3906: Fax is 501-221-8307")
	void FaxOfRecord3906() {
		assertEquals("501-221-8307", customers.get(3905).getFax());
	}

	@Test
	@DisplayName("Record 3906: Email is clarissa@ignasiak.com")
	void EmailOfRecord3906() {
		assertEquals("clarissa@ignasiak.com", customers.get(3905).getEmail());
	}

	@Test
	@DisplayName("Record 3906: Web is http://www.clarissaignasiak.com")
	void WebOfRecord3906() {
		assertEquals("http://www.clarissaignasiak.com", customers.get(3905).getWeb());
	}
}
