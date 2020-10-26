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

@Tag("11")
class Record_1786 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1786: FirstName is Lazaro")
	void FirstNameOfRecord1786() {
		assertEquals("Lazaro", customers.get(1785).getFirstName());
	}

	@Test
	@DisplayName("Record 1786: LastName is Hebig")
	void LastNameOfRecord1786() {
		assertEquals("Hebig", customers.get(1785).getLastName());
	}

	@Test
	@DisplayName("Record 1786: Company is Golden Valley Nut Co")
	void CompanyOfRecord1786() {
		assertEquals("Golden Valley Nut Co", customers.get(1785).getCompany());
	}

	@Test
	@DisplayName("Record 1786: Address is 5002 Industrial Way")
	void AddressOfRecord1786() {
		assertEquals("5002 Industrial Way", customers.get(1785).getAddress());
	}

	@Test
	@DisplayName("Record 1786: City is Coeur d Alene")
	void CityOfRecord1786() {
		assertEquals("Coeur d Alene", customers.get(1785).getCity());
	}

	@Test
	@DisplayName("Record 1786: County is Kootenai")
	void CountyOfRecord1786() {
		assertEquals("Kootenai", customers.get(1785).getCounty());
	}

	@Test
	@DisplayName("Record 1786: State is ID")
	void StateOfRecord1786() {
		assertEquals("ID", customers.get(1785).getState());
	}

	@Test
	@DisplayName("Record 1786: ZIP is 83814")
	void ZIPOfRecord1786() {
		assertEquals("83814", customers.get(1785).getZIP());
	}

	@Test
	@DisplayName("Record 1786: Phone is 208-765-7756")
	void PhoneOfRecord1786() {
		assertEquals("208-765-7756", customers.get(1785).getPhone());
	}

	@Test
	@DisplayName("Record 1786: Fax is 208-765-2207")
	void FaxOfRecord1786() {
		assertEquals("208-765-2207", customers.get(1785).getFax());
	}

	@Test
	@DisplayName("Record 1786: Email is lazaro@hebig.com")
	void EmailOfRecord1786() {
		assertEquals("lazaro@hebig.com", customers.get(1785).getEmail());
	}

	@Test
	@DisplayName("Record 1786: Web is http://www.lazarohebig.com")
	void WebOfRecord1786() {
		assertEquals("http://www.lazarohebig.com", customers.get(1785).getWeb());
	}
}
