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

@Tag("38")
class Record_1878 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1878: FirstName is Kyle")
	void FirstNameOfRecord1878() {
		assertEquals("Kyle", customers.get(1877).getFirstName());
	}

	@Test
	@DisplayName("Record 1878: LastName is Kibbey")
	void LastNameOfRecord1878() {
		assertEquals("Kibbey", customers.get(1877).getLastName());
	}

	@Test
	@DisplayName("Record 1878: Company is Wilson, James W Md")
	void CompanyOfRecord1878() {
		assertEquals("Wilson, James W Md", customers.get(1877).getCompany());
	}

	@Test
	@DisplayName("Record 1878: Address is 200 York St")
	void AddressOfRecord1878() {
		assertEquals("200 York St", customers.get(1877).getAddress());
	}

	@Test
	@DisplayName("Record 1878: City is Lexington")
	void CityOfRecord1878() {
		assertEquals("Lexington", customers.get(1877).getCity());
	}

	@Test
	@DisplayName("Record 1878: County is Fayette")
	void CountyOfRecord1878() {
		assertEquals("Fayette", customers.get(1877).getCounty());
	}

	@Test
	@DisplayName("Record 1878: State is KY")
	void StateOfRecord1878() {
		assertEquals("KY", customers.get(1877).getState());
	}

	@Test
	@DisplayName("Record 1878: ZIP is 40505")
	void ZIPOfRecord1878() {
		assertEquals("40505", customers.get(1877).getZIP());
	}

	@Test
	@DisplayName("Record 1878: Phone is 859-231-3340")
	void PhoneOfRecord1878() {
		assertEquals("859-231-3340", customers.get(1877).getPhone());
	}

	@Test
	@DisplayName("Record 1878: Fax is 859-231-0203")
	void FaxOfRecord1878() {
		assertEquals("859-231-0203", customers.get(1877).getFax());
	}

	@Test
	@DisplayName("Record 1878: Email is kyle@kibbey.com")
	void EmailOfRecord1878() {
		assertEquals("kyle@kibbey.com", customers.get(1877).getEmail());
	}

	@Test
	@DisplayName("Record 1878: Web is http://www.kylekibbey.com")
	void WebOfRecord1878() {
		assertEquals("http://www.kylekibbey.com", customers.get(1877).getWeb());
	}
}
