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

@Tag("1")
class Record_1751 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1751: FirstName is Mable")
	void FirstNameOfRecord1751() {
		assertEquals("Mable", customers.get(1750).getFirstName());
	}

	@Test
	@DisplayName("Record 1751: LastName is Furlone")
	void LastNameOfRecord1751() {
		assertEquals("Furlone", customers.get(1750).getLastName());
	}

	@Test
	@DisplayName("Record 1751: Company is Oil Systems Inc")
	void CompanyOfRecord1751() {
		assertEquals("Oil Systems Inc", customers.get(1750).getCompany());
	}

	@Test
	@DisplayName("Record 1751: Address is 1523 Arbuckle Ct")
	void AddressOfRecord1751() {
		assertEquals("1523 Arbuckle Ct", customers.get(1750).getAddress());
	}

	@Test
	@DisplayName("Record 1751: City is Santa Clara")
	void CityOfRecord1751() {
		assertEquals("Santa Clara", customers.get(1750).getCity());
	}

	@Test
	@DisplayName("Record 1751: County is Santa Clara")
	void CountyOfRecord1751() {
		assertEquals("Santa Clara", customers.get(1750).getCounty());
	}

	@Test
	@DisplayName("Record 1751: State is CA")
	void StateOfRecord1751() {
		assertEquals("CA", customers.get(1750).getState());
	}

	@Test
	@DisplayName("Record 1751: ZIP is 95054")
	void ZIPOfRecord1751() {
		assertEquals("95054", customers.get(1750).getZIP());
	}

	@Test
	@DisplayName("Record 1751: Phone is 408-748-3841")
	void PhoneOfRecord1751() {
		assertEquals("408-748-3841", customers.get(1750).getPhone());
	}

	@Test
	@DisplayName("Record 1751: Fax is 408-748-4498")
	void FaxOfRecord1751() {
		assertEquals("408-748-4498", customers.get(1750).getFax());
	}

	@Test
	@DisplayName("Record 1751: Email is mable@furlone.com")
	void EmailOfRecord1751() {
		assertEquals("mable@furlone.com", customers.get(1750).getEmail());
	}

	@Test
	@DisplayName("Record 1751: Web is http://www.mablefurlone.com")
	void WebOfRecord1751() {
		assertEquals("http://www.mablefurlone.com", customers.get(1750).getWeb());
	}
}
