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

@Tag("14")
class Record_51 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 51: FirstName is Nicholas")
	void FirstNameOfRecord51() {
		assertEquals("Nicholas", customers.get(50).getFirstName());
	}

	@Test
	@DisplayName("Record 51: LastName is Engelson")
	void LastNameOfRecord51() {
		assertEquals("Engelson", customers.get(50).getLastName());
	}

	@Test
	@DisplayName("Record 51: Company is Apollo Glass Co")
	void CompanyOfRecord51() {
		assertEquals("Apollo Glass Co", customers.get(50).getCompany());
	}

	@Test
	@DisplayName("Record 51: Address is 11808 Highway 93")
	void AddressOfRecord51() {
		assertEquals("11808 Highway 93", customers.get(50).getAddress());
	}

	@Test
	@DisplayName("Record 51: City is Boulder")
	void CityOfRecord51() {
		assertEquals("Boulder", customers.get(50).getCity());
	}

	@Test
	@DisplayName("Record 51: County is Boulder")
	void CountyOfRecord51() {
		assertEquals("Boulder", customers.get(50).getCounty());
	}

	@Test
	@DisplayName("Record 51: State is CO")
	void StateOfRecord51() {
		assertEquals("CO", customers.get(50).getState());
	}

	@Test
	@DisplayName("Record 51: ZIP is 80303")
	void ZIPOfRecord51() {
		assertEquals("80303", customers.get(50).getZIP());
	}

	@Test
	@DisplayName("Record 51: Phone is 303-499-1368")
	void PhoneOfRecord51() {
		assertEquals("303-499-1368", customers.get(50).getPhone());
	}

	@Test
	@DisplayName("Record 51: Fax is 303-499-1406")
	void FaxOfRecord51() {
		assertEquals("303-499-1406", customers.get(50).getFax());
	}

	@Test
	@DisplayName("Record 51: Email is nicholas@engelson.com")
	void EmailOfRecord51() {
		assertEquals("nicholas@engelson.com", customers.get(50).getEmail());
	}

	@Test
	@DisplayName("Record 51: Web is http://www.nicholasengelson.com")
	void WebOfRecord51() {
		assertEquals("http://www.nicholasengelson.com", customers.get(50).getWeb());
	}
}
