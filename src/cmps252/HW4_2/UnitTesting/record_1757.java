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

@Tag("23")
class Record_1757 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1757: FirstName is Lessie")
	void FirstNameOfRecord1757() {
		assertEquals("Lessie", customers.get(1756).getFirstName());
	}

	@Test
	@DisplayName("Record 1757: LastName is Lobo")
	void LastNameOfRecord1757() {
		assertEquals("Lobo", customers.get(1756).getLastName());
	}

	@Test
	@DisplayName("Record 1757: Company is Hylig, George H Jr")
	void CompanyOfRecord1757() {
		assertEquals("Hylig, George H Jr", customers.get(1756).getCompany());
	}

	@Test
	@DisplayName("Record 1757: Address is 14445 N 73rd St")
	void AddressOfRecord1757() {
		assertEquals("14445 N 73rd St", customers.get(1756).getAddress());
	}

	@Test
	@DisplayName("Record 1757: City is Scottsdale")
	void CityOfRecord1757() {
		assertEquals("Scottsdale", customers.get(1756).getCity());
	}

	@Test
	@DisplayName("Record 1757: County is Maricopa")
	void CountyOfRecord1757() {
		assertEquals("Maricopa", customers.get(1756).getCounty());
	}

	@Test
	@DisplayName("Record 1757: State is AZ")
	void StateOfRecord1757() {
		assertEquals("AZ", customers.get(1756).getState());
	}

	@Test
	@DisplayName("Record 1757: ZIP is 85260")
	void ZIPOfRecord1757() {
		assertEquals("85260", customers.get(1756).getZIP());
	}

	@Test
	@DisplayName("Record 1757: Phone is 480-998-6254")
	void PhoneOfRecord1757() {
		assertEquals("480-998-6254", customers.get(1756).getPhone());
	}

	@Test
	@DisplayName("Record 1757: Fax is 480-998-9814")
	void FaxOfRecord1757() {
		assertEquals("480-998-9814", customers.get(1756).getFax());
	}

	@Test
	@DisplayName("Record 1757: Email is lessie@lobo.com")
	void EmailOfRecord1757() {
		assertEquals("lessie@lobo.com", customers.get(1756).getEmail());
	}

	@Test
	@DisplayName("Record 1757: Web is http://www.lessielobo.com")
	void WebOfRecord1757() {
		assertEquals("http://www.lessielobo.com", customers.get(1756).getWeb());
	}
}
