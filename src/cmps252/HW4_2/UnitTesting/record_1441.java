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

@Tag("47")
class Record_1441 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1441: FirstName is Christa")
	void FirstNameOfRecord1441() {
		assertEquals("Christa", customers.get(1440).getFirstName());
	}

	@Test
	@DisplayName("Record 1441: LastName is Ginty")
	void LastNameOfRecord1441() {
		assertEquals("Ginty", customers.get(1440).getLastName());
	}

	@Test
	@DisplayName("Record 1441: Company is Industrial Savings & Loan Assn")
	void CompanyOfRecord1441() {
		assertEquals("Industrial Savings & Loan Assn", customers.get(1440).getCompany());
	}

	@Test
	@DisplayName("Record 1441: Address is 717 N Plankinton Ave")
	void AddressOfRecord1441() {
		assertEquals("717 N Plankinton Ave", customers.get(1440).getAddress());
	}

	@Test
	@DisplayName("Record 1441: City is Milwaukee")
	void CityOfRecord1441() {
		assertEquals("Milwaukee", customers.get(1440).getCity());
	}

	@Test
	@DisplayName("Record 1441: County is Milwaukee")
	void CountyOfRecord1441() {
		assertEquals("Milwaukee", customers.get(1440).getCounty());
	}

	@Test
	@DisplayName("Record 1441: State is WI")
	void StateOfRecord1441() {
		assertEquals("WI", customers.get(1440).getState());
	}

	@Test
	@DisplayName("Record 1441: ZIP is 53203")
	void ZIPOfRecord1441() {
		assertEquals("53203", customers.get(1440).getZIP());
	}

	@Test
	@DisplayName("Record 1441: Phone is 414-272-8553")
	void PhoneOfRecord1441() {
		assertEquals("414-272-8553", customers.get(1440).getPhone());
	}

	@Test
	@DisplayName("Record 1441: Fax is 414-272-9377")
	void FaxOfRecord1441() {
		assertEquals("414-272-9377", customers.get(1440).getFax());
	}

	@Test
	@DisplayName("Record 1441: Email is christa@ginty.com")
	void EmailOfRecord1441() {
		assertEquals("christa@ginty.com", customers.get(1440).getEmail());
	}

	@Test
	@DisplayName("Record 1441: Web is http://www.christaginty.com")
	void WebOfRecord1441() {
		assertEquals("http://www.christaginty.com", customers.get(1440).getWeb());
	}
}
