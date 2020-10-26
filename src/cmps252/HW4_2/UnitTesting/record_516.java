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

@Tag("4")
class Record_516 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 516: FirstName is Leona")
	void FirstNameOfRecord516() {
		assertEquals("Leona", customers.get(515).getFirstName());
	}

	@Test
	@DisplayName("Record 516: LastName is Henthorn")
	void LastNameOfRecord516() {
		assertEquals("Henthorn", customers.get(515).getLastName());
	}

	@Test
	@DisplayName("Record 516: Company is Haivala, Robert Esq")
	void CompanyOfRecord516() {
		assertEquals("Haivala, Robert Esq", customers.get(515).getCompany());
	}

	@Test
	@DisplayName("Record 516: Address is 449 Main Ave")
	void AddressOfRecord516() {
		assertEquals("449 Main Ave", customers.get(515).getAddress());
	}

	@Test
	@DisplayName("Record 516: City is Passaic")
	void CityOfRecord516() {
		assertEquals("Passaic", customers.get(515).getCity());
	}

	@Test
	@DisplayName("Record 516: County is Passaic")
	void CountyOfRecord516() {
		assertEquals("Passaic", customers.get(515).getCounty());
	}

	@Test
	@DisplayName("Record 516: State is NJ")
	void StateOfRecord516() {
		assertEquals("NJ", customers.get(515).getState());
	}

	@Test
	@DisplayName("Record 516: ZIP is 7055")
	void ZIPOfRecord516() {
		assertEquals("7055", customers.get(515).getZIP());
	}

	@Test
	@DisplayName("Record 516: Phone is 973-471-5936")
	void PhoneOfRecord516() {
		assertEquals("973-471-5936", customers.get(515).getPhone());
	}

	@Test
	@DisplayName("Record 516: Fax is 973-471-1719")
	void FaxOfRecord516() {
		assertEquals("973-471-1719", customers.get(515).getFax());
	}

	@Test
	@DisplayName("Record 516: Email is leona@henthorn.com")
	void EmailOfRecord516() {
		assertEquals("leona@henthorn.com", customers.get(515).getEmail());
	}

	@Test
	@DisplayName("Record 516: Web is http://www.leonahenthorn.com")
	void WebOfRecord516() {
		assertEquals("http://www.leonahenthorn.com", customers.get(515).getWeb());
	}
}
