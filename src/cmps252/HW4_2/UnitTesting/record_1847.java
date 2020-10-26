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

@Tag("35")
class Record_1847 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1847: FirstName is Owen")
	void FirstNameOfRecord1847() {
		assertEquals("Owen", customers.get(1846).getFirstName());
	}

	@Test
	@DisplayName("Record 1847: LastName is Bengston")
	void LastNameOfRecord1847() {
		assertEquals("Bengston", customers.get(1846).getLastName());
	}

	@Test
	@DisplayName("Record 1847: Company is Republic Gazette")
	void CompanyOfRecord1847() {
		assertEquals("Republic Gazette", customers.get(1846).getCompany());
	}

	@Test
	@DisplayName("Record 1847: Address is 233 Lagrange Ave")
	void AddressOfRecord1847() {
		assertEquals("233 Lagrange Ave", customers.get(1846).getAddress());
	}

	@Test
	@DisplayName("Record 1847: City is Rochester")
	void CityOfRecord1847() {
		assertEquals("Rochester", customers.get(1846).getCity());
	}

	@Test
	@DisplayName("Record 1847: County is Monroe")
	void CountyOfRecord1847() {
		assertEquals("Monroe", customers.get(1846).getCounty());
	}

	@Test
	@DisplayName("Record 1847: State is NY")
	void StateOfRecord1847() {
		assertEquals("NY", customers.get(1846).getState());
	}

	@Test
	@DisplayName("Record 1847: ZIP is 14613")
	void ZIPOfRecord1847() {
		assertEquals("14613", customers.get(1846).getZIP());
	}

	@Test
	@DisplayName("Record 1847: Phone is 585-458-7396")
	void PhoneOfRecord1847() {
		assertEquals("585-458-7396", customers.get(1846).getPhone());
	}

	@Test
	@DisplayName("Record 1847: Fax is 585-458-6273")
	void FaxOfRecord1847() {
		assertEquals("585-458-6273", customers.get(1846).getFax());
	}

	@Test
	@DisplayName("Record 1847: Email is owen@bengston.com")
	void EmailOfRecord1847() {
		assertEquals("owen@bengston.com", customers.get(1846).getEmail());
	}

	@Test
	@DisplayName("Record 1847: Web is http://www.owenbengston.com")
	void WebOfRecord1847() {
		assertEquals("http://www.owenbengston.com", customers.get(1846).getWeb());
	}
}
