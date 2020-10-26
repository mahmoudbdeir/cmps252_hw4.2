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

@Tag("37")
class Record_4773 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4773: FirstName is Olin")
	void FirstNameOfRecord4773() {
		assertEquals("Olin", customers.get(4772).getFirstName());
	}

	@Test
	@DisplayName("Record 4773: LastName is Huckle")
	void LastNameOfRecord4773() {
		assertEquals("Huckle", customers.get(4772).getLastName());
	}

	@Test
	@DisplayName("Record 4773: Company is Big Johns Trophies")
	void CompanyOfRecord4773() {
		assertEquals("Big Johns Trophies", customers.get(4772).getCompany());
	}

	@Test
	@DisplayName("Record 4773: Address is 405 Park Ave")
	void AddressOfRecord4773() {
		assertEquals("405 Park Ave", customers.get(4772).getAddress());
	}

	@Test
	@DisplayName("Record 4773: City is New York")
	void CityOfRecord4773() {
		assertEquals("New York", customers.get(4772).getCity());
	}

	@Test
	@DisplayName("Record 4773: County is New York")
	void CountyOfRecord4773() {
		assertEquals("New York", customers.get(4772).getCounty());
	}

	@Test
	@DisplayName("Record 4773: State is NY")
	void StateOfRecord4773() {
		assertEquals("NY", customers.get(4772).getState());
	}

	@Test
	@DisplayName("Record 4773: ZIP is 10022")
	void ZIPOfRecord4773() {
		assertEquals("10022", customers.get(4772).getZIP());
	}

	@Test
	@DisplayName("Record 4773: Phone is 212-644-4094")
	void PhoneOfRecord4773() {
		assertEquals("212-644-4094", customers.get(4772).getPhone());
	}

	@Test
	@DisplayName("Record 4773: Fax is 212-644-7227")
	void FaxOfRecord4773() {
		assertEquals("212-644-7227", customers.get(4772).getFax());
	}

	@Test
	@DisplayName("Record 4773: Email is olin@huckle.com")
	void EmailOfRecord4773() {
		assertEquals("olin@huckle.com", customers.get(4772).getEmail());
	}

	@Test
	@DisplayName("Record 4773: Web is http://www.olinhuckle.com")
	void WebOfRecord4773() {
		assertEquals("http://www.olinhuckle.com", customers.get(4772).getWeb());
	}
}
