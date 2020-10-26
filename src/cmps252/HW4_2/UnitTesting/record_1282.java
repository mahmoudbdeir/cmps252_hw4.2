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

@Tag("2")
class Record_1282 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1282: FirstName is Eula")
	void FirstNameOfRecord1282() {
		assertEquals("Eula", customers.get(1281).getFirstName());
	}

	@Test
	@DisplayName("Record 1282: LastName is Stonebarger")
	void LastNameOfRecord1282() {
		assertEquals("Stonebarger", customers.get(1281).getLastName());
	}

	@Test
	@DisplayName("Record 1282: Company is Coca Cola Bottling Co Cape Cod")
	void CompanyOfRecord1282() {
		assertEquals("Coca Cola Bottling Co Cape Cod", customers.get(1281).getCompany());
	}

	@Test
	@DisplayName("Record 1282: Address is 730 E Brevard St")
	void AddressOfRecord1282() {
		assertEquals("730 E Brevard St", customers.get(1281).getAddress());
	}

	@Test
	@DisplayName("Record 1282: City is Tallahassee")
	void CityOfRecord1282() {
		assertEquals("Tallahassee", customers.get(1281).getCity());
	}

	@Test
	@DisplayName("Record 1282: County is Leon")
	void CountyOfRecord1282() {
		assertEquals("Leon", customers.get(1281).getCounty());
	}

	@Test
	@DisplayName("Record 1282: State is FL")
	void StateOfRecord1282() {
		assertEquals("FL", customers.get(1281).getState());
	}

	@Test
	@DisplayName("Record 1282: ZIP is 32308")
	void ZIPOfRecord1282() {
		assertEquals("32308", customers.get(1281).getZIP());
	}

	@Test
	@DisplayName("Record 1282: Phone is 850-222-5102")
	void PhoneOfRecord1282() {
		assertEquals("850-222-5102", customers.get(1281).getPhone());
	}

	@Test
	@DisplayName("Record 1282: Fax is 850-222-0545")
	void FaxOfRecord1282() {
		assertEquals("850-222-0545", customers.get(1281).getFax());
	}

	@Test
	@DisplayName("Record 1282: Email is eula@stonebarger.com")
	void EmailOfRecord1282() {
		assertEquals("eula@stonebarger.com", customers.get(1281).getEmail());
	}

	@Test
	@DisplayName("Record 1282: Web is http://www.eulastonebarger.com")
	void WebOfRecord1282() {
		assertEquals("http://www.eulastonebarger.com", customers.get(1281).getWeb());
	}
}
