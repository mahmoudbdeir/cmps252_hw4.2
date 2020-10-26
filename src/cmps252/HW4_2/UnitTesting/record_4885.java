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
class Record_4885 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4885: FirstName is Jasper")
	void FirstNameOfRecord4885() {
		assertEquals("Jasper", customers.get(4884).getFirstName());
	}

	@Test
	@DisplayName("Record 4885: LastName is Klingensmith")
	void LastNameOfRecord4885() {
		assertEquals("Klingensmith", customers.get(4884).getLastName());
	}

	@Test
	@DisplayName("Record 4885: Company is J G L Associates Inc")
	void CompanyOfRecord4885() {
		assertEquals("J G L Associates Inc", customers.get(4884).getCompany());
	}

	@Test
	@DisplayName("Record 4885: Address is 76 Acco Dr")
	void AddressOfRecord4885() {
		assertEquals("76 Acco Dr", customers.get(4884).getAddress());
	}

	@Test
	@DisplayName("Record 4885: City is York")
	void CityOfRecord4885() {
		assertEquals("York", customers.get(4884).getCity());
	}

	@Test
	@DisplayName("Record 4885: County is York")
	void CountyOfRecord4885() {
		assertEquals("York", customers.get(4884).getCounty());
	}

	@Test
	@DisplayName("Record 4885: State is PA")
	void StateOfRecord4885() {
		assertEquals("PA", customers.get(4884).getState());
	}

	@Test
	@DisplayName("Record 4885: ZIP is 17402")
	void ZIPOfRecord4885() {
		assertEquals("17402", customers.get(4884).getZIP());
	}

	@Test
	@DisplayName("Record 4885: Phone is 717-741-1407")
	void PhoneOfRecord4885() {
		assertEquals("717-741-1407", customers.get(4884).getPhone());
	}

	@Test
	@DisplayName("Record 4885: Fax is 717-741-9859")
	void FaxOfRecord4885() {
		assertEquals("717-741-9859", customers.get(4884).getFax());
	}

	@Test
	@DisplayName("Record 4885: Email is jasper@klingensmith.com")
	void EmailOfRecord4885() {
		assertEquals("jasper@klingensmith.com", customers.get(4884).getEmail());
	}

	@Test
	@DisplayName("Record 4885: Web is http://www.jasperklingensmith.com")
	void WebOfRecord4885() {
		assertEquals("http://www.jasperklingensmith.com", customers.get(4884).getWeb());
	}
}
