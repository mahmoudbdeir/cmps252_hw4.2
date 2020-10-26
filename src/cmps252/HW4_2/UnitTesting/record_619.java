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

@Tag("48")
class Record_619 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 619: FirstName is Shawna")
	void FirstNameOfRecord619() {
		assertEquals("Shawna", customers.get(618).getFirstName());
	}

	@Test
	@DisplayName("Record 619: LastName is Slayton")
	void LastNameOfRecord619() {
		assertEquals("Slayton", customers.get(618).getLastName());
	}

	@Test
	@DisplayName("Record 619: Company is American Sail Training Assn")
	void CompanyOfRecord619() {
		assertEquals("American Sail Training Assn", customers.get(618).getCompany());
	}

	@Test
	@DisplayName("Record 619: Address is 15919 S Broadway St")
	void AddressOfRecord619() {
		assertEquals("15919 S Broadway St", customers.get(618).getAddress());
	}

	@Test
	@DisplayName("Record 619: City is Gardena")
	void CityOfRecord619() {
		assertEquals("Gardena", customers.get(618).getCity());
	}

	@Test
	@DisplayName("Record 619: County is Los Angeles")
	void CountyOfRecord619() {
		assertEquals("Los Angeles", customers.get(618).getCounty());
	}

	@Test
	@DisplayName("Record 619: State is CA")
	void StateOfRecord619() {
		assertEquals("CA", customers.get(618).getState());
	}

	@Test
	@DisplayName("Record 619: ZIP is 90248")
	void ZIPOfRecord619() {
		assertEquals("90248", customers.get(618).getZIP());
	}

	@Test
	@DisplayName("Record 619: Phone is 310-532-4410")
	void PhoneOfRecord619() {
		assertEquals("310-532-4410", customers.get(618).getPhone());
	}

	@Test
	@DisplayName("Record 619: Fax is 310-532-1455")
	void FaxOfRecord619() {
		assertEquals("310-532-1455", customers.get(618).getFax());
	}

	@Test
	@DisplayName("Record 619: Email is shawna@slayton.com")
	void EmailOfRecord619() {
		assertEquals("shawna@slayton.com", customers.get(618).getEmail());
	}

	@Test
	@DisplayName("Record 619: Web is http://www.shawnaslayton.com")
	void WebOfRecord619() {
		assertEquals("http://www.shawnaslayton.com", customers.get(618).getWeb());
	}
}
