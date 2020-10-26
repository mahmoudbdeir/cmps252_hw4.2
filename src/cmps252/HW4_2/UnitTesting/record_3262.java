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

@Tag("10")
class Record_3262 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3262: FirstName is Jacinto")
	void FirstNameOfRecord3262() {
		assertEquals("Jacinto", customers.get(3261).getFirstName());
	}

	@Test
	@DisplayName("Record 3262: LastName is Buchta")
	void LastNameOfRecord3262() {
		assertEquals("Buchta", customers.get(3261).getLastName());
	}

	@Test
	@DisplayName("Record 3262: Company is Ses Staffing Solutions Inc")
	void CompanyOfRecord3262() {
		assertEquals("Ses Staffing Solutions Inc", customers.get(3261).getCompany());
	}

	@Test
	@DisplayName("Record 3262: Address is 1400 E Pomona St")
	void AddressOfRecord3262() {
		assertEquals("1400 E Pomona St", customers.get(3261).getAddress());
	}

	@Test
	@DisplayName("Record 3262: City is Santa Ana")
	void CityOfRecord3262() {
		assertEquals("Santa Ana", customers.get(3261).getCity());
	}

	@Test
	@DisplayName("Record 3262: County is Orange")
	void CountyOfRecord3262() {
		assertEquals("Orange", customers.get(3261).getCounty());
	}

	@Test
	@DisplayName("Record 3262: State is CA")
	void StateOfRecord3262() {
		assertEquals("CA", customers.get(3261).getState());
	}

	@Test
	@DisplayName("Record 3262: ZIP is 92705")
	void ZIPOfRecord3262() {
		assertEquals("92705", customers.get(3261).getZIP());
	}

	@Test
	@DisplayName("Record 3262: Phone is 714-541-6968")
	void PhoneOfRecord3262() {
		assertEquals("714-541-6968", customers.get(3261).getPhone());
	}

	@Test
	@DisplayName("Record 3262: Fax is 714-541-3569")
	void FaxOfRecord3262() {
		assertEquals("714-541-3569", customers.get(3261).getFax());
	}

	@Test
	@DisplayName("Record 3262: Email is jacinto@buchta.com")
	void EmailOfRecord3262() {
		assertEquals("jacinto@buchta.com", customers.get(3261).getEmail());
	}

	@Test
	@DisplayName("Record 3262: Web is http://www.jacintobuchta.com")
	void WebOfRecord3262() {
		assertEquals("http://www.jacintobuchta.com", customers.get(3261).getWeb());
	}
}
