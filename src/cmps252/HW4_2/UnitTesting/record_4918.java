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

@Tag("30")
class Record_4918 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4918: FirstName is Craig")
	void FirstNameOfRecord4918() {
		assertEquals("Craig", customers.get(4917).getFirstName());
	}

	@Test
	@DisplayName("Record 4918: LastName is Pile")
	void LastNameOfRecord4918() {
		assertEquals("Pile", customers.get(4917).getLastName());
	}

	@Test
	@DisplayName("Record 4918: Company is Genesee Stamp & Stationery Inc")
	void CompanyOfRecord4918() {
		assertEquals("Genesee Stamp & Stationery Inc", customers.get(4917).getCompany());
	}

	@Test
	@DisplayName("Record 4918: Address is 1560 Broadway")
	void AddressOfRecord4918() {
		assertEquals("1560 Broadway", customers.get(4917).getAddress());
	}

	@Test
	@DisplayName("Record 4918: City is Denver")
	void CityOfRecord4918() {
		assertEquals("Denver", customers.get(4917).getCity());
	}

	@Test
	@DisplayName("Record 4918: County is Denver")
	void CountyOfRecord4918() {
		assertEquals("Denver", customers.get(4917).getCounty());
	}

	@Test
	@DisplayName("Record 4918: State is CO")
	void StateOfRecord4918() {
		assertEquals("CO", customers.get(4917).getState());
	}

	@Test
	@DisplayName("Record 4918: ZIP is 80202")
	void ZIPOfRecord4918() {
		assertEquals("80202", customers.get(4917).getZIP());
	}

	@Test
	@DisplayName("Record 4918: Phone is 303-894-7994")
	void PhoneOfRecord4918() {
		assertEquals("303-894-7994", customers.get(4917).getPhone());
	}

	@Test
	@DisplayName("Record 4918: Fax is 303-894-4449")
	void FaxOfRecord4918() {
		assertEquals("303-894-4449", customers.get(4917).getFax());
	}

	@Test
	@DisplayName("Record 4918: Email is craig@pile.com")
	void EmailOfRecord4918() {
		assertEquals("craig@pile.com", customers.get(4917).getEmail());
	}

	@Test
	@DisplayName("Record 4918: Web is http://www.craigpile.com")
	void WebOfRecord4918() {
		assertEquals("http://www.craigpile.com", customers.get(4917).getWeb());
	}
}
