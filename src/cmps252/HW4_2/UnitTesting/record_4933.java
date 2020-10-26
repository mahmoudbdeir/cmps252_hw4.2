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

@Tag("46")
class Record_4933 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4933: FirstName is Benita")
	void FirstNameOfRecord4933() {
		assertEquals("Benita", customers.get(4932).getFirstName());
	}

	@Test
	@DisplayName("Record 4933: LastName is Montas")
	void LastNameOfRecord4933() {
		assertEquals("Montas", customers.get(4932).getLastName());
	}

	@Test
	@DisplayName("Record 4933: Company is Rolfe, Craig A Esq")
	void CompanyOfRecord4933() {
		assertEquals("Rolfe, Craig A Esq", customers.get(4932).getCompany());
	}

	@Test
	@DisplayName("Record 4933: Address is 565 5th Ave")
	void AddressOfRecord4933() {
		assertEquals("565 5th Ave", customers.get(4932).getAddress());
	}

	@Test
	@DisplayName("Record 4933: City is New York")
	void CityOfRecord4933() {
		assertEquals("New York", customers.get(4932).getCity());
	}

	@Test
	@DisplayName("Record 4933: County is New York")
	void CountyOfRecord4933() {
		assertEquals("New York", customers.get(4932).getCounty());
	}

	@Test
	@DisplayName("Record 4933: State is NY")
	void StateOfRecord4933() {
		assertEquals("NY", customers.get(4932).getState());
	}

	@Test
	@DisplayName("Record 4933: ZIP is 10017")
	void ZIPOfRecord4933() {
		assertEquals("10017", customers.get(4932).getZIP());
	}

	@Test
	@DisplayName("Record 4933: Phone is 212-575-7842")
	void PhoneOfRecord4933() {
		assertEquals("212-575-7842", customers.get(4932).getPhone());
	}

	@Test
	@DisplayName("Record 4933: Fax is 212-575-7609")
	void FaxOfRecord4933() {
		assertEquals("212-575-7609", customers.get(4932).getFax());
	}

	@Test
	@DisplayName("Record 4933: Email is benita@montas.com")
	void EmailOfRecord4933() {
		assertEquals("benita@montas.com", customers.get(4932).getEmail());
	}

	@Test
	@DisplayName("Record 4933: Web is http://www.benitamontas.com")
	void WebOfRecord4933() {
		assertEquals("http://www.benitamontas.com", customers.get(4932).getWeb());
	}
}
