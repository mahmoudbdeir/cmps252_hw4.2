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

@Tag("17")
class Record_4786 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4786: FirstName is Otha")
	void FirstNameOfRecord4786() {
		assertEquals("Otha", customers.get(4785).getFirstName());
	}

	@Test
	@DisplayName("Record 4786: LastName is Liebler")
	void LastNameOfRecord4786() {
		assertEquals("Liebler", customers.get(4785).getLastName());
	}

	@Test
	@DisplayName("Record 4786: Company is Renco Finishing Corp")
	void CompanyOfRecord4786() {
		assertEquals("Renco Finishing Corp", customers.get(4785).getCompany());
	}

	@Test
	@DisplayName("Record 4786: Address is Box #-27563")
	void AddressOfRecord4786() {
		assertEquals("Box #-27563", customers.get(4785).getAddress());
	}

	@Test
	@DisplayName("Record 4786: City is Salt Lake City")
	void CityOfRecord4786() {
		assertEquals("Salt Lake City", customers.get(4785).getCity());
	}

	@Test
	@DisplayName("Record 4786: County is Salt Lake")
	void CountyOfRecord4786() {
		assertEquals("Salt Lake", customers.get(4785).getCounty());
	}

	@Test
	@DisplayName("Record 4786: State is UT")
	void StateOfRecord4786() {
		assertEquals("UT", customers.get(4785).getState());
	}

	@Test
	@DisplayName("Record 4786: ZIP is 84127")
	void ZIPOfRecord4786() {
		assertEquals("84127", customers.get(4785).getZIP());
	}

	@Test
	@DisplayName("Record 4786: Phone is 801-262-1096")
	void PhoneOfRecord4786() {
		assertEquals("801-262-1096", customers.get(4785).getPhone());
	}

	@Test
	@DisplayName("Record 4786: Fax is 801-262-3584")
	void FaxOfRecord4786() {
		assertEquals("801-262-3584", customers.get(4785).getFax());
	}

	@Test
	@DisplayName("Record 4786: Email is otha@liebler.com")
	void EmailOfRecord4786() {
		assertEquals("otha@liebler.com", customers.get(4785).getEmail());
	}

	@Test
	@DisplayName("Record 4786: Web is http://www.othaliebler.com")
	void WebOfRecord4786() {
		assertEquals("http://www.othaliebler.com", customers.get(4785).getWeb());
	}
}
