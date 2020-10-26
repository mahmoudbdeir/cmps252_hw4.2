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
class Record_4856 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4856: FirstName is Cecelia")
	void FirstNameOfRecord4856() {
		assertEquals("Cecelia", customers.get(4855).getFirstName());
	}

	@Test
	@DisplayName("Record 4856: LastName is Mavro")
	void LastNameOfRecord4856() {
		assertEquals("Mavro", customers.get(4855).getLastName());
	}

	@Test
	@DisplayName("Record 4856: Company is First National Bank Dayton Oh")
	void CompanyOfRecord4856() {
		assertEquals("First National Bank Dayton Oh", customers.get(4855).getCompany());
	}

	@Test
	@DisplayName("Record 4856: Address is 615 Adams St")
	void AddressOfRecord4856() {
		assertEquals("615 Adams St", customers.get(4855).getAddress());
	}

	@Test
	@DisplayName("Record 4856: City is Toledo")
	void CityOfRecord4856() {
		assertEquals("Toledo", customers.get(4855).getCity());
	}

	@Test
	@DisplayName("Record 4856: County is Lucas")
	void CountyOfRecord4856() {
		assertEquals("Lucas", customers.get(4855).getCounty());
	}

	@Test
	@DisplayName("Record 4856: State is OH")
	void StateOfRecord4856() {
		assertEquals("OH", customers.get(4855).getState());
	}

	@Test
	@DisplayName("Record 4856: ZIP is 43604")
	void ZIPOfRecord4856() {
		assertEquals("43604", customers.get(4855).getZIP());
	}

	@Test
	@DisplayName("Record 4856: Phone is 419-241-9207")
	void PhoneOfRecord4856() {
		assertEquals("419-241-9207", customers.get(4855).getPhone());
	}

	@Test
	@DisplayName("Record 4856: Fax is 419-241-5048")
	void FaxOfRecord4856() {
		assertEquals("419-241-5048", customers.get(4855).getFax());
	}

	@Test
	@DisplayName("Record 4856: Email is cecelia@mavro.com")
	void EmailOfRecord4856() {
		assertEquals("cecelia@mavro.com", customers.get(4855).getEmail());
	}

	@Test
	@DisplayName("Record 4856: Web is http://www.ceceliamavro.com")
	void WebOfRecord4856() {
		assertEquals("http://www.ceceliamavro.com", customers.get(4855).getWeb());
	}
}
