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

@Tag("33")
class Record_1345 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1345: FirstName is Jeanna")
	void FirstNameOfRecord1345() {
		assertEquals("Jeanna", customers.get(1344).getFirstName());
	}

	@Test
	@DisplayName("Record 1345: LastName is Zellmer")
	void LastNameOfRecord1345() {
		assertEquals("Zellmer", customers.get(1344).getLastName());
	}

	@Test
	@DisplayName("Record 1345: Company is Rockwell International")
	void CompanyOfRecord1345() {
		assertEquals("Rockwell International", customers.get(1344).getCompany());
	}

	@Test
	@DisplayName("Record 1345: Address is 1960 E Devon Ave")
	void AddressOfRecord1345() {
		assertEquals("1960 E Devon Ave", customers.get(1344).getAddress());
	}

	@Test
	@DisplayName("Record 1345: City is Elk Grove Village")
	void CityOfRecord1345() {
		assertEquals("Elk Grove Village", customers.get(1344).getCity());
	}

	@Test
	@DisplayName("Record 1345: County is Cook")
	void CountyOfRecord1345() {
		assertEquals("Cook", customers.get(1344).getCounty());
	}

	@Test
	@DisplayName("Record 1345: State is IL")
	void StateOfRecord1345() {
		assertEquals("IL", customers.get(1344).getState());
	}

	@Test
	@DisplayName("Record 1345: ZIP is 60007")
	void ZIPOfRecord1345() {
		assertEquals("60007", customers.get(1344).getZIP());
	}

	@Test
	@DisplayName("Record 1345: Phone is 847-981-2564")
	void PhoneOfRecord1345() {
		assertEquals("847-981-2564", customers.get(1344).getPhone());
	}

	@Test
	@DisplayName("Record 1345: Fax is 847-981-7896")
	void FaxOfRecord1345() {
		assertEquals("847-981-7896", customers.get(1344).getFax());
	}

	@Test
	@DisplayName("Record 1345: Email is jeanna@zellmer.com")
	void EmailOfRecord1345() {
		assertEquals("jeanna@zellmer.com", customers.get(1344).getEmail());
	}

	@Test
	@DisplayName("Record 1345: Web is http://www.jeannazellmer.com")
	void WebOfRecord1345() {
		assertEquals("http://www.jeannazellmer.com", customers.get(1344).getWeb());
	}
}
