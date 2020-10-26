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

@Tag("0")
class Record_3673 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3673: FirstName is Hilda")
	void FirstNameOfRecord3673() {
		assertEquals("Hilda", customers.get(3672).getFirstName());
	}

	@Test
	@DisplayName("Record 3673: LastName is Zecchini")
	void LastNameOfRecord3673() {
		assertEquals("Zecchini", customers.get(3672).getLastName());
	}

	@Test
	@DisplayName("Record 3673: Company is Beswick, George W Esq")
	void CompanyOfRecord3673() {
		assertEquals("Beswick, George W Esq", customers.get(3672).getCompany());
	}

	@Test
	@DisplayName("Record 3673: Address is 7200 Nw 1st Ave")
	void AddressOfRecord3673() {
		assertEquals("7200 Nw 1st Ave", customers.get(3672).getAddress());
	}

	@Test
	@DisplayName("Record 3673: City is Miami")
	void CityOfRecord3673() {
		assertEquals("Miami", customers.get(3672).getCity());
	}

	@Test
	@DisplayName("Record 3673: County is Miami-Dade")
	void CountyOfRecord3673() {
		assertEquals("Miami-Dade", customers.get(3672).getCounty());
	}

	@Test
	@DisplayName("Record 3673: State is FL")
	void StateOfRecord3673() {
		assertEquals("FL", customers.get(3672).getState());
	}

	@Test
	@DisplayName("Record 3673: ZIP is 33150")
	void ZIPOfRecord3673() {
		assertEquals("33150", customers.get(3672).getZIP());
	}

	@Test
	@DisplayName("Record 3673: Phone is 305-757-4322")
	void PhoneOfRecord3673() {
		assertEquals("305-757-4322", customers.get(3672).getPhone());
	}

	@Test
	@DisplayName("Record 3673: Fax is 305-757-6654")
	void FaxOfRecord3673() {
		assertEquals("305-757-6654", customers.get(3672).getFax());
	}

	@Test
	@DisplayName("Record 3673: Email is hilda@zecchini.com")
	void EmailOfRecord3673() {
		assertEquals("hilda@zecchini.com", customers.get(3672).getEmail());
	}

	@Test
	@DisplayName("Record 3673: Web is http://www.hildazecchini.com")
	void WebOfRecord3673() {
		assertEquals("http://www.hildazecchini.com", customers.get(3672).getWeb());
	}
}
