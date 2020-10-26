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

@Tag("44")
class Record_3558 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3558: FirstName is Phillis")
	void FirstNameOfRecord3558() {
		assertEquals("Phillis", customers.get(3557).getFirstName());
	}

	@Test
	@DisplayName("Record 3558: LastName is Arns")
	void LastNameOfRecord3558() {
		assertEquals("Arns", customers.get(3557).getLastName());
	}

	@Test
	@DisplayName("Record 3558: Company is Holiday Fair Inc")
	void CompanyOfRecord3558() {
		assertEquals("Holiday Fair Inc", customers.get(3557).getCompany());
	}

	@Test
	@DisplayName("Record 3558: Address is 2624 Jenks Ave")
	void AddressOfRecord3558() {
		assertEquals("2624 Jenks Ave", customers.get(3557).getAddress());
	}

	@Test
	@DisplayName("Record 3558: City is Panama City")
	void CityOfRecord3558() {
		assertEquals("Panama City", customers.get(3557).getCity());
	}

	@Test
	@DisplayName("Record 3558: County is Bay")
	void CountyOfRecord3558() {
		assertEquals("Bay", customers.get(3557).getCounty());
	}

	@Test
	@DisplayName("Record 3558: State is FL")
	void StateOfRecord3558() {
		assertEquals("FL", customers.get(3557).getState());
	}

	@Test
	@DisplayName("Record 3558: ZIP is 32405")
	void ZIPOfRecord3558() {
		assertEquals("32405", customers.get(3557).getZIP());
	}

	@Test
	@DisplayName("Record 3558: Phone is 850-769-4035")
	void PhoneOfRecord3558() {
		assertEquals("850-769-4035", customers.get(3557).getPhone());
	}

	@Test
	@DisplayName("Record 3558: Fax is 850-769-3176")
	void FaxOfRecord3558() {
		assertEquals("850-769-3176", customers.get(3557).getFax());
	}

	@Test
	@DisplayName("Record 3558: Email is phillis@arns.com")
	void EmailOfRecord3558() {
		assertEquals("phillis@arns.com", customers.get(3557).getEmail());
	}

	@Test
	@DisplayName("Record 3558: Web is http://www.phillisarns.com")
	void WebOfRecord3558() {
		assertEquals("http://www.phillisarns.com", customers.get(3557).getWeb());
	}
}
