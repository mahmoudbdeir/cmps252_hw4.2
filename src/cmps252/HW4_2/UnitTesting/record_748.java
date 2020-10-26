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

@Tag("0")
class Record_748 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 748: FirstName is Rex")
	void FirstNameOfRecord748() {
		assertEquals("Rex", customers.get(747).getFirstName());
	}

	@Test
	@DisplayName("Record 748: LastName is Top")
	void LastNameOfRecord748() {
		assertEquals("Top", customers.get(747).getLastName());
	}

	@Test
	@DisplayName("Record 748: Company is American Formal Wear Co Inc")
	void CompanyOfRecord748() {
		assertEquals("American Formal Wear Co Inc", customers.get(747).getCompany());
	}

	@Test
	@DisplayName("Record 748: Address is 701 Kings Row  #-2a")
	void AddressOfRecord748() {
		assertEquals("701 Kings Row  #-2a", customers.get(747).getAddress());
	}

	@Test
	@DisplayName("Record 748: City is San Jose")
	void CityOfRecord748() {
		assertEquals("San Jose", customers.get(747).getCity());
	}

	@Test
	@DisplayName("Record 748: County is Santa Clara")
	void CountyOfRecord748() {
		assertEquals("Santa Clara", customers.get(747).getCounty());
	}

	@Test
	@DisplayName("Record 748: State is CA")
	void StateOfRecord748() {
		assertEquals("CA", customers.get(747).getState());
	}

	@Test
	@DisplayName("Record 748: ZIP is 95112")
	void ZIPOfRecord748() {
		assertEquals("95112", customers.get(747).getZIP());
	}

	@Test
	@DisplayName("Record 748: Phone is 408-292-0449")
	void PhoneOfRecord748() {
		assertEquals("408-292-0449", customers.get(747).getPhone());
	}

	@Test
	@DisplayName("Record 748: Fax is 408-292-5662")
	void FaxOfRecord748() {
		assertEquals("408-292-5662", customers.get(747).getFax());
	}

	@Test
	@DisplayName("Record 748: Email is rex@top.com")
	void EmailOfRecord748() {
		assertEquals("rex@top.com", customers.get(747).getEmail());
	}

	@Test
	@DisplayName("Record 748: Web is http://www.rextop.com")
	void WebOfRecord748() {
		assertEquals("http://www.rextop.com", customers.get(747).getWeb());
	}
}
