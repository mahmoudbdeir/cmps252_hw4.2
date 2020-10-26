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

@Tag("34")
class Record_1961 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1961: FirstName is Loretta")
	void FirstNameOfRecord1961() {
		assertEquals("Loretta", customers.get(1960).getFirstName());
	}

	@Test
	@DisplayName("Record 1961: LastName is Minery")
	void LastNameOfRecord1961() {
		assertEquals("Minery", customers.get(1960).getLastName());
	}

	@Test
	@DisplayName("Record 1961: Company is Nachos")
	void CompanyOfRecord1961() {
		assertEquals("Nachos", customers.get(1960).getCompany());
	}

	@Test
	@DisplayName("Record 1961: Address is 4620 76th St")
	void AddressOfRecord1961() {
		assertEquals("4620 76th St", customers.get(1960).getAddress());
	}

	@Test
	@DisplayName("Record 1961: City is Elmhurst")
	void CityOfRecord1961() {
		assertEquals("Elmhurst", customers.get(1960).getCity());
	}

	@Test
	@DisplayName("Record 1961: County is Queens")
	void CountyOfRecord1961() {
		assertEquals("Queens", customers.get(1960).getCounty());
	}

	@Test
	@DisplayName("Record 1961: State is NY")
	void StateOfRecord1961() {
		assertEquals("NY", customers.get(1960).getState());
	}

	@Test
	@DisplayName("Record 1961: ZIP is 11373")
	void ZIPOfRecord1961() {
		assertEquals("11373", customers.get(1960).getZIP());
	}

	@Test
	@DisplayName("Record 1961: Phone is 718-803-3645")
	void PhoneOfRecord1961() {
		assertEquals("718-803-3645", customers.get(1960).getPhone());
	}

	@Test
	@DisplayName("Record 1961: Fax is 718-803-1436")
	void FaxOfRecord1961() {
		assertEquals("718-803-1436", customers.get(1960).getFax());
	}

	@Test
	@DisplayName("Record 1961: Email is loretta@minery.com")
	void EmailOfRecord1961() {
		assertEquals("loretta@minery.com", customers.get(1960).getEmail());
	}

	@Test
	@DisplayName("Record 1961: Web is http://www.lorettaminery.com")
	void WebOfRecord1961() {
		assertEquals("http://www.lorettaminery.com", customers.get(1960).getWeb());
	}
}
