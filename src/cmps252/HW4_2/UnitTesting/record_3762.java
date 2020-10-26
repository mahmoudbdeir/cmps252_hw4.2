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

@Tag("11")
class Record_3762 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3762: FirstName is Aldo")
	void FirstNameOfRecord3762() {
		assertEquals("Aldo", customers.get(3761).getFirstName());
	}

	@Test
	@DisplayName("Record 3762: LastName is Heck")
	void LastNameOfRecord3762() {
		assertEquals("Heck", customers.get(3761).getLastName());
	}

	@Test
	@DisplayName("Record 3762: Company is General Graphics Co Inc")
	void CompanyOfRecord3762() {
		assertEquals("General Graphics Co Inc", customers.get(3761).getCompany());
	}

	@Test
	@DisplayName("Record 3762: Address is 540 B Blue Ridge Blvd")
	void AddressOfRecord3762() {
		assertEquals("540 B Blue Ridge Blvd", customers.get(3761).getAddress());
	}

	@Test
	@DisplayName("Record 3762: City is Blue Ridge")
	void CityOfRecord3762() {
		assertEquals("Blue Ridge", customers.get(3761).getCity());
	}

	@Test
	@DisplayName("Record 3762: County is Botetourt")
	void CountyOfRecord3762() {
		assertEquals("Botetourt", customers.get(3761).getCounty());
	}

	@Test
	@DisplayName("Record 3762: State is VA")
	void StateOfRecord3762() {
		assertEquals("VA", customers.get(3761).getState());
	}

	@Test
	@DisplayName("Record 3762: ZIP is 24064")
	void ZIPOfRecord3762() {
		assertEquals("24064", customers.get(3761).getZIP());
	}

	@Test
	@DisplayName("Record 3762: Phone is 540-977-0380")
	void PhoneOfRecord3762() {
		assertEquals("540-977-0380", customers.get(3761).getPhone());
	}

	@Test
	@DisplayName("Record 3762: Fax is 540-977-5856")
	void FaxOfRecord3762() {
		assertEquals("540-977-5856", customers.get(3761).getFax());
	}

	@Test
	@DisplayName("Record 3762: Email is aldo@heck.com")
	void EmailOfRecord3762() {
		assertEquals("aldo@heck.com", customers.get(3761).getEmail());
	}

	@Test
	@DisplayName("Record 3762: Web is http://www.aldoheck.com")
	void WebOfRecord3762() {
		assertEquals("http://www.aldoheck.com", customers.get(3761).getWeb());
	}
}
