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

@Tag("39")
class Record_4225 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4225: FirstName is Jeremiah")
	void FirstNameOfRecord4225() {
		assertEquals("Jeremiah", customers.get(4224).getFirstName());
	}

	@Test
	@DisplayName("Record 4225: LastName is Sutulovich")
	void LastNameOfRecord4225() {
		assertEquals("Sutulovich", customers.get(4224).getLastName());
	}

	@Test
	@DisplayName("Record 4225: Company is Ohio Inspection Services")
	void CompanyOfRecord4225() {
		assertEquals("Ohio Inspection Services", customers.get(4224).getCompany());
	}

	@Test
	@DisplayName("Record 4225: Address is 7645 E Evans Rd")
	void AddressOfRecord4225() {
		assertEquals("7645 E Evans Rd", customers.get(4224).getAddress());
	}

	@Test
	@DisplayName("Record 4225: City is Scottsdale")
	void CityOfRecord4225() {
		assertEquals("Scottsdale", customers.get(4224).getCity());
	}

	@Test
	@DisplayName("Record 4225: County is Maricopa")
	void CountyOfRecord4225() {
		assertEquals("Maricopa", customers.get(4224).getCounty());
	}

	@Test
	@DisplayName("Record 4225: State is AZ")
	void StateOfRecord4225() {
		assertEquals("AZ", customers.get(4224).getState());
	}

	@Test
	@DisplayName("Record 4225: ZIP is 85260")
	void ZIPOfRecord4225() {
		assertEquals("85260", customers.get(4224).getZIP());
	}

	@Test
	@DisplayName("Record 4225: Phone is 480-443-0505")
	void PhoneOfRecord4225() {
		assertEquals("480-443-0505", customers.get(4224).getPhone());
	}

	@Test
	@DisplayName("Record 4225: Fax is 480-443-9297")
	void FaxOfRecord4225() {
		assertEquals("480-443-9297", customers.get(4224).getFax());
	}

	@Test
	@DisplayName("Record 4225: Email is jeremiah@sutulovich.com")
	void EmailOfRecord4225() {
		assertEquals("jeremiah@sutulovich.com", customers.get(4224).getEmail());
	}

	@Test
	@DisplayName("Record 4225: Web is http://www.jeremiahsutulovich.com")
	void WebOfRecord4225() {
		assertEquals("http://www.jeremiahsutulovich.com", customers.get(4224).getWeb());
	}
}
